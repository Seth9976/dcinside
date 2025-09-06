package com.bykv.vk.openvk.preload.geckox.f.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class b extends a {
    public b(File file0) {
        super(file0);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.f.a.a
    protected final InputStream a(File file0, String s) throws IOException {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"MyArchiveFileLoader, file:", new File(s).getCanonicalPath()});
        return null;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.f.a.a
    protected final boolean b(File file0, String s) throws IOException {
        new File(s).getCanonicalPath();
        return false;
    }
}

