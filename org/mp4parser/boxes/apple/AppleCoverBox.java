package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;

public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private byte[] data;

    static {
        AppleCoverBox.ajc$preClinit();
    }

    public AppleCoverBox() {
        super("covr", 1);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleCoverBox.java", AppleCoverBox.class);
        AppleCoverBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCoverData", "org.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 20);
        AppleCoverBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setJpg", "org.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 24);
        AppleCoverBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPng", "org.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 28);
    }

    public byte[] getCoverData() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleCoverBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.data.length;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[byteBuffer0.limit()];
        this.data = arr_b;
        byteBuffer0.get(arr_b);
    }

    private void setImageData(byte[] arr_b, int v) {
        this.data = arr_b;
        this.dataType = v;
    }

    public void setJpg(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleCoverBox.ajc$tjp_1, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setImageData(arr_b, 13);
    }

    public void setPng(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleCoverBox.ajc$tjp_2, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.setImageData(arr_b, 14);
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return this.data;
    }
}

