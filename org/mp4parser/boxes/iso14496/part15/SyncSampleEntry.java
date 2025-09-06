package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.boxes.samplegrouping.GroupEntry;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SyncSampleEntry extends GroupEntry {
    public static final String TYPE = "sync";
    int nalUnitType;
    int reserved;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.nalUnitType == ((SyncSampleEntry)object0).nalUnitType ? this.reserved == ((SyncSampleEntry)object0).reserved : false;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.nalUnitType + (this.reserved << 6));
        return (ByteBuffer)byteBuffer0.rewind();
    }

    public int getNalUnitType() {
        return this.nalUnitType;
    }

    public int getReserved() {
        return this.reserved;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "sync";
    }

    @Override
    public int hashCode() {
        return this.reserved * 0x1F + this.nalUnitType;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved = (v & 0xC0) >> 6;
        this.nalUnitType = v & 0x3F;
    }

    public void setNalUnitType(int v) {
        this.nalUnitType = v;
    }

    public void setReserved(int v) {
        this.reserved = v;
    }

    @Override
    public String toString() {
        return "SyncSampleEntry{reserved=" + this.reserved + ", nalUnitType=" + this.nalUnitType + '}';
    }
}

