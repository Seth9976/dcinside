package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class DTSSpecificBox extends AbstractBox {
    long DTSSamplingFrequency;
    int LBRDurationMod;
    public static final String TYPE = "ddts";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_14;
    private static StaticPart ajc$tjp_15;
    private static StaticPart ajc$tjp_16;
    private static StaticPart ajc$tjp_17;
    private static StaticPart ajc$tjp_18;
    private static StaticPart ajc$tjp_19;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_20;
    private static StaticPart ajc$tjp_21;
    private static StaticPart ajc$tjp_22;
    private static StaticPart ajc$tjp_23;
    private static StaticPart ajc$tjp_24;
    private static StaticPart ajc$tjp_25;
    private static StaticPart ajc$tjp_26;
    private static StaticPart ajc$tjp_27;
    private static StaticPart ajc$tjp_28;
    private static StaticPart ajc$tjp_29;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_30;
    private static StaticPart ajc$tjp_31;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        DTSSpecificBox.ajc$preClinit();
    }

    public DTSSpecificBox() {
        super("ddts");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.DTSSamplingFrequency = IsoTypeReader.readUInt32(byteBuffer0);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.pcmSampleDepth = IsoTypeReader.readUInt8(byteBuffer0);
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
        this.frameDuration = bitReaderBuffer0.readBits(2);
        this.streamConstruction = bitReaderBuffer0.readBits(5);
        this.coreLFEPresent = bitReaderBuffer0.readBits(1);
        this.coreLayout = bitReaderBuffer0.readBits(6);
        this.coreSize = bitReaderBuffer0.readBits(14);
        this.stereoDownmix = bitReaderBuffer0.readBits(1);
        this.representationType = bitReaderBuffer0.readBits(3);
        this.channelLayout = bitReaderBuffer0.readBits(16);
        this.multiAssetFlag = bitReaderBuffer0.readBits(1);
        this.LBRDurationMod = bitReaderBuffer0.readBits(1);
        this.reservedBoxPresent = bitReaderBuffer0.readBits(1);
        this.reserved = bitReaderBuffer0.readBits(5);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("DTSSpecificBox.java", DTSSpecificBox.class);
        DTSSpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 89);
        DTSSpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        DTSSpecificBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x81);
        DTSSpecificBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "streamConstruction", "", "void"), 0x85);
        DTSSpecificBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x89);
        DTSSpecificBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 0x8D);
        DTSSpecificBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x91);
        DTSSpecificBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLayout", "", "void"), 0x95);
        DTSSpecificBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x99);
        DTSSpecificBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreSize", "", "void"), 0x9D);
        DTSSpecificBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0xA1);
        DTSSpecificBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 0xA5);
        DTSSpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 97);
        DTSSpecificBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0xA9);
        DTSSpecificBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "representationType", "", "void"), 0xAD);
        DTSSpecificBox.ajc$tjp_22 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0xB1);
        DTSSpecificBox.ajc$tjp_23 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "channelLayout", "", "void"), 0xB5);
        DTSSpecificBox.ajc$tjp_24 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0xB9);
        DTSSpecificBox.ajc$tjp_25 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 0xBD);
        DTSSpecificBox.ajc$tjp_26 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0xC1);
        DTSSpecificBox.ajc$tjp_27 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 0xC5);
        DTSSpecificBox.ajc$tjp_28 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 201);
        DTSSpecificBox.ajc$tjp_29 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reserved", "", "void"), 205);
        DTSSpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        DTSSpecificBox.ajc$tjp_30 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 209);
        DTSSpecificBox.ajc$tjp_31 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 0xD5);
        DTSSpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"), 105);
        DTSSpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        DTSSpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x71);
        DTSSpecificBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 0x75);
        DTSSpecificBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"), 0x79);
        DTSSpecificBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "frameDuration", "", "void"), 0x7D);
    }

    public long getAvgBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.channelLayout;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt32(byteBuffer0, this.DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.avgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.pcmSampleDepth);
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        bitWriterBuffer0.writeBits(this.frameDuration, 2);
        bitWriterBuffer0.writeBits(this.streamConstruction, 5);
        bitWriterBuffer0.writeBits(this.coreLFEPresent, 1);
        bitWriterBuffer0.writeBits(this.coreLayout, 6);
        bitWriterBuffer0.writeBits(this.coreSize, 14);
        bitWriterBuffer0.writeBits(this.stereoDownmix, 1);
        bitWriterBuffer0.writeBits(this.representationType, 3);
        bitWriterBuffer0.writeBits(this.channelLayout, 16);
        bitWriterBuffer0.writeBits(this.multiAssetFlag, 1);
        bitWriterBuffer0.writeBits(this.LBRDurationMod, 1);
        bitWriterBuffer0.writeBits(this.reservedBoxPresent, 1);
        bitWriterBuffer0.writeBits(this.reserved, 5);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public int getCoreLFEPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.coreLayout;
    }

    public int getCoreSize() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.DTSSamplingFrequency;
    }

    @DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {
        int v2;
        int v = this.getChannelLayout();
        int v1 = 1;
        if((v & 1) == 1) {
            v2 = 4;
        }
        else {
            v1 = 0;
            v2 = 0;
        }
        if((v & 2) == 2) {
            v1 += 2;
            v2 |= 3;
        }
        if((v & 4) == 4) {
            v1 += 2;
            v2 |= 0x30;
        }
        if((v & 8) == 8) {
            ++v1;
            v2 |= 8;
        }
        if((v & 16) == 16) {
            ++v1;
            v2 |= 0x100;
        }
        if((v & 0x20) == 0x20) {
            v1 += 2;
            v2 |= 0x5000;
        }
        if((v & 0x40) == 0x40) {
            v1 += 2;
            v2 |= 0x30;
        }
        if((v & 0x80) == 0x80) {
            ++v1;
            v2 |= 0x2000;
        }
        if((v & 0x100) == 0x100) {
            ++v1;
            v2 |= 0x800;
        }
        if((v & 0x200) == 0x200) {
            v1 += 2;
            v2 |= 0xC0;
        }
        if((v & 0x400) == 0x400) {
            v1 += 2;
            v2 |= 0x600;
        }
        if((v & 0x800) == 0x800) {
            v1 += 2;
            v2 |= 0x30;
        }
        if((v & 0x1000) == 0x1000) {
            ++v1;
            v2 |= 8;
        }
        if((v & 0x2000) == 0x2000) {
            v1 += 2;
            v2 |= 0x30;
        }
        if((v & 0x4000) == 0x4000) {
            ++v1;
            v2 |= 0x10000;
        }
        if((v & 0x8000) == 0x8000) {
            v1 += 2;
            v2 |= 0x28000;
        }
        if((v & 0x10000) == 0x10000) {
            ++v1;
        }
        if((v & 0x20000) == 0x20000) {
            v1 += 2;
        }
        return new int[]{v1, v2};
    }

    public int getFrameDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.representationType;
    }

    public int getReserved() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_30, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.streamConstruction;
    }

    public void setAvgBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_1, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.avgBitRate = v;
    }

    public void setChannelLayout(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_23, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.channelLayout = v;
    }

    public void setCoreLFEPresent(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_13, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.coreLFEPresent = v;
    }

    public void setCoreLayout(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_15, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.coreLayout = v;
    }

    public void setCoreSize(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_17, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.coreSize = v;
    }

    public void setDTSSamplingFrequency(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.DTSSamplingFrequency = v;
    }

    public void setFrameDuration(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.frameDuration = v;
    }

    public void setLBRDurationMod(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_27, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.LBRDurationMod = v;
    }

    public void setMaxBitRate(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.maxBitRate = v;
    }

    public void setMultiAssetFlag(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_25, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.multiAssetFlag = v;
    }

    public void setPcmSampleDepth(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.pcmSampleDepth = v;
    }

    public void setRepresentationType(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_21, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.representationType = v;
    }

    public void setReserved(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_29, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved = v;
    }

    public void setReservedBoxPresent(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_31, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reservedBoxPresent = v;
    }

    public void setStereoDownmix(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_19, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.stereoDownmix = v;
    }

    public void setStreamConstruction(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(DTSSpecificBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.streamConstruction = v;
    }
}

