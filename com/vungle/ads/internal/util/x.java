package com.vungle.ads.internal.util;

import android.webkit.URLUtil;
import y4.l;
import y4.m;

public final class x {
    @l
    public static final x INSTANCE;

    static {
        x.INSTANCE = new x();
    }

    // 去混淆评级： 低(20)
    public final boolean isUrlValid(@m String s) {
        return s != null && s.length() != 0 && (URLUtil.isHttpsUrl(s) || URLUtil.isHttpUrl(s));
    }
}

