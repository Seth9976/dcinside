package androidx.media3.decoder;

import android.media.MediaCodec.CryptoInfo.Pattern;
import android.media.MediaCodec.CryptoInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class CryptoInfo {
    @RequiresApi(24)
    static final class PatternHolderV24 {
        private final MediaCodec.CryptoInfo a;
        private final MediaCodec.CryptoInfo.Pattern b;

        private PatternHolderV24(MediaCodec.CryptoInfo mediaCodec$CryptoInfo0) {
            this.a = mediaCodec$CryptoInfo0;
            this.b = c.a(0, 0);
        }

        PatternHolderV24(MediaCodec.CryptoInfo mediaCodec$CryptoInfo0, androidx.media3.decoder.CryptoInfo.1 cryptoInfo$10) {
            this(mediaCodec$CryptoInfo0);
        }

        private void b(int v, int v1) {
            this.b.set(v, v1);
            this.a.setPattern(this.b);
        }
    }

    @Nullable
    public byte[] a;
    @Nullable
    public byte[] b;
    public int c;
    @Nullable
    public int[] d;
    @Nullable
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final MediaCodec.CryptoInfo i;
    @Nullable
    private final PatternHolderV24 j;

    public CryptoInfo() {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = new MediaCodec.CryptoInfo();
        this.i = mediaCodec$CryptoInfo0;
        this.j = Util.a < 24 ? null : new PatternHolderV24(mediaCodec$CryptoInfo0, null);
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void b(int v) {
        if(v == 0) {
            return;
        }
        if(this.d == null) {
            int[] arr_v = new int[1];
            this.d = arr_v;
            this.i.numBytesOfClearData = arr_v;
        }
        this.d[0] += v;
    }

    public void c(int v, int[] arr_v, int[] arr_v1, byte[] arr_b, byte[] arr_b1, int v1, int v2, int v3) {
        this.f = v;
        this.d = arr_v;
        this.e = arr_v1;
        this.b = arr_b;
        this.a = arr_b1;
        this.c = v1;
        this.g = v2;
        this.h = v3;
        this.i.numSubSamples = v;
        this.i.numBytesOfClearData = arr_v;
        this.i.numBytesOfEncryptedData = arr_v1;
        this.i.key = arr_b;
        this.i.iv = arr_b1;
        this.i.mode = v1;
        if(Util.a >= 24) {
            ((PatternHolderV24)Assertions.g(this.j)).b(v2, v3);
        }
    }

    class androidx.media3.decoder.CryptoInfo.1 {
    }

}

