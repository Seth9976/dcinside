package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.Mp4Extractor;
import com.google.common.base.y;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import h4.e;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@UnstableApi
public final class MediaExtractorCompat {
    final class ExtractorOutputImpl implements ExtractorOutput {
        final MediaExtractorCompat a;

        private ExtractorOutputImpl() {
        }

        ExtractorOutputImpl(androidx.media3.exoplayer.MediaExtractorCompat.1 mediaExtractorCompat$10) {
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public TrackOutput b(int v, int v1) {
            TrackOutput trackOutput0 = (MediaExtractorSampleQueue)MediaExtractorCompat.this.f.get(v);
            if(trackOutput0 != null) {
                return trackOutput0;
            }
            if(MediaExtractorCompat.this.s) {
                return new DiscardingTrackOutput();
            }
            TrackOutput trackOutput1 = new MediaExtractorSampleQueue(MediaExtractorCompat.this, MediaExtractorCompat.this.d, v);
            MediaExtractorCompat.this.f.put(v, trackOutput1);
            return trackOutput1;
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public void m() {
            MediaExtractorCompat.this.s = true;
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public void r(SeekMap seekMap0) {
            MediaExtractorCompat.this.r = seekMap0;
        }
    }

    final class MediaExtractorSampleQueue extends SampleQueue {
        public final int M;
        private int N;
        private int O;
        final MediaExtractorCompat P;

        public MediaExtractorSampleQueue(Allocator allocator0, int v) {
            super(allocator0, null, null);
            this.M = v;
            this.N = -1;
            this.O = -1;
        }

        @Override  // androidx.media3.exoplayer.source.SampleQueue
        public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
            if(this.O != -1) {
                MediaExtractorCompat.this.g.addLast(this.O);
            }
            Assertions.i(this.N != -1);
            MediaExtractorCompat.this.g.addLast(this.N);
            super.f(v, v1 & 0xDFFFFFFF, v2, v3, trackOutput$CryptoData0);
        }

        public void k0(int v) {
            this.O = v;
        }

        public void l0(int v) {
            this.N = v;
        }

        @Override
        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", this.M, this.N, this.O);
        }

        @Override  // androidx.media3.exoplayer.source.SampleQueue
        public Format z(Format format0) {
            if(this.I() == null) {
                MediaExtractorCompat.this.t(this, format0);
            }
            return super.z(format0);
        }
    }

    static final class MediaExtractorTrack {
        public final MediaExtractorSampleQueue a;
        public final boolean b;
        @Nullable
        public final String c;

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorCompat$MediaExtractorSampleQueue0, boolean z, @Nullable String s) {
            this.a = mediaExtractorCompat$MediaExtractorSampleQueue0;
            this.b = z;
            this.c = s;
        }

        MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorCompat$MediaExtractorSampleQueue0, boolean z, String s, androidx.media3.exoplayer.MediaExtractorCompat.1 mediaExtractorCompat$10) {
            this(mediaExtractorCompat$MediaExtractorSampleQueue0, z, s);
        }

        public MediaFormat a(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0) {
            formatHolder0.a();
            this.a.V(formatHolder0, decoderInputBuffer0, 2, false);
            MediaFormat mediaFormat0 = MediaFormatUtil.b(((Format)Assertions.g(formatHolder0.b)));
            formatHolder0.a();
            if(this.c != null) {
                if(Util.a >= 29) {
                    mediaFormat0.removeKey("codecs-string");
                }
                mediaFormat0.setString("mime", this.c);
            }
            return mediaFormat0;
        }

        public void b() {
            this.a.h0(1);
            this.a.t();
        }

        public int c() {
            return this.a.M;
        }

        @Override
        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.a, Boolean.valueOf(this.b), this.c);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    private final ExtractorsFactory a;
    private final Factory b;
    private final PositionHolder c;
    private final Allocator d;
    private final ArrayList e;
    private final SparseArray f;
    private final ArrayDeque g;
    private final FormatHolder h;
    private final DecoderInputBuffer i;
    private final DecoderInputBuffer j;
    private final Set k;
    private boolean l;
    private long m;
    @Nullable
    private Extractor n;
    @Nullable
    private ExtractorInput o;
    @Nullable
    private DataSource p;
    @Nullable
    private SeekPoint q;
    @Nullable
    private SeekMap r;
    private boolean s;
    private int t;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    private static final String x = "MediaExtractorCompat";

    public MediaExtractorCompat(Context context0) {
        this(new DefaultExtractorsFactory(), new androidx.media3.datasource.DefaultDataSource.Factory(context0));
    }

    public MediaExtractorCompat(ExtractorsFactory extractorsFactory0, Factory dataSource$Factory0) {
        this.a = extractorsFactory0;
        this.b = dataSource$Factory0;
        this.c = new PositionHolder();
        this.d = new DefaultAllocator(true, 0x10000);
        this.e = new ArrayList();
        this.f = new SparseArray();
        this.g = new ArrayDeque();
        this.h = new FormatHolder();
        this.i = new DecoderInputBuffer(0);
        this.j = DecoderInputBuffer.u();
        this.k = new HashSet();
    }

    public void A(int v) {
        this.k.add(v);
    }

    public void B(Uri uri0, long v) throws IOException {
        int v3;
        Assertions.i(!this.l);
        this.l = true;
        this.m = v;
        DataSpec dataSpec0 = MediaExtractorCompat.k(uri0, v);
        DataSource dataSource0 = this.b.a();
        this.p = dataSource0;
        long v1 = dataSource0.a(dataSpec0);
        ExtractorInput extractorInput0 = new DefaultExtractorInput(this.p, 0L, v1);
        Extractor extractor0 = this.z(extractorInput0);
        Exception exception0 = null;
        extractor0.h(new ExtractorOutputImpl(this, null));
        int v2 = 1;
        while(v2 != 0) {
            try {
                v3 = extractor0.e(extractorInput0, this.c);
            }
            catch(Exception | OutOfMemoryError exception0) {
                v3 = -1;
            }
            int v4 = !this.s || this.t < this.f.size() || this.r == null ? 1 : 0;
            if(exception0 == null && (v4 == 0 || v3 != -1)) {
                if(v3 == 1) {
                    extractorInput0 = this.x(this.c.a);
                }
                v2 = v4;
                continue;
            }
            this.w();
            throw ParserException.a((exception0 == null ? "Reached end of input before preparation completed." : "Exception encountered while parsing input media."), exception0);
        }
        this.o = extractorInput0;
        this.n = extractor0;
    }

    private void C() {
        int v = (int)(((Integer)this.g.removeFirst()));
        MediaExtractorTrack mediaExtractorCompat$MediaExtractorTrack0 = (MediaExtractorTrack)this.e.get(v);
        if(!mediaExtractorCompat$MediaExtractorTrack0.b) {
            mediaExtractorCompat$MediaExtractorTrack0.b();
        }
    }

    public void D(int v) {
        this.k.remove(v);
    }

    public boolean i() {
        if(!this.j()) {
            return false;
        }
        this.C();
        return this.j();
    }

    @e(expression = {"trackIndicesPerSampleInQueuedOrder.peekFirst()"}, result = true)
    private boolean j() {
        boolean z;
        try {
            this.s();
            z = false;
        }
        catch(IOException iOException0) {
            Log.o("MediaExtractorCompat", "Treating exception as the end of input.", iOException0);
            return false;
        }
        while(true) {
            if(this.g.isEmpty()) {
                if(z) {
                    break;
                }
                try {
                    switch(((Extractor)Assertions.g(this.n)).e(((ExtractorInput)Assertions.g(this.o)), this.c)) {
                        case -1: {
                            break;
                        }
                        case 1: {
                            this.o = this.x(this.c.a);
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                catch(Exception | OutOfMemoryError exception0) {
                    Log.o("MediaExtractorCompat", "Treating exception as the end of input.", exception0);
                }
                z = true;
            }
            else {
                Object object0 = this.g.peekFirst();
                if(this.k.contains(object0)) {
                    return true;
                }
                this.C();
            }
        }
        return false;
    }

    private static DataSpec k(Uri uri0, long v) {
        return new Builder().j(uri0).i(v).c(6).a();
    }

    @VisibleForTesting(otherwise = 5)
    public Allocator l() {
        return this.d;
    }

    public int m() {
        if(!this.j()) {
            return -1;
        }
        this.u(this.j, true);
        return this.j.t() ? this.j.l() : this.j.l();
    }

    public long n() {
        if(!this.j()) {
            return -1L;
        }
        this.u(this.j, true);
        return this.j.f;
    }

    public int o() {
        return this.j() ? ((int)(((Integer)this.g.peekFirst()))) : -1;
    }

    public int p() {
        return this.e.size();
    }

    public MediaFormat q(int v) {
        return ((MediaExtractorTrack)this.e.get(v)).a(this.h, this.j);
    }

    // 检测为 Lambda 实现
    private static String r(Extractor extractor0) [...]

    private void s() throws IOException {
        SeekPoint seekPoint0 = this.q;
        if(seekPoint0 == null) {
            return;
        }
        SeekPoint seekPoint1 = (SeekPoint)Assertions.g(seekPoint0);
        ((Extractor)Assertions.g(this.n)).a(seekPoint1.b, seekPoint1.a);
        this.o = this.x(seekPoint1.b);
        this.q = null;
    }

    private void t(MediaExtractorSampleQueue mediaExtractorCompat$MediaExtractorSampleQueue0, Format format0) {
        ++this.t;
        mediaExtractorCompat$MediaExtractorSampleQueue0.l0(this.e.size());
        MediaExtractorTrack mediaExtractorCompat$MediaExtractorTrack0 = new MediaExtractorTrack(mediaExtractorCompat$MediaExtractorSampleQueue0, false, null, null);
        this.e.add(mediaExtractorCompat$MediaExtractorTrack0);
        String s = MediaCodecUtil.n(format0);
        if(s != null) {
            mediaExtractorCompat$MediaExtractorSampleQueue0.k0(this.e.size());
            MediaExtractorTrack mediaExtractorCompat$MediaExtractorTrack1 = new MediaExtractorTrack(mediaExtractorCompat$MediaExtractorSampleQueue0, true, s, null);
            this.e.add(mediaExtractorCompat$MediaExtractorTrack1);
        }
    }

    private void u(DecoderInputBuffer decoderInputBuffer0, boolean z) {
        int v = (int)(((Integer)Assertions.g(((Integer)this.g.peekFirst()))));
        MediaExtractorTrack mediaExtractorCompat$MediaExtractorTrack0 = (MediaExtractorTrack)this.e.get(v);
        MediaExtractorSampleQueue mediaExtractorCompat$MediaExtractorSampleQueue0 = mediaExtractorCompat$MediaExtractorTrack0.a;
        int v1 = mediaExtractorCompat$MediaExtractorSampleQueue0.V(this.h, decoderInputBuffer0, (z ? 4 : 0) | 1, false);
        if(v1 == -5) {
            v1 = mediaExtractorCompat$MediaExtractorSampleQueue0.V(this.h, decoderInputBuffer0, (z ? 4 : 0) | 1, false);
        }
        this.h.a();
        if(v1 != -4) {
            throw new IllegalStateException(Util.S("Sample read result: %s\nTrack sample: %s\nTrackIndicesPerSampleInQueuedOrder: %s\nTracks added: %s\n", new Object[]{v1, mediaExtractorCompat$MediaExtractorTrack0, this.g, this.e}));
        }
    }

    public int v(ByteBuffer byteBuffer0, int v) {
        if(!this.j()) {
            return -1;
        }
        byteBuffer0.position(v);
        byteBuffer0.limit(byteBuffer0.capacity());
        this.i.d = byteBuffer0;
        this.u(this.i, false);
        byteBuffer0.flip();
        byteBuffer0.position(v);
        this.i.d = null;
        return byteBuffer0.remaining();
    }

    public void w() {
        for(int v = 0; v < this.f.size(); ++v) {
            ((MediaExtractorSampleQueue)this.f.valueAt(v)).W();
        }
        this.f.clear();
        Extractor extractor0 = this.n;
        if(extractor0 != null) {
            extractor0.release();
            this.n = null;
        }
        this.o = null;
        this.q = null;
        DataSourceUtil.a(this.p);
        this.p = null;
    }

    private ExtractorInput x(long v) throws IOException {
        Object object0 = Assertions.g(this.p);
        Uri uri0 = (Uri)Assertions.g(((DataSource)object0).c());
        DataSourceUtil.a(((DataSource)object0));
        long v1 = ((DataSource)object0).a(MediaExtractorCompat.k(uri0, this.m + v));
        if(v1 != -1L) {
            v1 += v;
        }
        return new DefaultExtractorInput(((DataSource)object0), v, v1);
    }

    public void y(long v, int v1) {
        SeekPoint seekPoint0;
        SeekPoints seekMap$SeekPoints0;
        if(this.r == null) {
            return;
        }
        if(this.k.size() == 1) {
            Extractor extractor0 = this.n;
            if(extractor0 instanceof Mp4Extractor) {
                Object object0 = this.k.iterator().next();
                seekMap$SeekPoints0 = ((Mp4Extractor)extractor0).p(v, ((MediaExtractorTrack)this.e.get(((int)(((Integer)object0))))).c());
            }
            else {
                seekMap$SeekPoints0 = this.r.d1(v);
            }
        }
        else {
            seekMap$SeekPoints0 = this.r.d1(v);
        }
        switch(v1) {
            case 0: {
                seekPoint0 = seekMap$SeekPoints0.a;
                break;
            }
            case 1: {
                seekPoint0 = seekMap$SeekPoints0.b;
                break;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalArgumentException();
                }
                if(Math.abs(v - seekMap$SeekPoints0.b.a) < Math.abs(v - seekMap$SeekPoints0.a.a)) {
                    seekPoint0 = seekMap$SeekPoints0.b;
                }
                else {
                    seekPoint0 = seekMap$SeekPoints0.a;
                    break;
                }
            }
        }
        this.g.clear();
        for(int v2 = 0; v2 < this.f.size(); ++v2) {
            ((MediaExtractorSampleQueue)this.f.valueAt(v2)).Y();
        }
        this.q = seekPoint0;
    }

    private Extractor z(ExtractorInput extractorInput0) throws IOException {
        Extractor extractor0;
        Extractor[] arr_extractor = this.a.d();
        for(int v = 0; true; ++v) {
            extractor0 = null;
            if(v >= arr_extractor.length) {
                break;
            }
            extractor0 = arr_extractor[v];
            try {
                if(extractor0.g(extractorInput0)) {
                    break;
                }
            }
            catch(EOFException unused_ex) {
            }
            finally {
                extractorInput0.o();
            }
        }
        if(extractor0 == null) {
            throw new UnrecognizedInputFormatException("None of the available extractors (" + y.p(", ").k(z3.D(O2.x(arr_extractor), (Extractor extractor0) -> extractor0.c().getClass().getSimpleName())) + ") could read the stream.", ((Uri)Assertions.g(((DataSource)Assertions.g(this.p)).c())), O2.A());
        }
        return extractor0;
    }

    class androidx.media3.exoplayer.MediaExtractorCompat.1 {
    }

}

