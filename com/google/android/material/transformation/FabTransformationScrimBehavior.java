package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.c;
import com.google.android.material.animation.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final j f;
    private final j g;
    public static final long h = 75L;
    public static final long i = 150L;
    public static final long j = 0L;
    public static final long k = 150L;

    public FabTransformationScrimBehavior() {
        this.f = new j(75L, 150L);
        this.g = new j(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new j(75L, 150L);
        this.g = new j(0L, 150L);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        return super.L(coordinatorLayout0, view0, motionEvent0);
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet T(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        class a extends AnimatorListenerAdapter {
            final boolean a;
            final View b;
            final FabTransformationScrimBehavior c;

            a(boolean z, View view0) {
                this.a = z;
                this.b = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(!this.a) {
                    this.b.setVisibility(4);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                if(this.a) {
                    this.b.setVisibility(0);
                }
            }
        }

        ArrayList arrayList0 = new ArrayList();
        this.U(view1, z, z1, arrayList0, new ArrayList());
        AnimatorSet animatorSet0 = new AnimatorSet();
        c.a(animatorSet0, arrayList0);
        animatorSet0.addListener(new a(this, z, view1));
        return animatorSet0;
    }

    private void U(@NonNull View view0, boolean z, boolean z1, @NonNull List list0, List list1) {
        ObjectAnimator objectAnimator0;
        j j0 = z ? this.f : this.g;
        if(z) {
            if(!z1) {
                view0.setAlpha(0.0f);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(view0, View.ALPHA, new float[]{1.0f});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(view0, View.ALPHA, new float[]{0.0f});
        }
        j0.a(objectAnimator0);
        list0.add(objectAnimator0);
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    public boolean m(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        return view1 instanceof FloatingActionButton;
    }
}

