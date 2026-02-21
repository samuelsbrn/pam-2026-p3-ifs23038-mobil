package org.delcom.pam_2026_p3_ifs23038_motor.ui.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.delcom.pam_2026_p3_ifs23038_motor.data.DummyData
import org.delcom.pam_2026_p3_ifs23038_motor.data.MotorData
import org.delcom.pam_2026_p3_ifs23038_motor.helper.ConstHelper
import org.delcom.pam_2026_p3_ifs23038_motor.helper.RouteHelper
import org.delcom.pam_2026_p3_ifs23038_motor.ui.components.BottomNavComponent
import org.delcom.pam_2026_p3_ifs23038_motor.ui.components.TopAppBarComponent
import org.delcom.pam_2026_p3_ifs23038_motor.ui.theme.DelcomTheme

@Composable
fun MotorScreen(
    navController: NavHostController,
) {
    var motors by remember { mutableStateOf(DummyData.getMotorData()) }
    var searchQuery by remember { mutableStateOf("") }

    // PERBAIKAN DI SINI: Pindah dan ubah fungsi onOpen-nya di sini
    fun onOpen(motorName: String) {
        // Encode nama motor agar spasi dan karakter khusus aman untuk navigasi
        val encodedName = Uri.encode(motorName)
        val route = ConstHelper.RouteNames.MotorDetail.path.replace("{name}", encodedName)
        RouteHelper.to(
            navController = navController,
            destination = route
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        TopAppBarComponent(
            navController = navController,
            title = "Motors", showBackButton = false,
            withSearch = true,
            searchQuery = searchQuery,
            onSearchQueryChange = { query ->
                searchQuery = query
                motors = DummyData.getMotorData().filter {
                    it.nama
                        .lowercase()
                        .contains(query.lowercase())
                }
            }
        )
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            MotorsUI(
                motors = motors,
                onOpen = ::onOpen
            )
        }
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun MotorsUI(
    motors: List<MotorData>,
    onOpen: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(motors) { motor ->
            MotorItemUI(
                motor,
                onOpen
            )
        }
    }

    if(motors.isEmpty()){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Text(
                text = "Tidak ada data!",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}

@Composable
fun MotorItemUI(
    motor: MotorData,
    onOpen: (String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onOpen(motor.nama)
            },
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = motor.gambar),
                contentDescription = motor.nama,
                modifier = Modifier
                    .size(70.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = motor.nama,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = motor.deskripsi,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewMotorsUI() {
    DelcomTheme {
        MotorsUI(
            motors = DummyData.getMotorData(),
            onOpen = {}
        )
    }
}