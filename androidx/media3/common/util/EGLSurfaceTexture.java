package androidx.media3.common.util;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface SecureMode {
    }

    public interface TextureImageListener {
        void a();
    }

    private final Handler a;
    private final int[] b;
    @Nullable
    private final TextureImageListener c;
    @Nullable
    private EGLDisplay d;
    @Nullable
    private EGLContext e;
    @Nullable
    private EGLSurface f;
    @Nullable
    private SurfaceTexture g;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private static final int k = 1;
    private static final int l = 1;
    private static final int[] m = null;
    private static final int n = 0x32C0;

    static {
        EGLSurfaceTexture.m = new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3025, 0, 0x3027, 0x3038, 0x3033, 4, 0x3038};
    }

    public EGLSurfaceTexture(Handler handler0) {
        this(handler0, null);
    }

    public EGLSurfaceTexture(Handler handler0, @Nullable TextureImageListener eGLSurfaceTexture$TextureImageListener0) {
        this.a = handler0;
        this.c = eGLSurfaceTexture$TextureImageListener0;
        this.b = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay0) throws GlException {
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        int[] arr_v = new int[1];
        boolean z = EGL14.eglChooseConfig(eGLDisplay0, EGLSurfaceTexture.m, 0, arr_eGLConfig, 0, 1, arr_v, 0);
        GlUtil.f(z && arr_v[0] > 0 && arr_eGLConfig[0] != null, Util.S("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(z), ((int)arr_v[0]), arr_eGLConfig[0]}));
        return arr_eGLConfig[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay0, EGLConfig eGLConfig0, int v) throws GlException {
        boolean z = true;
        EGLContext eGLContext0 = EGL14.eglCreateContext(eGLDisplay0, eGLConfig0, EGL14.EGL_NO_CONTEXT, (v == 0 ? new int[]{0x3098, 2, 0x3038} : new int[]{0x3098, 2, 0x32C0, 1, 0x3038}), 0);
        if(eGLContext0 == null) {
            z = false;
        }
        GlUtil.f(z, "eglCreateContext failed");
        return eGLContext0;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay0, EGLConfig eGLConfig0, EGLContext eGLContext0, int v) throws GlException {
        EGLSurface eGLSurface0;
        boolean z = true;
        if(v == 1) {
            eGLSurface0 = EGL14.EGL_NO_SURFACE;
        }
        else {
            eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay0, eGLConfig0, (v == 2 ? new int[]{0x3057, 1, 0x3056, 1, 0x32C0, 1, 0x3038} : new int[]{0x3057, 1, 0x3056, 1, 0x3038}), 0);
            if(eGLSurface0 == null) {
                z = false;
            }
            GlUtil.f(z, "eglCreatePbufferSurface failed");
        }
        GlUtil.f(EGL14.eglMakeCurrent(eGLDisplay0, eGLSurface0, eGLSurface0, eGLContext0), "eglMakeCurrent failed");
        return eGLSurface0;
    }

    private void d() {
        TextureImageListener eGLSurfaceTexture$TextureImageListener0 = this.c;
        if(eGLSurfaceTexture$TextureImageListener0 != null) {
            eGLSurfaceTexture$TextureImageListener0.a();
        }
    }

    private static void e(int[] arr_v) throws GlException {
        GLES20.glGenTextures(1, arr_v, 0);
        GlUtil.e();
    }

    private static EGLDisplay f() throws GlException {
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        GlUtil.f(eGLDisplay0 != null, "eglGetDisplay failed");
        int[] arr_v = new int[2];
        GlUtil.f(EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1), "eglInitialize failed");
        return eGLDisplay0;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture)Assertions.g(this.g);
    }

    public void h(int v) throws GlException {
        EGLDisplay eGLDisplay0 = EGLSurfaceTexture.f();
        this.d = eGLDisplay0;
        EGLConfig eGLConfig0 = EGLSurfaceTexture.a(eGLDisplay0);
        EGLContext eGLContext0 = EGLSurfaceTexture.b(this.d, eGLConfig0, v);
        this.e = eGLContext0;
        this.f = EGLSurfaceTexture.c(this.d, eGLConfig0, eGLContext0, v);
        EGLSurfaceTexture.e(this.b);
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.b[0]);
        this.g = surfaceTexture0;
        surfaceTexture0.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture0 = this.g;
            if(surfaceTexture0 != null) {
                surfaceTexture0.release();
                GLES20.glDeleteTextures(1, this.b, 0);
            }
        }
        finally {
            if(this.d != null && !this.d.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            if(this.f != null && !this.f.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.f);
            }
            EGLContext eGLContext0 = this.e;
            if(eGLContext0 != null) {
                EGL14.eglDestroyContext(this.d, eGLContext0);
            }
            EGL14.eglReleaseThread();
            if(this.d != null && !this.d.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.d);
            }
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        this.a.post(this);
    }

    @Override
    public void run() {
        this.d();
        SurfaceTexture surfaceTexture0 = this.g;
        if(surfaceTexture0 != null) {
            try {
                surfaceTexture0.updateTexImage();
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }
}

