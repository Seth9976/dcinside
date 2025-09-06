package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox;
import org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = "avcn";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    static {
        AvcNalUnitStorageBox.ajc$preClinit();
    }

    public AvcNalUnitStorageBox() {
        super("avcn");
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox0) {
        super("avcn");
        this.avcDecoderConfigurationRecord = avcConfigurationBox0.getavcDecoderConfigurationRecord();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.avcDecoderConfigurationRecord = new AvcDecoderConfigurationRecord(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        AvcNalUnitStorageBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvcDecoderConfigurationRecord", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        AvcNalUnitStorageBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLengthSizeMinusOne", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "int"), 49);
        AvcNalUnitStorageBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSequenceParameterSetsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 53);
        AvcNalUnitStorageBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSequenceParameterSetExtsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 57);
        AvcNalUnitStorageBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPictureParameterSetsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        AvcNalUnitStorageBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 81);
    }

    public AvcDecoderConfigurationRecord getAvcDecoderConfigurationRecord() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.avcDecoderConfigurationRecord.getContent(byteBuffer0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.avcDecoderConfigurationRecord.getContentSize();
    }

    public int getLengthSizeMinusOne() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public List getPictureParameterSetsAsStrings() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings();
    }

    public List getSequenceParameterSetExtsAsStrings() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.getSequenceParameterSetExtsAsStrings();
    }

    public List getSequenceParameterSetsAsStrings() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings();
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AvcNalUnitStorageBox{SPS=" + this.avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings() + ",PPS=" + this.avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings() + ",lengthSize=" + (this.avcDecoderConfigurationRecord.lengthSizeMinusOne + 1) + '}';
    }
}

