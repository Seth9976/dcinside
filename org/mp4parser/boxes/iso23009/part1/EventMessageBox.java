package org.mp4parser.boxes.iso23009.part1;

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

public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = "emsg";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_10;
    private static StaticPart ajc$tjp_11;
    private static StaticPart ajc$tjp_12;
    private static StaticPart ajc$tjp_13;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    private static StaticPart ajc$tjp_9;
    long eventDuration;
    long id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        EventMessageBox.ajc$preClinit();
    }

    public EventMessageBox() {
        super("emsg");
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.schemeIdUri = IsoTypeReader.readString(byteBuffer0);
        this.value = IsoTypeReader.readString(byteBuffer0);
        this.timescale = IsoTypeReader.readUInt32(byteBuffer0);
        this.presentationTimeDelta = IsoTypeReader.readUInt32(byteBuffer0);
        this.eventDuration = IsoTypeReader.readUInt32(byteBuffer0);
        this.id = IsoTypeReader.readUInt32(byteBuffer0);
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        this.messageData = arr_b;
        byteBuffer0.get(arr_b);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("EventMessageBox.java", EventMessageBox.class);
        EventMessageBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getSchemeIdUri", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        EventMessageBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setSchemeIdUri", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 0x3F);
        EventMessageBox.ajc$tjp_10 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getId", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"), 99);
        EventMessageBox.ajc$tjp_11 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setId", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "id", "", "void"), 103);
        EventMessageBox.ajc$tjp_12 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getMessageData", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        EventMessageBox.ajc$tjp_13 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setMessageData", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 0x6F);
        EventMessageBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getValue", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        EventMessageBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setValue", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        EventMessageBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getTimescale", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"), 75);
        EventMessageBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setTimescale", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"), 0x4F);
        EventMessageBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPresentationTimeDelta", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"), 83);
        EventMessageBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPresentationTimeDelta", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"), 87);
        EventMessageBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEventDuration", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"), 91);
        EventMessageBox.ajc$tjp_9 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEventDuration", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"), 0x5F);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUtf8String(byteBuffer0, this.schemeIdUri);
        IsoTypeWriter.writeUtf8String(byteBuffer0, this.value);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.timescale);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.presentationTimeDelta);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.eventDuration);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.id);
        byteBuffer0.put(this.messageData);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(Utf8.utf8StringLengthInBytes(this.schemeIdUri) + 22 + Utf8.utf8StringLengthInBytes(this.value) + this.messageData.length);
    }

    public long getEventDuration() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.eventDuration;
    }

    public long getId() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.id;
    }

    public byte[] getMessageData() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.schemeIdUri;
    }

    public long getTimescale() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.timescale;
    }

    public String getValue() {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.value;
    }

    public void setEventDuration(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_9, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.eventDuration = v;
    }

    public void setId(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_11, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.id = v;
    }

    public void setMessageData(byte[] arr_b) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_13, this, this, arr_b);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.messageData = arr_b;
    }

    public void setPresentationTimeDelta(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_7, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.presentationTimeDelta = v;
    }

    public void setSchemeIdUri(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.schemeIdUri = s;
    }

    public void setTimescale(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_5, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.timescale = v;
    }

    public void setValue(String s) {
        JoinPoint joinPoint0 = Factory.makeJP(EventMessageBox.ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.value = s;
    }
}

