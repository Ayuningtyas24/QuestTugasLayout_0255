package com.example.questtugaslayout_0255.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0255.R

@Composable
fun TampilanUtama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(top = 20.dp, bottom = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title_prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(id = R.string.title_univ),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )

            Spacer(modifier = Modifier.height(20.dp))

            CustomProfileCard(
                namaRes = R.string.nama_ayuningtyas,
                alamatRes = R.string.alamat_turi,
                cardBgColorRes = R.color.card_grey,
                alamatColorRes = R.color.text_yellow,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Normal
            )

            CustomProfileCard(
                namaRes = R.string.nama_gibran,
                phoneRes = R.string.no_hp,
                alamatRes = R.string.alamat_kasihan,
                cardBgColorRes = R.color.card_purple,
                alamatColorRes = R.color.text_yellow
            )

            CustomProfileCard(
                namaRes = R.string.nama_zhilal,
                phoneRes = R.string.no_zhilal,
                alamatRes = R.string.alamat_depok,
                cardBgColorRes = R.color.card_blue,
                alamatColorRes = R.color.white
            )

            CustomProfileCard(
                namaRes = R.string.nama_ahmad,
                phoneRes = R.string.no_alfian,
                alamatRes = R.string.alamat_gamping,
                cardBgColorRes = R.color.card_green,
                alamatColorRes = R.color.white
            )
        }

    }
}