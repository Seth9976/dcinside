package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.boxes.samplegrouping.GroupEntry;

public class TemporalSubLayerSampleGroup extends GroupEntry {
    public static final String TYPE = "tsas";
    int i;

    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass();
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        return ByteBuffer.allocate(0);
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "tsas";
    }

    @Override
    public int hashCode() {
        return 41;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
    }
}

