package com.gomfactory.adpie.sdk.util;

import android.os.Handler;
import android.os.Message;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtil {
    public static final int BACKGROUND_ASYNC_REDIRECT = 100;
    public static final String TAG = "HttpUtil";

    static {
    }

    public static void getFinalURL(String s, Handler handler0) {
        new AsyncTaskUtil() {
            @Override  // com.gomfactory.adpie.sdk.util.AsyncTaskUtil
            public void doInBackground() {
                String s = HttpUtil.tryConnectUrl(s, 0);
                Handler handler0 = handler0;
                if(handler0 != null) {
                    Message message0 = handler0.obtainMessage();
                    message0.what = 100;
                    message0.obj = s;
                    handler0.sendMessage(message0);
                }
            }
        }.execute();
    }

    public static String tryConnectUrl(String s, int v) {
        try {
            URL uRL0 = new URL(s);
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setRequestProperty("User-Agent", AdPieSDK.getInstance().getCommonHeader().getUserAgent());
            httpURLConnection0.connect();
            int v1 = httpURLConnection0.getResponseCode();
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("HttpUtil", "[tryConnectUrl] ResponseCode : " + v1);
            }
            if(v1 == 301 || v1 == 302 || v1 == 303) {
                String s1 = httpURLConnection0.getHeaderField("Location");
                if(s1.startsWith("/")) {
                    s1 = uRL0.getProtocol() + "://" + uRL0.getHost() + s1;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("HttpUtil", "[tryConnectUrl] Location : " + s1 + "\ncount : " + (v + 1));
                }
                if(v + 1 <= 20) {
                    return HttpUtil.tryConnectUrl(s1, v + 1);
                }
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("HttpUtil", exception0);
        }
        return s;
    }
}

