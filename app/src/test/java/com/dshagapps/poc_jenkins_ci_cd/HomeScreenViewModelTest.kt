package com.dshagapps.poc_jenkins_ci_cd

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dshagapps.poc_jenkins_ci_cd.ui.screen.HomeScreenViewModel
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HomeScreenViewModelTest {

    private val homeScreenViewModel = HomeScreenViewModel()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun `se convierten 365,5 pesos a 1 dolar oficial`() {
        val pesos = 365.5
        val esperado = 1.0

        homeScreenViewModel.onConvertPesosToUsd(pesos)

        Assert.assertEquals(esperado, homeScreenViewModel.usdState.value, 0.01)
    }

}