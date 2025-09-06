package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class PriotityRangeBox extends AbstractBox {
    public static final String TYPE = "svpr";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    int max_priorityId;
    int min_priorityId;
    int reserved1;
    int reserved2;

    static {
        PriotityRangeBox.ajc$preClinit();
    }

    public PriotityRangeBox() {
        super("svpr");
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved1 = (v & 0xC0) >> 6;
        this.min_priorityId = v & 0x3F;
        int v1 = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved2 = (v1 & 0xC0) >> 6;
        this.max_priorityId = v1 & 0x3F;
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("PriotityRangeBox.java", PriotityRangeBox.class);
        PriotityRangeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 45);
        PriotityRangeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"), 49);
        PriotityRangeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMin_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 53);
        PriotityRangeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMin_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"), 57);
        PriotityRangeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 61);
        PriotityRangeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"), 65);
        PriotityRangeBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMax_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 69);
        PriotityRangeBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMax_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"), 73);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved1 << 6) + this.min_priorityId);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved2 << 6) + this.max_priorityId);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 2L;
    }

    public int getMax_priorityId() {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.min_priorityId;
    }

    public int getReserved1() {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved1;
    }

    public int getReserved2() {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved2;
    }

    public void setMax_priorityId(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.max_priorityId = v;
    }

    public void setMin_priorityId(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.min_priorityId = v;
    }

    public void setReserved1(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved1 = v;
    }

    public void setReserved2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(PriotityRangeBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved2 = v;
    }
}

