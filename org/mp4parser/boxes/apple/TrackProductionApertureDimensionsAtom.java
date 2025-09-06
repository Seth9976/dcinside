package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TrackProductionApertureDimensionsAtom extends AbstractFullBox {
    public static final String TYPE = "prof";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    double height;
    double width;

    static {
        TrackProductionApertureDimensionsAtom.ajc$preClinit();
    }

    public TrackProductionApertureDimensionsAtom() {
        super("prof");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackProductionApertureDimensionsAtom.java", TrackProductionApertureDimensionsAtom.class);
        TrackProductionApertureDimensionsAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getWidth", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"), 44);
        TrackProductionApertureDimensionsAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setWidth", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "width", "", "void"), 0x30);
        TrackProductionApertureDimensionsAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHeight", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"), 52);
        TrackProductionApertureDimensionsAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHeight", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "height", "", "void"), 56);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.height);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public double getHeight() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackProductionApertureDimensionsAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.height;
    }

    public double getWidth() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackProductionApertureDimensionsAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.width;
    }

    public void setHeight(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackProductionApertureDimensionsAtom.ajc$tjp_3, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.height = f;
    }

    public void setWidth(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackProductionApertureDimensionsAtom.ajc$tjp_1, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.width = f;
    }
}

