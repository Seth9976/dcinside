package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.L;
import y4.l;

public final class SharedInstances {
    @l
    public static final SharedInstances INSTANCE;
    @l
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    @l
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject;
    @l
    private static final IWebViewBridge webViewBridge;
    @l
    private static final IEventSender webViewEventSender;

    static {
        SharedInstances.INSTANCE = new SharedInstances();
        SharedInstances.webViewAppInvocationCallbackInvoker = (Invocation invocation0) -> {
            L.p(invocation0, "it");
            WebViewApp.getCurrentApp().invokeCallback(invocation0);
        };
        SharedInstances.webViewAppNativeCallbackSubject = new SharedInstances.webViewAppNativeCallbackSubject.1();
        SharedInstances.webViewEventSender = new SharedInstances.webViewEventSender.1();
        SharedInstances.webViewBridge = new SharedInstances.webViewBridge.1();
    }

    @l
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return SharedInstances.webViewAppInvocationCallbackInvoker;
    }

    @l
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return SharedInstances.webViewAppNativeCallbackSubject;
    }

    @l
    public final IWebViewBridge getWebViewBridge() {
        return SharedInstances.webViewBridge;
    }

    @l
    public final IEventSender getWebViewEventSender() {
        return SharedInstances.webViewEventSender;
    }

    // 检测为 Lambda 实现
    private static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation invocation0) [...]
}

