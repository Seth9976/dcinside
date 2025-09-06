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

public class ReZ extends cz {
    private int Owx;
    ObjectAnimator PjT;
    private boolean RD;
    private Runnable Sks;
    ObjectAnimator Zh;

    public ReZ(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.Owx = 0;
        this.RD = false;
        this.Sks = () -> {
            View view1;
            View view0 = ReZ.this.getChildAt(ReZ.this.Owx);
            if(view0 == null) {
                return;
            }
            int v = ReZ.this.Owx;
            if(v == 0) {
                ReZ.this.RD = false;
            }
            if(v + 1 >= ReZ.this.getChildCount() || ((ViewGroup)ReZ.this.getChildAt(ReZ.this.Owx + 1)).getChildCount() <= 0) {
                ReZ.this.RD = true;
                view1 = ReZ.this.getChildAt(ReZ.this.Owx - 1);
                ReZ.this.PjT = ObjectAnimator.ofFloat(view0, "translationX", new float[]{0.0f, ((float)((ReZ.this.XX + ReZ.this.getChildAt(ReZ.this.Owx).getWidth()) / 2))});
            }
            else {
                view1 = ReZ.this.getChildAt(ReZ.this.Owx + 1);
                ReZ.this.PjT = ObjectAnimator.ofFloat(view0, "translationX", new float[]{0.0f, ((float)(-(ReZ.this.XX + ReZ.this.getChildAt(ReZ.this.Owx).getWidth()) / 2))});
            }
            if(view1 == null) {
                return;
            }
            ReZ.this.PjT.setInterpolator(new LinearInterpolator());
            ReZ.this.PjT.addListener(new Animator.AnimatorListener() {
                final ReZ Zh;

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
            ReZ.this.Zh = ReZ.this.RD ? ObjectAnimator.ofFloat(view1, "translationX", new float[]{((float)(-(ReZ.this.XX + view1.getWidth()) / 2)), 0.0f}) : ObjectAnimator.ofFloat(view1, "translationX", new float[]{((float)((ReZ.this.XX + view1.getWidth()) / 2)), 0.0f});
            ReZ.this.Zh.setInterpolator(new LinearInterpolator());
            ReZ.this.Zh.addListener(new Animator.AnimatorListener() {
                final ReZ Zh;

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
            ReZ.this.PjT.setDuration(500L);
            ReZ.this.Zh.setDuration(500L);
            ReZ.this.PjT.start();
            ReZ.this.Zh.start();
            if(ReZ.this.RD) {
                --ReZ.this.Owx;
            }
            else {
                ++ReZ.this.Owx;
            }
            ReZ.this.postDelayed(ReZ.this.Sks, 2000L);
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

    class com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ReZ.1 implements Runnable {
        final ReZ PjT;

        @Override
        public void run() {
            ReZ.this.PjT();
        }
    }

}

