package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;

public class AdUnitActivityController {
    private int _activityId;
    private final IAdUnitActivity _adUnitActivity;
    private final IAdUnitViewHandlerFactory _adUnitViewHandlerFactory;
    private int _displayCutoutMode;
    private final IEventSender _eventSender;
    boolean _keepScreenOn;
    private ArrayList _keyEventList;
    protected AdUnitRelativeLayout _layout;
    private int _orientation;
    private int _systemUiVisibility;
    private Map _viewHandlers;
    private String[] _views;

    public AdUnitActivityController(IAdUnitActivity iAdUnitActivity0, IEventSender iEventSender0, IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory0) {
        this._orientation = -1;
        this._adUnitActivity = iAdUnitActivity0;
        this._eventSender = iEventSender0;
        this._adUnitViewHandlerFactory = iAdUnitViewHandlerFactory0;
    }

    protected void createLayout() {
        if(this._layout != null) {
            return;
        }
        AdUnitRelativeLayout adUnitRelativeLayout0 = new AdUnitRelativeLayout(this._adUnitActivity.getContext());
        this._layout = adUnitRelativeLayout0;
        adUnitRelativeLayout0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ViewUtilities.setBackground(this._layout, new ColorDrawable(0xFF000000));
    }

    private IAdUnitViewHandler createViewHandler(String s) {
        return this._adUnitViewHandlerFactory.createViewHandler(s);
    }

    public AdUnitRelativeLayout getLayout() {
        return this._layout;
    }

    public Map getViewFrame(String s) {
        IAdUnitViewHandler iAdUnitViewHandler0 = this.getViewHandler(s);
        if(s.equals("adunit")) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this._layout.getLayoutParams();
            Map map0 = new HashMap();
            ((HashMap)map0).put("x", frameLayout$LayoutParams0.leftMargin);
            ((HashMap)map0).put("y", frameLayout$LayoutParams0.topMargin);
            ((HashMap)map0).put("width", this._layout.getWidth());
            ((HashMap)map0).put("height", this._layout.getHeight());
            return map0;
        }
        View view0 = iAdUnitViewHandler0 == null ? null : iAdUnitViewHandler0.getView();
        if(view0 != null) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)view0.getLayoutParams();
            Map map1 = new HashMap();
            ((HashMap)map1).put("x", relativeLayout$LayoutParams0.leftMargin);
            ((HashMap)map1).put("y", relativeLayout$LayoutParams0.topMargin);
            ((HashMap)map1).put("width", view0.getWidth());
            ((HashMap)map1).put("height", view0.getHeight());
            return map1;
        }
        return null;
    }

    public IAdUnitViewHandler getViewHandler(String s) {
        if(this._viewHandlers != null && this._viewHandlers.containsKey(s)) {
            return (IAdUnitViewHandler)this._viewHandlers.get(s);
        }
        IAdUnitViewHandler iAdUnitViewHandler0 = this.createViewHandler(s);
        if(iAdUnitViewHandler0 != null) {
            if(this._viewHandlers == null) {
                this._viewHandlers = new HashMap();
            }
            this._viewHandlers.put(s, iAdUnitViewHandler0);
        }
        return iAdUnitViewHandler0;
    }

    public String[] getViews() {
        return this._views;
    }

    private boolean handleViewPlacement(View view0) {
        if(view0 == null) {
            this._adUnitActivity.finish();
            DeviceLog.error("Could not place view because it is null, finishing activity");
            return false;
        }
        if(view0.getParent() != null && view0.getParent().equals(this._layout)) {
            this._layout.bringChildToFront(view0);
            return true;
        }
        ViewUtilities.removeViewFromParent(view0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams0.addRule(13);
        relativeLayout$LayoutParams0.setMargins(0, 0, 0, 0);
        view0.setPadding(0, 0, 0, 0);
        this._layout.addView(view0, relativeLayout$LayoutParams0);
        return true;
    }

    public void onCreate(Bundle bundle0) {
        AdUnitEvent adUnitEvent0;
        if(!this._eventSender.canSend()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            this._adUnitActivity.finish();
            return;
        }
        AdUnit.setAdUnitActivity(this._adUnitActivity);
        Intent.setActiveActivity(this._adUnitActivity.getActivity());
        this.createLayout();
        ViewUtilities.removeViewFromParent(this._layout);
        AdUnitRelativeLayout adUnitRelativeLayout0 = this._layout;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = adUnitRelativeLayout0.getLayoutParams();
        this._adUnitActivity.addContentView(adUnitRelativeLayout0, viewGroup$LayoutParams0);
        if(bundle0 == null) {
            this._views = this._adUnitActivity.getIntent().getStringArrayExtra("views");
            this._keyEventList = this._adUnitActivity.getIntent().getIntegerArrayListExtra("keyEvents");
            if(this._adUnitActivity.getIntent().hasExtra("orientation")) {
                this._orientation = this._adUnitActivity.getIntent().getIntExtra("orientation", -1);
            }
            if(this._adUnitActivity.getIntent().hasExtra("systemUiVisibility")) {
                this._systemUiVisibility = this._adUnitActivity.getIntent().getIntExtra("systemUiVisibility", 0);
            }
            if(this._adUnitActivity.getIntent().hasExtra("activityId")) {
                this._activityId = this._adUnitActivity.getIntent().getIntExtra("activityId", -1);
            }
            if(this._adUnitActivity.getIntent().hasExtra("displayCutoutMode")) {
                this._displayCutoutMode = this._adUnitActivity.getIntent().getIntExtra("displayCutoutMode", 0);
            }
            adUnitEvent0 = AdUnitEvent.ON_CREATE;
        }
        else {
            this._views = bundle0.getStringArray("views");
            this._orientation = bundle0.getInt("orientation", -1);
            this._systemUiVisibility = bundle0.getInt("systemUiVisibility", 0);
            this._keyEventList = bundle0.getIntegerArrayList("keyEvents");
            this._keepScreenOn = bundle0.getBoolean("keepScreenOn");
            this._activityId = bundle0.getInt("activityId", -1);
            this._displayCutoutMode = bundle0.getInt("displayCutoutMode", 0);
            this.setKeepScreenOn(this._keepScreenOn);
            adUnitEvent0 = AdUnitEvent.ON_RESTORE;
        }
        this.setOrientation(this._orientation);
        this.setSystemUiVisibility(this._systemUiVisibility);
        this.setLayoutInDisplayCutoutMode(this._displayCutoutMode);
        String[] arr_s = this._views;
        if(arr_s != null) {
            for(int v = 0; v < arr_s.length; ++v) {
                IAdUnitViewHandler iAdUnitViewHandler0 = this.getViewHandler(arr_s[v]);
                if(iAdUnitViewHandler0 != null) {
                    iAdUnitViewHandler0.onCreate(this._adUnitActivity, bundle0);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, adUnitEvent0, new Object[]{this._activityId});
    }

    public void onDestroy() {
        if(!this._eventSender.canSend()) {
            if(!this._adUnitActivity.isFinishing()) {
                DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
                this._adUnitActivity.finish();
            }
            return;
        }
        Object[] arr_object = {Boolean.valueOf(this._adUnitActivity.isFinishing()), this._activityId};
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_DESTROY, arr_object);
        Map map0 = this._viewHandlers;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() != null) {
                    ((IAdUnitViewHandler)map$Entry0.getValue()).onDestroy(this._adUnitActivity);
                }
            }
        }
        if(-1 == this._activityId) {
            AdUnit.setAdUnitActivity(null);
        }
        Intent.removeActiveActivity(this._adUnitActivity.getActivity());
    }

    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(this._keyEventList != null && this._keyEventList.contains(v)) {
            Object[] arr_object = {v, keyEvent0.getEventTime(), keyEvent0.getDownTime(), keyEvent0.getRepeatCount(), this._activityId};
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.KEY_DOWN, arr_object);
            return true;
        }
        return false;
    }

    public void onPause() {
        if(!this._eventSender.canSend()) {
            if(!this._adUnitActivity.isFinishing()) {
                DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onPause");
                this._adUnitActivity.finish();
            }
            return;
        }
        if(WebViewApp.getCurrentApp().getWebView() == null) {
            DeviceLog.warning("Unity Ads web view is null, from onPause");
        }
        else if(this._adUnitActivity.isFinishing()) {
            ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
        }
        Map map0 = this._viewHandlers;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() != null) {
                    ((IAdUnitViewHandler)map$Entry0.getValue()).onPause(this._adUnitActivity);
                }
            }
        }
        Object[] arr_object = {Boolean.valueOf(this._adUnitActivity.isFinishing()), this._activityId};
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_PAUSE, arr_object);
    }

    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            JSONArray jSONArray1 = new JSONArray();
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                jSONArray0.put(arr_s[v1]);
            }
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                jSONArray1.put(arr_v[v2]);
            }
            this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_RESULT, new Object[]{v, jSONArray0, jSONArray1});
            return;
        }
        catch(Exception exception0) {
        }
        this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_ERROR, new Object[]{exception0.getMessage()});
    }

    public void onResume() {
        if(!this._eventSender.canSend()) {
            if(!this._adUnitActivity.isFinishing()) {
                DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onResume");
                this._adUnitActivity.finish();
            }
            return;
        }
        this.setViews(this._views);
        Map map0 = this._viewHandlers;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() != null) {
                    ((IAdUnitViewHandler)map$Entry0.getValue()).onResume(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_RESUME, new Object[]{this._activityId});
    }

    public void onSaveInstanceState(Bundle bundle0) {
        bundle0.putInt("orientation", this._orientation);
        bundle0.putInt("systemUiVisibility", this._systemUiVisibility);
        bundle0.putIntegerArrayList("keyEvents", this._keyEventList);
        bundle0.putBoolean("keepScreenOn", this._keepScreenOn);
        bundle0.putStringArray("views", this._views);
        bundle0.putInt("activityId", this._activityId);
    }

    public void onStart() {
        if(!this._eventSender.canSend()) {
            if(!this._adUnitActivity.isFinishing()) {
                DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStart");
                this._adUnitActivity.finish();
            }
            return;
        }
        Map map0 = this._viewHandlers;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() != null) {
                    ((IAdUnitViewHandler)map$Entry0.getValue()).onStart(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_START, new Object[]{this._activityId});
    }

    public void onStop() {
        if(!this._eventSender.canSend()) {
            if(!this._adUnitActivity.isFinishing()) {
                DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStop");
                this._adUnitActivity.finish();
            }
            return;
        }
        Map map0 = this._viewHandlers;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() != null) {
                    ((IAdUnitViewHandler)map$Entry0.getValue()).onStop(this._adUnitActivity);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_STOP, new Object[]{this._activityId});
    }

    public void onWindowFocusChanged(boolean z) {
        if(z) {
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_GAINED, new Object[]{this._activityId});
            return;
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_LOST, new Object[]{this._activityId});
    }

    public boolean setKeepScreenOn(boolean z) {
        this._keepScreenOn = z;
        if(this._adUnitActivity.getWindow() == null) {
            return false;
        }
        if(z) {
            this._adUnitActivity.getWindow().addFlags(0x80);
            return true;
        }
        this._adUnitActivity.getWindow().clearFlags(0x80);
        return true;
    }

    public void setKeyEventList(ArrayList arrayList0) {
        this._keyEventList = arrayList0;
    }

    public void setLayoutInDisplayCutoutMode(int v) {
        this._displayCutoutMode = v;
        if(Build.VERSION.SDK_INT >= 28 && this._adUnitActivity.getWindow() != null) {
            WindowManager.LayoutParams windowManager$LayoutParams0 = this._adUnitActivity.getWindow().getAttributes();
            try {
                windowManager$LayoutParams0.getClass().getField("layoutInDisplayCutoutMode").setInt(windowManager$LayoutParams0, v);
            }
            catch(IllegalAccessException illegalAccessException0) {
                DeviceLog.debug("Error setting layoutInDisplayCutoutMode", new Object[]{illegalAccessException0});
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                DeviceLog.debug("Error getting layoutInDisplayCutoutMode", new Object[]{noSuchFieldException0});
            }
        }
    }

    public void setOrientation(int v) {
        this._orientation = v;
        this._adUnitActivity.setRequestedOrientation(v);
    }

    public boolean setSystemUiVisibility(int v) {
        try {
            this._systemUiVisibility = v;
            this._adUnitActivity.getWindow().getDecorView().setSystemUiVisibility(v);
            return true;
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error while setting SystemUIVisibility", exception0);
            return false;
        }
    }

    public void setViewFrame(String s, int v, int v1, int v2, int v3) {
        View view0;
        IAdUnitViewHandler iAdUnitViewHandler0 = this.getViewHandler(s);
        if(s.equals("adunit")) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2, v3);
            frameLayout$LayoutParams0.setMargins(v, v1, 0, 0);
            this._layout.setLayoutParams(frameLayout$LayoutParams0);
            view0 = null;
        }
        else {
            view0 = iAdUnitViewHandler0 == null ? null : iAdUnitViewHandler0.getView();
        }
        if(view0 != null) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, v3);
            relativeLayout$LayoutParams0.setMargins(v, v1, 0, 0);
            view0.setLayoutParams(relativeLayout$LayoutParams0);
        }
    }

    public void setViews(String[] arr_s) {
        if(arr_s == null) {
            arr_s = new String[0];
        }
        ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
        if(this._views == null) {
            this._views = new String[0];
        }
        ArrayList arrayList1 = new ArrayList(Arrays.asList(this._views));
        arrayList1.removeAll(arrayList0);
        for(Object object0: arrayList1) {
            this.getViewHandler(((String)object0)).destroy();
        }
        this._views = arr_s;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s != null) {
                IAdUnitViewHandler iAdUnitViewHandler0 = this.getViewHandler(s);
                iAdUnitViewHandler0.create(this._adUnitActivity);
                if(!this.handleViewPlacement(iAdUnitViewHandler0.getView())) {
                    return;
                }
            }
        }
    }
}

