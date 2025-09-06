package com.dcinside.app.gif.frame;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.MainThread;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nFrameSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameSurface.kt\ncom/dcinside/app/gif/frame/FrameSurface\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class a implements SurfaceTexture.OnFrameAvailableListener {
    private final int a;
    private final int b;
    private final float c;
    @l
    private final File d;
    @m
    private b e;
    @m
    private SurfaceTexture f;
    @m
    private Surface g;
    @m
    private EGLDisplay h;
    @m
    private EGLContext i;
    @m
    private EGLSurface j;
    @l
    private final Object k;
    private boolean l;
    @m
    private ByteBuffer m;

    @MainThread
    public a(int v, int v1, float f, @l File file0) {
        L.p(file0, "outputDir");
        super();
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = file0;
        this.h = EGL14.EGL_NO_DISPLAY;
        this.i = EGL14.EGL_NO_CONTEXT;
        this.j = EGL14.EGL_NO_SURFACE;
        this.k = new Object();
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f();
        this.h();
        this.l();
    }

    public final void b() {
        synchronized(this.k) {
            while(!this.l) {
                try {
                    this.k.wait(2500L);
                    if(!this.l) {
                        throw new RuntimeException("frame wait timed out");
                    }
                }
                catch(InterruptedException interruptedException0) {
                    throw new RuntimeException(interruptedException0);
                }
                if(false) {
                    break;
                }
            }
            this.l = false;
        }
        b b0 = this.e;
        L.m(b0);
        b0.a("before updateTexImage");
        SurfaceTexture surfaceTexture0 = this.f;
        L.m(surfaceTexture0);
        surfaceTexture0.updateTexImage();
    }

    private final void c(String s) {
        int v = EGL14.eglGetError();
        if(v != 0x3000) {
            throw new RuntimeException(s + ": EGL error: 0x" + Integer.toHexString(v));
        }
    }

    private final Bitmap d(ByteBuffer byteBuffer0) {
        byteBuffer0.rewind();
        GLES20.glReadPixels(0, 0, this.a, this.b, 6408, 0x1401, byteBuffer0);
        byteBuffer0.rewind();
        Bitmap bitmap0 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
        L.o(bitmap0, "createBitmap(...)");
        bitmap0.copyPixelsFromBuffer(byteBuffer0);
        return bitmap0;
    }

    public final void e() {
        b b0 = this.e;
        L.m(b0);
        SurfaceTexture surfaceTexture0 = this.f;
        L.m(surfaceTexture0);
        b0.c(surfaceTexture0, this.c);
    }

    private final void f() {
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        this.h = eGLDisplay0;
        if(eGLDisplay0 == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] arr_v = new int[2];
        if(EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1)) {
            EGLConfig[] arr_eGLConfig = new EGLConfig[1];
            if(!EGL14.eglChooseConfig(this.h, new int[]{0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3040, 4, 0x3033, 1, 0x3038}, 0, arr_eGLConfig, 0, 1, new int[1], 0)) {
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.i = EGL14.eglCreateContext(this.h, arr_eGLConfig[0], EGL14.EGL_NO_CONTEXT, new int[]{0x3098, 2, 0x3038}, 0);
            this.c("eglCreateContext");
            if(this.i == null) {
                throw new RuntimeException("null context");
            }
            this.j = EGL14.eglCreatePbufferSurface(this.h, arr_eGLConfig[0], new int[]{0x3057, this.a, 0x3056, this.b, 0x3038}, 0);
            this.c("eglCreatePbufferSurface");
            if(this.j == null) {
                throw new RuntimeException("surface was null");
            }
            return;
        }
        this.h = EGL14.EGL_NO_DISPLAY;
        throw new RuntimeException("unable to initialize EGL14");
    }

    @m
    public final Surface g() {
        return this.g;
    }

    private final void h() {
        if(!EGL14.eglMakeCurrent(this.h, this.j, this.j, this.i)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void i() {
        EGLDisplay eGLDisplay0 = this.h;
        if(eGLDisplay0 != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay0, this.j);
            EGL14.eglDestroyContext(this.h, this.i);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.h);
        }
        this.h = EGL14.EGL_NO_DISPLAY;
        this.i = EGL14.EGL_NO_CONTEXT;
        this.j = EGL14.EGL_NO_SURFACE;
        Surface surface0 = this.g;
        if(surface0 != null) {
            surface0.release();
        }
        this.e = null;
        this.g = null;
        this.f = null;
        ByteBuffer byteBuffer0 = this.m;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
        this.m = null;
    }

    @l
    public final X j(long v) throws Exception {
        @f(c = "com.dcinside.app.gif.frame.FrameSurface$saveFrame$1", f = "FrameSurface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gif.frame.a.a extends o implements A3.o {
            int k;
            final a l;
            final long m;
            final Bitmap n;

            com.dcinside.app.gif.frame.a.a(a a0, long v, Bitmap bitmap0, d d0) {
                this.l = a0;
                this.m = v;
                this.n = bitmap0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.gif.frame.a.a(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.gif.frame.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l.k(this.m, this.n);
            }
        }

        ByteBuffer byteBuffer0 = this.m;
        if(byteBuffer0 != null) {
            Bitmap bitmap0 = this.d(byteBuffer0);
            if(bitmap0 != null) {
                com.dcinside.app.gif.frame.a.a a$a0 = new com.dcinside.app.gif.frame.a.a(this, v, bitmap0, null);
                return k.b(() -> i.a, null, null, a$a0, 3, null);
            }
        }
        throw new NullPointerException("buffer not found.");
    }

    private final Frame k(long v, Bitmap bitmap0) {
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        String s = String.format("f_%020d_o.png", Arrays.copyOf(new Object[]{v}, 1));
        L.o(s, "format(...)");
        File file0 = new File(this.d, s);
        if(!com.dcinside.app.gif.frame.d.a.a(bitmap0, file0)) {
            throw new NullPointerException("이미지를 생성할 수 없습니다.");
        }
        String s1 = file0.getPath();
        L.o(s1, "getPath(...)");
        return new Frame(v, s1, v1, v2);
    }

    @MainThread
    private final void l() {
        b b0 = new b();
        b0.f();
        this.e = b0;
        b b1 = this.e;
        L.m(b1);
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(b1.d());
        surfaceTexture0.setOnFrameAvailableListener(this);
        this.f = surfaceTexture0;
        this.g = new Surface(this.f);
        this.m = ByteBuffer.allocateDirect(this.a * this.b * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public void onFrameAvailable(@l SurfaceTexture surfaceTexture0) {
        L.p(surfaceTexture0, "st");
        synchronized(this.k) {
            if(!this.l) {
                this.l = true;
                this.k.notifyAll();
                return;
            }
        }
        throw new RuntimeException("frameAvailable already set, frame could be dropped");
    }
}

