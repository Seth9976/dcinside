package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.Nullable;

class a {
    @Nullable
    private Animator a;

    public void a() {
        Animator animator0 = this.a;
        if(animator0 != null) {
            animator0.cancel();
        }
    }

    public void b() {
        this.a = null;
    }

    public void c(Animator animator0) {
        this.a();
        this.a = animator0;
    }
}

