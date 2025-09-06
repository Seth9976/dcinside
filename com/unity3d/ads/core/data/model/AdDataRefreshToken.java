package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
public final class AdDataRefreshToken {
    @l
    private final String data;

    private AdDataRefreshToken(String s) {
        this.data = s;
    }

    public static final AdDataRefreshToken box-impl(String s) {
        return new AdDataRefreshToken(s);
    }

    @l
    public static String constructor-impl(@l String s) {
        L.p(s, "data");
        return s;
    }

    @Override
    public boolean equals(Object object0) {
        return AdDataRefreshToken.equals-impl(this.data, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(String s, Object object0) {
        return object0 instanceof AdDataRefreshToken ? L.g(s, ((AdDataRefreshToken)object0).unbox-impl()) : false;
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
        return AdDataRefreshToken.hashCode-impl(this.data);
    }

    public static int hashCode-impl(String s) {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return "AdDataRefreshToken(data=" + this.data + ')';
    }

    public static String toString-impl(String s) [...] // Inlined contents

    public final String unbox-impl() {
        return this.data;
    }
}

