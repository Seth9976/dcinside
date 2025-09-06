package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;

public class AppleTrackNumberBox extends AppleDataBox {
    int a;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    int b;

    static {
        AppleTrackNumberBox.ajc$preClinit();
    }

    public AppleTrackNumberBox() {
        super("trkn", 0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleTrackNumberBox.java", AppleTrackNumberBox.class);
        AppleTrackNumberBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getA", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 16);
        AppleTrackNumberBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setA", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", "", "void"), 20);
        AppleTrackNumberBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getB", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 24);
        AppleTrackNumberBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setB", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "b", "", "void"), 28);
    }

    public int getA() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleTrackNumberBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.a;
    }

    public int getB() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleTrackNumberBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.b;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 8;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0.getInt();
        this.b = byteBuffer0.getInt();
    }

    public void setA(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleTrackNumberBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.a = v;
    }

    public void setB(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleTrackNumberBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.b = v;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.putInt(this.a);
        byteBuffer0.putInt(this.b);
        return byteBuffer0.array();
    }
}

