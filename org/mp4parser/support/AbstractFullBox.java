package org.mp4parser.support;

import java.nio.ByteBuffer;
import org.mp4parser.FullBox;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private int flags;
    private int version;

    static {
        AbstractFullBox.ajc$preClinit();
    }

    protected AbstractFullBox(String s) {
        super(s);
    }

    protected AbstractFullBox(String s, byte[] arr_b) {
        super(s, arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AbstractFullBox.java", AbstractFullBox.class);
        AbstractFullBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setVersion", "org.mp4parser.support.AbstractFullBox", "int", "version", "", "void"), 50);
        AbstractFullBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFlags", "org.mp4parser.support.AbstractFullBox", "int", "flags", "", "void"), 0x3F);
    }

    @Override  // org.mp4parser.FullBox
    @DoNotParseDetail
    public int getFlags() {
        if(!this.isParsed) {
            this.parseDetails();
        }
        return this.flags;
    }

    @Override  // org.mp4parser.FullBox
    @DoNotParseDetail
    public int getVersion() {
        if(!this.isParsed) {
            this.parseDetails();
        }
        return this.version;
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer0) {
        this.version = IsoTypeReader.readUInt8(byteBuffer0);
        this.flags = IsoTypeReader.readUInt24(byteBuffer0);
        return 4L;
    }

    @Override  // org.mp4parser.FullBox
    public void setFlags(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractFullBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.flags = v;
    }

    @Override  // org.mp4parser.FullBox
    public void setVersion(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractFullBox.ajc$tjp_0, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.version = v;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.flags);
    }
}

