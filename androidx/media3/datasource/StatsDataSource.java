package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

@UnstableApi
public final class StatsDataSource implements DataSource {
    private final DataSource b;
    private long c;
    private Uri d;
    private Map e;

    public StatsDataSource(DataSource dataSource0) {
        this.b = (DataSource)Assertions.g(dataSource0);
        this.d = Uri.EMPTY;
        this.e = Collections.emptyMap();
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        this.d = dataSpec0.a;
        this.e = Collections.emptyMap();
        long v = this.b.a(dataSpec0);
        this.d = (Uri)Assertions.g(this.c());
        this.e = this.b();
        return v;
    }

    @Override  // androidx.media3.datasource.DataSource
    public Map b() {
        return this.b.b();
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.b.c();
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws IOException {
        this.b.close();
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.b.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.b.read(arr_b, v, v1);
        if(v2 != -1) {
            this.c += (long)v2;
        }
        return v2;
    }

    public long u() {
        return this.c;
    }

    public Uri v() {
        return this.d;
    }

    public Map w() {
        return this.e;
    }

    public void x() {
        this.c = 0L;
    }
}

