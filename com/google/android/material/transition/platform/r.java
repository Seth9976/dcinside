package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.b;
import com.google.android.material.animation.c;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
abstract class r extends Visibility {
    private final x a;
    @Nullable
    private x b;
    private final List c;

    protected r(x x0, @Nullable x x1) {
        this.c = new ArrayList();
        this.a = x0;
        this.b = x1;
    }

    public void a(@NonNull x x0) {
        this.c.add(x0);
    }

    private static void b(List list0, @Nullable x x0, ViewGroup viewGroup0, View view0, boolean z) {
        if(x0 == null) {
            return;
        }
        Animator animator0 = z ? x0.b(viewGroup0, view0) : x0.a(viewGroup0, view0);
        if(animator0 != null) {
            list0.add(animator0);
        }
    }

    public void c() {
        this.c.clear();
    }

    private Animator d(@NonNull ViewGroup viewGroup0, @NonNull View view0, boolean z) {
        Animator animator0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        r.b(arrayList0, this.a, viewGroup0, view0, z);
        r.b(arrayList0, this.b, viewGroup0, view0, z);
        for(Object object0: this.c) {
            r.b(arrayList0, ((x)object0), viewGroup0, view0, z);
        }
        this.k(viewGroup0.getContext(), z);
        c.a(((AnimatorSet)animator0), arrayList0);
        return animator0;
    }

    @NonNull
    TimeInterpolator e(boolean z) {
        return b.b;
    }

    @AttrRes
    int f(boolean z) {
        return 0;
    }

    @AttrRes
    int g(boolean z) {
        return 0;
    }

    @NonNull
    public x h() {
        return this.a;
    }

    @Nullable
    public x j() {
        return this.b;
    }

    private void k(@NonNull Context context0, boolean z) {
        w.s(this, context0, this.f(z));
        TimeInterpolator timeInterpolator0 = this.e(z);
        w.t(this, context0, this.g(z), timeInterpolator0);
    }

    public boolean l(@NonNull x x0) {
        return this.c.remove(x0);
    }

    public void m(@Nullable x x0) {
        this.b = x0;
    }

    @Override  // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.d(viewGroup0, view0, true);
    }

    @Override  // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        return this.d(viewGroup0, view0, false);
    }
}

