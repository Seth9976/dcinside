package com.google.common.io;

import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

public final class h0 implements b {
    public final IOException a;

    public h0(IOException iOException0) {
        this.a = iOException0;
    }

    @Override  // com.google.common.io.I$c$b
    public final FileAttribute get() {
        return c.p(this.a);
    }
}

