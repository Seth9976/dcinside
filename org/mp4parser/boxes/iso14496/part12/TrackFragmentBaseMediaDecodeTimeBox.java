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

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox {
    public static final String TYPE = "tfdt";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private long baseMediaDecodeTime;

    static {
        TrackFragmentBaseMediaDecodeTimeBox.ajc$preClinit();
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super("tfdt");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            this.baseMediaDecodeTime = IsoTypeReader.readUInt64(byteBuffer0);
            return;
        }
        this.baseMediaDecodeTime = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackFragmentBaseMediaDecodeTimeBox.java", TrackFragmentBaseMediaDecodeTimeBox.class);
        TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBaseMediaDecodeTime", "org.mp4parser.boxes.iso14496.part12.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBaseMediaDecodeTime", "org.mp4parser.boxes.iso14496.part12.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    public long getBaseMediaDecodeTime() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.baseMediaDecodeTime;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, this.baseMediaDecodeTime);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, this.baseMediaDecodeTime);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 0 ? 8L : 12L;
    }

    public void setBaseMediaDecodeTime(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.baseMediaDecodeTime = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=" + this.baseMediaDecodeTime + '}';
    }
}

