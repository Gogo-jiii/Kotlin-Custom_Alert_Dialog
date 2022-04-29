package com.example.customalertdialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CustomAlertDialog(private val _context: Context, layout: Int) : DialogFragment() {
    private val builder: AlertDialog.Builder? = null
    private val activity: Activity
    private val layout: Int
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(
            _context
        )
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(layout, null)
        builder.setView(dialogView)
        val button = dialogView.findViewById<Button>(R.id.button)
        button.setOnClickListener { v: View? ->
            dialog!!.dismiss()
            Toast.makeText(_context, "Dismissed.", Toast.LENGTH_SHORT).show()
        }
        return builder.create()
    }

    init {
        activity = _context as Activity
        this.layout = layout
    }
}