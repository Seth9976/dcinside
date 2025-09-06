package com.igaworks.ssp;

import android.graphics.Typeface;
import android.text.Html;
import android.text.TextUtils.TruncateAt;
import android.widget.TextView;

public abstract class s0 {
    public static void a(TextView textView0, String s, int v, int v1, Typeface typeface0, int v2, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, boolean z) {
        if(s != null) {
            textView0.setText(Html.fromHtml(s.replaceAll("\n", "<br>")));
        }
        textView0.setTextSize(1, ((float)v));
        textView0.setTextColor(v1);
        if(typeface0 == null) {
            textView0.setTypeface(Typeface.DEFAULT, v2);
        }
        else {
            textView0.setTypeface(typeface0, v2);
        }
        if(v3 == 1) {
            textView0.setSingleLine(true);
        }
        else if(v3 > 1) {
            textView0.setMaxLines(v3);
        }
        textView0.setEllipsize(textUtils$TruncateAt0);
        if(z) {
            textView0.setPaintFlags(textView0.getPaintFlags() | 0x20);
        }
        textView0.setIncludeFontPadding(false);
    }

    public static boolean a(String s) [...] // 潜在的解密器

    public static boolean b(String s) {
        return !s0.a(s);
    }
}

