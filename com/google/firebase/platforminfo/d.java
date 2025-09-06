package com.google.firebase.platforminfo;

import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

public class d {
    private final Set a;
    private static volatile d b;

    d() {
        this.a = new HashSet();
    }

    public static d a() {
        d d0 = d.b;
        if(d0 == null) {
            synchronized(d.class) {
                d0 = d.b;
                if(d0 == null) {
                    d0 = new d();
                    d.b = d0;
                }
            }
        }
        return d0;
    }

    Set b() {
        synchronized(this.a) {
        }
        return DesugarCollections.unmodifiableSet(this.a);
    }

    public void c(String s, String s1) {
        synchronized(this.a) {
            f f0 = f.a(s, s1);
            this.a.add(f0);
        }
    }
}

