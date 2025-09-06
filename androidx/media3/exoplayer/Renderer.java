package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@UnstableApi
public interface Renderer extends Target {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({ElementType.TYPE_USE})
    public @interface MessageType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({ElementType.TYPE_USE})
    public @interface State {
    }

    public interface WakeupListener {
        void a();

        void b();
    }

    public static final int A0 = 3;
    public static final int B0 = 4;
    public static final int C0 = 5;
    public static final int D0 = 6;
    public static final int E0 = 7;
    public static final int F0 = 8;
    public static final int G0 = 9;
    public static final int H0 = 10;
    public static final int I0 = 11;
    public static final int J0 = 12;
    public static final int K0 = 13;
    public static final int L0 = 14;
    public static final int M0 = 15;
    public static final int N0 = 16;
    public static final int O0 = 10000;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final long x0 = 10000L;
    public static final int y0 = 1;
    public static final int z0 = 2;

    void A(Timeline arg1);

    RendererCapabilities B();

    void E(float arg1, float arg2) throws ExoPlaybackException;

    boolean b();

    void c();

    void d(long arg1, long arg2) throws ExoPlaybackException;

    @Nullable
    SampleStream e();

    void f();

    int g();

    String getName();

    int getState();

    boolean h();

    void i(RendererConfiguration arg1, Format[] arg2, SampleStream arg3, long arg4, boolean arg5, boolean arg6, long arg7, long arg8, MediaPeriodId arg9) throws ExoPlaybackException;

    boolean isReady();

    void n(Format[] arg1, SampleStream arg2, long arg3, long arg4, MediaPeriodId arg5) throws ExoPlaybackException;

    boolean p();

    long r();

    void release();

    void reset();

    void s(long arg1) throws ExoPlaybackException;

    void start() throws ExoPlaybackException;

    void stop();

    @Nullable
    MediaClock t();

    void v(int arg1, PlayerId arg2, Clock arg3);

    void w();

    void x() throws IOException;

    long z(long arg1, long arg2);
}

