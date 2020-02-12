package com.example.ticked.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ticked.R
import com.example.ticked.databinding.FragmentHomeEventsBinding
import kotlinx.android.synthetic.main.fragment_home_events.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private val viewModel : HomeViewModel by lazy {
        ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeEventsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_events, container, false)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
        return binding.root
        }
}

