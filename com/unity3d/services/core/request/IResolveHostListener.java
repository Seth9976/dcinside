package com.unity3d.services.core.request;

public interface IResolveHostListener {
    void onFailed(String arg1, ResolveHostError arg2, String arg3);

    void onResolve(String arg1, String arg2);
}

