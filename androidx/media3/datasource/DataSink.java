package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
public interface DataSink {
    public interface Factory {
        DataSink a();
    }

    void a(DataSpec arg1) throws IOException;

    void close() throws IOException;

    void write(byte[] arg1, int arg2, int arg3) throws IOException;
}

