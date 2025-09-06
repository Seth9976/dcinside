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

public class MovieFragmentRandomAccessOffsetBox extends AbstractFullBox {
    public static final String TYPE = "mfro";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private long mfraSize;

    static {
        MovieFragmentRandomAccessOffsetBox.ajc$preClinit();
    }

    public MovieFragmentRandomAccessOffsetBox() {
        super("mfro");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.mfraSize = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MovieFragmentRandomAccessOffsetBox.java", MovieFragmentRandomAccessOffsetBox.class);
        MovieFragmentRandomAccessOffsetBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMfraSize", "org.mp4parser.boxes.iso14496.part12.MovieFragmentRandomAccessOffsetBox", "", "", "", "long"), 56);
        MovieFragmentRandomAccessOffsetBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMfraSize", "org.mp4parser.boxes.iso14496.part12.MovieFragmentRandomAccessOffsetBox", "long", "mfraSize", "", "void"), 60);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.mfraSize);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getMfraSize() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieFragmentRandomAccessOffsetBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.mfraSize;
    }

    public void setMfraSize(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieFragmentRandomAccessOffsetBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.mfraSize = v;
    }
}

