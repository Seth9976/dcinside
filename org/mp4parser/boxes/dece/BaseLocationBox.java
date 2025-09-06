package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = "bloc";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    String baseLocation;
    String purchaseLocation;

    static {
        BaseLocationBox.ajc$preClinit();
    }

    public BaseLocationBox() {
        super("bloc");
        this.baseLocation = "";
        this.purchaseLocation = "";
    }

    public BaseLocationBox(String s, String s1) {
        super("bloc");
        this.baseLocation = s;
        this.purchaseLocation = s1;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        String s = IsoTypeReader.readString(byteBuffer0);
        this.baseLocation = s;
        byteBuffer0.get(new byte[0xFF - Utf8.utf8StringLengthInBytes(s)]);
        String s1 = IsoTypeReader.readString(byteBuffer0);
        this.purchaseLocation = s1;
        byteBuffer0.get(new byte[0xFF - Utf8.utf8StringLengthInBytes(s1)]);
        byteBuffer0.get(new byte[0x200]);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("BaseLocationBox.java", BaseLocationBox.class);
        BaseLocationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        BaseLocationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 0x30);
        BaseLocationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPurchaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        BaseLocationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPurchaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        BaseLocationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        BaseLocationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"), 100);
        BaseLocationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_4, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            String s = this.baseLocation;
            if(s != null) {
                if(!s.equals(((BaseLocationBox)object0).baseLocation)) {
                    return false;
                }
            }
            else if(((BaseLocationBox)object0).baseLocation != null) {
                return false;
            }
            String s1 = this.purchaseLocation;
            String s2 = ((BaseLocationBox)object0).purchaseLocation;
            return s1 == null ? s2 == null : s1.equals(s2);
        }
        return false;
    }

    public String getBaseLocation() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.baseLocation;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.put(Utf8.convert(this.baseLocation));
        byteBuffer0.put(new byte[0x100 - Utf8.utf8StringLengthInBytes(this.baseLocation)]);
        byteBuffer0.put(Utf8.convert(this.purchaseLocation));
        byteBuffer0.put(new byte[0x100 - Utf8.utf8StringLengthInBytes(this.purchaseLocation)]);
        byteBuffer0.put(new byte[0x200]);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 0x404L;
    }

    public String getPurchaseLocation() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.purchaseLocation;
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        int v = 0;
        int v1 = this.baseLocation == null ? 0 : this.baseLocation.hashCode();
        String s = this.purchaseLocation;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    public void setBaseLocation(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.baseLocation = s;
    }

    public void setPurchaseLocation(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.purchaseLocation = s;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(BaseLocationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "BaseLocationBox{baseLocation=\'" + this.baseLocation + '\'' + ", purchaseLocation=\'" + this.purchaseLocation + '\'' + '}';
    }
}

