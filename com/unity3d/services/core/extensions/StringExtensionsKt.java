package com.unity3d.services.core.extensions;

import y4.l;
import y4.m;

public final class StringExtensionsKt {
    @l
    public static final String toUnityMessage(@m String s) {
        return s == null || s.length() == 0 ? "[Unity Ads] Internal error" : "[Unity Ads] " + s;
    }
}

