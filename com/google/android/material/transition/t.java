package com.google.android.material.transition;

import androidx.transition.Transition.TransitionListener;
import androidx.transition.Transition;
import androidx.transition.e;

abstract class t implements TransitionListener {
    @Override  // androidx.transition.Transition$TransitionListener
    public void a(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void k(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void l(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void n(Transition transition0, boolean z) {
        e.a(this, transition0, z);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void p(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void r(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public void s(Transition transition0, boolean z) {
        e.b(this, transition0, z);
    }
}

