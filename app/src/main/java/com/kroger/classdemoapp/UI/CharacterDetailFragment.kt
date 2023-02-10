package com.kroger.classdemoapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kroger.classdemoapp.R

class CharacterDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_character_detail, container, false)

        if(arguments != null){
            val name = requireArguments().getString("name")
            val age = requireArguments().getString("age")
            val image = requireArguments().getString("image")
            val universe = requireArguments().getString("universe")

            view.findViewById<TextView>(R.id.character_universe).text = universe
        }

        return view
    }

}