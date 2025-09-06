package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.RewindableReadableByteChannel;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private boolean quickTimeFormat;
    private int version;

    public MetaBox() {
        super("meta");
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        if(!this.quickTimeFormat) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            this.writeVersionAndFlags(byteBuffer0);
            writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        }
        this.writeContainer(writableByteChannel0);
    }

    public int getFlags() {
        return this.flags;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    public long getSize() {
        long v = this.getContainerSize() + ((long)(this.quickTimeFormat ? 0 : 4));
        return this.largeBox || v >= 0x100000000L ? v + 16L : v + 8L;
    }

    public int getVersion() {
        return this.version;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        RewindableReadableByteChannel rewindableReadableByteChannel0 = new RewindableReadableByteChannel(readableByteChannel0, 20);
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(20);
        int v1 = 4;
        if(rewindableReadableByteChannel0.read(byteBuffer1) == 20) {
            byteBuffer1.position(4);
            String s = IsoTypeReader.read4cc(byteBuffer1);
            byteBuffer1.position(16);
            if("hdlr".equals(s) && "mdta".equals(IsoTypeReader.read4cc(byteBuffer1))) {
                this.quickTimeFormat = true;
            }
        }
        rewindableReadableByteChannel0.rewind();
        if(!this.quickTimeFormat) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            rewindableReadableByteChannel0.read(byteBuffer2);
            this.parseVersionAndFlags(((ByteBuffer)byteBuffer2.rewind()));
        }
        if(this.quickTimeFormat) {
            v1 = 0;
        }
        this.initContainer(rewindableReadableByteChannel0, v - ((long)v1), boxParser0);
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer0) {
        this.version = IsoTypeReader.readUInt8(byteBuffer0);
        this.flags = IsoTypeReader.readUInt24(byteBuffer0);
        return 4L;
    }

    public void setFlags(int v) {
        this.flags = v;
    }

    public void setVersion(int v) {
        this.version = v;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.flags);
    }
}

