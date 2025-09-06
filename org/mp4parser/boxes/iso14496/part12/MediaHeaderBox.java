package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Date;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.DateHelper;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

public class MediaHeaderBox extends AbstractFullBox {
    private static a LOG = null;
    public static final String TYPE = "mdhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    static {
        MediaHeaderBox.ajc$preClinit();
        MediaHeaderBox.LOG = b.i(MediaHeaderBox.class);
    }

    public MediaHeaderBox() {
        super("mdhd");
        this.creationTime = new Date();
        this.modificationTime = new Date();
        this.language = "eng";
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
            MediaHeaderBox.LOG.o("mdhd duration is not in expected range");
        }
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        IsoTypeReader.readUInt16(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("MediaHeaderBox.java", MediaHeaderBox.class);
        MediaHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 0x30);
        MediaHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 52);
        MediaHeaderBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 0x7D);
        MediaHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"), 56);
        MediaHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 60);
        MediaHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"), 0x40);
        MediaHeaderBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "timescale", "", "void"), 68);
        MediaHeaderBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"), 72);
        MediaHeaderBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "duration", "", "void"), 76);
        MediaHeaderBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"), 80);
        MediaHeaderBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.lang.String", "language", "", "void"), 84);
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
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? 36L : 24L;
    }

    public Date getCreationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.creationTime;
    }

    public long getDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.duration;
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public Date getModificationTime() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.modificationTime;
    }

    public long getTimescale() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.timescale;
    }

    public void setCreationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_1, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.creationTime = date0;
    }

    public void setDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.duration = v;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_9, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    public void setModificationTime(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_3, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.modificationTime = date0;
    }

    public void setTimescale(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.timescale = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(MediaHeaderBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "MediaHeaderBox[creationTime=" + this.getCreationTime() + ";" + "modificationTime=" + this.getModificationTime() + ";" + "timescale=" + this.getTimescale() + ";" + "duration=" + this.getDuration() + ";" + "language=" + this.getLanguage() + "]";
    }
}

