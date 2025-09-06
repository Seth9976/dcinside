package androidx.media3.exoplayer.dash.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource.Factory;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.offline.SegmentDownloader.Segment;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable.Parser;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.Q2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@UnstableApi
public final class DashDownloader extends SegmentDownloader {
    private final BaseUrlExclusionList n;

    public DashDownloader(MediaItem mediaItem0, Factory cacheDataSource$Factory0) {
        this(mediaItem0, cacheDataSource$Factory0, new a());
    }

    public DashDownloader(MediaItem mediaItem0, Factory cacheDataSource$Factory0, Executor executor0) {
        this(mediaItem0, new DashManifestParser(), cacheDataSource$Factory0, executor0, 20000L);
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem0, Parser parsingLoadable$Parser0, Factory cacheDataSource$Factory0, Executor executor0) {
        this(mediaItem0, parsingLoadable$Parser0, cacheDataSource$Factory0, executor0, 20000L);
    }

    public DashDownloader(MediaItem mediaItem0, Parser parsingLoadable$Parser0, Factory cacheDataSource$Factory0, Executor executor0, long v) {
        super(mediaItem0, parsingLoadable$Parser0, cacheDataSource$Factory0, executor0, v);
        this.n = new BaseUrlExclusionList();
    }

    @Override  // androidx.media3.exoplayer.offline.SegmentDownloader
    protected List h(DataSource dataSource0, FilterableManifest filterableManifest0, boolean z) throws IOException, InterruptedException {
        return this.o(dataSource0, ((DashManifest)filterableManifest0), z);
    }

    private void l(DataSource dataSource0, AdaptationSet adaptationSet0, long v, long v1, boolean z, ArrayList arrayList0) throws IOException, InterruptedException {
        String s1;
        DashSegmentIndex dashSegmentIndex0;
        for(int v2 = 0; v2 < adaptationSet0.c.size(); ++v2) {
            Representation representation0 = (Representation)adaptationSet0.c.get(v2);
            try {
                dashSegmentIndex0 = this.n(dataSource0, adaptationSet0.b, representation0, z);
                if(dashSegmentIndex0 == null) {
                    throw new DownloadException("Missing segment index");
                }
            }
            catch(IOException iOException0) {
                if(!z) {
                    throw iOException0;
                }
                continue;
            }
            long v3 = dashSegmentIndex0.g(v1);
            if(v3 == -1L) {
                throw new DownloadException("Unbounded segment index");
            }
            String s = ((BaseUrl)Util.o(this.n.j(representation0.d))).a;
            RangedUri rangedUri0 = representation0.n();
            if(rangedUri0 == null) {
                s1 = s;
            }
            else {
                s1 = s;
                arrayList0.add(this.m(representation0, s, v, rangedUri0));
            }
            RangedUri rangedUri1 = representation0.m();
            if(rangedUri1 != null) {
                arrayList0.add(this.m(representation0, s1, v, rangedUri1));
            }
            long v4 = dashSegmentIndex0.h();
            long v5 = v4 + v3 - 1L;
            for(long v6 = v4; v6 <= v5; ++v6) {
                arrayList0.add(this.m(representation0, s1, v + dashSegmentIndex0.b(v6), dashSegmentIndex0.i(v6)));
            }
        }
    }

    private Segment m(Representation representation0, String s, long v, RangedUri rangedUri0) {
        return new Segment(v, DashUtil.c(representation0, s, rangedUri0, 0, Q2.u()));
    }

    @Nullable
    private DashSegmentIndex n(DataSource dataSource0, int v, Representation representation0, boolean z) throws IOException, InterruptedException {
        DashSegmentIndex dashSegmentIndex0 = representation0.l();
        if(dashSegmentIndex0 != null) {
            return dashSegmentIndex0;
        }
        ChunkIndex chunkIndex0 = (ChunkIndex)this.e(new RunnableFutureTask() {
            final DashDownloader k;

            @Override  // androidx.media3.common.util.RunnableFutureTask
            protected Object d() throws Exception {
                return this.f();
            }

            protected ChunkIndex f() throws IOException {
                return DashUtil.e(dataSource0, v, representation0);
            }
        }, z);
        return chunkIndex0 == null ? null : new DashWrappingSegmentIndex(chunkIndex0, representation0.e);
    }

    protected List o(DataSource dataSource0, DashManifest dashManifest0, boolean z) throws IOException, InterruptedException {
        List list0 = new ArrayList();
        for(int v = 0; v < dashManifest0.e(); ++v) {
            Period period0 = dashManifest0.d(v);
            long v1 = Util.F1(period0.b);
            long v2 = dashManifest0.g(v);
            List list1 = period0.c;
            for(int v3 = 0; v3 < list1.size(); ++v3) {
                this.l(dataSource0, ((AdaptationSet)list1.get(v3)), v1, v2, z, ((ArrayList)list0));
            }
        }
        return list0;
    }
}

