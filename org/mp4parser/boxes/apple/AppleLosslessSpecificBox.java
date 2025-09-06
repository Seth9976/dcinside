package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        AppleLosslessSpecificBox.ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.maxSamplePerFrame = IsoTypeReader.readUInt32(byteBuffer0);
        this.unknown1 = IsoTypeReader.readUInt8(byteBuffer0);
        this.sampleSize = IsoTypeReader.readUInt8(byteBuffer0);
        this.historyMult = IsoTypeReader.readUInt8(byteBuffer0);
        this.initialHistory = IsoTypeReader.readUInt8(byteBuffer0);
        this.kModifier = IsoTypeReader.readUInt8(byteBuffer0);
        this.channels = IsoTypeReader.readUInt8(byteBuffer0);
        this.unknown2 = IsoTypeReader.readUInt16(byteBuffer0);
        this.maxCodedFrameSize = IsoTypeReader.readUInt32(byteBuffer0);
        this.bitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        AppleLosslessSpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 38);
        AppleLosslessSpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 42);
        AppleLosslessSpecificBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 78);
        AppleLosslessSpecificBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 82);
        AppleLosslessSpecificBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 86);
        AppleLosslessSpecificBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 90);
        AppleLosslessSpecificBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 94);
        AppleLosslessSpecificBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 98);
        AppleLosslessSpecificBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 102);
        AppleLosslessSpecificBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 106);
        AppleLosslessSpecificBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 110);
        AppleLosslessSpecificBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 0x72);
        AppleLosslessSpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 46);
        AppleLosslessSpecificBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 0x76);
        AppleLosslessSpecificBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 0x7A);
        AppleLosslessSpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 50);
        AppleLosslessSpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 54);
        AppleLosslessSpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 58);
        AppleLosslessSpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 62);
        AppleLosslessSpecificBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 66);
        AppleLosslessSpecificBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 70);
        AppleLosslessSpecificBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 74);
    }

    public long getBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.bitRate;
    }

    public int getChannels() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.channels;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.unknown1);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.sampleSize);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.historyMult);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.initialHistory);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.kModifier);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.channels);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.unknown2);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.bitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.sampleRate);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 28L;
    }

    public int getHistoryMult() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.historyMult;
    }

    public int getInitialHistory() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.initialHistory;
    }

    public int getKModifier() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.kModifier;
    }

    public long getMaxCodedFrameSize() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxSamplePerFrame;
    }

    public long getSampleRate() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleRate;
    }

    public int getSampleSize() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleSize;
    }

    public int getUnknown1() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown1;
    }

    public int getUnknown2() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown2;
    }

    public void setBitRate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_19, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.bitRate = (long)v;
    }

    public void setChannels(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_13, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.channels = v;
    }

    public void setHistoryMult(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.historyMult = v;
    }

    public void setInitialHistory(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.initialHistory = v;
    }

    public void setKModifier(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.kModifier = v;
    }

    public void setMaxCodedFrameSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_17, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.maxCodedFrameSize = (long)v;
    }

    public void setMaxSamplePerFrame(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.maxSamplePerFrame = (long)v;
    }

    public void setSampleRate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_21, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleRate = (long)v;
    }

    public void setSampleSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleSize = v;
    }

    public void setUnknown1(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown1 = v;
    }

    public void setUnknown2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_15, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown2 = v;
    }
}

