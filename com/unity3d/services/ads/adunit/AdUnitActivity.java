package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.ArrayList;
import java.util.Map;

public class AdUnitActivity extends Activity implements IAdUnitActivity {
    public static final String EXTRA_ACTIVITY_ID = "activityId";
    public static final String EXTRA_DISPLAY_CUTOUT_MODE = "displayCutoutMode";
    public static final String EXTRA_KEEP_SCREEN_ON = "keepScreenOn";
    public static final String EXTRA_KEY_EVENT_LIST = "keyEvents";
    public static final String EXTRA_ORIENTATION = "orientation";
    public static final String EXTRA_SYSTEM_UI_VISIBILITY = "systemUiVisibility";
    public static final String EXTRA_VIEWS = "views";
    protected AdUnitActivityController _controller;

    protected AdUnitActivityController createController() {
        return new AdUnitActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), new AdUnitViewHandlerFactory());
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Activity getActivity() {
        return this;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Context getContext() {
        return this;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public AdUnitRelativeLayout getLayout() {
        return this._controller.getLayout();
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public Map getViewFrame(String s) {
        return this._controller.getViewFrame(s);
    }

    public IAdUnitViewHandler getViewHandler(String s) {
        return this._controller.getViewHandler(s);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public String[] getViews() {
        return this._controller.getViews();
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        AdUnitActivityController adUnitActivityController0 = this.createController();
        this._controller = adUnitActivityController0;
        adUnitActivityController0.onCreate(bundle0);
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        AdUnitActivityController adUnitActivityController0 = this._controller;
        if(adUnitActivityController0 != null) {
            adUnitActivityController0.onDestroy();
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this._controller.onKeyDown(v, keyEvent0);
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        this._controller.onPause();
    }

    @Override  // android.app.Activity
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        this._controller.onRequestPermissionsResult(v, arr_s, arr_v);
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        this._controller.onResume();
    }

    @Override  // android.app.Activity
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this._controller.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        this._controller.onStart();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        this._controller.onStop();
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        this._controller.onWindowFocusChanged(z);
        super.onWindowFocusChanged(z);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setKeepScreenOn(boolean z) {
        return this._controller.setKeepScreenOn(z);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setKeyEventList(ArrayList arrayList0) {
        this._controller.setKeyEventList(arrayList0);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setLayoutInDisplayCutoutMode(int v) {
        this._controller.setLayoutInDisplayCutoutMode(v);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setOrientation(int v) {
        this._controller.setOrientation(v);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public boolean setSystemUiVisibility(int v) {
        return this._controller.setSystemUiVisibility(v);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViewFrame(String s, int v, int v1, int v2, int v3) {
        this._controller.setViewFrame(s, v, v1, v2, v3);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitActivity
    public void setViews(String[] arr_s) {
        this._controller.setViews(arr_s);
    }
}

