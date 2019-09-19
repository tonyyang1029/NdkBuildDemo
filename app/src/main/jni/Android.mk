LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := NdkBuildDemoLib
LOCAL_SRC_FILES =: NdkBuildDemoLib.c
include $(BUILD_SHARED_LIBRARY)