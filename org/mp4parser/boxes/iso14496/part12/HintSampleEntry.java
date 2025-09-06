package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class HintSampleEntry extends AbstractSampleEntry {
    protected byte[] data;

    public HintSampleEntry(String s) {
        super(s);
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        byteBuffer0.rewind();
        writableByteChannel0.write(byteBuffer0);
        writableByteChannel0.write(ByteBuffer.wrap(this.data));
    }

    public byte[] getData() {
        return this.data;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        int v = 8;
        long v1 = (long)(this.data.length + 8);
        if(this.largeBox || v1 + 8L >= 0x100000000L) {
            v = 16;
        }
        return v1 + ((long)v);
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        byte[] arr_b = new byte[CastUtils.l2i(v - 8L)];
        this.data = arr_b;
        readableByteChannel0.read(ByteBuffer.wrap(arr_b));
    }

    public void setData(byte[] arr_b) {
        this.data = arr_b;
    }
}

