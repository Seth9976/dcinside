package com.vungle.ads;

import y4.m;

public interface b {
    public static final class a {
        public static void load$default(b b0, String s, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if((v & 1) != 0) {
                s = null;
            }
            b0.load(s);
        }
    }

    @m
    Boolean canPlayAd();

    void load(@m String arg1);
}

