package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BasicContainer;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.IsoTypeWriter;

public class AbstractContainerBox extends BasicContainer implements ParsableBox {
    protected boolean largeBox;
    Container parent;
    protected String type;

    public AbstractContainerBox(String s) {
        this.type = s;
    }

    @Override  // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        this.writeContainer(writableByteChannel0);
    }

    protected ByteBuffer getHeader() {
        ByteBuffer byteBuffer0;
        if(this.largeBox || this.getSize() >= 0x100000000L) {
            byte[] arr_b1 = new byte[16];
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
            byte[] arr_b = new byte[8];
            arr_b[4] = this.type.getBytes()[0];
            arr_b[5] = this.type.getBytes()[1];
            arr_b[6] = this.type.getBytes()[2];
            arr_b[7] = this.type.getBytes()[3];
            byteBuffer0 = ByteBuffer.wrap(arr_b);
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSize());
        }
        byteBuffer0.rewind();
        return byteBuffer0;
    }

    @Override  // org.mp4parser.Box
    public long getSize() {
        long v = this.getContainerSize();
        return this.largeBox || v + 8L >= 0x100000000L ? v + 16L : v + 8L;
    }

    @Override  // org.mp4parser.Box
    public String getType() {
        return this.type;
    }

    @Override  // org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        this.largeBox = byteBuffer0.remaining() == 16;
        this.initContainer(readableByteChannel0, v, boxParser0);
    }

    public void setParent(Container container0) {
        this.parent = container0;
    }
}

