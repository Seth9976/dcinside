package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class FileTypeBox extends AbstractBox {
    public static final String TYPE = "ftyp";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private List compatibleBrands;
    private String majorBrand;
    private long minorVersion;

    static {
        FileTypeBox.ajc$preClinit();
    }

    public FileTypeBox() {
        super("ftyp");
        this.compatibleBrands = Collections.emptyList();
    }

    public FileTypeBox(String s, long v, List list0) {
        super("ftyp");
        Collections.emptyList();
        this.majorBrand = s;
        this.minorVersion = v;
        this.compatibleBrands = list0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.majorBrand = IsoTypeReader.read4cc(byteBuffer0);
        this.minorVersion = IsoTypeReader.readUInt32(byteBuffer0);
        int v = byteBuffer0.remaining();
        this.compatibleBrands = new LinkedList();
        for(int v1 = 0; v1 < v / 4; ++v1) {
            this.compatibleBrands.add(IsoTypeReader.read4cc(byteBuffer0));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("FileTypeBox.java", FileTypeBox.class);
        FileTypeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.lang.String"), 85);
        FileTypeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMajorBrand", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        FileTypeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "long"), 104);
        FileTypeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMinorVersion", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "long", "minorVersion", "", "void"), 0x71);
        FileTypeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "", "", "", "java.util.List"), 0x7A);
        FileTypeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 0x7E);
    }

    public List getCompatibleBrands() {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.compatibleBrands;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.majorBrand));
        IsoTypeWriter.writeUInt32(byteBuffer0, this.minorVersion);
        for(Object object0: this.compatibleBrands) {
            byteBuffer0.put(IsoFile.fourCCtoBytes(((String)object0)));
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.compatibleBrands.size() * 4 + 8);
    }

    public String getMajorBrand() {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.majorBrand;
    }

    public long getMinorVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.minorVersion;
    }

    public void setCompatibleBrands(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_5, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.compatibleBrands = list0;
    }

    public void setMajorBrand(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.majorBrand = s;
    }

    public void setMinorVersion(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(FileTypeBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.minorVersion = v;
    }

    @Override
    @DoNotParseDetail
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FileTypeBox[");
        stringBuilder0.append("majorBrand=");
        stringBuilder0.append(this.getMajorBrand());
        stringBuilder0.append(";");
        stringBuilder0.append("minorVersion=");
        stringBuilder0.append(this.getMinorVersion());
        for(Object object0: this.compatibleBrands) {
            stringBuilder0.append(";");
            stringBuilder0.append("compatibleBrand=");
            stringBuilder0.append(((String)object0));
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

