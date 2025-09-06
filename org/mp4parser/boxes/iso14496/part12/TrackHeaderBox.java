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

public class TrackHeaderBox extends AbstractFullBox {
    private static a LOG = null;
    public static final String TYPE = "tkhd";
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
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        TrackHeaderBox.ajc$preClinit();
        TrackHeaderBox.LOG = b.i(TrackHeaderBox.class);
    }

    public TrackHeaderBox() {
        super("tkhd");
        this.creationTime = new Date(0L);
        this.modificationTime = new Date(0L);
        this.matrix = Matrix.ROTATE_0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer0));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(byteBuffer0));
            this.trackId = IsoTypeReader.readUInt32(byteBuffer0);
            IsoTypeReader.readUInt32(byteBuffer0);
            this.duration = byteBuffer0.getLong();
        }
        else {
            this.creationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer0));
            this.modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(byteBuffer0));
            this.trackId = IsoTypeReader.readUInt32(byteBuffer0);
            IsoTypeReader.readUInt32(byteBuffer0);
            this.duration = (long)byteBuffer0.getInt();
        }
        if(this.duration < -1L) {
            TrackHeaderBox.LOG.o("tkhd duration is not in expected range");
        }
        IsoTypeReader.readUInt32(byteBuffer0);
        IsoTypeReader.readUInt32(byteBuffer0);
        this.layer = IsoTypeReader.readUInt16(byteBuffer0);
        this.alternateGroup = IsoTypeReader.readUInt16(byteBuffer0);
        this.volume = IsoTypeReader.readFixedPoint88(byteBuffer0);
        IsoTypeReader.readUInt16(byteBuffer0);
        this.matrix = Matrix.fromByteBuffer(byteBuffer0);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrackHeaderBox.java", TrackHeaderBox.class);
        TrackHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 62);
        TrackHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 66);
        TrackHeaderBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 0x70);
        TrackHeaderBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAlternateGroup", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "alternateGroup", "", "void"), 0x74);
        TrackHeaderBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "float"), 120);
        TrackHeaderBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setVolume", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "float", "volume", "", "void"), 0x7C);
        TrackHeaderBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "org.mp4parser.support.Matrix"), 0x80);
        TrackHeaderBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMatrix", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "org.mp4parser.support.Matrix", "matrix", "", "void"), 0x84);
        TrackHeaderBox.ajc$tjp_16 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 0x88);
        TrackHeaderBox.ajc$tjp_17 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setWidth", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "width", "", "void"), 140);
        TrackHeaderBox.ajc$tjp_18 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "double"), 0x90);
        TrackHeaderBox.ajc$tjp_19 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setHeight", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "double", "height", "", "void"), 0x94);
        TrackHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.util.Date"), 73);
        TrackHeaderBox.ajc$tjp_20 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContent", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 0xC3);
        TrackHeaderBox.ajc$tjp_21 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "java.lang.String"), 0xDF);
        TrackHeaderBox.ajc$tjp_22 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 0xF9);
        TrackHeaderBox.ajc$tjp_23 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEnabled", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "enabled", "", "void"), 0xFD);
        TrackHeaderBox.ajc$tjp_24 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 0x105);
        TrackHeaderBox.ajc$tjp_25 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setInMovie", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inMovie", "", "void"), 0x109);
        TrackHeaderBox.ajc$tjp_26 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 273);
        TrackHeaderBox.ajc$tjp_27 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setInPreview", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPreview", "", "void"), 277);
        TrackHeaderBox.ajc$tjp_28 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "isInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "boolean"), 285);
        TrackHeaderBox.ajc$tjp_29 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setInPoster", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "boolean", "inPoster", "", "void"), 289);
        TrackHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 77);
        TrackHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 85);
        TrackHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "trackId", "", "void"), 89);
        TrackHeaderBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "long"), 93);
        TrackHeaderBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "long", "duration", "", "void"), 97);
        TrackHeaderBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "", "", "", "int"), 104);
        TrackHeaderBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLayer", "org.mp4parser.boxes.iso14496.part12.TrackHeaderBox", "int", "layer", "", "void"), 108);
    }

    public int getAlternateGroup() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.alternateGroup;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_20, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.writeVersionAndFlags(byteBuffer0);
        if(this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer0, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt64(byteBuffer0, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
            byteBuffer0.putLong(this.duration);
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer0, DateHelper.convert(this.creationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, DateHelper.convert(this.modificationTime));
            IsoTypeWriter.writeUInt32(byteBuffer0, this.trackId);
            IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
            byteBuffer0.putInt(((int)this.duration));
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.layer);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.alternateGroup);
        IsoTypeWriter.writeFixedPoint88(byteBuffer0, ((double)this.volume));
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
        this.matrix.getContent(byteBuffer0);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.height);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 0x60L : 84L;
    }

    public Date getCreationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.creationTime;
    }

    public long getDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.duration;
    }

    public double getHeight() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.height;
    }

    public int getLayer() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.layer;
    }

    public Matrix getMatrix() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.matrix;
    }

    public Date getModificationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.modificationTime;
    }

    public long getTrackId() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackId;
    }

    public float getVolume() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.volume;
    }

    public double getWidth() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.width;
    }

    public boolean isEnabled() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (this.getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_11, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.alternateGroup = v;
    }

    public void setCreationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_1, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.creationTime = date0;
        if(DateHelper.convert(date0) >= 0x100000000L) {
            this.setVersion(1);
        }
    }

    public void setDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.duration = v;
        if(v >= 0x100000000L) {
            this.setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_23, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 1);
            return;
        }
        this.setFlags(this.getFlags() & -2);
    }

    public void setHeight(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_19, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.height = f;
    }

    public void setInMovie(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_25, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 2);
            return;
        }
        this.setFlags(this.getFlags() & -3);
    }

    public void setInPoster(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_29, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 8);
            return;
        }
        this.setFlags(this.getFlags() & -9);
    }

    public void setInPreview(boolean z) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_27, this, this, Conversions.booleanObject(z));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(z) {
            this.setFlags(this.getFlags() | 4);
            return;
        }
        this.setFlags(this.getFlags() & -5);
    }

    public void setLayer(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_9, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.layer = v;
    }

    public void setMatrix(Matrix matrix0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_15, this, this, matrix0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.matrix = matrix0;
    }

    public void setModificationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_3, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.modificationTime = date0;
        if(DateHelper.convert(date0) >= 0x100000000L) {
            this.setVersion(1);
        }
    }

    public void setTrackId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackId = v;
    }

    public void setVolume(float f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_13, this, this, Conversions.floatObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.volume = f;
    }

    public void setWidth(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_17, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.width = f;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrackHeaderBox.ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrackHeaderBox[creationTime=" + this.getCreationTime() + ";" + "modificationTime=" + this.getModificationTime() + ";" + "trackId=" + this.getTrackId() + ";" + "duration=" + this.getDuration() + ";" + "layer=" + this.getLayer() + ";" + "alternateGroup=" + this.getAlternateGroup() + ";" + "volume=" + this.getVolume() + ";" + "matrix=" + this.matrix + ";" + "width=" + this.getWidth() + ";" + "height=" + this.getHeight() + "]";
    }
}

