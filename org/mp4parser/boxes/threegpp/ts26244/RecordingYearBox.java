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

public class RecordingYearBox extends AbstractFullBox {
    public static final String TYPE = "yrrc";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    int recordingYear;

    static {
        RecordingYearBox.ajc$preClinit();
    }

    public RecordingYearBox() {
        super("yrrc");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.recordingYear = IsoTypeReader.readUInt16(byteBuffer0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("RecordingYearBox.java", RecordingYearBox.class);
        RecordingYearBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getRecordingYear", "org.mp4parser.boxes.threegpp.ts26244.RecordingYearBox", "", "", "", "int"), 42);
        RecordingYearBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setRecordingYear", "org.mp4parser.boxes.threegpp.ts26244.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.recordingYear);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 6L;
    }

    public int getRecordingYear() {
        JoinPoint joinPoint0 = Factory.makeJP(RecordingYearBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.recordingYear;
    }

    public void setRecordingYear(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(RecordingYearBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.recordingYear = v;
    }
}

