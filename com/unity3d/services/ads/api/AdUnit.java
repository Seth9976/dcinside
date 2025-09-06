package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.adunit.AdUnitMotionEvent;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.IAdUnitActivity;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdUnit {
    private static IAdUnitActivity _adUnitActivity = null;
    private static int _currentActivityId = -1;

    static {
    }

    @WebViewExposed
    public static void clearMotionEventCapture(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                AdUnit.getAdUnitActivity().getLayout().clearCapture();
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void close(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            AdUnit.getAdUnitActivity().finish();
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void endMotionEventCapture(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                AdUnit.getAdUnitActivity().getLayout().endCapture();
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    public static IAdUnitActivity getAdUnitActivity() {
        return AdUnit._adUnitActivity;
    }

    public static int getCurrentAdUnitActivityId() [...] // 潜在的解密器

    @WebViewExposed
    public static void getCurrentMotionEventCount(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                webViewCallback0.invoke(new Object[]{AdUnit.getAdUnitActivity().getLayout().getCurrentEventCount()});
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    private static ArrayList getKeyEventList(JSONArray jSONArray0) throws JSONException {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; v = ((int)integer0) + 1) {
            Integer integer0 = v;
            if(((int)integer0) >= jSONArray0.length()) {
                break;
            }
            arrayList0.add(jSONArray0.getInt(((int)integer0)));
        }
        return arrayList0;
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                arrayList0.add(jSONArray0.getInt(v));
            }
            catch(Exception exception0) {
                DeviceLog.exception("Error retrieving int from eventTypes", exception0);
            }
        }
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                if(AdUnit.getAdUnitActivity().getLayout().getCurrentEventCount() >= AdUnit.getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback0.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseIntArray sparseIntArray0 = AdUnit.getAdUnitActivity().getLayout().getEventCount(arrayList0);
                JSONObject jSONObject0 = new JSONObject();
                for(int v1 = 0; v1 < sparseIntArray0.size(); ++v1) {
                    int v2 = sparseIntArray0.keyAt(v1);
                    int v3 = sparseIntArray0.get(v2);
                    try {
                        jSONObject0.put(Integer.toString(v2), v3);
                    }
                    catch(Exception exception1) {
                        DeviceLog.exception("Error building response JSON", exception1);
                    }
                }
                webViewCallback0.invoke(new Object[]{jSONObject0});
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject0, WebViewCallback webViewCallback0) {
        JSONArray jSONArray0;
        Iterator iterator0 = jSONObject0.keys();
        SparseArray sparseArray0 = new SparseArray();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            int v = Integer.parseInt(s);
            if(sparseArray0.get(v) == null) {
                sparseArray0.put(v, new ArrayList());
            }
            try {
                jSONArray0 = jSONObject0.getJSONArray(s);
            }
            catch(Exception exception0) {
                DeviceLog.exception("Couldn\'t fetch keyIndices", exception0);
                jSONArray0 = null;
            }
            if(jSONArray0 != null) {
                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                    try {
                        ((ArrayList)sparseArray0.get(v)).add(jSONArray0.getInt(v1));
                    }
                    catch(Exception exception1) {
                        DeviceLog.exception("Couldn\'t add value to requested infos", exception1);
                    }
                }
            }
        }
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                if(AdUnit.getAdUnitActivity().getLayout().getCurrentEventCount() >= AdUnit.getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback0.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseArray sparseArray1 = AdUnit.getAdUnitActivity().getLayout().getEvents(sparseArray0);
                JSONObject jSONObject1 = new JSONObject();
                for(int v2 = 0; v2 < sparseArray1.size(); ++v2) {
                    int v3 = sparseArray1.keyAt(v2);
                    SparseArray sparseArray2 = (SparseArray)sparseArray1.get(v3);
                    JSONObject jSONObject2 = new JSONObject();
                    for(int v4 = 0; v4 < sparseArray2.size(); ++v4) {
                        JSONObject jSONObject3 = new JSONObject();
                        int v5 = sparseArray2.keyAt(v4);
                        AdUnitMotionEvent adUnitMotionEvent0 = (AdUnitMotionEvent)sparseArray2.get(v5);
                        try {
                            jSONObject3.put("action", adUnitMotionEvent0.getAction());
                            jSONObject3.put("isObscured", adUnitMotionEvent0.isObscured());
                            jSONObject3.put("toolType", adUnitMotionEvent0.getToolType());
                            jSONObject3.put("source", adUnitMotionEvent0.getSource());
                            jSONObject3.put("deviceId", adUnitMotionEvent0.getDeviceId());
                            jSONObject3.put("x", ((double)adUnitMotionEvent0.getX()));
                            jSONObject3.put("y", ((double)adUnitMotionEvent0.getY()));
                            jSONObject3.put("eventTime", adUnitMotionEvent0.getEventTime());
                            jSONObject3.put("pressure", ((double)adUnitMotionEvent0.getPressure()));
                            jSONObject3.put("size", ((double)adUnitMotionEvent0.getSize()));
                            jSONObject2.put(Integer.toString(v5), jSONObject3);
                        }
                        catch(Exception exception2) {
                            DeviceLog.debug("Couldn\'t construct event info", new Object[]{exception2});
                        }
                    }
                    try {
                        jSONObject1.put(Integer.toString(v3), jSONObject2);
                    }
                    catch(Exception exception3) {
                        DeviceLog.debug("Couldn\'t construct info object", new Object[]{exception3});
                    }
                }
                webViewCallback0.invoke(new Object[]{jSONObject1});
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getOrientation(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{AdUnit.getAdUnitActivity().getRequestedOrientation()});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getSafeAreaInsets(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null && AdUnit.getAdUnitActivity().getLayout() != null) {
            if(Build.VERSION.SDK_INT >= 28) {
                WindowInsets windowInsets0 = AdUnit.getAdUnitActivity().getLayout().getRootWindowInsets();
                if(windowInsets0 != null) {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        Object object0 = windowInsets0.getClass().getMethod("getDisplayCutout", null).invoke(windowInsets0, null);
                        if(object0 != null) {
                            Object object1 = object0.getClass().getMethod("getSafeInsetTop", null).invoke(object0, null);
                            Object object2 = object0.getClass().getMethod("getSafeInsetRight", null).invoke(object0, null);
                            Object object3 = object0.getClass().getMethod("getSafeInsetBottom", null).invoke(object0, null);
                            Object object4 = object0.getClass().getMethod("getSafeInsetLeft", null).invoke(object0, null);
                            jSONObject0.put("top", object1);
                            jSONObject0.put("right", object2);
                            jSONObject0.put("bottom", object3);
                            jSONObject0.put("left", object4);
                            webViewCallback0.invoke(new Object[]{jSONObject0});
                            return;
                        }
                        webViewCallback0.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                        return;
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                    }
                    catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                        webViewCallback0.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                        DeviceLog.debug("Error while calling displayCutout getter", new Object[]{illegalAccessException0});
                        return;
                    }
                    catch(JSONException jSONException0) {
                        webViewCallback0.error(AdUnitError.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
                        DeviceLog.debug("JSON error while constructing display cutout object", new Object[]{jSONException0});
                        return;
                    }
                    webViewCallback0.error(AdUnitError.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
                    DeviceLog.debug("Method getDisplayCutout not found", new Object[]{noSuchMethodException0});
                    return;
                }
                webViewCallback0.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                return;
            }
            webViewCallback0.error(AdUnitError.API_LEVEL_ERROR, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getViewFrame(String s, WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getViewFrame(s) != null) {
                Map map0 = AdUnit.getAdUnitActivity().getViewFrame(s);
                webViewCallback0.invoke(new Object[]{map0.get("x"), map0.get("y"), map0.get("width"), map0.get("height")});
                return;
            }
            webViewCallback0.error(AdUnitError.UNKNOWN_VIEW, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    private static String[] getViewList(JSONArray jSONArray0) throws JSONException {
        String[] arr_s = new String[jSONArray0.length()];
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arr_s[v] = jSONArray0.getString(v);
        }
        return arr_s;
    }

    @WebViewExposed
    public static void getViews(WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{new JSONArray(Arrays.asList(AdUnit.getAdUnitActivity().getViews()))});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void open(Integer integer0, JSONArray jSONArray0, Integer integer1, WebViewCallback webViewCallback0) {
        AdUnit.open(integer0, jSONArray0, integer1, null, webViewCallback0);
    }

    @WebViewExposed
    public static void open(Integer integer0, JSONArray jSONArray0, Integer integer1, JSONArray jSONArray1, WebViewCallback webViewCallback0) {
        AdUnit.open(integer0, jSONArray0, integer1, jSONArray1, 0, Boolean.TRUE, webViewCallback0);
    }

    @WebViewExposed
    public static void open(Integer integer0, JSONArray jSONArray0, Integer integer1, JSONArray jSONArray1, Integer integer2, Boolean boolean0, WebViewCallback webViewCallback0) {
        AdUnit.open(integer0, jSONArray0, integer1, jSONArray1, integer2, boolean0, Boolean.FALSE, webViewCallback0);
    }

    @WebViewExposed
    public static void open(Integer integer0, JSONArray jSONArray0, Integer integer1, JSONArray jSONArray1, Integer integer2, Boolean boolean0, Boolean boolean1, WebViewCallback webViewCallback0) {
        AdUnit.open(integer0, jSONArray0, integer1, jSONArray1, integer2, boolean0, boolean1, 0, webViewCallback0);
    }

    @WebViewExposed
    public static void open(Integer integer0, JSONArray jSONArray0, Integer integer1, JSONArray jSONArray1, Integer integer2, Boolean boolean0, Boolean boolean1, Integer integer3, WebViewCallback webViewCallback0) {
        Intent intent0;
        if(!boolean0.booleanValue() && boolean1.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent0 = new Intent(ClientProperties.getActivity(), AdUnitTransparentSoftwareActivity.class);
        }
        else if(boolean0.booleanValue() && !boolean1.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated ad unit activity");
            intent0 = new Intent(ClientProperties.getActivity(), AdUnitActivity.class);
        }
        else if(!boolean0.booleanValue() || !boolean1.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent0 = new Intent(ClientProperties.getActivity(), AdUnitSoftwareActivity.class);
        }
        else {
            DeviceLog.debug("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent0 = new Intent(ClientProperties.getActivity(), AdUnitTransparentActivity.class);
        }
        intent0.addFlags(0x10010000);
        if(integer0 != null) {
            try {
                intent0.putExtra("activityId", ((int)integer0));
            }
            catch(Exception exception0) {
                DeviceLog.exception("Could not set activityId for intent", exception0);
                webViewCallback0.error(AdUnitError.ACTIVITY_ID, new Object[]{integer0, exception0.getMessage()});
                return;
            }
            AdUnit.setCurrentAdUnitActivityId(((int)integer0));
            try {
                intent0.putExtra("views", AdUnit.getViewList(jSONArray0));
            }
            catch(Exception exception1) {
                DeviceLog.exception("Error parsing views from viewList", exception1);
                webViewCallback0.error(AdUnitError.CORRUPTED_VIEWLIST, new Object[]{jSONArray0, exception1.getMessage()});
                return;
            }
            if(jSONArray1 != null) {
                try {
                    intent0.putExtra("keyEvents", AdUnit.getKeyEventList(jSONArray1));
                }
                catch(Exception exception2) {
                    DeviceLog.exception("Error parsing views from viewList", exception2);
                    webViewCallback0.error(AdUnitError.CORRUPTED_KEYEVENTLIST, new Object[]{jSONArray1, exception2.getMessage()});
                    return;
                }
            }
            intent0.putExtra("systemUiVisibility", integer2);
            intent0.putExtra("orientation", integer1);
            intent0.putExtra("displayCutoutMode", integer3);
            ClientProperties.getActivity().startActivity(intent0);
            DeviceLog.debug(("Opened AdUnitActivity with: " + jSONArray0.toString()));
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        DeviceLog.error("Activity ID is NULL");
        webViewCallback0.error(AdUnitError.ACTIVITY_ID, new Object[]{"Activity ID NULL"});
    }

    public static void setAdUnitActivity(IAdUnitActivity iAdUnitActivity0) {
        AdUnit._adUnitActivity = iAdUnitActivity0;
    }

    public static void setCurrentAdUnitActivityId(int v) {
        AdUnit._currentActivityId = v;
    }

    @WebViewExposed
    public static void setKeepScreenOn(Boolean boolean0, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setKeepScreenOn(boolean0.booleanValue());
                }
            }
        });
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            try {
                AdUnit.getAdUnitActivity().setKeyEventList(AdUnit.getKeyEventList(jSONArray0));
                webViewCallback0.invoke(new Object[]{jSONArray0});
            }
            catch(Exception exception0) {
                DeviceLog.exception("Error parsing views from viewList", exception0);
                webViewCallback0.error(AdUnitError.CORRUPTED_KEYEVENTLIST, new Object[]{jSONArray0, exception0.getMessage()});
            }
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(Integer integer0, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setLayoutInDisplayCutoutMode(((int)integer0));
                }
            }
        });
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{integer0});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setOrientation(Integer integer0, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setOrientation(((int)integer0));
                }
            }
        });
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{integer0});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setSystemUiVisibility(Integer integer0, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setSystemUiVisibility(((int)integer0));
                }
            }
        });
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{integer0});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setViewFrame(String s, Integer integer0, Integer integer1, Integer integer2, Integer integer3, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setViewFrame(s, ((int)integer0), ((int)integer1), ((int)integer2), ((int)integer3));
                }
            }
        });
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setViews(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        try {
            AdUnit.getViewList(jSONArray0);
        }
        catch(JSONException unused_ex) {
            webViewCallback0.error(AdUnitError.CORRUPTED_VIEWLIST, new Object[]{jSONArray0});
            goto label_5;
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AdUnit.getAdUnitActivity() != null) {
                    try {
                        AdUnit.getAdUnitActivity().setViews(AdUnit.getViewList(jSONArray0));
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception("Corrupted viewlist", exception0);
                    }
                }
            }
        });
    label_5:
        if(AdUnit.getAdUnitActivity() != null) {
            webViewCallback0.invoke(new Object[]{jSONArray0});
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer integer0, WebViewCallback webViewCallback0) {
        if(AdUnit.getAdUnitActivity() != null) {
            if(AdUnit.getAdUnitActivity().getLayout() != null) {
                AdUnit.getAdUnitActivity().getLayout().startCapture(((int)integer0));
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            webViewCallback0.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }
}

