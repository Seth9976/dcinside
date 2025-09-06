package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_14;
    private static StaticPart ajc$tjp_15;
    private static StaticPart ajc$tjp_16;
    private static StaticPart ajc$tjp_17;
    private static StaticPart ajc$tjp_18;
    private static StaticPart ajc$tjp_19;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_20;
    private static StaticPart ajc$tjp_21;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        TrackFragmentHeaderBox.ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super("tfhd");
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer0);
        if((this.getFlags() & 1) == 1) {
            this.baseDataOffset = IsoTypeReader.readUInt64(byteBuffer0);
        }
        if((this.getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer0);
        }
        if((this.getFlags() & 8) == 8) {
            this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer0);
        }
        if((this.getFlags() & 16) == 16) {
            this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer0);
        }
        if((this.getFlags() & 0x20) == 0x20) {
            this.defaultSampleFlags = new SampleFlags(byteBuffer0);
        }
        if((this.getFlags() & 0x10000) == 0x10000) {
            this.durationIsEmpty = true;
        }
        if((this.getFlags() & 0x20000) == 0x20000) {
            this.defaultBaseIsMoof = true;
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        TrackFragmentHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0x7E);
        TrackFragmentHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        TrackFragmentHeaderBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 0xAB);
        TrackFragmentHeaderBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"), 180);
        TrackFragmentHeaderBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 0xB8);
        TrackFragmentHeaderBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"), 0xBD);
        TrackFragmentHeaderBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 0xC1);
        TrackFragmentHeaderBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"), 0xC6);
        TrackFragmentHeaderBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "defaultSampleFlags", "", "void"), 202);
        TrackFragmentHeaderBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isDurationIsEmpty", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0xCF);
        TrackFragmentHeaderBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDurationIsEmpty", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 0xD3);
        TrackFragmentHeaderBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isDefaultBaseIsMoof", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0xD8);
        TrackFragmentHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0x86);
        TrackFragmentHeaderBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultBaseIsMoof", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 220);
        TrackFragmentHeaderBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 0xE2);
        TrackFragmentHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0x8A);
        TrackFragmentHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "boolean"), 0x8E);
        TrackFragmentHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"), 0x92);
        TrackFragmentHeaderBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 150);
        TrackFragmentHeaderBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"), 0x9A);
        TrackFragmentHeaderBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 0x9E);
        TrackFragmentHeaderBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"), 0xA7);
    }

    public long getBaseDataOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.baseDataOffset;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.trackId);
        if((this.getFlags() & 1) == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, this.getBaseDataOffset());
        }
        if((this.getFlags() & 2) == 2) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSampleDescriptionIndex());
        }
        if((this.getFlags() & 8) == 8) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getDefaultSampleDuration());
        }
        if((this.getFlags() & 16) == 16) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getDefaultSampleSize());
        }
        if((this.getFlags() & 0x20) == 0x20) {
            this.defaultSampleFlags.getContent(byteBuffer0);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = this.getFlags();
        long v1 = (v & 1) == 1 ? 16L : 8L;
        if((v & 2) == 2) {
            v1 += 4L;
        }
        if((v & 8) == 8) {
            v1 += 4L;
        }
        if((v & 16) == 16) {
            v1 += 4L;
        }
        return (v & 0x20) == 0x20 ? v1 + 4L : v1;
    }

    public long getDefaultSampleDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 0x20) != 0;
    }

    public boolean hasDefaultSampleSize() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_8, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(v == -1L) {
            this.setFlags(this.getFlags() & 0x7FFFFFFE);
        }
        else {
            this.setFlags(this.getFlags() | 1);
        }
        this.baseDataOffset = v;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_20, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setFlags(this.getFlags() | 0x20000);
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_12, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setFlags(this.getFlags() | 8);
        this.defaultSampleDuration = v;
    }

    public void setDefaultSampleFlags(SampleFlags sampleFlags0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_16, this, this, sampleFlags0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setFlags(this.getFlags() | 0x20);
        this.defaultSampleFlags = sampleFlags0;
    }

    public void setDefaultSampleSize(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_14, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setFlags(this.getFlags() | 16);
        this.defaultSampleSize = v;
    }

    public void setDurationIsEmpty(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_18, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setFlags(this.getFlags() | 0x10000);
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_10, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(v == -1L) {
            this.setFlags(this.getFlags() & 0x7FFFFFFD);
        }
        else {
            this.setFlags(this.getFlags() | 2);
        }
        this.sampleDescriptionIndex = v;
    }

    public void setTrackId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_6, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackId = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrackFragmentHeaderBox{trackId=" + this.trackId + ", baseDataOffset=" + this.baseDataOffset + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + ", defaultSampleDuration=" + this.defaultSampleDuration + ", defaultSampleSize=" + this.defaultSampleSize + ", defaultSampleFlags=" + this.defaultSampleFlags + ", durationIsEmpty=" + this.durationIsEmpty + ", defaultBaseIsMoof=" + this.defaultBaseIsMoof + '}';
    }
}

