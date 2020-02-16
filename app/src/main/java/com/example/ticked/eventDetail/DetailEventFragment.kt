package com.example.ticked.eventDetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.ticked.R
import com.example.ticked.comment.CommentViewModel
import com.example.ticked.databinding.FragmentDetailEventTicketBinding

/**
 * A simple [Fragment] subclass.
 */
class DetailEventFragment : Fragment() {
    private val viewModel: DetailEventViewModel by lazy {
        ViewModelProviders.of(this).get(DetailEventViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDetailEventTicketBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_event_ticket, container, false)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
        return binding.root
        }
    }

