package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import java.util.ArrayList;
import java.util.List;

public class DWo extends cr {
    class PjT {
        final DWo PjT;
        private View Zh;

        public PjT(View view0) {
            this.Zh = view0;
        }

        public void PjT(int v) {
            if("top".equals(DWo.this.Zh.PjT())) {
                if(DWo.this.ReZ instanceof ViewGroup) {
                    for(int v1 = 0; v1 < ((ViewGroup)DWo.this.ReZ).getChildCount(); ++v1) {
                        ((ViewGroup)DWo.this.ReZ).getChildAt(v1).setTranslationY(((float)v) - DWo.this.JQp);
                    }
                }
                DWo.this.ReZ.setTranslationY(DWo.this.JQp - ((float)v));
                return;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.Zh.getLayoutParams();
            viewGroup$LayoutParams0.height = v;
            this.Zh.setLayoutParams(viewGroup$LayoutParams0);
            this.Zh.requestLayout();
        }
    }

    private float JQp;
    private PjT cr;
    private float cz;

    public DWo(View view0, com.bytedance.sdk.component.adexpress.dynamic.cr.PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        int v1;
        String s;
        if(this.ReZ instanceof ImageView && this.ReZ.getParent() instanceof JQp) {
            this.ReZ = (View)this.ReZ.getParent();
        }
        this.ReZ.setAlpha(0.0f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{0.0f, 1.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        this.cr = new PjT(this, this.ReZ);
        int v = this.ReZ.getLayoutParams().height;
        this.JQp = (float)v;
        this.cz = (float)this.ReZ.getLayoutParams().width;
        if("left".equals(this.Zh.PjT()) || "right".equals(this.Zh.PjT())) {
            v1 = (int)this.cz;
            s = "width";
        }
        else {
            s = "height";
            v1 = v;
        }
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofInt(this.cr, s, new int[]{0, v1}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        list0.add(this.PjT(objectAnimator1));
        ((ObjectAnimator)list0.get(0)).addListener(new Animator.AnimatorListener() {
            final DWo Zh;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                DWo.this.cr.PjT(v);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0, boolean z) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0, boolean z) {
            }
        });
        return list0;
    }
}

