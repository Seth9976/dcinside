package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.slf4j.a;
import org.slf4j.b;

public class UnknownDescriptor extends BaseDescriptor {
    private static a LOG;
    private ByteBuffer data;

    static {
        UnknownDescriptor.LOG = b.i(UnknownDescriptor.class);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.data = byteBuffer0.slice();
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        throw new RuntimeException("sdjlhfl");
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "UnknownDescriptor{tag=" + this.tag + ", sizeOfInstance=" + this.sizeOfInstance + ", data=" + this.data + '}';
    }
}

