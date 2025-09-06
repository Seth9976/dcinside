package com.facebook.imagepipeline.nativecode;

import k1.n.a;
import k1.n;

@n(a.a)
public class d {
    private static boolean a;

    public static void a() {
        synchronized(d.class) {
            if(!d.a) {
                o1.a.f("native-imagetranscoder");
                d.a = true;
            }
        }
    }
}

