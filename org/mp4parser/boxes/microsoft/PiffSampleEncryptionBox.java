package org.mp4parser.boxes.microsoft;

import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;

public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;

    static {
        PiffSampleEncryptionBox.ajc$preClinit();
    }

    public PiffSampleEncryptionBox() {
        super("uuid");
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("PiffSampleEncryptionBox.java", PiffSampleEncryptionBox.class);
        PiffSampleEncryptionBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"), 46);
        PiffSampleEncryptionBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "algorithmId", "", "void"), 50);
        PiffSampleEncryptionBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"), 54);
        PiffSampleEncryptionBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "ivSize", "", "void"), 58);
        PiffSampleEncryptionBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "[B"), 62);
        PiffSampleEncryptionBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "[B", "kid", "", "void"), 66);
    }

    public int getAlgorithmId() {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.algorithmId;
    }

    public int getIvSize() {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.ivSize;
    }

    public byte[] getKid() {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.kid;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
    }

    @Override  // org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox
    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (this.getFlags() & 1) > 0;
    }

    public void setAlgorithmId(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.algorithmId = v;
    }

    public void setIvSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.ivSize = v;
    }

    public void setKid(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(PiffSampleEncryptionBox.ajc$tjp_5, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.kid = arr_b;
    }

    @DoNotParseDetail
    public void setOverrideTrackEncryptionBoxParameters(boolean z) {
        if(z) {
            this.setFlags(this.getFlags() | 1);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFFFE);
    }
}

