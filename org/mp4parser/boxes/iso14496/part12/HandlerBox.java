package org.mp4parser.boxes.iso14496.part12;

import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private long a;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    public static final Map readableTypes;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    static {
        HandlerBox.ajc$preClinit();
        HashMap hashMap0 = new HashMap();
        hashMap0.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap0.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap0.put("mp7b", "MPEG-7 binary XML");
        hashMap0.put("mp7t", "MPEG-7 XML");
        hashMap0.put("vide", "Video Track");
        hashMap0.put("soun", "Sound Track");
        hashMap0.put("hint", "Hint Track");
        hashMap0.put("appl", "Apple specific");
        hashMap0.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        HandlerBox.readableTypes = DesugarCollections.unmodifiableMap(hashMap0);
    }

    public HandlerBox() {
        super("hdlr");
        this.name = null;
        this.zeroTerm = true;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.shouldBeZeroButAppleWritesHereSomeValue = IsoTypeReader.readUInt32(byteBuffer0);
        this.handlerType = IsoTypeReader.read4cc(byteBuffer0);
        this.a = IsoTypeReader.readUInt32(byteBuffer0);
        this.b = IsoTypeReader.readUInt32(byteBuffer0);
        this.c = IsoTypeReader.readUInt32(byteBuffer0);
        if(byteBuffer0.remaining() > 0) {
            String s = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
            this.name = s;
            if(s.endsWith("\u0000")) {
                this.name = this.name.substring(0, this.name.length() - 1);
                this.zeroTerm = true;
                return;
            }
            this.zeroTerm = false;
            return;
        }
        this.zeroTerm = false;
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("HandlerBox.java", HandlerBox.class);
        HandlerBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 78);
        HandlerBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "", "void"), 82);
        HandlerBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 86);
        HandlerBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "", "void"), 0x5F);
        HandlerBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 99);
        HandlerBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 0x95);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.handlerType));
        IsoTypeWriter.writeUInt32(byteBuffer0, this.a);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.b);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.c);
        String s = this.name;
        if(s != null) {
            byteBuffer0.put(Utf8.convert(s));
        }
        if(this.zeroTerm) {
            byteBuffer0.put(0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.zeroTerm ? ((long)(Utf8.utf8StringLengthInBytes(this.name) + 25)) : ((long)(Utf8.utf8StringLengthInBytes(this.name) + 24));
    }

    public String getHandlerType() {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return HandlerBox.readableTypes.get(this.handlerType) == null ? "Unknown Handler Type" : ((String)HandlerBox.readableTypes.get(this.handlerType));
    }

    public String getName() {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.name;
    }

    public void setHandlerType(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.handlerType = s;
    }

    public void setName(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.name = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(HandlerBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "HandlerBox[handlerType=" + this.getHandlerType() + ";name=" + this.getName() + "]";
    }
}

