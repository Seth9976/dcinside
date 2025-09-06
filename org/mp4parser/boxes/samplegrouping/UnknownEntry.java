package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import org.mp4parser.tools.Hex;

public class UnknownEntry extends GroupEntry {
    private ByteBuffer content;
    private String type;

    public UnknownEntry(String s) {
        this.type = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            ByteBuffer byteBuffer0 = this.content;
            ByteBuffer byteBuffer1 = ((UnknownEntry)object0).content;
            return byteBuffer0 == null ? byteBuffer1 == null : byteBuffer0.equals(byteBuffer1);
        }
        return false;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        return this.content.duplicate();
    }

    public ByteBuffer getContent() {
        return this.content;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.content == null ? 0 : this.content.hashCode();
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        this.content = (ByteBuffer)byteBuffer0.duplicate().rewind();
    }

    public void setContent(ByteBuffer byteBuffer0) {
        this.content = (ByteBuffer)byteBuffer0.duplicate().rewind();
    }

    @Override
    public String toString() {
        ByteBuffer byteBuffer0 = this.content.duplicate();
        byteBuffer0.rewind();
        byte[] arr_b = new byte[byteBuffer0.limit()];
        byteBuffer0.get(arr_b);
        return "UnknownEntry{content=" + Hex.encodeHex(arr_b) + '}';
    }
}

