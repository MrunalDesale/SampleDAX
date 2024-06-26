package com.example.sampledax.ui.dax.presentation.view

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sampledax.R
import com.example.sampledax.ui.dax.data.response.FlopList
import com.example.sampledax.ui.dax.data.response.TopList
import com.example.sampledax.ui.dax.presentation.enums.Status
import com.example.sampledax.ui.dax.presentation.utils.Constants.Companion.BULLET
import com.example.sampledax.ui.dax.presentation.utils.Constants.Companion.MAX_LINES
import com.example.sampledax.ui.dax.presentation.viewmodel.IndexViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * IndexActivity shows information of an Index, tops and flops index with percentage performance.
 * */

class IndexActivity : MainActivity() {
    private val mIndexViewModel: IndexViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SetIndexData(mIndexViewModel)
        }
        mIndexViewModel.getIndex()
    }
}


/*
* Following method observe response state and set information of index on a card.
* It also shows error toast in case of error.
* */
@Composable
fun SetIndexData(indexViewModel: IndexViewModel) {
    val data by indexViewModel.getIndexData().observeAsState()
    if (data != null) {
        when (data!!.status) {
            Status.SUCCESS -> {
                IndeterminateCircularIndicator(false)
                SetCardView(
                    name = data?.data?.name,
                    wkn = data?.data?.wkn,
                    isin = data?.data?.isin,
                    profile = data?.data?.profil,
                    data?.data?.topList, data?.data?.flopList
                )
            }

            Status.ERROR -> {
                Toast.makeText(LocalContext.current,"Something went wrong..!",Toast.LENGTH_LONG).show()
                IndeterminateCircularIndicator(false)
            }

            Status.LOADING -> {
                IndeterminateCircularIndicator(true)
            }
        }
    }
}

/*
* This method sets card with index information.
* */
@Composable
fun SetCardView(
    name: String?,
    wkn: String?,
    isin: String?,
    profile: String?,
    topList: ArrayList<TopList>?,
    flopList: ArrayList<FlopList>?
) {

    Box(Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier
                .fillMaxSize(),
            colors = CardDefaults.cardColors(Color(0xFFfafafa))
        ) {
            Text(text = "$name", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text(
                text = "$wkn $BULLET $isin $BULLET Index",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 10.dp, top = 5.dp, bottom = 5.dp),
                color = Color(0xFF8c8c8c)
            )

            if (topList != null || flopList != null)
                Card(
                    modifier = Modifier
                        .padding(6.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(Color(0xFFdce4ea)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
                ) {
                    Text(
                        text = stringResource(id = R.string.text_tops_and_flops),
                        fontSize = 16.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                    if (topList != null && topList.size > 0)
                        AddDynamicTopIndex(topList)
                    if (flopList != null && flopList.size > 0)
                        AddDynamicFlopIndex(flopList)

                }

            if (!TextUtils.isEmpty(profile))
                Card(
                    modifier = Modifier
                        .padding(6.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(Color(0xFFdce4ea)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
                ) {
                    Text(
                        text = stringResource(id = R.string.text_profile),
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 0.dp)
                    )
                    ExpandableText(text = profile!!)
                }
        }
    }
}

/*
* Following method shows top 3 index with percentage gain
* */
@Composable
fun AddDynamicTopIndex(list: ArrayList<TopList>) {
    if (list.size > 0) {
        for (i in 1..3) {
            Column {
                Row(horizontalArrangement = Arrangement.End) {
                    Text(
                        text = list[i].instrument?.name + "",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .weight(1f, true),
                        color = Color(0xFF40474e),
                        maxLines = 1
                    )
                    val format = DecimalFormat("##.##")
                    Text(
                        text = "+" + format.format(list[i].performancePct) + "%",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        color = Color(0xFF009f08)
                    )
                }
                Divider(color = Color(0xFFc3c3cc))
            }
        }
    }
}

/*
* Following method shows flop 3 index with percentage loss
* */
@Composable
fun AddDynamicFlopIndex(list: ArrayList<FlopList>) {
    if (list.size > 0) {
        for (i in 1..3) {
            Column {
                Row(horizontalArrangement = Arrangement.End) {
                    Text(
                        text = list[i].instrument?.name + "",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .weight(1f, true),
                        color = Color(0xFF40474e),
                        maxLines = 1
                    )
                    val format = DecimalFormat("##.##")
                    Text(
                        text = "" + format.format(list[i].performancePct) + "%",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        color = Color(0xFFa8253d)
                    )
                }
                if (i < 3)
                    Divider(color = Color(0xFFc3c3cc))
            }
        }
    }
}
/*
* Following method contains logic for expandable text view of profile detail.
* */
@Composable
fun ExpandableText(modifier: Modifier = Modifier, text: String) {
    var isExpanded by remember { mutableStateOf(false) }
    val textLayoutResultState = remember { mutableStateOf<TextLayoutResult?>(null) }
    var isClickable by remember { mutableStateOf(false) }
    var finalText by remember { mutableStateOf(text) }
    val textLayoutResult = textLayoutResultState.value

    LaunchedEffect(key1 = textLayoutResult) {
        if (textLayoutResult == null)
            return@LaunchedEffect

        when {
            isExpanded -> {
                finalText = text
            }

            !isExpanded && textLayoutResult.hasVisualOverflow -> {
                val lastCharIndex = textLayoutResult.getLineEnd(MAX_LINES - 1)
                val adjustedText = text.substring(startIndex = 0, endIndex = lastCharIndex)
                    .dropLastWhile {
                        it == ' ' || it == '.'
                    }
                finalText = adjustedText
                isClickable = true
            }
        }
    }

    Text(
        text = finalText,
        maxLines = if (isExpanded) Int.MAX_VALUE else MAX_LINES,
        onTextLayout = {
            textLayoutResultState.value = it
        },
        modifier = modifier
            .padding(10.dp)
            .clickable(enabled = isClickable) {
                isExpanded = !isExpanded
            }
            .animateContentSize(),
        fontSize = 16.sp,
        overflow = TextOverflow.Ellipsis
    )
}