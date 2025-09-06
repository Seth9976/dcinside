package com.bytedance.sdk.component.adexpress.cz;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cRA;
import org.json.JSONObject;

public class ltE extends LinearLayout {
    public interface PjT {
    }

    static class Zh implements Interpolator {
        private Zh() {
        }

        Zh(com.bytedance.sdk.component.adexpress.cz.ltE.1 ltE$10) {
        }

        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if(f <= 0.25f) {
                return f * -2.0f + 0.5f;
            }
            if(f <= 0.5f) {
                return f * 4.0f - 1.0f;
            }
            return f <= 0.75f ? f * -4.0f + 3.0f : f * 2.0f - 1.5f;
        }
    }

    private LinearLayout Au;
    private int DWo;
    private TextView JQp;
    private TextView PjT;
    private ImageView ReZ;
    private int SM;
    private PjT XX;
    private TextView Zh;
    private cRA cr;
    private TextView cz;
    private int qj;
    private JSONObject xf;

    public ltE(@NonNull Context context0, View view0, int v, int v1, int v2, JSONObject jSONObject0) {
        super(context0);
        this.SM = v;
        this.DWo = v1;
        this.qj = v2;
        this.xf = jSONObject0;
        this.PjT(context0, view0);
    }

    public void PjT() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        objectAnimator0.setDuration(300L);
        objectAnimator0.start();
        this.postDelayed(new Runnable() {
            final ltE PjT;

            @Override
            public void run() {
                if(ltE.this.ReZ != null) {
                    RotateAnimation rotateAnimation0 = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                    rotateAnimation0.setInterpolator(new Zh(null));
                    rotateAnimation0.setDuration(1000L);
                    rotateAnimation0.setAnimationListener(new Animation.AnimationListener() {
                        final com.bytedance.sdk.component.adexpress.cz.ltE.1 Zh;

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationEnd(Animation animation0) {
                            com.bytedance.sdk.component.adexpress.cz.ltE.1.1.1 ltE$1$1$10 = new Runnable() {
                                final com.bytedance.sdk.component.adexpress.cz.ltE.1.1 PjT;

                                @Override
                                public void run() {
                                    ltE.this.ReZ.startAnimation(com.bytedance.sdk.component.adexpress.cz.ltE.1.1.this.PjT);
                                }
                            };
                            ltE.this.postDelayed(ltE$1$1$10, 0xFAL);
                        }

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationRepeat(Animation animation0) {
                        }

                        @Override  // android.view.animation.Animation$AnimationListener
                        public void onAnimationStart(Animation animation0) {
                        }
                    });
                    ltE.this.ReZ.startAnimation(rotateAnimation0);
                }
            }
        }, 500L);
    }

    protected void PjT(Context context0, View view0) {
        this.addView(view0);
        this.Au = (LinearLayout)this.findViewById(0x7D06FFE7);
        this.ReZ = (ImageView)this.findViewById(0x7D06FFE5);
        this.PjT = (TextView)this.findViewById(0x7D06FFE4);
        this.Zh = (TextView)this.findViewById(0x7D06FFE6);
        this.JQp = (TextView)this.findViewById(0x7D06FFE3);
        this.cz = (TextView)this.findViewById(0x7D06FFE8);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(1);
        gradientDrawable0.setColor(Color.parseColor("#57000000"));
        this.Au.setBackground(gradientDrawable0);
    }

    public LinearLayout getShakeLayout() {
        return this.Au;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.isShown()) {
            if(this.cr == null) {
                this.cr = new cRA(this.getContext().getApplicationContext(), 1);
            }
            new Object() {
                final ltE PjT;

            };
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void setOnShakeViewListener(PjT ltE$PjT0) {
        this.XX = ltE$PjT0;
    }

    public void setShakeText(String s) {
        if(TextUtils.isEmpty(s)) {
            this.JQp.setVisibility(8);
            this.cz.setVisibility(8);
            return;
        }
        this.JQp.setText(s);
    }
}

