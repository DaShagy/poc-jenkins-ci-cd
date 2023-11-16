package com.dshagapps.poc_jenkins_ci_cd.ui.screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeScreenViewModel : ViewModel() {

    val usdState: MutableStateFlow<Double> = MutableStateFlow(0.0)

    fun onConvertPesosToUsd(pesos: Double) { usdState.value = pesos / 365.5 }
}