package pl.droidsonroids.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g extends c {
    public g(f f0, b c$b0, long v) throws IOException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        long v1 = c$b0.c + v * ((long)c$b0.e);
        this.a = f0.n(byteBuffer0, v1);
        this.b = f0.n(byteBuffer0, v1 + 4L);
        this.c = f0.n(byteBuffer0, v1 + 8L);
        this.d = f0.n(byteBuffer0, v1 + 20L);
    }
}

