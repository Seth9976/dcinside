package com.unity3d.services.core.request;

import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebRequestRunnable implements Runnable {
    private final String _body;
    private boolean _canceled;
    private final int _connectTimeout;
    private WebRequest _currentRequest;
    private final Map _headers;
    private final IWebRequestListener _listener;
    private final int _readTimeout;
    private final String _type;
    private final String _url;

    public WebRequestRunnable(String s, String s1, String s2, int v, int v1, Map map0, IWebRequestListener iWebRequestListener0) {
        this._canceled = false;
        this._url = s;
        this._type = s1;
        this._body = s2;
        this._connectTimeout = v;
        this._readTimeout = v1;
        this._headers = map0;
        this._listener = iWebRequestListener0;
    }

    private Map getResponseHeaders(Bundle bundle0) {
        if(!bundle0.isEmpty()) {
            Map map0 = new HashMap();
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                String[] arr_s = bundle0.getStringArray(s);
                if(arr_s != null) {
                    map0.put(s, new ArrayList(Arrays.asList(arr_s)));
                }
            }
            return map0;
        }
        return null;
    }

    private void makeRequest(String s, String s1, Map map0, String s2, int v, int v1) throws MalformedURLException {
        String s3;
        if(this._canceled) {
            return;
        }
        WebRequest webRequest0 = new WebRequest(s, s1, map0, v, v1);
        this._currentRequest = webRequest0;
        if(s2 != null) {
            webRequest0.setBody(s2);
        }
        try {
            s3 = this._currentRequest.makeRequest();
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error completing request", exception0);
            this.onFailed(exception0.getClass().getName() + ": " + exception0.getMessage());
            return;
        }
        if(this._currentRequest.isCanceled()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        Map map1 = this._currentRequest.getResponseHeaders();
        if(map1 != null) {
            for(Object object0: map1.keySet()) {
                String s4 = (String)object0;
                if(s4 != null && !s4.contentEquals("null")) {
                    String[] arr_s = new String[((List)map1.get(s4)).size()];
                    for(int v2 = 0; v2 < ((List)map1.get(s4)).size(); ++v2) {
                        arr_s[v2] = (String)((List)map1.get(s4)).get(v2);
                    }
                    bundle0.putStringArray(s4, arr_s);
                }
            }
        }
        if(this._currentRequest.isCanceled()) {
            return;
        }
        this.onSucceed(s3, this._currentRequest.getResponseCode(), this.getResponseHeaders(bundle0));
    }

    private void onFailed(String s) {
        this._listener.onFailed(this._url, s);
    }

    private void onSucceed(String s, int v, Map map0) {
        this._listener.onComplete(this._url, s, v, map0);
    }

    @Override
    public void run() {
        DeviceLog.debug(("Handling request message: " + this._url + " type=" + this._type));
        try {
            this.makeRequest(this._url, this._type, this._headers, this._body, this._connectTimeout, this._readTimeout);
        }
        catch(MalformedURLException malformedURLException0) {
            DeviceLog.exception("Malformed URL", malformedURLException0);
            this.onFailed("Malformed URL");
        }
        catch(Error unused_ex) {
            DeviceLog.error("Out of memory error while doing web request.");
            ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap() {
                {
                    this.put("src", "WebRequestRunnable");
                    this.put("url", webRequestRunnable0._url);
                    this.put("type", webRequestRunnable0._type);
                }
            });
            this.onFailed("Out of memory error while doing web request.");
        }
    }

    public void setCancelStatus(boolean z) {
        this._canceled = z;
        if(z) {
            WebRequest webRequest0 = this._currentRequest;
            if(webRequest0 != null) {
                webRequest0.cancel();
            }
        }
    }
}

