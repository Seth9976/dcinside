package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

@Descriptor(tags = {6})
public class SLConfigDescriptor extends BaseDescriptor {
    int predefined;

    public SLConfigDescriptor() {
        this.tag = 6;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.predefined == ((SLConfigDescriptor)object0).predefined;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() [...] // Inlined contents

    public int getPredefined() {
        return this.predefined;
    }

    @Override
    public int hashCode() {
        return this.predefined;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.predefined = IsoTypeReader.readUInt8(byteBuffer0);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.getSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, 6);
        this.writeSize(byteBuffer0, 1);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.predefined);
        return byteBuffer0;
    }

    public void setPredefined(int v) {
        this.predefined = v;
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.predefined + '}';
    }
}

