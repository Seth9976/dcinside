package com.coupang.ads.tools;

import android.content.res.TypedArray;
import kotlin.jvm.internal.L;

public final class e {
    public static final Enum a(TypedArray typedArray0, int v, Enum enum0) {
        L.p(typedArray0, "<this>");
        L.p(enum0, "default");
        int v1 = typedArray0.getInt(v, -1);
        if(v1 >= 0) {
            L.y(5, "T");
            return new Enum[0][v1];
        }
        return enum0;
    }

    public static final Enum b(TypedArray typedArray0, int v) {
        L.p(typedArray0, "<this>");
        int v1 = typedArray0.getInt(v, -1);
        if(v1 >= 0) {
            L.y(5, "T");
            return new Enum[0][v1];
        }
        return null;
    }
}

