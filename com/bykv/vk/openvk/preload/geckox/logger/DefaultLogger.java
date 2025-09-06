package com.bykv.vk.openvk.preload.geckox.logger;

import android.util.Log;
import com.bykv.vk.openvk.preload.geckox.c.b;

class DefaultLogger implements Logger {
    @Override  // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void d(String s, Object[] arr_object) {
        if(arr_object == null) {
            Log.d(s, "null");
            return;
        }
        try {
            Log.d(s, b.a().b().a(arr_object));
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void e(String s, String s1, Throwable throwable0) {
        Log.e(s, s1, throwable0);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String s, String s1) {
        if(s1 == null) {
            s1 = "";
        }
        Log.w(s, s1);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String s, String s1, Throwable throwable0) {
        Log.w(s, s1, throwable0);
    }
}

