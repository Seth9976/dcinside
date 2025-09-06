package org.mp4parser.boxes.iso14496.part12;

import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeReaderVariable;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.IsoTypeWriterVariable;

public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static class Entry {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public Entry() {
        }

        public Entry(long v, long v1, long v2, long v3, long v4) {
            this.moofOffset = v1;
            this.sampleNumber = v4;
            this.time = v;
            this.trafNumber = v2;
            this.trunNumber = v3;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.moofOffset != ((Entry)object0).moofOffset) {
                return false;
            }
            if(this.sampleNumber != ((Entry)object0).sampleNumber) {
                return false;
            }
            if(this.time != ((Entry)object0).time) {
                return false;
            }
            return this.trafNumber == ((Entry)object0).trafNumber ? this.trunNumber == ((Entry)object0).trunNumber : false;
        }

        public long getMoofOffset() {
            return this.moofOffset;
        }

        public long getSampleNumber() {
            return this.sampleNumber;
        }

        public long getTime() {
            return this.time;
        }

        public long getTrafNumber() {
            return this.trafNumber;
        }

        public long getTrunNumber() {
            return this.trunNumber;
        }

        @Override
        public int hashCode() {
            return (((((int)(this.time ^ this.time >>> 0x20)) * 0x1F + ((int)(this.moofOffset ^ this.moofOffset >>> 0x20))) * 0x1F + ((int)(this.trafNumber ^ this.trafNumber >>> 0x20))) * 0x1F + ((int)(this.trunNumber ^ this.trunNumber >>> 0x20))) * 0x1F + ((int)(this.sampleNumber ^ this.sampleNumber >>> 0x20));
        }

        public void setMoofOffset(long v) {
            this.moofOffset = v;
        }

        public void setSampleNumber(long v) {
            this.sampleNumber = v;
        }

        public void setTime(long v) {
            this.time = v;
        }

        public void setTrafNumber(long v) {
            this.trafNumber = v;
        }

        public void setTrunNumber(long v) {
            this.trunNumber = v;
        }

        @Override
        public String toString() {
            return "Entry{time=" + this.time + ", moofOffset=" + this.moofOffset + ", trafNumber=" + this.trafNumber + ", trunNumber=" + this.trunNumber + ", sampleNumber=" + this.sampleNumber + '}';
        }
    }

    public static final String TYPE = "tfra";
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
    private List entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    static {
        TrackFragmentRandomAccessBox.ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super("tfra");
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer0);
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved = (int)(v >> 6);
        this.lengthSizeOfTrafNum = (((int)(0x3FL & v)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int)(12L & v)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int)(v & 3L)) + 1;
        long v1 = IsoTypeReader.readUInt32(byteBuffer0);
        this.entries = new ArrayList();
        for(int v2 = 0; ((long)v2) < v1; ++v2) {
            Entry trackFragmentRandomAccessBox$Entry0 = new Entry();
            if(this.getVersion() == 1) {
                trackFragmentRandomAccessBox$Entry0.time = IsoTypeReader.readUInt64(byteBuffer0);
                trackFragmentRandomAccessBox$Entry0.moofOffset = IsoTypeReader.readUInt64(byteBuffer0);
            }
            else {
                trackFragmentRandomAccessBox$Entry0.time = IsoTypeReader.readUInt32(byteBuffer0);
                trackFragmentRandomAccessBox$Entry0.moofOffset = IsoTypeReader.readUInt32(byteBuffer0);
            }
            trackFragmentRandomAccessBox$Entry0.trafNumber = IsoTypeReaderVariable.read(byteBuffer0, this.lengthSizeOfTrafNum);
            trackFragmentRandomAccessBox$Entry0.trunNumber = IsoTypeReaderVariable.read(byteBuffer0, this.lengthSizeOfTrunNum);
            trackFragmentRandomAccessBox$Entry0.sampleNumber = IsoTypeReaderVariable.read(byteBuffer0, this.lengthSizeOfSampleNum);
            this.entries.add(trackFragmentRandomAccessBox$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        TrackFragmentRandomAccessBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "long"), 0x7E);
        TrackFragmentRandomAccessBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 130);
        TrackFragmentRandomAccessBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 0xA6);
        TrackFragmentRandomAccessBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 170);
        TrackFragmentRandomAccessBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 0xAF);
        TrackFragmentRandomAccessBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 0x86);
        TrackFragmentRandomAccessBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeOfTrafNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 0x8A);
        TrackFragmentRandomAccessBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLengthSizeOfTrafNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 0x8E);
        TrackFragmentRandomAccessBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeOfTrunNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 0x92);
        TrackFragmentRandomAccessBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLengthSizeOfTrunNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 150);
        TrackFragmentRandomAccessBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeOfSampleNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "int"), 0x9A);
        TrackFragmentRandomAccessBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLengthSizeOfSampleNum", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 0x9E);
        TrackFragmentRandomAccessBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getNumberOfEntries", "org.mp4parser.boxes.iso14496.part12.TrackFragmentRandomAccessBox", "", "", "", "long"), 0xA2);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)(this.reserved << 6)) | ((long)((this.lengthSizeOfTrafNum - 1 & 3) << 4)) | ((long)((this.lengthSizeOfTrunNum - 1 & 3) << 2)) | ((long)(this.lengthSizeOfSampleNum - 1 & 3)));
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            Entry trackFragmentRandomAccessBox$Entry0 = (Entry)object0;
            if(this.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer0, trackFragmentRandomAccessBox$Entry0.time);
                IsoTypeWriter.writeUInt64(byteBuffer0, trackFragmentRandomAccessBox$Entry0.moofOffset);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer0, trackFragmentRandomAccessBox$Entry0.time);
                IsoTypeWriter.writeUInt32(byteBuffer0, trackFragmentRandomAccessBox$Entry0.moofOffset);
            }
            IsoTypeWriterVariable.write(trackFragmentRandomAccessBox$Entry0.trafNumber, byteBuffer0, this.lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(trackFragmentRandomAccessBox$Entry0.trunNumber, byteBuffer0, this.lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(trackFragmentRandomAccessBox$Entry0.sampleNumber, byteBuffer0, this.lengthSizeOfSampleNum);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 16L + ((long)(this.entries.size() * 16)) + ((long)(this.lengthSizeOfTrafNum * this.entries.size())) + ((long)(this.lengthSizeOfTrunNum * this.entries.size())) + ((long)(this.lengthSizeOfSampleNum * this.entries.size())) : 16L + ((long)(this.entries.size() * 8)) + ((long)(this.lengthSizeOfTrafNum * this.entries.size())) + ((long)(this.lengthSizeOfTrunNum * this.entries.size())) + ((long)(this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return DesugarCollections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (long)this.entries.size();
    }

    public int getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public long getTrackId() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackId;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_11, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    public void setLengthSizeOfSampleNum(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_8, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lengthSizeOfSampleNum = v;
    }

    public void setLengthSizeOfTrafNum(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_4, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lengthSizeOfTrafNum = v;
    }

    public void setLengthSizeOfTrunNum(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_6, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lengthSizeOfTrunNum = v;
    }

    public void setTrackId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackId = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + '}';
    }
}

