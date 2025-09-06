package com.apm.insight.k;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class k extends GZIPOutputStream {
    public k(OutputStream outputStream0) throws IOException {
        super(outputStream0);
    }

    public final void a() throws IOException {
        super.close();
    }

    public final void b() throws IOException {
        super.finish();
    }

    @Override
    public final void close() throws IOException {
    }

    @Override
    public final void finish() throws IOException {
    }
}

