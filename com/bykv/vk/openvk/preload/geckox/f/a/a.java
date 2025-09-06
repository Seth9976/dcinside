package com.bykv.vk.openvk.preload.geckox.f.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public abstract class a {
    private File a;

    public a(File file0) {
        this.a = file0;
    }

    protected abstract InputStream a(File arg1, String arg2) throws IOException;

    public final InputStream a(String s) throws IOException {
        return this.a(this.a, s);
    }

    protected abstract boolean b(File arg1, String arg2) throws IOException;

    public final boolean b(String s) throws IOException {
        return this.b(this.a, s);
    }
}

