package org.mp4parser.boxes.sampleentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

public final class VisualSampleEntry extends AbstractSampleEntry implements Container {
    static final boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    static {
    }

    public VisualSampleEntry() {
        super("avc1");
        this.horizresolution = 72.0;
        this.vertresolution = 72.0;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public VisualSampleEntry(String s) {
        super(s);
        this.horizresolution = 72.0;
        this.vertresolution = 72.0;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(VisualSampleEntry.class == class0) {
                VisualSampleEntry visualSampleEntry0 = (VisualSampleEntry)object0;
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                try {
                    this.getBox(Channels.newChannel(byteArrayOutputStream0));
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                try {
                    visualSampleEntry0.getBox(Channels.newChannel(byteArrayOutputStream1));
                    return Arrays.equals(byteArrayOutputStream0.toByteArray(), byteArrayOutputStream1.toByteArray());
                }
                catch(IOException iOException1) {
                    throw new RuntimeException(iOException1);
                }
            }
        }
        return false;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(78);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
        IsoTypeWriter.writeUInt16(byteBuffer0, 0);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.predefined[0]);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.predefined[1]);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.predefined[2]);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.getWidth());
        IsoTypeWriter.writeUInt16(byteBuffer0, this.getHeight());
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.getVertresolution());
        IsoTypeWriter.writeUInt32(byteBuffer0, 0L);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.getFrameCount());
        IsoTypeWriter.writeUInt8(byteBuffer0, Utf8.utf8StringLengthInBytes(""));
        byteBuffer0.put(new byte[0]);
        int v = Utf8.utf8StringLengthInBytes("");
        while(v < 0x1F) {
            ++v;
            byteBuffer0.put(0);
        }
        IsoTypeWriter.writeUInt16(byteBuffer0, this.getDepth());
        IsoTypeWriter.writeUInt16(byteBuffer0, 0xFFFF);
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    public String getCompressorname() [...] // 潜在的解密器

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 86L >= 0x100000000L ? v + 94L : v + 86L;
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            this.getBox(Channels.newChannel(byteArrayOutputStream0));
            return Arrays.hashCode(byteArrayOutputStream0.toByteArray());
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(78);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        IsoTypeReader.readUInt16(byteBuffer1);
        IsoTypeReader.readUInt16(byteBuffer1);
        long[] arr_v = this.predefined;
        arr_v[0] = IsoTypeReader.readUInt32(byteBuffer1);
        long[] arr_v1 = this.predefined;
        arr_v1[1] = IsoTypeReader.readUInt32(byteBuffer1);
        long[] arr_v2 = this.predefined;
        arr_v2[2] = IsoTypeReader.readUInt32(byteBuffer1);
        this.width = IsoTypeReader.readUInt16(byteBuffer1);
        this.height = IsoTypeReader.readUInt16(byteBuffer1);
        this.horizresolution = IsoTypeReader.readFixedPoint1616(byteBuffer1);
        this.vertresolution = IsoTypeReader.readFixedPoint1616(byteBuffer1);
        IsoTypeReader.readUInt32(byteBuffer1);
        this.frameCount = IsoTypeReader.readUInt16(byteBuffer1);
        int v1 = IsoTypeReader.readUInt8(byteBuffer1);
        if(v1 > 0x1F) {
            v1 = 0x1F;
        }
        byte[] arr_b = new byte[v1];
        byteBuffer1.get(arr_b);
        this.compressorname = Utf8.convert(arr_b);
        if(v1 < 0x1F) {
            byteBuffer1.get(new byte[0x1F - v1]);
        }
        this.depth = IsoTypeReader.readUInt16(byteBuffer1);
        IsoTypeReader.readUInt16(byteBuffer1);
        this.initContainer(readableByteChannel0, v - 78L, boxParser0);
    }

    public void setCompressorname(String s) {
        this.compressorname = s;
    }

    public void setDepth(int v) {
        this.depth = v;
    }

    public void setFrameCount(int v) {
        this.frameCount = v;
    }

    public void setHeight(int v) {
        this.height = v;
    }

    public void setHorizresolution(double f) {
        this.horizresolution = f;
    }

    public void setType(String s) {
        this.type = s;
    }

    public void setVertresolution(double f) {
        this.vertresolution = f;
    }

    public void setWidth(int v) {
        this.width = v;
    }
}

