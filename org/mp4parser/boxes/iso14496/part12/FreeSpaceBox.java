package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class FreeSpaceBox extends AbstractBox {
    public static final String TYPE = "skip";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    byte[] data;

    static {
        FreeSpaceBox.ajc$preClinit();
    }

    public FreeSpaceBox() {
        super("skip");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        this.data = arr_b;
        byteBuffer0.get(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("FreeSpaceBox.java", FreeSpaceBox.class);
        FreeSpaceBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "[B"), 42);
        FreeSpaceBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "[B", "data", "", "void"), 46);
        FreeSpaceBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.data);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)this.data.length;
    }

    public byte[] getData() {
        JoinPoint joinPoint0 = Factory.makeJP(FreeSpaceBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    public void setData(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(FreeSpaceBox.ajc$tjp_1, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.data = arr_b;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(FreeSpaceBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "FreeSpaceBox[size=" + this.data.length + ";type=" + this.getType() + "]";
    }
}

