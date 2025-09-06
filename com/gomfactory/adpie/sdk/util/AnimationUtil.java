package com.gomfactory.adpie.sdk.util;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

public class AnimationUtil {
    public static final int ANIMATION_BOTTOM_TO_TOP_SLIDE = 4;
    public static final int ANIMATION_FADE = 5;
    public static final int ANIMATION_LEFT_TO_RIGHT_SLIDE = 1;
    public static final int ANIMATION_NONE = 0;
    public static final int ANIMATION_RIGHT_TO_LEFT_SLIDE = 2;
    public static final int ANIMATION_TOP_TO_BOTTOM_SLIDE = 3;
    private static final long duration = 500L;

    public static Animation getHideAnimation(int v, View view0) {
        Animation animation0;
        switch(v) {
            case 1: {
                animation0 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                animation0.setDuration(500L);
                break;
            }
            case 2: {
                animation0 = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                animation0.setDuration(500L);
                break;
            }
            case 3: {
                animation0 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                animation0.setDuration(500L);
                break;
            }
            case 4: {
                animation0 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                animation0.setDuration(500L);
                break;
            }
            case 5: {
                animation0 = new AlphaAnimation(1.0f, 0.0f);
                animation0.setDuration(500L);
                break;
            }
            default: {
                animation0 = new AlphaAnimation(1.0f, 1.0f);
                animation0.setDuration(0L);
            }
        }
        animation0.setFillEnabled(true);
        animation0.setFillAfter(true);
        animation0.setFillBefore(false);
        return animation0;
    }

    public static Animation getShowAnimation(int v, View view0) {
        Animation animation0;
        switch(v) {
            case 1: {
                animation0 = new AnimationSet(true);
                ((AnimationSet)animation0).addAnimation(new AlphaAnimation(0.0f, 1.0f));
                ((AnimationSet)animation0).addAnimation(new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f));
                ((AnimationSet)animation0).setDuration(500L);
                break;
            }
            case 2: {
                animation0 = new AnimationSet(true);
                ((AnimationSet)animation0).addAnimation(new AlphaAnimation(0.0f, 1.0f));
                ((AnimationSet)animation0).addAnimation(new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f));
                ((AnimationSet)animation0).setDuration(500L);
                break;
            }
            case 3: {
                animation0 = new AnimationSet(true);
                ((AnimationSet)animation0).addAnimation(new AlphaAnimation(0.0f, 1.0f));
                ((AnimationSet)animation0).addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f));
                ((AnimationSet)animation0).setDuration(500L);
                break;
            }
            case 4: {
                animation0 = new AnimationSet(true);
                ((AnimationSet)animation0).addAnimation(new AlphaAnimation(0.0f, 1.0f));
                ((AnimationSet)animation0).addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f));
                ((AnimationSet)animation0).setDuration(500L);
                break;
            }
            case 5: {
                animation0 = new AlphaAnimation(0.0f, 1.0f);
                animation0.setDuration(500L);
                break;
            }
            default: {
                animation0 = new AlphaAnimation(1.0f, 1.0f);
                animation0.setDuration(0L);
            }
        }
        animation0.setFillEnabled(true);
        animation0.setFillAfter(false);
        animation0.setFillBefore(true);
        return animation0;
    }
}

