package org.mp4parser.boxes.sampleentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.Box;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

public final class AudioSampleEntry extends AbstractSampleEntry {
    private static a LOG = null;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    static {
        AudioSampleEntry.LOG = b.i(AudioSampleEntry.class);
    }

    public AudioSampleEntry(String s) {
        super(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(AudioSampleEntry.class == class0) {
                AudioSampleEntry audioSampleEntry0 = (AudioSampleEntry)object0;
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                try {
                    this.getBox(Channels.newChannel(byteArrayOutputStream0));
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                try {
                    audioSampleEntry0.getBox(Channels.newChannel(byteArrayOutputStream1));
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
        ByteBuffer byteBuffer0 = ByteBuffer.allocate((this.soundVersion == 1 ? 16 : 0) + 28 + (this.soundVersion == 2 ? 36 : 0));
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.soundVersion);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.reserved2);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.channelCount);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.sampleSize);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.compressionId);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.packetSize);
        if(this.type.equals("mlpa")) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSampleRate());
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSampleRate() << 16);
        }
        if(this.soundVersion == 1) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerSample);
        }
        if(this.soundVersion == 2) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.bytesPerSample);
            byteBuffer0.put(this.soundVersion2Data);
        }
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        int v = this.soundVersion;
        int v1 = 0;
        int v2 = 16;
        if(v == 2) {
            v1 = 36;
        }
        long v3 = ((long)((v == 1 ? 16 : 0) + 28 + v1)) + this.getContainerSize();
        if(!this.largeBox && v3 + 8L < 0x100000000L) {
            v2 = 8;
        }
        return v3 + ((long)v2);
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
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
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(28);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        this.soundVersion = IsoTypeReader.readUInt16(byteBuffer1);
        this.reserved1 = IsoTypeReader.readUInt16(byteBuffer1);
        this.reserved2 = IsoTypeReader.readUInt32(byteBuffer1);
        this.channelCount = IsoTypeReader.readUInt16(byteBuffer1);
        this.sampleSize = IsoTypeReader.readUInt16(byteBuffer1);
        this.compressionId = IsoTypeReader.readUInt16(byteBuffer1);
        this.packetSize = IsoTypeReader.readUInt16(byteBuffer1);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer1);
        int v1 = 16;
        if(!this.type.equals("mlpa")) {
            this.sampleRate >>>= 16;
        }
        if(this.soundVersion == 1) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(16);
            readableByteChannel0.read(byteBuffer2);
            byteBuffer2.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBuffer2);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBuffer2);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBuffer2);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBuffer2);
        }
        int v2 = 36;
        if(this.soundVersion == 2) {
            ByteBuffer byteBuffer3 = ByteBuffer.allocate(36);
            readableByteChannel0.read(byteBuffer3);
            byteBuffer3.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(byteBuffer3);
            this.bytesPerPacket = IsoTypeReader.readUInt32(byteBuffer3);
            this.bytesPerFrame = IsoTypeReader.readUInt32(byteBuffer3);
            this.bytesPerSample = IsoTypeReader.readUInt32(byteBuffer3);
            byte[] arr_b = new byte[20];
            this.soundVersion2Data = arr_b;
            byteBuffer3.get(arr_b);
        }
        if("owma".equals(this.type)) {
            AudioSampleEntry.LOG.a("owma");
            int v3 = this.soundVersion;
            if(v3 != 1) {
                v1 = 0;
            }
            if(v3 != 2) {
                v2 = 0;
            }
            long v4 = v - 28L - ((long)v1) - ((long)v2);
            ByteBuffer byteBuffer4 = ByteBuffer.allocate(CastUtils.l2i(v4));
            readableByteChannel0.read(byteBuffer4);
            this.addBox(new Box() {
                @Override  // org.mp4parser.Box
                public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
                    byteBuffer4.rewind();
                    writableByteChannel0.write(byteBuffer4);
                }

                @Override  // org.mp4parser.Box
                public long getSize() {
                    return v4;
                }

                @Override  // org.mp4parser.Box
                public String getType() {
                    return "----";
                }
            });
            return;
        }
        int v5 = this.soundVersion;
        if(v5 != 1) {
            v1 = 0;
        }
        if(v5 != 2) {
            v2 = 0;
        }
        this.initContainer(readableByteChannel0, v - 28L - ((long)v1) - ((long)v2), boxParser0);
    }

    public void setBytesPerFrame(long v) {
        this.bytesPerFrame = v;
    }

    public void setBytesPerPacket(long v) {
        this.bytesPerPacket = v;
    }

    public void setBytesPerSample(long v) {
        this.bytesPerSample = v;
    }

    public void setChannelCount(int v) {
        this.channelCount = v;
    }

    public void setCompressionId(int v) {
        this.compressionId = v;
    }

    public void setPacketSize(int v) {
        this.packetSize = v;
    }

    public void setReserved1(int v) {
        this.reserved1 = v;
    }

    public void setReserved2(long v) {
        this.reserved2 = v;
    }

    public void setSampleRate(long v) {
        this.sampleRate = v;
    }

    public void setSampleSize(int v) {
        this.sampleSize = v;
    }

    public void setSamplesPerPacket(long v) {
        this.samplesPerPacket = v;
    }

    public void setSoundVersion(int v) {
        this.soundVersion = v;
    }

    public void setSoundVersion2Data(byte[] arr_b) {
        this.soundVersion2Data = arr_b;
    }

    public void setType(String s) {
        this.type = s;
    }

    @Override  // org.mp4parser.BasicContainer
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + this.getBoxes() + '}';
    }
}

