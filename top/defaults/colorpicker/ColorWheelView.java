package top.defaults.colorpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

public class ColorWheelView extends FrameLayout implements c, j {
    private float a;
    private float b;
    private float c;
    private float d;
    private PointF e;
    private int f;
    private boolean g;
    private ColorWheelSelector h;
    private d i;
    private i j;

    public ColorWheelView(Context context0) {
        this(context0, null);
    }

    public ColorWheelView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorWheelView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = 27.0f;
        this.e = new PointF();
        this.f = 0xFFFF00FF;
        this.i = new d();
        this.j = new i(this);
        this.d = this.getResources().getDisplayMetrics().density * 9.0f;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        ColorWheelPalette colorWheelPalette0 = new ColorWheelPalette(context0);
        int v1 = (int)this.d;
        colorWheelPalette0.setPadding(v1, v1, v1, v1);
        this.addView(colorWheelPalette0, frameLayout$LayoutParams0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        ColorWheelSelector colorWheelSelector0 = new ColorWheelSelector(context0);
        this.h = colorWheelSelector0;
        colorWheelSelector0.setSelectorRadiusPx(this.d);
        this.addView(this.h, frameLayout$LayoutParams1);
    }

    @Override  // top.defaults.colorpicker.j
    public void a(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        boolean z = motionEvent0.getActionMasked() == 1;
        if(!this.g || z) {
            this.i.a(this.b(f, f1), true, z);
        }
        this.e(f, f1);
    }

    private int b(float f, float f1) {
        float f2 = f - this.b;
        float f3 = f1 - this.c;
        return Color.HSVToColor(new float[]{((float)(Math.atan2(f3, -f2) / 3.141593 * 180.0)) + 180.0f, Math.max(0.0f, Math.min(1.0f, ((float)(Math.sqrt(f2 * f2 + f3 * f3) / ((double)this.a))))), 1.0f});
    }

    @Override  // top.defaults.colorpicker.c
    public void c(e e0) {
        this.i.c(e0);
    }

    public void d(int v, boolean z) {
        float[] arr_f = new float[3];
        Color.colorToHSV(v, arr_f);
        float f = arr_f[1] * this.a;
        double f1 = (double)(((float)(((double)(arr_f[0] / 180.0f)) * 3.141593)));
        this.e(((float)(((double)f) * Math.cos(f1) + ((double)this.b))), ((float)(((double)(-f)) * Math.sin(f1) + ((double)this.c))));
        this.f = v;
        if(!this.g) {
            this.i.a(v, false, z);
        }
    }

    private void e(float f, float f1) {
        float f2 = f - this.b;
        float f3 = f1 - this.c;
        double f4 = Math.sqrt(f2 * f2 + f3 * f3);
        float f5 = this.a;
        if(f4 > ((double)f5)) {
            f2 = (float)(((double)f2) * (((double)f5) / f4));
            f3 = (float)(((double)f3) * (((double)f5) / f4));
        }
        this.e.x = f2 + this.b;
        this.e.y = f3 + this.c;
        this.h.setCurrentPoint(this.e);
    }

    @Override  // top.defaults.colorpicker.c
    public int getColor() {
        return this.i.getColor();
    }

    @Override  // top.defaults.colorpicker.c
    public void m(e e0) {
        this.i.m(e0);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        int v2 = Math.min(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v2, 0x40000000), View.MeasureSpec.makeMeasureSpec(v2, 0x40000000));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = v - this.getPaddingLeft() - this.getPaddingRight();
        int v5 = v1 - this.getPaddingTop() - this.getPaddingBottom();
        float f = ((float)Math.min(v4, v5)) * 0.5f - this.d;
        this.a = f;
        if(f < 0.0f) {
            return;
        }
        this.b = ((float)v4) * 0.5f;
        this.c = ((float)v5) * 0.5f;
        this.d(this.f, false);
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
        this.j.a(motionEvent0);
        return true;
    }

    public void setOnlyUpdateOnTouchEventUp(boolean z) {
        this.g = z;
    }
}

