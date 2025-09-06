package org.mp4parser.boxes.iso14496.part30;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class WebVTTSourceLabelBox extends AbstractBox {
    public static final String TYPE = "vlab";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    String sourceLabel;

    static {
        WebVTTSourceLabelBox.ajc$preClinit();
    }

    public WebVTTSourceLabelBox() {
        super("vlab");
        this.sourceLabel = "";
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.sourceLabel = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("WebVTTSourceLabelBox.java", WebVTTSourceLabelBox.class);
        WebVTTSourceLabelBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSourceLabel", "org.mp4parser.boxes.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"), 37);
        WebVTTSourceLabelBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSourceLabel", "org.mp4parser.boxes.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", "void"), 41);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(Utf8.convert(this.sourceLabel));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)Utf8.utf8StringLengthInBytes(this.sourceLabel);
    }

    public String getSourceLabel() {
        JoinPoint joinPoint0 = Factory.makeJP(WebVTTSourceLabelBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.sourceLabel;
    }

    public void setSourceLabel(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(WebVTTSourceLabelBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.sourceLabel = s;
    }
}

