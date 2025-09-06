package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;

public final class o extends q {
    private static final float e9 = 0.92f;
    @AttrRes
    private static final int f9;
    @AttrRes
    private static final int g9;

    static {
        o.f9 = attr.motionDurationLong1;
        o.g9 = attr.motionEasingEmphasizedInterpolator;
    }

    public o() {
        super(o.g1(), o.h1());
    }

    @Override  // com.google.android.material.transition.q
    public Animator P0(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.P0(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    @Override  // com.google.android.material.transition.q
    public Animator R0(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.R0(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    @Override  // com.google.android.material.transition.q
    public void U0(@NonNull w w0) {
        super.U0(w0);
    }

    @Override  // com.google.android.material.transition.q
    public void W0() {
        super.W0();
    }

    @Override  // com.google.android.material.transition.q
    @AttrRes
    int Z0(boolean z) {
        return o.f9;
    }

    @Override  // com.google.android.material.transition.q
    @AttrRes
    int a1(boolean z) {
        return o.g9;
    }

    @Override  // com.google.android.material.transition.q
    @NonNull
    public w b1() {
        return super.b1();
    }

    @Override  // com.google.android.material.transition.q
    public boolean c0() {
        return super.c0();
    }

    @Override  // com.google.android.material.transition.q
    @Nullable
    public w c1() {
        return super.c1();
    }

    @Override  // com.google.android.material.transition.q
    public boolean e1(@NonNull w w0) {
        return super.e1(w0);
    }

    @Override  // com.google.android.material.transition.q
    public void f1(@Nullable w w0) {
        super.f1(w0);
    }

    private static e g1() {
        return new e();
    }

    private static w h1() {
        w w0 = new r();
        ((r)w0).o(false);
        ((r)w0).l(0.92f);
        return w0;
    }
}

