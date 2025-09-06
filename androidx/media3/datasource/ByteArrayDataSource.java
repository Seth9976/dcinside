package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public final class ByteArrayDataSource extends BaseDataSource {
    public interface UriResolver {
        byte[] a(Uri arg1) throws IOException;
    }

    private final UriResolver f;
    @Nullable
    private Uri g;
    @Nullable
    private byte[] h;
    private int i;
    private int j;
    private boolean k;

    public ByteArrayDataSource(UriResolver byteArrayDataSource$UriResolver0) {
        super(false);
        this.f = (UriResolver)Assertions.g(byteArrayDataSource$UriResolver0);
    }

    public ByteArrayDataSource(byte[] arr_b) {
        this((Uri uri0) -> arr_b);
        Assertions.a(arr_b.length > 0);
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        this.w(dataSpec0);
        this.g = dataSpec0.a;
        byte[] arr_b = this.f.a(dataSpec0.a);
        this.h = arr_b;
        long v = dataSpec0.g;
        if(v > ((long)arr_b.length)) {
            throw new DataSourceException(2008);
        }
        this.i = (int)v;
        int v1 = arr_b.length - ((int)v);
        this.j = v1;
        long v2 = dataSpec0.h;
        if(v2 != -1L) {
            this.j = (int)Math.min(v1, v2);
        }
        this.k = true;
        this.x(dataSpec0);
        return dataSpec0.h == -1L ? ((long)this.j) : dataSpec0.h;
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.g;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() {
        if(this.k) {
            this.k = false;
            this.v();
        }
        this.g = null;
        this.h = null;
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.j;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(Assertions.k(this.h), this.i, arr_b, v, v3);
        this.i += v3;
        this.j -= v3;
        this.u(v3);
        return v3;
    }

    // 检测为 Lambda 实现
    public static byte[] y(byte[] arr_b, Uri uri0) [...]

    private static byte[] z(byte[] arr_b, Uri uri0) throws IOException [...] // Inlined contents
}

