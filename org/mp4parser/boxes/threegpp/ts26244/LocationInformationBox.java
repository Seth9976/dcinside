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

public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = "loci";
    private String additionalNotes;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_14;
    private static StaticPart ajc$tjp_15;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    static {
        LocationInformationBox.ajc$preClinit();
    }

    public LocationInformationBox() {
        super("loci");
        this.name = "";
        this.astronomicalBody = "";
        this.additionalNotes = "";
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.language = IsoTypeReader.readIso639(byteBuffer0);
        this.name = IsoTypeReader.readString(byteBuffer0);
        this.role = IsoTypeReader.readUInt8(byteBuffer0);
        this.longitude = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.latitude = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.altitude = IsoTypeReader.readFixedPoint1616(byteBuffer0);
        this.astronomicalBody = IsoTypeReader.readString(byteBuffer0);
        this.additionalNotes = IsoTypeReader.readString(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("LocationInformationBox.java", LocationInformationBox.class);
        LocationInformationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLanguage", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        LocationInformationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLanguage", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        LocationInformationBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAltitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"), 70);
        LocationInformationBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAltitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        LocationInformationBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAstronomicalBody", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        LocationInformationBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAstronomicalBody", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        LocationInformationBox.ajc$tjp_14 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getAdditionalNotes", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        LocationInformationBox.ajc$tjp_15 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setAdditionalNotes", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        LocationInformationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getName", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        LocationInformationBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setName", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        LocationInformationBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRole", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "int"), 46);
        LocationInformationBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRole", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "int", "role", "", "void"), 50);
        LocationInformationBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLongitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"), 54);
        LocationInformationBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLongitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        LocationInformationBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getLatitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "", "", "", "double"), 62);
        LocationInformationBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setLatitude", "org.mp4parser.boxes.threegpp.ts26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    public String getAdditionalNotes() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.additionalNotes;
    }

    public double getAltitude() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.altitude;
    }

    public String getAstronomicalBody() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.astronomicalBody;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeIso639(byteBuffer0, this.language);
        byteBuffer0.put(Utf8.convert(this.name));
        byteBuffer0.put(0);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.role);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.longitude);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.latitude);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.altitude);
        byteBuffer0.put(Utf8.convert(this.astronomicalBody));
        byteBuffer0.put(0);
        byteBuffer0.put(Utf8.convert(this.additionalNotes));
        byteBuffer0.put(0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        byte[] arr_b = Utf8.convert(this.name);
        byte[] arr_b1 = Utf8.convert(this.astronomicalBody);
        byte[] arr_b2 = Utf8.convert(this.additionalNotes);
        return (long)(arr_b.length + 22 + arr_b1.length + arr_b2.length);
    }

    public String getLanguage() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.language;
    }

    public double getLatitude() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.latitude;
    }

    public double getLongitude() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.longitude;
    }

    public String getName() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.name;
    }

    public int getRole() {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.role;
    }

    public void setAdditionalNotes(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_15, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.additionalNotes = s;
    }

    public void setAltitude(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_11, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.altitude = f;
    }

    public void setAstronomicalBody(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_13, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.astronomicalBody = s;
    }

    public void setLanguage(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.language = s;
    }

    public void setLatitude(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_9, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.latitude = f;
    }

    public void setLongitude(double f) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_7, this, this, Conversions.doubleObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.longitude = f;
    }

    public void setName(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.name = s;
    }

    public void setRole(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(LocationInformationBox.ajc$tjp_5, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.role = v;
    }
}

