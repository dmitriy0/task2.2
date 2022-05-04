package com.example.task22

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class MyDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Log.i("DialogFragment", "onCreateDialog")

        return activity?.let{
            val builder = AlertDialog.Builder(it)

            builder.setTitle("Alert")
                .setMessage("Message")
                .setPositiveButton("Ok"){ dialog, id -> dialog.cancel()
                }
            builder.create()
        }?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.i("DialogFragment", "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Log.i("DialogFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("DialogFragment", "onResume")
    }

    override fun onStop() {
        Log.i("DialogFragment", "onStop")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("DialogFragment", "onDestroyView")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("DialogFragment", "onDestroy")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("DialogFragment", "onDetach")

        super.onDetach()
    }
}