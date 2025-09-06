package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a extends com.getkeepsafe.relinker.elf.c.a {
    public a(f f0, b c$b0, long v, int v1) throws IOException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.order((c$b0.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        long v2 = v + ((long)(v1 * 8));
        this.a = f0.n(byteBuffer0, v2);
        this.b = f0.n(byteBuffer0, v2 + 4L);
    }
}

