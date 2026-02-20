package org.delcom.pam_2026_p3_ifs23038_motor.helper

class ConstHelper {
    // Route Names
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Motor(path = "Motor"),
        MotorDetail(path = "Motor/{name}"),
    }
}