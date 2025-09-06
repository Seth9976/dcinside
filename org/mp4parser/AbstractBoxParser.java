package org.mp4parser;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.List;
import org.mp4parser.tools.IsoTypeReader;
import org.slf4j.a;
import org.slf4j.b;

public abstract class AbstractBoxParser implements BoxParser {
    private static a LOG;
    ThreadLocal header;
    private List skippedTypes;

    static {
        AbstractBoxParser.LOG = b.j("org.mp4parser.AbstractBoxParser");
    }

    public AbstractBoxParser() {
        this.header = new ThreadLocal() {
            @Override
            protected Object initialValue() {
                return this.initialValue();
            }

            protected ByteBuffer initialValue() {
                return ByteBuffer.allocate(0x20);
            }
        };
    }

    public abstract ParsableBox createBox(String arg1, byte[] arg2, String arg3);

    @Override  // org.mp4parser.BoxParser
    public ParsableBox parseBox(ReadableByteChannel readableByteChannel0, String s) throws IOException {
        ParsableBox parsableBox0;
        byte[] arr_b1;
        long v3;
        ((Buffer)this.header.get()).rewind().limit(8);
        int v = 0;
        do {
            int v1 = readableByteChannel0.read(((ByteBuffer)this.header.get()));
            v += v1;
            if(v >= 8) {
                ((Buffer)this.header.get()).rewind();
                long v2 = IsoTypeReader.readUInt32(((ByteBuffer)this.header.get()));
                if(v2 < 8L && v2 > 1L) {
                    AbstractBoxParser.LOG.I("Plausibility check failed: size < 8 (size = {}). Stop parsing!", v2);
                    return null;
                }
                String s1 = IsoTypeReader.read4cc(((ByteBuffer)this.header.get()));
                if(v2 == 1L) {
                    ByteBuffer byteBuffer0 = (ByteBuffer)((ByteBuffer)this.header.get()).limit(16);
                    readableByteChannel0.read(((ByteBuffer)this.header.get()));
                    ByteBuffer byteBuffer1 = (ByteBuffer)((ByteBuffer)this.header.get()).position(8);
                    v3 = IsoTypeReader.readUInt64(((ByteBuffer)this.header.get())) - 16L;
                }
                else if(v2 != 0L) {
                    v3 = v2 - 8L;
                }
                else {
                    throw new RuntimeException("box size of zero means \'till end of file. That is not yet supported");
                }
                if("uuid".equals(s1)) {
                    ByteBuffer byteBuffer2 = (ByteBuffer)((ByteBuffer)this.header.get()).limit(((ByteBuffer)this.header.get()).limit() + 16);
                    readableByteChannel0.read(((ByteBuffer)this.header.get()));
                    byte[] arr_b = new byte[16];
                    for(int v4 = ((ByteBuffer)this.header.get()).position() - 16; v4 < ((ByteBuffer)this.header.get()).position(); ++v4) {
                        int v5 = ((ByteBuffer)this.header.get()).position();
                        arr_b[v4 - (v5 - 16)] = ((ByteBuffer)this.header.get()).get(v4);
                    }
                    v3 -= 16L;
                    arr_b1 = arr_b;
                }
                else {
                    arr_b1 = null;
                }
                if(this.skippedTypes == null || !this.skippedTypes.contains(s1)) {
                    AbstractBoxParser.LOG.P("Creating box {} {} {}", new Object[]{s1, arr_b1, s});
                    parsableBox0 = this.createBox(s1, arr_b1, s);
                }
                else {
                    AbstractBoxParser.LOG.P("Skipping box {} {} {}", new Object[]{s1, arr_b1, s});
                    parsableBox0 = new SkipBox(s1, arr_b1, s);
                }
                ((Buffer)this.header.get()).rewind();
                parsableBox0.parse(readableByteChannel0, ((ByteBuffer)this.header.get()), v3, this);
                return parsableBox0;
            }
        }
        while(v1 >= 0);
        throw new EOFException();
    }

    public AbstractBoxParser skippingBoxes(String[] arr_s) {
        this.skippedTypes = Arrays.asList(arr_s);
        return this;
    }
}

