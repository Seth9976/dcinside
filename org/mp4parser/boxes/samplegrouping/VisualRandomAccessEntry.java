package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;

public class VisualRandomAccessEntry extends GroupEntry {
    public static final String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.numLeadingSamples == ((VisualRandomAccessEntry)object0).numLeadingSamples ? this.numLeadingSamplesKnown == ((VisualRandomAccessEntry)object0).numLeadingSamplesKnown : false;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
        byteBuffer0.put(((byte)((this.numLeadingSamplesKnown ? 0x80 : 0) | this.numLeadingSamples & 0x7F)));
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    public short getNumLeadingSamples() {
        return this.numLeadingSamples;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "rap ";
    }

    @Override
    public int hashCode() {
        return this.numLeadingSamplesKnown * 0x1F + this.numLeadingSamples;
    }

    public boolean isNumLeadingSamplesKnown() {
        return this.numLeadingSamplesKnown;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.get();
        this.numLeadingSamplesKnown = (v & 0x80) == 0x80;
        this.numLeadingSamples = (short)(v & 0x7F);
    }

    public void setNumLeadingSamples(short v) {
        this.numLeadingSamples = v;
    }

    public void setNumLeadingSamplesKnown(boolean z) {
        this.numLeadingSamplesKnown = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.numLeadingSamplesKnown + ", numLeadingSamples=" + ((int)this.numLeadingSamples) + '}';
    }
}

