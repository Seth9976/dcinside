package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "smhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private float balance;

    static {
        SoundMediaHeaderBox.ajc$preClinit();
    }

    public SoundMediaHeaderBox() {
        super("smhd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.balance = IsoTypeReader.readFixedPoint88(byteBuffer0);
        IsoTypeReader.readUInt16(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SoundMediaHeaderBox.java", SoundMediaHeaderBox.class);
        SoundMediaHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBalance", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", "float"), 36);
        SoundMediaHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public float getBalance() {
        JoinPoint joinPoint0 = Factory.makeJP(SoundMediaHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.balance;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeFixedPoint88(byteBuffer0, ((double)this.balance));
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SoundMediaHeaderBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SoundMediaHeaderBox[balance=" + this.getBalance() + "]";
    }
}

