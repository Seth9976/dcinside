package com.fsn.cauly;

public interface CaulyCustomAdListener {
    void onClikedAd();

    void onFailedAd(int arg1, String arg2);

    void onLoadedAd(boolean arg1);

    void onShowedAd();
}

