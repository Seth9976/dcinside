package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Arrays;

@UnstableApi
public abstract class DataChunk extends Chunk {
    private byte[] j;
    private volatile boolean k;
    private static final int l = 0x4000;

    public DataChunk(DataSource dataSource0, DataSpec dataSpec0, int v, Format format0, int v1, @Nullable Object object0, @Nullable byte[] arr_b) {
        super(dataSource0, dataSpec0, v, format0, v1, object0, 0x8000000000000001L, 0x8000000000000001L);
        this.j = arr_b == null ? Util.f : arr_b;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void b() {
        this.k = true;
    }

    protected abstract void f(byte[] arg1, int arg2) throws IOException;

    public byte[] g() {
        return this.j;
    }

    private void h(int v) {
        byte[] arr_b = this.j;
        if(arr_b.length < v + 0x4000) {
            this.j = Arrays.copyOf(arr_b, arr_b.length + 0x4000);
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void w() throws IOException {
        try {
            this.i.a(this.b);
            int v1 = 0;
            int v2 = 0;
            while(v1 != -1 && !this.k) {
                this.h(v2);
                v1 = this.i.read(this.j, v2, 0x4000);
                if(v1 != -1) {
                    v2 += v1;
                }
            }
            if(!this.k) {
                this.f(this.j, v2);
            }
        }
        finally {
            DataSourceUtil.a(this.i);
        }
    }
}

