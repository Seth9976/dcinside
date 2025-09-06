package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public static final long A = 2000000L;
    @Deprecated
    public static final long B = 20000L;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 1000;
    private final float i;
    private final short j;
    private final int k;
    private final long l;
    private final long m;
    private int n;
    private boolean o;
    private int p;
    private long q;
    private int r;
    private byte[] s;
    private int t;
    private int u;
    private byte[] v;
    public static final float w = 0.2f;
    public static final int x = 10;
    public static final short y = 0x400;
    public static final long z = 100000L;

    public SilenceSkippingAudioProcessor() {
        this(100000L, 0.2f, 2000000L, 10, 0x400);
    }

    public SilenceSkippingAudioProcessor(long v, float f, long v1, int v2, short v3) {
        boolean z = false;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        if(f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Assertions.a(z);
        this.l = v;
        this.i = f;
        this.m = v1;
        this.k = v2;
        this.j = v3;
        this.s = Util.f;
        this.v = Util.f;
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long v, long v1, short v2) {
        this(v, ((float)v1) / ((float)v), v, 0, v2);
    }

    private void A(int v, int v1) {
        boolean z = true;
        if(v == 0) {
            return;
        }
        Assertions.a(this.u >= v);
        if(v1 == 2) {
            int v2 = this.t;
            int v3 = this.u;
            byte[] arr_b = this.s;
            if(v2 + v3 <= arr_b.length) {
                System.arraycopy(arr_b, v2 + v3 - v, this.v, 0, v);
            }
            else {
                int v4 = v3 - (arr_b.length - v2);
                if(v4 >= v) {
                    System.arraycopy(arr_b, v4 - v, this.v, 0, v);
                }
                else {
                    int v5 = v - v4;
                    System.arraycopy(arr_b, arr_b.length - v5, this.v, 0, v5);
                    System.arraycopy(this.s, 0, this.v, v5, v4);
                }
            }
        }
        else {
            int v6 = this.t;
            byte[] arr_b1 = this.s;
            if(v6 + v <= arr_b1.length) {
                System.arraycopy(arr_b1, v6, this.v, 0, v);
            }
            else {
                int v7 = arr_b1.length - v6;
                System.arraycopy(arr_b1, v6, this.v, 0, v7);
                System.arraycopy(this.s, 0, this.v, v7, v - v7);
            }
        }
        Assertions.b(v % this.n == 0, "sizeToOutput is not aligned to frame size: " + v);
        if(this.t >= this.s.length) {
            z = false;
        }
        Assertions.i(z);
        this.y(this.v, v, v1);
    }

    private void B(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.limit();
        byteBuffer0.limit(Math.min(v, byteBuffer0.position() + this.s.length));
        int v1 = this.s(byteBuffer0);
        if(v1 == byteBuffer0.position()) {
            this.p = 1;
        }
        else {
            byteBuffer0.limit(Math.min(v1, byteBuffer0.capacity()));
            this.x(byteBuffer0);
        }
        byteBuffer0.limit(v);
    }

    private static void C(byte[] arr_b, int v, int v1) {
        if(v1 >= 0x7FFF) {
            arr_b[v] = -1;
            arr_b[v + 1] = 0x7F;
            return;
        }
        if(v1 <= 0xFFFF8000) {
            arr_b[v] = 0;
            arr_b[v + 1] = (byte)0x80;
            return;
        }
        arr_b[v] = (byte)(v1 & 0xFF);
        arr_b[v + 1] = (byte)(v1 >> 8);
    }

    public void D(boolean z) {
        this.o = z;
    }

    private void E(ByteBuffer byteBuffer0) {
        int v6;
        int v5;
        boolean z = true;
        Assertions.i(this.t < this.s.length);
        int v = byteBuffer0.limit();
        int v1 = this.t(byteBuffer0);
        int v2 = v1 - byteBuffer0.position();
        int v3 = this.t;
        int v4 = this.u;
        byte[] arr_b = this.s;
        if(v3 + v4 < arr_b.length) {
            v5 = arr_b.length - (v4 + v3);
            v6 = v3 + v4;
        }
        else {
            int v7 = v4 - (arr_b.length - v3);
            v5 = v3 - v7;
            v6 = v7;
        }
        int v8 = Math.min(v2, v5);
        byteBuffer0.limit(byteBuffer0.position() + v8);
        byteBuffer0.get(this.s, v6, v8);
        int v9 = this.u + v8;
        this.u = v9;
        Assertions.i(v9 <= this.s.length);
        if(v1 >= v || v2 >= v5) {
            z = false;
        }
        this.z(z);
        if(z) {
            this.p = 0;
            this.r = 0;
        }
        byteBuffer0.limit(v);
    }

    private static int F(byte b, byte b1) [...] // Inlined contents

    @Override  // androidx.media3.common.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer0) {
        while(byteBuffer0.hasRemaining() && !this.a()) {
            switch(this.p) {
                case 0: {
                    this.B(byteBuffer0);
                    break;
                }
                case 1: {
                    this.E(byteBuffer0);
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    protected AudioFormat h(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        if(audioProcessor$AudioFormat0.c != 2) {
            throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
        }
        return audioProcessor$AudioFormat0.a == -1 ? AudioFormat.e : audioProcessor$AudioFormat0;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public void i() {
        if(this.isActive()) {
            this.n = this.b.b * 2;
            int v = this.n(this.r(this.l) / 2);
            if(this.s.length != v * 2) {
                this.s = new byte[v * 2];
                this.v = new byte[v * 2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public boolean isActive() {
        return super.isActive() && this.o;
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public void j() {
        if(this.u > 0) {
            this.z(true);
            this.r = 0;
        }
    }

    @Override  // androidx.media3.common.audio.BaseAudioProcessor
    public void k() {
        this.o = false;
        this.s = Util.f;
        this.v = Util.f;
    }

    private int m(float f) {
        return this.n(((int)f));
    }

    private int n(int v) {
        return v / this.n * this.n;
    }

    private int o(int v, int v1) {
        return this.k + (100 - this.k) * (v * 1000) / v1 / 1000;
    }

    private int p(int v, int v1) {
        return (this.k - 100) * (v * 1000 / v1) / 1000 + 100;
    }

    private int q(int v) {
        int v1 = (this.r(this.m) - this.r) * this.n - this.s.length / 2;
        Assertions.i(v1 >= 0);
        return this.m(Math.min(((float)v) * this.i + 0.5f, v1));
    }

    private int r(long v) {
        return (int)(v * ((long)this.b.a) / 1000000L);
    }

    private int s(ByteBuffer byteBuffer0) {
        for(int v = byteBuffer0.limit() - 1; v >= byteBuffer0.position(); v -= 2) {
            if(this.v(byteBuffer0.get(v), byteBuffer0.get(v - 1))) {
                return v / this.n * this.n + this.n;
            }
        }
        return byteBuffer0.position();
    }

    private int t(ByteBuffer byteBuffer0) {
        for(int v = byteBuffer0.position() + 1; v < byteBuffer0.limit(); v += 2) {
            if(this.v(byteBuffer0.get(v), byteBuffer0.get(v - 1))) {
                return this.n * (v / this.n);
            }
        }
        return byteBuffer0.limit();
    }

    public long u() {
        return this.q;
    }

    private boolean v(byte b, byte b1) {
        return Math.abs(b << 8 | b1 & 0xFF) > this.j;
    }

    private void w(byte[] arr_b, int v, int v1) {
        int v4;
        if(v1 == 3) {
            return;
        }
        for(int v2 = 0; v2 < v; v2 += 2) {
            int v3 = SilenceSkippingAudioProcessor.F(arr_b[v2 + 1], arr_b[v2]);
            if(v1 == 0) {
                v4 = this.p(v2, v - 1);
            }
            else {
                v4 = v1 == 2 ? this.o(v2, v - 1) : this.k;
            }
            SilenceSkippingAudioProcessor.C(arr_b, v2, v3 * v4 / 100);
        }
    }

    private void x(ByteBuffer byteBuffer0) {
        this.l(byteBuffer0.remaining()).put(byteBuffer0).flip();
    }

    private void y(byte[] arr_b, int v, int v1) {
        Assertions.b(v % this.n == 0, "byteOutput size is not aligned to frame size " + v);
        this.w(arr_b, v, v1);
        this.l(v).put(arr_b, 0, v).flip();
    }

    private void z(boolean z) {
        int v2;
        int v1;
        boolean z1 = false;
        int v = this.u;
        byte[] arr_b = this.s;
        if(v == arr_b.length || z) {
            if(this.r == 0) {
                if(z) {
                    this.A(v, 3);
                    v1 = v;
                }
                else {
                    Assertions.i(v >= arr_b.length / 2);
                    v1 = this.s.length / 2;
                    this.A(v1, 0);
                }
                v2 = v1;
            }
            else if(z) {
                int v3 = v - arr_b.length / 2;
                int v4 = this.q(v3) + this.s.length / 2;
                this.A(v4, 2);
                v2 = v4;
                v1 = arr_b.length / 2 + v3;
            }
            else {
                v1 = v - arr_b.length / 2;
                v2 = this.q(v1);
                this.A(v2, 1);
            }
            Assertions.j(v1 % this.n == 0, "bytesConsumed is not aligned to frame size: %s" + v1);
            if(v >= v2) {
                z1 = true;
            }
            Assertions.i(z1);
            this.u -= v1;
            this.t = (this.t + v1) % this.s.length;
            int v5 = this.n;
            this.r += v2 / v5;
            this.q += (long)((v1 - v2) / v5);
        }
    }
}

