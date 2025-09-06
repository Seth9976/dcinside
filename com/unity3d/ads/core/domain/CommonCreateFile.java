package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonCreateFile implements CreateFile {
    @Override  // com.unity3d.ads.core.domain.CreateFile
    @l
    public File invoke(@l File file0, @l String s) {
        L.p(file0, "parent");
        L.p(s, "child");
        return new File(file0, s);
    }

    @Override  // com.unity3d.ads.core.domain.CreateFile
    @l
    public File invoke(@l String s) {
        L.p(s, "pathname");
        return new File(s);
    }
}

