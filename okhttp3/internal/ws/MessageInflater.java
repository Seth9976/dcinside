package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.L;
import okio.E;
import y4.l;

public final class MessageInflater implements Closeable {
    @l
    private final okio.l deflatedBytes;
    @l
    private final Inflater inflater;
    @l
    private final E inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        okio.l l0 = new okio.l();
        this.deflatedBytes = l0;
        Inflater inflater0 = new Inflater(true);
        this.inflater = inflater0;
        this.inflaterSource = new E(l0, inflater0);
    }

    @Override
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(@l okio.l l0) throws IOException {
        L.p(l0, "buffer");
        if(this.deflatedBytes.size() != 0L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.K2(l0);
        this.deflatedBytes.j2(0xFFFF);
        long v = this.inflater.getBytesRead();
        long v1 = this.deflatedBytes.size();
        do {
            this.inflaterSource.a(l0, 0x7FFFFFFFFFFFFFFFL);
        }
        while(this.inflater.getBytesRead() < v + v1);
    }
}

