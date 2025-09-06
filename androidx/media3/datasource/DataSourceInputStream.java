package androidx.media3.datasource;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.io.InputStream;

@UnstableApi
public final class DataSourceInputStream extends InputStream {
    private final DataSource a;
    private final DataSpec b;
    private final byte[] c;
    private boolean d;
    private boolean e;
    private long f;

    public DataSourceInputStream(DataSource dataSource0, DataSpec dataSpec0) {
        this.d = false;
        this.e = false;
        this.a = dataSource0;
        this.b = dataSpec0;
        this.c = new byte[1];
    }

    public long a() {
        return this.f;
    }

    private void b() throws IOException {
        if(!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
    }

    public void c() throws IOException {
        this.b();
    }

    @Override
    public void close() throws IOException {
        if(!this.e) {
            this.a.close();
            this.e = true;
        }
    }

    @Override
    public int read() throws IOException {
        return this.read(this.c) == -1 ? -1 : this.c[0] & 0xFF;
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        Assertions.i(!this.e);
        this.b();
        int v2 = this.a.read(arr_b, v, v1);
        if(v2 == -1) {
            return -1;
        }
        this.f += (long)v2;
        return v2;
    }
}

