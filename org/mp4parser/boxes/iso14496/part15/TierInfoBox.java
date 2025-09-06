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

public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        TierInfoBox.ajc$preClinit();
    }

    public TierInfoBox() {
        super("tiri");
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.tierID = IsoTypeReader.readUInt16(byteBuffer0);
        this.profileIndication = IsoTypeReader.readUInt8(byteBuffer0);
        this.profile_compatibility = IsoTypeReader.readUInt8(byteBuffer0);
        this.levelIndication = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved1 = IsoTypeReader.readUInt8(byteBuffer0);
        this.visualWidth = IsoTypeReader.readUInt16(byteBuffer0);
        this.visualHeight = IsoTypeReader.readUInt16(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.discardable = (v & 0xC0) >> 6;
        this.constantFrameRate = (v & 0x30) >> 4;
        this.reserved2 = v & 15;
        this.frameRate = IsoTypeReader.readUInt16(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TierInfoBox.java", TierInfoBox.class);
        TierInfoBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        TierInfoBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        TierInfoBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        TierInfoBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 0x71);
        TierInfoBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 0x75);
        TierInfoBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), 0x79);
        TierInfoBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 0x7D);
        TierInfoBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 0x81);
        TierInfoBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 0x85);
        TierInfoBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 0x89);
        TierInfoBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 0x8D);
        TierInfoBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 0x91);
        TierInfoBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        TierInfoBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 0x95);
        TierInfoBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"), 0x99);
        TierInfoBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        TierInfoBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        TierInfoBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        TierInfoBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        TierInfoBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        TierInfoBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        TierInfoBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    public int getConstantFrameRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.constantFrameRate;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt16(byteBuffer0, this.tierID);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.profileIndication);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.profile_compatibility);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.levelIndication);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.reserved1);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.visualWidth);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.visualHeight);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.frameRate);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.discardable;
    }

    public int getFrameRate() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.frameRate;
    }

    public int getLevelIndication() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.levelIndication;
    }

    public int getProfileIndication() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.profile_compatibility;
    }

    public int getReserved1() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved1;
    }

    public int getReserved2() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved2;
    }

    public int getTierID() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.tierID;
    }

    public int getVisualHeight() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.visualHeight;
    }

    public int getVisualWidth() {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.visualWidth;
    }

    public void setConstantFrameRate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_17, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.constantFrameRate = v;
    }

    public void setDiscardable(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_15, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.discardable = v;
    }

    public void setFrameRate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_21, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.frameRate = v;
    }

    public void setLevelIndication(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.levelIndication = v;
    }

    public void setProfileIndication(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.profileIndication = v;
    }

    public void setProfile_compatibility(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.profile_compatibility = v;
    }

    public void setReserved1(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved1 = v;
    }

    public void setReserved2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_19, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved2 = v;
    }

    public void setTierID(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.tierID = v;
    }

    public void setVisualHeight(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_13, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.visualHeight = v;
    }

    public void setVisualWidth(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TierInfoBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.visualWidth = v;
    }
}

