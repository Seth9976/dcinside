package top.defaults.colorpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

public abstract class ColorSliderView extends View implements c, j {
    class a implements e {
        final ColorSliderView a;

        @Override  // top.defaults.colorpicker.e
        public void e(int v, boolean z, boolean z1) {
            ColorSliderView.this.g(v, z, z1);
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
    private d j;
    private i k;
    private e l;
    private c m;

    public ColorSliderView(Context context0) {
        this(context0, null);
    }

    public ColorSliderView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorSliderView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = -1;
        this.f = new Path();
        this.h = 1.0f;
        this.j = new d();
        this.k = new i(this);
        this.l = (int v, boolean z, boolean z1) -> {
            ColorSliderView.this.a = v;
            ColorSliderView.this.e(ColorSliderView.this.b);
            if(z) {
                v = ColorSliderView.this.b();
            }
            else {
                ColorSliderView.this.h = ColorSliderView.this.f(v);
            }
            if(!ColorSliderView.this.i) {
                ColorSliderView.this.j.a(v, z, z1);
            }
            else if(z1) {
                ColorSliderView.this.j.a(v, z, true);
            }
            ColorSliderView.this.invalidate();
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
        this.i(motionEvent0.getX());
        boolean z = motionEvent0.getActionMasked() == 1;
        if(!this.i || z) {
            this.j.a(this.b(), true, z);
        }
    }

    protected abstract int b();

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

    protected abstract void e(Paint arg1);

    protected abstract float f(int arg1);

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
        float f2 = ((float)this.getWidth()) - this.g;
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
        canvas0.drawRect(this.g, this.g, f - this.g, f1, this.b);
        canvas0.drawRect(this.g, this.g, f - this.g, f1, this.c);
        this.e.offset(this.h * (f - this.g * 2.0f), 0.0f, this.f);
        canvas0.drawPath(this.f, this.d);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        this.e(this.b);
        this.e.reset();
        this.g = ((float)v1) * 0.25f;
        this.e.moveTo(0.0f, 0.0f);
        this.e.lineTo(this.g * 2.0f, 0.0f);
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

