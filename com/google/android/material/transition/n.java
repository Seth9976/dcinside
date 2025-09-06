package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import com.google.android.material.animation.b;

public final class n extends q {
    private static final float e9 = 0.8f;
    private static final float f9 = 0.3f;
    @AttrRes
    private static final int g9;
    @AttrRes
    private static final int h9;
    @AttrRes
    private static final int i9;
    @AttrRes
    private static final int j9;

    static {
        n.g9 = attr.motionDurationMedium4;
        n.h9 = attr.motionDurationShort3;
        n.i9 = attr.motionEasingEmphasizedDecelerateInterpolator;
        n.j9 = attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public n() {
        super(n.g1(), n.h1());
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
    TimeInterpolator Y0(boolean z) {
        return b.a;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.q
    @AttrRes
    int Z0(boolean z) {
        return z ? n.g9 : n.h9;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.q
    @AttrRes
    int a1(boolean z) {
        return z ? n.i9 : n.j9;
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

    private static d g1() {
        d d0 = new d();
        d0.e(0.3f);
        return d0;
    }

    private static w h1() {
        w w0 = new r();
        ((r)w0).o(false);
        ((r)w0).l(0.8f);
        return w0;
    }
}

