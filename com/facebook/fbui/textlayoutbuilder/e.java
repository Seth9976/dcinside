package com.facebook.fbui.textlayoutbuilder;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class e {
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @VisibleForTesting
    static class c {
        TextPaint a;
        float b;
        float c;
        float d;
        int e;
        int f;
        int g;
        CharSequence h;
        @Nullable
        ColorStateList i;
        float j;
        float k;
        float l;
        boolean m;
        boolean n;
        boolean o;
        @Nullable
        TextUtils.TruncateAt p;
        boolean q;
        int r;
        Layout.Alignment s;
        TextDirectionHeuristicCompat t;
        int u;
        int v;
        int w;
        int[] x;
        int[] y;
        boolean z;

        c() {
            boolean z = true;
            this.a = new TextPaint(1);
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 3.402823E+38f;
            this.m = true;
            if(Build.VERSION.SDK_INT < 28) {
                z = false;
            }
            this.n = z;
            this.o = false;
            this.p = null;
            this.q = false;
            this.r = 0x7FFFFFFF;
            this.s = Layout.Alignment.ALIGN_NORMAL;
            this.t = TextDirectionHeuristicsCompat.c;
            this.u = 0;
            this.v = 0;
            this.w = 0;
            this.z = false;
        }

        void a() {
            if(this.z) {
                TextPaint textPaint0 = new TextPaint(this.a);
                textPaint0.set(this.a);
                this.a = textPaint0;
                this.z = false;
            }
        }

        int b() {
            return Math.round(((float)this.a.getFontMetricsInt(null)) * this.j + this.k);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = ((((((((((((((((((((((((this.a.getColor() + 0x1F) * 0x1F + Float.floatToIntBits(this.a.getTextSize())) * 0x1F + (this.a.getTypeface() == null ? 0 : this.a.getTypeface().hashCode())) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + this.e) * 0x1F + this.a.linkColor) * 0x1F + Float.floatToIntBits(this.a.density)) * 0x1F + Arrays.hashCode(this.a.drawableState)) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + Float.floatToIntBits(this.j)) * 0x1F + Float.floatToIntBits(this.k)) * 0x1F + Float.floatToIntBits(this.l)) * 0x1F + this.m) * 0x1F + this.n) * 0x1F + (this.p == null ? 0 : this.p.hashCode())) * 0x1F + this.q) * 0x1F + this.r) * 0x1F + (this.s == null ? 0 : this.s.hashCode())) * 0x1F + (this.t == null ? 0 : this.t.hashCode())) * 0x1F + this.u) * 0x1F + this.v) * 0x1F;
            int v2 = Arrays.hashCode(this.x);
            int v3 = Arrays.hashCode(this.y);
            CharSequence charSequence0 = this.h;
            if(charSequence0 != null) {
                v = charSequence0.hashCode();
            }
            return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
        }
    }

    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    @VisibleForTesting
    final c f;
    @Nullable
    private Layout g;
    private com.facebook.fbui.textlayoutbuilder.b h;
    private boolean i;
    private boolean j;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 0x7FFFFFFF;
    private static final float o = 0.0f;
    private static final float p = 1.0f;
    private static final float q = 3.402823E+38f;
    private static final int r = 1;
    private static final int s = 2;
    private static final long t = 500L;
    @VisibleForTesting
    static final LruCache u;

    static {
        e.u = new LruCache(100);
    }

    public e() {
        this.a = 0;
        this.b = 2;
        this.c = 0x7FFFFFFF;
        this.d = 2;
        this.e = false;
        this.f = new c();
        this.g = null;
        this.i = true;
        this.j = false;
    }

    @ColorInt
    public int A() {
        return this.f.a.getColor();
    }

    public TextDirectionHeuristicCompat B() {
        return this.f.t;
    }

    public float C() {
        return this.f.a.getTextSize();
    }

    public float D() {
        return this.f.k;
    }

    public float E() {
        return this.f.j;
    }

    public Typeface F() {
        return this.f.a.getTypeface();
    }

    public boolean G() {
        return this.f.n;
    }

    @Nullable
    private BoringLayout.Metrics H() {
        try {
            return BoringLayout.isBoring(this.f.h, this.f.a);
        }
        catch(NullPointerException nullPointerException0) {
            if(Build.VERSION.SDK_INT >= 23) {
                throw nullPointerException0;
            }
            return null;
        }
    }

    public e I(Layout.Alignment layout$Alignment0) {
        c e$c0 = this.f;
        if(e$c0.s != layout$Alignment0) {
            e$c0.s = layout$Alignment0;
            this.g = null;
        }
        return this;
    }

    public e J(int v) {
        c e$c0 = this.f;
        if(e$c0.u != v) {
            e$c0.u = v;
            this.g = null;
        }
        return this;
    }

    public e K(float f) {
        c e$c0 = this.f;
        if(e$c0.a.density != f) {
            e$c0.a();
            this.f.a.density = f;
            this.g = null;
        }
        return this;
    }

    public e L(int[] arr_v) {
        this.f.a();
        this.f.a.drawableState = arr_v;
        ColorStateList colorStateList0 = this.f.i;
        if(colorStateList0 != null && colorStateList0.isStateful()) {
            int v = this.f.i.getColorForState(arr_v, 0);
            this.f.a.setColor(v);
            this.g = null;
        }
        return this;
    }

    public e M(@Nullable TextUtils.TruncateAt textUtils$TruncateAt0) {
        c e$c0 = this.f;
        if(e$c0.p != textUtils$TruncateAt0) {
            e$c0.p = textUtils$TruncateAt0;
            this.g = null;
        }
        return this;
    }

    public e N(com.facebook.fbui.textlayoutbuilder.b b0) {
        this.h = b0;
        return this;
    }

    public e O(int v) {
        c e$c0 = this.f;
        if(e$c0.v != v) {
            e$c0.v = v;
            if(Build.VERSION.SDK_INT >= 23) {
                this.g = null;
            }
        }
        return this;
    }

    public e P(boolean z) {
        c e$c0 = this.f;
        if(e$c0.m != z) {
            e$c0.m = z;
            this.g = null;
        }
        return this;
    }

    public e Q(int[] arr_v, int[] arr_v1) {
        this.f.x = arr_v;
        this.f.y = arr_v1;
        this.g = null;
        return this;
    }

    @RequiresApi(api = 26)
    public e R(int v) {
        c e$c0 = this.f;
        if(e$c0.w != v) {
            e$c0.w = v;
            if(Build.VERSION.SDK_INT >= 26) {
                this.g = null;
            }
        }
        return this;
    }

    @RequiresApi(api = 21)
    public e S(float f) {
        if(this.n() != f) {
            this.f.a();
            this.f.a.setLetterSpacing(f);
            this.g = null;
        }
        return this;
    }

    public e T(float f) {
        c e$c0 = this.f;
        if(e$c0.l != f) {
            e$c0.l = f;
            e$c0.k = f - e$c0.a.getFontMetrics(null);
            this.f.j = 1.0f;
            this.g = null;
        }
        return this;
    }

    public e U(@ColorInt int v) {
        c e$c0 = this.f;
        if(e$c0.a.linkColor != v) {
            e$c0.a();
            this.f.a.linkColor = v;
            this.g = null;
        }
        return this;
    }

    public e V(int v) {
        this.c = v;
        this.d = 1;
        return this;
    }

    public e W(int v) {
        c e$c0 = this.f;
        if(e$c0.r != v) {
            e$c0.r = v;
            this.g = null;
        }
        return this;
    }

    public e X(@Px int v) {
        this.c = v;
        this.d = 2;
        return this;
    }

    public e Y(int v) {
        this.a = v;
        this.b = 1;
        return this;
    }

    public e Z(@Px int v) {
        this.a = v;
        this.b = 2;
        return this;
    }

    public e a0(float f, float f1, float f2, @ColorInt int v) {
        this.f.a();
        this.f.d = f;
        this.f.b = f1;
        this.f.c = f2;
        this.f.e = v;
        this.f.a.setShadowLayer(f, f1, f2, v);
        this.g = null;
        return this;
    }

    @Nullable
    public Layout b() {
        class a implements Callable {
            final e a;

            @Nullable
            public BoringLayout.Metrics a() throws Exception {
                return e.this.H();
            }

            @Override
            @Nullable
            public Object call() throws Exception {
                return this.a();
            }
        }

        Layout layout2;
        int v4;
        int v1;
        if(this.i) {
            Layout layout0 = this.g;
            if(layout0 != null) {
                return layout0;
            }
        }
        boolean z = false;
        CharSequence charSequence0 = this.f.h;
        BoringLayout.Metrics boringLayout$Metrics0 = null;
        if(charSequence0 != null && (charSequence0.length() != 0 || this.f.o)) {
            if(this.i) {
                CharSequence charSequence1 = this.f.h;
                if(charSequence1 instanceof Spannable && ((ClickableSpan[])((Spannable)charSequence1).getSpans(0, charSequence1.length() - 1, ClickableSpan.class)).length > 0) {
                    z = true;
                }
            }
            if(!this.i || z) {
                v1 = -1;
            }
            else {
                int v = this.f.hashCode();
                Layout layout1 = (Layout)e.u.get(v);
                if(layout1 != null) {
                    return layout1;
                }
                v1 = v;
            }
            int v2 = this.f.q ? 1 : this.f.r;
            if(v2 == 1) {
                if(this.e) {
                    Future future0 = Executors.newSingleThreadExecutor().submit(new a(this));
                    try {
                        boringLayout$Metrics0 = (BoringLayout.Metrics)future0.get(500L, TimeUnit.MILLISECONDS);
                    }
                    catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                    }
                }
                else {
                    boringLayout$Metrics0 = this.H();
                }
            }
            c e$c0 = this.f;
            int v3 = e$c0.g;
            switch(v3) {
                case 0: {
                    v4 = (int)Math.ceil(Layout.getDesiredWidth(e$c0.h, e$c0.a));
                    break;
                }
                case 1: {
                    v4 = e$c0.f;
                    break;
                }
                default: {
                    if(v3 != 2) {
                        throw new IllegalStateException("Unexpected measure mode " + this.f.g);
                    }
                    v4 = Math.min(((int)Math.ceil(Layout.getDesiredWidth(e$c0.h, e$c0.a))), this.f.f);
                    break;
                }
            }
            int v5 = this.f.b();
            int v6 = this.d == 1 ? Math.min(v4, this.c * v5) : Math.min(v4, this.c);
            int v7 = this.b == 1 ? Math.max(v6, this.a * v5) : Math.max(v6, this.a);
            if(boringLayout$Metrics0 == null) {
                while(true) {
                    try {
                        CharSequence charSequence2 = this.f.h;
                        layout2 = d.d(charSequence2, 0, charSequence2.length(), this.f.a, v7, this.f.s, this.f.j, this.f.k, this.f.m, this.f.p, v7, v2, this.f.t, this.f.u, this.f.v, this.f.w, this.f.x, this.f.y, this.f.n);
                        break;
                    }
                    catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                        if(this.f.h instanceof String) {
                            throw indexOutOfBoundsException0;
                        }
                        Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", indexOutOfBoundsException0);
                        this.f.h = this.f.h.toString();
                    }
                }
            }
            else {
                layout2 = BoringLayout.make(this.f.h, this.f.a, v7, this.f.s, this.f.j, this.f.k, boringLayout$Metrics0, this.f.m, this.f.p, v7);
            }
            if(this.i && !z) {
                this.g = layout2;
                e.u.put(v1, layout2);
            }
            this.f.z = true;
            if(this.j) {
                com.facebook.fbui.textlayoutbuilder.b b0 = this.h;
                if(b0 != null) {
                    b0.a(layout2);
                }
            }
            return layout2;
        }
        return null;
    }

    public e b0(boolean z) {
        this.i = z;
        return this;
    }

    public e c(boolean z) {
        this.e = z;
        return this;
    }

    public e c0(boolean z) {
        c e$c0 = this.f;
        if(e$c0.o != z) {
            e$c0.o = z;
            if(e$c0.h.length() == 0) {
                this.g = null;
            }
        }
        return this;
    }

    public Layout.Alignment d() {
        return this.f.s;
    }

    public e d0(boolean z) {
        this.j = z;
        return this;
    }

    public int e() {
        return this.f.u;
    }

    public e e0(boolean z) {
        c e$c0 = this.f;
        if(e$c0.q != z) {
            e$c0.q = z;
            this.g = null;
        }
        return this;
    }

    public float f() {
        return this.f.a.density;
    }

    public e f0(@Nullable CharSequence charSequence0) {
        if(charSequence0 == this.f.h) {
            return this;
        }
        if(charSequence0 instanceof SpannableStringBuilder) {
            try {
                charSequence0.hashCode();
            }
            catch(NullPointerException nullPointerException0) {
                throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", nullPointerException0);
            }
        }
        if(charSequence0 != null && charSequence0.equals(this.f.h)) {
            return this;
        }
        this.f.h = charSequence0;
        this.g = null;
        return this;
    }

    public int[] g() {
        return this.f.a.drawableState;
    }

    public e g0(@ColorInt int v) {
        this.f.a();
        this.f.i = null;
        this.f.a.setColor(v);
        this.g = null;
        return this;
    }

    @Nullable
    public TextUtils.TruncateAt h() {
        return this.f.p;
    }

    public e h0(ColorStateList colorStateList0) {
        this.f.a();
        this.f.i = colorStateList0;
        this.f.a.setColor((colorStateList0 == null ? 0xFF000000 : colorStateList0.getDefaultColor()));
        this.g = null;
        return this;
    }

    public com.facebook.fbui.textlayoutbuilder.b i() {
        return this.h;
    }

    public e i0(TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        c e$c0 = this.f;
        if(e$c0.t != textDirectionHeuristicCompat0) {
            e$c0.t = textDirectionHeuristicCompat0;
            this.g = null;
        }
        return this;
    }

    public int j() {
        return this.f.v;
    }

    public e j0(int v) {
        if(this.f.a.getTextSize() != ((float)v)) {
            this.f.a();
            this.f.a.setTextSize(((float)v));
            this.g = null;
        }
        return this;
    }

    public boolean k() {
        return this.f.m;
    }

    public e k0(float f) {
        c e$c0 = this.f;
        if(e$c0.l == 3.402823E+38f && e$c0.k != f) {
            e$c0.k = f;
            this.g = null;
        }
        return this;
    }

    @RequiresApi(api = 26)
    public int l() {
        return this.f.w;
    }

    public e l0(float f) {
        c e$c0 = this.f;
        if(e$c0.l == 3.402823E+38f && e$c0.j != f) {
            e$c0.j = f;
            this.g = null;
        }
        return this;
    }

    public int[] m() {
        return this.f.x;
    }

    public e m0(int v) {
        return this.n0(Typeface.defaultFromStyle(v));
    }

    @RequiresApi(api = 21)
    public float n() {
        return this.f.a.getLetterSpacing();
    }

    public e n0(@Nullable Typeface typeface0) {
        if(this.f.a.getTypeface() != typeface0) {
            this.f.a();
            this.f.a.setTypeface(typeface0);
            this.g = null;
        }
        return this;
    }

    public float o() {
        return (float)this.f.b();
    }

    @RequiresApi(api = 28)
    public e o0(boolean z) {
        c e$c0 = this.f;
        if(e$c0.n != z) {
            e$c0.n = z;
            this.g = null;
        }
        return this;
    }

    @ColorInt
    public int p() {
        return this.f.a.linkColor;
    }

    public e p0(@Px int v) {
        return v > 0 ? this.q0(v, 1) : this.q0(v, 0);
    }

    public int q() {
        return this.d == 1 ? this.c : -1;
    }

    public e q0(@Px int v, int v1) {
        c e$c0 = this.f;
        if(e$c0.f != v || e$c0.g != v1) {
            e$c0.f = v;
            e$c0.g = v1;
            this.g = null;
        }
        return this;
    }

    public int r() {
        return this.f.r;
    }

    @Px
    public int s() {
        return this.d == 2 ? this.c : -1;
    }

    public int t() {
        return this.b == 1 ? this.a : -1;
    }

    @Px
    public int u() {
        return this.b == 2 ? this.a : -1;
    }

    public int[] v() {
        return this.f.y;
    }

    public boolean w() {
        return this.i;
    }

    public boolean x() {
        return this.j;
    }

    public boolean y() {
        return this.f.q;
    }

    public CharSequence z() {
        return this.f.h;
    }
}

