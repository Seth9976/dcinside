package pl.droidsonroids.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class i extends d {
    public i(f f0, b c$b0, int v) throws IOException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        this.a = f0.n(byteBuffer0, c$b0.d + ((long)(v * c$b0.g)) + 28L);
    }
}

