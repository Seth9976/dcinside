package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

public abstract class h implements Serializable {
    private static final long a = 1L;

    public DataInput a(g g0, DataInput dataInput0) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream b(g arg1, InputStream arg2) throws IOException;

    public abstract InputStream c(g arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    public abstract Reader d(g arg1, Reader arg2) throws IOException;
}

