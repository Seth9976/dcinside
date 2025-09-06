package com.unity3d.services.core.request;

import java.util.Map;

public interface IWebRequestListener {
    void onComplete(String arg1, String arg2, int arg3, Map arg4);

    void onFailed(String arg1, String arg2);
}

