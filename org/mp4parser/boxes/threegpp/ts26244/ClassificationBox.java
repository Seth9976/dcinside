package org.mp4parser.boxes.threegpp.ts26244;

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

public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = "clsf";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ClassificationBox.ajc$preClinit();
    }

    public ClassificationBox() {
        super("clsf");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        this.classificationEntity = IsoFile.bytesToFourCC(arr_b);
        this.classificationTableIndex = IsoTypeReader.readUInt16(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.classificationInfo = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ClassificationBox.java", ClassificationBox.class);
        ClassificationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ClassificationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "language", "", "void"), 0x30);
        ClassificationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getClassificationEntity", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"), 52);
        ClassificationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setClassificationEntity", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 56);
        ClassificationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getClassificationTableIndex", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "int"), 60);
        ClassificationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setClassificationTableIndex", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "int", "classificationTableIndex", "", "void"), 0x40);
        ClassificationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getClassificationInfo", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"), 68);
        ClassificationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setClassificationInfo", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ClassificationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public String getClassificationEntity() {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.classificationTableIndex;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.classificationEntity));
        IsoTypeWriter.writeUInt16(byteBuffer0, this.classificationTableIndex);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.classificationInfo));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.classificationInfo) + 9);
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public void setClassificationEntity(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.classificationEntity = s;
    }

    public void setClassificationInfo(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_7, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.classificationInfo = s;
    }

    public void setClassificationTableIndex(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.classificationTableIndex = v;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(ClassificationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "ClassificationBox[language=" + this.getLanguage() + "classificationEntity=" + this.getClassificationEntity() + ";classificationTableIndex=" + this.getClassificationTableIndex() + ";language=" + this.getLanguage() + ";classificationInfo=" + this.getClassificationInfo() + "]";
    }
}

