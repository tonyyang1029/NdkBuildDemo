package com.ty.android.ndkbuilddemo;

public class NdkBuildDemoLib {
    static {
        System.loadLibrary("NdkBuildDemoLib");
    }

    public int mNum = 0;

    public native String getStringFromLib();
    public native int updateNumber();
}
