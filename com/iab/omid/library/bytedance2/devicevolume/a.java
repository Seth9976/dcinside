package com.iab.omid.library.bytedance2.devicevolume;

public class a {
    public float a(int v, int v1) {
        if(v1 > 0 && v > 0) {
            float f = ((float)v) / ((float)v1);
            return f > 1.0f ? 1.0f : f;
        }
        return 0.0f;
    }
}

