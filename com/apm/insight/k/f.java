package com.apm.insight.k;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class f extends DataOutputStream {
    public f(OutputStream outputStream0) {
        super(outputStream0);
    }

    public final void a() throws IOException {
        super.close();
    }

    @Override
    public final void close() throws IOException {
    }
}

