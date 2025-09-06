package androidx.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class GlUtil {
    public static final class GlException extends Exception {
        public GlException(String s) {
            super(s);
        }
    }

    public static final int a = 4;
    public static final float b = 2.0f;
    public static final int[] c = null;
    public static final int[] d = null;
    private static final long e = 0L;
    private static final String f = "EGL_EXT_protected_content";
    private static final String g = "EGL_KHR_surfaceless_context";
    private static final String h = "GL_EXT_YUV_target";
    private static final String i = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final String j = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final int k = 0x309D;
    private static final int l = 0x3340;
    private static final int[] m = null;
    private static final int n = 0x3540;
    private static final int[] o;
    private static final int[] p;

    static {
        GlUtil.c = new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3025, 0, 0x3026, 0, 0x3038};
        GlUtil.d = new int[]{0x3040, 4, 0x3024, 10, 0x3023, 10, 0x3022, 10, 0x3021, 2, 0x3025, 0, 0x3026, 0, 0x3038};
        GlUtil.m = new int[]{0x309D, 0x3340, 0x3038, 0x3038};
        GlUtil.o = new int[]{0x309D, 0x3540, 0x3038, 0x3038};
        GlUtil.p = new int[]{0x3038};
    }

    public static void A(int v) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{v}, 0);
        GlUtil.e();
    }

    public static void B(@Nullable EGLDisplay eGLDisplay0, @Nullable EGLContext eGLContext0) throws GlException {
        if(eGLDisplay0 == null) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay0, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        GlUtil.d("Error releasing context");
        if(eGLContext0 != null) {
            EGL14.eglDestroyContext(eGLDisplay0, eGLContext0);
            GlUtil.d("Error destroying context");
        }
        EGL14.eglReleaseThread();
        GlUtil.d("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay0);
        GlUtil.d("Error terminating display");
    }

    public static void C(@Nullable EGLDisplay eGLDisplay0, @Nullable EGLSurface eGLSurface0) throws GlException {
        if(eGLDisplay0 != null && eGLSurface0 != null) {
            EGL14.eglDestroySurface(eGLDisplay0, eGLSurface0);
            GlUtil.d("Error destroying surface");
        }
    }

    public static void D(EGLDisplay eGLDisplay0, EGLContext eGLContext0, EGLSurface eGLSurface0, int v, int v1) throws GlException {
        GlUtil.G(eGLDisplay0, eGLContext0, eGLSurface0, 0, v, v1);
    }

    public static void E(EGLDisplay eGLDisplay0, EGLContext eGLContext0, EGLSurface eGLSurface0, int v, int v1, int v2) throws GlException {
        GlUtil.G(eGLDisplay0, eGLContext0, eGLSurface0, v, v1, v2);
    }

    public static void F(int v, int v1, int v2) throws GlException {
        int[] arr_v = new int[1];
        GLES20.glGetIntegerv(36006, arr_v, 0);
        if(arr_v[0] != v) {
            GLES20.glBindFramebuffer(0x8D40, v);
        }
        GlUtil.e();
        GLES20.glViewport(0, 0, v1, v2);
        GlUtil.e();
    }

    private static void G(EGLDisplay eGLDisplay0, EGLContext eGLContext0, EGLSurface eGLSurface0, int v, int v1, int v2) throws GlException {
        EGL14.eglMakeCurrent(eGLDisplay0, eGLSurface0, eGLSurface0, eGLContext0);
        GlUtil.d("Error making context current");
        GlUtil.F(v, v1, v2);
    }

    public static int H() throws GlException {
        int[] arr_v = new int[1];
        GLES20.glGenTextures(1, arr_v, 0);
        GlUtil.e();
        return arr_v[0];
    }

    public static long I() throws GlException {
        int[] arr_v = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 0x3098, arr_v, 0);
        GlUtil.e();
        return (long)arr_v[0];
    }

    public static EGLContext J() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay K() throws GlException {
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        GlUtil.f(!eGLDisplay0.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        GlUtil.f(EGL14.eglInitialize(eGLDisplay0, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        GlUtil.e();
        return eGLDisplay0;
    }

    private static EGLConfig L(EGLDisplay eGLDisplay0, int[] arr_v) throws GlException {
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        if(!EGL14.eglChooseConfig(eGLDisplay0, arr_v, 0, arr_eGLConfig, 0, 1, new int[1], 0)) {
            throw new GlException("eglChooseConfig failed.");
        }
        return arr_eGLConfig[0];
    }

    public static float[] M() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] N() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean O() {
        return GlUtil.Q("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean P() {
        return Util.a >= 33 && GlUtil.Q("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    private static boolean Q(String s) {
        String s1 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
        return s1 != null && s1.contains(s);
    }

    public static boolean R(Context context0) {
        int v = Util.a;
        if(v < 24) {
            return false;
        }
        if(v < 26 && ("samsung".equals(Util.c) || "XT1650".equals(Util.d))) {
            return false;
        }
        return v >= 26 || context0.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance") ? GlUtil.Q("EGL_EXT_protected_content") : false;
    }

    public static boolean S() {
        return GlUtil.Q("EGL_KHR_surfaceless_context");
    }

    public static boolean T() {
        String s;
        if(Util.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplay0 = GlUtil.K();
                EGLContext eGLContext0 = GlUtil.l(eGLDisplay0);
                GlUtil.p(eGLContext0, eGLDisplay0);
                s = GLES20.glGetString(0x1F03);
                GlUtil.B(eGLDisplay0, eGLContext0);
                return s != null && s.contains("GL_EXT_YUV_target");
            }
            catch(GlException unused_ex) {
                return false;
            }
        }
        s = GLES20.glGetString(0x1F03);
        return s != null && s.contains("GL_EXT_YUV_target");
    }

    public static void U(int v, Bitmap bitmap0) throws GlException {
        GlUtil.a(bitmap0.getWidth(), bitmap0.getHeight());
        GlUtil.c(0xDE1, v, 0x2601);
        GLUtils.texImage2D(0xDE1, 0, bitmap0, 0);
        GlUtil.e();
    }

    public static void V(float[] arr_f) {
        Matrix.setIdentityM(arr_f, 0);
    }

    private static void a(int v, int v1) throws GlException {
        boolean z = true;
        int[] arr_v = new int[1];
        GLES20.glGetIntegerv(0xD33, arr_v, 0);
        int v2 = arr_v[0];
        if(v2 <= 0) {
            z = false;
        }
        Assertions.j(z, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if(v < 0 || v1 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if(v > v2 || v1 > v2) {
            throw new GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + v2);
        }
    }

    public static void b(long v) throws GlException {
        if(v == 0L) {
            GLES20.glFinish();
            return;
        }
        GLES30.glWaitSync(v, 0, -1L);
        GlUtil.e();
    }

    public static void c(int v, int v1, int v2) throws GlException {
        GLES20.glBindTexture(v, v1);
        GlUtil.e();
        GLES20.glTexParameteri(v, 0x2800, v2);
        GlUtil.e();
        GLES20.glTexParameteri(v, 0x2801, v2);
        GlUtil.e();
        GLES20.glTexParameteri(v, 0x2802, 0x812F);
        GlUtil.e();
        GLES20.glTexParameteri(v, 0x2803, 0x812F);
        GlUtil.e();
    }

    private static void d(String s) throws GlException {
        int v = EGL14.eglGetError();
        if(v != 0x3000) {
            throw new GlException(s + ", error code: 0x" + Integer.toHexString(v));
        }
    }

    public static void e() throws GlException {
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = false;
        int v;
        while((v = GLES20.glGetError()) != 0) {
            if(z) {
                stringBuilder0.append('\n');
            }
            String s = GLU.gluErrorString(v);
            if(s == null) {
                s = "error code: 0x" + Integer.toHexString(v);
            }
            stringBuilder0.append("glError: ");
            stringBuilder0.append(s);
            z = true;
        }
        if(z) {
            throw new GlException(stringBuilder0.toString());
        }
    }

    public static void f(boolean z, String s) throws GlException {
        if(!z) {
            throw new GlException(s);
        }
    }

    public static void g() throws GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(0x4100);
        GlUtil.e();
    }

    public static float[] h() {
        float[] arr_f = new float[16];
        GlUtil.V(arr_f);
        return arr_f;
    }

    private static FloatBuffer i(int v) {
        return ByteBuffer.allocateDirect(v * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer j(float[] arr_f) {
        return (FloatBuffer)GlUtil.i(arr_f.length).put(arr_f).flip();
    }

    public static EGLContext k(EGLContext eGLContext0, EGLDisplay eGLDisplay0, @IntRange(from = 2L, to = 3L) int v, int[] arr_v) throws GlException {
        boolean z = true;
        Assertions.a(Arrays.equals(arr_v, GlUtil.c) || Arrays.equals(arr_v, GlUtil.d));
        if(v != 2 && v != 3) {
            z = false;
        }
        Assertions.a(z);
        EGLContext eGLContext1 = EGL14.eglCreateContext(eGLDisplay0, GlUtil.L(eGLDisplay0, arr_v), eGLContext0, new int[]{0x3098, v, 0x3038}, 0);
        if(eGLContext1 != null) {
            GlUtil.e();
            return eGLContext1;
        }
        EGL14.eglTerminate(eGLDisplay0);
        throw new GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + v);
    }

    public static EGLContext l(EGLDisplay eGLDisplay0) throws GlException {
        return GlUtil.k(EGL14.EGL_NO_CONTEXT, eGLDisplay0, 2, GlUtil.c);
    }

    public static EGLSurface m(EGLDisplay eGLDisplay0, Object object0, int v, boolean z) throws GlException {
        int[] arr_v1;
        int[] arr_v;
        if(v == 3 || v == 10) {
            arr_v = GlUtil.c;
            arr_v1 = GlUtil.p;
        }
        else {
            if(v != 6 && v != 7) {
                throw new IllegalArgumentException("Unsupported color transfer: " + v);
            }
            arr_v = GlUtil.d;
            if(z) {
                arr_v1 = GlUtil.p;
            }
            else if(v == 6) {
                if(!GlUtil.P()) {
                    throw new GlException("BT.2020 PQ OpenGL output isn\'t supported.");
                }
                arr_v1 = GlUtil.m;
            }
            else {
                if(!GlUtil.O()) {
                    throw new GlException("BT.2020 HLG OpenGL output isn\'t supported.");
                }
                arr_v1 = GlUtil.o;
            }
        }
        EGLSurface eGLSurface0 = EGL14.eglCreateWindowSurface(eGLDisplay0, GlUtil.L(eGLDisplay0, arr_v), object0, arr_v1, 0);
        GlUtil.d("Error creating a new EGL surface");
        return eGLSurface0;
    }

    public static int n() throws GlException {
        int v = GlUtil.H();
        GlUtil.c(0x8D65, v, 0x2601);
        return v;
    }

    public static int o(int v) throws GlException {
        int[] arr_v = new int[1];
        GLES20.glGenFramebuffers(1, arr_v, 0);
        GlUtil.e();
        GLES20.glBindFramebuffer(0x8D40, arr_v[0]);
        GlUtil.e();
        GLES20.glFramebufferTexture2D(0x8D40, 0x8CE0, 0xDE1, v, 0);
        GlUtil.e();
        return arr_v[0];
    }

    public static EGLSurface p(EGLContext eGLContext0, EGLDisplay eGLDisplay0) throws GlException {
        EGLSurface eGLSurface0 = GlUtil.S() ? EGL14.EGL_NO_SURFACE : GlUtil.r(eGLDisplay0, 1, 1, GlUtil.c);
        GlUtil.D(eGLDisplay0, eGLContext0, eGLSurface0, 1, 1);
        return eGLSurface0;
    }

    public static long q() throws GlException {
        if(GlUtil.I() >= 3L) {
            long v = GLES30.glFenceSync(0x9117, 0);
            GlUtil.e();
            GLES20.glFlush();
            GlUtil.e();
            return v;
        }
        return 0L;
    }

    private static EGLSurface r(EGLDisplay eGLDisplay0, int v, int v1, int[] arr_v) throws GlException {
        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay0, GlUtil.L(eGLDisplay0, arr_v), new int[]{0x3057, v, 0x3056, v1, 0x3038}, 0);
        GlUtil.d("Error creating a new EGL Pbuffer surface");
        return eGLSurface0;
    }

    // 去混淆评级： 低(20)
    public static int s(int v, int v1, boolean z) throws GlException {
        return z ? GlUtil.u(v, v1, 0x881A, 0x140B) : GlUtil.u(v, v1, 6408, 0x1401);
    }

    public static int t(Bitmap bitmap0) throws GlException {
        int v = GlUtil.H();
        GlUtil.U(v, bitmap0);
        return v;
    }

    private static int u(int v, int v1, int v2, int v3) throws GlException {
        GlUtil.a(v, v1);
        int v4 = GlUtil.H();
        GlUtil.c(0xDE1, v4, 0x2601);
        GLES20.glTexImage2D(0xDE1, 0, v2, v, v1, 0, 6408, v3, null);
        GlUtil.e();
        return v4;
    }

    public static float[] v(List list0) {
        float[] arr_f = new float[list0.size() * 4];
        for(int v = 0; v < list0.size(); ++v) {
            System.arraycopy(list0.get(v), 0, arr_f, v * 4, 4);
        }
        return arr_f;
    }

    public static void w(int v) throws GlException {
        GLES20.glDeleteFramebuffers(1, new int[]{v}, 0);
        GlUtil.e();
    }

    public static void x(int v) throws GlException {
        GLES20.glDeleteRenderbuffers(1, new int[]{v}, 0);
        GlUtil.e();
    }

    public static void y(long v) throws GlException {
        GlUtil.z(v);
        GlUtil.e();
    }

    public static void z(long v) {
        GLES30.glDeleteSync(v);
    }
}

