package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.attr;
import com.google.android.material.animation.b;

@RequiresApi(21)
public final class o extends r {
    private static final float d = 0.8f;
    private static final float e = 0.3f;
    @AttrRes
    private static final int f;
    @AttrRes
    private static final int g;
    @AttrRes
    private static final int h;
    @AttrRes
    private static final int i;

    static {
        o.f = attr.motionDurationMedium4;
        o.g = attr.motionDurationShort3;
        o.h = attr.motionEasingEmphasizedDecelerateInterpolator;
        o.i = attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public o() {
        super(o.n(), o.o());
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
    TimeInterpolator e(boolean z) {
        return b.a;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.r
    @AttrRes
    int f(boolean z) {
        return z ? o.f : o.g;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.r
    @AttrRes
    int g(boolean z) {
        return z ? o.h : o.i;
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

    private static d n() {
        d d0 = new d();
        d0.e(0.3f);
        return d0;
    }

    private static x o() {
        x x0 = new s();
        ((s)x0).o(false);
        ((s)x0).l(0.8f);
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

