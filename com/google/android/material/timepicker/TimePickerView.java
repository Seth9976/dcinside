package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;

class TimePickerView extends ConstraintLayout implements j {
    class a implements View.OnClickListener {
        final TimePickerView a;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            if(TimePickerView.this.h != null) {
                TimePickerView.this.h.d(((int)(((Integer)view0.getTag(id.selection_type)))));
            }
        }
    }

    interface d {
        void k();
    }

    interface e {
        void c(int arg1);
    }

    interface f {
        void d(int arg1);
    }

    private final Chip a;
    private final Chip b;
    private final ClockHandView c;
    private final ClockFaceView d;
    private final MaterialButtonToggleGroup e;
    private final View.OnClickListener f;
    private e g;
    private f h;
    private d i;
    static final String j = "android.view.View";

    public TimePickerView(Context context0) {
        this(context0, null);
    }

    public TimePickerView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TimePickerView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new a(this);
        LayoutInflater.from(context0).inflate(layout.material_timepicker, this);
        this.d = (ClockFaceView)this.findViewById(id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.findViewById(id.material_clock_period_toggle);
        this.e = materialButtonToggleGroup0;
        materialButtonToggleGroup0.b((MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) -> {
            if(!z) {
                return;
            }
            e timePickerView$e0 = this.g;
            if(timePickerView$e0 != null) {
                timePickerView$e0.c((v == id.material_clock_period_pm_button ? 1 : 0));
            }
        });
        this.a = (Chip)this.findViewById(id.material_minute_tv);
        this.b = (Chip)this.findViewById(id.material_hour_tv);
        this.c = (ClockHandView)this.findViewById(id.material_clock_hand);
        this.Q();
        this.P();
    }

    public void D(c clockHandView$c0) {
        this.c.b(clockHandView$c0);
    }

    int E() {
        return this.d.N();
    }

    // 检测为 Lambda 实现
    private void F(MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) [...]

    public void G(boolean z) {
        this.c.n(z);
    }

    void H(int v) {
        this.d.R(v);
    }

    public void I(float f, boolean z) {
        this.c.r(f, z);
    }

    public void J(AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        ViewCompat.J1(this.a, accessibilityDelegateCompat0);
    }

    public void K(AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        ViewCompat.J1(this.b, accessibilityDelegateCompat0);
    }

    public void L(b clockHandView$b0) {
        this.c.u(clockHandView$b0);
    }

    void M(@Nullable d timePickerView$d0) {
        this.i = timePickerView$d0;
    }

    void N(e timePickerView$e0) {
        this.g = timePickerView$e0;
    }

    void O(f timePickerView$f0) {
        this.h = timePickerView$f0;
    }

    private void P() {
        this.a.setTag(id.selection_type, 12);
        this.b.setTag(id.selection_type, 10);
        this.a.setOnClickListener(this.f);
        this.b.setOnClickListener(this.f);
        this.a.setAccessibilityClassName("android.view.View");
        this.b.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Q() {
        class com.google.android.material.timepicker.TimePickerView.b extends GestureDetector.SimpleOnGestureListener {
            final TimePickerView a;

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onDoubleTap(MotionEvent motionEvent0) {
                d timePickerView$d0 = TimePickerView.this.i;
                if(timePickerView$d0 != null) {
                    timePickerView$d0.k();
                    return true;
                }
                return false;
            }
        }


        class com.google.android.material.timepicker.TimePickerView.c implements View.OnTouchListener {
            final GestureDetector a;
            final TimePickerView b;

            com.google.android.material.timepicker.TimePickerView.c(GestureDetector gestureDetector0) {
                this.a = gestureDetector0;
                super();
            }

            // 去混淆评级： 低(20)
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return ((Checkable)view0).isChecked() ? this.a.onTouchEvent(motionEvent0) : false;
            }
        }

        com.google.android.material.timepicker.TimePickerView.c timePickerView$c0 = new com.google.android.material.timepicker.TimePickerView.c(this, new GestureDetector(this.getContext(), new com.google.android.material.timepicker.TimePickerView.b(this)));
        this.a.setOnTouchListener(timePickerView$c0);
        this.b.setOnTouchListener(timePickerView$c0);
    }

    public void R() {
        this.e.setVisibility(0);
    }

    private void S(Chip chip0, boolean z) {
        chip0.setChecked(z);
        ViewCompat.L1(chip0, (z ? 2 : 0));
    }

    @Override  // com.google.android.material.timepicker.j
    public void d(int v) {
        boolean z = false;
        this.S(this.a, v == 12);
        Chip chip0 = this.b;
        if(v == 10) {
            z = true;
        }
        this.S(chip0, z);
    }

    @Override  // com.google.android.material.timepicker.j
    @SuppressLint({"DefaultLocale"})
    public void e(int v, int v1, int v2) {
        this.e.e((v == 1 ? id.material_clock_period_pm_button : id.material_clock_period_am_button));
        Locale locale0 = this.getResources().getConfiguration().locale;
        String s = String.format(locale0, "%02d", v2);
        String s1 = String.format(locale0, "%02d", v1);
        if(!TextUtils.equals(this.a.getText(), s)) {
            this.a.setText(s);
        }
        if(!TextUtils.equals(this.b.getText(), s1)) {
            this.b.setText(s1);
        }
    }

    @Override  // com.google.android.material.timepicker.j
    public void f(String[] arr_s, @StringRes int v) {
        this.d.f(arr_s, v);
    }

    @Override  // com.google.android.material.timepicker.j
    public void o(float f) {
        this.c.q(f);
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(view0 == this && v == 0) {
            this.b.sendAccessibilityEvent(8);
        }
    }
}

