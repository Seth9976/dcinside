package com.bykv.vk.openvk.preload.geckox.f.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends a {
    public c(File file0) {
        super(file0);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.f.a.a
    protected final InputStream a(File file0, String s) throws IOException {
        File file1 = new File(file0, "res/" + s);
        if(!file1.getCanonicalPath().startsWith(file0.getCanonicalPath())) {
            throw new IOException("file not found");
        }
        GeckoLogger.d("gecko-debug-tag", new Object[]{"NormalFileLoader, file:", file1.getAbsolutePath()});
        return new FileInputStream(file1.getCanonicalFile());
    }

    // 去混淆评级： 低(40)
    @Override  // com.bykv.vk.openvk.preload.geckox.f.a.a
    protected final boolean b(File file0, String s) throws IOException {
        return new File(file0, "res/" + s).exists();
    }
}

