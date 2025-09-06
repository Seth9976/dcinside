package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

@UnstableApi
public class SonicAudioProcessor implements AudioProcessor {
    private int b;
    private float c;
    private float d;
    private AudioFormat e;
    private AudioFormat f;
    private AudioFormat g;
    private AudioFormat h;
    private boolean i;
    @Nullable
    private Sonic j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;
    public static final int q = -1;
    private static final float r = 0.0001f;
    private static final int s = 0x400;

    public SonicAudioProcessor() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = AudioFormat.e;
        this.f = AudioFormat.e;
        this.g = AudioFormat.e;
        this.h = AudioFormat.e;
        this.k = AudioProcessor.a;
        this.l = AudioProcessor.a.asShortBuffer();
        this.m = AudioProcessor.a;
        this.b = -1;
    }

    public final long a(long v) {
        if(this.o >= 0x400L) {
            long v1 = this.n - ((long)((Sonic)Assertions.g(this.j)).l());
            int v2 = this.h.a;
            int v3 = this.g.a;
            return v2 == v3 ? Util.Z1(v, v1, this.o) : Util.Z1(v, v1 * ((long)v2), this.o * ((long)v3));
        }
        return (long)(((double)this.c) * ((double)v));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.common.audio.AudioProcessor
    public final boolean b() {
        return this.p && (this.j == null || this.j.k() == 0);
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer0) {
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        Sonic sonic0 = (Sonic)Assertions.g(this.j);
        ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
        int v = byteBuffer0.remaining();
        this.n += (long)v;
        sonic0.t(shortBuffer0);
        byteBuffer0.position(byteBuffer0.position() + v);
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        Sonic sonic0 = this.j;
        if(sonic0 != null) {
            sonic0.s();
        }
        this.p = true;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        Sonic sonic0 = this.j;
        if(sonic0 != null) {
            int v = sonic0.k();
            if(v > 0) {
                if(this.k.capacity() < v) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
                    this.k = byteBuffer0;
                    this.l = byteBuffer0.asShortBuffer();
                }
                else {
                    this.k.clear();
                    this.l.clear();
                }
                sonic0.j(this.l);
                this.o += (long)v;
                this.k.limit(v);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer1 = this.m;
        this.m = AudioProcessor.a;
        return byteBuffer1;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final AudioFormat f(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        if(audioProcessor$AudioFormat0.c != 2) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        this.e = audioProcessor$AudioFormat0;
        AudioFormat audioProcessor$AudioFormat1 = new AudioFormat((this.b == -1 ? audioProcessor$AudioFormat0.a : this.b), audioProcessor$AudioFormat0.b, 2);
        this.f = audioProcessor$AudioFormat1;
        this.i = true;
        return audioProcessor$AudioFormat1;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if(this.isActive()) {
            AudioFormat audioProcessor$AudioFormat0 = this.e;
            this.g = audioProcessor$AudioFormat0;
            AudioFormat audioProcessor$AudioFormat1 = this.f;
            this.h = audioProcessor$AudioFormat1;
            if(this.i) {
                this.j = new Sonic(audioProcessor$AudioFormat0.a, audioProcessor$AudioFormat0.b, this.c, this.d, audioProcessor$AudioFormat1.a);
            }
            else {
                Sonic sonic0 = this.j;
                if(sonic0 != null) {
                    sonic0.i();
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public long g(long v) {
        return this.h(v);
    }

    public final long h(long v) {
        if(this.o >= 0x400L) {
            long v1 = this.n - ((long)((Sonic)Assertions.g(this.j)).l());
            int v2 = this.h.a;
            int v3 = this.g.a;
            return v2 == v3 ? Util.Z1(v, this.o, v1) : Util.Z1(v, this.o * ((long)v3), v1 * ((long)v2));
        }
        return (long)(((double)v) / ((double)this.c));
    }

    public final long i() {
        return this.n - ((long)((Sonic)Assertions.g(this.j)).l());
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 0.0001f || Math.abs(this.d - 1.0f) >= 0.0001f || this.f.a != this.e.a);
    }

    public final void j(int v) {
        this.b = v;
    }

    public final void k(float f) {
        if(this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void l(float f) {
        if(this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override  // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = AudioFormat.e;
        this.f = AudioFormat.e;
        this.g = AudioFormat.e;
        this.h = AudioFormat.e;
        this.k = AudioProcessor.a;
        this.l = AudioProcessor.a.asShortBuffer();
        this.m = AudioProcessor.a;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}

