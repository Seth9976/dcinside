package okio;

import java.io.Closeable;
import java.io.IOException;
import y4.l;

public interface o0 extends Closeable {
    @Override
    void close() throws IOException;

    long read(@l okio.l arg1, long arg2) throws IOException;

    @l
    q0 timeout();
}

