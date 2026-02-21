package org.delcom.pam_2026_p3_ifs23038_motor.helper

class ConstHelper {
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Motor(path = "motor"),
        MotorDetail(path = "motor/{name}"),
    }
}