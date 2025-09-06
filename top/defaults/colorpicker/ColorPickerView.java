package top.defaults.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ColorPickerView extends LinearLayout implements c {
    private ColorWheelView a;
    private BrightnessSliderView b;
    private AlphaSliderView c;
    private c d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    List i;

    public ColorPickerView(Context context0) {
        this(context0, null);
    }

    public ColorPickerView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ColorPickerView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = 0xFF000000;
        this.i = new ArrayList();
        this.setOrientation(1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ColorPickerView);
        boolean z = typedArray0.getBoolean(styleable.ColorPickerView_enableAlpha, false);
        boolean z1 = typedArray0.getBoolean(styleable.ColorPickerView_enableBrightness, true);
        this.e = typedArray0.getBoolean(styleable.ColorPickerView_onlyUpdateOnTouchEventUp, false);
        typedArray0.recycle();
        this.a = new ColorWheelView(context0);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v1 = (int)(8.0f * displayMetrics0.density);
        this.g = v1 * 2;
        this.h = (int)(displayMetrics0.density * 24.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        this.addView(this.a, linearLayout$LayoutParams0);
        this.setEnabledBrightness(z1);
        this.setEnabledAlpha(z);
        this.setPadding(v1, v1, v1, v1);
    }

    public void a() {
        this.a.d(this.f, true);
    }

    private void b() {
        if(this.d != null) {
            for(Object object0: this.i) {
                this.d.c(((e)object0));
            }
        }
        this.a.setOnlyUpdateOnTouchEventUp(false);
        BrightnessSliderView brightnessSliderView0 = this.b;
        if(brightnessSliderView0 != null) {
            brightnessSliderView0.setOnlyUpdateOnTouchEventUp(false);
        }
        AlphaSliderView alphaSliderView0 = this.c;
        if(alphaSliderView0 != null) {
            alphaSliderView0.setOnlyUpdateOnTouchEventUp(false);
        }
        BrightnessSliderView brightnessSliderView1 = this.b;
        if(brightnessSliderView1 != null || this.c != null) {
            AlphaSliderView alphaSliderView1 = this.c;
            if(alphaSliderView1 == null) {
                this.d = brightnessSliderView1;
                brightnessSliderView1.setOnlyUpdateOnTouchEventUp(this.e);
            }
            else {
                this.d = alphaSliderView1;
                alphaSliderView1.setOnlyUpdateOnTouchEventUp(this.e);
            }
        }
        else {
            this.d = this.a;
            this.a.setOnlyUpdateOnTouchEventUp(this.e);
        }
        List list0 = this.i;
        if(list0 != null) {
            for(Object object1: list0) {
                this.d.m(((e)object1));
                ((e)object1).e(this.d.getColor(), false, true);
            }
        }
    }

    @Override  // top.defaults.colorpicker.c
    public void c(e e0) {
        this.d.c(e0);
        this.i.remove(e0);
    }

    @Override  // top.defaults.colorpicker.c
    public int getColor() {
        return this.d.getColor();
    }

    @Override  // top.defaults.colorpicker.c
    public void m(e e0) {
        this.d.m(e0);
        this.i.add(e0);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1) - (this.getPaddingTop() + this.getPaddingBottom()) + (this.getPaddingLeft() + this.getPaddingRight());
        if(this.b != null) {
            v3 -= this.g + this.h;
        }
        if(this.c != null) {
            v3 -= this.g + this.h;
        }
        int v4 = Math.min(v2, v3);
        int v5 = v4 - (this.getPaddingLeft() + this.getPaddingRight()) + (this.getPaddingTop() + this.getPaddingBottom());
        if(this.b != null) {
            v5 += this.g + this.h;
        }
        if(this.c != null) {
            v5 += this.g + this.h;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v4, View.MeasureSpec.getMode(v)), View.MeasureSpec.makeMeasureSpec(v5, View.MeasureSpec.getMode(v1)));
    }

    public void setEnabledAlpha(boolean z) {
        if(z) {
            if(this.c == null) {
                this.c = new AlphaSliderView(this.getContext());
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, this.h);
                linearLayout$LayoutParams0.topMargin = this.g;
                this.addView(this.c, linearLayout$LayoutParams0);
            }
            BrightnessSliderView brightnessSliderView0 = this.b;
            if(brightnessSliderView0 == null) {
                brightnessSliderView0 = this.a;
            }
            this.c.d(brightnessSliderView0);
            this.b();
            return;
        }
        AlphaSliderView alphaSliderView0 = this.c;
        if(alphaSliderView0 != null) {
            alphaSliderView0.h();
            this.removeView(this.c);
            this.c = null;
        }
        this.b();
    }

    public void setEnabledBrightness(boolean z) {
        if(z) {
            if(this.b == null) {
                this.b = new BrightnessSliderView(this.getContext());
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, this.h);
                linearLayout$LayoutParams0.topMargin = this.g;
                this.addView(this.b, 1, linearLayout$LayoutParams0);
            }
            this.b.d(this.a);
        }
        else {
            BrightnessSliderView brightnessSliderView0 = this.b;
            if(brightnessSliderView0 != null) {
                brightnessSliderView0.h();
                this.removeView(this.b);
                this.b = null;
            }
        }
        this.b();
        if(this.c != null) {
            this.setEnabledAlpha(true);
        }
    }

    public void setInitialColor(int v) {
        this.f = v;
        this.a.d(v, true);
    }

    public void setOnlyUpdateOnTouchEventUp(boolean z) {
        this.e = z;
        this.b();
    }
}

