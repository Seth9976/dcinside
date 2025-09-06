package androidx.media3.exoplayer.source;

import android.annotation.SuppressLint;
import android.media.MediaParser.SeekPoint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import com.google.common.collect.Q2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

@RequiresApi(30)
@UnstableApi
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {
    public static final class Factory implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory {
        private static final Map a;

        static {
            Factory.a = new HashMap();
        }

        @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor$Factory
        public ProgressiveMediaExtractor a(PlayerId playerId0) {
            return this.b(playerId0);
        }

        public MediaParserExtractorAdapter b(PlayerId playerId0) {
            return new MediaParserExtractorAdapter(playerId0, Factory.a, null);
        }

        public void c(boolean z) {
            if(z) {
                Factory.a.put("android.media.mediaparser.adts.enableCbrSeeking", Boolean.TRUE);
                Factory.a.put("android.media.mediaparser.amr.enableCbrSeeking", Boolean.TRUE);
                Factory.a.put("android.media.mediaparser.mp3.enableCbrSeeking", Boolean.TRUE);
                return;
            }
            Factory.a.remove("android.media.mediaparser.adts.enableCbrSeeking");
            Factory.a.remove("android.media.mediaparser.amr.enableCbrSeeking");
            Factory.a.remove("android.media.mediaparser.mp3.enableCbrSeeking");
        }
    }

    private final OutputConsumerAdapterV30 a;
    private final InputReaderAdapterV30 b;
    private final MediaParser c;
    private String d;
    @Deprecated
    public static final androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory e;

    static {
        MediaParserExtractorAdapter.e = (PlayerId playerId0) -> new MediaParserExtractorAdapter(playerId0, Q2.u());
    }

    @Deprecated
    public MediaParserExtractorAdapter(PlayerId playerId0) {
        this(playerId0, Q2.u());
    }

    @SuppressLint({"WrongConstant"})
    private MediaParserExtractorAdapter(PlayerId playerId0, Map map0) {
        OutputConsumerAdapterV30 outputConsumerAdapterV300 = new OutputConsumerAdapterV30();
        this.a = outputConsumerAdapterV300;
        this.b = new InputReaderAdapterV30();
        MediaParser mediaParser0 = MediaParser.create(outputConsumerAdapterV300, new String[0]);
        this.c = mediaParser0;
        mediaParser0.setParameter("android.media.mediaparser.eagerlyExposeTrackType", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.inBandCryptoInfo", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.includeSupplementalData", Boolean.TRUE);
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            this.c.setParameter(s, object1);
        }
        this.d = "android.media.mediaparser.UNKNOWN";
        if(Util.a >= 0x1F) {
            MediaParserUtil.a(this.c, playerId0);
        }
    }

    MediaParserExtractorAdapter(PlayerId playerId0, Map map0, androidx.media3.exoplayer.source.MediaParserExtractorAdapter.1 mediaParserExtractorAdapter$10) {
        this(playerId0, map0);
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void a(long v, long v1) {
        this.b.b(v);
        Pair pair0 = this.a.i(v1);
        Object object0 = ((MediaParser.SeekPoint)pair0.second).position == v ? pair0.second : pair0.first;
        this.c.seek(((MediaParser.SeekPoint)object0));
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void b(DataReader dataReader0, Uri uri0, Map map0, long v, long v1, ExtractorOutput extractorOutput0) throws IOException {
        this.a.m(extractorOutput0);
        this.b.c(dataReader0, v1);
        this.b.b(v);
        String s = this.c.getParserName();
        if("android.media.mediaparser.UNKNOWN".equals(s)) {
            this.c.advance(this.b);
            String s1 = this.c.getParserName();
            this.d = s1;
            this.a.p(s1);
            return;
        }
        if(!s.equals(this.d)) {
            String s2 = this.c.getParserName();
            this.d = s2;
            this.a.p(s2);
        }
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long c() {
        return this.b.getPosition();
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void d() {
        if("android.media.mediaparser.Mp3Parser".equals(this.d)) {
            this.a.a();
        }
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int e(PositionHolder positionHolder0) throws IOException {
        boolean z = this.c.advance(this.b);
        long v = this.b.a();
        positionHolder0.a = v;
        if(!z) {
            return -1;
        }
        return v == -1L ? 0 : 1;
    }

    // 检测为 Lambda 实现
    private static ProgressiveMediaExtractor g(PlayerId playerId0) [...]

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        this.c.release();
    }

    class androidx.media3.exoplayer.source.MediaParserExtractorAdapter.1 {
    }

}

