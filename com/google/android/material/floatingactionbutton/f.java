package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.i;
import java.util.List;

interface f {
    void a();

    i b();

    @Nullable
    i c();

    boolean d();

    void e(@NonNull Animator.AnimatorListener arg1);

    @AnimatorRes
    int f();

    AnimatorSet g();

    List getListeners();

    void h(@Nullable l arg1);

    void i();

    void j();

    void k(@NonNull Animator.AnimatorListener arg1);

    void l(@Nullable i arg1);

    void onAnimationStart(Animator arg1);
}

