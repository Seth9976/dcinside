package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.Closeable;
import s.b;

public class xf {
    private static String PjT;

    public static String PjT() {
        if(TextUtils.isEmpty(xf.PjT)) {
            xf.PjT = b.b().getCacheDir() + "/" + "proxy_cache";
        }
        return xf.PjT;
    }

    public static void PjT(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Throwable throwable0) {
                throwable0.getMessage();
            }
        }
    }
}

