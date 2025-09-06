package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public abstract class o implements Serializable {
    public abstract OutputStream a(g arg1, OutputStream arg2) throws IOException;

    public abstract Writer b(g arg1, Writer arg2) throws IOException;
}

