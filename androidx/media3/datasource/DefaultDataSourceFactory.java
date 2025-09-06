package androidx.media3.datasource;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
@Deprecated
public final class DefaultDataSourceFactory implements Factory {
    private final Context a;
    @Nullable
    private final TransferListener b;
    private final Factory c;

    public DefaultDataSourceFactory(Context context0) {
        this(context0, null, null);
    }

    public DefaultDataSourceFactory(Context context0, Factory dataSource$Factory0) {
        this(context0, null, dataSource$Factory0);
    }

    public DefaultDataSourceFactory(Context context0, @Nullable TransferListener transferListener0, Factory dataSource$Factory0) {
        this.a = context0.getApplicationContext();
        this.b = transferListener0;
        this.c = dataSource$Factory0;
    }

    public DefaultDataSourceFactory(Context context0, @Nullable String s) {
        this(context0, s, null);
    }

    public DefaultDataSourceFactory(Context context0, @Nullable String s, @Nullable TransferListener transferListener0) {
        this(context0, transferListener0, new androidx.media3.datasource.DefaultHttpDataSource.Factory().l(s));
    }

    @Override  // androidx.media3.datasource.DataSource$Factory
    public DataSource a() {
        return this.c();
    }

    public DefaultDataSource c() {
        DataSource dataSource0 = this.c.a();
        DefaultDataSource defaultDataSource0 = new DefaultDataSource(this.a, dataSource0);
        TransferListener transferListener0 = this.b;
        if(transferListener0 != null) {
            defaultDataSource0.l(transferListener0);
        }
        return defaultDataSource0;
    }
}

