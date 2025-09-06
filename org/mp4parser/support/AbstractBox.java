package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.IsoFile;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

public abstract class AbstractBox implements ParsableBox {
    static final boolean $assertionsDisabled;
    private static a LOG;
    protected ByteBuffer content;
    private ByteBuffer deadBytes;
    boolean isParsed;
    protected String type;
    private byte[] userType;

    static {
        AbstractBox.LOG = b.i(AbstractBox.class);
    }

    protected AbstractBox(String s) {
        this.deadBytes = null;
        this.type = s;
        this.isParsed = true;
    }

    protected AbstractBox(String s, byte[] arr_b) {
        this.deadBytes = null;
        this.type = s;
        this.userType = arr_b;
        this.isParsed = true;
    }

    protected abstract void _parseDetails(ByteBuffer arg1);

    @Override  // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        int v = 16;
        if(this.isParsed) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(CastUtils.l2i(this.getSize()));
            this.getHeader(byteBuffer0);
            this.getContent(byteBuffer0);
            ByteBuffer byteBuffer1 = this.deadBytes;
            if(byteBuffer1 != null) {
                byteBuffer1.rewind();
                while(this.deadBytes.remaining() > 0) {
                    byteBuffer0.put(this.deadBytes);
                }
            }
            writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
            return;
        }
        int v1 = this.isSmallBox() ? 8 : 16;
        if(!"uuid".equals(this.getType())) {
            v = 0;
        }
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(v1 + v);
        this.getHeader(byteBuffer2);
        writableByteChannel0.write(((ByteBuffer)byteBuffer2.rewind()));
        writableByteChannel0.write(((ByteBuffer)this.content.position(0)));
    }

    protected abstract void getContent(ByteBuffer arg1);

    protected abstract long getContentSize();

    private void getHeader(ByteBuffer byteBuffer0) {
        if(this.isSmallBox()) {
            IsoTypeWriter.writeUInt32(byteBuffer0, this.getSize());
            byteBuffer0.put(IsoFile.fourCCtoBytes(this.getType()));
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer0, 1L);
            byteBuffer0.put(IsoFile.fourCCtoBytes(this.getType()));
            IsoTypeWriter.writeUInt64(byteBuffer0, this.getSize());
        }
        if("uuid".equals(this.getType())) {
            byteBuffer0.put(this.getUserType());
        }
    }

    @Override  // org.mp4parser.Box
    public long getSize() {
        long v = this.isParsed ? this.getContentSize() : ((long)this.content.limit());
        int v1 = 0;
        int v2 = "uuid".equals(this.getType()) ? 16 : 0;
        ByteBuffer byteBuffer0 = this.deadBytes;
        if(byteBuffer0 != null) {
            v1 = byteBuffer0.limit();
        }
        return v + ((long)((v < 0xFFFFFFF8L ? 0 : 8) + 8 + v2)) + ((long)v1);
    }

    @Override  // org.mp4parser.Box
    @DoNotParseDetail
    public String getType() {
        return this.type;
    }

    @DoNotParseDetail
    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    // 去混淆评级： 低(20)
    private boolean isSmallBox() {
        int v = "uuid".equals(this.getType()) ? 24 : 8;
        return this.isParsed ? this.getContentSize() + ((long)(this.deadBytes == null ? 0 : this.deadBytes.limit())) + ((long)v) < 0x100000000L : ((long)(this.content.limit() + v)) < 0x100000000L;
    }

    @Override  // org.mp4parser.ParsableBox
    @DoNotParseDetail
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        this.content = ByteBuffer.allocate(CastUtils.l2i(v));
        while(((long)this.content.position()) < v) {
            if(readableByteChannel0.read(this.content) == -1) {
                AbstractBox.LOG.s("{} might have been truncated by file end. bytesRead={} contentSize={}", new Object[]{this, this.content.position(), v});
                break;
            }
            if(false) {
                break;
            }
        }
        this.content.position(0);
        this.isParsed = false;
    }

    public final void parseDetails() {
        synchronized(this) {
            AbstractBox.LOG.G("parsing details of {}", this.getType());
            ByteBuffer byteBuffer0 = this.content;
            if(byteBuffer0 != null) {
                this.isParsed = true;
                byteBuffer0.rewind();
                this._parseDetails(byteBuffer0);
                if(byteBuffer0.remaining() > 0) {
                    this.deadBytes = byteBuffer0.slice();
                }
                this.content = null;
            }
        }
    }

    private boolean verify(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(CastUtils.l2i(this.getContentSize() + ((long)(this.deadBytes == null ? 0 : this.deadBytes.limit()))));
        this.getContent(byteBuffer1);
        ByteBuffer byteBuffer2 = this.deadBytes;
        if(byteBuffer2 != null) {
            byteBuffer2.rewind();
            while(this.deadBytes.remaining() > 0) {
                byteBuffer1.put(this.deadBytes);
            }
        }
        byteBuffer0.rewind();
        byteBuffer1.rewind();
        if(byteBuffer0.remaining() != byteBuffer1.remaining()) {
            AbstractBox.LOG.s("{}: remaining differs {}  vs. {}", new Object[]{this.getType(), byteBuffer0.remaining(), byteBuffer1.remaining()});
            return false;
        }
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit() - 1;
        for(int v2 = byteBuffer1.limit() - 1; true; --v2) {
            if(v1 < v) {
                return true;
            }
            int v3 = byteBuffer0.get(v1);
            int v4 = byteBuffer1.get(v2);
            if(v3 != v4) {
                AbstractBox.LOG.s("{}: buffers differ at {}: {}/{}", new Object[]{this.getType(), v1, ((byte)v3), ((byte)v4)});
                byte[] arr_b = new byte[byteBuffer0.remaining()];
                byte[] arr_b1 = new byte[byteBuffer1.remaining()];
                byteBuffer0.get(arr_b);
                byteBuffer1.get(arr_b1);
                AbstractBox.LOG.I("original      : {}", Hex.encodeHex(arr_b, 4));
                AbstractBox.LOG.I("reconstructed : {}", Hex.encodeHex(arr_b1, 4));
                return false;
            }
            --v1;
        }
    }
}

