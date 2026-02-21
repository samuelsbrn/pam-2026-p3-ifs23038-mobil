package org.delcom.pam_2026_p3_ifs23038_motor.helper

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object RouteHelper {
    fun to(
        navController: NavHostController,
        destination: String,
        removeBackStack: Boolean = false
    ) {
        if (removeBackStack) {
            navController.navigate(destination) {
                // Berpindah ke halaman tujuan dan membersihkan stack sampai ke Start Destination
                // Ini mencegah aplikasi keluar jika route salah, dan mencegah penumpukan halaman
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
    }

    fun back(
        navController: NavHostController,
    ) {
        navController.popBackStack()
    }
}