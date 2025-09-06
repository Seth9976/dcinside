package org.mp4parser.boxes.apple;

import j..util.DesugarTimeZone;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

public class AppleRecordingYearBox extends AppleDataBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    Date date;
    DateFormat df;

    static {
        AppleRecordingYearBox.ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super("©day", 1);
        this.date = new Date();
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'kk:mm:ssZ");
        this.df = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleRecordingYearBox.java", AppleRecordingYearBox.class);
        AppleRecordingYearBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDate", "org.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 38);
        AppleRecordingYearBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDate", "org.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 42);
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return Utf8.convert(AppleRecordingYearBox.rfc822toIso8601Date(this.df.format(this.date))).length;
    }

    public Date getDate() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleRecordingYearBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.date;
    }

    protected static String iso8601toRfc822Date(String s) {
        return s.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        String s = IsoTypeReader.readString(byteBuffer0, byteBuffer0.remaining());
        try {
            this.date = this.df.parse(AppleRecordingYearBox.iso8601toRfc822Date(s));
        }
        catch(ParseException parseException0) {
            throw new RuntimeException(parseException0);
        }
    }

    protected static String rfc822toIso8601Date(String s) {
        return s.replaceAll("\\+0000$", "Z");
    }

    public void setDate(Date date0) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleRecordingYearBox.ajc$tjp_1, this, this, date0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.date = date0;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return Utf8.convert(AppleRecordingYearBox.rfc822toIso8601Date(this.df.format(this.date)));
    }
}

