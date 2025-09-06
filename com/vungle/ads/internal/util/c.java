package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class c {
    @l
    public static final c INSTANCE;

    static {
        c.INSTANCE = new c();
    }

    @n
    public static final void addToSet(@l HashSet hashSet0, @l String s) {
        synchronized(c.class) {
            L.p(hashSet0, "hashset");
            L.p(s, "set");
            hashSet0.add(s);
        }
    }

    @l
    @n
    public static final HashSet getNewHashSet(@m HashSet hashSet0) {
        synchronized(c.class) {
            return new HashSet(hashSet0);
        }
    }
}

