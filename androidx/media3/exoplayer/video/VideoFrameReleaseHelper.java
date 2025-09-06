package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class VideoFrameReleaseHelper {
    @RequiresApi(30)
    static final class Api30 {
        @DoNotInline
        public static void a(Surface surface0, float f) {
            try {
                surface0.setFrameRate(f, (f == 0.0f ? 0 : 1));
            }
            catch(IllegalStateException illegalStateException0) {
                Log.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", illegalStateException0);
            }
        }
    }

    final class DisplayHelper implements DisplayManager.DisplayListener {
        private final DisplayManager a;
        final VideoFrameReleaseHelper b;

        public DisplayHelper(DisplayManager displayManager0) {
            this.a = displayManager0;
        }

        private Display a() {
            return this.a.getDisplay(0);
        }

        public void b() {
            Handler handler0 = Util.H();
            this.a.registerDisplayListener(this, handler0);
            Display display0 = this.a();
            VideoFrameReleaseHelper.this.p(display0);
        }

        public void c() {
            this.a.unregisterDisplayListener(this);
        }

        @Override  // android.hardware.display.DisplayManager$DisplayListener
        public void onDisplayAdded(int v) {
        }

        @Override  // android.hardware.display.DisplayManager$DisplayListener
        public void onDisplayChanged(int v) {
            if(v == 0) {
                Display display0 = this.a();
                VideoFrameReleaseHelper.this.p(display0);
            }
        }

        @Override  // android.hardware.display.DisplayManager$DisplayListener
        public void onDisplayRemoved(int v) {
        }
    }

    static final class VSyncSampler implements Handler.Callback, Choreographer.FrameCallback {
        public volatile long a;
        private final Handler b;
        private final HandlerThread c;
        private Choreographer d;
        private int e;
        private static final int f = 1;
        private static final int g = 2;
        private static final int h = 3;
        private static final VSyncSampler i;

        static {
            VSyncSampler.i = new VSyncSampler();
        }

        private VSyncSampler() {
            this.a = 0x8000000000000001L;
            HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread0;
            handlerThread0.start();
            Handler handler0 = Util.G(handlerThread0.getLooper(), this);
            this.b = handler0;
            handler0.sendEmptyMessage(1);
        }

        public void a() {
            this.b.sendEmptyMessage(2);
        }

        private void b() {
            Choreographer choreographer0 = this.d;
            if(choreographer0 != null) {
                int v = this.e + 1;
                this.e = v;
                if(v == 1) {
                    choreographer0.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.d = Choreographer.getInstance();
            }
            catch(RuntimeException runtimeException0) {
                Log.o("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", runtimeException0);
            }
        }

        public static VSyncSampler d() {
            return VSyncSampler.i;
        }

        @Override  // android.view.Choreographer$FrameCallback
        public void doFrame(long v) {
            this.a = v;
            ((Choreographer)Assertions.g(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(3);
        }

        private void f() {
            Choreographer choreographer0 = this.d;
            if(choreographer0 != null) {
                int v = this.e - 1;
                this.e = v;
                if(v == 0) {
                    choreographer0.removeFrameCallback(this);
                    this.a = 0x8000000000000001L;
                }
            }
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            switch(message0.what) {
                case 1: {
                    this.c();
                    return true;
                }
                case 2: {
                    this.b();
                    return true;
                }
                case 3: {
                    this.f();
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    private final FixedFrameRateEstimator a;
    @Nullable
    private final DisplayHelper b;
    @Nullable
    private final VSyncSampler c;
    private boolean d;
    @Nullable
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private static final String r = "VideoFrameReleaseHelper";
    private static final long s = 5000000000L;
    private static final float t = 0.02f;
    private static final float u = 1.0f;
    private static final int v = 30;
    private static final long w = 500L;
    private static final long x = 20000000L;
    private static final long y = 80L;

    public VideoFrameReleaseHelper(@Nullable Context context0) {
        this.a = new FixedFrameRateEstimator();
        DisplayHelper videoFrameReleaseHelper$DisplayHelper0 = this.f(context0);
        this.b = videoFrameReleaseHelper$DisplayHelper0;
        this.c = videoFrameReleaseHelper$DisplayHelper0 == null ? null : VSyncSampler.d();
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public long b(long v) {
        long v3;
        if(this.p == -1L || !this.a.e()) {
            v3 = v;
        }
        else {
            long v1 = this.a.a();
            long v2 = this.q + ((long)(((float)(v1 * (this.m - this.p))) / this.i));
            if(VideoFrameReleaseHelper.c(v, v2)) {
                v3 = v2;
            }
            else {
                this.n();
                v3 = v;
            }
        }
        this.n = this.m;
        this.o = v3;
        VSyncSampler videoFrameReleaseHelper$VSyncSampler0 = this.c;
        if(videoFrameReleaseHelper$VSyncSampler0 != null && this.k != 0x8000000000000001L) {
            return videoFrameReleaseHelper$VSyncSampler0.a == 0x8000000000000001L ? v3 : VideoFrameReleaseHelper.e(v3, videoFrameReleaseHelper$VSyncSampler0.a, this.k) - this.l;
        }
        return v3;
    }

    private static boolean c(long v, long v1) {
        return Math.abs(v - v1) <= 20000000L;
    }

    private void d() {
        if(Util.a >= 30) {
            Surface surface0 = this.e;
            if(surface0 != null && this.j != 0x80000000 && this.h != 0.0f) {
                this.h = 0.0f;
                Api30.a(surface0, 0.0f);
            }
        }
    }

    private static long e(long v, long v1, long v2) {
        long v3 = v1 + (v - v1) / v2 * v2;
        if(v <= v3) {
            long v4 = v3 - v2;
            return v3 - v < v - v4 ? v3 : v4;
        }
        long v5 = v3;
        v3 = v2 + v3;
        return v3 - v < v - v5 ? v3 : v5;
    }

    @Nullable
    private DisplayHelper f(@Nullable Context context0) {
        if(context0 == null) {
            return null;
        }
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        return displayManager0 == null ? null : new DisplayHelper(this, displayManager0);
    }

    public void g(float f) {
        this.f = f;
        this.a.g();
        this.q();
    }

    public void h(long v) {
        long v1 = this.n;
        if(v1 != -1L) {
            this.p = v1;
            this.q = this.o;
        }
        ++this.m;
        this.a.f(v * 1000L);
        this.q();
    }

    public void i(float f) {
        this.i = f;
        this.n();
        this.r(false);
    }

    public void j() {
        this.n();
    }

    public void k() {
        this.d = true;
        this.n();
        if(this.b != null) {
            ((VSyncSampler)Assertions.g(this.c)).a();
            this.b.b();
        }
        this.r(false);
    }

    public void l() {
        this.d = false;
        DisplayHelper videoFrameReleaseHelper$DisplayHelper0 = this.b;
        if(videoFrameReleaseHelper$DisplayHelper0 != null) {
            videoFrameReleaseHelper$DisplayHelper0.c();
            ((VSyncSampler)Assertions.g(this.c)).e();
        }
        this.d();
    }

    public void m(@Nullable Surface surface0) {
        if(surface0 instanceof PlaceholderSurface) {
            surface0 = null;
        }
        if(this.e == surface0) {
            return;
        }
        this.d();
        this.e = surface0;
        this.r(true);
    }

    private void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public void o(int v) {
        if(this.j == v) {
            return;
        }
        this.j = v;
        this.r(true);
    }

    private void p(@Nullable Display display0) {
        if(display0 != null) {
            long v = (long)(1000000000.0 / ((double)display0.getRefreshRate()));
            this.k = v;
            this.l = v * 80L / 100L;
            return;
        }
        Log.n("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
    }

    private void q() {
        if(Util.a >= 30 && this.e != null) {
            float f = this.a.e() ? this.a.b() : this.f;
            float f1 = this.g;
            if(f == f1) {
                return;
            }
            int v = Float.compare(f, -1.0f);
            if(v != 0 && f1 != -1.0f) {
                float f2 = !this.a.e() || this.a.d() < 5000000000L ? 1.0f : 0.02f;
                if(Math.abs(f - this.g) >= f2) {
                    this.g = f;
                    this.r(false);
                }
            }
            else if(v != 0 || this.a.c() >= 30) {
                this.g = f;
                this.r(false);
            }
        }
    }

    private void r(boolean z) {
        float f1;
        if(Util.a >= 30) {
            Surface surface0 = this.e;
            if(surface0 != null && this.j != 0x80000000) {
                if(this.d) {
                    float f = this.g;
                    f1 = f == -1.0f ? 0.0f : f * this.i;
                }
                else {
                    f1 = 0.0f;
                }
                if(!z && this.h == f1) {
                    return;
                }
                this.h = f1;
                Api30.a(surface0, f1);
            }
        }
    }
}

