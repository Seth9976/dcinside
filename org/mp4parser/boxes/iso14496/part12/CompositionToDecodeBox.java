package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class CompositionToDecodeBox extends AbstractFullBox {
    public static final String TYPE = "cslg";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    static {
        CompositionToDecodeBox.ajc$preClinit();
    }

    public CompositionToDecodeBox() {
        super("cslg");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer0.getInt();
        this.leastDisplayOffset = byteBuffer0.getInt();
        this.greatestDisplayOffset = byteBuffer0.getInt();
        this.displayStartTime = byteBuffer0.getInt();
        this.displayEndTime = byteBuffer0.getInt();
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("CompositionToDecodeBox.java", CompositionToDecodeBox.class);
        CompositionToDecodeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 60);
        CompositionToDecodeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 0x40);
        CompositionToDecodeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 68);
        CompositionToDecodeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "leastDisplayOffset", "", "void"), 72);
        CompositionToDecodeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 76);
        CompositionToDecodeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "greatestDisplayOffset", "", "void"), 80);
        CompositionToDecodeBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 84);
        CompositionToDecodeBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayStartTime", "", "void"), 88);
        CompositionToDecodeBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 92);
        CompositionToDecodeBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayEndTime", "", "void"), 0x60);
    }

    public int getCompositionOffsetToDisplayOffsetShift() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.compositionOffsetToDisplayOffsetShift;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer0.putInt(this.leastDisplayOffset);
        byteBuffer0.putInt(this.greatestDisplayOffset);
        byteBuffer0.putInt(this.displayStartTime);
        byteBuffer0.putInt(this.displayEndTime);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public int getDisplayEndTime() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.displayEndTime;
    }

    public int getDisplayStartTime() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.displayStartTime;
    }

    public int getGreatestDisplayOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.greatestDisplayOffset;
    }

    public int getLeastDisplayOffset() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.leastDisplayOffset;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.compositionOffsetToDisplayOffsetShift = v;
    }

    public void setDisplayEndTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.displayEndTime = v;
    }

    public void setDisplayStartTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.displayStartTime = v;
    }

    public void setGreatestDisplayOffset(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.greatestDisplayOffset = v;
    }

    public void setLeastDisplayOffset(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionToDecodeBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.leastDisplayOffset = v;
    }
}

