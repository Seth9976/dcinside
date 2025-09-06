package okhttp3.internal.http2;

import A3.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okio.Z;
import okio.m;
import okio.n;
import okio.o;
import y4.l;
import z3.f;
import z3.j;

@s0({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class Http2Connection implements Closeable {
    public static final class Builder {
        private boolean client;
        public String connectionName;
        @l
        private Listener listener;
        private int pingIntervalMillis;
        @l
        private PushObserver pushObserver;
        public m sink;
        public Socket socket;
        public n source;
        @l
        private final TaskRunner taskRunner;

        public Builder(boolean z, @l TaskRunner taskRunner0) {
            L.p(taskRunner0, "taskRunner");
            super();
            this.client = z;
            this.taskRunner = taskRunner0;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        @l
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        @l
        public final String getConnectionName$okhttp() {
            String s = this.connectionName;
            if(s != null) {
                return s;
            }
            L.S("connectionName");
            return null;
        }

        @l
        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        @l
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        @l
        public final m getSink$okhttp() {
            m m0 = this.sink;
            if(m0 != null) {
                return m0;
            }
            L.S("sink");
            return null;
        }

        @l
        public final Socket getSocket$okhttp() {
            Socket socket0 = this.socket;
            if(socket0 != null) {
                return socket0;
            }
            L.S("socket");
            return null;
        }

        @l
        public final n getSource$okhttp() {
            n n0 = this.source;
            if(n0 != null) {
                return n0;
            }
            L.S("source");
            return null;
        }

        @l
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        @l
        public final Builder listener(@l Listener http2Connection$Listener0) {
            L.p(http2Connection$Listener0, "listener");
            this.listener = http2Connection$Listener0;
            return this;
        }

        @l
        public final Builder pingIntervalMillis(int v) {
            this.pingIntervalMillis = v;
            return this;
        }

        @l
        public final Builder pushObserver(@l PushObserver pushObserver0) {
            L.p(pushObserver0, "pushObserver");
            this.pushObserver = pushObserver0;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(@l String s) {
            L.p(s, "<set-?>");
            this.connectionName = s;
        }

        public final void setListener$okhttp(@l Listener http2Connection$Listener0) {
            L.p(http2Connection$Listener0, "<set-?>");
            this.listener = http2Connection$Listener0;
        }

        public final void setPingIntervalMillis$okhttp(int v) {
            this.pingIntervalMillis = v;
        }

        public final void setPushObserver$okhttp(@l PushObserver pushObserver0) {
            L.p(pushObserver0, "<set-?>");
            this.pushObserver = pushObserver0;
        }

        public final void setSink$okhttp(@l m m0) {
            L.p(m0, "<set-?>");
            this.sink = m0;
        }

        public final void setSocket$okhttp(@l Socket socket0) {
            L.p(socket0, "<set-?>");
            this.socket = socket0;
        }

        public final void setSource$okhttp(@l n n0) {
            L.p(n0, "<set-?>");
            this.source = n0;
        }

        @l
        @j
        public final Builder socket(@l Socket socket0) throws IOException {
            L.p(socket0, "socket");
            return Builder.socket$default(this, socket0, null, null, null, 14, null);
        }

        @l
        @j
        public final Builder socket(@l Socket socket0, @l String s) throws IOException {
            L.p(socket0, "socket");
            L.p(s, "peerName");
            return Builder.socket$default(this, socket0, s, null, null, 12, null);
        }

        @l
        @j
        public final Builder socket(@l Socket socket0, @l String s, @l n n0) throws IOException {
            L.p(socket0, "socket");
            L.p(s, "peerName");
            L.p(n0, "source");
            return Builder.socket$default(this, socket0, s, n0, null, 8, null);
        }

        @l
        @j
        public final Builder socket(@l Socket socket0, @l String s, @l n n0, @l m m0) throws IOException {
            L.p(socket0, "socket");
            L.p(s, "peerName");
            L.p(n0, "source");
            L.p(m0, "sink");
            this.setSocket$okhttp(socket0);
            this.setConnectionName$okhttp((this.client ? Util.okHttpName + ' ' + s : "MockWebServer " + s));
            this.setSource$okhttp(n0);
            this.setSink$okhttp(m0);
            return this;
        }

        public static Builder socket$default(Builder http2Connection$Builder0, Socket socket0, String s, n n0, m m0, int v, Object object0) throws IOException {
            if((v & 2) != 0) {
                s = Util.peerName(socket0);
            }
            if((v & 4) != 0) {
                n0 = Z.e(Z.v(socket0));
            }
            if((v & 8) != 0) {
                m0 = Z.d(Z.q(socket0));
            }
            return http2Connection$Builder0.socket(socket0, s, n0, m0);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    public static abstract class Listener {
        public static final class okhttp3.internal.http2.Http2Connection.Listener.Companion {
            private okhttp3.internal.http2.Http2Connection.Listener.Companion() {
            }

            public okhttp3.internal.http2.Http2Connection.Listener.Companion(w w0) {
            }
        }

        @l
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion;
        @l
        @f
        public static final Listener REFUSE_INCOMING_STREAMS;

        static {
            Listener.Companion = new okhttp3.internal.http2.Http2Connection.Listener.Companion(null);
            Listener.REFUSE_INCOMING_STREAMS = new Http2Connection.Listener.Companion.REFUSE_INCOMING_STREAMS.1();
        }

        public void onSettings(@l Http2Connection http2Connection0, @l Settings settings0) {
            L.p(http2Connection0, "connection");
            L.p(settings0, "settings");
        }

        public abstract void onStream(@l Http2Stream arg1) throws IOException;
    }

    @s0({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class ReaderRunnable implements a, Handler {
        @l
        private final Http2Reader reader;

        public ReaderRunnable(@l Http2Reader http2Reader0) {
            L.p(http2Reader0, "reader");
            Http2Connection.this = http2Connection0;
            super();
            this.reader = http2Reader0;
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void ackSettings() {
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void alternateService(int v, @l String s, @l o o0, @l String s1, int v1, long v2) {
            L.p(s, "origin");
            L.p(o0, "protocol");
            L.p(s1, "host");
        }

        public final void applyAndAckSettings(boolean z, @l Settings settings0) {
            Http2Stream[] arr_http2Stream;
            long v2;
            L.p(settings0, "settings");
            h l0$h0 = new h();
            Http2Writer http2Writer0 = Http2Connection.this.getWriter();
            Http2Connection http2Connection0 = Http2Connection.this;
            synchronized(http2Writer0) {
                synchronized(http2Connection0) {
                    Settings settings1 = http2Connection0.getPeerSettings();
                    if(!z) {
                        Settings settings2 = new Settings();
                        settings2.merge(settings1);
                        settings2.merge(settings0);
                        settings0 = settings2;
                    }
                    l0$h0.a = settings0;
                    v2 = ((long)settings0.getInitialWindowSize()) - ((long)settings1.getInitialWindowSize());
                    arr_http2Stream = v2 == 0L || http2Connection0.getStreams$okhttp().isEmpty() ? null : ((Http2Stream[])http2Connection0.getStreams$okhttp().values().toArray(new Http2Stream[0]));
                    http2Connection0.setPeerSettings(((Settings)l0$h0.a));
                    http2Connection0.settingsListenerQueue.schedule(new Task(true, http2Connection0) {
                        @Override  // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            l0$h0.getListener$okhttp().onSettings(l0$h0, ((Settings)this.$newPeerSettings$inlined.a));
                            return -1L;
                        }
                    }, 0L);
                }
                try {
                    http2Connection0.getWriter().applyAndAckSettings(((Settings)l0$h0.a));
                }
                catch(IOException iOException0) {
                    http2Connection0.failConnection(iOException0);
                }
            }
            if(arr_http2Stream != null) {
                for(int v3 = 0; v3 < arr_http2Stream.length; ++v3) {
                    Http2Stream http2Stream0 = arr_http2Stream[v3];
                    synchronized(http2Stream0) {
                        http2Stream0.addBytesToWriteWindow(v2);
                    }
                }
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void data(boolean z, int v, @l n n0, int v1) throws IOException {
            L.p(n0, "source");
            if(Http2Connection.this.pushedStream$okhttp(v)) {
                Http2Connection.this.pushDataLater$okhttp(v, n0, v1, z);
                return;
            }
            Http2Stream http2Stream0 = Http2Connection.this.getStream(v);
            if(http2Stream0 == null) {
                Http2Connection.this.writeSynResetLater$okhttp(v, ErrorCode.PROTOCOL_ERROR);
                Http2Connection.this.updateConnectionFlowControl$okhttp(((long)v1));
                n0.skip(((long)v1));
                return;
            }
            http2Stream0.receiveData(n0, v1);
            if(z) {
                http2Stream0.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @l
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void goAway(int v, @l ErrorCode errorCode0, @l o o0) {
            Object[] arr_object;
            L.p(errorCode0, "errorCode");
            L.p(o0, "debugData");
            o0.h0();
            synchronized(Http2Connection.this) {
                arr_object = Http2Connection.this.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                Http2Connection.this.isShutdown = true;
            }
            for(int v2 = 0; v2 < ((Http2Stream[])arr_object).length; ++v2) {
                Http2Stream http2Stream0 = ((Http2Stream[])arr_object)[v2];
                if(http2Stream0.getId() > v && http2Stream0.isLocallyInitiated()) {
                    http2Stream0.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream$okhttp(http2Stream0.getId());
                }
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void headers(boolean z, int v, int v1, @l List list0) {
            Http2Stream http2Stream0;
            L.p(list0, "headerBlock");
            if(Http2Connection.this.pushedStream$okhttp(v)) {
                Http2Connection.this.pushHeadersLater$okhttp(v, list0, z);
                return;
            }
            Http2Connection http2Connection0 = Http2Connection.this;
            synchronized(http2Connection0) {
                http2Stream0 = http2Connection0.getStream(v);
                if(http2Stream0 == null) {
                    if(http2Connection0.isShutdown) {
                        return;
                    }
                    if(v <= http2Connection0.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if(v % 2 == http2Connection0.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    Http2Stream http2Stream1 = new Http2Stream(v, http2Connection0, false, z, Util.toHeaders(list0));
                    http2Connection0.setLastGoodStreamId$okhttp(v);
                    http2Connection0.getStreams$okhttp().put(v, http2Stream1);
                    http2Connection0.taskRunner.newQueue().schedule(new Task(true, http2Connection0) {
                        @Override  // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                http2Stream1.getListener$okhttp().onStream(this.$newStream$inlined);
                            }
                            catch(IOException iOException0) {
                                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Stream1.getConnectionName$okhttp(), 4, iOException0);
                                try {
                                    this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, iOException0);
                                }
                                catch(IOException unused_ex) {
                                }
                            }
                            return -1L;
                        }
                    }, 0L);
                    return;
                }
            }
            http2Stream0.receiveHeaders(Util.toHeaders(list0), z);
        }

        @Override  // A3.a
        public Object invoke() {
            this.invoke();
            return S0.a;
        }

        public void invoke() {
            ErrorCode errorCode0;
            try {
                errorCode0 = ErrorCode.INTERNAL_ERROR;
                this.reader.readConnectionPreface(this);
                while(this.reader.nextFrame(false, this)) {
                }
            }
            catch(IOException iOException0) {
                Http2Connection.this.close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException0);
                Util.closeQuietly(this.reader);
                return;
            }
            catch(Throwable throwable0) {
                Http2Connection.this.close$okhttp(errorCode0, errorCode0, null);
                Util.closeQuietly(this.reader);
                throw throwable0;
            }
            Http2Connection.this.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
            Util.closeQuietly(this.reader);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void ping(boolean z, int v, int v1) {
            if(z) {
                Http2Connection http2Connection0 = Http2Connection.this;
                synchronized(http2Connection0) {
                    switch(v) {
                        case 1: {
                            ++http2Connection0.intervalPongsReceived;
                            break;
                        }
                        case 2: {
                            ++http2Connection0.degradedPongsReceived;
                            break;
                        }
                        case 3: {
                            ++http2Connection0.awaitPongsReceived;
                            L.n(http2Connection0, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection0.notifyAll();
                        }
                    }
                }
                return;
            }
            Http2Connection.this.writerQueue.schedule(new Task(true, Http2Connection.this) {
                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    v.writePing(true, v1, this.$payload2$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void priority(int v, int v1, int v2, boolean z) {
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void pushPromise(int v, int v1, @l List list0) {
            L.p(list0, "requestHeaders");
            Http2Connection.this.pushRequestLater$okhttp(v1, list0);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void rstStream(int v, @l ErrorCode errorCode0) {
            L.p(errorCode0, "errorCode");
            if(Http2Connection.this.pushedStream$okhttp(v)) {
                Http2Connection.this.pushResetLater$okhttp(v, errorCode0);
                return;
            }
            Http2Stream http2Stream0 = Http2Connection.this.removeStream$okhttp(v);
            if(http2Stream0 != null) {
                http2Stream0.receiveRstStream(errorCode0);
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void settings(boolean z, @l Settings settings0) {
            L.p(settings0, "settings");
            okhttp3.internal.http2.Http2Connection.ReaderRunnable.settings..inlined.execute.default.1 http2Connection$ReaderRunnable$settings$$inlined$execute$default$10 = new Task(true, this) {
                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    z.applyAndAckSettings(settings0, this.$settings$inlined);
                    return -1L;
                }
            };
            Http2Connection.this.writerQueue.schedule(http2Connection$ReaderRunnable$settings$$inlined$execute$default$10, 0L);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void windowUpdate(int v, long v1) {
            if(v == 0) {
                synchronized(Http2Connection.this) {
                    Http2Connection.this.writeBytesMaximum = Http2Connection.this.getWriteBytesMaximum() + v1;
                    L.n(Http2Connection.this, "null cannot be cast to non-null type java.lang.Object");
                    Http2Connection.this.notifyAll();
                }
                return;
            }
            Http2Stream http2Stream0 = Http2Connection.this.getStream(v);
            if(http2Stream0 != null) {
                synchronized(http2Stream0) {
                    http2Stream0.addBytesToWriteWindow(v1);
                }
            }
        }
    }

    public static final int AWAIT_PING = 3;
    @l
    public static final Companion Companion = null;
    @l
    private static final Settings DEFAULT_SETTINGS = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 0x1000000;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    @l
    private final String connectionName;
    @l
    private final Set currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    @l
    private final Listener listener;
    private int nextStreamId;
    @l
    private final Settings okHttpSettings;
    @l
    private Settings peerSettings;
    @l
    private final PushObserver pushObserver;
    @l
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @l
    private final ReaderRunnable readerRunnable;
    @l
    private final TaskQueue settingsListenerQueue;
    @l
    private final Socket socket;
    @l
    private final Map streams;
    @l
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @l
    private final Http2Writer writer;
    @l
    private final TaskQueue writerQueue;

    static {
        Http2Connection.Companion = new Companion(null);
        Settings settings0 = new Settings();
        settings0.set(7, 0xFFFF);
        settings0.set(5, 0x4000);
        Http2Connection.DEFAULT_SETTINGS = settings0;
    }

    public Http2Connection(@l Builder http2Connection$Builder0) {
        L.p(http2Connection$Builder0, "builder");
        super();
        boolean z = http2Connection$Builder0.getClient$okhttp();
        this.client = z;
        this.listener = http2Connection$Builder0.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String s = http2Connection$Builder0.getConnectionName$okhttp();
        this.connectionName = s;
        this.nextStreamId = http2Connection$Builder0.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner0 = http2Connection$Builder0.getTaskRunner$okhttp();
        this.taskRunner = taskRunner0;
        TaskQueue taskQueue0 = taskRunner0.newQueue();
        this.writerQueue = taskQueue0;
        this.pushQueue = taskRunner0.newQueue();
        this.settingsListenerQueue = taskRunner0.newQueue();
        this.pushObserver = http2Connection$Builder0.getPushObserver$okhttp();
        Settings settings0 = new Settings();
        if(http2Connection$Builder0.getClient$okhttp()) {
            settings0.set(7, 0x1000000);
        }
        this.okHttpSettings = settings0;
        this.peerSettings = Http2Connection.DEFAULT_SETTINGS;
        this.writeBytesMaximum = (long)Http2Connection.DEFAULT_SETTINGS.getInitialWindowSize();
        this.socket = http2Connection$Builder0.getSocket$okhttp();
        this.writer = new Http2Writer(http2Connection$Builder0.getSink$okhttp(), z);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(http2Connection$Builder0.getSource$okhttp(), z));
        this.currentPushRequests = new LinkedHashSet();
        if(http2Connection$Builder0.getPingIntervalMillis$okhttp() != 0) {
            long v = TimeUnit.MILLISECONDS.toNanos(((long)http2Connection$Builder0.getPingIntervalMillis$okhttp()));
            taskQueue0.schedule(new Task(this, v) {
                final long $pingIntervalNanos$inlined;

                {
                    Http2Connection.this = http2Connection0;
                    this.$pingIntervalNanos$inlined = v;
                    super(s, false, 2, null);
                }

                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z;
                    synchronized(Http2Connection.this) {
                        if(Http2Connection.this.intervalPongsReceived < Http2Connection.this.intervalPingsSent) {
                            z = true;
                        }
                        else {
                            ++Http2Connection.this.intervalPingsSent;
                            z = false;
                        }
                    }
                    if(z) {
                        Http2Connection.this.failConnection(null);
                        return -1L;
                    }
                    Http2Connection.this.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, v);
        }
    }

    public final void awaitPong() throws InterruptedException {
        synchronized(this) {
            while(this.awaitPongsReceived < this.awaitPingsSent) {
                L.n(this, "null cannot be cast to non-null type java.lang.Object");
                this.wait();
            }
        }
    }

    @Override
    public void close() {
        this.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@l ErrorCode errorCode0, @l ErrorCode errorCode1, @y4.m IOException iOException0) {
        Object[] arr_object;
        L.p(errorCode0, "connectionCode");
        L.p(errorCode1, "streamCode");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12520 MUST NOT hold lock on " + this);
        }
        try {
            this.shutdown(errorCode0);
        }
        catch(IOException unused_ex) {
        }
        synchronized(this) {
            if(this.streams.isEmpty()) {
                arr_object = null;
            }
            else {
                arr_object = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            }
        }
        if(((Http2Stream[])arr_object) != null) {
            for(int v = 0; v < ((Http2Stream[])arr_object).length; ++v) {
                Http2Stream http2Stream0 = ((Http2Stream[])arr_object)[v];
                try {
                    http2Stream0.close(errorCode1, iOException0);
                }
                catch(IOException unused_ex) {
                }
            }
        }
        try {
            this.writer.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            this.socket.close();
        }
        catch(IOException unused_ex) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    private final void failConnection(IOException iOException0) {
        this.close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException0);
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    @l
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    @l
    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    @l
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @l
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @l
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @l
    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    @y4.m
    public final Http2Stream getStream(int v) {
        synchronized(this) {
            return (Http2Stream)this.streams.get(v);
        }
    }

    @l
    public final Map getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @l
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final boolean isHealthy(long v) {
        synchronized(this) {
            if(this.isShutdown) {
                return false;
            }
            if(this.degradedPongsReceived < this.degradedPingsSent && v >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    private final Http2Stream newStream(int v, List list0, boolean z) throws IOException {
        Http2Writer http2Writer0 = this.writer;
        __monitor_enter(http2Writer0);
        int v1 = FIN.finallyOpen$NT();
        synchronized(this) {
            if(this.nextStreamId > 0x3FFFFFFF) {
                this.shutdown(ErrorCode.REFUSED_STREAM);
            }
            if(!this.isShutdown) {
                int v3 = this.nextStreamId;
                this.nextStreamId = v3 + 2;
                Http2Stream http2Stream0 = new Http2Stream(v3, this, !z, false, null);
                boolean z1 = !z || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream0.getWriteBytesTotal() >= http2Stream0.getWriteBytesMaximum();
                if(http2Stream0.isOpen()) {
                    this.streams.put(v3, http2Stream0);
                }
                boolean z2 = false;
                if(v == 0) {
                    z2 = true;
                    this.writer.headers(!z, v3, list0);
                }
                else if(!this.client) {
                    z2 = true;
                    this.writer.pushPromise(v, v3, list0);
                }
                if(z2) {
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(http2Writer0);
                    FIN.finallyCodeEnd$NT(v1);
                    if(z1) {
                        this.writer.flush();
                    }
                    return http2Stream0;
                }
                FIN.finallyExec$NT(v1);
                throw new IllegalArgumentException("client streams shouldn\'t have associated stream IDs");
            }
        }
        throw new ConnectionShutdownException();
    }

    @l
    public final Http2Stream newStream(@l List list0, boolean z) throws IOException {
        L.p(list0, "requestHeaders");
        return this.newStream(0, list0, z);
    }

    public final int openStreamCount() {
        synchronized(this) {
        }
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int v, @l n n0, int v1, boolean z) throws IOException {
        L.p(n0, "source");
        okio.l l0 = new okio.l();
        n0.X2(((long)v1));
        n0.read(l0, ((long)v1));
        okhttp3.internal.http2.Http2Connection.pushDataLater..inlined.execute.default.1 http2Connection$pushDataLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean z = v.pushObserver.onData(l0, v1, z, this.$inFinished$inlined);
                    if(z) {
                        v.getWriter().rstStream(l0, ErrorCode.CANCEL);
                    }
                    if(z || this.$inFinished$inlined) {
                        synchronized(v) {
                            v.currentPushRequests.remove(l0);
                            return -1L;
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
                return -1L;
            }
        };
        this.pushQueue.schedule(http2Connection$pushDataLater$$inlined$execute$default$10, 0L);
    }

    public final void pushHeadersLater$okhttp(int v, @l List list0, boolean z) {
        L.p(list0, "requestHeaders");
        okhttp3.internal.http2.Http2Connection.pushHeadersLater..inlined.execute.default.1 http2Connection$pushHeadersLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z = v.pushObserver.onHeaders(list0, z, this.$inFinished$inlined);
                try {
                    if(z) {
                        v.getWriter().rstStream(list0, ErrorCode.CANCEL);
                    }
                    if(z || this.$inFinished$inlined) {
                        synchronized(v) {
                            v.currentPushRequests.remove(list0);
                            return -1L;
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
                return -1L;
            }
        };
        this.pushQueue.schedule(http2Connection$pushHeadersLater$$inlined$execute$default$10, 0L);
    }

    public final void pushRequestLater$okhttp(int v, @l List list0) {
        L.p(list0, "requestHeaders");
        synchronized(this) {
            if(this.currentPushRequests.contains(v)) {
                this.writeSynResetLater$okhttp(v, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(v);
        }
        okhttp3.internal.http2.Http2Connection.pushRequestLater..inlined.execute.default.1 http2Connection$pushRequestLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                if(v.pushObserver.onRequest(list0, this.$requestHeaders$inlined)) {
                    try {
                        v.getWriter().rstStream(list0, ErrorCode.CANCEL);
                        synchronized(v) {
                            v.currentPushRequests.remove(list0);
                            return -1L;
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                }
                return -1L;
            }
        };
        this.pushQueue.schedule(http2Connection$pushRequestLater$$inlined$execute$default$10, 0L);
    }

    public final void pushResetLater$okhttp(int v, @l ErrorCode errorCode0) {
        L.p(errorCode0, "errorCode");
        okhttp3.internal.http2.Http2Connection.pushResetLater..inlined.execute.default.1 http2Connection$pushResetLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                v.pushObserver.onReset(errorCode0, this.$errorCode$inlined);
                synchronized(v) {
                    v.currentPushRequests.remove(errorCode0);
                    return -1L;
                }
            }
        };
        this.pushQueue.schedule(http2Connection$pushResetLater$$inlined$execute$default$10, 0L);
    }

    @l
    public final Http2Stream pushStream(int v, @l List list0, boolean z) throws IOException {
        L.p(list0, "requestHeaders");
        if(this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return this.newStream(v, list0, z);
    }

    public final boolean pushedStream$okhttp(int v) {
        return v != 0 && (v & 1) == 0;
    }

    @y4.m
    public final Http2Stream removeStream$okhttp(int v) {
        synchronized(this) {
            Http2Stream http2Stream0 = (Http2Stream)this.streams.remove(v);
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return http2Stream0;
        }
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized(this) {
            long v = this.degradedPingsSent;
            if(this.degradedPongsReceived < v) {
                return;
            }
            this.degradedPingsSent = v + 1L;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000L;
        }
        okhttp3.internal.http2.Http2Connection.sendDegradedPingLater..inlined.execute.default.1 http2Connection$sendDegradedPingLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                Http2Connection.this.writePing(false, 2, 0);
                return -1L;
            }
        };
        this.writerQueue.schedule(http2Connection$sendDegradedPingLater$$inlined$execute$default$10, 0L);
    }

    public final void setLastGoodStreamId$okhttp(int v) {
        this.lastGoodStreamId = v;
    }

    public final void setNextStreamId$okhttp(int v) {
        this.nextStreamId = v;
    }

    public final void setPeerSettings(@l Settings settings0) {
        L.p(settings0, "<set-?>");
        this.peerSettings = settings0;
    }

    public final void setSettings(@l Settings settings0) throws IOException {
        L.p(settings0, "settings");
        synchronized(this.writer) {
            synchronized(this) {
                if(this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings0);
            }
            this.writer.settings(settings0);
        }
    }

    public final void shutdown(@l ErrorCode errorCode0) throws IOException {
        L.p(errorCode0, "statusCode");
        synchronized(this.writer) {
            kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
            synchronized(this) {
                if(this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                l0$f0.a = this.lastGoodStreamId;
            }
            this.writer.goAway(this.lastGoodStreamId, errorCode0, Util.EMPTY_BYTE_ARRAY);
        }
    }

    @j
    public final void start() throws IOException {
        Http2Connection.start$default(this, false, null, 3, null);
    }

    @j
    public final void start(boolean z) throws IOException {
        Http2Connection.start$default(this, z, null, 2, null);
    }

    @j
    public final void start(boolean z, @l TaskRunner taskRunner0) throws IOException {
        L.p(taskRunner0, "taskRunner");
        if(z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int v = this.okHttpSettings.getInitialWindowSize();
            if(v != 0xFFFF) {
                this.writer.windowUpdate(0, ((long)(v - 0xFFFF)));
            }
        }
        taskRunner0.newQueue().schedule(new okhttp3.internal.concurrent.TaskQueue.execute.1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public static void start$default(Http2Connection http2Connection0, boolean z, TaskRunner taskRunner0, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            taskRunner0 = TaskRunner.INSTANCE;
        }
        http2Connection0.start(z, taskRunner0);
    }

    public final void updateConnectionFlowControl$okhttp(long v) {
        synchronized(this) {
            long v2 = this.readBytesTotal + v;
            this.readBytesTotal = v2;
            long v3 = v2 - this.readBytesAcknowledged;
            if(v3 >= ((long)(this.okHttpSettings.getInitialWindowSize() / 2))) {
                this.writeWindowUpdateLater$okhttp(0, v3);
                this.readBytesAcknowledged += v3;
            }
        }
    }

    public final void writeData(int v, boolean z, @y4.m okio.l l0, long v1) throws IOException {
        long v4;
        long v3;
        if(v1 == 0L) {
            this.writer.data(z, v, l0, 0);
            return;
        }
        while(v1 > 0L) {
            synchronized(this) {
                try {
                    while(true) {
                        v3 = this.writeBytesTotal;
                        v4 = this.writeBytesMaximum;
                        if(v3 < v4) {
                            break;
                        }
                        if(!this.streams.containsKey(v)) {
                            throw new IOException("stream closed");
                        }
                        L.n(this, "null cannot be cast to non-null type java.lang.Object");
                        this.wait();
                    }
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            int v5 = Math.min(((int)Math.min(v1, v4 - v3)), this.writer.maxDataLength());
            this.writeBytesTotal += (long)v5;
            v1 -= (long)v5;
            this.writer.data(z && v1 == 0L, v, l0, v5);
        }
    }

    public final void writeHeaders$okhttp(int v, boolean z, @l List list0) throws IOException {
        L.p(list0, "alternating");
        this.writer.headers(z, v, list0);
    }

    public final void writePing() throws InterruptedException {
        synchronized(this) {
            ++this.awaitPingsSent;
        }
        this.writePing(false, 3, 0x4F4B6F6B);
    }

    public final void writePing(boolean z, int v, int v1) {
        try {
            this.writer.ping(z, v, v1);
        }
        catch(IOException iOException0) {
            this.failConnection(iOException0);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        this.writePing();
        this.awaitPong();
    }

    public final void writeSynReset$okhttp(int v, @l ErrorCode errorCode0) throws IOException {
        L.p(errorCode0, "statusCode");
        this.writer.rstStream(v, errorCode0);
    }

    public final void writeSynResetLater$okhttp(int v, @l ErrorCode errorCode0) {
        L.p(errorCode0, "errorCode");
        okhttp3.internal.http2.Http2Connection.writeSynResetLater..inlined.execute.default.1 http2Connection$writeSynResetLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    v.writeSynReset$okhttp(errorCode0, this.$errorCode$inlined);
                }
                catch(IOException iOException0) {
                    v.failConnection(iOException0);
                }
                return -1L;
            }
        };
        this.writerQueue.schedule(http2Connection$writeSynResetLater$$inlined$execute$default$10, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int v, long v1) {
        okhttp3.internal.http2.Http2Connection.writeWindowUpdateLater..inlined.execute.default.1 http2Connection$writeWindowUpdateLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    v.getWriter().windowUpdate(v1, this.$unacknowledgedBytesRead$inlined);
                }
                catch(IOException iOException0) {
                    v.failConnection(iOException0);
                }
                return -1L;
            }
        };
        this.writerQueue.schedule(http2Connection$writeWindowUpdateLater$$inlined$execute$default$10, 0L);
    }
}

