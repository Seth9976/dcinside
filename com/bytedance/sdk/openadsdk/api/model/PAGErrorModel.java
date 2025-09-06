package com.bytedance.sdk.openadsdk.api.model;

public class PAGErrorModel {
    private final int PjT;
    private final String Zh;

    public PAGErrorModel(int v, String s) {
        this.PjT = v;
        this.Zh = s;
    }

    public int getErrorCode() {
        return this.PjT;
    }

    public String getErrorMessage() {
        return this.Zh;
    }
}

