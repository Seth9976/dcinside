package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private long[] sampleNumber;

    static {
        SyncSampleBox.ajc$preClinit();
    }

    public SyncSampleBox() {
        super("stss");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.sampleNumber = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            long[] arr_v = this.sampleNumber;
            arr_v[v1] = IsoTypeReader.readUInt32(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SyncSampleBox.java", SyncSampleBox.class);
        SyncSampleBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "[J"), 45);
        SyncSampleBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "[J", "sampleNumber", "", "void"), 49);
        SyncSampleBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "java.lang.String"), 80);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.sampleNumber.length));
        long[] arr_v = this.sampleNumber;
        for(int v = 0; v < arr_v.length; ++v) {
            IsoTypeWriter.writeUInt32(byteBuffer0, arr_v[v]);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.sampleNumber.length * 4 + 8);
    }

    public long[] getSampleNumber() {
        JoinPoint joinPoint0 = Factory.makeJP(SyncSampleBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(SyncSampleBox.ajc$tjp_1, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleNumber = arr_v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SyncSampleBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SyncSampleBox[entryCount=" + this.sampleNumber.length + "]";
    }
}

