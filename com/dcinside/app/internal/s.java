package com.dcinside.app.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class s {
    public static final int a(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.b(context0, v);
    }

    @m
    public static final ColorStateList b(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.c(context0, v);
    }

    public static final float c(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.d(context0, v);
    }

    @m
    public static final Drawable d(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.e(context0, v);
    }

    public static final int e(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.f(context0, v);
    }

    @m
    public static final String f(@l View view0, @AttrRes int v) {
        L.p(view0, "<this>");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        return vk.g(context0, v);
    }

    public static final int g(@l View view0) {
        L.p(view0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        int v = view0.getPaddingTop();
        int v1 = view0.getPaddingBottom();
        return viewGroup$MarginLayoutParams0 == null ? v + v1 : v + v1 + (viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin);
    }

    public static final int h(@l View view0) {
        L.p(view0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
        int v = view0.getPaddingStart();
        int v1 = view0.getPaddingEnd();
        return viewGroup$MarginLayoutParams0 == null ? v + v1 : v + v1 + (viewGroup$MarginLayoutParams0.getMarginStart() + viewGroup$MarginLayoutParams0.getMarginEnd());
    }

    @l
    public static final d i(@l TextView textView0) {
        L.p(textView0, "<this>");
        return new k(textView0);
    }

    public static final void j(@l TextView textView0, @DrawableRes int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3, @IntRange(from = 0L) int v4) {
        L.p(textView0, "<this>");
        new k(textView0).b(v, v1, v2, v3).c(v4);
    }

    public static void k(TextView textView0, int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v = 0;
        }
        if((v5 & 2) != 0) {
            v1 = 0;
        }
        if((v5 & 4) != 0) {
            v2 = 0;
        }
        if((v5 & 8) != 0) {
            v3 = 0;
        }
        if((v5 & 16) != 0) {
            v4 = 0;
        }
        s.j(textView0, v, v1, v2, v3, v4);
    }

    @l
    public static final String l(@l ViewPager viewPager0, int v) {
        L.p(viewPager0, "<this>");
        return "android:switcher:" + viewPager0.getId() + ":" + v;
    }

    @l
    public static final String m(@l ViewPager2 viewPager20, int v) {
        L.p(viewPager20, "<this>");
        return "f" + v;
    }

    public static final Adapter n(RecyclerView recyclerView0) {
        L.p(recyclerView0, "<this>");
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        L.y(2, "T");
        return recyclerView$Adapter0;
    }
}

