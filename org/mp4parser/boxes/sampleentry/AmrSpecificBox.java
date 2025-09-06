package org.mp4parser.boxes.sampleentry;

import java.nio.ByteBuffer;
import org.mp4parser.IsoFile;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class AmrSpecificBox extends AbstractBox {
    public static final String TYPE = "damr";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    static {
        AmrSpecificBox.ajc$preClinit();
    }

    public AmrSpecificBox() {
        super("damr");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        this.vendor = IsoFile.bytesToFourCC(arr_b);
        this.decoderVersion = IsoTypeReader.readUInt8(byteBuffer0);
        this.modeSet = IsoTypeReader.readUInt16(byteBuffer0);
        this.modeChangePeriod = IsoTypeReader.readUInt8(byteBuffer0);
        this.framesPerSample = IsoTypeReader.readUInt8(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AmrSpecificBox.java", AmrSpecificBox.class);
        AmrSpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getVendor", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        AmrSpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDecoderVersion", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        AmrSpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getModeSet", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        AmrSpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getModeChangePeriod", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        AmrSpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFramesPerSample", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        AmrSpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContent", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        AmrSpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_5, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        byteBuffer0.put(IsoFile.fourCCtoBytes(this.vendor));
        IsoTypeWriter.writeUInt8(byteBuffer0, this.decoderVersion);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.modeSet);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.modeChangePeriod);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.framesPerSample);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 9L;
    }

    public int getDecoderVersion() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.decoderVersion;
    }

    public int getFramesPerSample() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.framesPerSample;
    }

    public int getModeChangePeriod() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.modeChangePeriod;
    }

    public int getModeSet() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.modeSet;
    }

    public String getVendor() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.vendor;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AmrSpecificBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "AmrSpecificBox[vendor=" + this.getVendor() + ";decoderVersion=" + this.getDecoderVersion() + ";modeSet=" + this.getModeSet() + ";modeChangePeriod=" + this.getModeChangePeriod() + ";framesPerSample=" + this.getFramesPerSample() + "]";
    }
}

