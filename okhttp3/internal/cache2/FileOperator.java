package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.L;
import y4.l;

public final class FileOperator {
    @l
    private final FileChannel fileChannel;

    public FileOperator(@l FileChannel fileChannel0) {
        L.p(fileChannel0, "fileChannel");
        super();
        this.fileChannel = fileChannel0;
    }

    public final void read(long v, @l okio.l l0, long v1) {
        L.p(l0, "sink");
        if(v1 < 0L) {
            throw new IndexOutOfBoundsException();
        }
        while(v1 > 0L) {
            long v2 = this.fileChannel.transferTo(v, v1, l0);
            v += v2;
            v1 -= v2;
        }
    }

    public final void write(long v, @l okio.l l0, long v1) throws IOException {
        L.p(l0, "source");
        if(v1 < 0L || v1 > l0.size()) {
            throw new IndexOutOfBoundsException();
        }
        long v2 = v;
        for(long v3 = v1; v3 > 0L; v3 -= v4) {
            long v4 = this.fileChannel.transferFrom(l0, v2, v3);
            v2 += v4;
        }
    }
}

