package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class PixelAspectRationAtom extends AbstractBox {
    public static final String TYPE = "pasp";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private int hSpacing;
    private int vSpacing;

    static {
        PixelAspectRationAtom.ajc$preClinit();
    }

    public PixelAspectRationAtom() {
        super("pasp");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.hSpacing = byteBuffer0.getInt();
        this.vSpacing = byteBuffer0.getInt();
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("PixelAspectRationAtom.java", PixelAspectRationAtom.class);
        PixelAspectRationAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "gethSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 0x1F);
        PixelAspectRationAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "sethSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "hSpacing", "", "void"), 35);
        PixelAspectRationAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getvSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 39);
        PixelAspectRationAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setvSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "vSpacing", "", "void"), 43);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.putInt(this.hSpacing);
        byteBuffer0.putInt(this.vSpacing);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public int gethSpacing() {
        JoinPoint joinPoint0 = Factory.makeJP(PixelAspectRationAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.hSpacing;
    }

    public int getvSpacing() {
        JoinPoint joinPoint0 = Factory.makeJP(PixelAspectRationAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.vSpacing;
    }

    public void sethSpacing(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PixelAspectRationAtom.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.hSpacing = v;
    }

    public void setvSpacing(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PixelAspectRationAtom.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.vSpacing = v;
    }
}

