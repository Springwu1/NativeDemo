package com.rokid.nativelib_kotlin

class KTNativeLib {

    /**
     * A native method that is implemented by the 'nativelib_kotlin' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'nativelib_kotlin' library on application startup.
        init {
            System.loadLibrary("nativelib_kotlin")
        }
    }
}