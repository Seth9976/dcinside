package org.mp4parser.boxes.oma;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {
    public static final String TYPE = "odaf";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    static {
        OmaDrmAccessUnitFormatBox.ajc$preClinit();
    }

    public OmaDrmAccessUnitFormatBox() {
        super("odaf");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        byte b = (byte)IsoTypeReader.readUInt8(byteBuffer0);
        this.allBits = b;
        this.selectiveEncryption = (b & 0x80) == 0x80;
        this.keyIndicatorLength = IsoTypeReader.readUInt8(byteBuffer0);
        this.initVectorLength = IsoTypeReader.readUInt8(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("OmaDrmAccessUnitFormatBox.java", OmaDrmAccessUnitFormatBox.class);
        OmaDrmAccessUnitFormatBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isSelectiveEncryption", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        OmaDrmAccessUnitFormatBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getKeyIndicatorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        OmaDrmAccessUnitFormatBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setKeyIndicatorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 54);
        OmaDrmAccessUnitFormatBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getInitVectorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 58);
        OmaDrmAccessUnitFormatBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setInitVectorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 62);
        OmaDrmAccessUnitFormatBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAllBits", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt8(byteBuffer0, ((int)this.allBits));
        IsoTypeWriter.writeUInt8(byteBuffer0, this.keyIndicatorLength);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.initVectorLength);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 7L;
    }

    public int getInitVectorLength() {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.initVectorLength;
    }

    public int getKeyIndicatorLength() {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.keyIndicatorLength;
    }

    public boolean isSelectiveEncryption() {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.selectiveEncryption;
    }

    public void setAllBits(byte b) {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_5, this, this, Conversions.byteObject(b));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.allBits = b;
        this.selectiveEncryption = (b & 0x80) == 0x80;
    }

    public void setInitVectorLength(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_4, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.initVectorLength = v;
    }

    public void setKeyIndicatorLength(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_2, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.keyIndicatorLength = v;
    }
}

