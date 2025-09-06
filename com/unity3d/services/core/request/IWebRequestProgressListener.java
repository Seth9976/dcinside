package com.unity3d.services.core.request;

import java.util.Map;

public interface IWebRequestProgressListener {
    void onRequestProgress(String arg1, long arg2, long arg3);

    void onRequestStart(String arg1, long arg2, int arg3, Map arg4);
}

