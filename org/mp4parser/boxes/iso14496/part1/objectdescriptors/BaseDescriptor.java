package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.mp4parser.tools.IsoTypeReader;

@Descriptor(tags = {0})
public abstract class BaseDescriptor {
    static final boolean $assertionsDisabled;
    int sizeBytes;
    int sizeOfInstance;
    int tag;

    static {
    }

    abstract int getContentSize();

    public int getSize() {
        return this.getContentSize() + this.getSizeSize() + 1;
    }

    public int getSizeSize() {
        int v = this.getContentSize();
        int v1;
        for(v1 = 0; v > 0 || v1 < this.sizeBytes; ++v1) {
            v >>>= 7;
        }
        return v1;
    }

    public int getTag() {
        return this.tag;
    }

    public final void parse(int v, ByteBuffer byteBuffer0) throws IOException {
        this.tag = v;
        int v1 = IsoTypeReader.readUInt8(byteBuffer0);
        this.sizeOfInstance = v1 & 0x7F;
        int v2 = 1;
        while(v1 >>> 7 == 1) {
            v1 = IsoTypeReader.readUInt8(byteBuffer0);
            ++v2;
            this.sizeOfInstance = this.sizeOfInstance << 7 | v1 & 0x7F;
        }
        this.sizeBytes = v2;
        ByteBuffer byteBuffer1 = byteBuffer0.slice();
        byteBuffer1.limit(this.sizeOfInstance);
        this.parseDetail(byteBuffer1);
        byteBuffer0.position(byteBuffer0.position() + this.sizeOfInstance);
    }

    public abstract void parseDetail(ByteBuffer arg1) throws IOException;

    public abstract ByteBuffer serialize();

    // 去混淆评级： 低(20)
    @Override
    public String toString() [...] // 潜在的解密器

    public void writeSize(ByteBuffer byteBuffer0, int v) {
        int v1 = byteBuffer0.position();
        int v2 = 0;
        while(v > 0 || v2 < this.sizeBytes) {
            ++v2;
            if(v > 0) {
                byteBuffer0.put(this.getSizeSize() + v1 - v2, ((byte)(v & 0x7F)));
            }
            else {
                byteBuffer0.put(this.getSizeSize() + v1 - v2, (byte)0x80);
            }
            v >>>= 7;
        }
        byteBuffer0.position(v1 + this.getSizeSize());
    }
}

