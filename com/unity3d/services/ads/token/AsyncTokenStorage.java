package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
import y4.m;

public interface AsyncTokenStorage {
    void getToken(@m IBiddingManager arg1);

    void onTokenAvailable();

    void setConfiguration(@m Configuration arg1);
}

