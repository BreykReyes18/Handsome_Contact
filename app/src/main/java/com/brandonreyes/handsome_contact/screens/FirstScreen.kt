package com.brandonreyes.handsome_contact.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Firstscreen(){
    Scaffold {
        BodyContent()

    }
}

@Composable
fun BodyContent(){
    Firstscreen()
}