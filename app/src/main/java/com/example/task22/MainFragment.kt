package com.example.task22

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("MainFragment","onCreteView")
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val buttonActivity = view.findViewById<Button>(R.id.button_activity)
        val buttonFragment = view.findViewById<Button>(R.id.button_fragment)
        buttonActivity.setOnClickListener {
            val intent = Intent(activity,AlertActivity::class.java)
            startActivity(intent)
        }

        buttonFragment.setOnClickListener {
            val alertFragment = AlertFragment()
            parentFragmentManager.beginTransaction().replace(R.id.layout, alertFragment).commit()
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.i("MainFragment", "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Log.i("MainFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("MainFragment", "onResume")
    }

    override fun onStop() {
        Log.i("MainFragment", "onStop")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("MainFragment", "onDestroyView")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("MainFragment", "onDestroy")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("MainFragment", "onDetach")

        super.onDetach()
    }

}