package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class AppleDataRateBox extends AbstractFullBox {
    public static final String TYPE = "rmdr";
    private static StaticPart ajc$tjp_0;
    private long dataRate;

    static {
        AppleDataRateBox.ajc$preClinit();
    }

    public AppleDataRateBox() {
        super("rmdr");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.dataRate = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleDataRateBox.java", AppleDataRateBox.class);
        AppleDataRateBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataRate", "org.mp4parser.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.dataRate);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public long getDataRate() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataRateBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataRate;
    }
}

