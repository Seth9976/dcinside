package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;

public interface IMobileAdsBridge {
    ScarAdapterVersion getAdapterVersion(int arg1);

    Object getInitializationStatus();

    int getVersionCodeIndex();

    String getVersionMethodName();

    String getVersionString();

    void initialize(Context arg1, Object arg2);

    boolean shouldInitialize();
}

