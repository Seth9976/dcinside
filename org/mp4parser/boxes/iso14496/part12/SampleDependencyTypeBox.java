package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleDependencyTypeBox extends AbstractFullBox {
    public static class Entry {
        private int value;

        public Entry(int v) {
            this.value = v;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.value == ((Entry)object0).value;
        }

        public byte getIsLeading() {
            return (byte)(this.value >> 6 & 3);
        }

        public byte getSampleDependsOn() {
            return (byte)(this.value >> 4 & 3);
        }

        public byte getSampleHasRedundancy() {
            return (byte)(this.value & 3);
        }

        public byte getSampleIsDependedOn() {
            return (byte)(this.value >> 2 & 3);
        }

        @Override
        public int hashCode() {
            return this.value;
        }

        public void setIsLeading(int v) {
            this.value = (v & 3) << 6 | this.value & 0x3F;
        }

        public void setSampleDependsOn(int v) {
            this.value = (v & 3) << 4 | this.value & 0xCF;
        }

        public void setSampleHasRedundancy(int v) {
            this.value = v & 3 | this.value & 0xFC;
        }

        public void setSampleIsDependedOn(int v) {
            this.value = (v & 3) << 2 | this.value & 0xF3;
        }

        @Override
        public String toString() {
            return "Entry{isLeading=" + this.getIsLeading() + ", sampleDependsOn=" + this.getSampleDependsOn() + ", sampleIsDependentOn=" + this.getSampleIsDependedOn() + ", sampleHasRedundancy=" + this.getSampleHasRedundancy() + '}';
        }
    }

    public static final String TYPE = "sdtp";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private List entries;

    static {
        SampleDependencyTypeBox.ajc$preClinit();
    }

    public SampleDependencyTypeBox() {
        super("sdtp");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        while(byteBuffer0.remaining() > 0) {
            this.entries.add(new Entry(IsoTypeReader.readUInt8(byteBuffer0)));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        SampleDependencyTypeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.util.List"), 70);
        SampleDependencyTypeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 74);
        SampleDependencyTypeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 0x4F);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt8(byteBuffer0, ((Entry)object0).value);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() + 4);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleDependencyTypeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleDependencyTypeBox{entries=" + this.entries + '}';
    }
}

