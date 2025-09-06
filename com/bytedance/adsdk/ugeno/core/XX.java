package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

public class XX {
    private int JQp;
    Paint PjT;
    private AnimatorSet ReZ;
    private String XX;
    private PjT Zh;
    private View cr;
    private int cz;

    public XX(View view0, PjT pjT0) {
        this.cr = view0;
        this.Zh = pjT0;
        this.ReZ = new AnimatorSet();
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setAntiAlias(true);
    }

    public void PjT() {
        ArrayList arrayList0 = new ArrayList();
        List list0 = this.Zh.ReZ();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                com.bytedance.adsdk.ugeno.core.PjT.PjT pjT$PjT0 = (com.bytedance.adsdk.ugeno.core.PjT.PjT)object0;
                if(pjT$PjT0 != null) {
                    ObjectAnimator objectAnimator0 = new ObjectAnimator();
                    objectAnimator0.setDuration(pjT$PjT0.PjT());
                    if(TextUtils.equals(pjT$PjT0.JQp(), "translateX")) {
                        objectAnimator0.setPropertyName("translationX");
                    }
                    else if(TextUtils.equals(pjT$PjT0.JQp(), "translateY")) {
                        objectAnimator0.setPropertyName("translationY");
                    }
                    else {
                        objectAnimator0.setPropertyName(pjT$PjT0.JQp());
                    }
                    objectAnimator0.setStartDelay(pjT$PjT0.cr());
                    objectAnimator0.setTarget(this.cr);
                    if(TextUtils.equals(pjT$PjT0.JQp(), "backgroundColor")) {
                        objectAnimator0.setIntValues(new int[]{((int)pjT$PjT0.cz()), ((int)pjT$PjT0.XX())});
                        Log.d("UGenAnimation", "playAnimation: from = " + pjT$PjT0.cz() + "; to=" + pjT$PjT0.XX());
                    }
                    else {
                        objectAnimator0.setFloatValues(new float[]{pjT$PjT0.cz(), pjT$PjT0.XX()});
                    }
                    int v = (int)this.Zh.Zh();
                    if(v == 0) {
                        objectAnimator0.setRepeatCount(((int)pjT$PjT0.Zh()));
                    }
                    else {
                        objectAnimator0.setRepeatCount(v);
                    }
                    if(TextUtils.equals(pjT$PjT0.JQp(), "backgroundColor")) {
                        objectAnimator0.setEvaluator(new ArgbEvaluator());
                    }
                    String s = this.Zh.cz();
                    if(TextUtils.isEmpty(s)) {
                        s = pjT$PjT0.ReZ();
                    }
                    if(TextUtils.equals(s, "reverse")) {
                        objectAnimator0.setRepeatMode(2);
                    }
                    else {
                        objectAnimator0.setRepeatMode(1);
                    }
                    if(pjT$PjT0.Au() != null && pjT$PjT0.Au().length > 0) {
                        objectAnimator0.setFloatValues(pjT$PjT0.Au());
                    }
                    if(TextUtils.equals(pjT$PjT0.JQp(), "rotationX")) {
                        this.cr.post(new Runnable() {
                            final XX PjT;

                            @Override
                            public void run() {
                                XX.this.cr.setPivotX(((float)XX.this.cr.getWidth()) / 2.0f);
                                XX.this.cr.setPivotY(((float)XX.this.cr.getHeight()));
                            }
                        });
                    }
                    if(TextUtils.equals(pjT$PjT0.JQp(), "ripple")) {
                        this.XX = pjT$PjT0.DWo();
                    }
                    String s1 = pjT$PjT0.SM();
                    s1.hashCode();
                    switch(s1) {
                        case "accelerate": {
                            objectAnimator0.setInterpolator(new AccelerateInterpolator());
                            break;
                        }
                        case "accelerateDecelerate": {
                            objectAnimator0.setInterpolator(new AccelerateDecelerateInterpolator());
                            break;
                        }
                        case "decelerate": {
                            objectAnimator0.setInterpolator(new DecelerateInterpolator());
                            break;
                        }
                        case "linear": {
                            objectAnimator0.setInterpolator(new LinearInterpolator());
                            break;
                        }
                        case "standard": {
                            objectAnimator0.setInterpolator(new LinearInterpolator());
                        }
                    }
                    arrayList0.add(objectAnimator0);
                }
            }
            if(this.Zh.cr() != 0L) {
                this.ReZ.setDuration(this.Zh.cr());
            }
            this.ReZ.setStartDelay(this.Zh.JQp());
            if(TextUtils.equals(this.Zh.PjT(), "sequentially")) {
                this.ReZ.playSequentially(arrayList0);
            }
            else {
                this.ReZ.playTogether(arrayList0);
            }
            this.ReZ.start();
        }
    }

    public void PjT(int v, int v1) {
        this.JQp = v / 2;
        this.cz = v1 / 2;
    }

    public void PjT(Canvas canvas0, IAnimation iAnimation0) {
        try {
            if(iAnimation0.getRipple() != 0.0f && !TextUtils.isEmpty(this.XX)) {
                int v = com.bytedance.adsdk.ugeno.XX.PjT.PjT(this.XX);
                this.PjT.setColor(v);
                this.PjT.setAlpha(90);
                ((ViewGroup)this.cr.getParent()).setClipChildren(true);
                canvas0.drawCircle(((float)this.JQp), ((float)this.cz), ((float)(Math.min(this.JQp, this.cz) * 2)) * iAnimation0.getRipple(), this.PjT);
            }
        }
        catch(Throwable throwable0) {
            Log.d("UGenAnimation", "ripple animation error " + throwable0.getMessage());
        }
    }

    public void Zh() {
        AnimatorSet animatorSet0 = this.ReZ;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
    }
}

