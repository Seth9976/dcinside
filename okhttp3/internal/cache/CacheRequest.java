package okhttp3.internal.cache;

import java.io.IOException;
import okio.m0;
import y4.l;

public interface CacheRequest {
    void abort();

    @l
    m0 body() throws IOException;
}

