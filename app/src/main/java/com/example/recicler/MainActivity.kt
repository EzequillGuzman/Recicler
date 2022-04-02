package com.example.recicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview22mar22.Adaptador

class MainActivity : AppCompatActivity() {
    var persona= listOf<Personas>(
        Personas(codigo = "1", nombre = "Katy", apelido = "Perry", telefono = "45327834", imagen = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/1/c/8/f/1c8fd7ba5598d14c83c830b785c09145.jpg"),
        Personas(codigo = "2", nombre = "Will", apelido = "Smith", telefono = "88763475", imagen = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/TechCrunch_Disrupt_2019_%2848834434641%29_%28cropped%29.jpg/800px-TechCrunch_Disrupt_2019_%2848834434641%29_%28cropped%29.jpg"),
        Personas(codigo = "3", nombre = "Troye", apelido = "Sivan", telefono = "45327834", imagen = "https://lastfm.freetls.fastly.net/i/u/770x0/f9351e4292ab29c04087d86670863aba.jpg"),
        Personas(codigo = "4", nombre = "Kylie", apelido = "Minogue", telefono = "45327834", imagen = "https://fashionjournal.com.au/wp-content/uploads/2020/09/fashion-journal-kylie-mob.png"),
        Personas(codigo = "5", nombre = "Kat", apelido = "De Luna", telefono = "45327834", imagen = "https://static.onecms.io/wp-content/uploads/sites/21/2010/06/katdeluna_091708_300.jpg"),
        Personas(codigo = "6", nombre = "Ariana", apelido = "Grande", telefono = "45327834", imagen = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/d/6/b/8/d6b8d1be4b02ee8049c21885985f6c3b.jpg"),
        Personas(codigo = "7", nombre = "Michelle", apelido = "Corzo", telefono = "45327834", imagen = "https://pbs.twimg.com/profile_images/1240715533152124928/mirhwtXd_400x400.jpg"),
        Personas(codigo = "8", nombre = "Emily", apelido = "Ovando", telefono = "45327834", imagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkQXtQqLFqSKEjHskpBRY-xAUQGWG0veP-Fw&usqp=CAU"),
        Personas(codigo = "9", nombre = "Post", apelido = "Malone", telefono = "45327834", imagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1jQv-ria7SvvEbSfRiTj5aYanlAZNAPpZrg&usqp=CAU"),
        Personas(codigo = "10", nombre = "Lil", apelido = "Nas x", telefono = "45327834", imagen = "https://image.europafm.com/clipping/cmsimages01/2021/11/12/13B5E3D7-7BD4-4541-B09A-30E1A92FC4E5/98.jpg?crop=1920,1080,x0,y0&width=1900&height=1069&optimize=high&format=webply")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerPersona = findViewById<RecyclerView>(R.id.recycler_personas)
        var adaptador = Adaptador(persona)
        recyclerPersona.layoutManager = LinearLayoutManager( this)
        recyclerPersona.adapter = adaptador


    }
}