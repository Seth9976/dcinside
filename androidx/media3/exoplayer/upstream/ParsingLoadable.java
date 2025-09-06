package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@UnstableApi
public final class ParsingLoadable implements Loadable {
    public interface Parser {
        Object a(Uri arg1, InputStream arg2) throws IOException;
    }

    public final long a;
    public final DataSpec b;
    public final int c;
    private final StatsDataSource d;
    private final Parser e;
    @Nullable
    private volatile Object f;

    public ParsingLoadable(DataSource dataSource0, Uri uri0, int v, Parser parsingLoadable$Parser0) {
        this(dataSource0, new Builder().j(uri0).c(1).a(), v, parsingLoadable$Parser0);
    }

    public ParsingLoadable(DataSource dataSource0, DataSpec dataSpec0, int v, Parser parsingLoadable$Parser0) {
        this.d = new StatsDataSource(dataSource0);
        this.b = dataSpec0;
        this.c = v;
        this.e = parsingLoadable$Parser0;
        this.a = LoadEventInfo.a();
    }

    public long a() {
        return this.d.u();
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void b() {
    }

    public Map c() {
        return this.d.w();
    }

    @Nullable
    public final Object d() {
        return this.f;
    }

    public Uri e() {
        return this.d.v();
    }

    public static Object f(DataSource dataSource0, Parser parsingLoadable$Parser0, Uri uri0, int v) throws IOException {
        ParsingLoadable parsingLoadable0 = new ParsingLoadable(dataSource0, uri0, v, parsingLoadable$Parser0);
        parsingLoadable0.w();
        return Assertions.g(parsingLoadable0.d());
    }

    public static Object g(DataSource dataSource0, Parser parsingLoadable$Parser0, DataSpec dataSpec0, int v) throws IOException {
        ParsingLoadable parsingLoadable0 = new ParsingLoadable(dataSource0, dataSpec0, v, parsingLoadable$Parser0);
        parsingLoadable0.w();
        return Assertions.g(parsingLoadable0.d());
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void w() throws IOException {
        this.d.x();
        DataSourceInputStream dataSourceInputStream0 = new DataSourceInputStream(this.d, this.b);
        try {
            dataSourceInputStream0.c();
            Uri uri0 = (Uri)Assertions.g(this.d.c());
            this.f = this.e.a(uri0, dataSourceInputStream0);
        }
        finally {
            Util.t(dataSourceInputStream0);
        }
    }
}

