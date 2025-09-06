package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class RateShareEntry extends GroupEntry {
    public static class Entry {
        int availableBitrate;
        short targetRateShare;

        public Entry(int v, short v1) {
            this.availableBitrate = v;
            this.targetRateShare = v1;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.availableBitrate == ((Entry)object0).availableBitrate ? this.targetRateShare == ((Entry)object0).targetRateShare : false;
        }

        public int getAvailableBitrate() {
            return this.availableBitrate;
        }

        public short getTargetRateShare() {
            return this.targetRateShare;
        }

        @Override
        public int hashCode() {
            return this.availableBitrate * 0x1F + this.targetRateShare;
        }

        public void setAvailableBitrate(int v) {
            this.availableBitrate = v;
        }

        public void setTargetRateShare(short v) {
            this.targetRateShare = v;
        }

        @Override
        public String toString() {
            return "{availableBitrate=" + this.availableBitrate + ", targetRateShare=" + ((int)this.targetRateShare) + '}';
        }
    }

    public static final String TYPE = "rash";
    private short discardPriority;
    private List entries;
    private int maximumBitrate;
    private int minimumBitrate;
    private short operationPointCut;
    private short targetRateShare;

    public RateShareEntry() {
        this.entries = new LinkedList();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.discardPriority != ((RateShareEntry)object0).discardPriority) {
            return false;
        }
        if(this.maximumBitrate != ((RateShareEntry)object0).maximumBitrate) {
            return false;
        }
        if(this.minimumBitrate != ((RateShareEntry)object0).minimumBitrate) {
            return false;
        }
        if(this.operationPointCut != ((RateShareEntry)object0).operationPointCut) {
            return false;
        }
        if(this.targetRateShare != ((RateShareEntry)object0).targetRateShare) {
            return false;
        }
        List list0 = this.entries;
        List list1 = ((RateShareEntry)object0).entries;
        return list0 == null ? list1 == null : list0.equals(list1);
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate((this.operationPointCut == 1 ? 13 : this.operationPointCut * 6 + 11));
        byteBuffer0.putShort(this.operationPointCut);
        if(this.operationPointCut == 1) {
            byteBuffer0.putShort(this.targetRateShare);
        }
        else {
            for(Object object0: this.entries) {
                byteBuffer0.putInt(((Entry)object0).getAvailableBitrate());
                byteBuffer0.putShort(((Entry)object0).getTargetRateShare());
            }
        }
        byteBuffer0.putInt(this.maximumBitrate);
        byteBuffer0.putInt(this.minimumBitrate);
        IsoTypeWriter.writeUInt8(byteBuffer0, ((int)this.discardPriority));
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    public short getDiscardPriority() {
        return this.discardPriority;
    }

    public List getEntries() {
        return this.entries;
    }

    public int getMaximumBitrate() {
        return this.maximumBitrate;
    }

    public int getMinimumBitrate() {
        return this.minimumBitrate;
    }

    public short getOperationPointCut() {
        return this.operationPointCut;
    }

    public short getTargetRateShare() {
        return this.targetRateShare;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "rash";
    }

    @Override
    public int hashCode() {
        int v = (this.operationPointCut * 0x1F + this.targetRateShare) * 0x1F;
        return this.entries == null ? ((v * 0x1F + this.maximumBitrate) * 0x1F + this.minimumBitrate) * 0x1F + this.discardPriority : (((v + this.entries.hashCode()) * 0x1F + this.maximumBitrate) * 0x1F + this.minimumBitrate) * 0x1F + this.discardPriority;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        short v = byteBuffer0.getShort();
        this.operationPointCut = v;
        if(v == 1) {
            this.targetRateShare = byteBuffer0.getShort();
        }
        else {
            while(v > 0) {
                this.entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0)), byteBuffer0.getShort()));
                --v;
            }
        }
        this.maximumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.minimumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.discardPriority = (short)IsoTypeReader.readUInt8(byteBuffer0);
    }

    public void setDiscardPriority(short v) {
        this.discardPriority = v;
    }

    public void setEntries(List list0) {
        this.entries = list0;
    }

    public void setMaximumBitrate(int v) {
        this.maximumBitrate = v;
    }

    public void setMinimumBitrate(int v) {
        this.minimumBitrate = v;
    }

    public void setOperationPointCut(short v) {
        this.operationPointCut = v;
    }

    public void setTargetRateShare(short v) {
        this.targetRateShare = v;
    }
}

