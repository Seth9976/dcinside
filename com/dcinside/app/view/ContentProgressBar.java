package com.dcinside.app.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import com.dcinside.app.util.vk;
import com.google.android.material.animation.d;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kr.bhbfhfb.designcompat.b;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nContentProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentProgressBar.kt\ncom/dcinside/app/view/ContentProgressBar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class ContentProgressBar extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    private boolean b;
    @m
    private ObjectAnimator c;
    @m
    private ObjectAnimator d;
    @l
    private d e;
    private int f;
    private int g;
    @l
    private final Rect h;
    @l
    private final Paint i;
    private int j;
    private float k;
    @m
    private WeakReference l;
    @l
    public static final a m = null;
    private static final long n = 500L;
    private static final long o = 300L;

    static {
        ContentProgressBar.m = new a(null);
    }

    @j
    public ContentProgressBar(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ContentProgressBar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ContentProgressBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = 0;
        d d0 = d.b();
        L.o(d0, "getInstance(...)");
        this.e = d0;
        this.f = vk.b(context0, 0x7F04019B);  // attr:contentProgressAccent
        Integer integer0 = this.e.a(0.3f, vk.b(context0, 0x7F04019C), -1);  // attr:contentProgressBasic
        L.o(integer0, "evaluate(...)");
        this.g = integer0.intValue();
        this.h = new Rect();
        this.i = new Paint();
    }

    public ContentProgressBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final boolean a() {
        return this.b;
    }

    public final void b() {
        if(this.b) {
            return;
        }
        ObjectAnimator objectAnimator0 = this.d;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
        ObjectAnimator objectAnimator1 = this.c;
        if(objectAnimator1 != null) {
            objectAnimator1.cancel();
        }
        this.setProgress(0);
        this.setColorAlpha(1.0f);
        this.b = true;
    }

    public final void c(@IntRange(from = 0L, to = 100L) int v) {
        if(!this.b) {
            return;
        }
        if(v >= 100) {
            ObjectAnimator objectAnimator0 = this.d;
            if(objectAnimator0 != null) {
                objectAnimator0.cancel();
            }
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofInt(this, "progress", new int[]{v * 100}).setDuration(300L);
            objectAnimator1.start();
            this.d = objectAnimator1;
            ObjectAnimator objectAnimator2 = this.c;
            if(objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(this, "colorAlpha", new float[]{0.0f}).setDuration(0L);
            objectAnimator3.setStartDelay(400L);
            objectAnimator3.start();
            this.c = objectAnimator3;
            this.b = false;
            return;
        }
        if(this.getProgress() < v) {
            ObjectAnimator objectAnimator4 = this.d;
            if(objectAnimator4 != null) {
                objectAnimator4.cancel();
            }
            ObjectAnimator objectAnimator5 = ObjectAnimator.ofInt(this, "progress", new int[]{v * 100}).setDuration(500L);
            objectAnimator5.start();
            this.d = objectAnimator5;
        }
    }

    @m
    public final AppBarLayout getAppBarLayout() {
        return this.l == null ? null : ((AppBarLayout)this.l.get());
    }

    @Keep
    public final float getColorAlpha() {
        return this.k;
    }

    public static void getColorAlpha$annotations() {
    }

    @Keep
    public final int getProgress() {
        return this.j;
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        int v5;
        int v2;
        int v1;
        L.p(canvas0, "canvas");
        super.onDraw(canvas0);
        int v = (int)(((float)Math.ceil(((float)this.getWidth()) * (((float)this.getProgress()) / 10000.0f))));
        AppBarLayout appBarLayout0 = this.l == null ? null : ((AppBarLayout)this.l.get());
        if(appBarLayout0 == null) {
            v1 = 0;
            v2 = 0;
        }
        else {
            v2 = b.a(appBarLayout0);
            v1 = appBarLayout0.getHeight();
        }
        float f = v1 <= 0 || v2 == 0 ? 0.0f : ((float)Math.abs(v2)) / ((float)v1);
        int v3 = this.getHeight();
        int v4 = (int)(((float)this.a) + ((float)Math.max(v3 - this.a, this.a)) * f + 0.5f);
        Paint paint0 = this.i;
        if(f == 0.0f) {
            v5 = this.g;
        }
        else if(f == 1.0f) {
            v5 = this.f;
        }
        else {
            Integer integer0 = this.e.a(f, this.g, this.f);
            L.o(integer0, "evaluate(...)");
            v5 = integer0.intValue();
        }
        paint0.setColor(v5);
        this.i.setAlpha(((int)(255.0f * this.getColorAlpha())));
        this.h.set(0, 0, v, v4);
        canvas0.drawRect(this.h, this.i);
    }

    public final void setAppBarLayout(@m AppBarLayout appBarLayout0) {
        this.l = appBarLayout0 == null ? null : new WeakReference(appBarLayout0);
    }

    @Keep
    public final void setColorAlpha(float f) {
        if(this.k != f) {
            this.k = f;
            this.invalidate();
        }
    }

    @Keep
    public final void setProgress(int v) {
        if(this.j != v) {
            this.j = v;
            this.invalidate();
        }
    }
}

