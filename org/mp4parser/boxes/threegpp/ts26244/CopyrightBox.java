package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class CopyrightBox extends AbstractFullBox {
    public static final String TYPE = "cprt";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private String copyright;
    private String language;

    static {
        CopyrightBox.ajc$preClinit();
    }

    public CopyrightBox() {
        super("cprt");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.copyright = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("CopyrightBox.java", CopyrightBox.class);
        CopyrightBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"), 0x30);
        CopyrightBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "java.lang.String", "language", "", "void"), 52);
        CopyrightBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCopyright", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"), 56);
        CopyrightBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCopyright", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "java.lang.String", "copyright", "", "void"), 60);
        CopyrightBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"), 83);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.copyright));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.copyright) + 7);
    }

    public String getCopyright() {
        JoinPoint joinPoint0 = Factory.makeJP(CopyrightBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.copyright;
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(CopyrightBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public void setCopyright(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(CopyrightBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.copyright = s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(CopyrightBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(CopyrightBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "CopyrightBox[language=" + this.getLanguage() + ";copyright=" + this.getCopyright() + "]";
    }
}

