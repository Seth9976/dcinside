package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class HevcConfigurationBox extends AbstractBox {
    public static final String TYPE = "hvcC";
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
    private HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord;

    static {
        HevcConfigurationBox.ajc$preClinit();
    }

    public HevcConfigurationBox() {
        super("hvcC");
        this.hevcDecoderConfigurationRecord = new HevcDecoderConfigurationRecord();
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.hevcDecoderConfigurationRecord.parse(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("HevcConfigurationBox.java", HevcConfigurationBox.class);
        HevcConfigurationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHevcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.HevcDecoderConfigurationRecord"), 37);
        HevcConfigurationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHevcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "org.mp4parser.boxes.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 41);
        HevcConfigurationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGeneral_level_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 89);
        HevcConfigurationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMin_spatial_segmentation_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 93);
        HevcConfigurationBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getParallelismType", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 97);
        HevcConfigurationBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getChromaFormat", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 101);
        HevcConfigurationBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 105);
        HevcConfigurationBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 109);
        HevcConfigurationBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgFrameRate", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 0x71);
        HevcConfigurationBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getNumTemporalLayers", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 0x75);
        HevcConfigurationBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 0x79);
        HevcConfigurationBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isTemporalIdNested", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 0x7D);
        HevcConfigurationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"), 46);
        HevcConfigurationBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 0x81);
        HevcConfigurationBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getArrays", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), 0x85);
        HevcConfigurationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 59);
        HevcConfigurationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 0x40);
        HevcConfigurationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGeneral_profile_space", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 68);
        HevcConfigurationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isGeneral_tier_flag", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 72);
        HevcConfigurationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGeneral_profile_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 77);
        HevcConfigurationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGeneral_profile_compatibility_flags", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 81);
        HevcConfigurationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGeneral_constraint_indicator_flags", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 85);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_2, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord0 = this.hevcDecoderConfigurationRecord;
            HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord1 = ((HevcConfigurationBox)object0).hevcDecoderConfigurationRecord;
            return hevcDecoderConfigurationRecord0 == null ? hevcDecoderConfigurationRecord1 == null : hevcDecoderConfigurationRecord0.equals(hevcDecoderConfigurationRecord1);
        }
        return false;
    }

    public List getArrays() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.arrays;
    }

    public int getAvgFrameRate() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.avgFrameRate;
    }

    public int getBitDepthChromaMinus8() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public int getChromaFormat() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.chromaFormat;
    }

    public int getConfigurationVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.configurationVersion;
    }

    public int getConstantFrameRate() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.constantFrameRate;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.hevcDecoderConfigurationRecord.write(byteBuffer0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)this.hevcDecoderConfigurationRecord.getSize();
    }

    public long getGeneral_constraint_indicator_flags() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_profile_idc;
    }

    public int getGeneral_profile_space() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_profile_space;
    }

    public HevcDecoderConfigurationRecord getHevcDecoderConfigurationRecord() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.numTemporalLayers;
    }

    public int getParallelismType() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.parallelismType;
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord == null ? 0 : this.hevcDecoderConfigurationRecord.hashCode();
    }

    public boolean isGeneral_tier_flag() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.general_tier_flag;
    }

    public boolean isTemporalIdNested() {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hevcDecoderConfigurationRecord.temporalIdNested;
    }

    public void setHevcDecoderConfigurationRecord(HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord0) {
        JoinPoint joinPoint0 = Factory.makeJP(HevcConfigurationBox.ajc$tjp_1, this, this, hevcDecoderConfigurationRecord0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.hevcDecoderConfigurationRecord = hevcDecoderConfigurationRecord0;
    }
}

