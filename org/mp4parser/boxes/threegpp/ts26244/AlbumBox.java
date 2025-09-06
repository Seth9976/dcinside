package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = "albm";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        AlbumBox.ajc$preClinit();
    }

    public AlbumBox() {
        super("albm");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.albumTitle = IsoTypeReader.readString(byteBuffer0);
        if(byteBuffer0.remaining() > 0) {
            this.trackNumber = IsoTypeReader.readUInt8(byteBuffer0);
            return;
        }
        this.trackNumber = -1;
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AlbumBox.java", AlbumBox.class);
        AlbumBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"), 52);
        AlbumBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "java.lang.String", "language", "", "void"), 56);
        AlbumBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAlbumTitle", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"), 60);
        AlbumBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAlbumTitle", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 0x40);
        AlbumBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTrackNumber", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "int"), 68);
        AlbumBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTrackNumber", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "int", "trackNumber", "", "void"), 72);
        AlbumBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"), 104);
    }

    public String getAlbumTitle() {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.albumTitle;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.albumTitle));
        byteBuffer0.put(0);
        int v = this.trackNumber;
        if(v != -1) {
            IsoTypeWriter.writeUInt8(byteBuffer0, v);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = Utf8.utf8StringLengthInBytes(this.albumTitle);
        return this.trackNumber == -1 ? ((long)(v + 7)) : ((long)(v + 8));
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public int getTrackNumber() {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.trackNumber;
    }

    public void setAlbumTitle(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.albumTitle = s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    public void setTrackNumber(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.trackNumber = v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(AlbumBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("AlbumBox[language=");
        stringBuilder0.append(this.getLanguage());
        stringBuilder0.append(";");
        stringBuilder0.append("albumTitle=");
        stringBuilder0.append(this.getAlbumTitle());
        if(this.trackNumber >= 0) {
            stringBuilder0.append(";trackNumber=");
            stringBuilder0.append(this.getTrackNumber());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

