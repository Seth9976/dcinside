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

public class TitleBox extends AbstractFullBox {
    public static final String TYPE = "titl";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private String language;
    private String title;

    static {
        TitleBox.ajc$preClinit();
    }

    public TitleBox() {
        super("titl");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.title = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TitleBox.java", TitleBox.class);
        TitleBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.TitleBox", "", "", "", "java.lang.String"), 0x2F);
        TitleBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.TitleBox", "java.lang.String", "language", "", "void"), 56);
        TitleBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTitle", "org.mp4parser.boxes.threegpp.ts26244.TitleBox", "", "", "", "java.lang.String"), 60);
        TitleBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTitle", "org.mp4parser.boxes.threegpp.ts26244.TitleBox", "java.lang.String", "title", "", "void"), 0x40);
        TitleBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.TitleBox", "", "", "", "java.lang.String"), 87);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.title));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.title) + 7);
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(TitleBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public String getTitle() {
        JoinPoint joinPoint0 = Factory.makeJP(TitleBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.title;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(TitleBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    public void setTitle(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(TitleBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.title = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TitleBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TitleBox[language=" + this.getLanguage() + ";title=" + this.getTitle() + "]";
    }
}

