package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;

public class AppleDiskNumberBox extends AppleDataBox {
    int a;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    short b;

    static {
        AppleDiskNumberBox.ajc$preClinit();
    }

    public AppleDiskNumberBox() {
        super("disk", 0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleDiskNumberBox.java", AppleDiskNumberBox.class);
        AppleDiskNumberBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getA", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "int"), 16);
        AppleDiskNumberBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setA", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "int", "a", "", "void"), 20);
        AppleDiskNumberBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getB", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "short"), 24);
        AppleDiskNumberBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setB", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "short", "b", "", "void"), 28);
    }

    public int getA() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDiskNumberBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.a;
    }

    public short getB() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDiskNumberBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.b;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 6;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0.getInt();
        this.b = byteBuffer0.getShort();
    }

    public void setA(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDiskNumberBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.a = v;
    }

    public void setB(short v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDiskNumberBox.ajc$tjp_3, this, this, Conversions.shortObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.b = v;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(6);
        byteBuffer0.putInt(this.a);
        byteBuffer0.putShort(this.b);
        return byteBuffer0.array();
    }
}

