package com.bytedance.sdk.component.Zh.PjT;

public final class cz {
    private final String[] PjT;

    public cz(String[] arr_s) {
        this.PjT = arr_s;
    }

    public int PjT() {
        return this.PjT.length / 2;
    }

    public String PjT(int v) {
        return this.PjT[v * 2];
    }

    public String Zh(int v) {
        return this.PjT[v * 2 + 1];
    }
}

