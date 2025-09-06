package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

class SampleDataQueue {
    static final class AllocationNode implements androidx.media3.exoplayer.upstream.Allocator.AllocationNode {
        public long a;
        public long b;
        @Nullable
        public Allocation c;
        @Nullable
        public AllocationNode d;

        public AllocationNode(long v, int v1) {
            this.d(v, v1);
        }

        @Override  // androidx.media3.exoplayer.upstream.Allocator$AllocationNode
        public Allocation a() {
            return (Allocation)Assertions.g(this.c);
        }

        public AllocationNode b() {
            this.c = null;
            AllocationNode sampleDataQueue$AllocationNode0 = this.d;
            this.d = null;
            return sampleDataQueue$AllocationNode0;
        }

        public void c(Allocation allocation0, AllocationNode sampleDataQueue$AllocationNode0) {
            this.c = allocation0;
            this.d = sampleDataQueue$AllocationNode0;
        }

        public void d(long v, int v1) {
            Assertions.i(this.c == null);
            this.a = v;
            this.b = v + ((long)v1);
        }

        public int e(long v) {
            return ((int)(v - this.a)) + this.c.b;
        }

        @Override  // androidx.media3.exoplayer.upstream.Allocator$AllocationNode
        @Nullable
        public androidx.media3.exoplayer.upstream.Allocator.AllocationNode next() {
            return this.d == null || this.d.c == null ? null : this.d;
        }
    }

    private final Allocator a;
    private final int b;
    private final ParsableByteArray c;
    private AllocationNode d;
    private AllocationNode e;
    private AllocationNode f;
    private long g;
    private static final int h = 0x20;

    public SampleDataQueue(Allocator allocator0) {
        this.a = allocator0;
        int v = allocator0.f();
        this.b = v;
        this.c = new ParsableByteArray(0x20);
        AllocationNode sampleDataQueue$AllocationNode0 = new AllocationNode(0L, v);
        this.d = sampleDataQueue$AllocationNode0;
        this.e = sampleDataQueue$AllocationNode0;
        this.f = sampleDataQueue$AllocationNode0;
    }

    private void a(AllocationNode sampleDataQueue$AllocationNode0) {
        if(sampleDataQueue$AllocationNode0.c == null) {
            return;
        }
        this.a.a(sampleDataQueue$AllocationNode0);
        sampleDataQueue$AllocationNode0.b();
    }

    public void b(long v) {
        AllocationNode sampleDataQueue$AllocationNode0;
        if(v == -1L) {
            return;
        }
        while(true) {
            sampleDataQueue$AllocationNode0 = this.d;
            if(v < sampleDataQueue$AllocationNode0.b) {
                break;
            }
            this.a.e(sampleDataQueue$AllocationNode0.c);
            this.d = this.d.b();
        }
        if(this.e.a < sampleDataQueue$AllocationNode0.a) {
            this.e = sampleDataQueue$AllocationNode0;
        }
    }

    public void c(long v) {
        Assertions.a(v <= this.g);
        this.g = v;
        if(v == 0L) {
        label_18:
            this.a(this.d);
            AllocationNode sampleDataQueue$AllocationNode3 = new AllocationNode(this.g, this.b);
            this.d = sampleDataQueue$AllocationNode3;
            this.e = sampleDataQueue$AllocationNode3;
            this.f = sampleDataQueue$AllocationNode3;
        }
        else {
            AllocationNode sampleDataQueue$AllocationNode0 = this.d;
            if(v == sampleDataQueue$AllocationNode0.a) {
                goto label_18;
            }
            else {
                while(this.g > sampleDataQueue$AllocationNode0.b) {
                    sampleDataQueue$AllocationNode0 = sampleDataQueue$AllocationNode0.d;
                }
                AllocationNode sampleDataQueue$AllocationNode1 = (AllocationNode)Assertions.g(sampleDataQueue$AllocationNode0.d);
                this.a(sampleDataQueue$AllocationNode1);
                AllocationNode sampleDataQueue$AllocationNode2 = new AllocationNode(sampleDataQueue$AllocationNode0.b, this.b);
                sampleDataQueue$AllocationNode0.d = sampleDataQueue$AllocationNode2;
                if(this.g == sampleDataQueue$AllocationNode0.b) {
                    sampleDataQueue$AllocationNode0 = sampleDataQueue$AllocationNode2;
                }
                this.f = sampleDataQueue$AllocationNode0;
                if(this.e == sampleDataQueue$AllocationNode1) {
                    this.e = sampleDataQueue$AllocationNode2;
                }
            }
        }
    }

    private static AllocationNode d(AllocationNode sampleDataQueue$AllocationNode0, long v) {
        while(v >= sampleDataQueue$AllocationNode0.b) {
            sampleDataQueue$AllocationNode0 = sampleDataQueue$AllocationNode0.d;
        }
        return sampleDataQueue$AllocationNode0;
    }

    public long e() {
        return this.g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer0, SampleExtrasHolder sampleQueue$SampleExtrasHolder0) {
        SampleDataQueue.l(this.e, decoderInputBuffer0, sampleQueue$SampleExtrasHolder0, this.c);
    }

    private void g(int v) {
        long v1 = this.g + ((long)v);
        this.g = v1;
        AllocationNode sampleDataQueue$AllocationNode0 = this.f;
        if(v1 == sampleDataQueue$AllocationNode0.b) {
            this.f = sampleDataQueue$AllocationNode0.d;
        }
    }

    private int h(int v) {
        AllocationNode sampleDataQueue$AllocationNode0 = this.f;
        if(sampleDataQueue$AllocationNode0.c == null) {
            sampleDataQueue$AllocationNode0.c(this.a.d(), new AllocationNode(this.f.b, this.b));
        }
        return Math.min(v, ((int)(this.f.b - this.g)));
    }

    private static AllocationNode i(AllocationNode sampleDataQueue$AllocationNode0, long v, ByteBuffer byteBuffer0, int v1) {
        AllocationNode sampleDataQueue$AllocationNode1 = SampleDataQueue.d(sampleDataQueue$AllocationNode0, v);
        while(v1 > 0) {
            int v2 = Math.min(v1, ((int)(sampleDataQueue$AllocationNode1.b - v)));
            byteBuffer0.put(sampleDataQueue$AllocationNode1.c.a, sampleDataQueue$AllocationNode1.e(v), v2);
            v1 -= v2;
            v += (long)v2;
            if(v == sampleDataQueue$AllocationNode1.b) {
                sampleDataQueue$AllocationNode1 = sampleDataQueue$AllocationNode1.d;
            }
        }
        return sampleDataQueue$AllocationNode1;
    }

    private static AllocationNode j(AllocationNode sampleDataQueue$AllocationNode0, long v, byte[] arr_b, int v1) {
        AllocationNode sampleDataQueue$AllocationNode1 = SampleDataQueue.d(sampleDataQueue$AllocationNode0, v);
        int v2 = v1;
        while(v2 > 0) {
            int v3 = Math.min(v2, ((int)(sampleDataQueue$AllocationNode1.b - v)));
            System.arraycopy(sampleDataQueue$AllocationNode1.c.a, sampleDataQueue$AllocationNode1.e(v), arr_b, v1 - v2, v3);
            v2 -= v3;
            v += (long)v3;
            if(v == sampleDataQueue$AllocationNode1.b) {
                sampleDataQueue$AllocationNode1 = sampleDataQueue$AllocationNode1.d;
            }
        }
        return sampleDataQueue$AllocationNode1;
    }

    private static AllocationNode k(AllocationNode sampleDataQueue$AllocationNode0, DecoderInputBuffer decoderInputBuffer0, SampleExtrasHolder sampleQueue$SampleExtrasHolder0, ParsableByteArray parsableByteArray0) {
        int v4;
        long v = sampleQueue$SampleExtrasHolder0.b;
        parsableByteArray0.U(1);
        AllocationNode sampleDataQueue$AllocationNode1 = SampleDataQueue.j(sampleDataQueue$AllocationNode0, v, parsableByteArray0.e(), 1);
        int v2 = parsableByteArray0.e()[0];
        boolean z = (v2 & 0x80) != 0;
        CryptoInfo cryptoInfo0 = decoderInputBuffer0.c;
        byte[] arr_b = cryptoInfo0.a;
        if(arr_b == null) {
            cryptoInfo0.a = new byte[16];
        }
        else {
            Arrays.fill(arr_b, 0);
        }
        AllocationNode sampleDataQueue$AllocationNode2 = SampleDataQueue.j(sampleDataQueue$AllocationNode1, v + 1L, cryptoInfo0.a, v2 & 0x7F);
        long v3 = v + 1L + ((long)(v2 & 0x7F));
        if(z) {
            parsableByteArray0.U(2);
            sampleDataQueue$AllocationNode2 = SampleDataQueue.j(sampleDataQueue$AllocationNode2, v3, parsableByteArray0.e(), 2);
            v3 += 2L;
            v4 = parsableByteArray0.R();
        }
        else {
            v4 = 1;
        }
        int[] arr_v = cryptoInfo0.d != null && cryptoInfo0.d.length >= v4 ? cryptoInfo0.d : new int[v4];
        int[] arr_v1 = cryptoInfo0.e != null && cryptoInfo0.e.length >= v4 ? cryptoInfo0.e : new int[v4];
        if(z) {
            parsableByteArray0.U(v4 * 6);
            sampleDataQueue$AllocationNode2 = SampleDataQueue.j(sampleDataQueue$AllocationNode2, v3, parsableByteArray0.e(), v4 * 6);
            v3 += (long)(v4 * 6);
            parsableByteArray0.Y(0);
            for(int v1 = 0; v1 < v4; ++v1) {
                arr_v[v1] = parsableByteArray0.R();
                arr_v1[v1] = parsableByteArray0.P();
            }
        }
        else {
            arr_v[0] = 0;
            arr_v1[0] = sampleQueue$SampleExtrasHolder0.a - ((int)(v3 - sampleQueue$SampleExtrasHolder0.b));
        }
        cryptoInfo0.c(v4, arr_v, arr_v1, sampleQueue$SampleExtrasHolder0.c.b, cryptoInfo0.a, sampleQueue$SampleExtrasHolder0.c.a, sampleQueue$SampleExtrasHolder0.c.c, sampleQueue$SampleExtrasHolder0.c.d);
        int v5 = (int)(v3 - sampleQueue$SampleExtrasHolder0.b);
        sampleQueue$SampleExtrasHolder0.b += (long)v5;
        sampleQueue$SampleExtrasHolder0.a -= v5;
        return sampleDataQueue$AllocationNode2;
    }

    private static AllocationNode l(AllocationNode sampleDataQueue$AllocationNode0, DecoderInputBuffer decoderInputBuffer0, SampleExtrasHolder sampleQueue$SampleExtrasHolder0, ParsableByteArray parsableByteArray0) {
        if(decoderInputBuffer0.t()) {
            sampleDataQueue$AllocationNode0 = SampleDataQueue.k(sampleDataQueue$AllocationNode0, decoderInputBuffer0, sampleQueue$SampleExtrasHolder0, parsableByteArray0);
        }
        if(decoderInputBuffer0.i()) {
            parsableByteArray0.U(4);
            AllocationNode sampleDataQueue$AllocationNode1 = SampleDataQueue.j(sampleDataQueue$AllocationNode0, sampleQueue$SampleExtrasHolder0.b, parsableByteArray0.e(), 4);
            int v = parsableByteArray0.P();
            sampleQueue$SampleExtrasHolder0.b += 4L;
            sampleQueue$SampleExtrasHolder0.a -= 4;
            decoderInputBuffer0.r(v);
            AllocationNode sampleDataQueue$AllocationNode2 = SampleDataQueue.i(sampleDataQueue$AllocationNode1, sampleQueue$SampleExtrasHolder0.b, decoderInputBuffer0.d, v);
            sampleQueue$SampleExtrasHolder0.b += (long)v;
            int v1 = sampleQueue$SampleExtrasHolder0.a - v;
            sampleQueue$SampleExtrasHolder0.a = v1;
            decoderInputBuffer0.v(v1);
            return SampleDataQueue.i(sampleDataQueue$AllocationNode2, sampleQueue$SampleExtrasHolder0.b, decoderInputBuffer0.g, sampleQueue$SampleExtrasHolder0.a);
        }
        decoderInputBuffer0.r(sampleQueue$SampleExtrasHolder0.a);
        return SampleDataQueue.i(sampleDataQueue$AllocationNode0, sampleQueue$SampleExtrasHolder0.b, decoderInputBuffer0.d, sampleQueue$SampleExtrasHolder0.a);
    }

    public void m(DecoderInputBuffer decoderInputBuffer0, SampleExtrasHolder sampleQueue$SampleExtrasHolder0) {
        this.e = SampleDataQueue.l(this.e, decoderInputBuffer0, sampleQueue$SampleExtrasHolder0, this.c);
    }

    public void n() {
        this.a(this.d);
        this.d.d(0L, this.b);
        this.e = this.d;
        this.f = this.d;
        this.g = 0L;
        this.a.c();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(DataReader dataReader0, int v, boolean z) throws IOException {
        int v1 = this.h(v);
        int v2 = dataReader0.read(this.f.c.a, this.f.e(this.g), v1);
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        this.g(v2);
        return v2;
    }

    public void q(ParsableByteArray parsableByteArray0, int v) {
        while(v > 0) {
            int v1 = this.h(v);
            parsableByteArray0.n(this.f.c.a, this.f.e(this.g), v1);
            v -= v1;
            this.g(v1);
        }
    }
}

