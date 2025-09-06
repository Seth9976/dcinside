package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import java.util.ArrayList;
import java.util.Map;

public interface IAdUnitActivity {
    void addContentView(View arg1, ViewGroup.LayoutParams arg2);

    void finish();

    Activity getActivity();

    Context getContext();

    Intent getIntent();

    AdUnitRelativeLayout getLayout();

    int getRequestedOrientation();

    Map getViewFrame(String arg1);

    String[] getViews();

    Window getWindow();

    boolean isFinishing();

    void requestPermissions(String[] arg1, int arg2);

    boolean setKeepScreenOn(boolean arg1);

    void setKeyEventList(ArrayList arg1);

    void setLayoutInDisplayCutoutMode(int arg1);

    void setOrientation(int arg1);

    void setRequestedOrientation(int arg1);

    boolean setSystemUiVisibility(int arg1);

    void setViewFrame(String arg1, int arg2, int arg3, int arg4, int arg5);

    void setViews(String[] arg1);
}

