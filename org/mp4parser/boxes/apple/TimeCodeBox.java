package org.mp4parser.boxes.apple;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import org.mp4parser.Container;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.sampleentry.SampleEntry;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TimeCodeBox extends AbstractBox implements Container, SampleEntry {
    public static final String TYPE = "tmcd";
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
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
        TimeCodeBox.ajc$preClinit();
    }

    public TimeCodeBox() {
        super("tmcd");
        this.rest = new byte[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        byteBuffer0.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer0);
        this.reserved1 = byteBuffer0.getInt();
        this.flags = IsoTypeReader.readUInt32(byteBuffer0);
        this.timeScale = byteBuffer0.getInt();
        this.frameDuration = byteBuffer0.getInt();
        this.numberOfFrames = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved2 = IsoTypeReader.readUInt24(byteBuffer0);
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        this.rest = arr_b;
        byteBuffer0.get(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TimeCodeBox.java", TimeCodeBox.class);
        TimeCodeBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataReferenceIndex", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 88);
        TimeCodeBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataReferenceIndex", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 92);
        TimeCodeBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved1", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 0x89);
        TimeCodeBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved2", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 0x8D);
        TimeCodeBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setReserved2", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 0x91);
        TimeCodeBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFlags", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 0x95);
        TimeCodeBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFlags", "org.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 0x99);
        TimeCodeBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRest", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 0x9D);
        TimeCodeBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRest", "org.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 0xA1);
        TimeCodeBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBoxes", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.util.List"), 0xA6);
        TimeCodeBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setBoxes", "org.mp4parser.boxes.apple.TimeCodeBox", "java.util.List", "boxes", "", "void"), 170);
        TimeCodeBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBoxes", "org.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class", "clazz", "", "java.util.List"), 0xAE);
        TimeCodeBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 98);
        TimeCodeBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getBoxes", "org.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class:boolean", "clazz:recursive", "", "java.util.List"), 0xB2);
        TimeCodeBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "writeContainer", "org.mp4parser.boxes.apple.TimeCodeBox", "java.nio.channels.WritableByteChannel", "bb", "java.io.IOException", "void"), 0xB6);
        TimeCodeBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTimeScale", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 109);
        TimeCodeBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTimeScale", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 0x71);
        TimeCodeBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFrameDuration", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 0x75);
        TimeCodeBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setFrameDuration", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 0x79);
        TimeCodeBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getNumberOfFrames", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 0x7D);
        TimeCodeBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setNumberOfFrames", "org.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), 0x81);
        TimeCodeBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getReserved1", "org.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 0x85);
    }

    @Override  // org.mp4parser.Container
    public List getBoxes() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return Collections.emptyList();
    }

    @Override  // org.mp4parser.Container
    public List getBoxes(Class class0) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_19, this, this, class0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return Collections.emptyList();
    }

    @Override  // org.mp4parser.Container
    public List getBoxes(Class class0, boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_20, this, this, class0, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        byteBuffer0.put(new byte[6]);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        byteBuffer0.putInt(this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.flags);
        byteBuffer0.putInt(this.timeScale);
        byteBuffer0.putInt(this.frameDuration);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.numberOfFrames);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.reserved2);
        byteBuffer0.put(this.rest);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.rest.length + 28);
    }

    @Override  // org.mp4parser.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.flags;
    }

    public int getFrameDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.numberOfFrames;
    }

    public int getReserved1() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved1;
    }

    public int getReserved2() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.reserved2;
    }

    public byte[] getRest() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.rest;
    }

    public int getTimeScale() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.timeScale;
    }

    @Override  // org.mp4parser.Container
    public void setBoxes(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_18, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        throw new RuntimeException("Time Code Box doesn\'t accept any children");
    }

    @Override  // org.mp4parser.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dataReferenceIndex = v;
    }

    public void setFlags(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_14, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.flags = v;
    }

    public void setFrameDuration(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_6, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.frameDuration = v;
    }

    public void setNumberOfFrames(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_8, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.numberOfFrames = v;
    }

    public void setReserved1(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_10, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved1 = v;
    }

    public void setReserved2(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_12, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.reserved2 = v;
    }

    public void setRest(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_16, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.rest = arr_b;
    }

    public void setTimeScale(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_4, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.timeScale = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TimeCodeBox{timeScale=" + this.timeScale + ", frameDuration=" + this.frameDuration + ", numberOfFrames=" + this.numberOfFrames + ", reserved1=" + this.reserved1 + ", reserved2=" + this.reserved2 + ", flags=" + this.flags + '}';
    }

    @Override  // org.mp4parser.Container
    public void writeContainer(WritableByteChannel writableByteChannel0) throws IOException {
        JoinPoint joinPoint0 = Factory.makeJP(TimeCodeBox.ajc$tjp_21, this, this, writableByteChannel0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
    }
}

