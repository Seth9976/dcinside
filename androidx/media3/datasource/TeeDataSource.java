package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class TeeDataSource implements DataSource {
    private final DataSource b;
    private final DataSink c;
    private boolean d;
    private long e;

    public TeeDataSource(DataSource dataSource0, DataSink dataSink0) {
        this.b = (DataSource)Assertions.g(dataSource0);
        this.c = (DataSink)Assertions.g(dataSink0);
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        long v = this.b.a(dataSpec0);
        this.e = v;
        if(v == 0L) {
            return 0L;
        }
        if(dataSpec0.h == -1L && v != -1L) {
            dataSpec0 = dataSpec0.f(0L, v);
        }
        this.d = true;
        this.c.a(dataSpec0);
        return this.e;
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
        try {
            this.b.close();
        }
        catch(Throwable throwable0) {
            if(this.d) {
                this.d = false;
                this.c.close();
            }
            throw throwable0;
        }
        if(this.d) {
            this.d = false;
            this.c.close();
        }
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.b.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.e == 0L) {
            return -1;
        }
        int v2 = this.b.read(arr_b, v, v1);
        if(v2 > 0) {
            this.c.write(arr_b, v, v2);
            long v3 = this.e;
            if(v3 != -1L) {
                this.e = v3 - ((long)v2);
            }
        }
        return v2;
    }
}

