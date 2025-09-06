package com.dcinside.app.util;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;

public final class nl implements Animator.AnimatorListener {
    public interface a {
        void a(Animator arg1);
    }

    private a a;
    private a b;
    private a c;
    private a d;

    public nl(a nl$a0, a nl$a1, a nl$a2, a nl$a3) {
        this.a = nl$a0;
        this.b = nl$a1;
        this.c = nl$a2;
        this.d = nl$a3;
    }

    public static nl a(a nl$a0) {
        return new nl(null, null, nl$a0, null);
    }

    public static nl b(a nl$a0) {
        return new nl(null, nl$a0, null, null);
    }

    public static nl c(a nl$a0) {
        return new nl(null, null, null, nl$a0);
    }

    public static nl d(a nl$a0) {
        return new nl(nl$a0, null, null, null);
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationCancel(Animator animator0) {
        a nl$a0 = this.c;
        if(nl$a0 != null) {
            nl$a0.a(animator0);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationEnd(Animator animator0) {
        a nl$a0 = this.b;
        if(nl$a0 != null) {
            nl$a0.a(animator0);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationRepeat(Animator animator0) {
        a nl$a0 = this.d;
        if(nl$a0 != null) {
            nl$a0.a(animator0);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationStart(Animator animator0) {
        a nl$a0 = this.a;
        if(nl$a0 != null) {
            nl$a0.a(animator0);
        }
    }
}

