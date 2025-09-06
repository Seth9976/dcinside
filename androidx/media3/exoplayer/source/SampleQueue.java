package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession.DrmSessionException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher;
import androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.g;
import java.io.IOException;

@UnstableApi
public class SampleQueue implements TrackOutput {
    static final class SampleExtrasHolder {
        public int a;
        public long b;
        @Nullable
        public CryptoData c;

    }

    static final class SharedSampleMetadata {
        public final Format a;
        public final DrmSessionReference b;

        private SharedSampleMetadata(Format format0, DrmSessionReference drmSessionManager$DrmSessionReference0) {
            this.a = format0;
            this.b = drmSessionManager$DrmSessionReference0;
        }

        SharedSampleMetadata(Format format0, DrmSessionReference drmSessionManager$DrmSessionReference0, androidx.media3.exoplayer.source.SampleQueue.1 sampleQueue$10) {
            this(format0, drmSessionManager$DrmSessionReference0);
        }
    }

    public interface UpstreamFormatChangedListener {
        void p(Format arg1);
    }

    private boolean A;
    private boolean B;
    private boolean C;
    @Nullable
    private Format D;
    @Nullable
    private Format E;
    private long F;
    private boolean G;
    private boolean H;
    private long I;
    private boolean J;
    @VisibleForTesting
    static final int K = 1000;
    private static final String L = "SampleQueue";
    private final SampleDataQueue d;
    private final SampleExtrasHolder e;
    private final SpannedData f;
    @Nullable
    private final DrmSessionManager g;
    @Nullable
    private final EventDispatcher h;
    @Nullable
    private UpstreamFormatChangedListener i;
    @Nullable
    private Format j;
    @Nullable
    private DrmSession k;
    private int l;
    private long[] m;
    private long[] n;
    private int[] o;
    private int[] p;
    private long[] q;
    private CryptoData[] r;
    private int s;
    private int t;
    private int u;
    private int v;
    private long w;
    private long x;
    private long y;
    private boolean z;

    protected SampleQueue(Allocator allocator0, @Nullable DrmSessionManager drmSessionManager0, @Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
        this.g = drmSessionManager0;
        this.h = drmSessionEventListener$EventDispatcher0;
        this.d = new SampleDataQueue(allocator0);
        this.e = new SampleExtrasHolder();
        this.l = 1000;
        this.m = new long[1000];
        this.n = new long[1000];
        this.q = new long[1000];
        this.p = new int[1000];
        this.o = new int[1000];
        this.r = new CryptoData[1000];
        this.f = new SpannedData((SharedSampleMetadata sampleQueue$SharedSampleMetadata0) -> sampleQueue$SharedSampleMetadata0.b.release());
        this.w = 0x8000000000000000L;
        this.x = 0x8000000000000000L;
        this.y = 0x8000000000000000L;
        this.B = true;
        this.A = true;
        this.G = true;
    }

    public final int A() {
        return this.t;
    }

    public final long B() {
        synchronized(this) {
            return this.s == 0 ? 0x8000000000000000L : this.q[this.u];
        }
    }

    public final long C() {
        synchronized(this) {
        }
        return this.y;
    }

    public final long D() {
        synchronized(this) {
            return Math.max(this.x, this.E(this.v));
        }
    }

    private long E(int v) {
        long v1 = 0x8000000000000000L;
        if(v == 0) {
            return 0x8000000000000000L;
        }
        int v2 = this.G(v - 1);
        for(int v3 = 0; v3 < v; ++v3) {
            v1 = Math.max(v1, this.q[v2]);
            if((this.p[v2] & 1) != 0) {
                break;
            }
            --v2;
            v2 = v2 == -1 ? this.l - 1 : v2 - 1;
        }
        return v1;
    }

    public final int F() {
        return this.t + this.v;
    }

    private int G(int v) {
        int v1 = this.u + v;
        return v1 < this.l ? v1 : v1 - this.l;
    }

    public final int H(long v, boolean z) {
        synchronized(this) {
            int v2 = this.G(this.v);
            if(this.K() && v >= this.q[v2]) {
                if(v > this.y && z) {
                    return this.s - this.v;
                }
                int v3 = this.y(v2, this.s - this.v, v, true);
                return v3 == -1 ? 0 : v3;
            }
            return 0;
        }
    }

    @Nullable
    public final Format I() {
        synchronized(this) {
        }
        return this.B ? null : this.E;
    }

    public final int J() {
        return this.t + this.s;
    }

    private boolean K() {
        return this.v != this.s;
    }

    protected final void L() {
        this.C = true;
    }

    public final boolean M() {
        synchronized(this) {
        }
        return this.z;
    }

    @CallSuper
    public boolean N(boolean z) {
        boolean z1 = true;
        synchronized(this) {
            if(!this.K()) {
                if(!z && !this.z && (this.E == null || this.E == this.j)) {
                    z1 = false;
                }
                return z1;
            }
            return ((SharedSampleMetadata)this.f.f(this.F())).a != this.j ? true : this.P(this.G(this.v));
        }
    }

    // 检测为 Lambda 实现
    private static void O(SharedSampleMetadata sampleQueue$SharedSampleMetadata0) [...]

    // 去混淆评级： 低(20)
    private boolean P(int v) {
        return this.k == null || this.k.getState() == 4 || (this.p[v] & 0x40000000) == 0 && this.k.a();
    }

    @CallSuper
    public void Q() throws IOException {
        if(this.k != null && this.k.getState() == 1) {
            throw (DrmSessionException)Assertions.g(this.k.getError());
        }
    }

    private void R(Format format0, FormatHolder formatHolder0) {
        Format format1 = this.j;
        DrmInitData drmInitData0 = format1 == null ? null : format1.r;
        this.j = format0;
        DrmInitData drmInitData1 = format0.r;
        formatHolder0.b = this.g == null ? format0 : format0.b(this.g.a(format0));
        formatHolder0.a = this.k;
        if(this.g == null) {
            return;
        }
        if(format1 != null && Util.g(drmInitData0, drmInitData1)) {
            return;
        }
        DrmSession drmSession0 = this.k;
        DrmSession drmSession1 = this.g.c(this.h, format0);
        this.k = drmSession1;
        formatHolder0.a = drmSession1;
        if(drmSession0 != null) {
            drmSession0.d(this.h);
        }
    }

    private int S(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, boolean z, boolean z1, SampleExtrasHolder sampleQueue$SampleExtrasHolder0) {
        synchronized(this) {
            decoderInputBuffer0.e = false;
            if(!this.K()) {
                if(!z1 && !this.z) {
                    Format format0 = this.E;
                    if(format0 != null && (z || format0 != this.j)) {
                        this.R(((Format)Assertions.g(format0)), formatHolder0);
                        return -5;
                    }
                    return -3;
                }
                decoderInputBuffer0.n(4);
                decoderInputBuffer0.f = 0x8000000000000000L;
                return -4;
            }
            Format format1 = ((SharedSampleMetadata)this.f.f(this.F())).a;
            if(!z && format1 == this.j) {
                int v1 = this.G(this.v);
                if(!this.P(v1)) {
                    decoderInputBuffer0.e = true;
                    return -3;
                }
                decoderInputBuffer0.n(this.p[v1]);
                if(this.v == this.s - 1 && (z1 || this.z)) {
                    decoderInputBuffer0.e(0x20000000);
                }
                decoderInputBuffer0.f = this.q[v1];
                sampleQueue$SampleExtrasHolder0.a = this.o[v1];
                sampleQueue$SampleExtrasHolder0.b = this.n[v1];
                sampleQueue$SampleExtrasHolder0.c = this.r[v1];
                return -4;
            }
            this.R(format1, formatHolder0);
            return -5;
        }
    }

    public final long T() {
        synchronized(this) {
            return this.K() ? this.m[this.G(this.v)] : this.F;
        }
    }

    @CallSuper
    public void U() {
        this.s();
        this.X();
    }

    @CallSuper
    public int V(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v, boolean z) {
        boolean z1 = false;
        int v1 = this.S(formatHolder0, decoderInputBuffer0, (v & 2) != 0, z, this.e);
        if(v1 == -4 && !decoderInputBuffer0.j()) {
            if((v & 1) != 0) {
                z1 = true;
            }
            if((v & 4) == 0) {
                if(z1) {
                    this.d.f(decoderInputBuffer0, this.e);
                }
                else {
                    this.d.m(decoderInputBuffer0, this.e);
                }
            }
            if(!z1) {
                ++this.v;
            }
        }
        return v1;
    }

    @CallSuper
    public void W() {
        this.Z(true);
        this.X();
    }

    private void X() {
        DrmSession drmSession0 = this.k;
        if(drmSession0 != null) {
            drmSession0.d(this.h);
            this.k = null;
            this.j = null;
        }
    }

    public final void Y() {
        this.Z(false);
    }

    @CallSuper
    public void Z(boolean z) {
        this.d.n();
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.A = true;
        this.w = 0x8000000000000000L;
        this.x = 0x8000000000000000L;
        this.y = 0x8000000000000000L;
        this.z = false;
        this.f.c();
        if(z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray0, int v, int v1) {
        this.d.q(parsableByteArray0, v);
    }

    private void a0() {
        synchronized(this) {
            this.v = 0;
            this.d.o();
        }
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void b(ParsableByteArray parsableByteArray0, int v) {
        g.b(this, parsableByteArray0, v);
    }

    public final boolean b0(int v) {
        synchronized(this) {
            this.a0();
            int v2 = this.t;
            if(v >= v2 && v <= this.s + v2) {
                this.w = 0x8000000000000000L;
                this.v = v - v2;
                return true;
            }
            return false;
        }
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public final int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
        return this.d.p(dataReader0, v, z);
    }

    public final boolean c0(long v, boolean z) {
        synchronized(this) {
            this.a0();
            int v2 = this.G(this.v);
            if(this.K() && v >= this.q[v2] && (v <= this.y || z)) {
                int v3 = this.G ? this.x(v2, this.s - this.v, v, z) : this.y(v2, this.s - this.v, v, true);
                if(v3 == -1) {
                    return false;
                }
                this.w = v;
                this.v += v3;
                return true;
            }
            return false;
        }
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public final void d(Format format0) {
        Format format1 = this.z(format0);
        this.C = false;
        this.D = format0;
        boolean z = this.f0(format1);
        UpstreamFormatChangedListener sampleQueue$UpstreamFormatChangedListener0 = this.i;
        if(sampleQueue$UpstreamFormatChangedListener0 != null && z) {
            sampleQueue$UpstreamFormatChangedListener0.p(format1);
        }
    }

    public final void d0(long v) {
        if(this.I != v) {
            this.I = v;
            this.L();
        }
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public int e(DataReader dataReader0, int v, boolean z) {
        return g.a(this, dataReader0, v, z);
    }

    public final void e0(long v) {
        this.w = v;
    }

    @Override  // androidx.media3.extractor.TrackOutput
    public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
        int v5;
        if(this.C) {
            this.d(((Format)Assertions.k(this.D)));
        }
        boolean z = (v1 & 1) != 0;
        if(this.A) {
            if(!z) {
                return;
            }
            this.A = false;
        }
        long v4 = this.I + v;
        if(this.G) {
            if(v4 < this.w) {
                return;
            }
            if((v1 & 1) == 0) {
                if(!this.H) {
                    Log.n("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                v5 = v1 | 1;
            }
            else {
                v5 = v1;
            }
        }
        else {
            v5 = v1;
        }
        if(this.J) {
            if(z && this.h(v4)) {
                this.J = false;
                this.i(v4, v5, this.d.e() - ((long)v2) - ((long)v3), v2, trackOutput$CryptoData0);
                return;
            }
            return;
        }
        this.i(v4, v5, this.d.e() - ((long)v2) - ((long)v3), v2, trackOutput$CryptoData0);
    }

    private boolean f0(Format format0) {
        synchronized(this) {
            this.B = false;
            if(Util.g(format0, this.E)) {
                return false;
            }
            this.E = this.f.h() || !((SharedSampleMetadata)this.f.g()).a.equals(format0) ? format0 : ((SharedSampleMetadata)this.f.g()).a;
            this.G &= MimeTypes.a(this.E.n, this.E.j);
            this.H = false;
            return true;
        }
    }

    public final void g0(@Nullable UpstreamFormatChangedListener sampleQueue$UpstreamFormatChangedListener0) {
        this.i = sampleQueue$UpstreamFormatChangedListener0;
    }

    private boolean h(long v) {
        boolean z = false;
        synchronized(this) {
            if(this.s == 0) {
                if(v > this.x) {
                    z = true;
                }
                return z;
            }
            if(this.D() >= v) {
                return false;
            }
            int v2 = this.j(v);
            this.v(this.t + v2);
            return true;
        }
    }

    public final void h0(int v) {
        synchronized(this) {
            Assertions.a(v >= 0 && this.v + v <= this.s);
            this.v += v;
        }
    }

    private void i(long v, int v1, long v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
        synchronized(this) {
            int v5 = this.s;
            if(v5 > 0) {
                int v6 = this.G(v5 - 1);
                Assertions.a(this.n[v6] + ((long)this.o[v6]) <= v2);
            }
            this.z = (0x20000000 & v1) != 0;
            this.y = Math.max(this.y, v);
            int v7 = this.G(this.s);
            this.q[v7] = v;
            this.n[v7] = v2;
            this.o[v7] = v3;
            this.p[v7] = v1;
            this.r[v7] = trackOutput$CryptoData0;
            this.m[v7] = this.F;
            if(this.f.h() || !((SharedSampleMetadata)this.f.g()).a.equals(this.E)) {
                Format format0 = (Format)Assertions.g(this.E);
                SharedSampleMetadata sampleQueue$SharedSampleMetadata0 = new SharedSampleMetadata(format0, (this.g == null ? DrmSessionReference.a : this.g.d(this.h, format0)), null);
                this.f.b(this.J(), sampleQueue$SharedSampleMetadata0);
            }
            int v8 = this.s + 1;
            this.s = v8;
            int v9 = this.l;
            if(v8 == v9) {
                long[] arr_v = new long[v9 + 1000];
                long[] arr_v1 = new long[v9 + 1000];
                long[] arr_v2 = new long[v9 + 1000];
                int[] arr_v3 = new int[v9 + 1000];
                int[] arr_v4 = new int[v9 + 1000];
                CryptoData[] arr_trackOutput$CryptoData = new CryptoData[v9 + 1000];
                int v10 = v9 - this.u;
                System.arraycopy(this.n, this.u, arr_v1, 0, v10);
                System.arraycopy(this.q, this.u, arr_v2, 0, v10);
                System.arraycopy(this.p, this.u, arr_v3, 0, v10);
                System.arraycopy(this.o, this.u, arr_v4, 0, v10);
                System.arraycopy(this.r, this.u, arr_trackOutput$CryptoData, 0, v10);
                System.arraycopy(this.m, this.u, arr_v, 0, v10);
                int v11 = this.u;
                System.arraycopy(this.n, 0, arr_v1, v10, v11);
                System.arraycopy(this.q, 0, arr_v2, v10, v11);
                System.arraycopy(this.p, 0, arr_v3, v10, v11);
                System.arraycopy(this.o, 0, arr_v4, v10, v11);
                System.arraycopy(this.r, 0, arr_trackOutput$CryptoData, v10, v11);
                System.arraycopy(this.m, 0, arr_v, v10, v11);
                this.n = arr_v1;
                this.q = arr_v2;
                this.p = arr_v3;
                this.o = arr_v4;
                this.r = arr_trackOutput$CryptoData;
                this.m = arr_v;
                this.u = 0;
                this.l = v9 + 1000;
            }
        }
    }

    public final void i0(long v) {
        this.F = v;
    }

    private int j(long v) {
        int v1 = this.s;
        int v2 = this.G(v1 - 1);
        while(v1 > this.v && this.q[v2] >= v) {
            --v1;
            if(v2 - 1 == -1) {
                v2 = this.l - 1;
            }
            else {
                --v2;
            }
        }
        return v1;
    }

    public final void j0() {
        this.J = true;
    }

    @Deprecated
    public static SampleQueue k(Allocator allocator0, Looper looper0, DrmSessionManager drmSessionManager0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        drmSessionManager0.b(looper0, PlayerId.d);
        return new SampleQueue(allocator0, ((DrmSessionManager)Assertions.g(drmSessionManager0)), ((EventDispatcher)Assertions.g(drmSessionEventListener$EventDispatcher0)));
    }

    public static SampleQueue l(Allocator allocator0, DrmSessionManager drmSessionManager0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        return new SampleQueue(allocator0, ((DrmSessionManager)Assertions.g(drmSessionManager0)), ((EventDispatcher)Assertions.g(drmSessionEventListener$EventDispatcher0)));
    }

    public static SampleQueue m(Allocator allocator0) {
        return new SampleQueue(allocator0, null, null);
    }

    private long n(long v, boolean z, boolean z1) {
        synchronized(this) {
            int v2 = this.s;
            if(v2 != 0) {
                int v3 = this.u;
                if(v >= this.q[v3]) {
                    if(z1) {
                        int v4 = this.v;
                        if(v4 != v2) {
                            v2 = v4 + 1;
                        }
                    }
                    int v5 = this.y(v3, v2, v, z);
                    return v5 == -1 ? -1L : this.q(v5);
                }
            }
            return -1L;
        }
    }

    private long o() {
        synchronized(this) {
            int v1 = this.s;
            return v1 == 0 ? -1L : this.q(v1);
        }
    }

    public long p() {
        synchronized(this) {
            int v1 = this.v;
            return v1 == 0 ? -1L : this.q(v1);
        }
    }

    @GuardedBy("this")
    private long q(int v) {
        this.x = Math.max(this.x, this.E(v));
        this.s -= v;
        int v1 = this.t + v;
        this.t = v1;
        int v2 = this.u + v;
        this.u = v2;
        int v3 = this.l;
        if(v2 >= v3) {
            this.u = v2 - v3;
        }
        int v4 = this.v - v;
        this.v = v4;
        if(v4 < 0) {
            this.v = 0;
        }
        this.f.e(v1);
        if(this.s == 0) {
            int v5 = this.u == 0 ? this.l : this.u;
            return this.n[v5 - 1] + ((long)this.o[v5 - 1]);
        }
        return this.n[this.u];
    }

    public final void r(long v, boolean z, boolean z1) {
        long v1 = this.n(v, z, z1);
        this.d.b(v1);
    }

    public final void s() {
        long v = this.o();
        this.d.b(v);
    }

    public final void t() {
        long v = this.p();
        this.d.b(v);
    }

    public final void u(long v) {
        if(this.s == 0) {
            return;
        }
        Assertions.a(v > this.D());
        int v1 = this.j(v);
        this.w(this.t + v1);
    }

    private long v(int v) {
        int v1 = this.J() - v;
        boolean z = false;
        Assertions.a(v1 >= 0 && v1 <= this.s - this.v);
        int v2 = this.s - v1;
        this.s = v2;
        this.y = Math.max(this.x, this.E(v2));
        if(v1 == 0 && this.z) {
            z = true;
        }
        this.z = z;
        this.f.d(v);
        int v3 = this.s;
        if(v3 != 0) {
            int v4 = this.G(v3 - 1);
            return this.n[v4] + ((long)this.o[v4]);
        }
        return 0L;
    }

    public final void w(int v) {
        long v1 = this.v(v);
        this.d.c(v1);
    }

    private int x(int v, int v1, long v2, boolean z) {
        for(int v3 = 0; v3 < v1; ++v3) {
            if(this.q[v] >= v2) {
                return v3;
            }
            ++v;
            v = v == this.l ? 0 : v + 1;
        }
        return z ? v1 : -1;
    }

    private int y(int v, int v1, long v2, boolean z) {
        int v3 = -1;
        for(int v4 = 0; v4 < v1; ++v4) {
            long v5 = this.q[v];
            if(v5 > v2) {
                break;
            }
            if(!z || (this.p[v] & 1) != 0) {
                if(v5 == v2) {
                    return v4;
                }
                v3 = v4;
            }
            ++v;
            v = v == this.l ? 0 : v + 1;
        }
        return v3;
    }

    @CallSuper
    protected Format z(Format format0) {
        return this.I == 0L || format0.s == 0x7FFFFFFFFFFFFFFFL ? format0 : format0.a().s0(format0.s + this.I).K();
    }

    class androidx.media3.exoplayer.source.SampleQueue.1 {
    }

}

