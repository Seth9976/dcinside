package com.dcinside.app.span;

import android.widget.TextView;
import m0.a;

public final class p {
    private static final String a = " [drawable=divider_text;] ";

    public static void a(TextView textView0, CharSequence[] arr_charSequence) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_charSequence.length; ++v) {
            CharSequence charSequence0 = arr_charSequence[v];
            if(a.j(charSequence0)) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(" [drawable=divider_text;] ");
                }
                stringBuilder0.append(charSequence0);
            }
        }
        k.d(stringBuilder0.toString()).c(textView0);
    }
}

