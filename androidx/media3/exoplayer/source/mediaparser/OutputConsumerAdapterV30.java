package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.DrmInitData.SchemeInitData;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaFormat;
import android.media.MediaParser.InputReader;
import android.media.MediaParser.OutputConsumer;
import android.media.MediaParser.SeekMap;
import android.media.MediaParser.SeekPoint;
import android.media.MediaParser.TrackData;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.O2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"Override"})
@RequiresApi(30)
@UnstableApi
public final class OutputConsumerAdapterV30 implements MediaParser.OutputConsumer {
    static final class DataReaderAdapter implements DataReader {
        @Nullable
        public MediaParser.InputReader b;

        private DataReaderAdapter() {
        }

        DataReaderAdapter(androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.1 outputConsumerAdapterV30$10) {
        }

        @Override  // androidx.media3.common.DataReader
        public int read(byte[] arr_b, int v, int v1) throws IOException {
            return this.b.read(arr_b, v, v1);
        }
    }

    static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap d;

        public SeekMapAdapter(MediaParser.SeekMap mediaParser$SeekMap0) {
            this.d = mediaParser$SeekMap0;
        }

        private static SeekPoint a(MediaParser.SeekPoint mediaParser$SeekPoint0) {
            return new SeekPoint(mediaParser$SeekPoint0.timeMicros, mediaParser$SeekPoint0.position);
        }

        @Override  // androidx.media3.extractor.SeekMap
        public long c1() {
            long v = this.d.getDurationMicros();
            return v == 0xFFFFFFFF80000000L ? 0x8000000000000001L : v;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public SeekPoints d1(long v) {
            Pair pair0 = this.d.getSeekPoints(v);
            Object object0 = pair0.first;
            return object0 == pair0.second ? new SeekPoints(SeekMapAdapter.a(((MediaParser.SeekPoint)object0))) : new SeekPoints(SeekMapAdapter.a(((MediaParser.SeekPoint)object0)), SeekMapAdapter.a(((MediaParser.SeekPoint)pair0.second)));
        }

        @Override  // androidx.media3.extractor.SeekMap
        public boolean e1() {
            return this.d.isSeekable();
        }
    }

    private static final String A = "chunk-index-long-us-times";
    private static final Pattern B = null;
    private final ArrayList a;
    private final ArrayList b;
    private final ArrayList c;
    private final ArrayList d;
    private final DataReaderAdapter e;
    private final boolean f;
    private final int g;
    @Nullable
    private final Format h;
    private ExtractorOutput i;
    @Nullable
    private MediaParser.SeekMap j;
    @Nullable
    private MediaParser.SeekMap k;
    @Nullable
    private String l;
    @Nullable
    private ChunkIndex m;
    @Nullable
    private TimestampAdjuster n;
    private List o;
    private int p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private static final String u = "OConsumerAdapterV30";
    private static final Pair v = null;
    private static final String w = "track-type-string";
    private static final String x = "chunk-index-int-sizes";
    private static final String y = "chunk-index-long-offsets";
    private static final String z = "chunk-index-long-us-durations";

    static {
        OutputConsumerAdapterV30.v = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
        OutputConsumerAdapterV30.B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    public OutputConsumerAdapterV30(@Nullable Format format0, int v, boolean z) {
        this.f = z;
        this.h = format0;
        this.g = v;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new DataReaderAdapter(null);
        this.i = new NoOpExtractorOutput();
        this.q = 0x8000000000000001L;
        this.o = O2.A();
    }

    public void a() {
        this.t = true;
    }

    private void b(int v) {
        for(int v1 = this.a.size(); v1 <= v; ++v1) {
            this.a.add(null);
            this.b.add(null);
            this.c.add(null);
            this.d.add(null);
        }
    }

    @Nullable
    public ChunkIndex c() {
        return this.m;
    }

    @Nullable
    public MediaParser.SeekMap d() {
        return this.j;
    }

    private static int e(MediaFormat mediaFormat0, String s, int v) {
        return mediaFormat0.getInteger(s, 0) == 0 ? 0 : v;
    }

    private static List f(MediaFormat mediaFormat0) {
        List list0 = new ArrayList();
        ByteBuffer byteBuffer0;
        for(int v = 0; (byteBuffer0 = mediaFormat0.getByteBuffer("csd-" + v)) != null; ++v) {
            ((ArrayList)list0).add(MediaFormatUtil.c(byteBuffer0));
        }
        return list0;
    }

    private static String g(String s) {
        s.hashCode();
        switch(s) {
            case "android.media.mediaparser.Ac3Parser": {
                return "audio/ac3";
            }
            case "android.media.mediaparser.Ac4Parser": {
                return "audio/ac4";
            }
            case "android.media.mediaparser.AdtsParser": {
                return "audio/mp4a-latm";
            }
            case "android.media.mediaparser.AmrParser": {
                return "audio/amr";
            }
            case "android.media.mediaparser.FlacParser": {
                return "audio/flac";
            }
            case "android.media.mediaparser.FlvParser": {
                return "video/x-flv";
            }
            case "android.media.mediaparser.FragmentedMp4Parser": {
                return "video/mp4";
            }
            case "android.media.mediaparser.MatroskaParser": {
                return "video/webm";
            }
            case "android.media.mediaparser.Mp3Parser": {
                return "audio/mpeg";
            }
            case "android.media.mediaparser.Mp4Parser": {
                return "video/mp4";
            }
            case "android.media.mediaparser.OggParser": {
                return "audio/ogg";
            }
            case "android.media.mediaparser.PsParser": {
                return "video/mp2p";
            }
            case "android.media.mediaparser.TsParser": {
                return "video/mp2t";
            }
            case "android.media.mediaparser.WavParser": {
                return "audio/raw";
            }
            default: {
                throw new IllegalArgumentException("Illegal parser name: " + s);
            }
        }
    }

    @Nullable
    public Format[] h() {
        if(!this.r) {
            return null;
        }
        Format[] arr_format = new Format[this.b.size()];
        for(int v = 0; v < this.b.size(); ++v) {
            arr_format[v] = (Format)Assertions.g(((Format)this.b.get(v)));
        }
        return arr_format;
    }

    public Pair i(long v) {
        return this.k == null ? OutputConsumerAdapterV30.v : this.k.getSeekPoints(v);
    }

    private static int j(MediaFormat mediaFormat0) {
        int v = OutputConsumerAdapterV30.e(mediaFormat0, "is-autoselect", 4);
        int v1 = OutputConsumerAdapterV30.e(mediaFormat0, "is-default", 1);
        return OutputConsumerAdapterV30.e(mediaFormat0, "is-forced-subtitle", 2) | (v | v1);
    }

    private void k() {
        if(this.r && !this.s) {
            int v = this.a.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(this.a.get(v1) == null) {
                    return;
                }
            }
            this.i.m();
            this.s = true;
        }
    }

    private boolean l(MediaFormat mediaFormat0) {
        ByteBuffer byteBuffer0 = mediaFormat0.getByteBuffer("chunk-index-int-sizes");
        if(byteBuffer0 == null) {
            return false;
        }
        IntBuffer intBuffer0 = byteBuffer0.asIntBuffer();
        LongBuffer longBuffer0 = ((ByteBuffer)Assertions.g(mediaFormat0.getByteBuffer("chunk-index-long-offsets"))).asLongBuffer();
        LongBuffer longBuffer1 = ((ByteBuffer)Assertions.g(mediaFormat0.getByteBuffer("chunk-index-long-us-durations"))).asLongBuffer();
        LongBuffer longBuffer2 = ((ByteBuffer)Assertions.g(mediaFormat0.getByteBuffer("chunk-index-long-us-times"))).asLongBuffer();
        int[] arr_v = new int[intBuffer0.remaining()];
        long[] arr_v1 = new long[longBuffer0.remaining()];
        long[] arr_v2 = new long[longBuffer1.remaining()];
        long[] arr_v3 = new long[longBuffer2.remaining()];
        intBuffer0.get(arr_v);
        longBuffer0.get(arr_v1);
        longBuffer1.get(arr_v2);
        longBuffer2.get(arr_v3);
        ChunkIndex chunkIndex0 = new ChunkIndex(arr_v, arr_v1, arr_v2, arr_v3);
        this.m = chunkIndex0;
        this.i.r(chunkIndex0);
        return true;
    }

    public void m(ExtractorOutput extractorOutput0) {
        this.i = extractorOutput0;
    }

    public void n(List list0) {
        this.o = list0;
    }

    public void o(long v) {
        this.q = v;
    }

    @Override  // android.media.MediaParser$OutputConsumer
    public void onSampleCompleted(int v, long v1, int v2, int v3, int v4, @Nullable MediaCodec.CryptoInfo mediaCodec$CryptoInfo0) {
        if(this.q != 0x8000000000000001L && v1 >= this.q) {
            return;
        }
        TimestampAdjuster timestampAdjuster0 = this.n;
        if(timestampAdjuster0 != null) {
            v1 = timestampAdjuster0.a(v1);
        }
        ((TrackOutput)Assertions.g(((TrackOutput)this.a.get(v)))).f(v1, v2, v3, v4, this.r(v, mediaCodec$CryptoInfo0));
    }

    @Override  // android.media.MediaParser$OutputConsumer
    public void onSampleDataFound(int v, MediaParser.InputReader mediaParser$InputReader0) throws IOException {
        this.b(v);
        this.e.b = mediaParser$InputReader0;
        TrackOutput trackOutput0 = (TrackOutput)this.a.get(v);
        if(trackOutput0 == null) {
            trackOutput0 = this.i.b(v, -1);
            this.a.set(v, trackOutput0);
        }
        int v1 = (int)mediaParser$InputReader0.getLength();
        trackOutput0.e(this.e, v1, true);
    }

    @Override  // android.media.MediaParser$OutputConsumer
    public void onSeekMapFound(MediaParser.SeekMap mediaParser$SeekMap0) {
        Unseekable seekMap$Unseekable0;
        if(this.f && this.j == null) {
            this.j = mediaParser$SeekMap0;
            return;
        }
        this.k = mediaParser$SeekMap0;
        long v = mediaParser$SeekMap0.getDurationMicros();
        ExtractorOutput extractorOutput0 = this.i;
        if(this.t) {
            if(v == 0xFFFFFFFF80000000L) {
                v = 0x8000000000000001L;
            }
            seekMap$Unseekable0 = new Unseekable(v);
        }
        else {
            seekMap$Unseekable0 = new SeekMapAdapter(mediaParser$SeekMap0);
        }
        extractorOutput0.r(seekMap$Unseekable0);
    }

    @Override  // android.media.MediaParser$OutputConsumer
    public void onTrackCountFound(int v) {
        this.r = true;
        this.k();
    }

    @Override  // android.media.MediaParser$OutputConsumer
    public void onTrackDataFound(int v, MediaParser.TrackData mediaParser$TrackData0) {
        if(this.l(mediaParser$TrackData0.mediaFormat)) {
            return;
        }
        this.b(v);
        TrackOutput trackOutput0 = (TrackOutput)this.a.get(v);
        if(trackOutput0 == null) {
            String s = mediaParser$TrackData0.mediaFormat.getString("track-type-string");
            int v1 = OutputConsumerAdapterV30.u((s == null ? mediaParser$TrackData0.mediaFormat.getString("mime") : s));
            if(v1 == this.g) {
                this.p = v;
            }
            TrackOutput trackOutput1 = this.i.b(v, v1);
            this.a.set(v, trackOutput1);
            if(s != null) {
                return;
            }
            trackOutput0 = trackOutput1;
        }
        Format format0 = this.t(mediaParser$TrackData0);
        trackOutput0.d((this.h == null || v != this.p ? format0 : format0.m(this.h)));
        this.b.set(v, format0);
        this.k();
    }

    public void p(String s) {
        this.l = OutputConsumerAdapterV30.g(s);
    }

    public void q(TimestampAdjuster timestampAdjuster0) {
        this.n = timestampAdjuster0;
    }

    @Nullable
    private CryptoData r(int v, @Nullable MediaCodec.CryptoInfo mediaCodec$CryptoInfo0) {
        int v2;
        int v1;
        if(mediaCodec$CryptoInfo0 == null) {
            return null;
        }
        if(((MediaCodec.CryptoInfo)this.c.get(v)) == mediaCodec$CryptoInfo0) {
            return (CryptoData)Assertions.g(((CryptoData)this.d.get(v)));
        }
        try {
            Matcher matcher0 = OutputConsumerAdapterV30.B.matcher(mediaCodec$CryptoInfo0.toString());
            matcher0.find();
            v1 = Integer.parseInt(((String)Util.o(matcher0.group(1))));
            v2 = Integer.parseInt(((String)Util.o(matcher0.group(2))));
        }
        catch(RuntimeException runtimeException0) {
            Log.e("OConsumerAdapterV30", "Unexpected error while parsing CryptoInfo: " + mediaCodec$CryptoInfo0, runtimeException0);
            v1 = 0;
            v2 = 0;
        }
        CryptoData trackOutput$CryptoData0 = new CryptoData(mediaCodec$CryptoInfo0.mode, mediaCodec$CryptoInfo0.key, v1, v2);
        this.c.set(v, mediaCodec$CryptoInfo0);
        this.d.set(v, trackOutput$CryptoData0);
        return trackOutput$CryptoData0;
    }

    @Nullable
    private static DrmInitData s(@Nullable String s, @Nullable android.media.DrmInitData drmInitData0) {
        if(drmInitData0 == null) {
            return null;
        }
        int v = drmInitData0.getSchemeInitDataCount();
        SchemeData[] arr_drmInitData$SchemeData = new SchemeData[v];
        for(int v1 = 0; v1 < v; ++v1) {
            DrmInitData.SchemeInitData drmInitData$SchemeInitData0 = drmInitData0.getSchemeInitDataAt(v1);
            arr_drmInitData$SchemeData[v1] = new SchemeData(drmInitData$SchemeInitData0.uuid, drmInitData$SchemeInitData0.mimeType, drmInitData$SchemeInitData0.data);
        }
        return new DrmInitData(s, arr_drmInitData$SchemeData);
    }

    private Format t(MediaParser.TrackData mediaParser$TrackData0) {
        MediaFormat mediaFormat0 = mediaParser$TrackData0.mediaFormat;
        String s = mediaFormat0.getString("mime");
        int v = mediaFormat0.getInteger("caption-service-number", -1);
        Builder format$Builder0 = new Builder().U(OutputConsumerAdapterV30.s(mediaFormat0.getString("crypto-mode-fourcc"), mediaParser$TrackData0.drmInitData)).Q(this.l).j0(mediaFormat0.getInteger("bitrate", -1)).N(mediaFormat0.getInteger("channel-count", -1)).P(MediaFormatUtil.d(mediaFormat0)).o0(s).O(mediaFormat0.getString("codecs-string")).X(mediaFormat0.getFloat("frame-rate", -1.0f)).v0(mediaFormat0.getInteger("width", -1)).Y(mediaFormat0.getInteger("height", -1)).b0(OutputConsumerAdapterV30.f(mediaFormat0)).e0(mediaFormat0.getString("language")).f0(mediaFormat0.getInteger("max-input-size", -1)).i0(mediaFormat0.getInteger("exo-pcm-encoding", -1)).n0(mediaFormat0.getInteger("rotation-degrees", 0)).p0(mediaFormat0.getInteger("sample-rate", -1)).q0(OutputConsumerAdapterV30.j(mediaFormat0)).V(mediaFormat0.getInteger("encoder-delay", 0)).W(mediaFormat0.getInteger("encoder-padding", 0)).k0(mediaFormat0.getFloat("pixel-width-height-ratio-float", 1.0f)).s0(mediaFormat0.getLong("subsample-offset-us-long", 0x7FFFFFFFFFFFFFFFL)).L(v);
        for(int v1 = 0; v1 < this.o.size(); ++v1) {
            Format format0 = (Format)this.o.get(v1);
            if(Util.g(format0.n, s) && format0.G == v) {
                format$Builder0.e0(format0.d).m0(format0.f).q0(format0.e).c0(format0.b).d0(format0.c).h0(format0.k);
                return format$Builder0.K();
            }
        }
        return format$Builder0.K();
    }

    private static int u(@Nullable String s) {
        if(s == null) {
            return -1;
        }
        switch(s) {
            case "audio": {
                return 1;
            }
            case "metadata": {
                return 5;
            }
            case "text": {
                return 3;
            }
            case "unknown": {
                return -1;
            }
            case "video": {
                return 2;
            }
            default: {
                return MimeTypes.m(s);
            }
        }
    }

    class androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.1 {
    }

}

