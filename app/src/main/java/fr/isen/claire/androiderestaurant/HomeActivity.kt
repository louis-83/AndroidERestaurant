package fr.isen.claire.androiderestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_entree = findViewById<Buttom>(R.id.starter)
        val btn_plat = findViewById<flat>(R.id.flat)
        val btn_dessert = findViewById<serve>(R.id.serve)


        btn_entree.setOnClickListener{
            val toast = Toast.makeText(this@HomeActivity,"vous avez selectionné l'entrée", Toast, LENGTH_SHORT)
            toast.show()

        }

        btn_plat.setOnClickListener{
            val toast = Toast.makeText(this@HomeActivity,"vous avez selectionné le plat", Toast, LENGTH_SHORT)
            toast.show()

        }

        btn_dessert.setOnClickListener{
            val toast = Toast.makeText(this@HomeActivity,"vous avez selectionné le dessert", Toast, LENGTH_SHORT)
            toast.show()

        }

    }
}