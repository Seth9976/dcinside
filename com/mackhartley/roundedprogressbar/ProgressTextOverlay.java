package com.mackhartley.roundedprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

public final class ProgressTextOverlay extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final String e;
    private float f;
    private float g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private String l;
    private d m;
    private final Paint n;
    private final Paint o;
    private final Rect p;
    private HashMap q;
    public static final float r = 0.0f;
    public static final boolean s = true;
    @l
    public static final String t = "";
    public static final a u;

    static {
        ProgressTextOverlay.u = new a(null);
    }

    @j
    public ProgressTextOverlay(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public ProgressTextOverlay(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ProgressTextOverlay(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.q(context0, "context");
        super(context0, attributeSet0, v);
        float f = context0.getResources().getDimension(dimen.rpb_default_text_size);
        this.a = f;
        this.b = color.rpb_default_text_color;
        this.c = color.rpb_default_text_color;
        this.d = true;
        this.e = "";
        this.g = f;
        this.h = true;
        this.k = context0.getResources().getDimension(dimen.rpb_default_text_padding);
        this.l = "";
        this.m = new c(false, false, 3, null);
        this.p = new Rect();
        Paint paint0 = new Paint(1);
        paint0.setColor(ContextCompat.getColor(context0, color.rpb_default_text_color));
        this.n = paint0;
        Paint paint1 = new Paint(1);
        paint1.setColor(ContextCompat.getColor(context0, color.rpb_default_text_color));
        this.o = paint1;
        if(!v.x3(this.l)) {
            this.setCustomFontPath(this.l);
        }
        this.c();
    }

    public ProgressTextOverlay(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
        HashMap hashMap0 = this.q;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View b(int v) {
        if(this.q == null) {
            this.q = new HashMap();
        }
        View view0 = (View)this.q.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.q.put(v, view0);
        }
        return view0;
    }

    private final void c() {
        this.n.setTextSize(this.g);
        this.o.setTextSize(this.g);
        String s = this.m.b(this.f);
        this.n.getTextBounds(s, 0, s.length(), this.p);
        this.i = (float)this.p.height();
    }

    private final void d() {
        this.n.setTextSize(this.g);
        this.o.setTextSize(this.g);
        String s = this.m.b(this.f);
        this.n.getTextBounds(s, 0, s.length(), this.p);
        float f = (float)this.p.width();
        String s1 = this.m.a();
        int v = this.m.a().length();
        this.n.getTextBounds(s1, 0, v, this.p);
        this.j = Math.max(f, this.p.width());
    }

    public final void e(boolean z) {
        this.h = z;
        this.invalidate();
    }

    @Override  // android.view.View
    protected void onDraw(@m Canvas canvas0) {
        if(this.h) {
            super.onDraw(canvas0);
            float f = ((float)(this.getHeight() / 2)) + this.i / 2.0f;
            float f1 = (float)this.getWidth();
            if(this.j + 2.0f * this.k < f1 * this.f) {
                float f2 = (float)this.getWidth();
                float f3 = this.f;
                float f4 = f2 * f3 - this.j - this.k;
                if(canvas0 != null) {
                    canvas0.drawText(this.m.b(f3), f4, f, this.n);
                }
            }
            else {
                float f5 = (float)this.getWidth();
                float f6 = this.f;
                float f7 = f5 * f6 + this.k;
                if(canvas0 != null) {
                    canvas0.drawText(this.m.b(f6), f7, f, this.o);
                }
            }
        }
    }

    public final void setBackgroundTextColor(@ColorInt int v) {
        this.o.setColor(v);
        this.invalidate();
    }

    public final void setCustomFontPath(@l String s) {
        L.q(s, "newFontPath");
        if(!v.x3(s)) {
            this.l = s;
            Context context0 = this.getContext();
            L.h(context0, "context");
            Typeface typeface0 = Typeface.createFromAsset(context0.getAssets(), this.l);
            this.n.setTypeface(typeface0);
            this.o.setTypeface(typeface0);
            this.c();
            this.d();
            this.invalidate();
        }
    }

    public final void setProgress(float f) {
        this.f = f;
        this.d();
        this.invalidate();
    }

    public final void setProgressTextColor(@ColorInt int v) {
        this.n.setColor(v);
        this.invalidate();
    }

    public final void setProgressTextFormatter(@l d d0) {
        L.q(d0, "newProgressTextFormatter");
        this.m = d0;
        this.d();
        this.invalidate();
    }

    public final void setTextPadding(float f) {
        this.k = f;
        this.d();
        this.invalidate();
    }

    public final void setTextSize(float f) {
        this.g = f;
        this.c();
        this.d();
        this.invalidate();
    }
}

