package jpelaez.ups.congreso

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import jpelaez.ups.congreso.databinding.FragmentIndexBinding

class IndexFragment : Fragment() {
    private lateinit var binding:FragmentIndexBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_index, container, false)


        binding.loginFragment.setOnClickListener(){
            Log.d("mensaje", "Si llego")
        }

        return inflater.inflate(R.layout.fragment_index, container, false)
    }

}