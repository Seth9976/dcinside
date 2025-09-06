package org.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class SkipBox implements ParsableBox {
    private long size;
    private long sourcePosition;
    private String type;

    public SkipBox(String s, byte[] arr_b, String s1) {
        this.sourcePosition = -1L;
        this.type = s;
    }

    @Override  // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        throw new RuntimeException("Cannot retrieve a skipped box - type " + this.type);
    }

    public long getContentSize() {
        return this.size - 8L;
    }

    @Override  // org.mp4parser.Box
    public long getSize() {
        return this.size;
    }

    public long getSourcePosition() {
        return this.sourcePosition;
    }

    @Override  // org.mp4parser.Box
    public String getType() {
        return this.type;
    }

    @Override  // org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        this.size = v + 8L;
        if(!(readableByteChannel0 instanceof FileChannel)) {
            throw new RuntimeException("Cannot skip box " + this.type + " if data source is not seekable");
        }
        long v1 = ((FileChannel)readableByteChannel0).position();
        this.sourcePosition = v1;
        ((FileChannel)readableByteChannel0).position(v1 + v);
    }
}

