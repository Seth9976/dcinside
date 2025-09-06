package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Date;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.Matrix;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.DateHelper;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

public class MovieHeaderBox extends AbstractFullBox {
    private static a LOG = null;
    public static final String TYPE = "mvhd";
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
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private Matrix matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
        MovieHeaderBox.ajc$preClinit();
        MovieHeaderBox.LOG = b.i(MovieHeaderBox.class);
    }

    public MovieHeaderBox() {
        super("mvhd");
        this.rate = 1.0;
        this.volume = 1.0f;
        this.matrix = Matrix.ROTATE_0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer0));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer0));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer0);
            this.duration = byteBuffer0.getLong();
        }
        else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer0));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer0));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer0);
            this.duration = (long)byteBuffer0.getInt();
        }
        if(this.duration < -1L) {
            MovieHeaderBox.LOG.o("mvhd duration is not in expected range");
        }
        this.rate = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer0);
        IsoTypeReader.readUInt16(byteBuffer0);
        IsoTypeReader.readUInt32(byteBuffer0);
        IsoTypeReader.readUInt32(byteBuffer0);
        this.matrix = Matrix.fromByteBuffer(byteBuffer0);
        this.previewTime = byteBuffer0.getInt();
        this.previewDuration = byteBuffer0.getInt();
        this.posterTime = byteBuffer0.getInt();
        this.selectionTime = byteBuffer0.getInt();
        this.selectionDuration = byteBuffer0.getInt();
        this.currentTime = byteBuffer0.getInt();
        this.nextTrackId = IsoTypeReader.readUInt32(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MovieHeaderBox.java", MovieHeaderBox.class);
        MovieHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.util.Date"), 0x40);
        MovieHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 68);
        MovieHeaderBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "float"), 0x73);
        MovieHeaderBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setVolume", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "float", "volume", "", "void"), 0x77);
        MovieHeaderBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "org.mp4parser.support.Matrix"), 0x7B);
        MovieHeaderBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMatrix", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "org.mp4parser.support.Matrix", "matrix", "", "void"), 0x7F);
        MovieHeaderBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 0x83);
        MovieHeaderBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setNextTrackId", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "nextTrackId", "", "void"), 0x87);
        MovieHeaderBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.lang.String"), 0xBD);
        MovieHeaderBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 0xF3);
        MovieHeaderBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPreviewTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewTime", "", "void"), 0xF7);
        MovieHeaderBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 0xFB);
        MovieHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "java.util.Date"), 76);
        MovieHeaderBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPreviewDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "previewDuration", "", "void"), 0xFF);
        MovieHeaderBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 0x103);
        MovieHeaderBox.ajc$tjp_22 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPosterTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "posterTime", "", "void"), 0x107);
        MovieHeaderBox.ajc$tjp_23 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 0x10B);
        MovieHeaderBox.ajc$tjp_24 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSelectionTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionTime", "", "void"), 0x10F);
        MovieHeaderBox.ajc$tjp_25 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 275);
        MovieHeaderBox.ajc$tjp_26 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSelectionDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "selectionDuration", "", "void"), 279);
        MovieHeaderBox.ajc$tjp_27 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "int"), 283);
        MovieHeaderBox.ajc$tjp_28 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCurrentTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "int", "currentTime", "", "void"), 0x11F);
        MovieHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 80);
        MovieHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 88);
        MovieHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTimescale", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "timescale", "", "void"), 92);
        MovieHeaderBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "long"), 0x60);
        MovieHeaderBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "long", "duration", "", "void"), 100);
        MovieHeaderBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "", "", "", "double"), 107);
        MovieHeaderBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRate", "org.mp4parser.boxes.iso14496.part12.MovieHeaderBox", "double", "rate", "", "void"), 0x6F);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer0, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, this.timescale);
            byteBuffer0.putLong(this.duration);
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer0, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, this.timescale);
            byteBuffer0.putInt(((int)this.duration));
        }
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.rate);
        IsoTypeWriter.writeFixedPoint88(byteBuffer0, ((double)this.volume));
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
        this.matrix.getContent(byteBuffer0);
        byteBuffer0.putInt(this.previewTime);
        byteBuffer0.putInt(this.previewDuration);
        byteBuffer0.putInt(this.posterTime);
        byteBuffer0.putInt(this.selectionTime);
        byteBuffer0.putInt(this.selectionDuration);
        byteBuffer0.putInt(this.currentTime);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.nextTrackId);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 0x70L : 100L;
    }

    public Date getCreationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.creationTime;
    }

    public int getCurrentTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_27, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.currentTime;
    }

    public long getDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.duration;
    }

    public Matrix getMatrix() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.matrix;
    }

    public Date getModificationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.modificationTime;
    }

    public long getNextTrackId() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.nextTrackId;
    }

    public int getPosterTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.posterTime;
    }

    public int getPreviewDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.previewDuration;
    }

    public int getPreviewTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.previewTime;
    }

    public double getRate() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.rate;
    }

    public int getSelectionDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_25, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_23, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.selectionTime;
    }

    public long getTimescale() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.timescale;
    }

    public float getVolume() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.volume;
    }

    public void setCreationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_1, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.creationTime = date0;
        if(DateHelper.convert(date0) >= 0x100000000L) {
            this.setVersion(1);
        }
    }

    public void setCurrentTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_28, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.currentTime = v;
    }

    public void setDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.duration = v;
        if(v >= 0x100000000L) {
            this.setVersion(1);
        }
    }

    public void setMatrix(Matrix matrix0) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_13, this, this, matrix0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.matrix = matrix0;
    }

    public void setModificationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_3, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.modificationTime = date0;
        if(DateHelper.convert(date0) >= 0x100000000L) {
            this.setVersion(1);
        }
    }

    public void setNextTrackId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_15, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.nextTrackId = v;
    }

    public void setPosterTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_22, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.posterTime = v;
    }

    public void setPreviewDuration(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_20, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.previewDuration = v;
    }

    public void setPreviewTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_18, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.previewTime = v;
    }

    public void setRate(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_9, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.rate = f;
    }

    public void setSelectionDuration(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_26, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.selectionDuration = v;
    }

    public void setSelectionTime(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_24, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.selectionTime = v;
    }

    public void setTimescale(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.timescale = v;
    }

    public void setVolume(float f) {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_11, this, this, Conversions.floatObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.volume = f;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(MovieHeaderBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "MovieHeaderBox[creationTime=" + this.getCreationTime() + ";" + "modificationTime=" + this.getModificationTime() + ";" + "timescale=" + this.getTimescale() + ";" + "duration=" + this.getDuration() + ";" + "rate=" + this.getRate() + ";" + "volume=" + this.getVolume() + ";" + "matrix=" + this.matrix + ";" + "nextTrackId=" + this.getNextTrackId() + "]";
    }
}

