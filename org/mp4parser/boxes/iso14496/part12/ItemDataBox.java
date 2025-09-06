package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class ItemDataBox extends AbstractBox {
    public static final String TYPE = "idat";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    ByteBuffer data;

    static {
        ItemDataBox.ajc$preClinit();
    }

    public ItemDataBox() {
        super("idat");
        this.data = ByteBuffer.allocate(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.data = byteBuffer0.slice();
        byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ItemDataBox.java", ItemDataBox.class);
        ItemDataBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getData", "org.mp4parser.boxes.iso14496.part12.ItemDataBox", "", "", "", "java.nio.ByteBuffer"), 20);
        ItemDataBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setData", "org.mp4parser.boxes.iso14496.part12.ItemDataBox", "java.nio.ByteBuffer", "data", "", "void"), 24);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.data);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)this.data.limit();
    }

    public ByteBuffer getData() {
        JoinPoint joinPoint0 = Factory.makeJP(ItemDataBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(ItemDataBox.ajc$tjp_1, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.data = byteBuffer0;
    }
}

