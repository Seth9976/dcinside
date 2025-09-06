package androidx.media3.exoplayer.mediacodec;

import O1.a;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

@UnstableApi
public final class DefaultMediaCodecAdapterFactory implements Factory {
    @Nullable
    private final Context b;
    private int c;
    private boolean d;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final String h = "DMCodecAdapterFactory";

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.c = 0;
        this.d = true;
        this.b = null;
    }

    public DefaultMediaCodecAdapterFactory(Context context0) {
        this.b = context0;
        this.c = 0;
        this.d = true;
    }

    @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory
    public MediaCodecAdapter a(Configuration mediaCodecAdapter$Configuration0) throws IOException {
        if(Util.a >= 23 && (this.c == 1 || this.c == 0 && this.e())) {
            int v = MimeTypes.m(mediaCodecAdapter$Configuration0.c.n);
            Log.h("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Util.M0(v));
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory asynchronousMediaCodecAdapter$Factory0 = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory(v);
            asynchronousMediaCodecAdapter$Factory0.e(this.d);
            return asynchronousMediaCodecAdapter$Factory0.d(mediaCodecAdapter$Configuration0);
        }
        return new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory().a(mediaCodecAdapter$Configuration0);
    }

    @a
    public DefaultMediaCodecAdapterFactory b(boolean z) {
        this.d = z;
        return this;
    }

    @a
    public DefaultMediaCodecAdapterFactory c() {
        this.c = 2;
        return this;
    }

    @a
    public DefaultMediaCodecAdapterFactory d() {
        this.c = 1;
        return this;
    }

    private boolean e() {
        return Util.a < 0x1F ? this.b != null && Util.a >= 28 && this.b.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") : true;
    }
}

