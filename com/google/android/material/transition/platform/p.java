package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.attr;

@RequiresApi(21)
public final class p extends r {
    private static final float d = 0.92f;
    @AttrRes
    private static final int e;
    @AttrRes
    private static final int f;

    static {
        p.e = attr.motionDurationLong1;
        p.f = attr.motionEasingEmphasizedInterpolator;
    }

    public p() {
        super(p.n(), p.o());
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
    @AttrRes
    int f(boolean z) {
        return p.e;
    }

    @Override  // com.google.android.material.transition.platform.r
    @AttrRes
    int g(boolean z) {
        return p.f;
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

    private static e n() {
        return new e();
    }

    private static x o() {
        x x0 = new s();
        ((s)x0).o(false);
        ((s)x0).l(0.92f);
        return x0;
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onAppear(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onDisappear(viewGroup0, view0, transitionValues0, transitionValues1);
    }
}

