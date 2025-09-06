package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class n extends r {
    private final boolean d;
    private static final float e = 0.85f;

    public n(boolean z) {
        super(n.n(z), n.o());
        this.d = z;
    }

    @Override  // com.google.android.material.transition.platform.r
    public void a(@NonNull x x0) {
        super.a(x0);
    }

    @Override  // com.google.android.material.transition.platform.r
    public void c() {
        super.c();
    }

    @Override  // com.google.android.material.transition.platform.r
    @NonNull
    public x h() {
        return super.h();
    }

    @Override  // com.google.android.material.transition.platform.r
    @Nullable
    public x j() {
        return super.j();
    }

    @Override  // com.google.android.material.transition.platform.r
    public boolean l(@NonNull x x0) {
        return super.l(x0);
    }

    @Override  // com.google.android.material.transition.platform.r
    public void m(@Nullable x x0) {
        super.m(x0);
    }

    private static s n(boolean z) {
        s s0 = new s(z);
        s0.m(0.85f);
        s0.l(0.85f);
        return s0;
    }

    private static x o() {
        return new d();
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onAppear(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onDisappear(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    public boolean p() {
        return this.d;
    }
}

