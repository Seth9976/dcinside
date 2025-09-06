package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;

public interface IAdUnitViewHandler {
    boolean create(IAdUnitActivity arg1);

    boolean destroy();

    View getView();

    void onCreate(IAdUnitActivity arg1, Bundle arg2);

    void onDestroy(IAdUnitActivity arg1);

    void onPause(IAdUnitActivity arg1);

    void onResume(IAdUnitActivity arg1);

    void onStart(IAdUnitActivity arg1);

    void onStop(IAdUnitActivity arg1);
}

