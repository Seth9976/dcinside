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

public class MovieExtendsHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mehd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private long fragmentDuration;

    static {
        MovieExtendsHeaderBox.ajc$preClinit();
    }

    public MovieExtendsHeaderBox() {
        super("mehd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.fragmentDuration = this.getVersion() == 1 ? IsoTypeReader.readUInt64(byteBuffer0) : IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MovieExtendsHeaderBox.java", MovieExtendsHeaderBox.class);
        MovieExtendsHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFragmentDuration", "org.mp4parser.boxes.iso14496.part12.MovieExtendsHeaderBox", "", "", "", "long"), 65);
        MovieExtendsHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFragmentDuration", "org.mp4parser.boxes.iso14496.part12.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"), 69);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, this.fragmentDuration);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, this.fragmentDuration);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 12L : 8L;
    }

    public long getFragmentDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieExtendsHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.fragmentDuration;
    }

    public void setFragmentDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieExtendsHeaderBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.fragmentDuration = v;
    }
}

