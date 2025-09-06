package org.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class RewindableReadableByteChannel implements ReadableByteChannel {
    private final ByteBuffer buffer;
    private int nextBufferReadPosition;
    private int nextBufferWritePosition;
    private boolean passedRewindPoint;
    private final ReadableByteChannel readableByteChannel;

    public RewindableReadableByteChannel(ReadableByteChannel readableByteChannel0, int v) {
        this.buffer = ByteBuffer.allocate(v);
        this.readableByteChannel = readableByteChannel0;
    }

    @Override
    public void close() throws IOException {
        this.readableByteChannel.close();
    }

    @Override
    public boolean isOpen() {
        return this.readableByteChannel.isOpen();
    }

    @Override
    public int read(ByteBuffer byteBuffer0) throws IOException {
        int v = byteBuffer0.position();
        this.buffer.limit(this.buffer.capacity());
        this.buffer.position(this.nextBufferWritePosition);
        if(this.buffer.capacity() > 0) {
            this.readableByteChannel.read(this.buffer);
            this.nextBufferWritePosition = this.buffer.position();
        }
        this.buffer.position(this.nextBufferReadPosition);
        this.buffer.limit(this.nextBufferWritePosition);
        if(this.buffer.remaining() > byteBuffer0.remaining()) {
            this.buffer.limit(this.buffer.position() + byteBuffer0.remaining());
        }
        byteBuffer0.put(this.buffer);
        this.nextBufferReadPosition = this.buffer.position();
        int v1 = this.readableByteChannel.read(byteBuffer0);
        if(v1 > 0) {
            this.passedRewindPoint = true;
            return byteBuffer0.position() - v;
        }
        return v1 != -1 || byteBuffer0.position() - v != 0 ? byteBuffer0.position() - v : -1;
    }

    public void rewind() {
        if(this.passedRewindPoint) {
            throw new IllegalStateException("Passed the rewind point. Increase the buffer capacity.");
        }
        this.nextBufferReadPosition = 0;
    }
}

