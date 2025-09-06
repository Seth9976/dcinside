package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;

public final class m extends q {
    private final boolean e9;
    private static final float f9 = 0.85f;

    public m(boolean z) {
        super(m.g1(z), m.h1());
        this.e9 = z;
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

    private static r g1(boolean z) {
        r r0 = new r(z);
        r0.m(0.85f);
        r0.l(0.85f);
        return r0;
    }

    private static w h1() {
        return new d();
    }

    public boolean i1() {
        return this.e9;
    }
}

