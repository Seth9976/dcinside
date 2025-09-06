package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nEglSurfaceBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EglSurfaceBase.kt\ncom/unity3d/ads/gl/EglSurfaceBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public class EglSurfaceBase {
    private EGLSurface mEGLSurface;
    @l
    private EglCore mEglCore;
    private int mHeight;
    private int mWidth;

    protected EglSurfaceBase(@l EglCore eglCore0) {
        L.p(eglCore0, "eglCore");
        super();
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mEglCore = eglCore0;
    }

    public final void createOffscreenSurface(int v, int v1) {
        if(this.mEGLSurface != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException("surface already created");
        }
        this.mEGLSurface = this.mEglCore.createOffscreenSurface(v, v1);
        this.mWidth = v;
        this.mHeight = v1;
    }

    public final void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public final void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }
}

