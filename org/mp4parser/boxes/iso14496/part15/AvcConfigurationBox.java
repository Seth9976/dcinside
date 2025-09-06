package org.mp4parser.boxes.iso14496.part15;

import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
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
    private static StaticPart ajc$tjp_22;
    private static StaticPart ajc$tjp_23;
    private static StaticPart ajc$tjp_24;
    private static StaticPart ajc$tjp_25;
    private static StaticPart ajc$tjp_26;
    private static StaticPart ajc$tjp_27;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    public AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    static {
        AvcConfigurationBox.ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super("avcC");
        this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        AvcConfigurationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        AvcConfigurationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 0x30);
        AvcConfigurationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 84);
        AvcConfigurationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 88);
        AvcConfigurationBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 92);
        AvcConfigurationBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 0x60);
        AvcConfigurationBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        AvcConfigurationBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        AvcConfigurationBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        AvcConfigurationBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 0x70);
        AvcConfigurationBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 0x74);
        AvcConfigurationBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        AvcConfigurationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        AvcConfigurationBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 0x7C);
        AvcConfigurationBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 0x80);
        AvcConfigurationBox.ajc$tjp_22 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 0x84);
        AvcConfigurationBox.ajc$tjp_23 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 0x88);
        AvcConfigurationBox.ajc$tjp_24 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 0x93);
        AvcConfigurationBox.ajc$tjp_25 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 0x99);
        AvcConfigurationBox.ajc$tjp_26 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"), 0x9E);
        AvcConfigurationBox.ajc$tjp_27 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 0xA3);
        AvcConfigurationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 56);
        AvcConfigurationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        AvcConfigurationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 0x40);
        AvcConfigurationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 68);
        AvcConfigurationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 72);
        AvcConfigurationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 76);
        AvcConfigurationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 80);
    }

    public int getAvcLevelIndication() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.avcLevelIndication;
    }

    public int getAvcProfileIndication() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.avcProfileIndication;
    }

    public int getBitDepthChromaMinus8() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public int getChromaFormat() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.chromaFormat;
    }

    public int getConfigurationVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.configurationVersion;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_25, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.getContent(byteBuffer0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public long getContentSize() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.getContentSize();
    }

    public int getLengthSizeMinusOne() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public List getPictureParameterSets() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return DesugarCollections.unmodifiableList(this.avcDecoderConfigurationRecord.pictureParameterSets);
    }

    public int getProfileCompatibility() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.profileCompatibility;
    }

    public List getSequenceParameterSetExts() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }

    public List getSequenceParameterSets() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return DesugarCollections.unmodifiableList(this.avcDecoderConfigurationRecord.sequenceParameterSets);
    }

    public AvcDecoderConfigurationRecord getavcDecoderConfigurationRecord() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.hasExts;
    }

    public void setAvcLevelIndication(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.avcLevelIndication = v;
    }

    public void setAvcProfileIndication(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.avcProfileIndication = v;
    }

    public void setBitDepthChromaMinus8(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_19, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = v;
    }

    public void setBitDepthLumaMinus8(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_17, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = v;
    }

    public void setChromaFormat(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_15, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.chromaFormat = v;
    }

    public void setConfigurationVersion(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.configurationVersion = v;
    }

    public void setHasExts(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_23, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.hasExts = z;
    }

    public void setLengthSizeMinusOne(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.lengthSizeMinusOne = v;
    }

    public void setPictureParameterSets(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_13, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.pictureParameterSets = list0;
    }

    public void setProfileCompatibility(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.profileCompatibility = v;
    }

    public void setSequenceParameterSetExts(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_21, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.sequenceParameterSetExts = list0;
    }

    public void setSequenceParameterSets(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_11, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avcDecoderConfigurationRecord.sequenceParameterSets = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcConfigurationBox.ajc$tjp_27, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.avcDecoderConfigurationRecord + '}';
    }
}

