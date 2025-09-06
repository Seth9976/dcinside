package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TfxdBox extends AbstractFullBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        TfxdBox.ajc$preClinit();
    }

    public TfxdBox() {
        super("uuid");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer0);
            this.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer0);
            return;
        }
        this.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer0);
        this.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TfxdBox.java", TfxdBox.class);
        TfxdBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFragmentAbsoluteTime", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"), 0x4F);
        TfxdBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFragmentAbsoluteDuration", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"), 83);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, this.fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt64(byteBuffer0, this.fragmentAbsoluteDuration);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, this.fragmentAbsoluteTime);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.fragmentAbsoluteDuration);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 20L : 12L;
    }

    public long getFragmentAbsoluteDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TfxdBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        JoinPoint joinPoint0 = Factory.makeJP(TfxdBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.fragmentAbsoluteTime;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{109, 29, -101, 5, 66, -43, 68, -26, (byte)0x80, -30, 20, 29, -81, -9, 87, -78};
    }
}

