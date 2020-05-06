package com.example.animallayout


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.animallayout.databinding.FragmentCatBinding

/**
 * A simple [Fragment] subclass.
 */
class CatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Need to wrap the fragment xml in <layout> to autogen these classes
        val binding = DataBindingUtil.inflate<FragmentCatBinding>(
            inflater, R.layout.fragment_cat, container, false)


        binding.secretButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_catFragment_to_puppyFragment)
        }
        return binding.root

    }

}
