package coil.util

import android.widget.ImageView
import androidx.activity.ComponentActivity
import coil.test.R

class TestViewActivity : ComponentActivity(R.layout.activity_test) {
    val imageView: ImageView by lazy { findViewById(R.id.image) }
}

class TestComposeActivity : ComponentActivity()
