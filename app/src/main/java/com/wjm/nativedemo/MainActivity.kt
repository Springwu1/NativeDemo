package com.wjm.nativedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rokid.nativelib_kotlin.KTNativeLib
import com.wjm.nativelib.NativeLib
import com.wjm.nativedemo.R

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ret = NativeLib().stringFromJNI()
        Log.i(TAG, "onCreate: ret = $ret")
        var ret2 = KTNativeLib().stringFromJNI()
        Log.i(TAG, "onCreate: ret2 = $ret2")
    }
}