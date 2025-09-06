package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    String value;

    static {
        Utf8AppleDataBox.ajc$preClinit();
    }

    protected Utf8AppleDataBox(String s) {
        super(s, 1);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        Utf8AppleDataBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 20);
        Utf8AppleDataBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 28);
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.value.getBytes(Charset.forName("UTF-8")).length;
    }

    public String getValue() {
        JoinPoint joinPoint0 = Factory.makeJP(Utf8AppleDataBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(!this.isParsed()) {
            this.parseDetails();
        }
        return this.value;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        this.value = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
    }

    public void setValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(Utf8AppleDataBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.value = s;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    @DoNotParseDetail
    public byte[] writeData() {
        return Utf8.convert(this.value);
    }
}

