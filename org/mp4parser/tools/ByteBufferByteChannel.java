package org.mp4parser.tools;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class ByteBufferByteChannel implements ByteChannel {
    ByteBuffer byteBuffer;

    public ByteBufferByteChannel(ByteBuffer byteBuffer0) {
        this.byteBuffer = byteBuffer0;
    }

    public ByteBufferByteChannel(byte[] arr_b) {
        this(ByteBuffer.wrap(arr_b));
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public int read(ByteBuffer byteBuffer0) throws IOException {
        int v = byteBuffer0.remaining();
        if(this.byteBuffer.remaining() <= 0) {
            return -1;
        }
        byteBuffer0.put(((ByteBuffer)this.byteBuffer.duplicate().limit(this.byteBuffer.position() + byteBuffer0.remaining())));
        this.byteBuffer.position(this.byteBuffer.position() + v);
        return v;
    }

    @Override
    public int write(ByteBuffer byteBuffer0) throws IOException {
        this.byteBuffer.put(byteBuffer0);
        return byteBuffer0.remaining();
    }
}

