package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TrackRunBox extends AbstractFullBox {
    public static class Entry {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public Entry() {
        }

        public Entry(long v, long v1, SampleFlags sampleFlags0, int v2) {
            this.sampleDuration = v;
            this.sampleSize = v1;
            this.sampleFlags = sampleFlags0;
            this.sampleCompositionTimeOffset = (long)v2;
        }

        public long getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }

        public long getSampleDuration() {
            return this.sampleDuration;
        }

        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }

        public long getSampleSize() {
            return this.sampleSize;
        }

        public void setSampleCompositionTimeOffset(int v) {
            this.sampleCompositionTimeOffset = (long)v;
        }

        public void setSampleDuration(long v) {
            this.sampleDuration = v;
        }

        public void setSampleFlags(SampleFlags sampleFlags0) {
            this.sampleFlags = sampleFlags0;
        }

        public void setSampleSize(long v) {
            this.sampleSize = v;
        }

        @Override
        public String toString() {
            return "Entry{duration=" + this.sampleDuration + ", size=" + this.sampleSize + ", dlags=" + this.sampleFlags + ", compTimeOffset=" + this.sampleCompositionTimeOffset + '}';
        }
    }

    public static final String TYPE = "trun";
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
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private int dataOffset;
    private List entries;
    private SampleFlags firstSampleFlags;

    static {
        TrackRunBox.ajc$preClinit();
    }

    public TrackRunBox() {
        super("trun");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        this.dataOffset = (this.getFlags() & 1) == 1 ? CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0)) : -1;
        if((this.getFlags() & 4) == 4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer0);
        }
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            Entry trackRunBox$Entry0 = new Entry();
            if((this.getFlags() & 0x100) == 0x100) {
                trackRunBox$Entry0.sampleDuration = IsoTypeReader.readUInt32(byteBuffer0);
            }
            if((this.getFlags() & 0x200) == 0x200) {
                trackRunBox$Entry0.sampleSize = IsoTypeReader.readUInt32(byteBuffer0);
            }
            if((this.getFlags() & 0x400) == 0x400) {
                trackRunBox$Entry0.sampleFlags = new SampleFlags(byteBuffer0);
            }
            if((this.getFlags() & 0x800) == 0x800) {
                trackRunBox$Entry0.sampleCompositionTimeOffset = (long)byteBuffer0.getInt();
            }
            this.entries.add(trackRunBox$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackRunBox.java", TrackRunBox.class);
        TrackRunBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.util.List"), 60);
        TrackRunBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "java.util.List", "entries", "", "void"), 0x40);
        TrackRunBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 210);
        TrackRunBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 0xDB);
        TrackRunBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 0xDF);
        TrackRunBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 0xE7);
        TrackRunBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 0xEB);
        TrackRunBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "int"), 0xF4);
        TrackRunBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "int", "dataOffset", "", "void"), 0xF8);
        TrackRunBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"), 0x101);
        TrackRunBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "firstSampleFlags", "", "void"), 0x105);
        TrackRunBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.lang.String"), 0x10F);
        TrackRunBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleCompositionTimeOffsets", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "[J"), 68);
        TrackRunBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "long"), 0xAD);
        TrackRunBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 0xB1);
        TrackRunBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 0xB5);
        TrackRunBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isFirstSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 0xBD);
        TrackRunBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 0xC2);
        TrackRunBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "boolean", "v", "", "void"), 0xC6);
        TrackRunBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "boolean"), 206);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        int v = this.getFlags();
        if((v & 1) == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.dataOffset));
        }
        if((v & 4) == 4) {
            this.firstSampleFlags.getContent(byteBuffer0);
        }
        for(Object object0: this.entries) {
            Entry trackRunBox$Entry0 = (Entry)object0;
            if((v & 0x100) == 0x100) {
                IsoTypeWriter.writeUInt32(byteBuffer0, trackRunBox$Entry0.sampleDuration);
            }
            if((v & 0x200) == 0x200) {
                IsoTypeWriter.writeUInt32(byteBuffer0, trackRunBox$Entry0.sampleSize);
            }
            if((v & 0x400) == 0x400) {
                trackRunBox$Entry0.sampleFlags.getContent(byteBuffer0);
            }
            if((v & 0x800) != 0x800) {
            }
            else if(this.getVersion() == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer0, trackRunBox$Entry0.sampleCompositionTimeOffset);
            }
            else {
                byteBuffer0.putInt(((int)trackRunBox$Entry0.sampleCompositionTimeOffset));
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = this.getFlags();
        long v1 = (v & 1) == 1 ? 12L : 8L;
        if((v & 4) == 4) {
            v1 += 4L;
        }
        long v2 = (v & 0x100) == 0x100 ? 4L : 0L;
        if((v & 0x200) == 0x200) {
            v2 += 4L;
        }
        if((v & 0x400) == 0x400) {
            v2 += 4L;
        }
        if((v & 0x800) == 0x800) {
            v2 += 4L;
        }
        return v1 + v2 * ((long)this.entries.size());
    }

    public int getDataOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataOffset;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public SampleFlags getFirstSampleFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this.isSampleCompositionTimeOffsetPresent()) {
            int v = this.entries.size();
            long[] arr_v = new long[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = ((Entry)this.entries.get(v1)).getSampleCompositionTimeOffset();
            }
            return arr_v;
        }
        return null;
    }

    public long getSampleCount() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (long)this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 0x800) == 0x800;
    }

    public boolean isSampleDurationPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 0x100) == 0x100;
    }

    public boolean isSampleFlagsPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 0x400) == 0x400;
    }

    public boolean isSampleSizePresent() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 0x200) == 0x200;
    }

    public void setDataOffset(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_16, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(v == -1) {
            this.setFlags(this.getFlags() & 0xFFFFFE);
        }
        else {
            this.setFlags(this.getFlags() | 1);
        }
        this.dataOffset = v;
    }

    public void setDataOffsetPresent(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_5, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 1);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFFFE);
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    public void setFirstSampleFlags(SampleFlags sampleFlags0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_18, this, this, sampleFlags0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(sampleFlags0 == null) {
            this.setFlags(this.getFlags() & 0xFFFFFB);
        }
        else {
            this.setFlags(this.getFlags() | 4);
        }
        this.firstSampleFlags = sampleFlags0;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_14, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 0x800);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFF7FF);
    }

    public void setSampleDurationPresent(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_10, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 0x100);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFEFF);
    }

    public void setSampleFlagsPresent(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_12, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 0x400);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFBFF);
    }

    public void setSampleSizePresent(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_8, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 0x200);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFDFF);
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackRunBox.ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + this.isDataOffsetPresent() + ", sampleSizePresent=" + this.isSampleSizePresent() + ", sampleDurationPresent=" + this.isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + this.isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + this.isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }
}

