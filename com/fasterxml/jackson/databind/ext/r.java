package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.ser.std.L;
import java.io.IOException;
import java.nio.file.Path;

public class r extends L {
    private static final long d = 1L;

    public r() {
        super(Path.class);
    }

    public void P(Path path0, k k0, I i0) throws IOException {
        k0.d(path0.toUri().toString());
    }

    public void Q(Path path0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.h(path0, Path.class, com.fasterxml.jackson.core.r.q));
        this.P(path0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.P(((Path)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.Q(((Path)object0), k0, i0, j0);
    }
}

