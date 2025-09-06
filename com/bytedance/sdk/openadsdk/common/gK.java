package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.JQp.cz;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.concurrent.atomic.AtomicBoolean;

public class gK {
    private ImageView Au;
    private cz DWo;
    private final RelativeLayout JQp;
    qla PjT;
    final AtomicBoolean ReZ;
    private TextView SM;
    private final Context XX;
    TTAdDislikeToast Zh;
    final AtomicBoolean cr;
    private final Owx cz;
    private final int qj;
    private boolean xf;

    public gK(Context context0, RelativeLayout relativeLayout0, Owx owx0) {
        this.ReZ = new AtomicBoolean(false);
        this.cr = new AtomicBoolean(false);
        this.XX = context0;
        this.JQp = relativeLayout0;
        this.cz = owx0;
        this.qj = qZS.Zh(ub.PjT(), 44.0f);
        this.JQp();
    }

    private void JQp() {
        this.Au = (ImageView)this.JQp.findViewById(com.bytedance.sdk.openadsdk.utils.qla.wKV);
        this.SM = (TextView)this.JQp.findViewById(com.bytedance.sdk.openadsdk.utils.qla.yks);
        ImageView imageView0 = (ImageView)this.JQp.findViewById(com.bytedance.sdk.openadsdk.utils.qla.Xtz);
        this.DWo = (cz)this.JQp.findViewById(com.bytedance.sdk.openadsdk.utils.qla.ix);
        Owx owx0 = this.cz;
        if(owx0 != null) {
            this.SM.setText((TextUtils.isEmpty(owx0.Xtz()) ? Lrd.PjT(this.XX, "tt_web_title_default") : this.cz.Xtz()));
        }
        imageView0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            if(gK.this.cr.get()) {
                gK.this.XX();
                return;
            }
            if(gK.this.PjT == null) {
                gK.this.cz();
            }
            qla qla0 = gK.this.PjT;
            if(qla0 != null) {
                qla0.PjT();
            }
        });

        class com.bytedance.sdk.openadsdk.common.gK.1 implements View.OnClickListener {
            final gK PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                gK.this.cr();
            }
        }

    }

    public void PjT() {
        try {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.JQp.getLayoutParams();
            if(!this.xf) {
                int v = this.qj;
                if(viewGroup$MarginLayoutParams0.topMargin == -v) {
                    ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{-v, 0});
                    valueAnimator0.setDuration(300L);
                    valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        final gK Zh;

                        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                            viewGroup$MarginLayoutParams0.topMargin = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                            gK.this.JQp.setLayoutParams(viewGroup$MarginLayoutParams0);
                        }
                    });
                    valueAnimator0.addListener(new Animator.AnimatorListener() {
                        final gK PjT;

                        @Override  // android.animation.Animator$AnimatorListener
                        public void onAnimationCancel(Animator animator0) {
                        }

                        @Override  // android.animation.Animator$AnimatorListener
                        public void onAnimationEnd(Animator animator0) {
                            gK.this.xf = false;
                        }

                        @Override  // android.animation.Animator$AnimatorListener
                        public void onAnimationRepeat(Animator animator0) {
                        }

                        @Override  // android.animation.Animator$AnimatorListener
                        public void onAnimationStart(Animator animator0) {
                            gK.this.xf = true;
                        }
                    });
                    valueAnimator0.start();
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(int v) {
        if(v == 100) {
            this.DWo.setVisibility(8);
            return;
        }
        this.DWo.setVisibility(0);
        this.DWo.setProgress(v);
    }

    public ImageView ReZ() {
        return this.Au;
    }

    private void XX() {
        this.Zh.show(TTAdDislikeToast.getDislikeTip());
    }

    public void Zh() {
        try {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.JQp.getLayoutParams();
            if(!this.xf && viewGroup$MarginLayoutParams0.topMargin == 0) {
                ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, -this.qj});
                valueAnimator0.setDuration(300L);
                valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    final gK Zh;

                    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                        viewGroup$MarginLayoutParams0.topMargin = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                        gK.this.JQp.setLayoutParams(viewGroup$MarginLayoutParams0);
                    }
                });
                valueAnimator0.addListener(new Animator.AnimatorListener() {
                    final gK PjT;

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationCancel(Animator animator0) {
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationEnd(Animator animator0) {
                        gK.this.xf = false;
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationRepeat(Animator animator0) {
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationStart(Animator animator0) {
                        gK.this.xf = true;
                    }
                });
                valueAnimator0.start();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    protected void cr() [...]

    private void cz() {
        try {
            if(this.PjT == null) {
                qla qla0 = new qla(this.XX, this.cz);
                this.PjT = qla0;
                qla0.setDislikeSource("landing_page");
                this.PjT.setCallback(new PjT() {
                    final gK PjT;

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(View view0) {
                        gK.this.ReZ.set(true);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(FilterWord filterWord0) {
                        if(!gK.this.cr.get() && filterWord0 != null && !filterWord0.hasSecondOptions()) {
                            gK.this.cr.set(true);
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void Zh(View view0) {
                        gK.this.ReZ.set(false);
                    }
                });
            }
            FrameLayout frameLayout0 = (FrameLayout)this.JQp.getRootView().findViewById(0x1020002);
            frameLayout0.addView(this.PjT);
            if(this.Zh == null) {
                TTAdDislikeToast tTAdDislikeToast0 = new TTAdDislikeToast(this.XX);
                this.Zh = tTAdDislikeToast0;
                frameLayout0.addView(tTAdDislikeToast0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", throwable0);
    }
}

