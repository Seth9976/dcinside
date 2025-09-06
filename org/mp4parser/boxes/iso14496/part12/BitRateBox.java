package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        BitRateBox.ajc$preClinit();
    }

    public BitRateBox() {
        super("btrt");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.bufferSizeDb = IsoTypeReader.readUInt32(byteBuffer0);
        this.maxBitrate = IsoTypeReader.readUInt32(byteBuffer0);
        this.avgBitrate = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("BitRateBox.java", BitRateBox.class);
        BitRateBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBufferSizeDb", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"), 75);
        BitRateBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBufferSizeDb", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"), 84);
        BitRateBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"), 93);
        BitRateBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMaxBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"), 102);
        BitRateBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"), 0x6F);
        BitRateBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAvgBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"), 120);
    }

    public long getAvgBitrate() {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.bufferSizeDb;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt32(byteBuffer0, this.bufferSizeDb);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.avgBitrate);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxBitrate;
    }

    public void setAvgBitrate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avgBitrate = v;
    }

    public void setBufferSizeDb(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.bufferSizeDb = v;
    }

    public void setMaxBitrate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(BitRateBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.maxBitrate = v;
    }
}

