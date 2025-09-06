package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;

public class WebViewBridge implements IWebViewBridge {
    private HashMap _classTable;
    private static IWebViewBridge _instance;
    private final INativeCallbackSubject nativeCallbackSubject;

    private WebViewBridge(Class[] arr_class, INativeCallbackSubject iNativeCallbackSubject0) {
        this.nativeCallbackSubject = iNativeCallbackSubject0;
        if(arr_class == null) {
            return;
        }
        this._classTable = new HashMap();
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            if(class0 != null && (class0.getPackage().getName().startsWith("com.unity3d.services") || class0.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                HashMap hashMap0 = new HashMap();
                Method[] arr_method = class0.getMethods();
                for(int v1 = 0; v1 < arr_method.length; ++v1) {
                    Method method0 = arr_method[v1];
                    if(method0.getAnnotation(WebViewExposed.class) != null) {
                        String s = method0.getName();
                        HashMap hashMap1 = hashMap0.containsKey(s) ? ((HashMap)hashMap0.get(s)) : new HashMap();
                        hashMap1.put(Arrays.deepHashCode(method0.getParameterTypes()), method0);
                        hashMap0.put(s, hashMap1);
                    }
                }
                this._classTable.put(class0.getName(), hashMap0);
            }
        }
    }

    private Method findMethod(String s, String s1, Object[] arr_object) throws JSONException, NoSuchMethodException {
        if(!this._classTable.containsKey(s)) {
            throw new NoSuchMethodException();
        }
        HashMap hashMap0 = (HashMap)this._classTable.get(s);
        if(!hashMap0.containsKey(s1)) {
            throw new NoSuchMethodException();
        }
        return (Method)((HashMap)hashMap0.get(s1)).get(Arrays.deepHashCode(this.getTypes(arr_object)));
    }

    public static IWebViewBridge getInstance() {
        return WebViewBridge._instance;
    }

    private Class[] getTypes(Object[] arr_object) throws JSONException {
        Class[] arr_class = arr_object == null ? new Class[1] : new Class[arr_object.length + 1];
        if(arr_object != null) {
            for(int v = 0; v < arr_object.length; ++v) {
                arr_class[v] = arr_object[v].getClass();
            }
        }
        arr_class[arr_class.length - 1] = WebViewCallback.class;
        return arr_class;
    }

    private Object[] getValues(Object[] arr_object, WebViewCallback webViewCallback0) throws JSONException {
        Object[] arr_object1;
        if(arr_object == null) {
            if(webViewCallback0 == null) {
                return null;
            }
            arr_object1 = new Object[1];
        }
        else {
            arr_object1 = new Object[arr_object.length + (webViewCallback0 == null ? 0 : 1)];
        }
        if(arr_object != null) {
            System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
        }
        if(webViewCallback0 != null) {
            arr_object1[arr_object1.length - 1] = webViewCallback0;
        }
        return arr_object1;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleCallback(String s, String s1, Object[] arr_object) throws Exception {
        NativeCallback nativeCallback0 = this.nativeCallbackSubject.getCallback(s);
        try {
            nativeCallback0.invoke(s1, this.getValues(arr_object, null));
        }
        catch(InvocationTargetException | IllegalAccessException | JSONException | IllegalArgumentException invocationTargetException0) {
            DeviceLog.error("Error while invoking method");
            throw invocationTargetException0;
        }
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleInvocation(String s, String s1, Object[] arr_object, WebViewCallback webViewCallback0) throws Exception {
        Method method0;
        try {
            method0 = this.findMethod(s, s1, arr_object);
        }
        catch(JSONException | NoSuchMethodException jSONException0) {
            webViewCallback0.error(WebViewBridgeError.METHOD_NOT_FOUND, new Object[]{s, s1, arr_object});
            throw jSONException0;
        }
        try {
            method0.invoke(null, this.getValues(arr_object, webViewCallback0));
        }
        catch(JSONException | InvocationTargetException | IllegalAccessException | IllegalArgumentException jSONException1) {
            if(webViewCallback0 != null) {
                webViewCallback0.error(WebViewBridgeError.INVOCATION_FAILED, new Object[]{s, s1, arr_object, jSONException1.getMessage()});
            }
            throw jSONException1;
        }
    }

    public static void setClassTable(Class[] arr_class) {
        WebViewBridge._instance = new WebViewBridge(arr_class, SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }
}

