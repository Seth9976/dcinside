package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = "trex";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        TrackExtendsBox.ajc$preClinit();
    }

    public TrackExtendsBox() {
        super("trex");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer0);
        this.defaultSampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer0);
        this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer0);
        this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer0);
        this.defaultSampleFlags = new SampleFlags(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackExtendsBox.java", TrackExtendsBox.class);
        TrackExtendsBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"), 72);
        TrackExtendsBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "trackId", "", "void"), 76);
        TrackExtendsBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleFlagsStr", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "java.lang.String"), 0x71);
        TrackExtendsBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"), 80);
        TrackExtendsBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 84);
        TrackExtendsBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"), 88);
        TrackExtendsBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 92);
        TrackExtendsBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"), 0x60);
        TrackExtendsBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 100);
        TrackExtendsBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"), 104);
        TrackExtendsBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "defaultSampleFlags", "", "void"), 108);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.defaultSampleDescriptionIndex);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.defaultSampleDuration);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.defaultSampleSize);
        this.defaultSampleFlags.getContent(byteBuffer0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public long getDefaultSampleDescriptionIndex() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleFlags{reserved=0, isLeading=0, depOn=0, isDepOn=0, hasRedundancy=0, padValue=0, isDiffSample=false, degradPrio=0}";
    }

    public long getDefaultSampleSize() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultSampleDescriptionIndex = v;
    }

    public void setDefaultSampleDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultSampleDuration = v;
    }

    public void setDefaultSampleFlags(SampleFlags sampleFlags0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_9, this, this, sampleFlags0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultSampleFlags = sampleFlags0;
    }

    public void setDefaultSampleSize(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultSampleSize = v;
    }

    public void setTrackId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackExtendsBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackId = v;
    }
}

