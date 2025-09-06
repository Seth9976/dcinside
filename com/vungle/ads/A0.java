package com.vungle.ads;

import android.content.Context;
import y4.m;

public interface a0 extends b {
    public static final class a {
        public static void play$default(a0 a00, Context context0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if((v & 1) != 0) {
                context0 = null;
            }
            a00.play(context0);
        }
    }

    void play(@m Context arg1);
}

