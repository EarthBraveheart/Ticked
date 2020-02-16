package com.example.ticked.addEvent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.ticked.R
import com.example.ticked.databinding.FragmentAddEventBinding

/**
 * A simple [Fragment] subclass.
 */
class AddEventFragment : Fragment() {
    private val viewModel : AddEventViewModel by lazy { ViewModelProviders.of(this).get(AddEventViewModel::class.java) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAddEventBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_event, container, false)
        binding.setLifecycleOwner(this)

        binding.viewModel = viewModel

        //Add and cancel event buttons

        binding.addEventButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_addEventFragment_to_homeFragment)
        }

        binding.cancelAddEventBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_addEventFragment_to_homeFragment)
        }

        return binding.root
        }
    }

