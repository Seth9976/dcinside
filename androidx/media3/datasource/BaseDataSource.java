package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Map;

@UnstableApi
public abstract class BaseDataSource implements DataSource {
    private final boolean b;
    private final ArrayList c;
    private int d;
    @Nullable
    private DataSpec e;

    protected BaseDataSource(boolean z) {
        this.b = z;
        this.c = new ArrayList(1);
    }

    @Override  // androidx.media3.datasource.DataSource
    public Map b() {
        return d.a(this);
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    public final void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        if(!this.c.contains(transferListener0)) {
            this.c.add(transferListener0);
            ++this.d;
        }
    }

    protected final void u(int v) {
        DataSpec dataSpec0 = this.e;
        for(int v1 = 0; v1 < this.d; ++v1) {
            ((TransferListener)this.c.get(v1)).f(this, dataSpec0, this.b, v);
        }
    }

    protected final void v() {
        DataSpec dataSpec0 = (DataSpec)Util.o(this.e);
        for(int v = 0; v < this.d; ++v) {
            ((TransferListener)this.c.get(v)).h(this, dataSpec0, this.b);
        }
        this.e = null;
    }

    protected final void w(DataSpec dataSpec0) {
        for(int v = 0; v < this.d; ++v) {
            ((TransferListener)this.c.get(v)).i(this, dataSpec0, this.b);
        }
    }

    protected final void x(DataSpec dataSpec0) {
        this.e = dataSpec0;
        for(int v = 0; v < this.d; ++v) {
            ((TransferListener)this.c.get(v)).e(this, dataSpec0, this.b);
        }
    }
}

