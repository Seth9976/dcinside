package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;
import com.google.android.material.animation.b;
import com.google.android.material.motion.j;

class f extends s {
    private final int e;
    private final int f;
    @NonNull
    private final TimeInterpolator g;
    @NonNull
    private final TimeInterpolator h;
    @Nullable
    private EditText i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;
    private static final int n = 100;
    private static final int o = 150;
    private static final float p = 0.8f;

    f(@NonNull r r0) {
        super(r0);
        this.j = (View view0) -> {
            EditText editText0 = this.i;
            if(editText0 == null) {
                return;
            }
            Editable editable0 = editText0.getText();
            if(editable0 != null) {
                editable0.clear();
            }
            this.r();
        };
        this.k = (View view0, boolean z) -> this.A(this.J());
        this.e = j.f(r0.getContext(), attr.motionDurationShort3, 100);
        this.f = j.f(r0.getContext(), attr.motionDurationShort3, 150);
        this.g = j.g(r0.getContext(), attr.motionEasingLinearInterpolator, b.a);
        this.h = j.g(r0.getContext(), attr.motionEasingEmphasizedInterpolator, b.d);
    }

    private void A(boolean z) {
        boolean z1 = this.b.I() == z;
        if(z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if(z1) {
                this.l.end();
            }
        }
        else if(!z) {
            this.l.cancel();
            this.m.start();
            if(z1) {
                this.m.end();
            }
        }
    }

    private ValueAnimator B(float[] arr_f) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.g);
        valueAnimator0.setDuration(((long)this.e));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.d.setAlpha(f);
        });
        return valueAnimator0;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        valueAnimator0.setInterpolator(this.h);
        valueAnimator0.setDuration(((long)this.f));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.d.setScaleX(f);
            this.d.setScaleY(f);
        });
        return valueAnimator0;
    }

    private void D() {
        class a extends AnimatorListenerAdapter {
            final f a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                f.this.b.f0(true);
            }
        }


        class com.google.android.material.textfield.f.b extends AnimatorListenerAdapter {
            final f a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                f.this.b.f0(false);
            }
        }

        ValueAnimator valueAnimator0 = this.C();
        ValueAnimator valueAnimator1 = this.B(new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.l = animatorSet0;
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        this.l.addListener(new a(this));
        ValueAnimator valueAnimator2 = this.B(new float[]{1.0f, 0.0f});
        this.m = valueAnimator2;
        valueAnimator2.addListener(new com.google.android.material.textfield.f.b(this));
    }

    // 检测为 Lambda 实现
    private void E(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void F(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void G(View view0) [...]

    // 检测为 Lambda 实现
    private void H(View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private void I() [...]

    // 去混淆评级： 低(20)
    private boolean J() {
        return this.i != null && (this.i.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }

    @Override  // com.google.android.material.textfield.s
    void a(@NonNull Editable editable0) {
        if(this.b.y() != null) {
            return;
        }
        this.A(this.J());
    }

    @Override  // com.google.android.material.textfield.s
    int c() {
        return string.clear_text_end_icon_content_description;
    }

    @Override  // com.google.android.material.textfield.s
    int d() {
        return drawable.mtrl_ic_cancel;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.j;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override  // com.google.android.material.textfield.s
    public void n(@Nullable EditText editText0) {
        this.i = editText0;
        boolean z = this.J();
        this.a.setEndIconVisible(z);
    }

    @Override  // com.google.android.material.textfield.s
    void q(boolean z) {
        if(this.b.y() == null) {
            return;
        }
        this.A(z);
    }

    @Override  // com.google.android.material.textfield.s
    void s() {
        this.D();
    }

    @Override  // com.google.android.material.textfield.s
    void u() {
        EditText editText0 = this.i;
        if(editText0 != null) {
            editText0.post(() -> this.A(true));
        }
    }
}

