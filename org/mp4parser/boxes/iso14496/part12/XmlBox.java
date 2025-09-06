package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class XmlBox extends AbstractFullBox {
    public static final String TYPE = "xml ";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    String xml;

    static {
        XmlBox.ajc$preClinit();
    }

    public XmlBox() {
        super("xml ");
        this.xml = "";
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.xml = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("XmlBox.java", XmlBox.class);
        XmlBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getXml", "org.mp4parser.boxes.iso14496.part12.XmlBox", "", "", "", "java.lang.String"), 20);
        XmlBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setXml", "org.mp4parser.boxes.iso14496.part12.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        XmlBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.XmlBox", "", "", "", "java.lang.String"), 46);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(Utf8.convert(this.xml));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.xml) + 4);
    }

    public String getXml() {
        JoinPoint joinPoint0 = Factory.makeJP(XmlBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.xml;
    }

    public void setXml(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(XmlBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.xml = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(XmlBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "XmlBox{xml=\'" + this.xml + '\'' + '}';
    }
}

