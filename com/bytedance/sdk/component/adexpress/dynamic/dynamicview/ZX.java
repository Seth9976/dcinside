package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class ZX extends cz {
    private int Owx;
    ObjectAnimator PjT;
    private boolean RD;
    private Runnable Sks;
    ObjectAnimator Zh;

    public ZX(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.Owx = 0;
        this.RD = false;
        this.Sks = () -> {
            View view1;
            View view0 = ZX.this.getChildAt(ZX.this.Owx);
            int v = ZX.this.Owx;
            if(v == 0) {
                ZX.this.RD = false;
            }
            boolean z = v + 1 >= ZX.this.getChildCount() || ((ViewGroup)ZX.this.getChildAt(ZX.this.Owx + 1)).getChildCount() <= 0;
            if(ZX.this.xs.DWo().JQp().PjT() || !z) {
                View view2 = z ? ZX.this.getChildAt((ZX.this.Owx + 2) % ZX.this.getChildCount()) : ZX.this.getChildAt((ZX.this.Owx + 1) % ZX.this.getChildCount());
                ZX.this.PjT = ObjectAnimator.ofFloat(view0, "translationY", new float[]{0.0f, ((float)(-(ZX.this.Au + ZX.this.getChildAt(ZX.this.Owx).getHeight()) / 2))});
                if(z) {
                    ++ZX.this.Owx;
                }
                view1 = view2;
            }
            else {
                ZX.this.RD = true;
                view1 = ZX.this.getChildAt(ZX.this.Owx - 1);
                ZX.this.PjT = ObjectAnimator.ofFloat(view0, "translationY", new float[]{0.0f, ((float)((ZX.this.Au + ZX.this.getChildAt(ZX.this.Owx).getHeight()) / 2))});
            }
            ZX.this.PjT.setInterpolator(new LinearInterpolator());
            ZX.this.PjT.addListener(new Animator.AnimatorListener() {
                final ZX Zh;

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
            ZX.this.Zh = ZX.this.RD ? ObjectAnimator.ofFloat(view1, "translationY", new float[]{((float)(-(ZX.this.Au + view1.getHeight()) / 2)), 0.0f}) : ObjectAnimator.ofFloat(view1, "translationY", new float[]{((float)((ZX.this.Au + view1.getHeight()) / 2)), 0.0f});
            ZX.this.Zh.setInterpolator(new LinearInterpolator());
            ZX.this.Zh.addListener(new Animator.AnimatorListener() {
                final ZX Zh;

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
            ZX.this.PjT.setDuration(500L);
            ZX.this.Zh.setDuration(500L);
            ZX.this.PjT.start();
            ZX.this.Zh.start();
            if(ZX.this.RD) {
                --ZX.this.Owx;
            }
            else {
                ZX.this.Owx = (ZX.this.Owx + 1) % ZX.this.getChildCount();
            }
            ZX.this.postDelayed(ZX.this.Sks, 3000L);
        };
    }

    // 检测为 Lambda 实现
    private void PjT() [...]

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void Zh() {
        this.removeCallbacks(this.Sks);
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
        this.postDelayed(this.Sks, 2500L);
    }

    class com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZX.1 implements Runnable {
        final ZX PjT;

        @Override
        public void run() {
            ZX.this.PjT();
        }
    }

}

