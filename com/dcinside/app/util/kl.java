package com.dcinside.app.util;

import rx.o;

public class kl {
    public static boolean a(o[] arr_o) {
        if(arr_o != null && arr_o.length > 0) {
            for(int v = 0; v < arr_o.length; ++v) {
                o o0 = arr_o[v];
                if(o0 != null && !o0.j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void b(o[] arr_o) {
        for(int v = 0; v < arr_o.length; ++v) {
            o o0 = arr_o[v];
            if(o0 != null) {
                o0.l();
            }
        }
    }
}

