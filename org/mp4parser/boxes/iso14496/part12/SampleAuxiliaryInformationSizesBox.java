package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
        SampleAuxiliaryInformationSizesBox.ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super("saiz");
        this.sampleInfoSizes = new short[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if((this.getFlags() & 1) == 1) {
            this.auxInfoType = IsoTypeReader.read4cc(byteBuffer0);
            this.auxInfoTypeParameter = IsoTypeReader.read4cc(byteBuffer0);
        }
        this.defaultSampleInfoSize = (short)IsoTypeReader.readUInt8(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.sampleCount = v;
        if(this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[v];
            for(int v1 = 0; v1 < this.sampleCount; ++v1) {
                short[] arr_v = this.sampleInfoSizes;
                arr_v[v1] = (short)IsoTypeReader.readUInt8(byteBuffer0);
            }
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"), 55);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 104);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 0x90);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 0x95);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 108);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 0x70);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 0x74);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleInfoSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 120);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleInfoSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 0x7C);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleInfoSizes", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), 0x81);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleInfoSizes", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 0x87);
        SampleAuxiliaryInformationSizesBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 140);
    }

    public String getAuxInfoType() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_3, this, this);
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
        IsoTypeWriter.writeUInt8(byteBuffer0, ((int)this.defaultSampleInfoSize));
        if(this.defaultSampleInfoSize == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.sampleInfoSizes.length));
            short[] arr_v = this.sampleInfoSizes;
            for(int v = 0; v < arr_v.length; ++v) {
                IsoTypeWriter.writeUInt8(byteBuffer0, ((int)arr_v[v]));
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.sampleCount));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = (this.getFlags() & 1) == 1 ? 12 : 4;
        return this.defaultSampleInfoSize == 0 ? ((long)(v + 5 + this.sampleInfoSizes.length)) : ((long)(v + 5));
    }

    public int getDefaultSampleInfoSize() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        short[] arr_v = this.sampleInfoSizes;
        short[] arr_v1 = new short[arr_v.length];
        System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
        return arr_v1;
    }

    public short getSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_0, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[v] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.auxInfoType = s;
    }

    public void setAuxInfoTypeParameter(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_4, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.auxInfoTypeParameter = s;
    }

    public void setDefaultSampleInfoSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_6, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultSampleInfoSize = (short)v;
    }

    public void setSampleCount(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_10, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleCount = v;
    }

    public void setSampleInfoSizes(short[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_8, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        short[] arr_v1 = new short[arr_v.length];
        this.sampleInfoSizes = arr_v1;
        System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + ((int)this.defaultSampleInfoSize) + ", sampleCount=" + this.sampleCount + ", auxInfoType=\'" + this.auxInfoType + '\'' + ", auxInfoTypeParameter=\'" + this.auxInfoTypeParameter + '\'' + '}';
    }
}

