package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/tbuonomo/viewpagerdotsindicator/ExtensionsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n76#2:58\n76#2:60\n76#2:61\n1#3:59\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/tbuonomo/viewpagerdotsindicator/ExtensionsKt\n*L\n51#1:58\n54#1:60\n57#1:61\n*E\n"})
public final class f {
    @Composable
    public static final float a(float f, @m Composer composer0, int v) {
        composer0.V(0x871F6BC);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x871F6BC, v, -1, "com.tbuonomo.viewpagerdotsindicator.dpToPx (Extensions.kt:50)");
        }
        float f1 = ((Density)composer0.L(CompositionLocalsKt.i())).y1(f);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return f1;
    }

    public static final int b(@l Context context0) {
        L.p(context0, "<this>");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.colorPrimary, typedValue0, true);
        return typedValue0.data;
    }

    public static final boolean c(@m ViewPager viewPager0) {
        if(viewPager0 != null) {
            PagerAdapter pagerAdapter0 = viewPager0.getAdapter();
            return pagerAdapter0 != null && pagerAdapter0.e() == 0;
        }
        return false;
    }

    public static final boolean d(@m ViewPager2 viewPager20) {
        if(viewPager20 != null) {
            Adapter recyclerView$Adapter0 = viewPager20.getAdapter();
            return recyclerView$Adapter0 != null && recyclerView$Adapter0.getItemCount() == 0;
        }
        return false;
    }

    public static final boolean e(@l ArrayList arrayList0, int v) {
        L.p(arrayList0, "<this>");
        return v >= 0 && v < arrayList0.size();
    }

    public static final boolean f(@l ViewPager viewPager0) {
        L.p(viewPager0, "<this>");
        PagerAdapter pagerAdapter0 = viewPager0.getAdapter();
        return (pagerAdapter0 == null ? 0 : pagerAdapter0.e()) > 0;
    }

    public static final boolean g(@l ViewPager2 viewPager20) {
        L.p(viewPager20, "<this>");
        Adapter recyclerView$Adapter0 = viewPager20.getAdapter();
        return (recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount()) > 0;
    }

    @Composable
    public static final float h(float f, @m Composer composer0, int v) {
        composer0.V(0x8F930578);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x8F930578, v, -1, "com.tbuonomo.viewpagerdotsindicator.pxToDp (Extensions.kt:56)");
        }
        float f1 = ((Density)composer0.L(CompositionLocalsKt.i())).D(f);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return f1;
    }

    @Composable
    public static final float i(int v, @m Composer composer0, int v1) {
        composer0.V(2066720075);
        if(ComposerKt.g0()) {
            ComposerKt.w0(2066720075, v1, -1, "com.tbuonomo.viewpagerdotsindicator.pxToDp (Extensions.kt:53)");
        }
        float f = ((Density)composer0.L(CompositionLocalsKt.i())).C(v);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return f;
    }

    public static final void j(@l View view0, @m Drawable drawable0) {
        L.p(view0, "<this>");
        view0.setBackground(drawable0);
    }

    public static final void k(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(v, view0.getPaddingTop(), v, view0.getPaddingBottom());
    }

    public static final void l(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.setPadding(view0.getPaddingLeft(), v, view0.getPaddingRight(), v);
    }

    public static final void m(@l View view0, int v) {
        L.p(view0, "<this>");
        view0.getLayoutParams().width = v;
        view0.requestLayout();
    }
}

