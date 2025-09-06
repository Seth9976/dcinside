package com.bytedance.sdk.openadsdk.api.nativeAd;

public class PAGImageItem {
    private final int PjT;
    private final String ReZ;
    private final int Zh;
    private float cr;

    public PAGImageItem(int v, int v1, String s) {
        this(v, v1, s, 0.0f);
    }

    public PAGImageItem(int v, int v1, String s, float f) {
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = s;
        this.cr = f;
    }

    public float getDuration() {
        return this.cr;
    }

    public int getHeight() {
        return this.PjT;
    }

    public String getImageUrl() {
        return this.ReZ;
    }

    public int getWidth() {
        return this.Zh;
    }
}

