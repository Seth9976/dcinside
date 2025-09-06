package com.facebook.common.util;

import k1.e;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public enum g {
    static class com.facebook.common.util.g.a {
        static final int[] a;

        static {
            int[] arr_v = new int[g.values().length];
            com.facebook.common.util.g.a.a = arr_v;
            try {
                arr_v[g.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.common.util.g.a.a[g.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.common.util.g.a.a[g.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    YES,
    NO,
    UNSET;

    @e
    public boolean a() {
        switch(com.facebook.common.util.g.a.a[this.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            case 3: {
                throw new IllegalStateException("No boolean equivalent for UNSET");
            }
            default: {
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
        }
    }

    @e
    public boolean b(boolean z) {
        switch(com.facebook.common.util.g.a.a[this.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            case 3: {
                return z;
            }
            default: {
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
        }
    }

    @e
    @h
    public Boolean c() {
        switch(this) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            case 3: {
                return null;
            }
            default: {
                throw new IllegalStateException("Unrecognized TriState value: " + this);
            }
        }
    }

    @e
    public static g d(int v) {
        switch(v) {
            case 1: {
                return g.a;
            }
            case 2: {
                return g.b;
            }
            default: {
                return g.c;
            }
        }
    }

    @e
    public int e() {
        switch(com.facebook.common.util.g.a.a[this.ordinal()]) {
            case 1: 
            case 2: {
                return 1;
            }
            default: {
                return 3;
            }
        }
    }

    @e
    public boolean f() [...] // 潜在的解密器

    @e
    public static g g(@h Boolean boolean0) {
        return boolean0 == null ? g.c : g.h(boolean0.booleanValue());
    }

    // 去混淆评级： 低(20)
    @e
    public static g h(boolean z) {
        return z ? g.a : g.b;
    }
}

