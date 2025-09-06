package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;

public final class r {
    private final int[] a;
    @StyleRes
    private final int b;
    private static final int[] c;

    static {
        r.c = new int[]{attr.colorError, attr.colorOnError, attr.colorErrorContainer, attr.colorOnErrorContainer};
    }

    private r(@AttrRes @NonNull int[] arr_v, @StyleRes int v) {
        if(v != 0 && arr_v.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.a = arr_v;
        this.b = v;
    }

    @NonNull
    public static r a(@AttrRes @NonNull int[] arr_v) {
        return new r(arr_v, 0);
    }

    @NonNull
    public static r b(@AttrRes @NonNull int[] arr_v, @StyleRes int v) {
        return new r(arr_v, v);
    }

    @NonNull
    public static r c() {
        return r.b(r.c, style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] d() {
        return this.a;
    }

    @StyleRes
    public int e() {
        return this.b;
    }
}

