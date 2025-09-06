package com.dcinside.app.view.colorpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import top.defaults.colorpicker.c;
import top.defaults.colorpicker.e;
import top.defaults.colorpicker.j;

public class ColorVerticalSliderView extends View implements c, j {
    class a implements e {
        final ColorVerticalSliderView a;

        @Override  // top.defaults.colorpicker.e
        public void e(int v, boolean z, boolean z1) {
            ColorVerticalSliderView.this.g(v, z, z1);
        }
    }

    static final class b implements c {
        private List a;
        private int b;

        private b() {
            this.a = new ArrayList();
        }

        b(com.dcinside.app.view.colorpicker.b b0) {
        }

        void a(int v, boolean z, boolean z1) {
            this.b = v;
            for(Object object0: this.a) {
                ((e)object0).e(v, z, z1);
            }
        }

        @Override  // top.defaults.colorpicker.c
        public void c(e e0) {
            if(e0 == null) {
                return;
            }
            this.a.remove(e0);
        }

        @Override  // top.defaults.colorpicker.c
        public int getColor() {
            return this.b;
        }

        @Override  // top.defaults.colorpicker.c
        public void m(e e0) {
            if(e0 == null) {
                return;
            }
            this.a.add(e0);
        }
    }

    static final class com.dcinside.app.view.colorpicker.ColorVerticalSliderView.c {
        private int a;
        private j b;
        private long c;
        private static final int d = 16;

        private com.dcinside.app.view.colorpicker.ColorVerticalSliderView.c(int v, j j0) {
            this.c = 0L;
            this.a = v;
            this.b = j0;
        }

        com.dcinside.app.view.colorpicker.ColorVerticalSliderView.c(j j0) {
            this(16, j0);
        }

        void a(MotionEvent motionEvent0) {
            if(this.b == null) {
                return;
            }
            long v = System.currentTimeMillis();
            if(v - this.c <= ((long)this.a)) {
                return;
            }
            this.c = v;
            this.b.a(motionEvent0);
        }
    }

    protected int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private Path e;
    private Path f;
    protected float g;
    protected float h;
    private boolean i;
    private b j;
    private com.dcinside.app.view.colorpicker.ColorVerticalSliderView.c k;
    private final e l;
    private c m;

    public ColorVerticalSliderView(Context context0) {
        this(context0, null);
    }

    public ColorVerticalSliderView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorVerticalSliderView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = -1;
        this.f = new Path();
        this.h = 1.0f;
        this.j = new b(null);
        this.k = new com.dcinside.app.view.colorpicker.ColorVerticalSliderView.c(this);
        this.l = (int v, boolean z, boolean z1) -> {
            ColorVerticalSliderView.this.a = v;
            ColorVerticalSliderView.this.e(ColorVerticalSliderView.this.b);
            if(z) {
                v = ColorVerticalSliderView.this.b();
            }
            else {
                ColorVerticalSliderView.this.h = ColorVerticalSliderView.this.f(v);
            }
            if(!ColorVerticalSliderView.this.i) {
                ColorVerticalSliderView.this.j.a(v, z, z1);
            }
            else if(z1) {
                ColorVerticalSliderView.this.j.a(v, z, true);
            }
            ColorVerticalSliderView.this.invalidate();
        };
        this.b = new Paint(1);
        Paint paint0 = new Paint(1);
        this.c = paint0;
        paint0.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(0.0f);
        this.c.setColor(0xFF000000);
        Paint paint1 = new Paint(1);
        this.d = paint1;
        paint1.setColor(0xFF000000);
        Path path0 = new Path();
        this.e = path0;
        path0.setFillType(Path.FillType.WINDING);
    }

    @Override  // top.defaults.colorpicker.j
    public void a(MotionEvent motionEvent0) {
        this.i(motionEvent0.getY());
        boolean z = motionEvent0.getActionMasked() == 1;
        if(!this.i || z) {
            this.j.a(this.b(), true, z);
        }
    }

    public int b() {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        arr_f[2] = this.h;
        return Color.HSVToColor(arr_f);
    }

    @Override  // top.defaults.colorpicker.c
    public void c(e e0) {
        this.j.c(e0);
    }

    public void d(c c0) {
        if(c0 != null) {
            c0.m(this.l);
            this.g(c0.getColor(), true, true);
        }
        this.m = c0;
    }

    public void e(Paint paint0) {
        float[] arr_f = new float[3];
        Color.colorToHSV(this.a, arr_f);
        arr_f[2] = 0.0f;
        int v = Color.HSVToColor(arr_f);
        arr_f[2] = 1.0f;
        int v1 = Color.HSVToColor(arr_f);
        paint0.setShader(new LinearGradient(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), v, v1, Shader.TileMode.CLAMP));
    }

    public float f(int v) {
        float[] arr_f = new float[3];
        Color.colorToHSV(v, arr_f);
        return arr_f[2];
    }

    // 检测为 Lambda 实现
    void g(int v, boolean z, boolean z1) [...]

    @Override  // top.defaults.colorpicker.c
    public int getColor() {
        return this.j.getColor();
    }

    public void h() {
        c c0 = this.m;
        if(c0 != null) {
            c0.c(this.l);
            this.m = null;
        }
    }

    private void i(float f) {
        float f1 = this.g;
        float f2 = ((float)this.getHeight()) - this.g;
        if(f < f1) {
            f = f1;
        }
        if(f > f2) {
            f = f2;
        }
        this.h = (f - f1) / (f2 - f1);
        this.invalidate();
    }

    @Override  // top.defaults.colorpicker.c
    public void m(e e0) {
        this.j.m(e0);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        float f = (float)this.getWidth();
        float f1 = (float)this.getHeight();
        canvas0.drawRect(this.g, this.g, f, f1 - this.g, this.b);
        canvas0.drawRect(this.g, this.g, f, f1 - this.g, this.c);
        this.e.offset(0.0f, this.h * (f1 - this.g * 2.0f), this.f);
        canvas0.drawPath(this.f, this.d);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        this.e(this.b);
        this.e.reset();
        this.g = ((float)v) * 0.25f;
        this.e.moveTo(0.0f, 0.0f);
        this.e.lineTo(0.0f, this.g * 2.0f);
        this.e.lineTo(this.g, this.g);
        this.e.close();
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                this.a(motionEvent0);
                return true;
            label_5:
                if(v != 2) {
                    return super.onTouchEvent(motionEvent0);
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
        this.k.a(motionEvent0);
        return true;
    }

    public void setOnlyUpdateOnTouchEventUp(boolean z) {
        this.i = z;
    }
}

