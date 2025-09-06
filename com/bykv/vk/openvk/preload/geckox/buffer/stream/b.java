package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

public abstract class b extends OutputStream {
    public abstract void write(long arg1, int arg2) throws IOException;

    public abstract void write(long arg1, byte[] arg2) throws IOException;

    public abstract void write(long arg1, byte[] arg2, int arg3, int arg4) throws IOException;
}

