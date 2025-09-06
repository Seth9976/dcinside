package org.mp4parser.boxes.iso14496.part30;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class WebVTTConfigurationBox extends AbstractBox {
    public static final String TYPE = "vttC";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    String config;

    static {
        WebVTTConfigurationBox.ajc$preClinit();
    }

    public WebVTTConfigurationBox() {
        super("vttC");
        this.config = "";
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.config = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("WebVTTConfigurationBox.java", WebVTTConfigurationBox.class);
        WebVTTConfigurationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getConfig", "org.mp4parser.boxes.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        WebVTTConfigurationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setConfig", "org.mp4parser.boxes.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"), 40);
    }

    public String getConfig() {
        JoinPoint joinPoint0 = Factory.makeJP(WebVTTConfigurationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.config;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(Utf8.convert(this.config));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)Utf8.utf8StringLengthInBytes(this.config);
    }

    public void setConfig(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(WebVTTConfigurationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.config = s;
    }
}

