package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @Nullable
    private AnimatorSet e;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    protected boolean R(View view0, View view1, boolean z, boolean z1) {
        class a extends AnimatorListenerAdapter {
            final ExpandableTransformationBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                ExpandableTransformationBehavior.this.e = null;
            }
        }

        AnimatorSet animatorSet0 = this.e;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        AnimatorSet animatorSet1 = this.T(view0, view1, z, animatorSet0 != null);
        this.e = animatorSet1;
        animatorSet1.addListener(new a(this));
        this.e.start();
        if(!z1) {
            this.e.end();
        }
        return true;
    }

    @NonNull
    protected abstract AnimatorSet T(View arg1, View arg2, boolean arg3, boolean arg4);
}

