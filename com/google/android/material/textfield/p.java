package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;
import com.google.android.material.animation.b;
import com.google.android.material.motion.j;

class p extends s {
    private final int e;
    private final int f;
    @NonNull
    private final TimeInterpolator g;
    @Nullable
    private AutoCompleteTextView h;
    private final View.OnClickListener i;
    private final View.OnFocusChangeListener j;
    private final TouchExplorationStateChangeListener k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    @Nullable
    private AccessibilityManager p;
    private ValueAnimator q;
    private ValueAnimator r;
    @ChecksSdkIntAtLeast(api = 21)
    private static final boolean s = false;
    private static final int t = 50;
    private static final int u = 67;

    static {
        p.s = true;
    }

    p(@NonNull r r0) {
        super(r0);
        this.i = (View view0) -> this.Q();
        this.j = (View view0, boolean z) -> {
            this.l = z;
            this.r();
            if(!z) {
                this.O(false);
                this.m = false;
            }
        };
        this.k = (boolean z) -> if(this.h != null && !q.a(this.h)) {
            ViewCompat.b2(this.d, (z ? 2 : 1));
        };
        this.o = 0x7FFFFFFFFFFFFFFFL;
        this.f = j.f(r0.getContext(), attr.motionDurationShort3, 67);
        this.e = j.f(r0.getContext(), attr.motionDurationShort3, 50);
        this.g = j.g(r0.getContext(), attr.motionEasingLinearInterpolator, b.a);
    }

    @NonNull
    private static AutoCompleteTextView D(EditText editText0) {
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView)editText0;
    }

    private ValueAnimator E(int v, float[] arr_f) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.g);
        valueAnimator0.setDuration(((long)v));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.d.setAlpha(f);
        });
        return valueAnimator0;
    }

    private void F() {
        class a extends AnimatorListenerAdapter {
            final p a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                p.this.r();
                p.this.r.start();
            }
        }

        this.r = this.E(this.f, new float[]{0.0f, 1.0f});
        ValueAnimator valueAnimator0 = this.E(this.e, new float[]{1.0f, 0.0f});
        this.q = valueAnimator0;
        valueAnimator0.addListener(new a(this));
    }

    private boolean G() {
        long v = System.currentTimeMillis() - this.o;
        return v < 0L || v > 300L;
    }

    // 检测为 Lambda 实现
    private void H() [...]

    // 检测为 Lambda 实现
    private void I(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void J(View view0) [...]

    // 检测为 Lambda 实现
    private void K(View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private void L(boolean z) [...]

    // 检测为 Lambda 实现
    private boolean M(View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private void N() [...]

    private void O(boolean z) {
        if(this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        this.h.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            if(motionEvent0.getAction() == 1) {
                if(this.G()) {
                    this.m = false;
                }
                this.Q();
                this.R();
            }
            return false;
        });
        if(p.s) {
            this.h.setOnDismissListener(() -> {
                this.R();
                this.O(false);
            });
        }
        this.h.setThreshold(0);
    }

    private void Q() {
        if(this.h == null) {
            return;
        }
        if(this.G()) {
            this.m = false;
        }
        if(!this.m) {
            if(p.s) {
                this.O(!this.n);
            }
            else {
                this.n = !this.n;
                this.r();
            }
            if(this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            }
            this.h.dismissDropDown();
            return;
        }
        this.m = false;
    }

    private void R() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override  // com.google.android.material.textfield.s
    public void a(Editable editable0) {
        if(this.p.isTouchExplorationEnabled() && q.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(() -> {
            boolean z = this.h.isPopupShowing();
            this.O(z);
            this.m = z;
        });
    }

    @Override  // com.google.android.material.textfield.s
    int c() {
        return string.exposed_dropdown_menu_content_description;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.textfield.s
    int d() {
        return p.s ? drawable.mtrl_dropdown_arrow : drawable.mtrl_ic_arrow_drop_down;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.i;
    }

    @Override  // com.google.android.material.textfield.s
    public TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.s
    boolean i(int v) {
        return v != 0;
    }

    @Override  // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override  // com.google.android.material.textfield.s
    boolean k() {
        return this.l;
    }

    @Override  // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override  // com.google.android.material.textfield.s
    boolean m() {
        return this.n;
    }

    @Override  // com.google.android.material.textfield.s
    public void n(@Nullable EditText editText0) {
        this.h = p.D(editText0);
        this.P();
        this.a.setErrorIconDrawable(null);
        if(!q.a(editText0) && this.p.isTouchExplorationEnabled()) {
            ViewCompat.b2(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override  // com.google.android.material.textfield.s
    public void o(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(!q.a(this.h)) {
            accessibilityNodeInfoCompat0.k1("android.widget.Spinner");
        }
        if(accessibilityNodeInfoCompat0.K0()) {
            accessibilityNodeInfoCompat0.C1(null);
        }
    }

    @Override  // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
        boolean z;
        if(this.p.isEnabled() && !q.a(this.h)) {
            switch(accessibilityEvent0.getEventType()) {
                case 8: 
                case 0x8000: {
                    z = this.n && !this.h.isPopupShowing();
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(accessibilityEvent0.getEventType() == 1 || z) {
                this.Q();
                this.R();
            }
        }
    }

    @Override  // com.google.android.material.textfield.s
    void s() {
        this.F();
        this.p = (AccessibilityManager)this.c.getSystemService("accessibility");
    }

    @Override  // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override  // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView0 = this.h;
        if(autoCompleteTextView0 != null) {
            autoCompleteTextView0.setOnTouchListener(null);
            if(p.s) {
                this.h.setOnDismissListener(null);
            }
        }
    }
}

