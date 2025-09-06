package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Mp4Arrays;

public class TrackReferenceTypeBox extends AbstractBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    long[] trackIds;

    static {
        TrackReferenceTypeBox.ajc$preClinit();
    }

    public TrackReferenceTypeBox(String s) {
        super(s);
        this.trackIds = new long[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        while(byteBuffer0.remaining() >= 4) {
            this.trackIds = Mp4Arrays.copyOfAndAppend(this.trackIds, new long[]{IsoTypeReader.readUInt32(byteBuffer0)});
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        TrackReferenceTypeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "", "", "", "[J"), 58);
        TrackReferenceTypeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "[J", "trackIds", "", "void"), 62);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        long[] arr_v = this.trackIds;
        for(int v = 0; v < arr_v.length; ++v) {
            IsoTypeWriter.writeUInt32(byteBuffer0, arr_v[v]);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.trackIds.length * 4);
    }

    public long[] getTrackIds() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackReferenceTypeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackIds;
    }

    public void setTrackIds(long[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackReferenceTypeBox.ajc$tjp_1, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackIds = arr_v;
    }
}

