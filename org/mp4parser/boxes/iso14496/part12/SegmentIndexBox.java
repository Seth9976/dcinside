package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SegmentIndexBox extends AbstractFullBox {
    public static class Entry {
        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;

        public Entry() {
        }

        public Entry(int v, int v1, long v2, boolean z, int v3, int v4) {
            this.referenceType = (byte)v;
            this.referencedSize = v1;
            this.subsegmentDuration = v2;
            this.startsWithSap = (byte)z;
            this.sapType = (byte)v3;
            this.sapDeltaTime = v4;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.referenceType != ((Entry)object0).referenceType) {
                return false;
            }
            if(this.referencedSize != ((Entry)object0).referencedSize) {
                return false;
            }
            if(this.sapDeltaTime != ((Entry)object0).sapDeltaTime) {
                return false;
            }
            if(this.sapType != ((Entry)object0).sapType) {
                return false;
            }
            return this.startsWithSap == ((Entry)object0).startsWithSap ? this.subsegmentDuration == ((Entry)object0).subsegmentDuration : false;
        }

        public byte getReferenceType() {
            return this.referenceType;
        }

        public int getReferencedSize() {
            return this.referencedSize;
        }

        public int getSapDeltaTime() {
            return this.sapDeltaTime;
        }

        public byte getSapType() {
            return this.sapType;
        }

        public byte getStartsWithSap() {
            return this.startsWithSap;
        }

        public long getSubsegmentDuration() {
            return this.subsegmentDuration;
        }

        @Override
        public int hashCode() {
            return ((((this.referenceType * 0x1F + this.referencedSize) * 0x1F + ((int)(this.subsegmentDuration ^ this.subsegmentDuration >>> 0x20))) * 0x1F + this.startsWithSap) * 0x1F + this.sapType) * 0x1F + this.sapDeltaTime;
        }

        public void setReferenceType(byte b) {
            this.referenceType = b;
        }

        public void setReferencedSize(int v) {
            this.referencedSize = v;
        }

        public void setSapDeltaTime(int v) {
            this.sapDeltaTime = v;
        }

        public void setSapType(byte b) {
            this.sapType = b;
        }

        public void setStartsWithSap(byte b) {
            this.startsWithSap = b;
        }

        public void setSubsegmentDuration(long v) {
            this.subsegmentDuration = v;
        }

        @Override
        public String toString() {
            return "Entry{referenceType=" + ((int)this.referenceType) + ", referencedSize=" + this.referencedSize + ", subsegmentDuration=" + this.subsegmentDuration + ", startsWithSap=" + ((int)this.startsWithSap) + ", sapType=" + ((int)this.sapType) + ", sapDeltaTime=" + this.sapDeltaTime + '}';
        }
    }

    public static final String TYPE = "sidx";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    long earliestPresentationTime;
    List entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    static {
        SegmentIndexBox.ajc$preClinit();
    }

    public SegmentIndexBox() {
        super("sidx");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.referenceId = IsoTypeReader.readUInt32(byteBuffer0);
        this.timeScale = IsoTypeReader.readUInt32(byteBuffer0);
        if(this.getVersion() == 0) {
            this.earliestPresentationTime = IsoTypeReader.readUInt32(byteBuffer0);
            this.firstOffset = IsoTypeReader.readUInt32(byteBuffer0);
        }
        else {
            this.earliestPresentationTime = IsoTypeReader.readUInt64(byteBuffer0);
            this.firstOffset = IsoTypeReader.readUInt64(byteBuffer0);
        }
        this.reserved = IsoTypeReader.readUInt16(byteBuffer0);
        int v = IsoTypeReader.readUInt16(byteBuffer0);
        for(int v1 = 0; v1 < v; ++v1) {
            BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
            Entry segmentIndexBox$Entry0 = new Entry();
            segmentIndexBox$Entry0.setReferenceType(((byte)bitReaderBuffer0.readBits(1)));
            segmentIndexBox$Entry0.setReferencedSize(bitReaderBuffer0.readBits(0x1F));
            segmentIndexBox$Entry0.setSubsegmentDuration(IsoTypeReader.readUInt32(byteBuffer0));
            BitReaderBuffer bitReaderBuffer1 = new BitReaderBuffer(byteBuffer0);
            segmentIndexBox$Entry0.setStartsWithSap(((byte)bitReaderBuffer1.readBits(1)));
            segmentIndexBox$Entry0.setSapType(((byte)bitReaderBuffer1.readBits(3)));
            segmentIndexBox$Entry0.setSapDeltaTime(bitReaderBuffer1.readBits(28));
            this.entries.add(segmentIndexBox$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SegmentIndexBox.java", SegmentIndexBox.class);
        SegmentIndexBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "java.util.List"), 0x80);
        SegmentIndexBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "java.util.List", "entries", "", "void"), 0x84);
        SegmentIndexBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "int"), 0xA8);
        SegmentIndexBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "int", "reserved", "", "void"), 0xAC);
        SegmentIndexBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "java.lang.String"), 0xB1);
        SegmentIndexBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReferenceId", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"), 0x88);
        SegmentIndexBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReferenceId", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        SegmentIndexBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTimeScale", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"), 0x90);
        SegmentIndexBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTimeScale", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "timeScale", "", "void"), 0x94);
        SegmentIndexBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEarliestPresentationTime", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"), 0x98);
        SegmentIndexBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEarliestPresentationTime", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 0x9C);
        SegmentIndexBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFirstOffset", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"), 0xA0);
        SegmentIndexBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFirstOffset", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "firstOffset", "", "void"), 0xA4);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.referenceId);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.timeScale);
        if(this.getVersion() == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.firstOffset);
        }
        else {
            IsoTypeWriter.writeUInt64(byteBuffer0, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt64(byteBuffer0, this.firstOffset);
        }
        IsoTypeWriter.writeUInt16(byteBuffer0, this.reserved);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.entries.size());
        for(Object object0: this.entries) {
            BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
            bitWriterBuffer0.writeBits(((Entry)object0).getReferenceType(), 1);
            bitWriterBuffer0.writeBits(((Entry)object0).getReferencedSize(), 0x1F);
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getSubsegmentDuration());
            BitWriterBuffer bitWriterBuffer1 = new BitWriterBuffer(byteBuffer0);
            bitWriterBuffer1.writeBits(((Entry)object0).getStartsWithSap(), 1);
            bitWriterBuffer1.writeBits(((Entry)object0).getSapType(), 3);
            bitWriterBuffer1.writeBits(((Entry)object0).getSapDeltaTime(), 28);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 0 ? 24L + ((long)(this.entries.size() * 12)) : 0x20L + ((long)(this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.earliestPresentationTime;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public long getFirstOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.firstOffset;
    }

    public long getReferenceId() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.referenceId;
    }

    public int getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public long getTimeScale() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.earliestPresentationTime = v;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    public void setFirstOffset(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_9, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.firstOffset = v;
    }

    public void setReferenceId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.referenceId = v;
    }

    public void setReserved(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved = v;
    }

    public void setTimeScale(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.timeScale = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SegmentIndexBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SegmentIndexBox{entries=" + this.entries + ", referenceId=" + this.referenceId + ", timeScale=" + this.timeScale + ", earliestPresentationTime=" + this.earliestPresentationTime + ", firstOffset=" + this.firstOffset + ", reserved=" + this.reserved + '}';
    }
}

