package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.nio.ByteBuffer;

public class BitReaderBuffer {
    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(ByteBuffer byteBuffer0) {
        this.buffer = byteBuffer0;
        this.initialPos = byteBuffer0.position();
    }

    public int byteSync() {
        int v = 8 - this.position % 8 == 8 ? 0 : 8 - this.position % 8;
        this.readBits(v);
        return v;
    }

    public int getPosition() {
        return this.position;
    }

    public int readBits(int v) {
        int v4;
        int v1 = this.buffer.get(this.initialPos + this.position / 8);
        if(v1 < 0) {
            v1 += 0x100;
        }
        int v2 = this.position;
        int v3 = 8 - v2 % 8;
        if(v <= v3) {
            v4 = (v1 << v2 % 8 & 0xFF) >> v2 % 8 + (v3 - v);
            this.position = v2 + v;
        }
        else {
            v4 = (this.readBits(v3) << v - v3) + this.readBits(v - v3);
        }
        this.buffer.position(this.initialPos + ((int)Math.ceil(((double)this.position) / 8.0)));
        return v4;
    }

    public boolean readBool() {
        return this.readBits(1) == 1;
    }

    public int remainingBits() {
        return this.buffer.limit() * 8 - this.position;
    }
}

