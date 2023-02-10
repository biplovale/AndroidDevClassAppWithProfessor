package com.kroger.classdemoapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.Character
import com.kroger.classdemoapp.CharacterAdapter
import com.kroger.classdemoapp.R
import kotlin.random.Random

class CharacterListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Character>()

        for (i in 0..30) {
            characters.add(createCharacter())
        }

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter

        return view
    }

    private fun createCharacter() = Character(
        name = "Liam",
        age = Random.nextInt(10, 99),
        image = "https://images.freeimages.com/images/premium/previews/4026/40269-url.jpg",
        universe = "Earth",
        id = 0,
        relation = listOf()
    )
}