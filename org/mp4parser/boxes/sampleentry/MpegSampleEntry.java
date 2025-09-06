package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class MpegSampleEntry extends AbstractSampleEntry {
    public MpegSampleEntry() {
        super("mp4s");
    }

    public MpegSampleEntry(String s) {
        super(s);
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 8L >= 0x100000000L ? v + 24L : v + 16L;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        this.initContainer(readableByteChannel0, v - 8L, boxParser0);
    }

    @Override  // org.mp4parser.BasicContainer
    public String toString() {
        return "MpegSampleEntry" + this.getBoxes();
    }
}

