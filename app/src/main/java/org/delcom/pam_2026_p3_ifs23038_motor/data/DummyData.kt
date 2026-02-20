package org.delcom.pam_2026_p3_ifs23038_motor.data

import org.delcom.pam_2026_p3_ifs23038_motor.R

object DummyData {
    fun getMotorData(): List<MotorData> {
        return listOf(
            MotorData(
                nama = "MTT 420RR Turbine Superbike",
                gambar = R.drawable.img_mtt_420rr,
                deskripsi = "Motor hyper-sport yang ditenagai oleh mesin turbin gas helikopter Rolls-Royce Allison, memberikan sensasi berkendara layaknya jet darat.",
                kecepatan = "439 km/h (273 mph)",
                tenaga = "420 HP @ 52,000 RPM"
            ),
            MotorData(
                nama = "Combat Hellcat",
                gambar = R.drawable.img_combat_hellcat,
                deskripsi = "Karya seni otomotif bergaya cruiser agresif yang dibuat dari bongkahan aluminium solid kelas militer dengan desain sasis yang unik.",
                kecepatan = "257 km/h (160 mph)",
                tenaga = "132 HP"
            ),
            MotorData(
                nama = "ARCH 1S",
                gambar = R.drawable.img_arch_1s,
                deskripsi = "Motor sport cruiser premium rakitan tangan dari pabrikan milik Keanu Reeves, memadukan performa balap dengan desain futuristik.",
                kecepatan = "240 km/h (150 mph)",
                tenaga = "120 HP"
            ),
            MotorData(
                nama = "Aston Martin AMB-001",
                gambar = R.drawable.img_amb_001,
                deskripsi = "Hasil kolaborasi Brough Superior dan Aston Martin, motor khusus sirkuit ini dilengkapi mesin V-Twin turbocharged dan bodi karbon fiber.",
                kecepatan = "299 km/h (186 mph)",
                tenaga = "180 HP"
            ),
            MotorData(
                nama = "Harley-Davidson CVO Road Glide RR",
                gambar = R.drawable.img_cvo_road_glide_rr,
                deskripsi = "Bagger ultra-premium edisi khusus balap dari Harley-Davidson, membawa DNA King of the Baggers ke level jalan raya yang mewah namun buas.",
                kecepatan = "180 km/h (112 mph)",
                tenaga = "115 HP"
            ),
            MotorData(
                nama = "Brough Superior SS100",
                gambar = R.drawable.img_brough_superior_ss100,
                deskripsi = "Reinkarnasi modern dari 'Rolls-Royce of Motorcycles', dibuat secara eksklusif dengan material titanium dan gaya klasik retro yang tak lekang waktu.",
                kecepatan = "210 km/h (130 mph)",
                tenaga = "100 HP"
            ),
            MotorData(
                nama = "MV Agusta Superveloce 1000 Ago",
                gambar = R.drawable.img_superveloce_1000_ago,
                deskripsi = "Motor bergaya neo-retro yang dibangun di atas platform Brutale 1000, didedikasikan untuk legenda balap Giacomo Agostini dengan detail aerodinamis kelas dunia.",
                kecepatan = "300 km/h (186 mph)",
                tenaga = "208 HP"
            ),
            MotorData(
                nama = "Bimota Tesi H2",
                gambar = R.drawable.img_bimota_tesi_h2,
                deskripsi = "Kombinasi sasis hub-center steering ikonik khas Bimota dengan mesin supercharged brutal milik Kawasaki Ninja H2, menghasilkan handling dan tenaga luar biasa.",
                kecepatan = "299 km/h (186 mph)",
                tenaga = "231 HP"
            ),
            MotorData(
                nama = "Ducati Streetfighter V4 Lamborghini",
                gambar = R.drawable.img_streetfighter_v4_lambo,
                deskripsi = "Hyper-naked bike eksklusif yang meminjam elemen desain dan warna dari supercar Lamborghini Huracán STO.",
                kecepatan = "299 km/h (186 mph)",
                tenaga = "208 HP"
            ),
            MotorData(
                nama = "Kawasaki Ninja H2R",
                gambar = R.drawable.img_ninja_h2r,
                deskripsi = "Monster khusus sirkuit dengan teknologi Supercharged. Merupakan salah satu motor produksi tercepat di dunia yang pernah dibuat.",
                kecepatan = "400 km/h (249 mph)",
                tenaga = "310 HP (326 HP dengan Ram Air)"
            )
        )
    }
}