package com.dcinside.app.gif.view;

import A3.p;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.TextureView;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.MediaController.MediaPlayerControl;
import java.io.IOException;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class TextureVideoView extends TextureView implements MediaController.MediaPlayerControl {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a A = null;
    private static final int B = -1;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 3;
    private static final int G = 4;
    private static final int H = 5;
    @m
    private I0 a;
    private int b;
    private int c;
    @m
    private Surface d;
    @m
    private MediaPlayer e;
    private int f;
    @m
    private Uri g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    @m
    private Function1 o;
    @m
    private Function1 p;
    @m
    private p q;
    @m
    private p r;
    @m
    private Function1 s;
    @l
    private final MediaPlayer.OnVideoSizeChangedListener t;
    @l
    private final MediaPlayer.OnPreparedListener u;
    @l
    private final MediaPlayer.OnCompletionListener v;
    @l
    private final MediaPlayer.OnInfoListener w;
    @l
    private final MediaPlayer.OnErrorListener x;
    @l
    private final MediaPlayer.OnBufferingUpdateListener y;
    @l
    private final c z;

    static {
        TextureVideoView.A = new a(null);
    }

    public TextureVideoView(@l Context context0, @m AttributeSet attributeSet0) {
        public static final class c implements TextureView.SurfaceTextureListener {
            final TextureVideoView a;

            c(TextureVideoView textureVideoView0) {
                this.a = textureVideoView0;
                super();
            }

            @Override  // android.view.TextureView$SurfaceTextureListener
            public void onSurfaceTextureAvailable(@l SurfaceTexture surfaceTexture0, int v, int v1) {
                L.p(surfaceTexture0, "surface");
                Surface surface0 = new Surface(surfaceTexture0);
                this.a.d = surface0;
                this.a.q();
            }

            @Override  // android.view.TextureView$SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(@l SurfaceTexture surfaceTexture0) {
                L.p(surfaceTexture0, "surface");
                Surface surface0 = this.a.d;
                if(surface0 != null) {
                    surface0.release();
                }
                this.a.d = null;
                this.a.x(true);
                return true;
            }

            @Override  // android.view.TextureView$SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(@l SurfaceTexture surfaceTexture0, int v, int v1) {
                L.p(surfaceTexture0, "surface");
                boolean z = false;
                boolean z1 = this.a.c == 3;
                if(v > 0 && v1 > 0) {
                    z = true;
                }
                if(this.a.e != null && z1 && z) {
                    if(this.a.k != 0) {
                        this.a.seekTo(this.a.k);
                    }
                    this.a.start();
                }
            }

            @Override  // android.view.TextureView$SurfaceTextureListener
            public void onSurfaceTextureUpdated(@l SurfaceTexture surfaceTexture0) {
                L.p(surfaceTexture0, "surface");
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0);
        this.t = (MediaPlayer mediaPlayer0, int v, int v1) -> {
            L.p(this, "this$0");
            this.h = mediaPlayer0.getVideoWidth();
            int v2 = mediaPlayer0.getVideoHeight();
            this.i = v2;
            if(this.h != 0 && v2 != 0) {
                SurfaceTexture surfaceTexture0 = this.getSurfaceTexture();
                if(surfaceTexture0 != null) {
                    surfaceTexture0.setDefaultBufferSize(this.h, this.i);
                }
                this.requestLayout();
            }
        };
        this.u = (MediaPlayer mediaPlayer0) -> {
            L.p(this, "this$0");
            this.b = 2;
            this.n = true;
            this.m = true;
            this.l = true;
            Function1 function10 = this.p;
            if(function10 != null) {
                L.m(mediaPlayer0);
                function10.invoke(mediaPlayer0);
            }
            this.h = mediaPlayer0.getVideoWidth();
            this.i = mediaPlayer0.getVideoHeight();
            int v = this.k;
            if(v != 0) {
                this.seekTo(v);
            }
            if(this.h != 0 && this.i != 0) {
                SurfaceTexture surfaceTexture0 = this.getSurfaceTexture();
                if(surfaceTexture0 != null) {
                    surfaceTexture0.setDefaultBufferSize(this.h, this.i);
                }
                if(this.c == 3) {
                    this.start();
                }
            }
            else if(this.c == 3) {
                this.start();
            }
        };
        this.v = (MediaPlayer mediaPlayer0) -> {
            L.p(this, "this$0");
            this.b = 5;
            this.c = 5;
            Function1 function10 = this.o;
            if(function10 != null) {
                L.m(mediaPlayer0);
                function10.invoke(mediaPlayer0);
            }
        };
        this.w = (MediaPlayer mediaPlayer0, int v, int v1) -> {
            L.p(this, "this$0");
            p p0 = this.r;
            if(p0 != null) {
                L.m(mediaPlayer0);
                p0.invoke(mediaPlayer0, v, v1);
            }
            return true;
        };
        this.x = (MediaPlayer mediaPlayer0, int v, int v1) -> {
            L.p(this, "this$0");
            this.b = -1;
            this.c = -1;
            p p0 = this.q;
            if(p0 != null) {
                p0.invoke(mediaPlayer0, v, v1);
            }
            return true;
        };
        this.y = (MediaPlayer mediaPlayer0, int v) -> {
            L.p(this, "this$0");
            this.j = v;
            Function1 function10 = this.s;
            if(function10 != null) {
                function10.invoke(v);
            }
        };
        c textureVideoView$c0 = new c(this);
        this.z = textureVideoView$c0;
        this.h = 0;
        this.i = 0;
        this.setSurfaceTextureListener(textureVideoView$c0);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        this.b = 0;
        this.c = 0;
    }

    public TextureVideoView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final void A() {
        I0 i00 = this.a;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.a = null;
        MediaPlayer mediaPlayer0 = this.e;
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            mediaPlayer0.release();
        }
        this.e = null;
        this.b = 0;
        this.c = 0;
        this.n();
    }

    public final void B() {
        this.x(false);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canPause() {
        return this.l;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekBackward() {
        return this.m;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekForward() {
        return this.n;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getAudioSessionId() {
        if(this.f == 0) {
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            this.f = mediaPlayer0.getAudioSessionId();
            mediaPlayer0.release();
        }
        return this.f;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getBufferPercentage() {
        return this.e == null ? 0 : this.j;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getCurrentPosition() {
        if(this.o()) {
            return this.e == null ? 0 : this.e.getCurrentPosition();
        }
        return 0;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getDuration() {
        if(this.o()) {
            return this.e == null ? -1 : this.e.getDuration();
        }
        return -1;
    }

    @l
    public final MediaPlayer.OnPreparedListener getPasPreparedListener() {
        return this.u;
    }

    @l
    public final MediaPlayer.OnVideoSizeChangedListener getPasSizeChangedListener() {
        return this.t;
    }

    // 去混淆评级： 低(30)
    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean isPlaying() {
        return this.o() && (this.e != null && this.e.isPlaying());
    }

    private final void n() {
        if(this.d == null) {
            return;
        }
        EGL eGL0 = EGLContext.getEGL();
        L.n(eGL0, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGLDisplay eGLDisplay0 = ((EGL10)eGL0).eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        ((EGL10)eGL0).eglInitialize(eGLDisplay0, null);
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        ((EGL10)eGL0).eglChooseConfig(eGLDisplay0, new int[]{0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3040, 4, 0x3038, 0, 0x3038}, arr_eGLConfig, 1, new int[1]);
        EGLConfig eGLConfig0 = arr_eGLConfig[0];
        EGLContext eGLContext0 = EGL10.EGL_NO_CONTEXT;
        EGLContext eGLContext1 = ((EGL10)eGL0).eglCreateContext(eGLDisplay0, eGLConfig0, eGLContext0, new int[]{0x3098, 2, 0x3038});
        EGLSurface eGLSurface0 = ((EGL10)eGL0).eglCreateWindowSurface(eGLDisplay0, eGLConfig0, this.d, new int[]{0x3038});
        ((EGL10)eGL0).eglMakeCurrent(eGLDisplay0, eGLSurface0, eGLSurface0, eGLContext1);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(0x4000);
        ((EGL10)eGL0).eglSwapBuffers(eGLDisplay0, eGLSurface0);
        ((EGL10)eGL0).eglDestroySurface(eGLDisplay0, eGLSurface0);
        ((EGL10)eGL0).eglMakeCurrent(eGLDisplay0, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, eGLContext0);
        ((EGL10)eGL0).eglDestroyContext(eGLDisplay0, eGLContext1);
        ((EGL10)eGL0).eglTerminate(eGLDisplay0);
    }

    private final boolean o() {
        return this.e != null && (this.b != -1 && this.b != 0 && this.b != 1);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v11;
        int v2 = View.getDefaultSize(this.h, v);
        int v3 = View.getDefaultSize(this.i, v1);
        if(this.h > 0 && this.i > 0) {
            int v4 = View.MeasureSpec.getMode(v);
            int v5 = View.MeasureSpec.getSize(v);
            int v6 = View.MeasureSpec.getMode(v1);
            int v7 = View.MeasureSpec.getSize(v1);
            if(v4 == 0x40000000 && v6 == 0x40000000) {
                int v8 = this.h;
                int v9 = this.i;
                if(v8 * v7 < v5 * v9) {
                    v2 = v8 * v7 / v9;
                    v3 = v7;
                }
                else if(v8 * v7 > v5 * v9) {
                    v3 = v9 * v5 / v8;
                    v2 = v5;
                }
                else {
                    v2 = v5;
                    v3 = v7;
                }
            }
            else if(v4 == 0x40000000) {
                int v10 = this.i * v5 / this.h;
                if(v6 == 0x80000000 && v10 > v7) {
                    v2 = v5;
                    v3 = v7;
                }
                else {
                    v3 = v10;
                    v2 = v5;
                }
            }
            else if(v6 == 0x40000000) {
                v11 = this.h * v7 / this.i;
                v2 = v4 != 0x80000000 || v11 <= v5 ? v11 : v5;
                v3 = v7;
            }
            else {
                int v12 = this.h;
                int v13 = this.i;
                if(v6 != 0x80000000 || v13 <= v7) {
                    v11 = v12;
                    v7 = v13;
                }
                else {
                    v11 = v7 * v12 / v13;
                }
                if(v4 != 0x80000000 || v11 <= v5) {
                    v2 = v11;
                    v3 = v7;
                }
                else {
                    v3 = v13 * v5 / v12;
                    v2 = v5;
                }
            }
        }
        this.setMeasuredDimension(v2, v3);
    }

    public final void p(int v, int v1) {
        @f(c = "com.dcinside.app.gif.view.TextureVideoView$loop$1", f = "TextureVideoView.kt", i = {0, 1, 2}, l = {0x1A0, 417, 421}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
        static final class b extends o implements A3.o {
            int k;
            private Object l;
            final TextureVideoView m;
            final int n;
            final int o;

            b(TextureVideoView textureVideoView0, int v, int v1, d d0) {
                this.m = textureVideoView0;
                this.n = v;
                this.o = v1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new b(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.view.TextureVideoView$loop$1$1", f = "TextureVideoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.view.TextureVideoView.b.a extends o implements A3.o {
                    int k;
                    final TextureVideoView l;

                    com.dcinside.app.gif.view.TextureVideoView.b.a(TextureVideoView textureVideoView0, d d0) {
                        this.l = textureVideoView0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.gif.view.TextureVideoView.b.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.gif.view.TextureVideoView.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.pause();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.view.TextureVideoView$loop$1$2", f = "TextureVideoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.view.TextureVideoView.b.b extends o implements A3.o {
                    int k;
                    final TextureVideoView l;
                    final int m;

                    com.dcinside.app.gif.view.TextureVideoView.b.b(TextureVideoView textureVideoView0, int v, d d0) {
                        this.l = textureVideoView0;
                        this.m = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.gif.view.TextureVideoView.b.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.gif.view.TextureVideoView.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.seekTo(this.m);
                        this.l.start();
                        return S0.a;
                    }
                }

                O o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.l;
                        break;
                    }
                    case 1: {
                        o0 = (O)this.l;
                        f0.n(object0);
                        goto label_20;
                    }
                    case 2: {
                        o0 = (O)this.l;
                        f0.n(object0);
                        goto label_25;
                    }
                    case 3: {
                        o0 = (O)this.l;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(P.k(o0) && this.m.e != null) {
                    com.dcinside.app.gif.view.TextureVideoView.b.a textureVideoView$b$a0 = new com.dcinside.app.gif.view.TextureVideoView.b.a(this.m, null);
                    this.l = o0;
                    this.k = 1;
                    if(i.h(h0.e(), textureVideoView$b$a0, this) == object1) {
                        return object1;
                    }
                label_20:
                    com.dcinside.app.gif.view.TextureVideoView.b.b textureVideoView$b$b0 = new com.dcinside.app.gif.view.TextureVideoView.b.b(this.m, this.o, null);
                    this.l = o0;
                    this.k = 2;
                    if(i.h(h0.e(), textureVideoView$b$b0, this) == object1) {
                        return object1;
                    }
                label_25:
                    this.l = o0;
                    this.k = 3;
                    if(a0.b(this.n, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        I0 i00 = this.a;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        b textureVideoView$b0 = new b(this, v1, v, null);
        this.a = k.f(() -> kotlin.coroutines.i.a, null, null, textureVideoView$b0, 3, null);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void pause() {
        if(this.o()) {
            MediaPlayer mediaPlayer0 = this.e;
            if(mediaPlayer0 != null && mediaPlayer0.isPlaying()) {
                mediaPlayer0.pause();
                this.b = 4;
            }
        }
        this.c = 4;
    }

    private final void q() {
        if(this.g != null && this.d != null) {
            this.x(false);
            try {
                MediaPlayer mediaPlayer0 = new MediaPlayer();
                mediaPlayer0.setVolume(0.0f, 0.0f);
                int v = this.f;
                if(v == 0) {
                    this.f = mediaPlayer0.getAudioSessionId();
                }
                else {
                    mediaPlayer0.setAudioSessionId(v);
                }
                mediaPlayer0.setOnPreparedListener(this.u);
                mediaPlayer0.setOnVideoSizeChangedListener(this.t);
                mediaPlayer0.setOnCompletionListener(this.v);
                mediaPlayer0.setOnErrorListener(this.x);
                mediaPlayer0.setOnInfoListener(this.w);
                mediaPlayer0.setOnBufferingUpdateListener(this.y);
                this.j = 0;
                Context context0 = this.getContext().getApplicationContext();
                Uri uri0 = this.g;
                L.m(uri0);
                mediaPlayer0.setDataSource(context0, uri0, null);
                mediaPlayer0.setSurface(this.d);
                mediaPlayer0.setScreenOnWhilePlaying(true);
                mediaPlayer0.prepareAsync();
                this.e = mediaPlayer0;
                this.b = 1;
            }
            catch(IOException unused_ex) {
                this.b = -1;
                this.c = -1;
                this.x.onError(this.e, 1, 0);
            }
            catch(IllegalArgumentException unused_ex) {
                this.b = -1;
                this.c = -1;
                this.x.onError(this.e, 1, 0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void r(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0, int v) [...]

    // 检测为 Lambda 实现
    private static final void s(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0) [...]

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void seekTo(int v) {
        if(this.o()) {
            if(Build.VERSION.SDK_INT >= 26) {
                MediaPlayer mediaPlayer0 = this.e;
                if(mediaPlayer0 != null) {
                    mediaPlayer0.seekTo(((long)v), 0);
                }
            }
            else {
                MediaPlayer mediaPlayer1 = this.e;
                if(mediaPlayer1 != null) {
                    mediaPlayer1.seekTo(v);
                }
            }
            v = 0;
        }
        this.k = v;
    }

    public final void setOnBufferingListener(@m Function1 function10) {
        this.s = function10;
    }

    public final void setOnCompletionListener(@m Function1 function10) {
        this.o = function10;
    }

    public final void setOnErrorListener(@m p p0) {
        this.q = p0;
    }

    public final void setOnInfoListener(@m p p0) {
        this.r = p0;
    }

    public final void setOnPreparedListener(@m Function1 function10) {
        this.p = function10;
    }

    public final void setVideoPath(@l String s) {
        L.p(s, "path");
        Uri uri0 = Uri.parse(s);
        L.o(uri0, "parse(...)");
        this.setVideoURI(uri0);
    }

    public final void setVideoURI(@l Uri uri0) {
        L.p(uri0, "uri");
        this.g = uri0;
        this.k = 0;
        this.q();
        this.requestLayout();
        this.invalidate();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void start() {
        if(this.o()) {
            MediaPlayer mediaPlayer0 = this.e;
            if(mediaPlayer0 != null) {
                mediaPlayer0.start();
                this.b = 3;
            }
        }
        this.c = 3;
    }

    // 检测为 Lambda 实现
    private static final boolean t(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private static final boolean u(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private static final void v(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0) [...]

    // 检测为 Lambda 实现
    private static final void w(TextureVideoView textureVideoView0, MediaPlayer mediaPlayer0, int v, int v1) [...]

    private final void x(boolean z) {
        I0 i00 = this.a;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.a = null;
        MediaPlayer mediaPlayer0 = this.e;
        if(mediaPlayer0 != null) {
            mediaPlayer0.reset();
            mediaPlayer0.release();
            this.b = 0;
            if(z) {
                this.c = 0;
            }
        }
        this.e = null;
    }

    public final int y(int v, int v1) {
        return View.getDefaultSize(v, v1);
    }

    public final void z() {
        this.q();
    }
}

