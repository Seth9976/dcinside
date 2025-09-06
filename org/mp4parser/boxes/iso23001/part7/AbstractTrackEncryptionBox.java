package org.mp4parser.boxes.iso23001.part7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    static {
        AbstractTrackEncryptionBox.ajc$preClinit();
    }

    protected AbstractTrackEncryptionBox(String s) {
        super(s);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.defaultAlgorithmId = IsoTypeReader.readUInt24(byteBuffer0);
        this.defaultIvSize = IsoTypeReader.readUInt8(byteBuffer0);
        byte[] arr_b = new byte[16];
        this.default_KID = arr_b;
        byteBuffer0.get(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AbstractTrackEncryptionBox.java", AbstractTrackEncryptionBox.class);
        AbstractTrackEncryptionBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultAlgorithmId", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"), 24);
        AbstractTrackEncryptionBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultAlgorithmId", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"), 28);
        AbstractTrackEncryptionBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefaultIvSize", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"), 0x20);
        AbstractTrackEncryptionBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefaultIvSize", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"), 36);
        AbstractTrackEncryptionBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDefault_KID", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"), 40);
        AbstractTrackEncryptionBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDefault_KID", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "java.util.UUID", "uuid", "", "void"), 46);
        AbstractTrackEncryptionBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 76);
        AbstractTrackEncryptionBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"), 90);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_6, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.defaultAlgorithmId != ((AbstractTrackEncryptionBox)object0).defaultAlgorithmId) {
            return false;
        }
        return this.defaultIvSize == ((AbstractTrackEncryptionBox)object0).defaultIvSize ? Arrays.equals(this.default_KID, ((AbstractTrackEncryptionBox)object0).default_KID) : false;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.defaultAlgorithmId);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.defaultIvSize);
        byteBuffer0.put(this.default_KID);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public int getDefaultAlgorithmId() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultAlgorithmId;
    }

    public int getDefaultIvSize() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.defaultIvSize;
    }

    public UUID getDefault_KID() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.default_KID);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        return new UUID(byteBuffer0.getLong(), byteBuffer0.getLong());
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        int v = (this.defaultAlgorithmId * 0x1F + this.defaultIvSize) * 0x1F;
        return this.default_KID == null ? v : v + Arrays.hashCode(this.default_KID);
    }

    public void setDefaultAlgorithmId(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultAlgorithmId = v;
    }

    public void setDefaultIvSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.defaultIvSize = v;
    }

    public void setDefault_KID(UUID uUID0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractTrackEncryptionBox.ajc$tjp_5, this, this, uUID0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[16]);
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        this.default_KID = byteBuffer0.array();
    }
}

