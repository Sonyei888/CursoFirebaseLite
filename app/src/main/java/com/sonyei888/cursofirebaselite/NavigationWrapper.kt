package com.sonyei888.cursofirebaselite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.sonyei888.cursofirebaselite.presetation.home.HomeScreen
import com.sonyei888.cursofirebaselite.presetation.initial.InitialScreen
import com.sonyei888.cursofirebaselite.presetation.login.LoginScreen
import com.sonyei888.cursofirebaselite.presetation.signup.SignUpScreen

@Composable
fun NavigatioWrapper(
    navHostController: NavHostController,
    auth: FirebaseAuth,
    db: FirebaseFirestore
) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("initial") {
            InitialScreen(
                navigateToLogin = { navHostController.navigate("login") },
                navigateToSignUp = { navHostController.navigate("signUp") }
            )
        }
        composable("login") {
            LoginScreen(auth){ navHostController.navigate("home") }
        }
        composable("signUp") {
            SignUpScreen(auth)
        }
        composable("home"){
            HomeScreen()
        }
    }
}