package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class ContentInformationBox extends AbstractFullBox {
    public static class BrandEntry {
        String iso_brand;
        String version;

        public BrandEntry(String s, String s1) {
            this.iso_brand = s;
            this.version = s1;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null && this.getClass() == object0.getClass()) {
                String s = this.iso_brand;
                if(s != null) {
                    if(!s.equals(((BrandEntry)object0).iso_brand)) {
                        return false;
                    }
                }
                else if(((BrandEntry)object0).iso_brand != null) {
                    return false;
                }
                String s1 = this.version;
                String s2 = ((BrandEntry)object0).version;
                return s1 == null ? s2 == null : s1.equals(s2);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.iso_brand == null ? 0 : this.iso_brand.hashCode();
            String s = this.version;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 * 0x1F + v;
        }
    }

    public static final String TYPE = "cinf";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    Map brandEntries;
    String codecs;
    Map idEntries;
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    static {
        ContentInformationBox.ajc$preClinit();
    }

    public ContentInformationBox() {
        super("cinf");
        this.brandEntries = new LinkedHashMap();
        this.idEntries = new LinkedHashMap();
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.mimeSubtypeName = IsoTypeReader.readString(byteBuffer0);
        this.profileLevelIdc = IsoTypeReader.readString(byteBuffer0);
        this.codecs = IsoTypeReader.readString(byteBuffer0);
        this.protection = IsoTypeReader.readString(byteBuffer0);
        this.languages = IsoTypeReader.readString(byteBuffer0);
        for(int v = IsoTypeReader.readUInt8(byteBuffer0); v > 0; --v) {
            this.brandEntries.put(IsoTypeReader.readString(byteBuffer0), IsoTypeReader.readString(byteBuffer0));
        }
        for(int v1 = IsoTypeReader.readUInt8(byteBuffer0); v1 > 0; --v1) {
            this.idEntries.put(IsoTypeReader.readString(byteBuffer0), IsoTypeReader.readString(byteBuffer0));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ContentInformationBox.java", ContentInformationBox.class);
        ContentInformationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMimeSubtypeName", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 0x72);
        ContentInformationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMimeSubtypeName", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 0x76);
        ContentInformationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBrandEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 0x9A);
        ContentInformationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBrandEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 0x9E);
        ContentInformationBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getIdEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 0xA2);
        ContentInformationBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setIdEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 0xA6);
        ContentInformationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProfileLevelIdc", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 0x7A);
        ContentInformationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProfileLevelIdc", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 0x7E);
        ContentInformationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCodecs", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 130);
        ContentInformationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCodecs", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 0x86);
        ContentInformationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProtection", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 0x8A);
        ContentInformationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProtection", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 0x8E);
        ContentInformationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguages", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 0x92);
        ContentInformationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguages", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"), 150);
    }

    public Map getBrandEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.brandEntries;
    }

    public String getCodecs() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.codecs;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.mimeSubtypeName);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.profileLevelIdc);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.codecs);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.protection);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.languages);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.brandEntries.size());
        for(Object object0: this.brandEntries.entrySet()) {
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, ((String)((Map.Entry)object0).getKey()));
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, ((String)((Map.Entry)object0).getValue()));
        }
        IsoTypeWriter.writeUInt8(byteBuffer0, this.idEntries.size());
        for(Object object1: this.idEntries.entrySet()) {
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, ((String)((Map.Entry)object1).getKey()));
            IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, ((String)((Map.Entry)object1).getValue()));
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = ((long)(Utf8.utf8StringLengthInBytes(this.mimeSubtypeName) + 1)) + 4L + ((long)(Utf8.utf8StringLengthInBytes(this.profileLevelIdc) + 1)) + ((long)(Utf8.utf8StringLengthInBytes(this.codecs) + 1)) + ((long)(Utf8.utf8StringLengthInBytes(this.protection) + 1)) + ((long)(Utf8.utf8StringLengthInBytes(this.languages) + 1)) + 1L;
        for(Object object0: this.brandEntries.entrySet()) {
            v = v + ((long)(Utf8.utf8StringLengthInBytes(((String)((Map.Entry)object0).getKey())) + 1)) + ((long)(Utf8.utf8StringLengthInBytes(((String)((Map.Entry)object0).getValue())) + 1));
        }
        long v1 = v + 1L;
        for(Object object1: this.idEntries.entrySet()) {
            v1 = v1 + ((long)(Utf8.utf8StringLengthInBytes(((String)((Map.Entry)object1).getKey())) + 1)) + ((long)(Utf8.utf8StringLengthInBytes(((String)((Map.Entry)object1).getValue())) + 1));
        }
        return v1;
    }

    public Map getIdEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.idEntries;
    }

    public String getLanguages() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.languages;
    }

    public String getMimeSubtypeName() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.profileLevelIdc;
    }

    public String getProtection() {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.protection;
    }

    public void setBrandEntries(Map map0) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_11, this, this, map0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.brandEntries = map0;
    }

    public void setCodecs(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.codecs = s;
    }

    public void setIdEntries(Map map0) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_13, this, this, map0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.idEntries = map0;
    }

    public void setLanguages(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_9, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.languages = s;
    }

    public void setMimeSubtypeName(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.mimeSubtypeName = s;
    }

    public void setProfileLevelIdc(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.profileLevelIdc = s;
    }

    public void setProtection(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ContentInformationBox.ajc$tjp_7, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.protection = s;
    }
}

