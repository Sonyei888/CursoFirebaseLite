package com.sonyei888.cursofirebaselite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sonyei888.cursofirebaselite.presetation.initial.InitialScreen
import com.sonyei888.cursofirebaselite.presetation.login.LoginScreen
import com.sonyei888.cursofirebaselite.presetation.signup.SignUpScreen

@Composable
fun NavigatioWrapper(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "initial" ){
        composable("initial"){
            InitialScreen()
        }
        composable("login"){
            LoginScreen()
        }
        composable("signUp"){
            SignUpScreen()
        }
    }
}