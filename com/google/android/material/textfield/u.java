package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.animation.b;
import com.google.android.material.animation.c;
import com.google.android.material.motion.j;
import com.google.android.material.resources.d;
import java.util.ArrayList;
import java.util.List;

final class u {
    @Nullable
    private ColorStateList A;
    private Typeface B;
    private static final int C = 0xD9;
    private static final int D = 0xA7;
    static final int E = 0;
    static final int F = 1;
    static final int G = 2;
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;
    private final int a;
    private final int b;
    private final int c;
    @NonNull
    private final TimeInterpolator d;
    @NonNull
    private final TimeInterpolator e;
    @NonNull
    private final TimeInterpolator f;
    private final Context g;
    @NonNull
    private final TextInputLayout h;
    private LinearLayout i;
    private int j;
    private FrameLayout k;
    @Nullable
    private Animator l;
    private final float m;
    private int n;
    private int o;
    @Nullable
    private CharSequence p;
    private boolean q;
    @Nullable
    private TextView r;
    @Nullable
    private CharSequence s;
    private int t;
    private int u;
    @Nullable
    private ColorStateList v;
    private CharSequence w;
    private boolean x;
    @Nullable
    private TextView y;
    private int z;

    public u(@NonNull TextInputLayout textInputLayout0) {
        Context context0 = textInputLayout0.getContext();
        this.g = context0;
        this.h = textInputLayout0;
        this.m = (float)context0.getResources().getDimensionPixelSize(dimen.design_textinput_caption_translate_y);
        this.a = j.f(context0, attr.motionDurationShort4, 0xD9);
        this.b = j.f(context0, attr.motionDurationMedium4, 0xA7);
        this.c = j.f(context0, attr.motionDurationShort4, 0xA7);
        this.d = j.g(context0, attr.motionEasingEmphasizedDecelerateInterpolator, b.d);
        this.e = j.g(context0, attr.motionEasingEmphasizedDecelerateInterpolator, b.a);
        this.f = j.g(context0, attr.motionEasingLinearInterpolator, b.a);
    }

    void A() {
        this.p = null;
        this.h();
        if(this.n == 1) {
            this.o = !this.x || TextUtils.isEmpty(this.w) ? 0 : 2;
        }
        this.X(this.n, this.o, this.U(this.r, ""));
    }

    void B() {
        this.h();
        int v = this.n;
        if(v == 2) {
            this.o = 0;
        }
        this.X(v, this.o, this.U(this.y, ""));
    }

    // 去混淆评级： 低(20)
    private boolean C(int v) {
        return v == 1 && this.r != null && !TextUtils.isEmpty(this.p);
    }

    private boolean D(int v) {
        return v == 2 && this.y != null && !TextUtils.isEmpty(this.w);
    }

    boolean E(int v) {
        return v == 0 || v == 1;
    }

    boolean F() {
        return this.q;
    }

    boolean G() {
        return this.x;
    }

    void H(TextView textView0, int v) {
        if(this.i == null) {
            return;
        }
        if(this.E(v)) {
            FrameLayout frameLayout0 = this.k;
            if(frameLayout0 == null) {
                this.i.removeView(textView0);
            }
            else {
                frameLayout0.removeView(textView0);
            }
        }
        else {
            this.i.removeView(textView0);
        }
        int v1 = this.j - 1;
        this.j = v1;
        this.T(this.i, v1);
    }

    private void I(int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 != 0) {
            TextView textView0 = this.n(v1);
            if(textView0 != null) {
                textView0.setVisibility(0);
                textView0.setAlpha(1.0f);
            }
        }
        if(v != 0) {
            TextView textView1 = this.n(v);
            if(textView1 != null) {
                textView1.setVisibility(4);
                if(v == 1) {
                    textView1.setText(null);
                }
            }
        }
        this.n = v1;
    }

    void J(int v) {
        this.t = v;
        TextView textView0 = this.r;
        if(textView0 != null) {
            ViewCompat.L1(textView0, v);
        }
    }

    void K(@Nullable CharSequence charSequence0) {
        this.s = charSequence0;
        TextView textView0 = this.r;
        if(textView0 != null) {
            textView0.setContentDescription(charSequence0);
        }
    }

    void L(boolean z) {
        if(this.q == z) {
            return;
        }
        this.h();
        if(z) {
            AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.g);
            this.r = appCompatTextView0;
            appCompatTextView0.setId(id.textinput_error);
            this.r.setTextAlignment(5);
            Typeface typeface0 = this.B;
            if(typeface0 != null) {
                this.r.setTypeface(typeface0);
            }
            this.M(this.u);
            this.N(this.v);
            this.K(this.s);
            this.J(this.t);
            this.r.setVisibility(4);
            this.e(this.r, 0);
        }
        else {
            this.A();
            this.H(this.r, 0);
            this.r = null;
            this.h.J0();
            this.h.U0();
        }
        this.q = z;
    }

    void M(@StyleRes int v) {
        this.u = v;
        TextView textView0 = this.r;
        if(textView0 != null) {
            this.h.w0(textView0, v);
        }
    }

    void N(@Nullable ColorStateList colorStateList0) {
        this.v = colorStateList0;
        TextView textView0 = this.r;
        if(textView0 != null && colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    void O(@StyleRes int v) {
        this.z = v;
        TextView textView0 = this.y;
        if(textView0 != null) {
            TextViewCompat.D(textView0, v);
        }
    }

    void P(boolean z) {
        class com.google.android.material.textfield.u.b extends View.AccessibilityDelegate {
            final u a;

            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                EditText editText0 = u.this.h.getEditText();
                if(editText0 != null) {
                    accessibilityNodeInfo0.setLabeledBy(editText0);
                }
            }
        }

        if(this.x == z) {
            return;
        }
        this.h();
        if(z) {
            AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.g);
            this.y = appCompatTextView0;
            appCompatTextView0.setId(id.textinput_helper_text);
            this.y.setTextAlignment(5);
            Typeface typeface0 = this.B;
            if(typeface0 != null) {
                this.y.setTypeface(typeface0);
            }
            this.y.setVisibility(4);
            ViewCompat.L1(this.y, 1);
            this.O(this.z);
            this.Q(this.A);
            this.e(this.y, 1);
            this.y.setAccessibilityDelegate(new com.google.android.material.textfield.u.b(this));
        }
        else {
            this.B();
            this.H(this.y, 1);
            this.y = null;
            this.h.J0();
            this.h.U0();
        }
        this.x = z;
    }

    void Q(@Nullable ColorStateList colorStateList0) {
        this.A = colorStateList0;
        TextView textView0 = this.y;
        if(textView0 != null && colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    private void R(@Nullable TextView textView0, Typeface typeface0) {
        if(textView0 != null) {
            textView0.setTypeface(typeface0);
        }
    }

    void S(Typeface typeface0) {
        if(typeface0 != this.B) {
            this.B = typeface0;
            this.R(this.r, typeface0);
            this.R(this.y, typeface0);
        }
    }

    private void T(@NonNull ViewGroup viewGroup0, int v) {
        if(v == 0) {
            viewGroup0.setVisibility(8);
        }
    }

    // 去混淆评级： 低(40)
    private boolean U(@Nullable TextView textView0, @NonNull CharSequence charSequence0) {
        return ViewCompat.a1(this.h) && this.h.isEnabled() && (this.o != this.n || textView0 == null || !TextUtils.equals(textView0.getText(), charSequence0));
    }

    void V(CharSequence charSequence0) {
        this.h();
        this.p = charSequence0;
        this.r.setText(charSequence0);
        int v = this.n;
        if(v != 1) {
            this.o = 1;
        }
        this.X(v, this.o, this.U(this.r, charSequence0));
    }

    void W(CharSequence charSequence0) {
        this.h();
        this.w = charSequence0;
        this.y.setText(charSequence0);
        int v = this.n;
        if(v != 2) {
            this.o = 2;
        }
        this.X(v, this.o, this.U(this.y, charSequence0));
    }

    private void X(int v, int v1, boolean z) {
        class a extends AnimatorListenerAdapter {
            final int a;
            final TextView b;
            final int c;
            final TextView d;
            final u e;

            a(int v, TextView textView0, int v1, TextView textView1) {
                this.a = v;
                this.b = textView0;
                this.c = v1;
                this.d = textView1;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                u.this.n = this.a;
                u.this.l = null;
                TextView textView0 = this.b;
                if(textView0 != null) {
                    textView0.setVisibility(4);
                    if(this.c == 1 && u.this.r != null) {
                        u.this.r.setText(null);
                    }
                }
                TextView textView1 = this.d;
                if(textView1 != null) {
                    textView1.setTranslationY(0.0f);
                    this.d.setAlpha(1.0f);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                TextView textView0 = this.d;
                if(textView0 != null) {
                    textView0.setVisibility(0);
                    this.d.setAlpha(0.0f);
                }
            }
        }

        if(v == v1) {
            return;
        }
        if(z) {
            AnimatorSet animatorSet0 = new AnimatorSet();
            this.l = animatorSet0;
            ArrayList arrayList0 = new ArrayList();
            this.i(arrayList0, this.x, this.y, 2, v, v1);
            this.i(arrayList0, this.q, this.r, 1, v, v1);
            c.a(animatorSet0, arrayList0);
            animatorSet0.addListener(new a(this, v1, this.n(v), v, this.n(v1)));
            animatorSet0.start();
        }
        else {
            this.I(v, v1);
        }
        this.h.J0();
        this.h.O0(z);
        this.h.U0();
    }

    void e(TextView textView0, int v) {
        if(this.i == null && this.k == null) {
            LinearLayout linearLayout0 = new LinearLayout(this.g);
            this.i = linearLayout0;
            linearLayout0.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.i.addView(this.k, linearLayout$LayoutParams0);
            if(this.h.getEditText() != null) {
                this.f();
            }
        }
        if(this.E(v)) {
            this.k.setVisibility(0);
            this.k.addView(textView0);
        }
        else {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
            this.i.addView(textView0, linearLayout$LayoutParams1);
        }
        this.i.setVisibility(0);
        ++this.j;
    }

    void f() {
        if(this.g()) {
            EditText editText0 = this.h.getEditText();
            boolean z = d.j(this.g);
            LinearLayout linearLayout0 = this.i;
            int v = ViewCompat.p0(editText0);
            int v1 = this.x(z, dimen.material_helper_text_font_1_3_padding_horizontal, v);
            int v2 = this.g.getResources().getDimensionPixelSize(dimen.material_helper_text_default_padding_top);
            int v3 = this.x(z, dimen.material_helper_text_font_1_3_padding_top, v2);
            int v4 = ViewCompat.o0(editText0);
            ViewCompat.p2(linearLayout0, v1, v3, this.x(z, dimen.material_helper_text_font_1_3_padding_horizontal, v4), 0);
        }
    }

    private boolean g() {
        return this.i != null && this.h.getEditText() != null;
    }

    void h() {
        Animator animator0 = this.l;
        if(animator0 != null) {
            animator0.cancel();
        }
    }

    private void i(@NonNull List list0, boolean z, @Nullable TextView textView0, int v, int v1, int v2) {
        if(textView0 != null && z && (v == v2 || v == v1)) {
            ObjectAnimator objectAnimator0 = this.j(textView0, v2 == v);
            if(v == v2 && v1 != 0) {
                objectAnimator0.setStartDelay(((long)this.c));
            }
            list0.add(objectAnimator0);
            if(v2 == v && v1 != 0) {
                ObjectAnimator objectAnimator1 = this.k(textView0);
                objectAnimator1.setStartDelay(((long)this.c));
                list0.add(objectAnimator1);
            }
        }
    }

    private ObjectAnimator j(TextView textView0, boolean z) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(textView0, View.ALPHA, new float[]{(z ? 1.0f : 0.0f)});
        objectAnimator0.setDuration(((long)(z ? this.b : this.c)));
        objectAnimator0.setInterpolator((z ? this.e : this.f));
        return objectAnimator0;
    }

    private ObjectAnimator k(TextView textView0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(textView0, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
        objectAnimator0.setDuration(((long)this.a));
        objectAnimator0.setInterpolator(this.d);
        return objectAnimator0;
    }

    boolean l() {
        return this.C(this.n);
    }

    boolean m() {
        return this.C(this.o);
    }

    @Nullable
    private TextView n(int v) {
        switch(v) {
            case 1: {
                return this.r;
            }
            case 2: {
                return this.y;
            }
            default: {
                return null;
            }
        }
    }

    int o() {
        return this.t;
    }

    @Nullable
    CharSequence p() {
        return this.s;
    }

    @Nullable
    CharSequence q() {
        return this.p;
    }

    @ColorInt
    int r() {
        return this.r == null ? -1 : this.r.getCurrentTextColor();
    }

    @Nullable
    ColorStateList s() {
        return this.r == null ? null : this.r.getTextColors();
    }

    CharSequence t() {
        return this.w;
    }

    @Nullable
    View u() {
        return this.y;
    }

    @Nullable
    ColorStateList v() {
        return this.y == null ? null : this.y.getTextColors();
    }

    @ColorInt
    int w() {
        return this.y == null ? -1 : this.y.getCurrentTextColor();
    }

    // 去混淆评级： 低(20)
    private int x(boolean z, @DimenRes int v, int v1) {
        return z ? this.g.getResources().getDimensionPixelSize(v) : v1;
    }

    boolean y() {
        return this.D(this.n);
    }

    boolean z() {
        return this.D(this.o);
    }
}

