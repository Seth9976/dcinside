package androidx.media3.datasource;

import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
@Deprecated
public final class PriorityDataSourceFactory implements Factory {
    private final Factory a;
    private final PriorityTaskManager b;
    private final int c;

    public PriorityDataSourceFactory(Factory dataSource$Factory0, PriorityTaskManager priorityTaskManager0, int v) {
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

