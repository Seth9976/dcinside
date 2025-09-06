package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class ResolvingDataSource implements DataSource {
    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final androidx.media3.datasource.DataSource.Factory a;
        private final Resolver b;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, Resolver resolvingDataSource$Resolver0) {
            this.a = dataSource$Factory0;
            this.b = resolvingDataSource$Resolver0;
        }

        @Override  // androidx.media3.datasource.DataSource$Factory
        public DataSource a() {
            return this.c();
        }

        public ResolvingDataSource c() {
            return new ResolvingDataSource(this.a.a(), this.b);
        }
    }

    public interface Resolver {
        DataSpec a(DataSpec arg1) throws IOException;

        Uri b(Uri arg1);
    }

    private final DataSource b;
    private final Resolver c;
    private boolean d;

    public ResolvingDataSource(DataSource dataSource0, Resolver resolvingDataSource$Resolver0) {
        this.b = dataSource0;
        this.c = resolvingDataSource$Resolver0;
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        DataSpec dataSpec1 = this.c.a(dataSpec0);
        this.d = true;
        return this.b.a(dataSpec1);
    }

    @Override  // androidx.media3.datasource.DataSource
    public Map b() {
        return this.b.b();
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        Uri uri0 = this.b.c();
        return uri0 == null ? null : this.c.b(uri0);
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws IOException {
        if(this.d) {
            this.d = false;
            this.b.close();
        }
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.b.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        return this.b.read(arr_b, v, v1);
    }
}

