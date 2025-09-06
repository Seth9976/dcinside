package com.bytedance.adsdk.PjT.PjT;

public class PjT extends RuntimeException {
    public PjT(String s, String s1) {
        super(s + ",problem area:" + s1);
    }
}

