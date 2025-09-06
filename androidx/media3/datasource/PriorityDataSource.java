package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class PriorityDataSource implements DataSource {
    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final androidx.media3.datasource.DataSource.Factory a;
        private final PriorityTaskManager b;
        private final int c;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, PriorityTaskManager priorityTaskManager0, int v) {
            this.a = dataSource$Factory0;
            this.b = priorityTaskManager0;
            this.c = v;
        }

        @Override  // androidx.media3.datasource.DataSource$Factory
        public DataSource a() {
            return this.c();
        }

        public PriorityDataSource c() {
            return new PriorityDataSource(this.a.a(), this.b, this.c);
        }
    }

    private final DataSource b;
    private final PriorityTaskManager c;
    private final int d;

    public PriorityDataSource(DataSource dataSource0, PriorityTaskManager priorityTaskManager0, int v) {
        this.b = (DataSource)Assertions.g(dataSource0);
        this.c = (PriorityTaskManager)Assertions.g(priorityTaskManager0);
        this.d = v;
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        this.c.d(this.d);
        return this.b.a(dataSpec0);
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
        this.c.d(this.d);
        return this.b.read(arr_b, v, v1);
    }
}

