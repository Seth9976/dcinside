package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class p extends q {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private final int e9;
    private final boolean f9;
    public static final int g9 = 0;
    public static final int h9 = 1;
    public static final int i9 = 2;
    @AttrRes
    private static final int j9;
    @AttrRes
    private static final int k9;

    static {
        p.j9 = attr.motionDurationLong1;
        p.k9 = attr.motionEasingEmphasizedInterpolator;
    }

    public p(int v, boolean z) {
        super(p.g1(v, z), p.h1());
        this.e9 = v;
        this.f9 = z;
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
        return p.j9;
    }

    @Override  // com.google.android.material.transition.q
    @AttrRes
    int a1(boolean z) {
        return p.k9;
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

    private static w g1(int v, boolean z) {
        switch(v) {
            case 0: {
                return z ? new s(0x800005) : new s(0x800003);
            }
            case 1: {
                return z ? new s(80) : new s(0x30);
            }
            case 2: {
                return new r(z);
            }
            default: {
                throw new IllegalArgumentException("Invalid axis: " + v);
            }
        }
    }

    private static w h1() {
        return new e();
    }

    public int i1() {
        return this.e9;
    }

    public boolean j1() {
        return this.f9;
    }
}

