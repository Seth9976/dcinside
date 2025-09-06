package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class GenericMediaHeaderTextAtom extends AbstractBox {
    public static final String TYPE = "text";
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
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    int unknown_1;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9;

    static {
        GenericMediaHeaderTextAtom.ajc$preClinit();
    }

    public GenericMediaHeaderTextAtom() {
        super("text");
        this.unknown_1 = 0x10000;
        this.unknown_5 = 0x10000;
        this.unknown_9 = 0x40000000;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.unknown_1 = byteBuffer0.getInt();
        this.unknown_2 = byteBuffer0.getInt();
        this.unknown_3 = byteBuffer0.getInt();
        this.unknown_4 = byteBuffer0.getInt();
        this.unknown_5 = byteBuffer0.getInt();
        this.unknown_6 = byteBuffer0.getInt();
        this.unknown_7 = byteBuffer0.getInt();
        this.unknown_8 = byteBuffer0.getInt();
        this.unknown_9 = byteBuffer0.getInt();
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("GenericMediaHeaderTextAtom.java", GenericMediaHeaderTextAtom.class);
        GenericMediaHeaderTextAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_1", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 60);
        GenericMediaHeaderTextAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_1", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"), 0x40);
        GenericMediaHeaderTextAtom.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_6", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 100);
        GenericMediaHeaderTextAtom.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_6", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"), 104);
        GenericMediaHeaderTextAtom.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_7", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 108);
        GenericMediaHeaderTextAtom.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_7", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"), 0x70);
        GenericMediaHeaderTextAtom.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_8", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 0x74);
        GenericMediaHeaderTextAtom.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_8", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"), 120);
        GenericMediaHeaderTextAtom.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_9", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 0x7C);
        GenericMediaHeaderTextAtom.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_9", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"), 0x80);
        GenericMediaHeaderTextAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_2", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 68);
        GenericMediaHeaderTextAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_2", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"), 72);
        GenericMediaHeaderTextAtom.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_3", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 76);
        GenericMediaHeaderTextAtom.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_3", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"), 80);
        GenericMediaHeaderTextAtom.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_4", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 84);
        GenericMediaHeaderTextAtom.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_4", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"), 88);
        GenericMediaHeaderTextAtom.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getUnknown_5", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 92);
        GenericMediaHeaderTextAtom.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setUnknown_5", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"), 0x60);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.putInt(this.unknown_1);
        byteBuffer0.putInt(this.unknown_2);
        byteBuffer0.putInt(this.unknown_3);
        byteBuffer0.putInt(this.unknown_4);
        byteBuffer0.putInt(this.unknown_5);
        byteBuffer0.putInt(this.unknown_6);
        byteBuffer0.putInt(this.unknown_7);
        byteBuffer0.putInt(this.unknown_8);
        byteBuffer0.putInt(this.unknown_9);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 36L;
    }

    public int getUnknown_1() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_1;
    }

    public int getUnknown_2() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_2;
    }

    public int getUnknown_3() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_3;
    }

    public int getUnknown_4() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_4;
    }

    public int getUnknown_5() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_5;
    }

    public int getUnknown_6() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_6;
    }

    public int getUnknown_7() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_7;
    }

    public int getUnknown_8() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_8;
    }

    public int getUnknown_9() {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.unknown_9;
    }

    public void setUnknown_1(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_1 = v;
    }

    public void setUnknown_2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_2 = v;
    }

    public void setUnknown_3(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_3 = v;
    }

    public void setUnknown_4(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_4 = v;
    }

    public void setUnknown_5(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_5 = v;
    }

    public void setUnknown_6(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_6 = v;
    }

    public void setUnknown_7(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_13, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_7 = v;
    }

    public void setUnknown_8(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_15, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_8 = v;
    }

    public void setUnknown_9(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_17, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.unknown_9 = v;
    }
}

