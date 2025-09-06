package com.unity3d.services.core.webview.bridge.invocation;

import android.os.ConditionVariable;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.lang.reflect.Method;

public class WebViewBridgeInvocationRunnable implements Runnable {
    private static CallbackStatus _callbackStatus;
    private String _className;
    private IWebViewBridgeInvocationCallback _invocationCallback;
    private Object[] _invocationParameters;
    private String _methodName;
    private static ConditionVariable _responseTimeout;
    private int _timeoutLengthInMilliSeconds;
    private Method _webViewBridgeCallbackMethod;
    private IWebViewBridgeInvoker _webViewBridgeInvoker;

    public WebViewBridgeInvocationRunnable(IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback0, IWebViewBridgeInvoker iWebViewBridgeInvoker0, String s, String s1, int v, Object[] arr_object) {
        try {
            this._webViewBridgeCallbackMethod = WebViewBridgeInvocationRunnable.class.getMethod("onInvocationComplete", CallbackStatus.class);
            this._invocationCallback = iWebViewBridgeInvocationCallback0;
            this._webViewBridgeInvoker = iWebViewBridgeInvoker0;
            this._className = s;
            this._methodName = s1;
            this._timeoutLengthInMilliSeconds = v;
            this._invocationParameters = arr_object;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", noSuchMethodException0);
        }
    }

    public static void onInvocationComplete(CallbackStatus callbackStatus0) {
        synchronized(WebViewBridgeInvocationRunnable.class) {
            WebViewBridgeInvocationRunnable._callbackStatus = callbackStatus0;
            ConditionVariable conditionVariable0 = WebViewBridgeInvocationRunnable._responseTimeout;
            if(conditionVariable0 != null) {
                conditionVariable0.open();
            }
        }
    }

    @Override
    public void run() {
        WebViewBridgeInvocationRunnable._callbackStatus = null;
        WebViewBridgeInvocationRunnable._responseTimeout = new ConditionVariable();
        boolean z = this._webViewBridgeInvoker.invokeMethod(this._className, this._methodName, this._webViewBridgeCallbackMethod, this._invocationParameters);
        IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback0 = this._invocationCallback;
        if(iWebViewBridgeInvocationCallback0 == null) {
            return;
        }
        if(!z) {
            iWebViewBridgeInvocationCallback0.onFailure("WebViewBridgeInvocationRunnable:run: invokeMethod failure", null);
            return;
        }
        if(WebViewBridgeInvocationRunnable._responseTimeout.block(((long)this._timeoutLengthInMilliSeconds))) {
            if(WebViewBridgeInvocationRunnable._callbackStatus == CallbackStatus.OK) {
                this._invocationCallback.onSuccess();
                return;
            }
            this._invocationCallback.onFailure("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", WebViewBridgeInvocationRunnable._callbackStatus);
            return;
        }
        this._invocationCallback.onTimeout();
    }
}

