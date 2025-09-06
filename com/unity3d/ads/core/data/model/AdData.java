package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
public final class AdData {
    @l
    private final String data;

    private AdData(String s) {
        this.data = s;
    }

    public static final AdData box-impl(String s) {
        return new AdData(s);
    }

    @l
    public static String constructor-impl(@l String s) {
        L.p(s, "data");
        return s;
    }

    @Override
    public boolean equals(Object object0) {
        return AdData.equals-impl(this.data, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(String s, Object object0) {
        return object0 instanceof AdData ? L.g(s, ((AdData)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(String s, String s1) {
        return L.g(s, s1);
    }

    @l
    public final String getData() {
        return this.data;
    }

    @Override
    public int hashCode() {
        return AdData.hashCode-impl(this.data);
    }

    public static int hashCode-impl(String s) {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return "AdData(data=" + this.data + ')';
    }

    public static String toString-impl(String s) [...] // Inlined contents

    public final String unbox-impl() {
        return this.data;
    }
}

