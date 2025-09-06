package com.kakao.adfit.ads.na;

import android.view.View;
import androidx.annotation.UiThread;
import com.kakao.adfit.m.s;
import y4.l;
import y4.m;

@s
public abstract class AdFitNativeAdBinder {
    @s
    public interface OnAdClickListener {
        void onAdClicked(@l View arg1);
    }

    @UiThread
    public abstract void bind(@l AdFitNativeAdLayout arg1);

    @UiThread
    public abstract void bind(@l AdFitNativeAdTemplateLayout arg1);

    @m
    public abstract OnAdClickListener getOnAdClickListener();

    public abstract void setOnAdClickListener(@m OnAdClickListener arg1);

    @UiThread
    public abstract void unbind();
}

