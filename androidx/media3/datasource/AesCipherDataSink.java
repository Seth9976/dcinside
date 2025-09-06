package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public final class AesCipherDataSink implements DataSink {
    private final DataSink a;
    private final byte[] b;
    @Nullable
    private final byte[] c;
    @Nullable
    private AesFlushingCipher d;

    public AesCipherDataSink(byte[] arr_b, DataSink dataSink0) {
        this(arr_b, dataSink0, null);
    }

    public AesCipherDataSink(byte[] arr_b, DataSink dataSink0, @Nullable byte[] arr_b1) {
        this.a = dataSink0;
        this.b = arr_b;
        this.c = arr_b1;
    }

    @Override  // androidx.media3.datasource.DataSink
    public void a(DataSpec dataSpec0) throws IOException {
        this.a.a(dataSpec0);
        this.d = new AesFlushingCipher(1, this.b, dataSpec0.i, dataSpec0.g + dataSpec0.b);
    }

    @Override  // androidx.media3.datasource.DataSink
    public void close() throws IOException {
        this.d = null;
        this.a.close();
    }

    @Override  // androidx.media3.datasource.DataSink
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        if(this.c == null) {
            this.d.e(arr_b, v, v1);
            this.a.write(arr_b, v, v1);
            return;
        }
        for(int v2 = 0; v2 < v1; v2 += v3) {
            int v3 = Math.min(v1 - v2, this.c.length);
            this.d.d(arr_b, v + v2, v3, this.c, 0);
            this.a.write(this.c, 0, v3);
        }
    }
}

