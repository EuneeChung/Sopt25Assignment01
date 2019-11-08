package com.example.sopt25assignment01


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_dummy.*

/**
 * A simple [Fragment] subclass.
 */
class DummyFragment : Fragment() {
    var name= "default"
    private lateinit var dummy_textview: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_dummy,container,false)
        dummy_textview=view.findViewById(R.id.dummy_textview)
        dummy_textview.text=name
        // Inflate the layout for this fragment
        return view
    }


}
