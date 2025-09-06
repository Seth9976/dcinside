package org.mp4parser;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

public interface BoxParser {
    ParsableBox parseBox(ReadableByteChannel arg1, String arg2) throws IOException;
}

