package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import okio.l.a;
import okio.o;
import okio.r;
import y4.l;

public final class MessageDeflater implements Closeable {
    @l
    private final okio.l deflatedBytes;
    @l
    private final Deflater deflater;
    @l
    private final r deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        okio.l l0 = new okio.l();
        this.deflatedBytes = l0;
        Deflater deflater0 = new Deflater(-1, true);
        this.deflater = deflater0;
        this.deflaterSink = new r(l0, deflater0);
    }

    @Override
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@l okio.l l0) throws IOException {
        L.p(l0, "buffer");
        if(this.deflatedBytes.size() != 0L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(l0, l0.size());
        this.deflaterSink.flush();
        if(this.endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long v = this.deflatedBytes.size();
            a l$a0 = okio.l.l0(this.deflatedBytes, null, 1, null);
            try {
                l$a0.e(v - 4L);
            }
            catch(Throwable throwable0) {
                c.a(l$a0, throwable0);
                throw throwable0;
            }
            c.a(l$a0, null);
        }
        else {
            this.deflatedBytes.e2(0);
        }
        l0.write(this.deflatedBytes, this.deflatedBytes.size());
    }

    private final boolean endsWith(okio.l l0, o o0) {
        return l0.a0(l0.size() - ((long)o0.h0()), o0);
    }
}

