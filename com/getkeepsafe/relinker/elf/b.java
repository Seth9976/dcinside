package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class b extends a {
    public b(f f0, com.getkeepsafe.relinker.elf.c.b c$b0, long v, int v1) throws IOException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        long v2 = v + ((long)(v1 * 16));
        this.a = f0.j(byteBuffer0, v2);
        this.b = f0.j(byteBuffer0, v2 + 8L);
    }
}

