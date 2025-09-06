package com.unity3d.services.core.api;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestListener;
import com.unity3d.services.core.request.WebRequest.RequestType;
import com.unity3d.services.core.request.WebRequestError;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class Request {
    @WebViewExposed
    public static void get(String s, String s1, JSONArray jSONArray0, Integer integer0, Integer integer1, WebViewCallback webViewCallback0) {
        HashMap hashMap0;
        if(jSONArray0 != null && jSONArray0.length() == 0) {
            jSONArray0 = null;
        }
        try {
            hashMap0 = Request.getHeadersMap(jSONArray0);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error mapping headers for the request", exception0);
            webViewCallback0.error(WebRequestError.MAPPING_HEADERS_FAILED, new Object[]{s});
            return;
        }
        com.unity3d.services.core.api.Request.1 request$10 = new IWebRequestListener() {
            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onComplete(String s, String s1, int v, Map map0) {
                JSONArray jSONArray0;
                try {
                    jSONArray0 = Request.getResponseHeadersMap(map0);
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Error parsing response headers", exception0);
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, "Error parsing response headers"});
                    return;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, new Object[]{s, s, s1, v, jSONArray0});
            }

            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onFailed(String s, String s1) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, s1});
            }
        };
        WebRequestThread.request(s1, RequestType.GET, hashMap0, null, integer0, integer1, request$10);
        webViewCallback0.invoke(new Object[]{s});
    }

    public static HashMap getHeadersMap(JSONArray jSONArray0) throws JSONException {
        if(jSONArray0 != null) {
            HashMap hashMap0 = new HashMap();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONArray jSONArray1 = (JSONArray)jSONArray0.get(v);
                List list0 = (List)hashMap0.get(jSONArray1.getString(0));
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(jSONArray1.getString(1));
                hashMap0.put(jSONArray1.getString(0), list0);
            }
            return hashMap0;
        }
        return null;
    }

    public static JSONArray getResponseHeadersMap(Map map0) {
        JSONArray jSONArray0 = new JSONArray();
        if(map0 != null && map0.size() > 0) {
            for(Object object0: map0.keySet()) {
                String s = (String)object0;
                JSONArray jSONArray1 = null;
                for(Object object1: ((List)map0.get(s))) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(s);
                    jSONArray2.put(((String)object1));
                    jSONArray1 = jSONArray2;
                }
                jSONArray0.put(jSONArray1);
            }
        }
        return jSONArray0;
    }

    @WebViewExposed
    public static void head(String s, String s1, JSONArray jSONArray0, Integer integer0, Integer integer1, WebViewCallback webViewCallback0) {
        HashMap hashMap0;
        if(jSONArray0 != null && jSONArray0.length() == 0) {
            jSONArray0 = null;
        }
        try {
            hashMap0 = Request.getHeadersMap(jSONArray0);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error mapping headers for the request", exception0);
            webViewCallback0.error(WebRequestError.MAPPING_HEADERS_FAILED, new Object[]{s});
            return;
        }
        com.unity3d.services.core.api.Request.3 request$30 = new IWebRequestListener() {
            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onComplete(String s, String s1, int v, Map map0) {
                JSONArray jSONArray0;
                try {
                    jSONArray0 = Request.getResponseHeadersMap(map0);
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Error parsing response headers", exception0);
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, "Error parsing response headers"});
                    return;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, new Object[]{s, s, s1, v, jSONArray0});
            }

            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onFailed(String s, String s1) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, s1});
            }
        };
        WebRequestThread.request(s1, RequestType.HEAD, hashMap0, integer0, integer1, request$30);
        webViewCallback0.invoke(new Object[]{s});
    }

    @WebViewExposed
    public static void post(String s, String s1, String s2, JSONArray jSONArray0, Integer integer0, Integer integer1, WebViewCallback webViewCallback0) {
        HashMap hashMap0;
        JSONArray jSONArray1 = null;
        String s3 = s2 == null || s2.length() != 0 ? s2 : null;
        if(jSONArray0 == null || jSONArray0.length() != 0) {
            jSONArray1 = jSONArray0;
        }
        try {
            hashMap0 = Request.getHeadersMap(jSONArray1);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error mapping headers for the request", exception0);
            webViewCallback0.error(WebRequestError.MAPPING_HEADERS_FAILED, new Object[]{s});
            return;
        }
        com.unity3d.services.core.api.Request.2 request$20 = new IWebRequestListener() {
            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onComplete(String s, String s1, int v, Map map0) {
                JSONArray jSONArray0;
                try {
                    jSONArray0 = Request.getResponseHeadersMap(map0);
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Error parsing response headers", exception0);
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, "Error parsing response headers"});
                    return;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, new Object[]{s, s, s1, v, jSONArray0});
            }

            @Override  // com.unity3d.services.core.request.IWebRequestListener
            public void onFailed(String s, String s1) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, new Object[]{s, s, s1});
            }
        };
        WebRequestThread.request(s1, RequestType.POST, hashMap0, s3, integer0, integer1, request$20);
        webViewCallback0.invoke(new Object[]{s});
    }

    @WebViewExposed
    public static void setConcurrentRequestCount(Integer integer0, WebViewCallback webViewCallback0) {
        WebRequestThread.setConcurrentRequestCount(((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setKeepAliveTime(Integer integer0, WebViewCallback webViewCallback0) {
        WebRequestThread.setKeepAliveTime(integer0.longValue());
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setMaximumPoolSize(Integer integer0, WebViewCallback webViewCallback0) {
        WebRequestThread.setMaximumPoolSize(((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }
}

