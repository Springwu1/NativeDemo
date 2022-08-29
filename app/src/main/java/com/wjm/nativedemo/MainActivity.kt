package com.wjm.nativedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rokid.nativelib_kotlin.KTNativeLib
import com.wjm.nativelib.NativeLib
import com.wjm.nativedemo.R
import com.wjm.nativelib.bean.Person

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var mNativeLib = NativeLib()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ret = mNativeLib.stringFromJNI()
        Log.i(TAG, "onCreate: ret = $ret")
        var ret2 = KTNativeLib().stringFromJNI()
        Log.i(TAG, "onCreate: ret2 = $ret2")

        /** 1. Java 数据传递给 native */
        mNativeLib.test1(true,
            1.toByte(),
            ',',
            3.toShort(),
            4,
            3.3f,
            2.2,
            "DevYK",
            28,
            intArrayOf(1, 2, 3, 4, 5, 6, 7),
            arrayOf("1", "2", "4"),
            Person("阳坤",20),
            booleanArrayOf(false, true)
        )

        mNativeLib.dynamicRegister("我是动态注册的方法")
    }

    override fun onResume() {
        super.onResume()
        var ret = NativeLib().stringFromJNI2()
        Log.i(TAG, "onCreate: ret = $ret")
    }
}