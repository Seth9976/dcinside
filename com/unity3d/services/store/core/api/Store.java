package com.unity3d.services.store.core.api;

import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.WebViewStoreExceptionHandler;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class Store {
    private static final WebViewStoreExceptionHandler WEB_VIEW_STORE_EXCEPTION_HANDLER;
    private static final StoreEventListenerFactory storeEventListenerFactory;
    private static final StoreMonitor storeMonitor;

    static {
        WebViewStoreExceptionHandler webViewStoreExceptionHandler0 = new WebViewStoreExceptionHandler(new WebViewErrorHandler());
        Store.WEB_VIEW_STORE_EXCEPTION_HANDLER = webViewStoreExceptionHandler0;
        Store.storeEventListenerFactory = (StoreEventListenerFactory)Utilities.getService(StoreEventListenerFactory.class);
        Store.storeMonitor = new StoreMonitor(webViewStoreExceptionHandler0);
    }

    @WebViewExposed
    public static void getPurchaseHistory(Integer integer0, String s, Integer integer1, WebViewCallback webViewCallback0) {
        StoreMonitor storeMonitor0 = Store.storeMonitor;
        if(!storeMonitor0.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        storeMonitor0.getPurchaseHistory(((int)integer0), s, ((int)integer1), Store.storeEventListenerFactory.invoke(((int)integer0)));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getPurchases(Integer integer0, String s, WebViewCallback webViewCallback0) {
        StoreMonitor storeMonitor0 = Store.storeMonitor;
        if(!storeMonitor0.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        storeMonitor0.getPurchases(((int)integer0), s, Store.storeEventListenerFactory.invoke(((int)integer0)));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getSkuDetails(Integer integer0, String s, JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        if(!Store.storeMonitor.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(jSONArray0.getString(v));
            }
            StoreEventListener storeEventListener0 = Store.storeEventListenerFactory.invoke(((int)integer0));
            Store.storeMonitor.getSkuDetails(((int)integer0), s, arrayList0, storeEventListener0);
        }
        catch(JSONException jSONException0) {
            Store.WEB_VIEW_STORE_EXCEPTION_HANDLER.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, ((int)integer0), jSONException0);
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initialize(WebViewCallback webViewCallback0) {
        try {
            StoreEventListener storeEventListener0 = Store.storeEventListenerFactory.invoke();
            Store.storeMonitor.initialize(storeEventListener0);
            webViewCallback0.invoke(new Object[0]);
        }
        catch(Exception exception0) {
            Object[] arr_object = {exception0.getMessage(), exception0.getClass().getName()};
            webViewCallback0.error(StoreError.UNKNOWN_ERROR, arr_object);
        }
    }

    @WebViewExposed
    public static void isFeatureSupported(Integer integer0, String s, WebViewCallback webViewCallback0) {
        if(!Store.storeMonitor.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        new Thread(() -> {
            StoreEventListener storeEventListener0 = Store.storeEventListenerFactory.invoke(((int)integer0));
            Store.storeMonitor.isFeatureSupported(((int)integer0), s, storeEventListener0);
        }).start();
        webViewCallback0.invoke(new Object[0]);
    }

    // 检测为 Lambda 实现
    private static void lambda$isFeatureSupported$0(Integer integer0, String s) [...]

    @WebViewExposed
    public static void startPurchaseTracking(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        if(!Store.storeMonitor.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            try {
                if(v >= jSONArray0.length()) {
                    break;
                }
                arrayList0.add(jSONArray0.getString(v));
            }
            catch(JSONException jSONException0) {
                webViewCallback0.error(StoreError.JSON_ERROR, new Object[]{jSONException0.getMessage()});
                return;
            }
        }
        StoreEventListener storeEventListener0 = Store.storeEventListenerFactory.invoke(-1, true);
        Store.storeMonitor.startPurchaseTracking(arrayList0, storeEventListener0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void stopPurchaseTracking(WebViewCallback webViewCallback0) {
        StoreMonitor storeMonitor0 = Store.storeMonitor;
        if(!storeMonitor0.isInitialized()) {
            webViewCallback0.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        storeMonitor0.stopPurchaseTracking();
        webViewCallback0.invoke(new Object[0]);
    }
}

