package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

final class TrimmingAudioProcessor extends BaseAudioProcessor {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m;
    private int n;
    private long o;
    private static final int p = 2;

    public TrimmingAudioProcessor() {
        this.m = Util.f;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public boolean b() {
        return super.b() && this.n == 0;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
        if(v2 == 0) {
            return;
        }
        int v3 = Math.min(v2, this.l);
        this.o += (long)(v3 / this.b.d);
        this.l -= v3;
        byteBuffer0.position(v + v3);
        if(this.l > 0) {
            return;
        }
        int v4 = v2 - v3;
        int v5 = this.n + v4 - this.m.length;
        ByteBuffer byteBuffer1 = this.l(v5);
        int v6 = Util.w(v5, 0, this.n);
        byteBuffer1.put(this.m, 0, v6);
        int v7 = Util.w(v5 - v6, 0, v4);
        byteBuffer0.limit(byteBuffer0.position() + v7);
        byteBuffer1.put(byteBuffer0);
        byteBuffer0.limit(v1);
        int v8 = v4 - v7;
        int v9 = this.n - v6;
        this.n = v9;
        System.arraycopy(this.m, v6, this.m, 0, v9);
        byteBuffer0.get(this.m, this.n, v8);
        this.n += v8;
        byteBuffer1.flip();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public ByteBuffer e() {
        if(super.b()) {
            int v = this.n;
            if(v > 0) {
                this.l(v).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.e();
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public long g(long v) {
        return v - Util.Y1(this.j + this.i, this.b.a);
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        if(audioProcessor$AudioFormat0.c != 2) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        this.k = true;
        return this.i != 0 || this.j != 0 ? audioProcessor$AudioFormat0 : AudioFormat.e;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void i() {
        if(this.k) {
            this.k = false;
            int v = this.b.d;
            this.m = new byte[this.j * v];
            this.l = this.i * v;
        }
        this.n = 0;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void j() {
        if(this.k) {
            int v = this.n;
            if(v > 0) {
                this.o += (long)(v / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected void k() {
        this.m = Util.f;
    }

    public long m() {
        return this.o;
    }

    public void n() {
        this.o = 0L;
    }

    public void o(int v, int v1) {
        this.i = v;
        this.j = v1;
    }
}

