package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.FullBox;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class DataReferenceBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "dref";
    private int flags;
    private int version;

    public DataReferenceBox() {
        super("dref");
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.flags);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.getBoxes().size()));
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    @Override  // org.mp4parser.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 16L >= 0x100000000L ? v + 24L : v + 16L;
    }

    @Override  // org.mp4parser.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        for(int v1 = byteBuffer1.limit(); v1 > 0; v1 -= readableByteChannel0.read(byteBuffer1)) {
        }
        byteBuffer1.rewind();
        this.version = IsoTypeReader.readUInt8(byteBuffer1);
        this.flags = IsoTypeReader.readUInt24(byteBuffer1);
        this.initContainer(readableByteChannel0, v - 8L, boxParser0);
    }

    @Override  // org.mp4parser.FullBox
    public void setFlags(int v) {
        this.flags = v;
    }

    @Override  // org.mp4parser.FullBox
    public void setVersion(int v) {
        this.version = v;
    }
}

