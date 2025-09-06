package com.zomato.photofilters.imageprocessors;

public final class NativeImageProcessor {
    public static native int[] applyChannelCurves(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
    }

    public static native int[] applyRGBCurve(int[] arg0, int[] arg1, int arg2, int arg3) {
    }

    public static native int[] doBrightness(int[] arg0, int arg1, int arg2, int arg3) {
    }

    public static native int[] doColorOverlay(int[] arg0, int arg1, float arg2, float arg3, float arg4, int arg5, int arg6) {
    }

    public static native int[] doContrast(int[] arg0, float arg1, int arg2, int arg3) {
    }

    public static native int[] doSaturation(int[] arg0, float arg1, int arg2, int arg3) {
    }
}

