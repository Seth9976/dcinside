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

public class ItemProtectionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox() {
        super("ipro");
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(6);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.flags);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.getBoxes().size());
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    @Override  // org.mp4parser.FullBox
    public int getFlags() {
        return this.flags;
    }

    public SchemeInformationBox getItemProtectionScheme() {
        return this.getBoxes(SchemeInformationBox.class).isEmpty() ? null : ((SchemeInformationBox)this.getBoxes(SchemeInformationBox.class).get(0));
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 6L >= 0x100000000L ? v + 22L : v + 14L;
    }

    @Override  // org.mp4parser.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(6);
        readableByteChannel0.read(byteBuffer1);
        byteBuffer1.rewind();
        this.version = IsoTypeReader.readUInt8(byteBuffer1);
        this.flags = IsoTypeReader.readUInt24(byteBuffer1);
        this.initContainer(readableByteChannel0, v - 6L, boxParser0);
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

