package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class RatingBox extends AbstractFullBox {
    public static final String TYPE = "rtng";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        RatingBox.ajc$preClinit();
    }

    public RatingBox() {
        super("rtng");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.ratingEntity = IsoTypeReader.read4cc(byteBuffer0);
        this.ratingCriteria = IsoTypeReader.read4cc(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.ratingInfo = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("RatingBox.java", RatingBox.class);
        RatingBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"), 45);
        RatingBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "language", "", "void"), 49);
        RatingBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRatingEntity", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"), 60);
        RatingBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRatingEntity", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 0x40);
        RatingBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRatingCriteria", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"), 74);
        RatingBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRatingCriteria", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 78);
        RatingBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRatingInfo", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"), 82);
        RatingBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRatingInfo", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 86);
        RatingBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"), 0x72);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.ratingEntity));
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.ratingCriteria));
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.ratingInfo));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.ratingInfo) + 15);
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public String getRatingCriteria() {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.ratingInfo;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    public void setRatingCriteria(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_5, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.ratingCriteria = s;
    }

    public void setRatingEntity(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.ratingEntity = s;
    }

    public void setRatingInfo(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_7, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.ratingInfo = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(RatingBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "RatingBox[language=" + this.getLanguage() + "ratingEntity=" + this.getRatingEntity() + ";ratingCriteria=" + this.getRatingCriteria() + ";language=" + this.getLanguage() + ";ratingInfo=" + this.getRatingInfo() + "]";
    }
}

