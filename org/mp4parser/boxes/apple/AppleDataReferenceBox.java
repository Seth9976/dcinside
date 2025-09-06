package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class AppleDataReferenceBox extends AbstractFullBox {
    public static final String TYPE = "rdrf";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    static {
        AppleDataReferenceBox.ajc$preClinit();
    }

    public AppleDataReferenceBox() {
        super("rdrf");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.dataReferenceType = IsoTypeReader.read4cc(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.dataReferenceSize = v;
        this.dataReference = IsoTypeReader.readString(byteBuffer0, v);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleDataReferenceBox.java", AppleDataReferenceBox.class);
        AppleDataReferenceBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataReferenceSize", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 62);
        AppleDataReferenceBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataReferenceType", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 66);
        AppleDataReferenceBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataReference", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 70);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.dataReferenceType));
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.dataReferenceSize));
        byteBuffer0.put(Utf8.convert(this.dataReference));
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.dataReferenceSize + 12);
    }

    public String getDataReference() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataReferenceBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataReference;
    }

    public long getDataReferenceSize() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataReferenceBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (long)this.dataReferenceSize;
    }

    public String getDataReferenceType() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleDataReferenceBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataReferenceType;
    }
}

