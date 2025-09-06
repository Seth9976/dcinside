package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class AesCipherDataSource implements DataSource {
    private final DataSource b;
    private final byte[] c;
    @Nullable
    private AesFlushingCipher d;

    public AesCipherDataSource(byte[] arr_b, DataSource dataSource0) {
        this.b = dataSource0;
        this.c = arr_b;
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        long v = this.b.a(dataSpec0);
        this.d = new AesFlushingCipher(2, this.c, dataSpec0.i, dataSpec0.g + dataSpec0.b);
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
        this.d = null;
        this.b.close();
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.b.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.b.read(arr_b, v, v1);
        if(v2 == -1) {
            return -1;
        }
        this.d.e(arr_b, v, v2);
        return v2;
    }
}

