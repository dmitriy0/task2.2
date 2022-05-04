package com.example.task22

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AlertFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("AlertFragment", "onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("AlertFragment", "onCreateView")

        val view = inflater.inflate(R.layout.fragment_alert, container, false)
        val button = view.findViewById<Button>(R.id.alert_button)
        button.setOnClickListener {
            val myDialogFragment = MyDialogFragment()
            val manager = parentFragmentManager
            myDialogFragment.show(manager, "myDialog")
        }
        return view
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.i("AlertFragment", "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Log.i("AlertFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("AlertFragment", "onResume")
    }

    override fun onStop() {
        Log.i("AlertFragment", "onStop")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("AlertFragment", "onDestroyView")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("AlertFragment", "onDestroy")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("AlertFragment", "onDetach")

        super.onDetach()
    }
}