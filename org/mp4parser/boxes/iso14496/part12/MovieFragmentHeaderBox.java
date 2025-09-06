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

public class MovieFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mfhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private long sequenceNumber;

    static {
        MovieFragmentHeaderBox.ajc$preClinit();
    }

    public MovieFragmentHeaderBox() {
        super("mfhd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.sequenceNumber = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MovieFragmentHeaderBox.java", MovieFragmentHeaderBox.class);
        MovieFragmentHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSequenceNumber", "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        MovieFragmentHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSequenceNumber", "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 0x3F);
        MovieFragmentHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.sequenceNumber);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getSequenceNumber() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sequenceNumber;
    }

    public void setSequenceNumber(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sequenceNumber = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "MovieFragmentHeaderBox{sequenceNumber=" + this.sequenceNumber + '}';
    }
}

