package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        MLPSpecificBox.ajc$preClinit();
    }

    public MLPSpecificBox() {
        super("dmlp");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
        this.format_info = bitReaderBuffer0.readBits(0x20);
        this.peak_data_rate = bitReaderBuffer0.readBits(15);
        this.reserved = bitReaderBuffer0.readBits(1);
        this.reserved2 = bitReaderBuffer0.readBits(0x20);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MLPSpecificBox.java", MLPSpecificBox.class);
        MLPSpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFormat_info", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"), 49);
        MLPSpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFormat_info", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        MLPSpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPeak_data_rate", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"), 57);
        MLPSpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPeak_data_rate", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        MLPSpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"), 65);
        MLPSpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        MLPSpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"), 73);
        MLPSpecificBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        bitWriterBuffer0.writeBits(this.format_info, 0x20);
        bitWriterBuffer0.writeBits(this.peak_data_rate, 15);
        bitWriterBuffer0.writeBits(this.reserved, 1);
        bitWriterBuffer0.writeBits(this.reserved2, 0x20);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 10L;
    }

    public int getFormat_info() {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.format_info;
    }

    public int getPeak_data_rate() {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.peak_data_rate;
    }

    public int getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public int getReserved2() {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved2;
    }

    public void setFormat_info(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.format_info = v;
    }

    public void setPeak_data_rate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.peak_data_rate = v;
    }

    public void setReserved(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved = v;
    }

    public void setReserved2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MLPSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved2 = v;
    }
}

