package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class d extends b {
    private final f m;

    public d(boolean z, f f0) throws IOException {
        this.a = z;
        this.m = f0;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.order((z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        this.b = f0.i(byteBuffer0, 16L);
        this.c = f0.n(byteBuffer0, 28L);
        this.d = f0.n(byteBuffer0, 0x20L);
        this.e = f0.i(byteBuffer0, 42L);
        this.f = f0.i(byteBuffer0, 44L);
        this.g = f0.i(byteBuffer0, 46L);
        this.h = f0.i(byteBuffer0, 0x30L);
        this.i = f0.i(byteBuffer0, 50L);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public a a(long v, int v1) throws IOException {
        return new com.getkeepsafe.relinker.elf.a(this.m, this, v, v1);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public c b(long v) throws IOException {
        return new g(this.m, this, v);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public com.getkeepsafe.relinker.elf.c.d c(int v) throws IOException {
        return new i(this.m, this, v);
    }
}

