package com.ne.muslimprayers.qiblafinder.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ne.muslimprayers.qiblafinder.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HadithFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hadith, container, false)
    }
}