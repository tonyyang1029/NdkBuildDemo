//
// Created by TonyYang on 2019-09-17.
//

#include "com_ty_android_ndkbuilddemo_NdkBuildDemoLib.h"

JNIEXPORT jstring JNICALL Java_com_ty_android_ndkbuilddemo_NdkBuildDemoLib_getStringFromLib(JNIEnv *env, jobject obj)
{
    return (*env)->NewStringUTF(env, "greeting from NDK-Build demo lib!!");
}

JNIEXPORT jint JNICALL
Java_com_ty_android_ndkbuilddemo_NdkBuildDemoLib_updateNumber(JNIEnv *env, jobject thiz) {
    jclass clazz;
    clazz = (*env)->GetObjectClass(env, thiz);

    jfieldID id;
    id = (*env)->GetFieldID(env, clazz, "mNum", "I");

    int number = (*env)->GetIntField(env, thiz, id);
    (*env)->SetIntField(env, thiz, id, ++number);

    return number;
}