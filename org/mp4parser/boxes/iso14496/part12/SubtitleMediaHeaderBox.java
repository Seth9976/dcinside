package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;

public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "sthd";
    private static StaticPart ajc$tjp_0;

    static {
        SubtitleMediaHeaderBox.ajc$preClinit();
    }

    public SubtitleMediaHeaderBox() {
        super("sthd");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SubtitleMediaHeaderBox.java", SubtitleMediaHeaderBox.class);
        SubtitleMediaHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 4L;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SubtitleMediaHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SubtitleMediaHeaderBox";
    }
}

