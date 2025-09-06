package com.bytedance.sdk.openadsdk;

public class TTImage {
    private final int PjT;
    private final String ReZ;
    private final int Zh;
    private double cr;

    public TTImage(int v, int v1, String s) {
        this(v, v1, s, 0.0);
    }

    public TTImage(int v, int v1, String s, double f) {
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = s;
        this.cr = f;
    }

    public double getDuration() {
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

    public boolean isValid() {
        return this.PjT > 0 && this.Zh > 0 && (this.ReZ != null && this.ReZ.length() > 0);
    }
}

