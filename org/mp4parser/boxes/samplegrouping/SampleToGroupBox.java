package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleToGroupBox extends AbstractFullBox {
    public static class Entry {
        private int groupDescriptionIndex;
        private long sampleCount;

        public Entry(long v, int v1) {
            this.sampleCount = v;
            this.groupDescriptionIndex = v1;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.groupDescriptionIndex == ((Entry)object0).groupDescriptionIndex ? this.sampleCount == ((Entry)object0).sampleCount : false;
        }

        public int getGroupDescriptionIndex() {
            return this.groupDescriptionIndex;
        }

        public long getSampleCount() {
            return this.sampleCount;
        }

        @Override
        public int hashCode() {
            return ((int)(this.sampleCount ^ this.sampleCount >>> 0x20)) * 0x1F + this.groupDescriptionIndex;
        }

        public void setGroupDescriptionIndex(int v) {
            this.groupDescriptionIndex = v;
        }

        public void setSampleCount(long v) {
            this.sampleCount = v;
        }

        @Override
        public String toString() {
            return "Entry{sampleCount=" + this.sampleCount + ", groupDescriptionIndex=" + this.groupDescriptionIndex + '}';
        }
    }

    public static final String TYPE = "sbgp";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    List entries;
    private String groupingType;
    private String groupingTypeParameter;

    static {
        SampleToGroupBox.ajc$preClinit();
    }

    public SampleToGroupBox() {
        super("sbgp");
        this.entries = new LinkedList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.groupingType = IsoTypeReader.read4cc(byteBuffer0);
        if(this.getVersion() == 1) {
            this.groupingTypeParameter = IsoTypeReader.read4cc(byteBuffer0);
        }
        for(long v = IsoTypeReader.readUInt32(byteBuffer0); v > 0L; --v) {
            this.entries.add(new Entry(((long)CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0))), CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0))));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleToGroupBox.java", SampleToGroupBox.class);
        SampleToGroupBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGroupingType", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 84);
        SampleToGroupBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGroupingType", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 88);
        SampleToGroupBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGroupingTypeParameter", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 92);
        SampleToGroupBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGroupingTypeParameter", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 0x60);
        SampleToGroupBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 100);
        SampleToGroupBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 104);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(this.groupingType.getBytes());
        if(this.getVersion() == 1) {
            byteBuffer0.put(this.groupingTypeParameter.getBytes());
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getSampleCount());
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)((Entry)object0).getGroupDescriptionIndex()));
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? ((long)(this.entries.size() * 8 + 16)) : ((long)(this.entries.size() * 8 + 12));
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public String getGroupingType() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.groupingTypeParameter;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_5, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    public void setGroupingType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.groupingType = s;
    }

    public void setGroupingTypeParameter(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToGroupBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.groupingTypeParameter = s;
    }
}

