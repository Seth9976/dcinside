package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil.Header;

final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final int k;
    private final long l;

    public ConstantBitrateSeeker(long v, long v1, int v2, int v3, boolean z) {
        super(v, v1, v2, v3, z);
        this.k = v2;
        if(v == -1L) {
            v = -1L;
        }
        this.l = v;
    }

    public ConstantBitrateSeeker(long v, long v1, Header mpegAudioUtil$Header0, boolean z) {
        this(v, v1, mpegAudioUtil$Header0.f, mpegAudioUtil$Header0.c, z);
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long b(long v) {
        return this.c(v);
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long f() {
        return this.l;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public int i() {
        return this.k;
    }
}

