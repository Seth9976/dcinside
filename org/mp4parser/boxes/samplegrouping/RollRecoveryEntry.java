package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;

public class RollRecoveryEntry extends GroupEntry {
    public static final String TYPE = "roll";
    private short rollDistance;

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.rollDistance == ((RollRecoveryEntry)object0).rollDistance;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
        byteBuffer0.putShort(this.rollDistance);
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    public short getRollDistance() {
        return this.rollDistance;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "roll";
    }

    @Override
    public int hashCode() {
        return this.rollDistance;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        this.rollDistance = byteBuffer0.getShort();
    }

    public void setRollDistance(short v) {
        this.rollDistance = v;
    }
}

