package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.BoxParser;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeWriter;

public class FreeBox implements ParsableBox {
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int v) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(v);
    }

    public void addAndReplace(ParsableBox parsableBox0) {
        this.data.position(CastUtils.l2i(parsableBox0.getSize()));
        this.data = this.data.slice();
        this.replacers.add(parsableBox0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            return this.getData() == null ? ((FreeBox)object0).getData() == null : this.getData().equals(((FreeBox)object0).getData());
        }
        return false;
    }

    @Override  // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        for(Object object0: this.replacers) {
            ((ParsableBox)object0).getBox(writableByteChannel0);
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)(this.data.limit() + 8)));
        byteBuffer0.put("free".getBytes());
        byteBuffer0.rewind();
        writableByteChannel0.write(byteBuffer0);
        byteBuffer0.rewind();
        this.data.rewind();
        writableByteChannel0.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        return this.data == null ? null : ((ByteBuffer)this.data.duplicate().rewind());
    }

    @Override  // org.mp4parser.Box
    public long getSize() {
        long v = 8L;
        for(Object object0: this.replacers) {
            v += ((ParsableBox)object0).getSize();
        }
        return v + ((long)this.data.limit());
    }

    @Override  // org.mp4parser.Box
    public String getType() {
        return "free";
    }

    @Override
    public int hashCode() {
        return this.data == null ? 0 : this.data.hashCode();
    }

    @Override  // org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        this.data = ByteBuffer.allocate(CastUtils.l2i(v));
        int v1 = 0;
        do {
            v1 += readableByteChannel0.read(this.data);
        }
        while(((long)v1) < v);
    }

    public void setData(ByteBuffer byteBuffer0) {
        this.data = byteBuffer0;
    }
}

