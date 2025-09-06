package androidx.media3.exoplayer.source;

import androidx.media3.datasource.DataSource.Factory;
import com.google.common.base.Q;

public final class h implements Q {
    public final Class a;
    public final Factory b;

    public h(Class class0, Factory dataSource$Factory0) {
        this.a = class0;
        this.b = dataSource$Factory0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return DefaultMediaSourceFactory.q(this.a, this.b);
    }
}

