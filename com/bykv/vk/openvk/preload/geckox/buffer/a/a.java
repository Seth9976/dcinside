package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file0, long v) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a a0 = a.b(file0, v);
        GeckoLogger.d("gecko-debug-tag", new Object[]{"buffer type:" + a0.getClass()});
        return a0;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file0, long v) throws IOException {
        if(v <= 0L) {
            try {
                return new b(file0);
            }
            catch(Exception exception0) {
                throw new IOException("create FileBuffer failed! file:" + file0.getAbsolutePath() + " caused by:" + exception0.getMessage(), exception0);
            }
        }
        try {
            return new c(v, file0);
        }
        catch(Exception exception1) {
            throw new RuntimeException("create random access file failed! file:" + file0.getAbsolutePath() + " caused by:" + exception1.getMessage(), exception1);
        }
    }
}

