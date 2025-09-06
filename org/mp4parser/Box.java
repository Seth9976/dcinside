package org.mp4parser;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface Box {
    void getBox(WritableByteChannel arg1) throws IOException;

    long getSize();

    String getType();
}

