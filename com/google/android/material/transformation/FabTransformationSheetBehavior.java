package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.animator;
import com.google.android.material.animation.i;
import com.google.android.material.animation.k;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @Nullable
    private Map l;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @CallSuper
    protected boolean R(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        this.q0(view1, z);
        return super.R(view0, view1, z, z1);
    }

    @Override  // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    protected e o0(Context context0, boolean z) {
        e fabTransformationBehavior$e0 = new e();
        fabTransformationBehavior$e0.a = i.d(context0, (z ? animator.mtrl_fab_transformation_sheet_expand_spec : animator.mtrl_fab_transformation_sheet_collapse_spec));
        fabTransformationBehavior$e0.b = new k(17, 0.0f, 0.0f);
        return fabTransformationBehavior$e0;
    }

    private void q0(@NonNull View view0, boolean z) {
        ViewParent viewParent0 = view0.getParent();
        if(!(viewParent0 instanceof CoordinatorLayout)) {
            return;
        }
        int v = ((CoordinatorLayout)viewParent0).getChildCount();
        if(z) {
            this.l = new HashMap(v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
            if(view1 != view0 && (!(view1.getLayoutParams() instanceof LayoutParams) || !(((LayoutParams)view1.getLayoutParams()).f() instanceof FabTransformationScrimBehavior))) {
                if(z) {
                    this.l.put(view1, view1.getImportantForAccessibility());
                    ViewCompat.b2(view1, 4);
                }
                else if(this.l != null && this.l.containsKey(view1)) {
                    ViewCompat.b2(view1, ((int)(((Integer)this.l.get(view1)))));
                }
            }
        }
        if(!z) {
            this.l = null;
        }
    }
}

