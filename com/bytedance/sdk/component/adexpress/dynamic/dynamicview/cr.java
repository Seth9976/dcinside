package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class cr extends cz {
    private int Owx;
    ObjectAnimator PjT;
    private Runnable RD;
    ObjectAnimator Zh;

    public cr(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.Owx = 0;
        this.RD = () -> {
            View view0 = cr.this.getChildAt(cr.this.Owx);
            View view1 = cr.this.getChildAt((cr.this.Owx + 1) % cr.this.getChildCount());
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, "translationY", new float[]{0.0f, ((float)(-(cr.this.Au + cr.this.getChildAt(cr.this.Owx).getHeight()) / 2))});
            cr.this.PjT = objectAnimator0;
            objectAnimator0.setInterpolator(new LinearInterpolator());
            cr.this.PjT.addListener(new Animator.AnimatorListener() {
                final cr Zh;

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationCancel(Animator animator0) {
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationEnd(Animator animator0) {
                    view0.setVisibility(8);
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationRepeat(Animator animator0) {
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationStart(Animator animator0) {
                }
            });
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(view1, "translationY", new float[]{((float)((cr.this.Au + view1.getHeight()) / 2)), 0.0f});
            cr.this.Zh = objectAnimator1;
            objectAnimator1.setInterpolator(new LinearInterpolator());
            cr.this.Zh.addListener(new Animator.AnimatorListener() {
                final cr Zh;

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationCancel(Animator animator0) {
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationEnd(Animator animator0) {
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationRepeat(Animator animator0) {
                }

                @Override  // android.animation.Animator$AnimatorListener
                public void onAnimationStart(Animator animator0) {
                    view1.setVisibility(0);
                }
            });
            cr.this.PjT.setDuration(500L);
            cr.this.Zh.setDuration(500L);
            cr.this.PjT.start();
            cr.this.Zh.start();
            cr.this.Owx = (cr.this.Owx + 1) % cr.this.getChildCount();
            cr.this.postDelayed(cr.this.RD, 2000L);
        };
    }

    // 检测为 Lambda 实现
    private void PjT() [...]

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void Zh() {
        this.removeCallbacks(this.RD);
        ObjectAnimator objectAnimator0 = this.PjT;
        if(objectAnimator0 != null) {
            objectAnimator0.removeAllUpdateListeners();
            this.PjT.cancel();
        }
        ObjectAnimator objectAnimator1 = this.Zh;
        if(objectAnimator1 != null) {
            objectAnimator1.removeAllUpdateListeners();
            this.Zh.cancel();
        }
        super.Zh();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            frameLayout$LayoutParams0.topMargin = (this.Au - frameLayout$LayoutParams0.height) / 2;
            view0.setLayoutParams(frameLayout$LayoutParams0);
            if(v != 0) {
                view0.setVisibility(8);
            }
        }
        this.postDelayed(this.RD, 2500L);
    }

    class com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cr.1 implements Runnable {
        final cr PjT;

        @Override
        public void run() {
            cr.this.PjT();
        }
    }

}

