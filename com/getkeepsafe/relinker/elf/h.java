package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class h extends c {
    public h(f f0, b c$b0, long v) throws IOException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        long v1 = c$b0.c + v * ((long)c$b0.e);
        this.a = f0.n(byteBuffer0, v1);
        this.b = f0.j(byteBuffer0, v1 + 8L);
        this.c = f0.j(byteBuffer0, v1 + 16L);
        this.d = f0.j(byteBuffer0, v1 + 40L);
    }
}

