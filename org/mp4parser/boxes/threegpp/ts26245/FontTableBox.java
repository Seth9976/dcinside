package org.mp4parser.boxes.threegpp.ts26245;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public class FontTableBox extends AbstractBox {
    public static class FontRecord {
        int fontId;
        String fontname;

        public FontRecord() {
        }

        public FontRecord(int v, String s) {
            this.fontId = v;
            this.fontname = s;
        }

        public void getContent(ByteBuffer byteBuffer0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.fontname.length());
            byteBuffer0.put(Utf8.convert(this.fontname));
        }

        public int getSize() {
            return Utf8.utf8StringLengthInBytes(this.fontname) + 3;
        }

        public void parse(ByteBuffer byteBuffer0) {
            this.fontId = IsoTypeReader.readUInt16(byteBuffer0);
            this.fontname = IsoTypeReader.readString(byteBuffer0, IsoTypeReader.readUInt8(byteBuffer0));
        }

        @Override
        public String toString() {
            return "FontRecord{fontId=" + this.fontId + ", fontname=\'" + this.fontname + '\'' + '}';
        }
    }

    public static final String TYPE = "ftab";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    List entries;

    static {
        FontTableBox.ajc$preClinit();
    }

    public FontTableBox() {
        super("ftab");
        this.entries = new LinkedList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        int v = IsoTypeReader.readUInt16(byteBuffer0);
        for(int v1 = 0; v1 < v; ++v1) {
            FontRecord fontTableBox$FontRecord0 = new FontRecord();
            fontTableBox$FontRecord0.parse(byteBuffer0);
            this.entries.add(fontTableBox$FontRecord0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("FontTableBox.java", FontTableBox.class);
        FontTableBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.threegpp.ts26245.FontTableBox", "", "", "", "java.util.List"), 52);
        FontTableBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.threegpp.ts26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt16(byteBuffer0, this.entries.size());
        for(Object object0: this.entries) {
            ((FontRecord)object0).getContent(byteBuffer0);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = 2;
        for(Object object0: this.entries) {
            v += ((FontRecord)object0).getSize();
        }
        return (long)v;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(FontTableBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(FontTableBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }
}

