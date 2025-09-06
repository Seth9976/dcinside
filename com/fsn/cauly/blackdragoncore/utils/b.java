package com.fsn.cauly.blackdragoncore.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

public class b {
    public static void a(View view0, int v) {
        if(view0 != null) {
            try {
                AnimationSet animationSet0 = new AnimationSet(true);
                AlphaAnimation alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation0.setDuration(2000L);
                animationSet0.addAnimation(alphaAnimation0);
                TranslateAnimation translateAnimation0 = new TranslateAnimation(0.0f, 0.0f, ((float)v), 0.0f);
                translateAnimation0.setDuration(2000L);
                animationSet0.addAnimation(translateAnimation0);
                view0.startAnimation(animationSet0);
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

