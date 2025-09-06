package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.nio.ByteBuffer;

public class BitWriterBuffer {
    static final boolean $assertionsDisabled;
    private ByteBuffer buffer;
    int initialPos;
    int position;

    static {
    }

    public BitWriterBuffer(ByteBuffer byteBuffer0) {
        this.position = 0;
        this.buffer = byteBuffer0;
        this.initialPos = byteBuffer0.position();
    }

    public void writeBits(int v, int v1) {
        int v2 = this.position;
        int v3 = 8 - v2 % 8;
        int v4 = 1;
        if(v1 <= v3) {
            int v5 = this.buffer.get(this.initialPos + v2 / 8);
            if(v5 < 0) {
                v5 += 0x100;
            }
            int v6 = v5 + (v << v3 - v1);
            ByteBuffer byteBuffer0 = this.buffer;
            int v7 = this.initialPos + this.position / 8;
            if(v6 > 0x7F) {
                v6 -= 0x100;
            }
            byteBuffer0.put(v7, ((byte)v6));
            this.position += v1;
        }
        else {
            int v8 = v1 - v3;
            this.writeBits(v >> v8, v3);
            this.writeBits(v & (1 << v8) - 1, v8);
        }
        ByteBuffer byteBuffer1 = this.buffer;
        int v9 = this.initialPos + this.position / 8;
        if(this.position % 8 <= 0) {
            v4 = 0;
        }
        byteBuffer1.position(v9 + v4);
    }

    public void writeBool(boolean z) {
        this.writeBits(((int)z), 1);
    }
}

