import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Compose Multiplatform Text",
            fontSize = 24.sp
        )
    }
}