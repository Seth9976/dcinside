package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public interface RendererCapabilities {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface AdaptiveSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface AudioOffloadSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Capabilities {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DecoderSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface HardwareAccelerationSupport {
    }

    public interface Listener {
        void a(Renderer arg1);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface TunnelingSupport {
    }

    public static final int S0 = 7;
    public static final int T0 = 24;
    public static final int U0 = 16;
    public static final int V0 = 8;
    public static final int W0 = 0;
    public static final int X0 = 0x20;
    public static final int Y0 = 0x20;
    public static final int Z0 = 0;
    public static final int a1 = 0x40;
    public static final int b1 = 0x40;
    public static final int c1 = 0;
    public static final int d1 = 0x180;
    public static final int e1 = 0x100;
    public static final int f1 = 0x80;
    public static final int g1 = 0;
    public static final int h1 = 0xE00;
    public static final int i1 = 0x800;
    public static final int j1 = 0x400;
    public static final int k1 = 0x200;
    public static final int l1;

    void C(Listener arg1);

    int F() throws ExoPlaybackException;

    int a(Format arg1) throws ExoPlaybackException;

    int g();

    String getName();

    void u();
}

