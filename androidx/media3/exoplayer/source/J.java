package androidx.media3.exoplayer.source;

import androidx.media3.datasource.DataSource.Factory;
import com.google.common.base.Q;

public final class j implements Q {
    public final DelegateFactoryLoader a;
    public final Factory b;

    public j(DelegateFactoryLoader defaultMediaSourceFactory$DelegateFactoryLoader0, Factory dataSource$Factory0) {
        this.a = defaultMediaSourceFactory$DelegateFactoryLoader0;
        this.b = dataSource$Factory0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return this.a.m(this.b);
    }
}

