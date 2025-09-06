package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import y4.l;

public interface m0 extends Closeable, Flushable {
    @Override
    void close() throws IOException;

    @Override
    void flush() throws IOException;

    @l
    q0 timeout();

    void write(@l okio.l arg1, long arg2) throws IOException;
}

