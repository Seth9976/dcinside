package com.facebook.soloader;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public interface j extends ByteChannel {
    long position() throws IOException;

    j position(long arg1) throws IOException;

    @Override
    int read(ByteBuffer arg1) throws IOException;

    long size() throws IOException;

    j truncate(long arg1) throws IOException;

    @Override
    int write(ByteBuffer arg1) throws IOException;

    int y(ByteBuffer arg1, long arg2) throws IOException;
}

