package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
public interface MediaCodecAdapter {
    public static final class Configuration {
        public final MediaCodecInfo a;
        public final MediaFormat b;
        public final Format c;
        @Nullable
        public final Surface d;
        @Nullable
        public final MediaCrypto e;
        public final int f;

        private Configuration(MediaCodecInfo mediaCodecInfo0, MediaFormat mediaFormat0, Format format0, @Nullable Surface surface0, @Nullable MediaCrypto mediaCrypto0, int v) {
            this.a = mediaCodecInfo0;
            this.b = mediaFormat0;
            this.c = format0;
            this.d = surface0;
            this.e = mediaCrypto0;
            this.f = v;
        }

        public static Configuration a(MediaCodecInfo mediaCodecInfo0, MediaFormat mediaFormat0, Format format0, @Nullable MediaCrypto mediaCrypto0) {
            return new Configuration(mediaCodecInfo0, mediaFormat0, format0, null, mediaCrypto0, 0);
        }

        public static Configuration b(MediaCodecInfo mediaCodecInfo0, MediaFormat mediaFormat0, Format format0, @Nullable Surface surface0, @Nullable MediaCrypto mediaCrypto0) {
            return new Configuration(mediaCodecInfo0, mediaFormat0, format0, surface0, mediaCrypto0, 0);
        }
    }

    public interface Factory {
        @Deprecated
        public static final Factory a;

        static {
            Factory.a = new DefaultMediaCodecAdapterFactory();
        }

        MediaCodecAdapter a(Configuration arg1) throws IOException;
    }

    public interface OnBufferAvailableListener {
        void a();

        void b();
    }

    public interface OnFrameRenderedListener {
        void a(MediaCodecAdapter arg1, long arg2, long arg3);
    }

    void a(Bundle arg1);

    void b(int arg1, int arg2, int arg3, long arg4, int arg5);

    @RequiresApi(26)
    PersistableBundle c();

    void d(int arg1, int arg2, CryptoInfo arg3, long arg4, int arg5);

    boolean e();

    @RequiresApi(21)
    void f(int arg1, long arg2);

    void flush();

    void g(int arg1);

    int h(MediaCodec.BufferInfo arg1);

    void i(int arg1, boolean arg2);

    @RequiresApi(21)
    boolean j(OnBufferAvailableListener arg1);

    @RequiresApi(23)
    void k(OnFrameRenderedListener arg1, Handler arg2);

    MediaFormat l();

    @Nullable
    ByteBuffer m(int arg1);

    @RequiresApi(23)
    void n(Surface arg1);

    int o();

    @Nullable
    ByteBuffer p(int arg1);

    void release();
}

