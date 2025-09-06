package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import org.mp4parser.BoxParser;
import org.mp4parser.FullBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static a LOG;
    private int flags;
    private int version;

    static {
        FullContainerBox.LOG = b.i(FullContainerBox.class);
    }

    public FullContainerBox(String s) {
        super(s);
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        super.getBox(writableByteChannel0);
    }

    @Override  // org.mp4parser.BasicContainer
    public List getBoxes(Class class0) {
        return this.getBoxes(class0, false);
    }

    @Override  // org.mp4parser.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    protected ByteBuffer getHeader() {
        ByteBuffer byteBuffer0;
        if(this.largeBox || this.getSize() >= 0x100000000L) {
            byte[] arr_b1 = new byte[20];
            arr_b1[3] = 1;
            arr_b1[4] = this.type.getBytes()[0];
            arr_b1[5] = this.type.getBytes()[1];
            arr_b1[6] = this.type.getBytes()[2];
            arr_b1[7] = this.type.getBytes()[3];
            byteBuffer0 = ByteBuffer.wrap(arr_b1);
            byteBuffer0.position(8);
            IsoTypeWriter.writeUInt64(byteBuffer0, this.getSize());
        }
        else {
            byte[] arr_b = new byte[12];
            arr_b[4] = this.type.getBytes()[0];
            arr_b[5] = this.type.getBytes()[1];
            arr_b[6] = this.type.getBytes()[2];
            arr_b[7] = this.type.getBytes()[3];
            byteBuffer0 = ByteBuffer.wrap(arr_b);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSize());
            byteBuffer0.position(8);
        }
        this.writeVersionAndFlags(byteBuffer0);
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    @Override  // org.mp4parser.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
        readableByteChannel0.read(byteBuffer1);
        this.parseVersionAndFlags(((ByteBuffer)byteBuffer1.rewind()));
        super.parse(readableByteChannel0, byteBuffer0, v, boxParser0);
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer0) {
        this.version = IsoTypeReader.readUInt8(byteBuffer0);
        this.flags = IsoTypeReader.readUInt24(byteBuffer0);
        return 4L;
    }

    @Override  // org.mp4parser.FullBox
    public void setFlags(int v) {
        this.flags = v;
    }

    @Override  // org.mp4parser.FullBox
    public void setVersion(int v) {
        this.version = v;
    }

    @Override  // org.mp4parser.BasicContainer
    public String toString() {
        return this.getClass().getSimpleName() + "[childBoxes]";
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.flags);
    }
}

