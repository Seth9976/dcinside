package com.bytedance.adsdk.ugeno.yoga;

public class qj {
    public static long PjT(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static long PjT(int v, int v1) {
        return qj.PjT(v, v1);
    }
}

