//
// Created by apple on 16/7/16.
//

#include "com_xyt_hello_NdkJniUtils.h"


JNIEXPORT jstring JNICALL Java_com_xyt_hello_NdkJniUtils_getCLanguageString(JNIEnv *env, jobject obj) {
  return (*env)->NewStringUTF(env,"I’m coming from C language!");
}