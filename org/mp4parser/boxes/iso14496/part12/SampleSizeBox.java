package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
        SampleSizeBox.ajc$preClinit();
    }

    public SampleSizeBox() {
        super("stsz");
        this.sampleSizes = new long[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.sampleSize = IsoTypeReader.readUInt32(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.sampleCount = v;
        if(this.sampleSize == 0L) {
            this.sampleSizes = new long[v];
            for(int v1 = 0; v1 < this.sampleCount; ++v1) {
                long[] arr_v = this.sampleSizes;
                arr_v[v1] = IsoTypeReader.readUInt32(byteBuffer0);
            }
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleSizeBox.java", SampleSizeBox.class);
        SampleSizeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"), 49);
        SampleSizeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "long", "sampleSize", "", "void"), 53);
        SampleSizeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleSizeAtIndex", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "int", "index", "", "long"), 58);
        SampleSizeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"), 66);
        SampleSizeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "[J"), 75);
        SampleSizeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "[J", "sampleSizes", "", "void"), 0x4F);
        SampleSizeBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "java.lang.String"), 0x76);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.sampleSize);
        if(this.sampleSize == 0L) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.sampleSizes.length));
            long[] arr_v = this.sampleSizes;
            for(int v = 0; v < arr_v.length; ++v) {
                IsoTypeWriter.writeUInt32(byteBuffer0, arr_v[v]);
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.sampleCount));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.sampleSize == 0L ? ((long)(this.sampleSizes.length * 4 + 12)) : 12L;
    }

    public long getSampleCount() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleSize <= 0L ? ((long)this.sampleSizes.length) : ((long)this.sampleCount);
    }

    public long getSampleSize() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_2, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleSize <= 0L ? this.sampleSizes[v] : this.sampleSize;
    }

    public long[] getSampleSizes() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sampleSizes;
    }

    public void setSampleSize(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleSize = v;
    }

    public void setSampleSizes(long[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_5, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sampleSizes = arr_v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleSizeBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleSizeBox[sampleSize=" + this.getSampleSize() + ";sampleCount=" + this.getSampleCount() + "]";
    }
}

