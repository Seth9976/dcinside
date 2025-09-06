package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R.color;
import com.google.android.material.ripple.b;
import com.google.android.material.shadow.c;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.ArrayList;

@RequiresApi(21)
class e extends d {
    static class a extends k {
        a(p p0) {
            super(p0);
        }

        @Override  // com.google.android.material.shape.k
        public boolean isStateful() {
            return true;
        }
    }

    @Nullable
    private StateListAnimator c0;

    e(FloatingActionButton floatingActionButton0, c c0) {
        super(floatingActionButton0, c0);
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void B() {
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void D() {
        this.i0();
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void F(int[] arr_v) {
        if(Build.VERSION.SDK_INT == 21) {
            if(this.w.isEnabled()) {
                this.w.setElevation(this.h);
                if(this.w.isPressed()) {
                    this.w.setTranslationZ(this.j);
                    return;
                }
                if(!this.w.isFocused() && !this.w.isHovered()) {
                    this.w.setTranslationZ(0.0f);
                    return;
                }
                this.w.setTranslationZ(this.i);
                return;
            }
            this.w.setElevation(0.0f);
            this.w.setTranslationZ(0.0f);
        }
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void G(float f, float f1, float f2) {
        if(Build.VERSION.SDK_INT == 21) {
            this.w.refreshDrawableState();
        }
        else if(this.w.getStateListAnimator() == this.c0) {
            StateListAnimator stateListAnimator0 = this.m0(f, f1, f2);
            this.c0 = stateListAnimator0;
            this.w.setStateListAnimator(stateListAnimator0);
        }
        if(this.c0()) {
            this.i0();
        }
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    boolean O() {
        return false;
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void Y(@Nullable ColorStateList colorStateList0) {
        Drawable drawable0 = this.c;
        if(drawable0 instanceof RippleDrawable) {
            ((RippleDrawable)drawable0).setColor(b.e(colorStateList0));
            return;
        }
        super.Y(colorStateList0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        return this.x.c() || !this.e0();
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    @NonNull
    k l() {
        return new a(((p)Preconditions.l(this.a)));
    }

    @NonNull
    com.google.android.material.floatingactionbutton.c l0(int v, ColorStateList colorStateList0) {
        Context context0 = this.w.getContext();
        com.google.android.material.floatingactionbutton.c c0 = new com.google.android.material.floatingactionbutton.c(((p)Preconditions.l(this.a)));
        c0.f(ContextCompat.getColor(context0, color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context0, color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context0, color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context0, color.design_fab_stroke_end_outer_color));
        c0.e(((float)v));
        c0.d(colorStateList0);
        return c0;
    }

    @NonNull
    private StateListAnimator m0(float f, float f1, float f2) {
        StateListAnimator stateListAnimator0 = new StateListAnimator();
        Animator animator0 = this.n0(f, f2);
        stateListAnimator0.addState(d.W, animator0);
        Animator animator1 = this.n0(f, f1);
        stateListAnimator0.addState(d.X, animator1);
        Animator animator2 = this.n0(f, f1);
        stateListAnimator0.addState(d.Y, animator2);
        Animator animator3 = this.n0(f, f1);
        stateListAnimator0.addState(d.Z, animator3);
        AnimatorSet animatorSet0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(ObjectAnimator.ofFloat(this.w, "elevation", new float[]{f}).setDuration(0L));
        if(Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
            Property property0 = View.TRANSLATION_Z;
            float[] arr_f = {this.w.getTranslationZ()};
            arrayList0.add(ObjectAnimator.ofFloat(this.w, property0, arr_f).setDuration(100L));
        }
        arrayList0.add(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100L));
        animatorSet0.playSequentially(((Animator[])arrayList0.toArray(new Animator[0])));
        animatorSet0.setInterpolator(d.D);
        stateListAnimator0.addState(d.a0, animatorSet0);
        Animator animator4 = this.n0(0.0f, 0.0f);
        stateListAnimator0.addState(d.b0, animator4);
        return stateListAnimator0;
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.w.getElevation();
    }

    @NonNull
    private Animator n0(float f, float f1) {
        Animator animator0 = new AnimatorSet();
        ((AnimatorSet)animator0).play(ObjectAnimator.ofFloat(this.w, "elevation", new float[]{f}).setDuration(0L)).with(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, new float[]{f1}).setDuration(100L));
        ((AnimatorSet)animator0).setInterpolator(d.D);
        return animator0;
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void s(@NonNull Rect rect0) {
        if(this.x.c()) {
            super.s(rect0);
            return;
        }
        if(!this.e0()) {
            int v = (this.k - this.w.getSizeDimension()) / 2;
            rect0.set(v, v, v, v);
            return;
        }
        rect0.set(0, 0, 0, 0);
    }

    @Override  // com.google.android.material.floatingactionbutton.d
    void y(ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0, ColorStateList colorStateList1, int v) {
        LayerDrawable layerDrawable0;
        k k0 = this.l();
        this.b = k0;
        k0.setTintList(colorStateList0);
        if(porterDuff$Mode0 != null) {
            this.b.setTintMode(porterDuff$Mode0);
        }
        this.b.a0(this.w.getContext());
        if(v > 0) {
            this.d = this.l0(v, colorStateList0);
            layerDrawable0 = new LayerDrawable(new Drawable[]{((Drawable)Preconditions.l(this.d)), ((Drawable)Preconditions.l(this.b))});
        }
        else {
            this.d = null;
            layerDrawable0 = this.b;
        }
        RippleDrawable rippleDrawable0 = new RippleDrawable(b.e(colorStateList1), layerDrawable0, null);
        this.c = rippleDrawable0;
        this.e = rippleDrawable0;
    }
}

