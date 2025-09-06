package org.mp4parser.boxes.iso23001.part7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.UUIDConverter;

public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    static final boolean $assertionsDisabled = false;
    public static byte[] OMA2_SYSTEM_ID = null;
    public static byte[] PLAYREADY_SYSTEM_ID = null;
    public static final String TYPE = "pssh";
    public static byte[] WIDEVINE;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    byte[] content;
    List keyIds;
    byte[] systemId;

    static {
        ProtectionSystemSpecificHeaderBox.ajc$preClinit();
        ProtectionSystemSpecificHeaderBox.OMA2_SYSTEM_ID = new byte[]{-94, -75, 86, (byte)0x80, 0x6F, 67, 17, (byte)0xE0, -102, 0x3F, 0, 2, -91, -43, -59, 27};
        ProtectionSystemSpecificHeaderBox.WIDEVINE = new byte[]{-19, -17, (byte)0x8B, -87, 0x79, -42, 74, -50, -93, -56, 39, -36, -43, 29, 33, -19};
        ProtectionSystemSpecificHeaderBox.PLAYREADY_SYSTEM_ID = new byte[]{-102, 4, -16, 0x79, -104, 0x40, 66, (byte)0x86, -85, -110, -26, 91, (byte)0xE0, -120, 0x5F, -107};
    }

    public ProtectionSystemSpecificHeaderBox() {
        super("pssh");
        this.keyIds = new ArrayList();
    }

    public ProtectionSystemSpecificHeaderBox(byte[] arr_b, byte[] arr_b1) {
        super("pssh");
        this.keyIds = new ArrayList();
        this.content = arr_b1;
        this.systemId = arr_b;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        byte[] arr_b = new byte[16];
        this.systemId = arr_b;
        byteBuffer0.get(arr_b);
        if(this.getVersion() > 0) {
            for(int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0)); v > 0; --v) {
                byte[] arr_b1 = new byte[16];
                byteBuffer0.get(arr_b1);
                this.keyIds.add(UUIDConverter.convert(arr_b1));
            }
        }
        IsoTypeReader.readUInt32(byteBuffer0);
        byte[] arr_b2 = new byte[byteBuffer0.remaining()];
        this.content = arr_b2;
        byteBuffer0.get(arr_b2);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getKeyIds", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"), 52);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setKeyIds", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"), 56);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSystemId", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 60);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSystemId", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 0x40);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContent", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 69);
        ProtectionSystemSpecificHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setContent", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 73);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(this.systemId, 0, 16);
        if(this.getVersion() > 0) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.keyIds.size()));
            for(Object object0: this.keyIds) {
                byteBuffer0.put(UUIDConverter.convert(((UUID)object0)));
            }
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.content.length));
        byteBuffer0.put(this.content);
    }

    public byte[] getContent() {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.content;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = (long)(this.content.length + 24);
        return this.getVersion() <= 0 ? v : v + 4L + ((long)(this.keyIds.size() * 16));
    }

    public List getKeyIds() {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.keyIds;
    }

    public byte[] getSystemId() {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.systemId;
    }

    public void setContent(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_5, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.content = arr_b;
    }

    public void setKeyIds(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.keyIds = list0;
    }

    public void setSystemId(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_3, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.systemId = arr_b;
    }
}

