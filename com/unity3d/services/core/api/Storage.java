package com.unity3d.services.core.api;

import com.unity3d.services.core.device.StorageError;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Storage {
    @WebViewExposed
    public static void clear(String s, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            if(storage0.clearStorage()) {
                webViewCallback0.invoke(new Object[]{s});
                return;
            }
            webViewCallback0.error(StorageError.COULDNT_CLEAR_STORAGE, new Object[]{s});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s});
    }

    @WebViewExposed
    public static void delete(String s, String s1, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            if(storage0.delete(s1)) {
                webViewCallback0.invoke(new Object[]{s});
                return;
            }
            webViewCallback0.error(StorageError.COULDNT_DELETE_VALUE, new Object[]{s});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s});
    }

    @WebViewExposed
    public static void get(String s, String s1, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            Object object0 = storage0.get(s1);
            if(object0 == null) {
                webViewCallback0.error(StorageError.COULDNT_GET_VALUE, new Object[]{s1});
                return;
            }
            webViewCallback0.invoke(new Object[]{object0});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void getKeys(String s, String s1, Boolean boolean0, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            List list0 = storage0.getKeys(s1, boolean0.booleanValue());
            if(list0 != null) {
                webViewCallback0.invoke(new Object[]{new JSONArray(list0)});
                return;
            }
            webViewCallback0.invoke(new Object[]{new JSONArray()});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s, s1});
    }

    private static com.unity3d.services.core.device.Storage getStorage(String s) {
        return StorageManager.getStorage(StorageType.valueOf(s));
    }

    @WebViewExposed
    public static void read(String s, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            storage0.readStorage();
            webViewCallback0.invoke(new Object[]{s});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s});
    }

    @WebViewExposed
    public static void set(String s, String s1, Boolean boolean0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, boolean0, webViewCallback0);
    }

    @WebViewExposed
    public static void set(String s, String s1, Double double0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, double0, webViewCallback0);
    }

    @WebViewExposed
    public static void set(String s, String s1, Integer integer0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, integer0, webViewCallback0);
    }

    @WebViewExposed
    public static void set(String s, String s1, Long long0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, long0, webViewCallback0);
    }

    public static void set(String s, String s1, Object object0, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            if(storage0.set(s1, object0)) {
                webViewCallback0.invoke(new Object[]{s1});
                return;
            }
            webViewCallback0.error(StorageError.COULDNT_SET_VALUE, new Object[]{s1});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void set(String s, String s1, String s2, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, s2, webViewCallback0);
    }

    @WebViewExposed
    public static void set(String s, String s1, JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, jSONArray0, webViewCallback0);
    }

    @WebViewExposed
    public static void set(String s, String s1, JSONObject jSONObject0, WebViewCallback webViewCallback0) {
        Storage.set(s, s1, jSONObject0, webViewCallback0);
    }

    @WebViewExposed
    public static void write(String s, WebViewCallback webViewCallback0) {
        com.unity3d.services.core.device.Storage storage0 = Storage.getStorage(s);
        if(storage0 != null) {
            if(storage0.writeStorage()) {
                webViewCallback0.invoke(new Object[]{s});
                return;
            }
            webViewCallback0.error(StorageError.COULDNT_WRITE_STORAGE_TO_CACHE, new Object[]{s});
            return;
        }
        webViewCallback0.error(StorageError.COULDNT_GET_STORAGE, new Object[]{s});
    }
}

