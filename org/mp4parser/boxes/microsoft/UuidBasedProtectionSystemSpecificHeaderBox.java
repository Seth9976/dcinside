package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
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

public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    public static byte[] USER_TYPE;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    ProtectionSpecificHeader protectionSpecificHeader;
    UUID systemId;

    static {
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$preClinit();
        UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE = new byte[]{(byte)0xD0, (byte)0x8A, 0x4F, 24, 16, -13, 74, (byte)0x82, -74, -56, 50, -40, -85, (byte)0xA1, (byte)0x83, -45};
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super("uuid", UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        byte[] arr_b = new byte[16];
        byteBuffer0.get(arr_b);
        this.systemId = UUIDConverter.convert(arr_b);
        CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.protectionSpecificHeader = ProtectionSpecificHeader.createFor(this.systemId, byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("UuidBasedProtectionSystemSpecificHeaderBox.java", UuidBasedProtectionSystemSpecificHeaderBox.class);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSystemId", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSystemId", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSystemIdString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProtectionSpecificHeader", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "org.mp4parser.boxes.microsoft.ProtectionSpecificHeader"), 0x4F);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProtectionSpecificHeader", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "org.mp4parser.boxes.microsoft.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 83);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProtectionSpecificHeaderString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 87);
        UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt64(byteBuffer0, this.systemId.getMostSignificantBits());
        IsoTypeWriter.writeUInt64(byteBuffer0, this.systemId.getLeastSignificantBits());
        ByteBuffer byteBuffer1 = this.protectionSpecificHeader.getData();
        byteBuffer1.rewind();
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)byteBuffer1.limit()));
        byteBuffer0.put(byteBuffer1);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.protectionSpecificHeader.getData().limit() + 24);
    }

    public ProtectionSpecificHeader getProtectionSpecificHeader() {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString() {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.protectionSpecificHeader.toString();
    }

    public UUID getSystemId() {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.systemId;
    }

    public String getSystemIdString() {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.systemId.toString();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE;
    }

    public void setProtectionSpecificHeader(ProtectionSpecificHeader protectionSpecificHeader0) {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_4, this, this, protectionSpecificHeader0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.protectionSpecificHeader = protectionSpecificHeader0;
    }

    public void setSystemId(UUID uUID0) {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_1, this, this, uUID0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.systemId = uUID0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "UuidBasedProtectionSystemSpecificHeaderBox{systemId=" + this.systemId.toString() + ", dataSize=" + this.protectionSpecificHeader.getData().limit() + '}';
    }
}

