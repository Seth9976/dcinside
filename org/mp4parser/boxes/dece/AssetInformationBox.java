package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class AssetInformationBox extends AbstractFullBox {
    public static class Entry {
        public String assetId;
        public String namespace;
        public String profileLevelIdc;

        public Entry(String s, String s1, String s2) {
            this.namespace = s;
            this.profileLevelIdc = s1;
            this.assetId = s2;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || !this.assetId.equals(((Entry)object0).assetId)) {
                return false;
            }
            return this.namespace.equals(((Entry)object0).namespace) ? this.profileLevelIdc.equals(((Entry)object0).profileLevelIdc) : false;
        }

        public int getSize() {
            return Utf8.utf8StringLengthInBytes(this.namespace) + 3 + Utf8.utf8StringLengthInBytes(this.profileLevelIdc) + Utf8.utf8StringLengthInBytes(this.assetId);
        }

        @Override
        public int hashCode() {
            return (this.namespace.hashCode() * 0x1F + this.profileLevelIdc.hashCode()) * 0x1F + this.assetId.hashCode();
        }

        @Override
        public String toString() {
            return "{namespace=\'" + this.namespace + '\'' + ", profileLevelIdc=\'" + this.profileLevelIdc + '\'' + ", assetId=\'" + this.assetId + '\'' + '}';
        }
    }

    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "ainf";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    String apid;
    String profileVersion;

    static {
        AssetInformationBox.ajc$preClinit();
    }

    public AssetInformationBox() {
        super("ainf");
        this.apid = "";
        this.profileVersion = "0000";
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.profileVersion = IsoTypeReader.readString(byteBuffer0, 4);
        this.apid = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AssetInformationBox.java", AssetInformationBox.class);
        AssetInformationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getApid", "org.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 80);
        AssetInformationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setApid", "org.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 84);
        AssetInformationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getProfileVersion", "org.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 88);
        AssetInformationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setProfileVersion", "org.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 92);
    }

    public String getApid() {
        JoinPoint joinPoint0 = Factory.makeJP(AssetInformationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.apid;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() != 0) {
            throw new RuntimeException("Unknown ainf version " + this.getVersion());
        }
        byteBuffer0.put(Utf8.convert(this.profileVersion), 0, 4);
        byteBuffer0.put(Utf8.convert(this.apid));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.apid) + 9);
    }

    public String getProfileVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(AssetInformationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.profileVersion;
    }

    @DoNotParseDetail
    public boolean isHidden() {
        return (this.getFlags() & 1) == 1;
    }

    public void setApid(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AssetInformationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.apid = s;
    }

    @DoNotParseDetail
    public void setHidden(boolean z) {
        int v = this.getFlags();
        if((this.isHidden() ^ z) != 0) {
            if(z) {
                this.setFlags(v | 1);
                return;
            }
            this.setFlags(0xFFFFFE & v);
        }
    }

    public void setProfileVersion(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AssetInformationBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.profileVersion = s;
    }
}

