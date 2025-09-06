package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okio.o0;
import okio.o;
import okio.q0;
import y4.l;
import y4.m;
import z3.f;

public final class Relay {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Relay edit(@l File file0, @l o0 o00, @l o o0, long v) throws IOException {
            L.p(file0, "file");
            L.p(o00, "upstream");
            L.p(o0, "metadata");
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            Relay relay0 = new Relay(randomAccessFile0, o00, 0L, o0, v, null);
            randomAccessFile0.setLength(0L);
            relay0.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay0;
        }

        @l
        public final Relay read(@l File file0) throws IOException {
            L.p(file0, "file");
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            L.o(fileChannel0, "randomAccessFile.channel");
            FileOperator fileOperator0 = new FileOperator(fileChannel0);
            okio.l l0 = new okio.l();
            fileOperator0.read(0L, l0, 0x20L);
            if(!L.g(l0.F0(((long)Relay.PREFIX_CLEAN.h0())), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long v = l0.readLong();
            long v1 = l0.readLong();
            okio.l l1 = new okio.l();
            fileOperator0.read(v + 0x20L, l1, v1);
            return new Relay(randomAccessFile0, null, v, l1.B1(), 0L, null);
        }
    }

    @s0({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class RelaySource implements o0 {
        @m
        private FileOperator fileOperator;
        private long sourcePos;
        @l
        private final q0 timeout;

        public RelaySource() {
            this.timeout = new q0();
            RandomAccessFile randomAccessFile0 = relay0.getFile();
            L.m(randomAccessFile0);
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            L.o(fileChannel0, "file!!.channel");
            this.fileOperator = new FileOperator(fileChannel0);
        }

        @Override  // okio.o0
        public void close() throws IOException {
            if(this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile0 = null;
            this.fileOperator = null;
            Relay relay0 = Relay.this;
            synchronized(relay0) {
                relay0.setSourceCount(relay0.getSourceCount() - 1);
                if(relay0.getSourceCount() == 0) {
                    relay0.setFile(null);
                    randomAccessFile0 = relay0.getFile();
                }
            }
            if(randomAccessFile0 != null) {
                Util.closeQuietly(randomAccessFile0);
            }
        }

        @Override  // okio.o0
        public long read(@l okio.l l0, long v) throws IOException {
            int v3;
            long v2;
            L.p(l0, "sink");
            if(this.fileOperator != null) {
                Relay relay0 = Relay.this;
                __monitor_enter(relay0);
                while(true) {
                    try {
                    label_4:
                        if(this.sourcePos != relay0.getUpstreamPos()) {
                            long v1 = relay0.getUpstreamPos() - relay0.getBuffer().size();
                            if(this.sourcePos >= v1) {
                                v2 = Math.min(v, relay0.getUpstreamPos() - this.sourcePos);
                                relay0.getBuffer().q(l0, this.sourcePos - v1, v2);
                                this.sourcePos += v2;
                                goto label_10;
                            }
                            v3 = 2;
                            break;
                        }
                        goto label_14;
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(relay0);
                        throw throwable0;
                    }
                label_10:
                    __monitor_exit(relay0);
                    return v2;
                    try {
                        v3 = 2;
                        break;
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(relay0);
                        throw throwable0;
                    }
                label_14:
                    if(relay0.getComplete()) {
                        __monitor_exit(relay0);
                        return -1L;
                    }
                    try {
                        if(relay0.getUpstreamReader() != null) {
                            this.timeout.waitUntilNotified(relay0);
                            goto label_4;
                        }
                        relay0.setUpstreamReader(Thread.currentThread());
                        v3 = 1;
                        break;
                    }
                    catch(Throwable throwable0) {
                    }
                    __monitor_exit(relay0);
                    throw throwable0;
                }
                __monitor_exit(relay0);
                if(v3 == 2) {
                    long v4 = Math.min(v, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator0 = this.fileOperator;
                    L.m(fileOperator0);
                    fileOperator0.read(this.sourcePos + 0x20L, l0, v4);
                    this.sourcePos += v4;
                    return v4;
                }
                try {
                    o0 o00 = Relay.this.getUpstream();
                    L.m(o00);
                    long v6 = o00.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if(v6 == -1L) {
                        Relay.this.commit(Relay.this.getUpstreamPos());
                        return -1L;
                    }
                    long v8 = Math.min(v6, v);
                    Relay.this.getUpstreamBuffer().q(l0, 0L, v8);
                    this.sourcePos += v8;
                    FileOperator fileOperator1 = this.fileOperator;
                    L.m(fileOperator1);
                    fileOperator1.write(Relay.this.getUpstreamPos() + 0x20L, Relay.this.getUpstreamBuffer().e(), v6);
                    Relay relay1 = Relay.this;
                    synchronized(relay1) {
                        relay1.getBuffer().write(relay1.getUpstreamBuffer(), v6);
                        if(relay1.getBuffer().size() > relay1.getBufferMaxSize()) {
                            relay1.getBuffer().skip(relay1.getBuffer().size() - relay1.getBufferMaxSize());
                        }
                        relay1.setUpstreamPos(relay1.getUpstreamPos() + v6);
                        return v8;
                    }
                }
                finally {
                    synchronized(Relay.this) {
                        Relay.this.setUpstreamReader(null);
                        L.n(Relay.this, "null cannot be cast to non-null type java.lang.Object");
                        Relay.this.notifyAll();
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override  // okio.o0
        @l
        public q0 timeout() {
            return this.timeout;
        }
    }

    @l
    public static final Companion Companion = null;
    private static final long FILE_HEADER_SIZE = 0x20L;
    @l
    @f
    public static final o PREFIX_CLEAN = null;
    @l
    @f
    public static final o PREFIX_DIRTY = null;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    @l
    private final okio.l buffer;
    private final long bufferMaxSize;
    private boolean complete;
    @m
    private RandomAccessFile file;
    @l
    private final o metadata;
    private int sourceCount;
    @m
    private o0 upstream;
    @l
    private final okio.l upstreamBuffer;
    private long upstreamPos;
    @m
    private Thread upstreamReader;

    static {
        Relay.Companion = new Companion(null);
        Relay.PREFIX_CLEAN = o.d.l("OkHttp cache v1\n");
        Relay.PREFIX_DIRTY = o.d.l("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile0, o0 o00, long v, o o0, long v1) {
        this.file = randomAccessFile0;
        this.upstream = o00;
        this.upstreamPos = v;
        this.metadata = o0;
        this.bufferMaxSize = v1;
        this.upstreamBuffer = new okio.l();
        this.complete = this.upstream == null;
        this.buffer = new okio.l();
    }

    public Relay(RandomAccessFile randomAccessFile0, o0 o00, long v, o o0, long v1, w w0) {
        this(randomAccessFile0, o00, v, o0, v1);
    }

    public final void commit(long v) throws IOException {
        this.writeMetadata(v);
        RandomAccessFile randomAccessFile0 = this.file;
        L.m(randomAccessFile0);
        randomAccessFile0.getChannel().force(false);
        long v1 = (long)this.metadata.h0();
        this.writeHeader(Relay.PREFIX_CLEAN, v, v1);
        RandomAccessFile randomAccessFile1 = this.file;
        L.m(randomAccessFile1);
        randomAccessFile1.getChannel().force(false);
        synchronized(this) {
            this.complete = true;
        }
        o0 o00 = this.upstream;
        if(o00 != null) {
            Util.closeQuietly(o00);
        }
        this.upstream = null;
    }

    @l
    public final okio.l getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @m
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @m
    public final o0 getUpstream() {
        return this.upstream;
    }

    @l
    public final okio.l getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @m
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    @l
    public final o metadata() {
        return this.metadata;
    }

    @m
    public final o0 newSource() {
        synchronized(this) {
            if(this.file == null) {
                return null;
            }
            ++this.sourceCount;
        }
        return new RelaySource(this);
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(@m RandomAccessFile randomAccessFile0) {
        this.file = randomAccessFile0;
    }

    public final void setSourceCount(int v) {
        this.sourceCount = v;
    }

    public final void setUpstream(@m o0 o00) {
        this.upstream = o00;
    }

    public final void setUpstreamPos(long v) {
        this.upstreamPos = v;
    }

    public final void setUpstreamReader(@m Thread thread0) {
        this.upstreamReader = thread0;
    }

    private final void writeHeader(o o0, long v, long v1) throws IOException {
        okio.l l0 = new okio.l();
        l0.t1(o0);
        l0.p2(v);
        l0.p2(v1);
        if(l0.size() != 0x20L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile0 = this.file;
        L.m(randomAccessFile0);
        FileChannel fileChannel0 = randomAccessFile0.getChannel();
        L.o(fileChannel0, "file!!.channel");
        new FileOperator(fileChannel0).write(0L, l0, 0x20L);
    }

    private final void writeMetadata(long v) throws IOException {
        okio.l l0 = new okio.l();
        l0.t1(this.metadata);
        RandomAccessFile randomAccessFile0 = this.file;
        L.m(randomAccessFile0);
        FileChannel fileChannel0 = randomAccessFile0.getChannel();
        L.o(fileChannel0, "file!!.channel");
        new FileOperator(fileChannel0).write(v + 0x20L, l0, ((long)this.metadata.h0()));
    }
}

