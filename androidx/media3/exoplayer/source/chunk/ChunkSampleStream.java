package androidx.media3.exoplayer.source.chunk;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader.Callback;
import androidx.media3.exoplayer.upstream.Loader.LoadErrorAction;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import androidx.media3.exoplayer.upstream.Loader.ReleaseCallback;
import androidx.media3.exoplayer.upstream.Loader;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@UnstableApi
public class ChunkSampleStream implements SampleStream, SequenceableLoader, Callback, ReleaseCallback {
    public final class EmbeddedSampleStream implements SampleStream {
        public final ChunkSampleStream a;
        private final SampleQueue b;
        private final int c;
        private boolean d;
        final ChunkSampleStream e;

        public EmbeddedSampleStream(ChunkSampleStream chunkSampleStream1, SampleQueue sampleQueue0, int v) {
            this.a = chunkSampleStream1;
            this.b = sampleQueue0;
            this.c = v;
        }

        private void a() {
            if(!this.d) {
                ChunkSampleStream.this.g.h(ChunkSampleStream.this.b[this.c], ChunkSampleStream.this.c[this.c], 0, null, ChunkSampleStream.this.t);
                this.d = true;
            }
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() {
        }

        public void c() {
            boolean[] arr_z = ChunkSampleStream.this.d;
            Assertions.i(arr_z[this.c]);
            boolean[] arr_z1 = ChunkSampleStream.this.d;
            arr_z1[this.c] = false;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ChunkSampleStream.this.I() && this.b.N(ChunkSampleStream.this.w);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            if(ChunkSampleStream.this.I()) {
                return -3;
            }
            if(ChunkSampleStream.this.v != null && ChunkSampleStream.this.v.h(this.c + 1) <= this.b.F()) {
                return -3;
            }
            this.a();
            return this.b.V(formatHolder0, decoderInputBuffer0, v, ChunkSampleStream.this.w);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            if(ChunkSampleStream.this.I()) {
                return 0;
            }
            int v1 = this.b.H(v, ChunkSampleStream.this.w);
            if(ChunkSampleStream.this.v != null) {
                v1 = Math.min(v1, ChunkSampleStream.this.v.h(this.c + 1) - this.b.F());
            }
            this.b.h0(v1);
            if(v1 > 0) {
                this.a();
            }
            return v1;
        }
    }

    public interface androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback {
        void b(ChunkSampleStream arg1);
    }

    public final int a;
    private final int[] b;
    private final Format[] c;
    private final boolean[] d;
    private final ChunkSource e;
    private final androidx.media3.exoplayer.source.SequenceableLoader.Callback f;
    private final EventDispatcher g;
    private final LoadErrorHandlingPolicy h;
    private final Loader i;
    private final ChunkHolder j;
    private final ArrayList k;
    private final List l;
    private final SampleQueue m;
    private final SampleQueue[] n;
    private final BaseMediaChunkOutput o;
    @Nullable
    private Chunk p;
    private Format q;
    @Nullable
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback r;
    private long s;
    private long t;
    private int u;
    @Nullable
    private BaseMediaChunk v;
    boolean w;
    private static final String x = "ChunkSampleStream";

    public ChunkSampleStream(int v, @Nullable int[] arr_v, @Nullable Format[] arr_format, ChunkSource chunkSource0, androidx.media3.exoplayer.source.SequenceableLoader.Callback sequenceableLoader$Callback0, Allocator allocator0, long v1, DrmSessionManager drmSessionManager0, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmSessionEventListener$EventDispatcher0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, EventDispatcher mediaSourceEventListener$EventDispatcher0) {
        this.a = v;
        if(arr_v == null) {
            arr_v = new int[0];
        }
        this.b = arr_v;
        if(arr_format == null) {
            arr_format = new Format[0];
        }
        this.c = arr_format;
        this.e = chunkSource0;
        this.f = sequenceableLoader$Callback0;
        this.g = mediaSourceEventListener$EventDispatcher0;
        this.h = loadErrorHandlingPolicy0;
        this.i = new Loader("ChunkSampleStream");
        this.j = new ChunkHolder();
        ArrayList arrayList0 = new ArrayList();
        this.k = arrayList0;
        this.l = DesugarCollections.unmodifiableList(arrayList0);
        this.n = new SampleQueue[arr_v.length];
        this.d = new boolean[arr_v.length];
        int[] arr_v1 = new int[arr_v.length + 1];
        SampleQueue[] arr_sampleQueue = new SampleQueue[arr_v.length + 1];
        SampleQueue sampleQueue0 = SampleQueue.l(allocator0, drmSessionManager0, drmSessionEventListener$EventDispatcher0);
        this.m = sampleQueue0;
        arr_v1[0] = v;
        arr_sampleQueue[0] = sampleQueue0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            SampleQueue sampleQueue1 = SampleQueue.m(allocator0);
            this.n[v2] = sampleQueue1;
            arr_sampleQueue[v2 + 1] = sampleQueue1;
            arr_v1[v2 + 1] = this.b[v2];
        }
        this.o = new BaseMediaChunkOutput(arr_v1, arr_sampleQueue);
        this.s = v1;
        this.t = v1;
    }

    private void B(int v) {
        int v1 = Math.min(this.O(v, 0), this.u);
        if(v1 > 0) {
            Util.V1(this.k, 0, v1);
            this.u -= v1;
        }
    }

    private void C(int v) {
        Assertions.i(!this.i.k());
        int v1 = this.k.size();
        while(true) {
            if(v >= v1) {
                v = -1;
                break;
            }
            if(!this.G(v)) {
                break;
            }
            ++v;
        }
        if(v == -1) {
            return;
        }
        long v2 = this.F().h;
        BaseMediaChunk baseMediaChunk0 = this.D(v);
        if(this.k.isEmpty()) {
            this.s = this.t;
        }
        this.w = false;
        this.g.C(this.a, baseMediaChunk0.g, v2);
    }

    private BaseMediaChunk D(int v) {
        BaseMediaChunk baseMediaChunk0 = (BaseMediaChunk)this.k.get(v);
        Util.V1(this.k, v, this.k.size());
        this.u = Math.max(this.u, this.k.size());
        int v1 = 0;
        int v2 = baseMediaChunk0.h(0);
        this.m.w(v2);
        while(true) {
            SampleQueue[] arr_sampleQueue = this.n;
            if(v1 >= arr_sampleQueue.length) {
                break;
            }
            SampleQueue sampleQueue0 = arr_sampleQueue[v1];
            ++v1;
            sampleQueue0.w(baseMediaChunk0.h(v1));
        }
        return baseMediaChunk0;
    }

    public ChunkSource E() {
        return this.e;
    }

    private BaseMediaChunk F() {
        return (BaseMediaChunk)this.k.get(this.k.size() - 1);
    }

    private boolean G(int v) {
        BaseMediaChunk baseMediaChunk0 = (BaseMediaChunk)this.k.get(v);
        int v1 = baseMediaChunk0.h(0);
        if(this.m.F() > v1) {
            return true;
        }
        int v2 = 0;
        while(true) {
            SampleQueue[] arr_sampleQueue = this.n;
            if(v2 >= arr_sampleQueue.length) {
                break;
            }
            int v3 = arr_sampleQueue[v2].F();
            ++v2;
            if(v3 > baseMediaChunk0.h(v2)) {
                return true;
            }
        }
        return false;
    }

    private boolean H(Chunk chunk0) {
        return chunk0 instanceof BaseMediaChunk;
    }

    boolean I() {
        return this.s != 0x8000000000000001L;
    }

    private void J() {
        int v = this.O(this.m.F(), this.u - 1);
        int v1;
        while((v1 = this.u) <= v) {
            this.u = v1 + 1;
            this.K(v1);
        }
    }

    private void K(int v) {
        BaseMediaChunk baseMediaChunk0 = (BaseMediaChunk)this.k.get(v);
        Format format0 = baseMediaChunk0.d;
        if(!format0.equals(this.q)) {
            this.g.h(this.a, format0, baseMediaChunk0.e, baseMediaChunk0.f, baseMediaChunk0.g);
        }
        this.q = format0;
    }

    public void L(Chunk chunk0, long v, long v1, boolean z) {
        this.p = null;
        this.v = null;
        Uri uri0 = chunk0.e();
        Map map0 = chunk0.d();
        long v2 = chunk0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(chunk0.a, chunk0.b, uri0, map0, v, v1, v2);
        this.h.a(chunk0.a);
        this.g.q(loadEventInfo0, chunk0.c, this.a, chunk0.d, chunk0.e, chunk0.f, chunk0.g, chunk0.h);
        if(!z) {
            if(this.I()) {
                this.R();
            }
            else if(this.H(chunk0)) {
                this.D(this.k.size() - 1);
                if(this.k.isEmpty()) {
                    this.s = this.t;
                }
            }
            this.f.l(this);
        }
    }

    public void M(Chunk chunk0, long v, long v1) {
        this.p = null;
        this.e.d(chunk0);
        Uri uri0 = chunk0.e();
        Map map0 = chunk0.d();
        long v2 = chunk0.a();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(chunk0.a, chunk0.b, uri0, map0, v, v1, v2);
        this.h.a(chunk0.a);
        this.g.t(loadEventInfo0, chunk0.c, this.a, chunk0.d, chunk0.e, chunk0.f, chunk0.g, chunk0.h);
        this.f.l(this);
    }

    public LoadErrorAction N(Chunk chunk0, long v, long v1, IOException iOException0, int v2) {
        LoadErrorAction loader$LoadErrorAction0;
        long v3 = chunk0.a();
        boolean z = this.H(chunk0);
        int v4 = this.k.size();
        boolean z1 = v3 == 0L || !z || !this.G(v4 - 1);
        Uri uri0 = chunk0.e();
        Map map0 = chunk0.d();
        LoadEventInfo loadEventInfo0 = new LoadEventInfo(chunk0.a, chunk0.b, uri0, map0, v, v1, v3);
        long v5 = Util.B2(chunk0.g);
        long v6 = Util.B2(chunk0.h);
        LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0 = new LoadErrorInfo(loadEventInfo0, new MediaLoadData(chunk0.c, this.a, chunk0.d, chunk0.e, chunk0.f, v5, v6), iOException0, v2);
        if(!this.e.a(chunk0, z1, loadErrorHandlingPolicy$LoadErrorInfo0, this.h)) {
            loader$LoadErrorAction0 = null;
        }
        else if(z1) {
            loader$LoadErrorAction0 = Loader.k;
            if(z) {
                Assertions.i(this.D(v4 - 1) == chunk0);
                if(this.k.isEmpty()) {
                    this.s = this.t;
                }
            }
        }
        else {
            Log.n("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            loader$LoadErrorAction0 = null;
        }
        if(loader$LoadErrorAction0 == null) {
            long v7 = this.h.c(loadErrorHandlingPolicy$LoadErrorInfo0);
            loader$LoadErrorAction0 = v7 == 0x8000000000000001L ? Loader.l : Loader.i(false, v7);
        }
        boolean z2 = loader$LoadErrorAction0.c();
        this.g.v(loadEventInfo0, chunk0.c, this.a, chunk0.d, chunk0.e, chunk0.f, chunk0.g, chunk0.h, iOException0, !z2);
        if(!z2) {
            this.p = null;
            this.h.a(chunk0.a);
            this.f.l(this);
        }
        return loader$LoadErrorAction0;
    }

    private int O(int v, int v1) {
        while(true) {
            ++v1;
            if(v1 >= this.k.size()) {
                break;
            }
            if(((BaseMediaChunk)this.k.get(v1)).h(0) > v) {
                return v1 - 1;
            }
        }
        return this.k.size() - 1;
    }

    public void P() {
        this.Q(null);
    }

    public void Q(@Nullable androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback chunkSampleStream$ReleaseCallback0) {
        this.r = chunkSampleStream$ReleaseCallback0;
        this.m.U();
        SampleQueue[] arr_sampleQueue = this.n;
        for(int v = 0; v < arr_sampleQueue.length; ++v) {
            arr_sampleQueue[v].U();
        }
        this.i.m(this);
    }

    private void R() {
        this.m.Y();
        SampleQueue[] arr_sampleQueue = this.n;
        for(int v = 0; v < arr_sampleQueue.length; ++v) {
            arr_sampleQueue[v].Y();
        }
    }

    public void S(long v) {
        boolean z;
        BaseMediaChunk baseMediaChunk0;
        this.t = v;
        if(this.I()) {
            this.s = v;
            return;
        }
        int v1 = 0;
        int v2 = 0;
        while(true) {
            if(v2 < this.k.size()) {
                baseMediaChunk0 = (BaseMediaChunk)this.k.get(v2);
                int v3 = Long.compare(baseMediaChunk0.g, v);
                if(v3 == 0 && baseMediaChunk0.k == 0x8000000000000001L) {
                    break;
                }
                if(v3 <= 0) {
                    ++v2;
                    continue;
                }
            }
            baseMediaChunk0 = null;
            break;
        }
        if(baseMediaChunk0 == null) {
            boolean z1 = v < this.g();
            z = this.m.c0(v, z1);
        }
        else {
            int v4 = baseMediaChunk0.h(0);
            z = this.m.b0(v4);
        }
        if(z) {
            this.u = this.O(this.m.F(), 0);
            SampleQueue[] arr_sampleQueue = this.n;
            while(v1 < arr_sampleQueue.length) {
                arr_sampleQueue[v1].c0(v, true);
                ++v1;
            }
            return;
        }
        this.s = v;
        this.w = false;
        this.k.clear();
        this.u = 0;
        if(this.i.k()) {
            this.m.s();
            SampleQueue[] arr_sampleQueue1 = this.n;
            while(v1 < arr_sampleQueue1.length) {
                arr_sampleQueue1[v1].s();
                ++v1;
            }
            this.i.g();
            return;
        }
        this.i.h();
        this.R();
    }

    public EmbeddedSampleStream T(long v, int v1) {
        for(int v2 = 0; v2 < this.n.length; ++v2) {
            if(this.b[v2] == v1) {
                Assertions.i(!this.d[v2]);
                this.d[v2] = true;
                this.n[v2].c0(v, true);
                return new EmbeddedSampleStream(this, this, this.n[v2], v2);
            }
        }
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean a() {
        return this.i.k();
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public void b() throws IOException {
        this.i.b();
        this.m.Q();
        if(!this.i.k()) {
            this.e.b();
        }
    }

    public long c(long v, SeekParameters seekParameters0) {
        return this.e.c(v, seekParameters0);
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public long d() {
        if(this.w) {
            return 0x8000000000000000L;
        }
        if(this.I()) {
            return this.s;
        }
        long v = this.t;
        BaseMediaChunk baseMediaChunk0 = this.F();
        if(!baseMediaChunk0.g()) {
            baseMediaChunk0 = this.k.size() <= 1 ? null : ((BaseMediaChunk)this.k.get(this.k.size() - 2));
        }
        if(baseMediaChunk0 != null) {
            v = Math.max(v, baseMediaChunk0.h);
        }
        return Math.max(v, this.m.C());
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public void e(long v) {
        if(!this.i.j() && !this.I()) {
            if(this.i.k()) {
                Chunk chunk0 = (Chunk)Assertions.g(this.p);
                if(this.H(chunk0) && this.G(this.k.size() - 1)) {
                    return;
                }
                if(this.e.i(v, chunk0, this.l)) {
                    this.i.g();
                    if(this.H(chunk0)) {
                        this.v = (BaseMediaChunk)chunk0;
                    }
                }
                return;
            }
            int v1 = this.e.g(v, this.l);
            if(v1 < this.k.size()) {
                this.C(v1);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean f(LoadingInfo loadingInfo0) {
        long v1;
        List list0;
        if(!this.w && !this.i.k() && !this.i.j()) {
            boolean z = this.I();
            if(z) {
                list0 = Collections.emptyList();
                v1 = this.s;
            }
            else {
                list0 = this.l;
                v1 = this.F().h;
            }
            this.e.e(loadingInfo0, v1, list0, this.j);
            boolean z1 = this.j.b;
            Chunk chunk0 = this.j.a;
            this.j.a();
            if(z1) {
                this.s = 0x8000000000000001L;
                this.w = true;
                return true;
            }
            if(chunk0 == null) {
                return false;
            }
            this.p = chunk0;
            if(this.H(chunk0)) {
                if(z) {
                    long v2 = this.s;
                    if(((BaseMediaChunk)chunk0).g != v2) {
                        this.m.e0(v2);
                        SampleQueue[] arr_sampleQueue = this.n;
                        for(int v = 0; v < arr_sampleQueue.length; ++v) {
                            arr_sampleQueue[v].e0(this.s);
                        }
                    }
                    this.s = 0x8000000000000001L;
                }
                ((BaseMediaChunk)chunk0).j(this.o);
                this.k.add(((BaseMediaChunk)chunk0));
            }
            else if(chunk0 instanceof InitializationChunk) {
                ((InitializationChunk)chunk0).f(this.o);
            }
            int v3 = this.h.d(chunk0.c);
            long v4 = this.i.n(chunk0, this, v3);
            LoadEventInfo loadEventInfo0 = new LoadEventInfo(chunk0.a, chunk0.b, v4);
            this.g.z(loadEventInfo0, chunk0.c, this.a, chunk0.d, chunk0.e, chunk0.f, chunk0.g, chunk0.h);
            return true;
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader
    public long g() {
        if(this.I()) {
            return this.s;
        }
        return this.w ? 0x8000000000000000L : this.F().h;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
        return this.N(((Chunk)loader$Loadable0), v, v1, iOException0, v2);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return !this.I() && this.m.N(this.w);
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$ReleaseCallback
    public void l() {
        this.m.W();
        SampleQueue[] arr_sampleQueue = this.n;
        for(int v = 0; v < arr_sampleQueue.length; ++v) {
            arr_sampleQueue[v].W();
        }
        this.e.release();
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback chunkSampleStream$ReleaseCallback0 = this.r;
        if(chunkSampleStream$ReleaseCallback0 != null) {
            chunkSampleStream$ReleaseCallback0.b(this);
        }
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
        if(this.I()) {
            return -3;
        }
        if(this.v != null && this.v.h(0) <= this.m.F()) {
            return -3;
        }
        this.J();
        return this.m.V(formatHolder0, decoderInputBuffer0, v, this.w);
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
        this.L(((Chunk)loader$Loadable0), v, v1, z);
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int p(long v) {
        if(this.I()) {
            return 0;
        }
        int v1 = this.m.H(v, this.w);
        BaseMediaChunk baseMediaChunk0 = this.v;
        if(baseMediaChunk0 != null) {
            v1 = Math.min(v1, baseMediaChunk0.h(0) - this.m.F());
        }
        this.m.h0(v1);
        this.J();
        return v1;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
    public void u(Loadable loader$Loadable0, long v, long v1) {
        this.M(((Chunk)loader$Loadable0), v, v1);
    }

    public void v(long v, boolean z) {
        if(this.I()) {
            return;
        }
        this.m.r(v, z, true);
        int v1 = this.m.A();
        if(v1 > this.m.A()) {
            long v2 = this.m.B();
            for(int v3 = 0; true; ++v3) {
                SampleQueue[] arr_sampleQueue = this.n;
                if(v3 >= arr_sampleQueue.length) {
                    break;
                }
                arr_sampleQueue[v3].r(v2, z, this.d[v3]);
            }
        }
        this.B(v1);
    }
}

