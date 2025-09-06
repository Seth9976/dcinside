package org.mp4parser.boxes;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class UnknownBox extends AbstractBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    ByteBuffer data;

    static {
        UnknownBox.ajc$preClinit();
    }

    public UnknownBox(String s) {
        super(s);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.data = byteBuffer0;
        byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("UnknownBox.java", UnknownBox.class);
        UnknownBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getData", "org.mp4parser.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 53);
        UnknownBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setData", "org.mp4parser.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 57);
        UnknownBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.UnknownBox", "", "", "", "java.lang.String"), 62);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.data.rewind();
        byteBuffer0.put(this.data);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)this.data.limit();
    }

    public ByteBuffer getData() {
        JoinPoint joinPoint0 = Factory.makeJP(UnknownBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(UnknownBox.ajc$tjp_1, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.data = byteBuffer0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(UnknownBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "UnknownBox{type=" + this.type + '}';
    }
}

