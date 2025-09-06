package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import com.google.common.collect.Q2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class DashUtil {
    @Deprecated
    public static DataSpec a(Representation representation0, RangedUri rangedUri0, int v) {
        return DashUtil.c(representation0, ((BaseUrl)representation0.d.get(0)).a, rangedUri0, v, Q2.u());
    }

    @Deprecated
    public static DataSpec b(Representation representation0, String s, RangedUri rangedUri0, int v) {
        return DashUtil.c(representation0, s, rangedUri0, v, Q2.u());
    }

    public static DataSpec c(Representation representation0, String s, RangedUri rangedUri0, int v, Map map0) {
        return new Builder().j(rangedUri0.b(s)).i(rangedUri0.a).h(rangedUri0.b).g(DashUtil.o(representation0, rangedUri0)).c(v).f(map0).a();
    }

    @Nullable
    private static Representation d(Period period0, int v) {
        int v1 = period0.a(v);
        if(v1 == -1) {
            return null;
        }
        List list0 = ((AdaptationSet)period0.c.get(v1)).c;
        return list0.isEmpty() ? null : ((Representation)list0.get(0));
    }

    @Nullable
    public static ChunkIndex e(DataSource dataSource0, int v, Representation representation0) throws IOException {
        return DashUtil.f(dataSource0, v, representation0, 0);
    }

    @Nullable
    public static ChunkIndex f(DataSource dataSource0, int v, Representation representation0, int v1) throws IOException {
        if(representation0.n() == null) {
            return null;
        }
        ChunkExtractor chunkExtractor0 = DashUtil.n(v, representation0.c);
        try {
            DashUtil.i(chunkExtractor0, dataSource0, representation0, v1, true);
        }
        finally {
            chunkExtractor0.release();
        }
        return chunkExtractor0.d();
    }

    @Nullable
    public static Format g(DataSource dataSource0, Period period0) throws IOException {
        int v = 2;
        Representation representation0 = DashUtil.d(period0, 2);
        if(representation0 == null) {
            v = 1;
            representation0 = DashUtil.d(period0, 1);
            if(representation0 == null) {
                return null;
            }
        }
        Format format0 = DashUtil.l(dataSource0, v, representation0);
        return format0 == null ? representation0.c : format0.m(representation0.c);
    }

    private static void h(DataSource dataSource0, Representation representation0, int v, ChunkExtractor chunkExtractor0, RangedUri rangedUri0) throws IOException {
        new InitializationChunk(dataSource0, DashUtil.c(representation0, ((BaseUrl)representation0.d.get(v)).a, rangedUri0, 0, Q2.u()), representation0.c, 0, null, chunkExtractor0).w();
    }

    private static void i(ChunkExtractor chunkExtractor0, DataSource dataSource0, Representation representation0, int v, boolean z) throws IOException {
        RangedUri rangedUri0 = (RangedUri)Assertions.g(representation0.n());
        if(z) {
            RangedUri rangedUri1 = representation0.m();
            if(rangedUri1 == null) {
                return;
            }
            RangedUri rangedUri2 = rangedUri0.a(rangedUri1, ((BaseUrl)representation0.d.get(v)).a);
            if(rangedUri2 == null) {
                DashUtil.h(dataSource0, representation0, v, chunkExtractor0, rangedUri0);
                rangedUri0 = rangedUri1;
            }
            else {
                rangedUri0 = rangedUri2;
            }
        }
        DashUtil.h(dataSource0, representation0, v, chunkExtractor0, rangedUri0);
    }

    public static void j(ChunkExtractor chunkExtractor0, DataSource dataSource0, Representation representation0, boolean z) throws IOException {
        DashUtil.i(chunkExtractor0, dataSource0, representation0, 0, z);
    }

    public static DashManifest k(DataSource dataSource0, Uri uri0) throws IOException {
        return (DashManifest)ParsingLoadable.f(dataSource0, new DashManifestParser(), uri0, 4);
    }

    @Nullable
    public static Format l(DataSource dataSource0, int v, Representation representation0) throws IOException {
        return DashUtil.m(dataSource0, v, representation0, 0);
    }

    @Nullable
    public static Format m(DataSource dataSource0, int v, Representation representation0, int v1) throws IOException {
        if(representation0.n() == null) {
            return null;
        }
        ChunkExtractor chunkExtractor0 = DashUtil.n(v, representation0.c);
        try {
            DashUtil.i(chunkExtractor0, dataSource0, representation0, v1, false);
        }
        finally {
            chunkExtractor0.release();
        }
        return ((Format[])Assertions.k(chunkExtractor0.e()))[0];
    }

    // 去混淆评级： 低(20)
    private static ChunkExtractor n(int v, Format format0) {
        return format0.m == null || !format0.m.startsWith("video/webm") && !format0.m.startsWith("audio/webm") ? new BundledChunkExtractor(new FragmentedMp4Extractor(Factory.a, 0x20), v, format0) : new BundledChunkExtractor(new MatroskaExtractor(Factory.a, 2), v, format0);
    }

    public static String o(Representation representation0, RangedUri rangedUri0) {
        String s = representation0.a();
        return s == null ? rangedUri0.b(((BaseUrl)representation0.d.get(0)).a).toString() : s;
    }
}

