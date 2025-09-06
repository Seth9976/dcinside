package com.unity3d.services.core.webview.bridge;

import java.lang.reflect.Method;

public interface IWebViewBridgeInvoker {
    boolean invokeMethod(String arg1, String arg2, Method arg3, Object[] arg4);
}

