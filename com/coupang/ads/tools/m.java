package com.coupang.ads.tools;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[k.values().length];
            arr_v[k.a.ordinal()] = 1;
            arr_v[k.c.ordinal()] = 2;
            arr_v[k.b.ordinal()] = 3;
            a.a = arr_v;
        }
    }

    public static final void a(@l TextView textView0, @y4.m ColorStateList colorStateList0) {
        L.p(textView0, "<this>");
        if(colorStateList0 != null) {
            textView0.setHintTextColor(colorStateList0);
        }
    }

    public static final void b(@l TextView textView0, @y4.m ColorStateList colorStateList0) {
        L.p(textView0, "<this>");
        if(colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    public static final void c(@l TextView textView0, @l k k0) {
        L.p(textView0, "<this>");
        L.p(k0, "fontWeight");
        switch(k0) {
            case 1: {
                textView0.setTypeface(null, 0);
                return;
            }
            case 2: {
                textView0.setTypeface(null, 1);
                return;
            }
            case 3: {
                textView0.setTypeface(Typeface.create("sans-serif-medium", 0));
            }
        }
    }

    public static final void d(@l TextView textView0, @y4.m CharSequence charSequence0) {
        L.p(textView0, "<this>");
        if(TextUtils.isEmpty(charSequence0)) {
            textView0.setVisibility(8);
            return;
        }
        textView0.setText(charSequence0);
        textView0.setVisibility(0);
    }
}

