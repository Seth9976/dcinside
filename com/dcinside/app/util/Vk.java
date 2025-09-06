package com.dcinside.app.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAttrs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attrs.kt\ncom/dcinside/app/util/Attrs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,166:1\n1#2:167\n1310#3,2:168\n1310#3,2:170\n*S KotlinDebug\n*F\n+ 1 Attrs.kt\ncom/dcinside/app/util/Attrs\n*L\n32#1:168,2\n144#1:170,2\n*E\n"})
public final class vk {
    @l
    public static final vk a;

    static {
        vk.a = new vk();
    }

    @n
    public static final boolean a(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.data != 0;
    }

    @n
    public static final int b(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.data;
    }

    @m
    @n
    public static final ColorStateList c(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return ContextCompat.getColorStateList(context0, typedValue0.resourceId);
    }

    @n
    public static final float d(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.getDimension(context0.getResources().getDisplayMetrics());
    }

    @m
    @n
    public static final Drawable e(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return ContextCompat.getDrawable(context0, typedValue0.resourceId);
    }

    @n
    public static final int f(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.resourceId;
    }

    @m
    @n
    public static final String g(@l Context context0, @AttrRes int v) {
        L.p(context0, "context");
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        return typedValue0.string == null ? null : typedValue0.string.toString();
    }

    @n
    public static final void h(@AttrRes int v, @l View[] arr_view) {
        L.p(arr_view, "vs");
        View view0 = null;
        View[] arr_view1 = arr_view.length == 0 ? null : arr_view;
        if(arr_view1 != null) {
            for(int v1 = 0; v1 < arr_view1.length; ++v1) {
                View view1 = arr_view1[v1];
                if(view1 != null) {
                    view0 = view1;
                    break;
                }
            }
            if(view0 != null) {
                Context context0 = view0.getContext();
                L.o(context0, "getContext(...)");
                ColorStateList colorStateList0 = vk.c(context0, v);
                if(colorStateList0 != null) {
                    vk.n(colorStateList0, ((View[])Arrays.copyOf(arr_view, arr_view.length)));
                }
            }
        }
    }

    @n
    public static final void i(@l Context context0, @AttrRes int v, @l Drawable[] arr_drawable) {
        L.p(context0, "context");
        L.p(arr_drawable, "ds");
        ColorStateList colorStateList0 = vk.c(context0, v);
        if(colorStateList0 != null) {
            vk.m(colorStateList0, ((Drawable[])Arrays.copyOf(arr_drawable, arr_drawable.length)));
        }
    }

    private final void j(ColorStateList colorStateList0, ImageView imageView0) {
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0 != null) {
            Drawable drawable1 = DrawableCompat.r(drawable0);
            DrawableCompat.o(drawable1, colorStateList0);
            imageView0.setImageDrawable(drawable1);
        }
    }

    private final void k(ColorStateList colorStateList0, TextView textView0) {
        Drawable[] arr_drawable = textView0.getCompoundDrawables();
        L.o(arr_drawable, "getCompoundDrawables(...)");
        boolean z = false;
        for(int v = 0; v < arr_drawable.length; ++v) {
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                Drawable drawable1 = DrawableCompat.r(drawable0);
                arr_drawable[v] = drawable1;
                DrawableCompat.o(drawable1, colorStateList0);
                z = true;
            }
        }
        if(z) {
            textView0.setCompoundDrawablesWithIntrinsicBounds(arr_drawable[0], arr_drawable[1], arr_drawable[2], arr_drawable[3]);
        }
    }

    private final void l(ColorStateList colorStateList0, FloatingActionButton floatingActionButton0) {
        Drawable drawable0 = floatingActionButton0.getDrawable();
        if(drawable0 != null) {
            Drawable drawable1 = DrawableCompat.r(drawable0);
            DrawableCompat.o(drawable1, colorStateList0);
            floatingActionButton0.setImageDrawable(drawable1);
        }
    }

    @n
    public static final void m(@l ColorStateList colorStateList0, @l Drawable[] arr_drawable) {
        L.p(colorStateList0, "color");
        L.p(arr_drawable, "ds");
        for(int v = 0; v < arr_drawable.length; ++v) {
            vk.a.o(arr_drawable[v], colorStateList0);
        }
    }

    @n
    public static final void n(@l ColorStateList colorStateList0, @l View[] arr_view) {
        L.p(colorStateList0, "color");
        L.p(arr_view, "vs");
        for(int v = 0; v < arr_view.length; ++v) {
            View view0 = arr_view[v];
            if(view0 instanceof FloatingActionButton) {
                vk.a.l(colorStateList0, ((FloatingActionButton)view0));
            }
            else if(view0 instanceof ImageView) {
                vk.a.j(colorStateList0, ((ImageView)view0));
            }
            else if(view0 instanceof TextView) {
                vk.a.k(colorStateList0, ((TextView)view0));
            }
        }
    }

    private final void o(Drawable drawable0, ColorStateList colorStateList0) {
        if(drawable0 != null) {
            DrawableCompat.o(DrawableCompat.r(drawable0), colorStateList0);
        }
    }

    @n
    public static final void p(@AttrRes int v, @l View[] arr_view) {
        L.p(arr_view, "vs");
        View view0 = null;
        View[] arr_view1 = arr_view.length == 0 ? null : arr_view;
        if(arr_view1 != null) {
            for(int v1 = 0; v1 < arr_view1.length; ++v1) {
                View view1 = arr_view1[v1];
                if(view1 != null) {
                    view0 = view1;
                    break;
                }
            }
            if(view0 != null) {
                Context context0 = view0.getContext();
                L.o(context0, "getContext(...)");
                ColorStateList colorStateList0 = vk.c(context0, v);
                if(colorStateList0 != null) {
                    vk.q(colorStateList0, ((View[])Arrays.copyOf(arr_view, arr_view.length)));
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    @n
    public static final void q(@l ColorStateList colorStateList0, @l View[] arr_view) {
        L.p(colorStateList0, "color");
        L.p(arr_view, "vs");
        for(int v = 0; v < arr_view.length; ++v) {
            View view0 = arr_view[v];
            if(view0 instanceof TintableBackgroundView) {
                ((TintableBackgroundView)view0).setSupportBackgroundTintList(colorStateList0);
            }
            else if(view0 != null) {
                Drawable drawable0 = view0.getBackground();
                if(drawable0 != null) {
                    Drawable drawable1 = DrawableCompat.r(drawable0);
                    DrawableCompat.o(drawable1, colorStateList0);
                    ViewCompat.R1(view0, drawable1);
                }
            }
        }
    }
}

