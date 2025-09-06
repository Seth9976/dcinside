package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SubSampleInformationBox extends AbstractFullBox {
    public static class SubSampleEntry {
        public static class SubsampleEntry {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;

            public int getDiscardable() {
                return this.discardable;
            }

            public long getReserved() {
                return this.reserved;
            }

            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }

            public long getSubsampleSize() {
                return this.subsampleSize;
            }

            public void setDiscardable(int v) {
                this.discardable = v;
            }

            public void setReserved(long v) {
                this.reserved = v;
            }

            public void setSubsamplePriority(int v) {
                this.subsamplePriority = v;
            }

            public void setSubsampleSize(long v) {
                this.subsampleSize = v;
            }

            @Override
            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.subsampleSize + ", subsamplePriority=" + this.subsamplePriority + ", discardable=" + this.discardable + ", reserved=" + this.reserved + '}';
            }
        }

        private long sampleDelta;
        private List subsampleEntries;

        public SubSampleEntry() {
            this.subsampleEntries = new ArrayList();
        }

        public long getSampleDelta() {
            return this.sampleDelta;
        }

        public int getSubsampleCount() {
            return this.subsampleEntries.size();
        }

        public List getSubsampleEntries() {
            return this.subsampleEntries;
        }

        public void setSampleDelta(long v) {
            this.sampleDelta = v;
        }

        @Override
        public String toString() {
            return "SampleEntry{sampleDelta=" + this.sampleDelta + ", subsampleCount=" + this.subsampleEntries.size() + ", subsampleEntries=" + this.subsampleEntries + '}';
        }
    }

    public static final String TYPE = "subs";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private List entries;

    static {
        SubSampleInformationBox.ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            SubSampleEntry subSampleInformationBox$SubSampleEntry0 = new SubSampleEntry();
            subSampleInformationBox$SubSampleEntry0.setSampleDelta(IsoTypeReader.readUInt32(byteBuffer0));
            int v2 = IsoTypeReader.readUInt16(byteBuffer0);
            for(int v3 = 0; v3 < v2; ++v3) {
                SubsampleEntry subSampleInformationBox$SubSampleEntry$SubsampleEntry0 = new SubsampleEntry();
                subSampleInformationBox$SubSampleEntry$SubsampleEntry0.setSubsampleSize((this.getVersion() == 1 ? IsoTypeReader.readUInt32(byteBuffer0) : ((long)IsoTypeReader.readUInt16(byteBuffer0))));
                subSampleInformationBox$SubSampleEntry$SubsampleEntry0.setSubsamplePriority(IsoTypeReader.readUInt8(byteBuffer0));
                subSampleInformationBox$SubSampleEntry$SubsampleEntry0.setDiscardable(IsoTypeReader.readUInt8(byteBuffer0));
                subSampleInformationBox$SubSampleEntry$SubsampleEntry0.setReserved(IsoTypeReader.readUInt32(byteBuffer0));
                subSampleInformationBox$SubSampleEntry0.getSubsampleEntries().add(subSampleInformationBox$SubSampleEntry$SubsampleEntry0);
            }
            this.entries.add(subSampleInformationBox$SubSampleEntry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SubSampleInformationBox.java", SubSampleInformationBox.class);
        SubSampleInformationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "", "", "", "java.util.List"), 49);
        SubSampleInformationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 53);
        SubSampleInformationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SubSampleInformationBox", "", "", "", "java.lang.String"), 0x7B);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((SubSampleEntry)object0).getSampleDelta());
            IsoTypeWriter.writeUInt16(byteBuffer0, ((SubSampleEntry)object0).getSubsampleCount());
            for(Object object1: ((SubSampleEntry)object0).getSubsampleEntries()) {
                SubsampleEntry subSampleInformationBox$SubSampleEntry$SubsampleEntry0 = (SubsampleEntry)object1;
                if(this.getVersion() == 1) {
                    IsoTypeWriter.writeUInt32(byteBuffer0, subSampleInformationBox$SubSampleEntry$SubsampleEntry0.getSubsampleSize());
                }
                else {
                    IsoTypeWriter.writeUInt16(byteBuffer0, CastUtils.l2i(subSampleInformationBox$SubSampleEntry$SubsampleEntry0.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(byteBuffer0, subSampleInformationBox$SubSampleEntry$SubsampleEntry0.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(byteBuffer0, subSampleInformationBox$SubSampleEntry$SubsampleEntry0.getDiscardable());
                IsoTypeWriter.writeUInt32(byteBuffer0, subSampleInformationBox$SubSampleEntry$SubsampleEntry0.getReserved());
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = 8L;
        for(Object object0: this.entries) {
            v += 6L;
            for(int v1 = 0; v1 < ((SubSampleEntry)object0).getSubsampleEntries().size(); ++v1) {
                v = v + (this.getVersion() == 1 ? 4L : 2L) + 6L;
            }
        }
        return v;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SubSampleInformationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SubSampleInformationBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SubSampleInformationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SubSampleInformationBox{entryCount=" + this.entries.size() + ", entries=" + this.entries + '}';
    }
}

