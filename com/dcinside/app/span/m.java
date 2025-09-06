package com.dcinside.app.span;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextPaint;

public class m extends ShapeDrawable {
    public static class a implements b, c, d {
        private TextPaint a;
        private String b;
        private int c;
        private int d;
        private float e;
        private int f;
        private int g;
        private Typeface h;
        private RectShape i;
        public int j;
        private float k;
        private boolean l;
        private boolean m;
        public float n;

        private a() {
            this.b = "";
            this.c = 0xFF888888;
            this.d = 0xFF888888;
            this.j = -1;
            this.e = 0.0f;
            this.f = -1;
            this.g = -1;
            this.i = new RectShape();
            this.h = Typeface.create("sans-serif-light", 0);
            this.k = -1.0f;
            this.l = false;
            this.m = false;
        }

        a(n n0) {
        }

        @Override  // com.dcinside.app.span.m$d
        public b a(float f) {
            this.n = f;
            this.i = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null);
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c b(float f) {
            this.k = f;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c c() {
            this.l = true;
            return this;
        }

        @Override  // com.dcinside.app.span.m$d
        public b d() {
            this.i = new OvalShape();
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c e(float f, int v) {
            this.e = f;
            this.c = v;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c f(int v) {
            this.f = v;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c g() {
            this.m = true;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c h(int v) {
            this.g = v;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public c i(int v) {
            this.j = v;
            return this;
        }

        @Override  // com.dcinside.app.span.m$c
        public d j() {
            return this;
        }

        @Override  // com.dcinside.app.span.m$b
        public m k(String s, int v) {
            this.d = v;
            this.b = s;
            return new m(this, null);
        }

        @Override  // com.dcinside.app.span.m$c
        public c l(TextPaint textPaint0) {
            this.a = textPaint0;
            return this;
        }

        @Override  // com.dcinside.app.span.m$d
        public b m() {
            this.i = new RectShape();
            return this;
        }

        @Override  // com.dcinside.app.span.m$d
        public m n(String s, int v, float f) {
            this.a(f);
            return this.k(s, v);
        }

        @Override  // com.dcinside.app.span.m$d
        public c o() {
            return this;
        }

        @Override  // com.dcinside.app.span.m$d
        public m p(String s, int v) {
            this.m();
            return this.k(s, v);
        }

        @Override  // com.dcinside.app.span.m$d
        public m q(String s, int v) {
            this.d();
            return this.k(s, v);
        }

        @Override  // com.dcinside.app.span.m$c
        public c r(Typeface typeface0) {
            this.h = typeface0;
            return this;
        }
    }

    public interface b {
        m k(String arg1, int arg2);
    }

    public interface c {
        c b(float arg1);

        c c();

        c e(float arg1, int arg2);

        c f(int arg1);

        c g();

        c h(int arg1);

        c i(int arg1);

        d j();

        c l(TextPaint arg1);

        c r(Typeface arg1);
    }

    public interface d {
        b a(float arg1);

        b d();

        b m();

        m n(String arg1, int arg2, float arg3);

        c o();

        m p(String arg1, int arg2);

        m q(String arg1, int arg2);
    }

    private final TextPaint a;
    private final Paint b;
    private final String c;
    private final RectShape d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;
    private final float i;
    private static final float j = 0.9f;

    private m(a m$a0) {
        super(m$a0.i);
        this.d = m$a0.i;
        this.e = m$a0.g;
        this.f = m$a0.f;
        this.h = m$a0.n;
        this.c = m$a0.m ? m$a0.b.toUpperCase() : m$a0.b;
        int v = m$a0.d;
        int v1 = m$a0.c;
        this.g = m$a0.k;
        TextPaint textPaint0 = new TextPaint();
        this.a = textPaint0;
        if(m$a0.a != null) {
            textPaint0.set(m$a0.a);
        }
        textPaint0.setColor(m$a0.j);
        textPaint0.setAntiAlias(true);
        textPaint0.setFakeBoldText(m$a0.l);
        textPaint0.setStyle(Paint.Style.FILL);
        textPaint0.setTypeface(m$a0.h);
        textPaint0.setTextAlign(Paint.Align.CENTER);
        textPaint0.setStrokeWidth(m$a0.e);
        float f = m$a0.e;
        this.i = f;
        Paint paint0 = new Paint();
        this.b = paint0;
        paint0.setAntiAlias(true);
        paint0.setColor(this.c(v1));
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(f);
        this.getPaint().setColor(v);
    }

    m(a m$a0, n n0) {
        this(m$a0);
    }

    public static d a() {
        return new a(null);
    }

    private void b(Canvas canvas0) {
        RectF rectF0 = new RectF(this.getBounds());
        float f = this.i / 2.0f;
        rectF0.inset(f, f);
        RectShape rectShape0 = this.d;
        if(rectShape0 instanceof OvalShape) {
            canvas0.drawOval(rectF0, this.b);
            return;
        }
        if(rectShape0 instanceof RoundRectShape) {
            canvas0.drawRoundRect(rectF0, this.h, this.h, this.b);
            return;
        }
        canvas0.drawRect(rectF0, this.b);
    }

    private int c(int v) {
        return Color.rgb(((int)(((float)Color.red(v)) * 0.9f)), ((int)(((float)Color.green(v)) * 0.9f)), ((int)(((float)Color.blue(v)) * 0.9f)));
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        Rect rect0 = this.getBounds();
        if(this.i > 0.0f) {
            this.b(canvas0);
        }
        int v = canvas0.save();
        canvas0.translate(((float)rect0.left), ((float)rect0.top));
        int v1 = this.f >= 0 ? this.f : rect0.width();
        float f = this.e >= 0 ? ((float)this.e) : ((float)rect0.height());
        this.a.setTextSize((this.g < 0.0f ? Math.min(v1, f) / 2.0f : this.g));
        float f1 = this.a.descent();
        float f2 = this.a.ascent();
        canvas0.drawText(this.c, ((float)v1) / 2.0f, f / 2.0f - (f1 + f2) / 2.0f, this.a);
        canvas0.restoreToCount(v);
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public int getIntrinsicHeight() {
        return this.e;
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.ShapeDrawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }
}

