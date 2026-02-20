package org.delcom.pam_2026_p3_ifs23038_motor.ui.theme

import androidx.compose.ui.graphics.Color

/* =========================
   BRAND COLORS (MOTORCYCLE / RACING THEME)
   ========================= */
val RacingRed = Color(0xFFD32F2F)       // Merah agresif untuk kecepatan/aksen utama
val RacingRedLight = Color(0xFFFF5252)  // Merah lebih terang untuk dark mode
val RacingRedDark = Color(0xFF9A0007)   // Merah gelap

val CarbonBlack = Color(0xFF121212)     // Hitam karbon untuk background
val AsphaltGrey = Color(0xFF37474F)     // Abu-abu gelap seperti aspal/logam mesin
val ChromeSilver = Color(0xFFCFD8DC)    // Perak/Chrome untuk aksen sekunder

val SpeedAmber = Color(0xFFFF8F00)      // Oranye/Kuning khas lampu sein
val SpeedAmberSoft = Color(0xFFFFE082)

/* =========================
   LIGHT THEME (MOTORCYCLE THEME)
   ========================= */
val md_theme_light_primary = RacingRed
val md_theme_light_onPrimary = Color.White

val md_theme_light_primaryContainer = Color(0xFFFFDAD6) // Merah sangat muda
val md_theme_light_onPrimaryContainer = Color(0xFF410002)

val md_theme_light_secondary = AsphaltGrey
val md_theme_light_onSecondary = Color.White

val md_theme_light_secondaryContainer = ChromeSilver
val md_theme_light_onSecondaryContainer = Color(0xFF1C262B)

val md_theme_light_tertiary = SpeedAmber
val md_theme_light_onTertiary = Color.White

val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_onError = Color.White
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onErrorContainer = Color(0xFF410002)

val md_theme_light_background = Color(0xFFF5F5F5) // Abu-abu sangat terang
val md_theme_light_onBackground = Color(0xFF1A1C1E)

val md_theme_light_surface = Color(0xFFFAFAFA)
val md_theme_light_onSurface = Color(0xFF1A1C1E)

val md_theme_light_surfaceVariant = Color(0xFFE0E0E0) // Warna rangka/silver
val md_theme_light_onSurfaceVariant = Color(0xFF43474E)

val md_theme_light_outline = Color(0xFF73777F)
val md_theme_light_inverseOnSurface = Color(0xFFF1F0F4)
val md_theme_light_inverseSurface = CarbonBlack
val md_theme_light_inversePrimary = RacingRedLight
val md_theme_light_shadow = Color.Black
val md_theme_light_surfaceTint = RacingRed

/* =========================
   DARK THEME (MOTORCYCLE THEME)
   ========================= */
val md_theme_dark_primary = RacingRedLight
val md_theme_dark_onPrimary = Color(0xFF680003)

val md_theme_dark_primaryContainer = RacingRedDark
val md_theme_dark_onPrimaryContainer = Color(0xFFFFDAD6)

val md_theme_dark_secondary = ChromeSilver
val md_theme_dark_onSecondary = Color(0xFF1C262B)

val md_theme_dark_secondaryContainer = AsphaltGrey
val md_theme_dark_onSecondaryContainer = Color(0xFFDCE3E9)

val md_theme_dark_tertiary = SpeedAmberSoft
val md_theme_dark_onTertiary = Color(0xFF422400)

val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)

val md_theme_dark_background = CarbonBlack // Background gelap khas mode malam agresif
val md_theme_dark_onBackground = Color(0xFFE3E2E6)

val md_theme_dark_surface = Color(0xFF1A1C1E) // Sedikit lebih terang dari background
val md_theme_dark_onSurface = Color(0xFFE3E2E6)

val md_theme_dark_surfaceVariant = Color(0xFF43474E) // Abu-abu gelap ala mesin
val md_theme_dark_onSurfaceVariant = Color(0xFFC3C6CF)

val md_theme_dark_outline = Color(0xFF8D9199)
val md_theme_dark_inverseOnSurface = CarbonBlack
val md_theme_dark_inverseSurface = Color(0xFFE3E2E6)
val md_theme_dark_inversePrimary = RacingRed
val md_theme_dark_shadow = Color.Black
val md_theme_dark_surfaceTint = RacingRedLight