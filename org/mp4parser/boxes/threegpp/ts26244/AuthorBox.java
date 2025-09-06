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

public class AuthorBox extends AbstractFullBox {
    public static final String TYPE = "auth";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private String author;
    private String language;

    static {
        AuthorBox.ajc$preClinit();
    }

    public AuthorBox() {
        super("auth");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.author = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AuthorBox.java", AuthorBox.class);
        AuthorBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"), 52);
        AuthorBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "java.lang.String", "language", "", "void"), 56);
        AuthorBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAuthor", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"), 65);
        AuthorBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAuthor", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "java.lang.String", "author", "", "void"), 69);
        AuthorBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"), 93);
    }

    public String getAuthor() {
        JoinPoint joinPoint0 = Factory.makeJP(AuthorBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.author;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.author));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.author) + 7);
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(AuthorBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public void setAuthor(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AuthorBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.author = s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AuthorBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AuthorBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AuthorBox[language=" + this.getLanguage() + ";author=" + this.getAuthor() + "]";
    }
}

