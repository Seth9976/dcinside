package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override  // com.unity3d.ads.core.domain.GetCacheDirectory
    @l
    public File invoke(@l File file0, @l String s) {
        L.p(file0, "cacheDirectoryBase");
        L.p(s, "cacheDirectoryPath");
        return new File(file0, s);
    }
}

