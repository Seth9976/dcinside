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

public class BaseMediaInfoAtom extends AbstractFullBox {
    public static final String TYPE = "gmin";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;

    static {
        BaseMediaInfoAtom.ajc$preClinit();
    }

    public BaseMediaInfoAtom() {
        super("gmin");
        this.graphicsMode = 0x40;
        this.opColorR = 0x8000;
        this.opColorG = 0x8000;
        this.opColorB = 0x8000;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.graphicsMode = byteBuffer0.getShort();
        this.opColorR = IsoTypeReader.readUInt16(byteBuffer0);
        this.opColorG = IsoTypeReader.readUInt16(byteBuffer0);
        this.opColorB = IsoTypeReader.readUInt16(byteBuffer0);
        this.balance = byteBuffer0.getShort();
        this.reserved = byteBuffer0.getShort();
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("BaseMediaInfoAtom.java", BaseMediaInfoAtom.class);
        BaseMediaInfoAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGraphicsMode", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 54);
        BaseMediaInfoAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGraphicsMode", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"), 58);
        BaseMediaInfoAtom.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 94);
        BaseMediaInfoAtom.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"), 98);
        BaseMediaInfoAtom.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        BaseMediaInfoAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOpColorR", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 62);
        BaseMediaInfoAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOpColorR", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"), 66);
        BaseMediaInfoAtom.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOpColorG", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 70);
        BaseMediaInfoAtom.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOpColorG", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"), 74);
        BaseMediaInfoAtom.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOpColorB", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 78);
        BaseMediaInfoAtom.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOpColorB", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"), 82);
        BaseMediaInfoAtom.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBalance", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 86);
        BaseMediaInfoAtom.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBalance", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"), 90);
    }

    public short getBalance() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.balance;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.putShort(this.graphicsMode);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.opColorR);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.opColorG);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.opColorB);
        byteBuffer0.putShort(this.balance);
        byteBuffer0.putShort(this.reserved);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 16L;
    }

    public short getGraphicsMode() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.graphicsMode;
    }

    public int getOpColorB() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.opColorB;
    }

    public int getOpColorG() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.opColorG;
    }

    public int getOpColorR() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.opColorR;
    }

    public short getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public void setBalance(short v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_9, this, this, Conversions.shortObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.balance = v;
    }

    public void setGraphicsMode(short v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_1, this, this, Conversions.shortObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.graphicsMode = v;
    }

    public void setOpColorB(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.opColorB = v;
    }

    public void setOpColorG(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.opColorG = v;
    }

    public void setOpColorR(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.opColorR = v;
    }

    public void setReserved(short v) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_11, this, this, Conversions.shortObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "BaseMediaInfoAtom{graphicsMode=" + ((int)this.graphicsMode) + ", opColorR=" + this.opColorR + ", opColorG=" + this.opColorG + ", opColorB=" + this.opColorB + ", balance=" + ((int)this.balance) + ", reserved=" + ((int)this.reserved) + '}';
    }
}

