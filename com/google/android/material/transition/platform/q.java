package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class q extends r {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private final int d;
    private final boolean e;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    @AttrRes
    private static final int i;
    @AttrRes
    private static final int j;

    static {
        q.i = attr.motionDurationLong1;
        q.j = attr.motionEasingEmphasizedInterpolator;
    }

    public q(int v, boolean z) {
        super(q.n(v, z), q.o());
        this.d = v;
        this.e = z;
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
        return q.i;
    }

    @Override  // com.google.android.material.transition.platform.r
    @AttrRes
    int g(boolean z) {
        return q.j;
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

    private static x n(int v, boolean z) {
        switch(v) {
            case 0: {
                return z ? new t(0x800005) : new t(0x800003);
            }
            case 1: {
                return z ? new t(80) : new t(0x30);
            }
            case 2: {
                return new s(z);
            }
            default: {
                throw new IllegalArgumentException("Invalid axis: " + v);
            }
        }
    }

    private static x o() {
        return new e();
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onAppear(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    @Override  // com.google.android.material.transition.platform.r
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return super.onDisappear(viewGroup0, view0, transitionValues0, transitionValues1);
    }

    public int p() {
        return this.d;
    }

    public boolean q() {
        return this.e;
    }
}

