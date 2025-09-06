package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part15.StepwiseTemporalLayerEntry;
import org.mp4parser.boxes.iso14496.part15.SyncSampleEntry;
import org.mp4parser.boxes.iso14496.part15.TemporalLayerSampleGroup;
import org.mp4parser.boxes.iso14496.part15.TemporalSubLayerSampleGroup;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private int defaultLength;
    private List groupEntries;
    private String groupingType;

    static {
        SampleGroupDescriptionBox.ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super("sgpd");
        this.groupEntries = new LinkedList();
        this.setVersion(1);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.groupingType = IsoTypeReader.read4cc(byteBuffer0);
        if(this.getVersion() == 1) {
            this.defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        }
        for(long v = IsoTypeReader.readUInt32(byteBuffer0); v > 0L; --v) {
            int v1 = this.defaultLength;
            if(this.getVersion() != 1) {
                v1 = byteBuffer0.limit() - byteBuffer0.position();
            }
            else if(this.defaultLength == 0) {
                v1 = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
            }
            ByteBuffer byteBuffer1 = byteBuffer0.slice();
            byteBuffer1.limit(v1);
            this.groupEntries.add(this.parseGroupEntry(byteBuffer1, this.groupingType));
            if(this.getVersion() != 1) {
                v1 = byteBuffer1.position();
            }
            byteBuffer0.position(byteBuffer0.position() + v1);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        SampleGroupDescriptionBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 57);
        SampleGroupDescriptionBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 61);
        SampleGroupDescriptionBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 0xA4);
        SampleGroupDescriptionBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 0xA8);
        SampleGroupDescriptionBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 0xAC);
        SampleGroupDescriptionBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 0xB0);
        SampleGroupDescriptionBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 0xB5);
        SampleGroupDescriptionBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 202);
        SampleGroupDescriptionBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 210);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_6, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.defaultLength != ((SampleGroupDescriptionBox)object0).defaultLength) {
            return false;
        }
        List list0 = this.groupEntries;
        List list1 = ((SampleGroupDescriptionBox)object0).groupEntries;
        return list0 == null ? list1 == null : list0.equals(list1);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.groupingType));
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.defaultLength));
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.groupEntries.size()));
        Iterator iterator0 = this.groupEntries.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                return;
            }
            Object object0 = iterator0.next();
            ByteBuffer byteBuffer1 = ((GroupEntry)object0).get();
            if(this.getVersion() == 1) {
                if(this.defaultLength == 0) {
                    IsoTypeWriter.writeUInt32(byteBuffer0, ((long)byteBuffer1.limit()));
                }
                else if(byteBuffer1.limit() > this.defaultLength) {
                    throw new RuntimeException(String.format("SampleGroupDescriptionBox entry size %d more than %d", byteBuffer1.limit(), this.defaultLength));
                }
            }
            byteBuffer0.put(byteBuffer1);
            for(int v = this.defaultLength == 0 ? 0 : this.defaultLength - byteBuffer1.limit(); v > 0; --v) {
                byteBuffer0.put(0);
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = (this.getVersion() == 1 ? 12L : 8L) + 4L;
        for(Object object0: this.groupEntries) {
            if(this.getVersion() == 1 && this.defaultLength == 0) {
                v += 4L;
            }
            v += (long)(this.defaultLength == 0 ? ((GroupEntry)object0).size() : this.defaultLength);
        }
        return v;
    }

    public int getDefaultLength() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultLength;
    }

    public List getGroupEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.groupEntries;
    }

    public String getGroupingType() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.groupingType;
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        int v = this.defaultLength * 0x1F;
        return this.groupEntries == null ? v : v + this.groupEntries.hashCode();
    }

    private GroupEntry parseGroupEntry(ByteBuffer byteBuffer0, String s) {
        GroupEntry groupEntry0;
        if("roll".equals(s)) {
            groupEntry0 = new RollRecoveryEntry();
        }
        else {
            if("rash".equals(s)) {
                groupEntry0 = new RateShareEntry();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("rap ".equals(s)) {
                groupEntry0 = new VisualRandomAccessEntry();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("tele".equals(s)) {
                groupEntry0 = new TemporalLevelEntry();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("sync".equals(s)) {
                groupEntry0 = new SyncSampleEntry();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("tscl".equals(s)) {
                groupEntry0 = new TemporalLayerSampleGroup();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("tsas".equals(s)) {
                groupEntry0 = new TemporalSubLayerSampleGroup();
                groupEntry0.parse(byteBuffer0);
                return groupEntry0;
            }
            if("stsa".equals(s)) {
                groupEntry0 = new StepwiseTemporalLayerEntry();
            }
            else if(this.getVersion() != 0) {
                groupEntry0 = new UnknownEntry(s);
            }
            else {
                throw new RuntimeException("SampleGroupDescriptionBox with UnknownEntry are only supported in version 1");
            }
        }
        groupEntry0.parse(byteBuffer0);
        return groupEntry0;
    }

    public void setDefaultLength(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultLength = v;
    }

    public void setGroupEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_5, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.groupEntries = list0;
    }

    public void setGroupingType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.groupingType = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleGroupDescriptionBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleGroupDescriptionBox{groupingType=\'" + (this.groupEntries.size() <= 0 ? "????" : ((GroupEntry)this.groupEntries.get(0)).getType()) + '\'' + ", defaultLength=" + this.defaultLength + ", groupEntries=" + this.groupEntries + '}';
    }
}

