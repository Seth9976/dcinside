package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;

public class TemporalLevelEntry extends GroupEntry {
    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.levelIndependentlyDecodable == ((TemporalLevelEntry)object0).levelIndependentlyDecodable ? this.reserved == ((TemporalLevelEntry)object0).reserved : false;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
        byteBuffer0.put(((byte)(this.levelIndependentlyDecodable ? 0x80 : 0)));
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "tele";
    }

    @Override
    public int hashCode() {
        return this.levelIndependentlyDecodable * 0x1F + this.reserved;
    }

    public boolean isLevelIndependentlyDecodable() {
        return this.levelIndependentlyDecodable;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        this.levelIndependentlyDecodable = (byteBuffer0.get() & 0x80) == 0x80;
    }

    public void setLevelIndependentlyDecodable(boolean z) {
        this.levelIndependentlyDecodable = z;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.levelIndependentlyDecodable + '}';
    }
}

