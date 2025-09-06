package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;

public class OriginalFormatBox extends AbstractBox {
    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "frma";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private String dataFormat;

    static {
        OriginalFormatBox.ajc$preClinit();
    }

    public OriginalFormatBox() {
        super("frma");
        this.dataFormat = "    ";
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.dataFormat = IsoTypeReader.read4cc(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("OriginalFormatBox.java", OriginalFormatBox.class);
        OriginalFormatBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        OriginalFormatBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 0x2F);
        OriginalFormatBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.dataFormat));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 4L;
    }

    public String getDataFormat() {
        JoinPoint joinPoint0 = Factory.makeJP(OriginalFormatBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataFormat;
    }

    public void setDataFormat(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(OriginalFormatBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dataFormat = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(OriginalFormatBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "OriginalFormatBox[dataFormat=" + this.getDataFormat() + "]";
    }
}

