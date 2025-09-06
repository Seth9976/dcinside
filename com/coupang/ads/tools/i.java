package com.coupang.ads.tools;

import android.content.Context;
import com.coupang.ads.R.string;
import com.coupang.ads.e;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i {
    @m
    public static final String a(@m String s, @l Context context0) {
        L.p(context0, "context");
        if(s == null) {
            return null;
        }
        String s1 = e.a.a(s);
        return s1 == null ? null : L.C(s1, context0.getResources().getString(string.HANWON));
    }

    @m
    public static final String b(@m Number number0, @l Context context0) {
        L.p(context0, "context");
        return number0 == null ? null : number0 + context0.getResources().getString(string.percentage);
    }

    @l
    public static final String c(@m String s) {
        return s == null ? "" : s;
    }
}

