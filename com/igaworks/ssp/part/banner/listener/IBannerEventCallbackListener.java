package com.igaworks.ssp.part.banner.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IBannerEventCallbackListener {
    void OnBannerAdClicked();

    void OnBannerAdReceiveFailed(SSPErrorCode arg1);

    void OnBannerAdReceiveSuccess();
}

