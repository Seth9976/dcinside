package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@UnstableApi
public interface AudioSink {
    public static final class AudioTrackConfig {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public AudioTrackConfig(int v, int v1, int v2, boolean z, boolean z1, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = z;
            this.e = z1;
            this.f = v3;
        }
    }

    public static final class ConfigurationException extends Exception {
        public final Format a;

        public ConfigurationException(String s, Format format0) {
            super(s);
            this.a = format0;
        }

        public ConfigurationException(Throwable throwable0, Format format0) {
            super(throwable0);
            this.a = format0;
        }
    }

    public static final class InitializationException extends Exception {
        public final int a;
        public final boolean b;
        public final Format c;

        public InitializationException(int v, int v1, int v2, int v3, Format format0, boolean z, @Nullable Exception exception0) {
            super("AudioTrack init failed " + v + " " + "Config(" + v1 + ", " + v2 + ", " + v3 + ")" + " " + format0 + (z ? " (recoverable)" : ""), exception0);
            this.a = v;
            this.b = z;
            this.c = format0;
        }
    }

    public interface Listener {
        void a(long arg1);

        void b(AudioTrackConfig arg1);

        void c(AudioTrackConfig arg1);

        void d(boolean arg1);

        void e(Exception arg1);

        void f();

        void g(int arg1, long arg2, long arg3);

        void h();

        void i();

        void j();

        void k();
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface OffloadMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long a;
        public final long b;

        public UnexpectedDiscontinuityException(long v, long v1) {
            super("Unexpected audio track timestamp discontinuity: expected " + v1 + ", got " + v);
            this.a = v;
            this.b = v1;
        }
    }

    public static final class WriteException extends Exception {
        public final int a;
        public final boolean b;
        public final Format c;

        public WriteException(int v, Format format0, boolean z) {
            super("AudioTrack write failed: " + v);
            this.b = z;
            this.a = v;
            this.c = format0;
        }
    }

    public static final int a = 2;
    public static final int b = 1;
    public static final int c = 0;
    public static final long d = 0x8000000000000000L;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;

    void A(@Nullable PlayerId arg1);

    void B(long arg1);

    void C();

    boolean a(Format arg1);

    boolean b();

    void c();

    @Nullable
    AudioAttributes d();

    void e(AudioAttributes arg1);

    void f(Listener arg1);

    void flush();

    @RequiresApi(29)
    void g(int arg1);

    boolean h();

    void i();

    void j(AuxEffectInfo arg1);

    void k(int arg1);

    void l(PlaybackParameters arg1);

    PlaybackParameters m();

    void n(Format arg1, int arg2, @Nullable int[] arg3) throws ConfigurationException;

    void o(float arg1);

    void p();

    void pause();

    int q(Format arg1);

    void r(boolean arg1);

    void release();

    void reset();

    void s(Clock arg1);

    AudioOffloadSupport t(Format arg1);

    @RequiresApi(23)
    void u(@Nullable AudioDeviceInfo arg1);

    boolean v();

    boolean w(ByteBuffer arg1, long arg2, int arg3) throws InitializationException, WriteException;

    void x() throws WriteException;

    @RequiresApi(29)
    void y(int arg1, int arg2);

    long z(boolean arg1);
}

