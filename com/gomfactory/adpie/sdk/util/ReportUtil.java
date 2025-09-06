package com.gomfactory.adpie.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.network.NetworkServiceManager;
import java.util.ArrayList;

public class ReportUtil {
    public static final String NATIVE_CLICK_TAG = "NATIVE_CLICK_TAG";
    public static final String NATIVE_IMPRESSION_TAG = "NATIVE_IMPRESSION_TAG";
    public static final String SSV_CALLBACK_TAG = "SSV_CALLBACK";
    public static final String TAG = "ReportUtil";
    public static final String VIDEO_CLICK_TAG = "VIDEO_CLICK";
    public static final String VIDEO_COMPLETE_TAG = "VIDEO_COMPLETE";
    public static final String VIDEO_FIRST_QUARTILE_TAG = "VIDEO_FIRST_QUARTILE";
    public static final String VIDEO_IMPRESSION_TAG = "VIDEO_IMPRESSION";
    public static final String VIDEO_MID_POINT_TAG = "VIDEO_MID_POINT";
    public static final String VIDEO_START_TAG = "VIDEO_START";
    public static final String VIDEO_THIRD_QUARTILE_TAG = "VIDEO_THIRD_QUARTILE";
    public static final String WEBVIEW_CLICK_TAG = "WEBVIEW_CLICK_TAG";
    public static final String WEBVIEW_IMPRESSION_TAG = "WEBVIEW_IMPRESSION_TAG";

    static {
    }

    public static void sendReport(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("ReportUtil", ":::sendReport:::" + s + " - " + s1);
            }
            NetworkServiceManager.getInstance().get(s1, new Handler(Looper.getMainLooper()) {
                @Override  // android.os.Handler
                public void handleMessage(Message message0) {
                    switch(message0.what) {
                        case -1: {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("ReportUtil", "HTTP Connection : ERROR " + (message0.obj == null ? "" : message0.obj.toString()));
                                return;
                            }
                            break;
                        }
                        case 200: {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("ReportUtil", "HTTP Connection : Success");
                                return;
                            }
                            break;
                        }
                    }
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("ReportUtil", exception0);
        }
    }

    public static void sendReport(String s, ArrayList arrayList0) {
        if(arrayList0 != null) {
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("ReportUtil", ":::sendReport:::" + s + " - " + arrayList0);
                }
                for(int v = 0; true; ++v) {
                    if(v >= arrayList0.size()) {
                        return;
                    }
                    ReportUtil.sendReport(s, ((String)arrayList0.get(v)));
                }
            }
            catch(Exception exception0) {
            }
            if(!AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                return;
            }
            AdPieLog.e("ReportUtil", exception0);
        }
    }
}

