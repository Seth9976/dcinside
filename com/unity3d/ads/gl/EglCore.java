package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nEglCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EglCore.kt\ncom/unity3d/ads/gl/EglCore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class EglCore {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private int glVersion;
    @m
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;

    static {
        EglCore.Companion = new Companion(null);
    }

    public EglCore() {
        this(null, 0, 3, null);
    }

    public EglCore(@m EGLContext eGLContext0, int v) {
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.glVersion = -1;
        if(eGLContext0 == null) {
            eGLContext0 = EGL14.EGL_NO_CONTEXT;
        }
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplay0;
        if(eGLDisplay0 == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] arr_v = new int[2];
        if(EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1)) {
            if((v & 2) != 0) {
                EGLConfig eGLConfig0 = this.getConfig(v, 3);
                if(eGLConfig0 != null) {
                    EGLContext eGLContext1 = EGL14.eglCreateContext(this.mEGLDisplay, eGLConfig0, eGLContext0, new int[]{0x3098, 3, 0x3038}, 0);
                    if(EGL14.eglGetError() == 0x3000) {
                        this.mEGLConfig = eGLConfig0;
                        this.mEGLContext = eGLContext1;
                        this.glVersion = 3;
                    }
                }
            }
            if(this.mEGLContext == EGL14.EGL_NO_CONTEXT) {
                EGLConfig eGLConfig1 = this.getConfig(v, 2);
                if(eGLConfig1 == null) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                EGLContext eGLContext2 = EGL14.eglCreateContext(this.mEGLDisplay, eGLConfig1, eGLContext0, new int[]{0x3098, 2, 0x3038}, 0);
                this.checkEglError("eglCreateContext");
                this.mEGLConfig = eGLConfig1;
                this.mEGLContext = eGLContext2;
                this.glVersion = 2;
            }
            EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 0x3098, new int[1], 0);
            return;
        }
        this.mEGLDisplay = null;
        throw new RuntimeException("unable to initialize EGL14");
    }

    public EglCore(EGLContext eGLContext0, int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            eGLContext0 = null;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(eGLContext0, v);
    }

    private final void checkEglError(String s) {
        int v = EGL14.eglGetError();
        if(v != 0x3000) {
            throw new RuntimeException(s + ": EGL error: 0x" + Integer.toHexString(v));
        }
    }

    @l
    public final EGLSurface createOffscreenSurface(int v, int v1) {
        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{0x3057, v, 0x3056, v1, 0x3038}, 0);
        this.checkEglError("eglCreatePbufferSurface");
        if(eGLSurface0 == null) {
            throw new RuntimeException("surface was null");
        }
        return eGLSurface0;
    }

    @Override
    protected final void finalize() {
        if(this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            this.release();
        }
    }

    private final EGLConfig getConfig(int v, int v1) {
        int[] arr_v = {0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3040, (v1 < 3 ? 4 : 68), 0x3038, 0, 0x3038};
        if((v & 1) != 0) {
            arr_v[10] = 12610;
            arr_v[11] = 1;
        }
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        return EGL14.eglChooseConfig(this.mEGLDisplay, arr_v, 0, arr_eGLConfig, 0, 1, new int[1], 0) ? arr_eGLConfig[0] : null;
    }

    public final int getGlVersion() {
        return this.glVersion;
    }

    public final void makeCurrent(@m EGLSurface eGLSurface0) {
        if(!EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface0, eGLSurface0, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void release() {
        EGLDisplay eGLDisplay0 = this.mEGLDisplay;
        if(eGLDisplay0 != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(eGLDisplay0, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public final boolean releaseSurface(@m EGLSurface eGLSurface0) {
        return EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface0);
    }

    public final void setGlVersion(int v) {
        this.glVersion = v;
    }
}

