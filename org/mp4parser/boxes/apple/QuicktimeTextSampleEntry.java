package org.mp4parser.boxes.apple;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import org.mp4parser.Box;
import org.mp4parser.BoxParser;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super("text");
        this.foregroundR = 0xFFFF;
        this.foregroundG = 0xFFFF;
        this.foregroundB = 0xFFFF;
        this.fontName = "";
    }

    @Override  // org.mp4parser.BasicContainer
    public void addBox(Box box0) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate((this.fontName == null ? 0 : this.fontName.length()) + 52);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        byteBuffer0.putInt(this.displayFlags);
        byteBuffer0.putInt(this.textJustification);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.backgroundR);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.backgroundG);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.backgroundB);
        IsoTypeWriter.writeUInt64(byteBuffer0, this.defaultTextBox);
        IsoTypeWriter.writeUInt64(byteBuffer0, this.reserved1);
        byteBuffer0.putShort(this.fontNumber);
        byteBuffer0.putShort(this.fontFace);
        byteBuffer0.put(this.reserved2);
        byteBuffer0.putShort(this.reserved3);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.foregroundR);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.foregroundG);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.foregroundB);
        String s = this.fontName;
        if(s != null) {
            IsoTypeWriter.writeUInt8(byteBuffer0, s.length());
            byteBuffer0.put(this.fontName.getBytes());
        }
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize() + 52L + ((long)(this.fontName == null ? 0 : this.fontName.length()));
        return this.largeBox || v + 8L >= 0x100000000L ? v + 16L : v + 8L;
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(CastUtils.l2i(v));
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        this.displayFlags = byteBuffer1.getInt();
        this.textJustification = byteBuffer1.getInt();
        this.backgroundR = IsoTypeReader.readUInt16(byteBuffer1);
        this.backgroundG = IsoTypeReader.readUInt16(byteBuffer1);
        this.backgroundB = IsoTypeReader.readUInt16(byteBuffer1);
        this.defaultTextBox = IsoTypeReader.readUInt64(byteBuffer1);
        this.reserved1 = IsoTypeReader.readUInt64(byteBuffer1);
        this.fontNumber = byteBuffer1.getShort();
        this.fontFace = byteBuffer1.getShort();
        this.reserved2 = byteBuffer1.get();
        this.reserved3 = byteBuffer1.getShort();
        this.foregroundR = IsoTypeReader.readUInt16(byteBuffer1);
        this.foregroundG = IsoTypeReader.readUInt16(byteBuffer1);
        this.foregroundB = IsoTypeReader.readUInt16(byteBuffer1);
        if(byteBuffer1.remaining() > 0) {
            byte[] arr_b = new byte[IsoTypeReader.readUInt8(byteBuffer1)];
            byteBuffer1.get(arr_b);
            this.fontName = new String(arr_b);
            return;
        }
        this.fontName = null;
    }

    public void setBackgroundB(int v) {
        this.backgroundB = v;
    }

    public void setBackgroundG(int v) {
        this.backgroundG = v;
    }

    public void setBackgroundR(int v) {
        this.backgroundR = v;
    }

    @Override  // org.mp4parser.BasicContainer, org.mp4parser.Container
    public void setBoxes(List list0) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long v) {
        this.defaultTextBox = v;
    }

    public void setDisplayFlags(int v) {
        this.displayFlags = v;
    }

    public void setFontFace(short v) {
        this.fontFace = v;
    }

    public void setFontName(String s) {
        this.fontName = s;
    }

    public void setFontNumber(short v) {
        this.fontNumber = v;
    }

    public void setForegroundB(int v) {
        this.foregroundB = v;
    }

    public void setForegroundG(int v) {
        this.foregroundG = v;
    }

    public void setForegroundR(int v) {
        this.foregroundR = v;
    }

    public void setReserved1(long v) {
        this.reserved1 = v;
    }

    public void setReserved2(byte b) {
        this.reserved2 = b;
    }

    public void setReserved3(short v) {
        this.reserved3 = v;
    }

    public void setTextJustification(int v) {
        this.textJustification = v;
    }
}

