package org.mp4parser.boxes.iso14496.part12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.ParsableBox;
import org.mp4parser.support.DoNotParseDetail;
import org.slf4j.a;
import org.slf4j.b;

public final class MediaDataBox implements ParsableBox {
    private static a LOG = null;
    public static final String TYPE = "mdat";
    File dataFile;
    ByteBuffer header;

    static {
        MediaDataBox.LOG = b.i(MediaDataBox.class);
    }

    @Override  // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(((ByteBuffer)this.header.rewind()));
        FileChannel fileChannel0 = new FileInputStream(this.dataFile).getChannel();
        fileChannel0.transferTo(0L, this.dataFile.lastModified(), writableByteChannel0);
        fileChannel0.close();
    }

    @Override  // org.mp4parser.Box
    public long getSize() {
        return ((long)this.header.limit()) + this.dataFile.length();
    }

    @Override  // org.mp4parser.Box
    public String getType() {
        return "mdat";
    }

    @Override  // org.mp4parser.ParsableBox
    @DoNotParseDetail
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        File file0 = File.createTempFile("MediaDataBox", super.toString());
        this.dataFile = file0;
        file0.deleteOnExit();
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(byteBuffer0.limit());
        this.header = byteBuffer1;
        byteBuffer1.put(byteBuffer0);
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(this.dataFile, "rw")) {
            randomAccessFile0.getChannel().transferFrom(readableByteChannel0, 0L, v);
        }
    }
}

