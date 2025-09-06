package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.b;
import com.google.android.material.animation.c;
import java.util.ArrayList;
import java.util.List;

abstract class q extends Visibility {
    private final w b9;
    @Nullable
    private w c9;
    private final List d9;

    protected q(w w0, @Nullable w w1) {
        this.d9 = new ArrayList();
        this.b9 = w0;
        this.c9 = w1;
    }

    @Override  // androidx.transition.Visibility
    public Animator P0(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.X0(viewGroup0, view0, true);
    }

    @Override  // androidx.transition.Visibility
    public Animator R0(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.X0(viewGroup0, view0, false);
    }

    public void U0(@NonNull w w0) {
        this.d9.add(w0);
    }

    private static void V0(List list0, @Nullable w w0, ViewGroup viewGroup0, View view0, boolean z) {
        if(w0 == null) {
            return;
        }
        Animator animator0 = z ? w0.b(viewGroup0, view0) : w0.a(viewGroup0, view0);
        if(animator0 != null) {
            list0.add(animator0);
        }
    }

    public void W0() {
        this.d9.clear();
    }

    private Animator X0(@NonNull ViewGroup viewGroup0, @NonNull View view0, boolean z) {
        Animator animator0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        q.V0(arrayList0, this.b9, viewGroup0, view0, z);
        q.V0(arrayList0, this.c9, viewGroup0, view0, z);
        for(Object object0: this.d9) {
            q.V0(arrayList0, ((w)object0), viewGroup0, view0, z);
        }
        this.d1(viewGroup0.getContext(), z);
        c.a(((AnimatorSet)animator0), arrayList0);
        return animator0;
    }

    @NonNull
    TimeInterpolator Y0(boolean z) {
        return b.b;
    }

    @AttrRes
    int Z0(boolean z) {
        return 0;
    }

    @AttrRes
    int a1(boolean z) {
        return 0;
    }

    @NonNull
    public w b1() {
        return this.b9;
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Nullable
    public w c1() {
        return this.c9;
    }

    private void d1(@NonNull Context context0, boolean z) {
        v.s(this, context0, this.Z0(z));
        TimeInterpolator timeInterpolator0 = this.Y0(z);
        v.t(this, context0, this.a1(z), timeInterpolator0);
    }

    public boolean e1(@NonNull w w0) {
        return this.d9.remove(w0);
    }

    public void f1(@Nullable w w0) {
        this.c9 = w0;
    }
}

