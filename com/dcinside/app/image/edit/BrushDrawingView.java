package com.dcinside.app.image.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Stack;

public class BrushDrawingView extends View {
    interface a {
        void a();

        void b(BrushDrawingView arg1);

        void c(BrushDrawingView arg1);

        void d();
    }

    class b {
        private Paint a;
        private Path b;

        b(Path path0, Paint paint0) {
            this.a = new Paint(paint0);
            this.b = new Path(path0);
        }

        Paint a() {
            return this.a;
        }

        Path b() {
            return this.b;
        }
    }

    private float a;
    private float b;
    private int c;
    private Stack d;
    private Stack e;
    private Paint f;
    private Canvas g;
    private boolean h;
    private Path i;
    private float j;
    private float k;
    private a l;
    private static final float m = 4.0f;

    public BrushDrawingView(Context context0) {
        this(context0, null);
    }

    public BrushDrawingView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 25.0f;
        this.b = 50.0f;
        this.c = 0xFF;
        this.d = new Stack();
        this.e = new Stack();
        this.e();
    }

    public BrushDrawingView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = 25.0f;
        this.b = 50.0f;
        this.c = 0xFF;
        this.d = new Stack();
        this.e = new Stack();
        this.e();
    }

    void a() {
        this.h = true;
        this.f.setStrokeWidth(this.b);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    void b() {
        this.d.clear();
        this.e.clear();
        Canvas canvas0 = this.g;
        if(canvas0 != null) {
            canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        this.invalidate();
    }

    boolean c() {
        if(!this.e.empty()) {
            this.d.push(((b)this.e.pop()));
            this.invalidate();
        }
        a brushDrawingView$a0 = this.l;
        if(brushDrawingView$a0 != null) {
            brushDrawingView$a0.b(this);
        }
        return !this.e.empty();
    }

    private void d() {
        this.h = true;
        this.i = new Path();
        this.f.setAntiAlias(true);
        this.f.setDither(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeJoin(Paint.Join.ROUND);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        this.f.setStrokeWidth(this.a);
        this.f.setAlpha(this.c);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    private void e() {
        this.setLayerType(2, null);
        this.f = new Paint();
        this.i = new Path();
        this.f.setAntiAlias(true);
        this.f.setDither(true);
        this.f.setColor(0xFF000000);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeJoin(Paint.Join.ROUND);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        this.f.setStrokeWidth(this.a);
        this.f.setAlpha(this.c);
        this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.setVisibility(8);
    }

    private void f(float f, float f1) {
        if(Math.abs(f - this.j) >= 4.0f || Math.abs(f1 - this.k) >= 4.0f) {
            this.i.quadTo(this.j, this.k, (f + this.j) / 2.0f, (f1 + this.k) / 2.0f);
            this.j = f;
            this.k = f1;
        }
    }

    private void g(float f, float f1) {
        this.e.clear();
        this.i.reset();
        this.i.moveTo(f, f1);
        this.j = f;
        this.k = f1;
        a brushDrawingView$a0 = this.l;
        if(brushDrawingView$a0 != null) {
            brushDrawingView$a0.a();
        }
    }

    int getBrushColor() {
        return this.f.getColor();
    }

    boolean getBrushDrawingMode() {
        return this.h;
    }

    float getBrushSize() {
        return this.a;
    }

    float getEraserSize() {
        return this.b;
    }

    private void h() {
        this.i.lineTo(this.j, this.k);
        this.g.drawPath(this.i, this.f);
        this.d.push(new b(this, this.i, this.f));
        this.i = new Path();
        a brushDrawingView$a0 = this.l;
        if(brushDrawingView$a0 != null) {
            brushDrawingView$a0.d();
            this.l.b(this);
        }
    }

    boolean i() {
        if(!this.d.empty()) {
            this.e.push(((b)this.d.pop()));
            this.invalidate();
        }
        a brushDrawingView$a0 = this.l;
        if(brushDrawingView$a0 != null) {
            brushDrawingView$a0.c(this);
        }
        return !this.d.empty();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        for(Object object0: this.d) {
            canvas0.drawPath(((b)object0).b(), ((b)object0).a());
        }
        canvas0.drawPath(this.i, this.f);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.g = new Canvas(Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888));
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(this.h) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            int v = motionEvent0.getAction();
            switch(v) {
                case 0: {
                    this.g(f, f1);
                    break;
                }
                case 1: {
                    this.h();
                    break;
                }
                default: {
                    if(v == 2) {
                        this.f(f, f1);
                    }
                }
            }
            this.invalidate();
            return true;
        }
        return false;
    }

    void setBrushColor(@ColorInt int v) {
        this.f.setColor(v);
        this.setBrushDrawingMode(true);
    }

    void setBrushDrawingMode(boolean z) {
        this.h = z;
        if(z) {
            this.setVisibility(0);
            this.d();
        }
    }

    void setBrushEraserColor(@ColorInt int v) {
        this.f.setColor(v);
        this.setBrushDrawingMode(true);
    }

    void setBrushEraserSize(float f) {
        this.b = f;
        this.setBrushDrawingMode(true);
    }

    void setBrushSize(float f) {
        this.a = f;
        this.setBrushDrawingMode(true);
    }

    void setBrushViewChangeListener(a brushDrawingView$a0) {
        this.l = brushDrawingView$a0;
    }

    void setOpacity(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.c = v;
        this.setBrushDrawingMode(true);
    }
}

