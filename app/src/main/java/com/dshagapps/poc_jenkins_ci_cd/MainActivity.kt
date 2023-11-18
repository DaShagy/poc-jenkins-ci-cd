package com.dshagapps.poc_jenkins_ci_cd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dshagapps.poc_jenkins_ci_cd.ui.theme.AppTheme
import com.dshagapps.poc_jenkins_ci_cd.ui.screen.HomeScreen
import com.dshagapps.poc_jenkins_ci_cd.ui.screen.HomeScreenViewModel

class MainActivity : ComponentActivity() {

    private val homeScreenViewModel by lazy { HomeScreenViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(homeScreenViewModel)
                }
            }
        }
    }
}
