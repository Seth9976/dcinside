package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(34)
final class ByteArrayUploadDataProvider extends UploadDataProvider {
    private final byte[] a;
    private int b;

    public ByteArrayUploadDataProvider(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // android.net.http.UploadDataProvider
    public long getLength() {
        return (long)this.a.length;
    }

    @Override  // android.net.http.UploadDataProvider
    public void read(UploadDataSink uploadDataSink0, ByteBuffer byteBuffer0) throws IOException {
        int v = Math.min(byteBuffer0.remaining(), this.a.length - this.b);
        byteBuffer0.put(this.a, this.b, v);
        this.b += v;
        uploadDataSink0.onReadSucceeded(false);
    }

    @Override  // android.net.http.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink0) throws IOException {
        this.b = 0;
        uploadDataSink0.onRewindSucceeded();
    }
}

