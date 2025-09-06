package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    int acmod;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_14;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        AC3SpecificBox.ajc$preClinit();
    }

    public AC3SpecificBox() {
        super("dac3");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
        this.fscod = bitReaderBuffer0.readBits(2);
        this.bsid = bitReaderBuffer0.readBits(5);
        this.bsmod = bitReaderBuffer0.readBits(3);
        this.acmod = bitReaderBuffer0.readBits(3);
        this.lfeon = bitReaderBuffer0.readBits(1);
        this.bitRateCode = bitReaderBuffer0.readBits(5);
        this.reserved = bitReaderBuffer0.readBits(5);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AC3SpecificBox.java", AC3SpecificBox.class);
        AC3SpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFscod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 55);
        AC3SpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFscod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        AC3SpecificBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBitRateCode", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 0x5F);
        AC3SpecificBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBitRateCode", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        AC3SpecificBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 103);
        AC3SpecificBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        AC3SpecificBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "java.lang.String"), 0x70);
        AC3SpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBsid", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 0x3F);
        AC3SpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBsid", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        AC3SpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBsmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 71);
        AC3SpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBsmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        AC3SpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAcmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 0x4F);
        AC3SpecificBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAcmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        AC3SpecificBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLfeon", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"), 87);
        AC3SpecificBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLfeon", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }

    public int getAcmod() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.acmod;
    }

    public int getBitRateCode() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.bitRateCode;
    }

    public int getBsid() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.bsid;
    }

    public int getBsmod() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.bsmod;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        bitWriterBuffer0.writeBits(this.fscod, 2);
        bitWriterBuffer0.writeBits(this.bsid, 5);
        bitWriterBuffer0.writeBits(this.bsmod, 3);
        bitWriterBuffer0.writeBits(this.acmod, 3);
        bitWriterBuffer0.writeBits(this.lfeon, 1);
        bitWriterBuffer0.writeBits(this.bitRateCode, 5);
        bitWriterBuffer0.writeBits(this.reserved, 5);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 3L;
    }

    public int getFscod() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.fscod;
    }

    public int getLfeon() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.lfeon;
    }

    public int getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public void setAcmod(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.acmod = v;
    }

    public void setBitRateCode(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.bitRateCode = v;
    }

    public void setBsid(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.bsid = v;
    }

    public void setBsmod(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.bsmod = v;
    }

    public void setFscod(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.fscod = v;
    }

    public void setLfeon(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lfeon = v;
    }

    public void setReserved(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_13, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AC3SpecificBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AC3SpecificBox{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", bitRateCode=" + this.bitRateCode + ", reserved=" + this.reserved + '}';
    }
}

