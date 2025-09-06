package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;

public final class i extends Visibility {
    @Override  // androidx.transition.Visibility
    @NonNull
    public Animator P0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @Override  // androidx.transition.Visibility
    @NonNull
    public Animator R0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}

