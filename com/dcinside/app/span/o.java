package com.dcinside.app.span;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.dcinside.app.Application;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTopImageSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopImageSpan.kt\ncom/dcinside/app/span/TopImageSpan\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,89:1\n147#2:90\n147#2:91\n*S KotlinDebug\n*F\n+ 1 TopImageSpan.kt\ncom/dcinside/app/span/TopImageSpan\n*L\n43#1:90\n48#1:91\n*E\n"})
public final class o extends ImageSpan {
    private final int a;
    @m
    private final ColorStateList b;
    private final int c;
    private final int d;
    private final boolean e;
    @l
    private t f;

    public o(@l Context context0, int v, @m ColorStateList colorStateList0, int v1, int v2, boolean z) {
        L.p(context0, "context");
        super(context0, v);
        this.a = v;
        this.b = colorStateList0;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = new t(null, 1, null);
    }

    public o(Context context0, int v, ColorStateList colorStateList0, int v1, int v2, boolean z, int v3, w w0) {
        if((v3 & 4) != 0) {
            colorStateList0 = null;
        }
        this(context0, v, colorStateList0, ((v3 & 8) == 0 ? v1 : 0), ((v3 & 16) == 0 ? v2 : 0), ((v3 & 0x20) == 0 ? z : false));
    }

    public o(@l Context context0, @l i i0) {
        L.p(context0, "context");
        L.p(i0, "option");
        this(context0, i0.i(), i0.j(), i0.k(), i0.h(), i0.l());
    }

    private final Drawable a() {
        Drawable drawable0 = (Drawable)this.f.a();
        if(drawable0 == null) {
            drawable0 = this.getDrawable();
            if(this.e) {
                Resources resources0 = Application.e.c().getResources();
                L.m(drawable0);
                RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.a(resources0, DrawableKt.b(drawable0, 0, 0, null, 7, null));
                roundedBitmapDrawable0.l(true);
                DrawableCompat.o(roundedBitmapDrawable0, this.b);
                int v = this.c;
                if(v > 0) {
                    int v1 = this.d;
                    if(v1 > 0) {
                        roundedBitmapDrawable0.setBounds(0, 0, v, v1);
                    }
                    else {
                        roundedBitmapDrawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                    }
                }
                else {
                    roundedBitmapDrawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                }
                this.f = new t(roundedBitmapDrawable0);
                L.o(roundedBitmapDrawable0, "let(...)");
                return roundedBitmapDrawable0;
            }
            int v2 = this.c;
            if(v2 > 0) {
                int v3 = this.d;
                if(v3 > 0) {
                    drawable0.setBounds(0, 0, v2, v3);
                }
            }
            ColorStateList colorStateList0 = this.b;
            if(colorStateList0 != null) {
                vk.m(colorStateList0, new Drawable[]{drawable0});
            }
            this.f = new t(drawable0);
            L.m(drawable0);
        }
        return drawable0;
    }

    public final int b() {
        return this.a;
    }

    @Override  // android.text.style.DynamicDrawableSpan
    public void draw(@l Canvas canvas0, @l CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(charSequence0, "text");
        L.p(paint0, "paint");
        Drawable drawable0 = this.a();
        canvas0.save();
        Rect rect0 = drawable0.getBounds();
        L.o(rect0, "getBounds(...)");
        int v5 = rect0.height();
        canvas0.translate(f, ((float)(v2 - drawable0.getBounds().top + v5 / 2)));
        drawable0.draw(canvas0);
        canvas0.restore();
    }

    @Override  // android.text.style.DynamicDrawableSpan
    public int getSize(@l Paint paint0, @l CharSequence charSequence0, int v, int v1, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
        L.p(paint0, "paint");
        L.p(charSequence0, "text");
        Drawable drawable0 = this.a();
        if(paint$FontMetricsInt0 != null) {
            Paint.FontMetricsInt paint$FontMetricsInt1 = paint0.getFontMetricsInt();
            paint$FontMetricsInt0.ascent = paint$FontMetricsInt1.ascent;
            paint$FontMetricsInt0.descent = paint$FontMetricsInt1.descent;
            paint$FontMetricsInt0.top = paint$FontMetricsInt1.top;
            paint$FontMetricsInt0.bottom = paint$FontMetricsInt1.bottom;
        }
        return drawable0.getBounds().right;
    }
}

