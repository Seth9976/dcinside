package com.bytedance.adsdk.Zh.cr;

public enum ReZ {
    JSON(".json"),
    ZIP(".zip");

    public final String ReZ;

    private ReZ(String s1) {
        this.ReZ = s1;
    }

    public String PjT() {
        return ".temp" + this.ReZ;
    }

    @Override
    public String toString() {
        return this.ReZ;
    }
}

