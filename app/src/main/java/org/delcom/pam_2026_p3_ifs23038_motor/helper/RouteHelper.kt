package org.delcom.pam_2026_p3_ifs23038_motor.helper

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object RouteHelper {
    fun to(
        navController: NavHostController,
        destination: String,
        removeBackStack: Boolean = false
    ) {
        try {
            if (removeBackStack) {
                navController.navigate(destination) {
                    // Berpindah ke halaman tujuan dan membersihkan stack sampai ke Start Destination
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            } else {
                navController.navigate(destination) {
                    launchSingleTop = true
                }
            }
        } catch (e: IllegalStateException) {
            // Mencegah aplikasi crash saat Bottom Nav diklik di tampilan Preview (karena graph belum di-set)
            e.printStackTrace()
        }
    }

    fun back(
        navController: NavHostController,
    ) {
        navController.popBackStack()
    }
}