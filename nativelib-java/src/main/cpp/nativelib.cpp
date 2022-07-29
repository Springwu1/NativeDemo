#include <jni.h>
#include <string>

#define JNI_FUNCTION(n) Java_com_wjm_nativelib_NativeLib_##n

extern "C" JNIEXPORT jstring JNICALL
Java_com_wjm_nativelib_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
JNI_FUNCTION(stringFromJNI2(
        JNIEnv* env,jobject /* this */)){
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}