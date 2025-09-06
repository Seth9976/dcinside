package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class DoViConfigurationBox extends AbstractBox {
    public static final String TYPE = "dvcC";
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
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private boolean blPresentFlag;
    private int dvLevel;
    private int dvProfile;
    private int dvVersionMajor;
    private int dvVersionMinor;
    private boolean elPresentFlag;
    private long reserved1;
    private long reserved2;
    private long reserved3;
    private long reserved4;
    private long reserved5;
    private boolean rpuPresentFlag;

    static {
        DoViConfigurationBox.ajc$preClinit();
    }

    public DoViConfigurationBox() {
        super("dvcC");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.dvVersionMajor = IsoTypeReader.readUInt8(byteBuffer0);
        this.dvVersionMinor = IsoTypeReader.readUInt8(byteBuffer0);
        int v = IsoTypeReader.readUInt16(byteBuffer0);
        this.dvProfile = v >> 9 & 0x7F;
        this.dvLevel = v >> 3 & 0x3F;
        boolean z = false;
        this.rpuPresentFlag = (v & 4) > 0;
        this.elPresentFlag = (v & 2) > 0;
        if((v & 1) > 0) {
            z = true;
        }
        this.blPresentFlag = z;
        this.reserved1 = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved2 = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved3 = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved4 = IsoTypeReader.readUInt32(byteBuffer0);
        this.reserved5 = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("DoViConfigurationBox.java", DoViConfigurationBox.class);
        DoViConfigurationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 70);
        DoViConfigurationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMajor", "", "void"), 74);
        DoViConfigurationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 110);
        DoViConfigurationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "elPresentFlag", "", "void"), 0x72);
        DoViConfigurationBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 0x76);
        DoViConfigurationBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "blPresentFlag", "", "void"), 0x7A);
        DoViConfigurationBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 0x7E);
        DoViConfigurationBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved1", "", "void"), 130);
        DoViConfigurationBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 0x86);
        DoViConfigurationBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved2", "", "void"), 0x8A);
        DoViConfigurationBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 0x8E);
        DoViConfigurationBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved3", "", "void"), 0x92);
        DoViConfigurationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 78);
        DoViConfigurationBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 150);
        DoViConfigurationBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved4", "", "void"), 0x9A);
        DoViConfigurationBox.ajc$tjp_22 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"), 0x9E);
        DoViConfigurationBox.ajc$tjp_23 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved5", "", "void"), 0xA2);
        DoViConfigurationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMinor", "", "void"), 82);
        DoViConfigurationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 86);
        DoViConfigurationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvProfile", "", "void"), 90);
        DoViConfigurationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"), 94);
        DoViConfigurationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvLevel", "", "void"), 98);
        DoViConfigurationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "boolean"), 102);
        DoViConfigurationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "boolean", "rpuPresentFlag", "", "void"), 106);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.dvVersionMajor);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.dvVersionMinor);
        int v = ((this.dvProfile & 0x7F) << 9) + ((this.dvProfile & 0x3F) << 3);
        int v1 = 0;
        int v2 = this.rpuPresentFlag ? 4 : 0;
        if(this.elPresentFlag) {
            v1 = 2;
        }
        IsoTypeWriter.writeUInt16(byteBuffer0, v + v2 + v1 + this.blPresentFlag);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved2);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved3);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved4);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved5);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public int getDvLevel() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dvLevel;
    }

    public int getDvProfile() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dvProfile;
    }

    public int getDvVersionMajor() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dvVersionMajor;
    }

    public int getDvVersionMinor() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dvVersionMinor;
    }

    public long getReserved1() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved1;
    }

    public long getReserved2() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved2;
    }

    public long getReserved3() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved3;
    }

    public long getReserved4() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved4;
    }

    public long getReserved5() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved5;
    }

    public boolean isBlPresentFlag() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.blPresentFlag;
    }

    public boolean isElPresentFlag() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.elPresentFlag;
    }

    public boolean isRpuPresentFlag() {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.rpuPresentFlag;
    }

    public void setBlPresentFlag(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_13, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.blPresentFlag = z;
    }

    public void setDvLevel(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dvLevel = v;
    }

    public void setDvProfile(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dvProfile = v;
    }

    public void setDvVersionMajor(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dvVersionMajor = v;
    }

    public void setDvVersionMinor(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dvVersionMinor = v;
    }

    public void setElPresentFlag(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_11, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.elPresentFlag = z;
    }

    public void setReserved1(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_15, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved1 = v;
    }

    public void setReserved2(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_17, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved2 = v;
    }

    public void setReserved3(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_19, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved3 = v;
    }

    public void setReserved4(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_21, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved4 = v;
    }

    public void setReserved5(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_23, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved5 = v;
    }

    public void setRpuPresentFlag(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(DoViConfigurationBox.ajc$tjp_9, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.rpuPresentFlag = z;
    }
}

