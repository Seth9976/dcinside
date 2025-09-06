package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;

@Descriptor(tags = {5})
public class DecoderSpecificInfo extends BaseDescriptor {
    byte[] bytes;

    public DecoderSpecificInfo() {
        this.tag = 5;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Arrays.equals(this.bytes, ((DecoderSpecificInfo)object0).bytes);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return this.bytes.length;
    }

    @Override
    public int hashCode() {
        return this.bytes == null ? 0 : Arrays.hashCode(this.bytes);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        this.bytes = arr_b;
        byteBuffer0.get(arr_b);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.getSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tag);
        this.writeSize(byteBuffer0, this.getContentSize());
        byteBuffer0.put(this.bytes);
        return (ByteBuffer)byteBuffer0.rewind();
    }

    public void setData(byte[] arr_b) {
        this.bytes = arr_b;
    }

    // 去混淆评级： 低(30)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "DecoderSpecificInfo{bytes=" + (this.bytes == null ? "null" : Hex.encodeHex(this.bytes)) + '}';
    }
}

