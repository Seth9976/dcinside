package com.bytedance.adsdk.PjT.Zh.PjT;

import java.util.Arrays;

public class PjT {
    private String PjT;
    private Object[] Zh;

    public String PjT() {
        return this.PjT;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(Object[] arr_object) {
        this.Zh = arr_object;
    }

    public Object[] Zh() {
        return this.Zh;
    }

    @Override
    public String toString() {
        return "MethodResult{methodName=\'" + this.PjT + '\'' + ", args=" + Arrays.toString(this.Zh) + '}';
    }
}

