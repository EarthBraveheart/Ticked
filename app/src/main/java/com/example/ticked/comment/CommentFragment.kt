package com.example.ticked.comment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.ticked.R
import com.example.ticked.databinding.FragmentEditCommentBinding

/**
 * A simple [Fragment] subclass.
 */
class CommentFragment : Fragment() {
    private val viewModel: CommentViewModel by lazy {
        ViewModelProviders.of(this).get(CommentViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentEditCommentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_comment, container, false)
        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
        return binding.root
        }
    }
