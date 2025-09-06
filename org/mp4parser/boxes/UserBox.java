package org.mp4parser.boxes;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class UserBox extends AbstractBox {
    public static final String TYPE = "uuid";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    byte[] data;

    static {
        UserBox.ajc$preClinit();
    }

    public UserBox(byte[] arr_b) {
        super("uuid", arr_b);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        this.data = arr_b;
        byteBuffer0.get(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("UserBox.java", UserBox.class);
        UserBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        UserBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getData", "org.mp4parser.boxes.UserBox", "", "", "", "[B"), 0x2F);
        UserBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setData", "org.mp4parser.boxes.UserBox", "[B", "data", "", "void"), 51);
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
        JoinPoint joinPoint0 = Factory.makeJP(UserBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    public void setData(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(UserBox.ajc$tjp_2, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.data = arr_b;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(UserBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "UserBox[type=" + this.getType() + ";userType=" + new String(this.getUserType()) + ";contentLength=" + this.data.length + "]";
    }
}

