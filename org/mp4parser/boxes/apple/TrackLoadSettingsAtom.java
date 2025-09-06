package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class TrackLoadSettingsAtom extends AbstractBox {
    public static final String TYPE = "load";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;

    static {
        TrackLoadSettingsAtom.ajc$preClinit();
    }

    public TrackLoadSettingsAtom() {
        super("load");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.preloadStartTime = byteBuffer0.getInt();
        this.preloadDuration = byteBuffer0.getInt();
        this.preloadFlags = byteBuffer0.getInt();
        this.defaultHints = byteBuffer0.getInt();
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackLoadSettingsAtom.java", TrackLoadSettingsAtom.class);
        TrackLoadSettingsAtom.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPreloadStartTime", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 49);
        TrackLoadSettingsAtom.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPreloadStartTime", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadStartTime", "", "void"), 53);
        TrackLoadSettingsAtom.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPreloadDuration", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 57);
        TrackLoadSettingsAtom.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPreloadDuration", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadDuration", "", "void"), 61);
        TrackLoadSettingsAtom.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPreloadFlags", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 65);
        TrackLoadSettingsAtom.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPreloadFlags", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadFlags", "", "void"), 69);
        TrackLoadSettingsAtom.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultHints", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 73);
        TrackLoadSettingsAtom.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultHints", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "defaultHints", "", "void"), 77);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.putInt(this.preloadStartTime);
        byteBuffer0.putInt(this.preloadDuration);
        byteBuffer0.putInt(this.preloadFlags);
        byteBuffer0.putInt(this.defaultHints);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 16L;
    }

    public int getDefaultHints() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultHints;
    }

    public int getPreloadDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.preloadDuration;
    }

    public int getPreloadFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.preloadFlags;
    }

    public int getPreloadStartTime() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.preloadStartTime;
    }

    public void setDefaultHints(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultHints = v;
    }

    public void setPreloadDuration(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.preloadDuration = v;
    }

    public void setPreloadFlags(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.preloadFlags = v;
    }

    public void setPreloadStartTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackLoadSettingsAtom.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.preloadStartTime = v;
    }
}

