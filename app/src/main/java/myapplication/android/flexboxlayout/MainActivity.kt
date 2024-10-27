package myapplication.android.flexboxlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flexBox: FlexBoxLayout = findViewById(R.id.flexBox)
        flexBox.alignment = LayoutAlignment.RIGHT
    }
}