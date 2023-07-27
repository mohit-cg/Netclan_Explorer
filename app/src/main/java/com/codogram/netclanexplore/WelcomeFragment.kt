package com.codogram.netclanexplore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.codogram.netclanexplore.onboarding.ViewPagerFragment

class WelcomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_welcome, container, false)

        val button = v.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val viewPagerFragment = ViewPagerFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainlayout,viewPagerFragment)
            transaction.commit()
        }

        return v

    }
}
