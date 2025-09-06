package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        HintMediaHeaderBox.ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super("hmhd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.maxPduSize = IsoTypeReader.readUInt16(byteBuffer0);
        this.avgPduSize = IsoTypeReader.readUInt16(byteBuffer0);
        this.maxBitrate = IsoTypeReader.readUInt32(byteBuffer0);
        this.avgBitrate = IsoTypeReader.readUInt32(byteBuffer0);
        IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        HintMediaHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 42);
        HintMediaHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgPduSize", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "int"), 46);
        HintMediaHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "long"), 50);
        HintMediaHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "long"), 54);
        HintMediaHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public long getAvgBitrate() {
        JoinPoint joinPoint0 = Factory.makeJP(HintMediaHeaderBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        JoinPoint joinPoint0 = Factory.makeJP(HintMediaHeaderBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avgPduSize;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.maxPduSize);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.avgPduSize);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.avgBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public long getMaxBitrate() {
        JoinPoint joinPoint0 = Factory.makeJP(HintMediaHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        JoinPoint joinPoint0 = Factory.makeJP(HintMediaHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxPduSize;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(HintMediaHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "HintMediaHeaderBox{maxPduSize=" + this.maxPduSize + ", avgPduSize=" + this.avgPduSize + ", maxBitrate=" + this.maxBitrate + ", avgBitrate=" + this.avgBitrate + '}';
    }
}

