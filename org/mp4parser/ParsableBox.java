package org.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public interface ParsableBox extends Box {
    void parse(ReadableByteChannel arg1, ByteBuffer arg2, long arg3, BoxParser arg4) throws IOException;
}

