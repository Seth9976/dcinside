package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = "tibr";
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
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        TierBitRateBox.ajc$preClinit();
    }

    public TierBitRateBox() {
        super("tibr");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.baseBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.tierBaseBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.tierMaxBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.tierAvgBitRate = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TierBitRateBox.java", TierBitRateBox.class);
        TierBitRateBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 52);
        TierBitRateBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"), 56);
        TierBitRateBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTierAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 92);
        TierBitRateBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTierAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"), 0x60);
        TierBitRateBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 60);
        TierBitRateBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"), 0x40);
        TierBitRateBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 68);
        TierBitRateBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"), 72);
        TierBitRateBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTierBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 76);
        TierBitRateBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTierBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"), 80);
        TierBitRateBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTierMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"), 84);
        TierBitRateBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTierMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"), 88);
    }

    public long getAvgBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.baseBitRate;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt32(byteBuffer0, this.baseBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.avgBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.tierBaseBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.tierMaxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.tierAvgBitRate);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public long getMaxBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avgBitRate = v;
    }

    public void setBaseBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.baseBitRate = v;
    }

    public void setMaxBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.maxBitRate = v;
    }

    public void setTierAvgBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_11, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.tierAvgBitRate = v;
    }

    public void setTierBaseBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.tierBaseBitRate = v;
    }

    public void setTierMaxBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierBitRateBox.ajc$tjp_9, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.tierMaxBitRate = v;
    }
}

