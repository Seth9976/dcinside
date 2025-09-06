package com.bykv.vk.openvk.preload.geckox.logger;

public interface Logger {
    void d(String arg1, Object[] arg2);

    void e(String arg1, String arg2, Throwable arg3);

    void w(String arg1, String arg2);

    void w(String arg1, String arg2, Throwable arg3);
}

