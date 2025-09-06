package com.dcinside.app.span;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable.Factory;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k {
    public static final class a {
        @StringRes
        private int a;
        private String b;
        private Object[] c;

        public final void c(TextView textView0) {
            textView0.setText(this.f(textView0.getContext()), TextView.BufferType.SPANNABLE);
        }

        public a d(int v, Object object0) {
            Object[] arr_object = this.c;
            if(arr_object == null) {
                this.c = new Object[v + 1];
            }
            else if(arr_object.length < v + 1) {
                this.c = Arrays.copyOf(arr_object, v + 1);
            }
            this.c[v] = object0;
            return this;
        }

        public a e(Object[] arr_object) {
            this.c = arr_object;
            return this;
        }

        public final Spannable f(Context context0) {
            String s = this.g(context0);
            Spannable spannable0 = Spannable.Factory.getInstance().newSpannable(s);
            k.b(context0, spannable0);
            return spannable0;
        }

        private String g(Context context0) {
            String s = this.a == 0 ? this.b : context0.getString(this.a);
            return this.c == null || this.c.length <= 0 ? s : String.format(Locale.getDefault(), s, this.c);
        }

        private static a h(@StringRes int v) {
            a k$a0 = new a();
            k$a0.a = v;
            return k$a0;
        }

        private static a i(@NonNull String s) {
            a k$a0 = new a();
            k$a0.b = s;
            return k$a0;
        }
    }

    private static final String a = "drawable";
    private static final String b = "\\Q[drawable=\\E([a-zA-Z0-9_]+?)\\Q;]\\E";

    private static void b(Context context0, Spannable spannable0) {
        Pattern pattern0 = Pattern.compile("\\Q[drawable=\\E([a-zA-Z0-9_]+?)\\Q;]\\E");
        Resources resources0 = context0.getResources();
        Matcher matcher0 = pattern0.matcher(spannable0);
    label_3:
        while(matcher0.find()) {
            ImageSpan[] arr_imageSpan = (ImageSpan[])spannable0.getSpans(matcher0.start(), matcher0.end(), ImageSpan.class);
            int v = 0;
            while(v < arr_imageSpan.length) {
                ImageSpan imageSpan0 = arr_imageSpan[v];
                if(spannable0.getSpanStart(imageSpan0) < matcher0.start() || spannable0.getSpanEnd(imageSpan0) > matcher0.end()) {
                    continue label_3;
                }
                spannable0.removeSpan(imageSpan0);
                ++v;
            }
            int v1 = resources0.getIdentifier(spannable0.subSequence(matcher0.start(1), matcher0.end(1)).toString().trim(), "drawable", "com.dcinside.app.android");
            if(v1 > 0) {
                spannable0.setSpan(new b(context0, v1, null, 0, 0, false, 0.0f), matcher0.start(), matcher0.end(), 33);
            }
        }
    }

    public static a c(@StringRes int v) {
        return a.h(v);
    }

    public static a d(String s) {
        return a.i(s);
    }
}

