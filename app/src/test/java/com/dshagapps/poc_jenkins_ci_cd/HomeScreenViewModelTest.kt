package com.dshagapps.poc_jenkins_ci_cd

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dshagapps.poc_jenkins_ci_cd.ui.screen.HomeScreenViewModel
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class HomeScreenViewModelTest {

    private val homeScreenViewModel = HomeScreenViewModel()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun `se convierten 370,0 pesos a 1 dolar oficial`() {
        val pesosToConvert = 370.0
        val expected = 1.0

        homeScreenViewModel.convertPesosToUsd(pesosToConvert)

        Assert.assertEquals(expected, homeScreenViewModel.usdValueState.value, 0.01)
    }

}
