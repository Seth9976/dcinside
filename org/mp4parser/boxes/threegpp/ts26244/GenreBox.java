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

public class GenreBox extends AbstractFullBox {
    public static final String TYPE = "gnre";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private String genre;
    private String language;

    static {
        GenreBox.ajc$preClinit();
    }

    public GenreBox() {
        super("gnre");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.genre = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("GenreBox.java", GenreBox.class);
        GenreBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.GenreBox", "", "", "", "java.lang.String"), 43);
        GenreBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.GenreBox", "java.lang.String", "language", "", "void"), 0x2F);
        GenreBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGenre", "org.mp4parser.boxes.threegpp.ts26244.GenreBox", "", "", "", "java.lang.String"), 51);
        GenreBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGenre", "org.mp4parser.boxes.threegpp.ts26244.GenreBox", "java.lang.String", "genre", "", "void"), 55);
        GenreBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.GenreBox", "", "", "", "java.lang.String"), 78);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.genre));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.genre) + 7);
    }

    public String getGenre() {
        JoinPoint joinPoint0 = Factory.makeJP(GenreBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.genre;
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(GenreBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public void setGenre(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(GenreBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.genre = s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(GenreBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(GenreBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "GenreBox[language=" + this.getLanguage() + ";genre=" + this.getGenre() + "]";
    }
}

