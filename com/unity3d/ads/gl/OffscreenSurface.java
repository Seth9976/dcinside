package com.unity3d.ads.gl;

import kotlin.jvm.internal.L;
import y4.l;

public final class OffscreenSurface extends EglSurfaceBase {
    public OffscreenSurface(@l EglCore eglCore0, int v, int v1) {
        L.p(eglCore0, "eglCore");
        super(eglCore0);
        this.createOffscreenSurface(v, v1);
    }

    public final void release() {
        this.releaseEglSurface();
    }
}

