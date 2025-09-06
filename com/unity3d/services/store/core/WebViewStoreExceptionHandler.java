package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import y4.l;

public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    @l
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(@l WebViewErrorHandler webViewErrorHandler0) {
        L.p(webViewErrorHandler0, "_webViewErrorHandler");
        super();
        this._webViewErrorHandler = webViewErrorHandler0;
    }

    private final StoreError getStoreError(Exception exception0) {
        if(exception0 instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if(exception0 instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if(exception0 instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if(exception0 instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        return exception0 instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : StoreError.UNKNOWN_ERROR;
    }

    @Override  // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@l StoreEvent storeEvent0, int v, @l Exception exception0) {
        L.p(storeEvent0, "storeEvent");
        L.p(exception0, "exception");
        this.sendErrorToWebView(storeEvent0, this.getStoreError(exception0), v, exception0);
    }

    private final void sendErrorToWebView(StoreEvent storeEvent0, StoreError storeError0, int v, Exception exception0) {
        StoreWebViewError storeWebViewError0 = new StoreWebViewError(storeEvent0, exception0.getMessage(), new Object[]{v, storeError0, exception0.getMessage()});
        this._webViewErrorHandler.handleError(storeWebViewError0);
    }
}

