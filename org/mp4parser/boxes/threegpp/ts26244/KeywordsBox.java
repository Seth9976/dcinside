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

public class KeywordsBox extends AbstractFullBox {
    public static final String TYPE = "kywd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private String[] keywords;
    private String language;

    static {
        KeywordsBox.ajc$preClinit();
    }

    public KeywordsBox() {
        super("kywd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.keywords = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            IsoTypeReader.readUInt8(byteBuffer0);
            String[] arr_s = this.keywords;
            arr_s[v1] = IsoTypeReader.readString(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("KeywordsBox.java", KeywordsBox.class);
        KeywordsBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "java.lang.String"), 40);
        KeywordsBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "java.lang.String", "language", "", "void"), 44);
        KeywordsBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getKeywords", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 0x30);
        KeywordsBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setKeywords", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        KeywordsBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.keywords.length);
        String[] arr_s = this.keywords;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            IsoTypeWriter.writeUInt8(byteBuffer0, Utf8.utf8StringLengthInBytes(s) + 1);
            byteBuffer0.put(Utf8.convert(s));
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        String[] arr_s = this.keywords;
        long v = 7L;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            v += (long)(Utf8.utf8StringLengthInBytes(arr_s[v1]) + 2);
        }
        return v;
    }

    public String[] getKeywords() {
        JoinPoint joinPoint0 = Factory.makeJP(KeywordsBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.keywords;
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(KeywordsBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public void setKeywords(String[] arr_s) {
        JoinPoint joinPoint0 = Factory.makeJP(KeywordsBox.ajc$tjp_3, this, this, arr_s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.keywords = arr_s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(KeywordsBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(KeywordsBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("KeywordsBox[language=");
        stringBuffer0.append(this.getLanguage());
        for(int v = 0; v < this.keywords.length; ++v) {
            stringBuffer0.append(";keyword");
            stringBuffer0.append(v);
            stringBuffer0.append("=");
            stringBuffer0.append(this.keywords[v]);
        }
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }
}

