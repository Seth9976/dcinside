package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.Utf8;

public class AppleGPSCoordinatesBox extends AbstractBox {
    private static final int DEFAULT_LANG = 5575;
    public static final String TYPE = "©xyz";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    String coords;
    int lang;

    static {
        AppleGPSCoordinatesBox.ajc$preClinit();
    }

    public AppleGPSCoordinatesBox() {
        super("©xyz");
        this.lang = 5575;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.getShort();
        this.lang = byteBuffer0.getShort();
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        this.coords = Utf8.convert(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleGPSCoordinatesBox.java", AppleGPSCoordinatesBox.class);
        AppleGPSCoordinatesBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getValue", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 22);
        AppleGPSCoordinatesBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setValue", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "java.lang.String", "iso6709String", "", "void"), 26);
        AppleGPSCoordinatesBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 52);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.putShort(((short)this.coords.length()));
        byteBuffer0.putShort(((short)this.lang));
        byteBuffer0.put(Utf8.convert(this.coords));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.coords) + 4);
    }

    public String getValue() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleGPSCoordinatesBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.coords;
    }

    public void setValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleGPSCoordinatesBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.lang = 5575;
        this.coords = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleGPSCoordinatesBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AppleGPSCoordinatesBox[" + this.coords + "]";
    }
}

