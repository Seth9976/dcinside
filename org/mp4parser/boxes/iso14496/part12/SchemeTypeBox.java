package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class SchemeTypeBox extends AbstractFullBox {
    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    static {
        SchemeTypeBox.ajc$preClinit();
    }

    public SchemeTypeBox() {
        super("schm");
        this.schemeType = "    ";
        this.schemeUri = null;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.schemeType = IsoTypeReader.read4cc(byteBuffer0);
        this.schemeVersion = IsoTypeReader.readUInt32(byteBuffer0);
        if((this.getFlags() & 1) == 1) {
            this.schemeUri = IsoTypeReader.readString(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SchemeTypeBox.java", SchemeTypeBox.class);
        SchemeTypeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSchemeType", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        SchemeTypeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSchemeType", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 0x30);
        SchemeTypeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSchemeVersion", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "long"), 53);
        SchemeTypeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSchemeVersion", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "int", "schemeVersion", "", "void"), 57);
        SchemeTypeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSchemeUri", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"), 61);
        SchemeTypeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSchemeUri", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        SchemeTypeBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.schemeType));
        IsoTypeWriter.writeUInt32(byteBuffer0, this.schemeVersion);
        if((this.getFlags() & 1) == 1) {
            byteBuffer0.put(Utf8.convert(this.schemeUri));
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (this.getFlags() & 1) == 1 ? ((long)(Utf8.utf8StringLengthInBytes(this.schemeUri) + 13)) : 12L;
    }

    public String getSchemeType() {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.schemeType;
    }

    public String getSchemeUri() {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.schemeVersion;
    }

    public void setSchemeType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.schemeType = s;
    }

    public void setSchemeUri(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.schemeUri = s;
    }

    public void setSchemeVersion(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.schemeVersion = (long)v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SchemeTypeBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "Schema Type Box[schemeUri=" + this.schemeUri + "; " + "schemeType=" + this.schemeType + "; " + "schemeVersion=" + this.schemeVersion + "; " + "]";
    }
}

