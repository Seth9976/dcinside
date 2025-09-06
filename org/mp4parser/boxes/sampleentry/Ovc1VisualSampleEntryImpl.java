package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    public static final String TYPE = "ovc1";
    private byte[] vc1Content;

    public Ovc1VisualSampleEntryImpl() {
        super("ovc1");
        this.vc1Content = new byte[0];
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        writableByteChannel0.write(ByteBuffer.wrap(this.vc1Content));
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        return ((long)(this.largeBox || ((long)(this.vc1Content.length + 16)) >= 0x100000000L ? 16 : 8)) + ((long)this.vc1Content.length) + 8L;
    }

    public byte[] getVc1Content() {
        return this.vc1Content;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(CastUtils.l2i(v));
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        byte[] arr_b = new byte[byteBuffer1.remaining()];
        this.vc1Content = arr_b;
        byteBuffer1.get(arr_b);
    }

    public void setVc1Content(byte[] arr_b) {
        this.vc1Content = arr_b;
    }
}

