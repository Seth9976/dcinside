package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import java.io.IOException;
import java.util.Map;

final class IcyDataSource implements DataSource {
    public interface Listener {
        void a(ParsableByteArray arg1);
    }

    private final DataSource b;
    private final int c;
    private final Listener d;
    private final byte[] e;
    private int f;

    public IcyDataSource(DataSource dataSource0, int v, Listener icyDataSource$Listener0) {
        Assertions.a(v > 0);
        this.b = dataSource0;
        this.c = v;
        this.d = icyDataSource$Listener0;
        this.e = new byte[1];
        this.f = v;
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) {
        throw new UnsupportedOperationException();
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
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.b.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.f == 0) {
            if(this.u()) {
                this.f = this.c;
                goto label_5;
            }
            return -1;
        }
    label_5:
        int v2 = this.b.read(arr_b, v, Math.min(this.f, v1));
        if(v2 != -1) {
            this.f -= v2;
        }
        return v2;
    }

    private boolean u() throws IOException {
        if(this.b.read(this.e, 0, 1) == -1) {
            return false;
        }
        int v = (this.e[0] & 0xFF) << 4;
        if(v == 0) {
            return true;
        }
        byte[] arr_b = new byte[v];
        int v1 = v;
        int v2 = 0;
        while(v1 > 0) {
            int v3 = this.b.read(arr_b, v2, v1);
            if(v3 == -1) {
                return false;
            }
            v2 += v3;
            v1 -= v3;
        }
        while(v > 0 && arr_b[v - 1] == 0) {
            --v;
        }
        if(v > 0) {
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b, v);
            this.d.a(parsableByteArray0);
        }
        return true;
    }
}

