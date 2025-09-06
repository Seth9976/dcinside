package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@UnstableApi
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream a;

    @Override  // androidx.media3.datasource.DataSink
    public void a(DataSpec dataSpec0) {
        long v = dataSpec0.h;
        if(v == -1L) {
            this.a = new ByteArrayOutputStream();
            return;
        }
        Assertions.a(v <= 0x7FFFFFFFL);
        this.a = new ByteArrayOutputStream(((int)dataSpec0.h));
    }

    @Nullable
    public byte[] b() {
        return this.a == null ? null : this.a.toByteArray();
    }

    @Override  // androidx.media3.datasource.DataSink
    public void close() throws IOException {
        this.a.close();
    }

    @Override  // androidx.media3.datasource.DataSink
    public void write(byte[] arr_b, int v, int v1) {
        this.a.write(arr_b, v, v1);
    }
}

