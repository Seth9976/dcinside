package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class DataEntryUrnBox extends AbstractFullBox {
    public static final String TYPE = "urn ";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private String location;
    private String name;

    static {
        DataEntryUrnBox.ajc$preClinit();
    }

    public DataEntryUrnBox() {
        super("urn ");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.name = IsoTypeReader.readString(byteBuffer0);
        this.location = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("DataEntryUrnBox.java", DataEntryUrnBox.class);
        DataEntryUrnBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getName", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        DataEntryUrnBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLocation", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        DataEntryUrnBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(Utf8.convert(this.name));
        byteBuffer0.put(0);
        byteBuffer0.put(Utf8.convert(this.location));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.name) + 1 + Utf8.utf8StringLengthInBytes(this.location) + 1);
    }

    public String getLocation() {
        JoinPoint joinPoint0 = Factory.makeJP(DataEntryUrnBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.location;
    }

    public String getName() {
        JoinPoint joinPoint0 = Factory.makeJP(DataEntryUrnBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.name;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(DataEntryUrnBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "DataEntryUrlBox[name=" + this.getName() + ";location=" + this.getLocation() + "]";
    }
}

