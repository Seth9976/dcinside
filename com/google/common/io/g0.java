package com.google.common.io;

import java.nio.file.attribute.FileAttribute;

public final class g0 implements b {
    public final FileAttribute a;

    public g0(FileAttribute fileAttribute0) {
        this.a = fileAttribute0;
    }

    @Override  // com.google.common.io.I$c$b
    public final FileAttribute get() {
        return c.g(this.a);
    }
}

