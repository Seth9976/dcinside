package com.google.android.material.transformation;

import G1.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends Behavior {
    private int a;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    public ExpandableBehavior() {
        this.a = 0;
    }

    public ExpandableBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 0;
    }

    // 去混淆评级： 低(20)
    private boolean O(boolean z) {
        return z ? this.a == 0 || this.a == 2 : this.a == 1;
    }

    @Nullable
    protected b P(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        List list0 = coordinatorLayout0.w(view0);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = (View)list0.get(v1);
            if(this.m(coordinatorLayout0, view0, view1)) {
                return (b)view1;
            }
        }
        return null;
    }

    @Nullable
    public static ExpandableBehavior Q(@NonNull View view0, @NonNull Class class0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
        if(!(coordinatorLayout$Behavior0 instanceof ExpandableBehavior)) {
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        return (ExpandableBehavior)class0.cast(coordinatorLayout$Behavior0);
    }

    protected abstract boolean R(View arg1, View arg2, boolean arg3, boolean arg4);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public abstract boolean m(CoordinatorLayout arg1, View arg2, View arg3);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        if(this.O(((b)view1).b())) {
            this.a = ((b)view1).b() ? 1 : 2;
            return this.R(((View)(((b)view1))), view0, ((b)view1).b(), true);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        class a implements ViewTreeObserver.OnPreDrawListener {
            final View a;
            final int b;
            final b c;
            final ExpandableBehavior d;

            a(View view0, int v, b b0) {
                this.a = view0;
                this.b = v;
                this.c = b0;
                super();
            }

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                this.a.getViewTreeObserver().removeOnPreDrawListener(this);
                if(ExpandableBehavior.this.a == this.b) {
                    boolean z = this.c.b();
                    ExpandableBehavior.this.R(((View)this.c), this.a, z, false);
                }
                return false;
            }
        }

        if(!ViewCompat.a1(view0)) {
            b b0 = this.P(coordinatorLayout0, view0);
            if(b0 != null && this.O(b0.b())) {
                int v1 = b0.b() ? 1 : 2;
                this.a = v1;
                view0.getViewTreeObserver().addOnPreDrawListener(new a(this, view0, v1, b0));
            }
        }
        return false;
    }
}

