package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.E0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd;

public interface VideoMixAdMediationAdapter {
    void checkValidMediation();

    void destroyAd();

    String getBiddingToken(Context arg1);

    String getNetworkName();

    void loadAd(Context arg1, AdPopcornSSPVideoMixAd arg2, d0 arg3, boolean arg4, int arg5, int arg6);

    void pauseAd();

    void resumeAd();

    void setMediationAdapterEventListener(E0 arg1);

    void showAd(Context arg1, d0 arg2, boolean arg3, int arg4, int arg5);
}

