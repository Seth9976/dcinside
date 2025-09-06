package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.mp4parser.tools.Hex;

@Descriptor(tags = {19})
public class ExtensionProfileLevelDescriptor extends BaseDescriptor {
    byte[] bytes;

    public ExtensionProfileLevelDescriptor() {
        this.tag = 19;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        throw new RuntimeException("Not Implemented");
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        if(this.getSize() > 0) {
            byte[] arr_b = new byte[this.getSize()];
            this.bytes = arr_b;
            byteBuffer0.get(arr_b);
        }
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        throw new RuntimeException("Not Implemented");
    }

    // 去混淆评级： 低(30)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "ExtensionDescriptor{bytes=" + (this.bytes == null ? "null" : Hex.encodeHex(this.bytes)) + '}';
    }
}

