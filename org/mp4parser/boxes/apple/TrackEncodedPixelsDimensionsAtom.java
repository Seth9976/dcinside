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

public class TrackEncodedPixelsDimensionsAtom extends AbstractFullBox {
    public static final String TYPE = "enof";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    double height;
    double width;

    static {
        TrackEncodedPixelsDimensionsAtom.ajc$preClinit();
    }

    public TrackEncodedPixelsDimensionsAtom() {
        super("enof");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackEncodedPixelsDimensionsAtom.java", TrackEncodedPixelsDimensionsAtom.class);
        TrackEncodedPixelsDimensionsAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getWidth", "org.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", "double"), 44);
        TrackEncodedPixelsDimensionsAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setWidth", "org.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "double", "width", "", "void"), 0x30);
        TrackEncodedPixelsDimensionsAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHeight", "org.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", "double"), 52);
        TrackEncodedPixelsDimensionsAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHeight", "org.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "double", "height", "", "void"), 56);
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
        JoinPoint joinPoint0 = Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.height;
    }

    public double getWidth() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.width;
    }

    public void setHeight(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_3, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.height = f;
    }

    public void setWidth(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_1, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.width = f;
    }
}

