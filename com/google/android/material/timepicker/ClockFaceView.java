package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.d;
import java.util.Arrays;

class ClockFaceView extends RadialViewGroup implements c {
    private final ClockHandView h;
    private final Rect i;
    private final RectF j;
    private final Rect k;
    private final SparseArray l;
    private final AccessibilityDelegateCompat m;
    private final int[] n;
    private final float[] o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private String[] t;
    private float u;
    private final ColorStateList v;
    private static final float w = 0.001f;
    private static final int x = 12;
    private static final String y = "";

    public ClockFaceView(@NonNull Context context0) {
        this(context0, null);
    }

    public ClockFaceView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class a implements ViewTreeObserver.OnPreDrawListener {
            final ClockFaceView a;

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                if(!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int v = ClockFaceView.this.getHeight();
                ClockFaceView.this.E(v / 2 - ClockFaceView.this.h.j() - ClockFaceView.this.p);
                return true;
            }
        }


        class b extends AccessibilityDelegateCompat {
            final ClockFaceView d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                int v = (int)(((Integer)view0.getTag(id.material_value_index)));
                if(v > 0) {
                    accessibilityNodeInfoCompat0.l2(((View)ClockFaceView.this.l.get(v - 1)));
                }
                accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(0, 1, v, 1, false, view0.isSelected()));
                accessibilityNodeInfoCompat0.l1(true);
                accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.j);
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public boolean j(View view0, int v, Bundle bundle0) {
                if(v == 16) {
                    long v1 = SystemClock.uptimeMillis();
                    view0.getHitRect(ClockFaceView.this.i);
                    float f = (float)ClockFaceView.this.i.centerX();
                    float f1 = (float)ClockFaceView.this.i.centerY();
                    ClockFaceView.this.h.onTouchEvent(MotionEvent.obtain(v1, v1, 0, f, f1, 0));
                    ClockFaceView.this.h.onTouchEvent(MotionEvent.obtain(v1, v1, 1, f, f1, 0));
                    return true;
                }
                return super.j(view0, v, bundle0);
            }
        }

        super(context0, attributeSet0, v);
        this.i = new Rect();
        this.j = new RectF();
        this.k = new Rect();
        this.l = new SparseArray();
        this.o = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ClockFaceView, v, style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources0 = this.getResources();
        ColorStateList colorStateList0 = d.a(context0, typedArray0, styleable.ClockFaceView_clockNumberTextColor);
        this.v = colorStateList0;
        LayoutInflater.from(context0).inflate(layout.material_clockface_view, this, true);
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(id.material_clock_hand);
        this.h = clockHandView0;
        this.p = resources0.getDimensionPixelSize(dimen.material_clock_hand_padding);
        int v1 = colorStateList0.getDefaultColor();
        int v2 = colorStateList0.getColorForState(new int[]{0x10100A1}, v1);
        this.n = new int[]{v2, v2, colorStateList0.getDefaultColor()};
        clockHandView0.b(this);
        int v3 = AppCompatResources.a(context0, color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList1 = d.a(context0, typedArray0, styleable.ClockFaceView_clockFaceBackgroundColor);
        if(colorStateList1 != null) {
            v3 = colorStateList1.getDefaultColor();
        }
        this.setBackgroundColor(v3);
        this.getViewTreeObserver().addOnPreDrawListener(new a(this));
        this.setFocusable(true);
        typedArray0.recycle();
        this.m = new b(this);
        String[] arr_s = new String[12];
        Arrays.fill(arr_s, "");
        this.f(arr_s, 0);
        this.q = resources0.getDimensionPixelSize(dimen.material_time_picker_minimum_screen_height);
        this.r = resources0.getDimensionPixelSize(dimen.material_time_picker_minimum_screen_width);
        this.s = resources0.getDimensionPixelSize(dimen.material_clock_size);
    }

    @Override  // com.google.android.material.timepicker.RadialViewGroup
    public void E(int v) {
        if(v != this.D()) {
            super.E(v);
            this.h.o(this.D());
        }
    }

    @Override  // com.google.android.material.timepicker.RadialViewGroup
    protected void G() {
        super.G();
        for(int v = 0; v < this.l.size(); ++v) {
            ((TextView)this.l.get(v)).setVisibility(0);
        }
    }

    private void M() {
        RectF rectF0 = this.h.f();
        TextView textView0 = this.P(rectF0);
        for(int v = 0; v < this.l.size(); ++v) {
            TextView textView1 = (TextView)this.l.get(v);
            if(textView1 != null) {
                textView1.setSelected(textView1 == textView0);
                RadialGradient radialGradient0 = this.O(rectF0, textView1);
                textView1.getPaint().setShader(radialGradient0);
                textView1.invalidate();
            }
        }
    }

    int N() {
        return this.h.e();
    }

    @Nullable
    private RadialGradient O(RectF rectF0, TextView textView0) {
        textView0.getHitRect(this.i);
        this.j.set(this.i);
        textView0.getLineBounds(0, this.k);
        this.j.inset(((float)this.k.left), ((float)this.k.top));
        return RectF.intersects(rectF0, this.j) ? new RadialGradient(rectF0.centerX() - this.j.left, rectF0.centerY() - this.j.top, rectF0.width() * 0.5f, this.n, this.o, Shader.TileMode.CLAMP) : null;
    }

    @Nullable
    private TextView P(RectF rectF0) {
        float f = 3.402823E+38f;
        TextView textView0 = null;
        for(int v = 0; v < this.l.size(); ++v) {
            TextView textView1 = (TextView)this.l.get(v);
            if(textView1 != null) {
                textView1.getHitRect(this.i);
                this.j.set(this.i);
                this.j.union(rectF0);
                float f1 = this.j.width() * this.j.height();
                if(f1 < f) {
                    textView0 = textView1;
                    f = f1;
                }
            }
        }
        return textView0;
    }

    private static float Q(float f, float f1, float f2) {
        return Math.max(Math.max(f, f1), f2);
    }

    void R(int v) {
        this.h.p(v);
    }

    private void S(@StringRes int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        int v1 = this.l.size();
        boolean z = false;
        for(int v2 = 0; v2 < Math.max(this.t.length, v1); ++v2) {
            TextView textView0 = (TextView)this.l.get(v2);
            if(v2 >= this.t.length) {
                this.removeView(textView0);
                this.l.remove(v2);
            }
            else {
                if(textView0 == null) {
                    textView0 = (TextView)layoutInflater0.inflate(layout.material_clockface_textview, this, false);
                    this.l.put(v2, textView0);
                    this.addView(textView0);
                }
                textView0.setText(this.t[v2]);
                textView0.setTag(id.material_value_index, v2);
                int v3 = v2 / 12 + 1;
                textView0.setTag(id.material_clock_level, v3);
                if(v3 > 1) {
                    z = true;
                }
                ViewCompat.J1(textView0, this.m);
                textView0.setTextColor(this.v);
                if(v != 0) {
                    textView0.setContentDescription(this.getResources().getString(v, new Object[]{this.t[v2]}));
                }
            }
        }
        this.h.t(z);
    }

    public void f(String[] arr_s, @StringRes int v) {
        this.t = arr_s;
        this.S(v);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$c
    public void k(float f, boolean z) {
        if(Math.abs(this.u - f) > 0.001f) {
            this.u = f;
            this.M();
        }
    }

    public void o(@FloatRange(from = 0.0, to = 360.0) float f) {
        this.h.q(f);
        this.M();
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).m1(CollectionInfoCompat.h(1, this.t.length, false, 1));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.M();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onMeasure(int v, int v1) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v2 = (int)(((float)this.s) / ClockFaceView.Q(((float)this.q) / ((float)displayMetrics0.heightPixels), ((float)this.r) / ((float)displayMetrics0.widthPixels), 1.0f));
        int v3 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        this.setMeasuredDimension(v2, v2);
        super.onMeasure(v3, v3);
    }
}

