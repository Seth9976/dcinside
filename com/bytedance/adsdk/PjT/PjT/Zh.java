package com.bytedance.adsdk.PjT.PjT;

public class Zh extends RuntimeException {
    public Zh(String s, Throwable throwable0) {
        super("Unable to parse expression:" + s, throwable0);
    }
}

