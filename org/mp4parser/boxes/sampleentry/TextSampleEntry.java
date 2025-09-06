package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TextSampleEntry extends AbstractSampleEntry {
    public static class BoxRecord {
        int bottom;
        int left;
        int right;
        int top;

        public BoxRecord() {
        }

        public BoxRecord(int v, int v1, int v2, int v3) {
            this.top = v;
            this.left = v1;
            this.bottom = v2;
            this.right = v3;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.bottom != ((BoxRecord)object0).bottom) {
                return false;
            }
            if(this.left != ((BoxRecord)object0).left) {
                return false;
            }
            return this.right == ((BoxRecord)object0).right ? this.top == ((BoxRecord)object0).top : false;
        }

        public void getContent(ByteBuffer byteBuffer0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.top);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.left);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.bottom);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.right);
        }

        public int getSize() {
            return 8;
        }

        @Override
        public int hashCode() {
            return ((this.top * 0x1F + this.left) * 0x1F + this.bottom) * 0x1F + this.right;
        }

        public void parse(ByteBuffer byteBuffer0) {
            this.top = IsoTypeReader.readUInt16(byteBuffer0);
            this.left = IsoTypeReader.readUInt16(byteBuffer0);
            this.bottom = IsoTypeReader.readUInt16(byteBuffer0);
            this.right = IsoTypeReader.readUInt16(byteBuffer0);
        }
    }

    public static class StyleRecord {
        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int[] textColor;

        public StyleRecord() {
            this.textColor = new int[]{0xFF, 0xFF, 0xFF, 0xFF};
        }

        public StyleRecord(int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            this.startChar = v;
            this.endChar = v1;
            this.fontId = v2;
            this.faceStyleFlags = v3;
            this.fontSize = v4;
            this.textColor = arr_v;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.endChar != ((StyleRecord)object0).endChar) {
                return false;
            }
            if(this.faceStyleFlags != ((StyleRecord)object0).faceStyleFlags) {
                return false;
            }
            if(this.fontId != ((StyleRecord)object0).fontId) {
                return false;
            }
            if(this.fontSize != ((StyleRecord)object0).fontSize) {
                return false;
            }
            return this.startChar == ((StyleRecord)object0).startChar ? Arrays.equals(this.textColor, ((StyleRecord)object0).textColor) : false;
        }

        public void getContent(ByteBuffer byteBuffer0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.startChar);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.endChar);
            IsoTypeWriter.writeUInt16(byteBuffer0, this.fontId);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.faceStyleFlags);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.fontSize);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.textColor[0]);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.textColor[1]);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.textColor[2]);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.textColor[3]);
        }

        public int getSize() {
            return 12;
        }

        @Override
        public int hashCode() {
            int v = ((((this.startChar * 0x1F + this.endChar) * 0x1F + this.fontId) * 0x1F + this.faceStyleFlags) * 0x1F + this.fontSize) * 0x1F;
            return this.textColor == null ? v : v + Arrays.hashCode(this.textColor);
        }

        public void parse(ByteBuffer byteBuffer0) {
            this.startChar = IsoTypeReader.readUInt16(byteBuffer0);
            this.endChar = IsoTypeReader.readUInt16(byteBuffer0);
            this.fontId = IsoTypeReader.readUInt16(byteBuffer0);
            this.faceStyleFlags = IsoTypeReader.readUInt8(byteBuffer0);
            this.fontSize = IsoTypeReader.readUInt8(byteBuffer0);
            int[] arr_v = new int[4];
            this.textColor = arr_v;
            arr_v[0] = IsoTypeReader.readUInt8(byteBuffer0);
            int[] arr_v1 = this.textColor;
            arr_v1[1] = IsoTypeReader.readUInt8(byteBuffer0);
            int[] arr_v2 = this.textColor;
            arr_v2[2] = IsoTypeReader.readUInt8(byteBuffer0);
            int[] arr_v3 = this.textColor;
            arr_v3[3] = IsoTypeReader.readUInt8(byteBuffer0);
        }
    }

    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private StyleRecord styleRecord;
    private int verticalJustification;

    public TextSampleEntry() {
        super("tx3g");
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }

    public TextSampleEntry(String s) {
        super(s);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new BoxRecord();
        this.styleRecord = new StyleRecord();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(38);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.displayFlags);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.horizontalJustification);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.verticalJustification);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.backgroundColorRgba[0]);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.backgroundColorRgba[1]);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.backgroundColorRgba[2]);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.backgroundColorRgba[3]);
        this.boxRecord.getContent(byteBuffer0);
        this.styleRecord.getContent(byteBuffer0);
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    public BoxRecord getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 38L >= 0x100000000L ? v + 54L : v + 46L;
    }

    public StyleRecord getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & 0x800L) == 0x800L;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & 0x40000L) == 0x40000L;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 0x180L) == 0x180L;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 0x20L) == 0x20L;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 0x40L) == 0x40L;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & 0x20000L) == 0x20000L;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(38);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        this.displayFlags = IsoTypeReader.readUInt32(byteBuffer1);
        this.horizontalJustification = IsoTypeReader.readUInt8(byteBuffer1);
        this.verticalJustification = IsoTypeReader.readUInt8(byteBuffer1);
        int[] arr_v = new int[4];
        this.backgroundColorRgba = arr_v;
        arr_v[0] = IsoTypeReader.readUInt8(byteBuffer1);
        int[] arr_v1 = this.backgroundColorRgba;
        arr_v1[1] = IsoTypeReader.readUInt8(byteBuffer1);
        int[] arr_v2 = this.backgroundColorRgba;
        arr_v2[2] = IsoTypeReader.readUInt8(byteBuffer1);
        int[] arr_v3 = this.backgroundColorRgba;
        arr_v3[3] = IsoTypeReader.readUInt8(byteBuffer1);
        BoxRecord textSampleEntry$BoxRecord0 = new BoxRecord();
        this.boxRecord = textSampleEntry$BoxRecord0;
        textSampleEntry$BoxRecord0.parse(byteBuffer1);
        StyleRecord textSampleEntry$StyleRecord0 = new StyleRecord();
        this.styleRecord = textSampleEntry$StyleRecord0;
        textSampleEntry$StyleRecord0.parse(byteBuffer1);
        this.initContainer(readableByteChannel0, v - 38L, boxParser0);
    }

    public void setBackgroundColorRgba(int[] arr_v) {
        this.backgroundColorRgba = arr_v;
    }

    public void setBoxRecord(BoxRecord textSampleEntry$BoxRecord0) {
        this.boxRecord = textSampleEntry$BoxRecord0;
    }

    public void setContinuousKaraoke(boolean z) {
        if(z) {
            this.displayFlags |= 0x800L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFFF7FFL;
    }

    public void setFillTextRegion(boolean z) {
        if(z) {
            this.displayFlags |= 0x40000L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFBFFFFL;
    }

    public void setHorizontalJustification(int v) {
        this.horizontalJustification = v;
    }

    public void setScrollDirection(boolean z) {
        if(z) {
            this.displayFlags |= 0x180L;
            return;
        }
        this.displayFlags &= -385L;
    }

    public void setScrollIn(boolean z) {
        if(z) {
            this.displayFlags |= 0x20L;
            return;
        }
        this.displayFlags &= -33L;
    }

    public void setScrollOut(boolean z) {
        if(z) {
            this.displayFlags |= 0x40L;
            return;
        }
        this.displayFlags &= -65L;
    }

    public void setStyleRecord(StyleRecord textSampleEntry$StyleRecord0) {
        this.styleRecord = textSampleEntry$StyleRecord0;
    }

    public void setType(String s) {
        this.type = s;
    }

    public void setVerticalJustification(int v) {
        this.verticalJustification = v;
    }

    public void setWriteTextVertically(boolean z) {
        if(z) {
            this.displayFlags |= 0x20000L;
            return;
        }
        this.displayFlags &= 0xFFFFFFFFFFFDFFFFL;
    }

    @Override  // org.mp4parser.BasicContainer
    public String toString() {
        return "TextSampleEntry";
    }
}

