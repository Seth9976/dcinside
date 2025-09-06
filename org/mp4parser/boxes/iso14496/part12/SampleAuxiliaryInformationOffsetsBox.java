package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = "saio";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long[] offsets;

    static {
        SampleAuxiliaryInformationOffsetsBox.ajc$preClinit();
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super("saio");
        this.offsets = new long[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if((this.getFlags() & 1) == 1) {
            this.auxInfoType = IsoTypeReader.read4cc(byteBuffer0);
            this.auxInfoTypeParameter = IsoTypeReader.read4cc(byteBuffer0);
        }
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.offsets = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.getVersion() == 0) {
                long[] arr_v = this.offsets;
                arr_v[v1] = IsoTypeReader.readUInt32(byteBuffer0);
            }
            else {
                long[] arr_v1 = this.offsets;
                arr_v1[v1] = IsoTypeReader.readUInt64(byteBuffer0);
            }
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 106);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 110);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 0x72);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 0x76);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOffsets", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 0x7A);
        SampleAuxiliaryInformationOffsetsBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOffsets", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 0x7E);
    }

    public String getAuxInfoType() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.auxInfoTypeParameter;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if((this.getFlags() & 1) == 1) {
            byteBuffer0.put(IsoFile.fourCCtoBytes(this.auxInfoType));
            byteBuffer0.put(IsoFile.fourCCtoBytes(this.auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.offsets.length));
        long[] arr_v = this.offsets;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            if(this.getVersion() == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer0, v1);
            }
            else {
                IsoTypeWriter.writeUInt64(byteBuffer0, v1);
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = 8;
        int v1 = this.getVersion() == 0 ? this.offsets.length * 4 : this.offsets.length * 8;
        if((this.getFlags() & 1) != 1) {
            v = 0;
        }
        return (long)(v1 + 8 + v);
    }

    public long[] getOffsets() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.offsets;
    }

    public void setAuxInfoType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.auxInfoType = s;
    }

    public void setAuxInfoTypeParameter(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.auxInfoTypeParameter = s;
    }

    public void setOffsets(long[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_5, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.offsets = arr_v;
    }
}

