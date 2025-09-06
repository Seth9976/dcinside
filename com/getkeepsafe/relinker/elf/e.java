package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class e extends b {
    private final f m;

    public e(boolean z, f f0) throws IOException {
        this.a = z;
        this.m = f0;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order((z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
        this.b = f0.i(byteBuffer0, 16L);
        this.c = f0.j(byteBuffer0, 0x20L);
        this.d = f0.j(byteBuffer0, 40L);
        this.e = f0.i(byteBuffer0, 54L);
        this.f = f0.i(byteBuffer0, 56L);
        this.g = f0.i(byteBuffer0, 58L);
        this.h = f0.i(byteBuffer0, 60L);
        this.i = f0.i(byteBuffer0, 62L);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public a a(long v, int v1) throws IOException {
        return new com.getkeepsafe.relinker.elf.b(this.m, this, v, v1);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public c b(long v) throws IOException {
        return new h(this.m, this, v);
    }

    @Override  // com.getkeepsafe.relinker.elf.c$b
    public d c(int v) throws IOException {
        return new j(this.m, this, v);
    }
}

