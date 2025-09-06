package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okio.n;
import okio.o.a;
import okio.o;
import y4.l;
import y4.m;

@s0({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class RealWebSocket implements WebSocket, FrameCallback {
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        @m
        private final o reason;

        public Close(int v, @m o o0, long v1) {
            this.code = v;
            this.reason = o0;
            this.cancelAfterCloseMillis = v1;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @m
        public final o getReason() {
            return this.reason;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class Message {
        @l
        private final o data;
        private final int formatOpcode;

        public Message(int v, @l o o0) {
            L.p(o0, "data");
            super();
            this.formatOpcode = v;
            this.data = o0;
        }

        @l
        public final o getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    public static abstract class Streams implements Closeable {
        private final boolean client;
        @l
        private final okio.m sink;
        @l
        private final n source;

        public Streams(boolean z, @l n n0, @l okio.m m0) {
            L.p(n0, "source");
            L.p(m0, "sink");
            super();
            this.client = z;
            this.source = n0;
            this.sink = m0;
        }

        public final boolean getClient() {
            return this.client;
        }

        @l
        public final okio.m getSink() {
            return this.sink;
        }

        @l
        public final n getSource() {
            return this.source;
        }
    }

    final class WriterTask extends Task {
        public WriterTask() {
            super(realWebSocket0.name + " writer", false, 2, null);
        }

        @Override  // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if(RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
            }
            catch(IOException iOException0) {
                RealWebSocket.this.failWebSocket(iOException0, null);
            }
            return -1L;
        }
    }

    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000L;
    @l
    public static final Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 0x400L;
    private static final long MAX_QUEUE_SIZE = 0x1000000L;
    @l
    private static final List ONLY_HTTP1;
    private boolean awaitingPong;
    @m
    private Call call;
    private boolean enqueuedClose;
    @m
    private WebSocketExtensions extensions;
    private boolean failed;
    @l
    private final String key;
    @l
    private final WebSocketListener listener;
    @l
    private final ArrayDeque messageAndCloseQueue;
    private long minimumDeflateSize;
    @m
    private String name;
    @l
    private final Request originalRequest;
    private final long pingIntervalMillis;
    @l
    private final ArrayDeque pongQueue;
    private long queueSize;
    @l
    private final Random random;
    @m
    private WebSocketReader reader;
    private int receivedCloseCode;
    @m
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    @m
    private Streams streams;
    @l
    private TaskQueue taskQueue;
    @m
    private WebSocketWriter writer;
    @m
    private Task writerTask;

    static {
        RealWebSocket.Companion = new Companion(null);
        RealWebSocket.ONLY_HTTP1 = u.k(Protocol.HTTP_1_1);
    }

    public RealWebSocket(@l TaskRunner taskRunner0, @l Request request0, @l WebSocketListener webSocketListener0, @l Random random0, long v, @m WebSocketExtensions webSocketExtensions0, long v1) {
        L.p(taskRunner0, "taskRunner");
        L.p(request0, "originalRequest");
        L.p(webSocketListener0, "listener");
        L.p(random0, "random");
        super();
        this.originalRequest = request0;
        this.listener = webSocketListener0;
        this.random = random0;
        this.pingIntervalMillis = v;
        this.extensions = webSocketExtensions0;
        this.minimumDeflateSize = v1;
        this.taskQueue = taskRunner0.newQueue();
        this.pongQueue = new ArrayDeque();
        this.messageAndCloseQueue = new ArrayDeque();
        this.receivedCloseCode = -1;
        if(!L.g("GET", request0.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + request0.method()).toString());
        }
        byte[] arr_b = new byte[16];
        random0.nextBytes(arr_b);
        this.key = a.p(o.d, arr_b, 0, 0, 3, null).d();
    }

    public final void awaitTermination(long v, @l TimeUnit timeUnit0) throws InterruptedException {
        L.p(timeUnit0, "timeUnit");
        this.taskQueue.idleLatch().await(v, timeUnit0);
    }

    @Override  // okhttp3.WebSocket
    public void cancel() {
        Call call0 = this.call;
        L.m(call0);
        call0.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@l Response response0, @m Exchange exchange0) throws IOException {
        L.p(response0, "response");
        if(response0.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was \'" + response0.code() + ' ' + response0.message() + '\'');
        }
        String s = Response.header$default(response0, "Connection", null, 2, null);
        if(!v.O1("Upgrade", s, true)) {
            throw new ProtocolException("Expected \'Connection\' header value \'Upgrade\' but was \'" + s + '\'');
        }
        String s1 = Response.header$default(response0, "Upgrade", null, 2, null);
        if(!v.O1("websocket", s1, true)) {
            throw new ProtocolException("Expected \'Upgrade\' header value \'websocket\' but was \'" + s1 + '\'');
        }
        String s2 = Response.header$default(response0, "Sec-WebSocket-Accept", null, 2, null);
        String s3 = o.d.l(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").e0().d();
        if(!L.g(s3, s2)) {
            throw new ProtocolException("Expected \'Sec-WebSocket-Accept\' header value \'" + s3 + "\' but was \'" + s2 + '\'');
        }
        if(exchange0 == null) {
            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    @Override  // okhttp3.WebSocket
    public boolean close(int v, @m String s) {
        return this.close(v, s, 60000L);
    }

    public final boolean close(int v, @m String s, long v1) {
        o o0;
        synchronized(this) {
            WebSocketProtocol.INSTANCE.validateCloseCode(v);
            if(s == null) {
                o0 = null;
            }
            else {
                o0 = o.d.l(s);
                if(((long)o0.h0()) > 0x7BL) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + s).toString());
                }
            }
            if(!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                Close realWebSocket$Close0 = new Close(v, o0, v1);
                this.messageAndCloseQueue.add(realWebSocket$Close0);
                this.runWriter();
                return true;
            }
            return false;
        }
    }

    public final void connect(@l OkHttpClient okHttpClient0) {
        L.p(okHttpClient0, "client");
        if(this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            this.failWebSocket(new ProtocolException("Request header not permitted: \'Sec-WebSocket-Extensions\'"), null);
            return;
        }
        OkHttpClient okHttpClient1 = okHttpClient0.newBuilder().eventListener(EventListener.NONE).protocols(RealWebSocket.ONLY_HTTP1).build();
        Request request0 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall0 = new RealCall(okHttpClient1, request0, true);
        this.call = realCall0;
        L.m(realCall0);
        realCall0.enqueue(new Callback() {
            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                request0.failWebSocket(iOException0, null);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                Streams realWebSocket$Streams0;
                L.p(call0, "call");
                L.p(response0, "response");
                Exchange exchange0 = response0.exchange();
                try {
                    request0.checkUpgradeSuccess$okhttp(response0, exchange0);
                    L.m(exchange0);
                    realWebSocket$Streams0 = exchange0.newWebSocketStreams();
                }
                catch(IOException iOException0) {
                    request0.failWebSocket(iOException0, response0);
                    Util.closeQuietly(response0);
                    if(exchange0 != null) {
                        exchange0.webSocketUpgradeFailed();
                    }
                    return;
                }
                WebSocketExtensions webSocketExtensions0 = WebSocketExtensions.Companion.parse(response0.headers());
                request0.extensions = webSocketExtensions0;
                if(!request0.isValid(webSocketExtensions0)) {
                    synchronized(request0) {
                        request0.messageAndCloseQueue.clear();
                        request0.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    request0.initReaderAndWriter(Util.okHttpName + " WebSocket " + this.$request.url().redact(), realWebSocket$Streams0);
                    request0.getListener$okhttp().onOpen(request0, response0);
                    request0.loopReader();
                }
                catch(Exception exception0) {
                    request0.failWebSocket(exception0, null);
                }
            }
        });
    }

    public final void failWebSocket(@l Exception exception0, @m Response response0) {
        WebSocketWriter webSocketWriter0;
        WebSocketReader webSocketReader0;
        Streams realWebSocket$Streams0;
        L.p(exception0, "e");
        synchronized(this) {
            if(this.failed) {
                return;
            }
            this.failed = true;
            realWebSocket$Streams0 = this.streams;
            this.streams = null;
            webSocketReader0 = this.reader;
            this.reader = null;
            webSocketWriter0 = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
        }
        try {
            this.listener.onFailure(this, exception0, response0);
        }
        catch(Throwable throwable0) {
            if(realWebSocket$Streams0 != null) {
                Util.closeQuietly(realWebSocket$Streams0);
            }
            if(webSocketReader0 != null) {
                Util.closeQuietly(webSocketReader0);
            }
            if(webSocketWriter0 != null) {
                Util.closeQuietly(webSocketWriter0);
            }
            throw throwable0;
        }
        if(realWebSocket$Streams0 != null) {
            Util.closeQuietly(realWebSocket$Streams0);
        }
        if(webSocketReader0 != null) {
            Util.closeQuietly(webSocketReader0);
        }
        if(webSocketWriter0 != null) {
            Util.closeQuietly(webSocketWriter0);
        }
    }

    @l
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(@l String s, @l Streams realWebSocket$Streams0) throws IOException {
        L.p(s, "name");
        L.p(realWebSocket$Streams0, "streams");
        WebSocketExtensions webSocketExtensions0 = this.extensions;
        L.m(webSocketExtensions0);
        synchronized(this) {
            this.name = s;
            this.streams = realWebSocket$Streams0;
            boolean z = webSocketExtensions0.noContextTakeover(realWebSocket$Streams0.getClient());
            this.writer = new WebSocketWriter(realWebSocket$Streams0.getClient(), realWebSocket$Streams0.getSink(), this.random, webSocketExtensions0.perMessageDeflate, z, this.minimumDeflateSize);
            this.writerTask = new WriterTask(this);
            long v1 = this.pingIntervalMillis;
            if(v1 != 0L) {
                long v2 = TimeUnit.MILLISECONDS.toNanos(v1);
                this.taskQueue.schedule(new Task(this, v2) {
                    final long $pingIntervalNanos$inlined;

                    {
                        RealWebSocket.this = realWebSocket0;
                        this.$pingIntervalNanos$inlined = v;
                        super(s, false, 2, null);
                    }

                    @Override  // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        RealWebSocket.this.writePingFrame$okhttp();
                        return this.$pingIntervalNanos$inlined;
                    }
                }, v2);
            }
            if(!this.messageAndCloseQueue.isEmpty()) {
                this.runWriter();
            }
        }
        boolean z1 = webSocketExtensions0.noContextTakeover(!realWebSocket$Streams0.getClient());
        this.reader = new WebSocketReader(realWebSocket$Streams0.getClient(), realWebSocket$Streams0.getSource(), this, webSocketExtensions0.perMessageDeflate, z1);
    }

    private final boolean isValid(WebSocketExtensions webSocketExtensions0) {
        if(webSocketExtensions0.unknownValues) {
            return false;
        }
        return webSocketExtensions0.clientMaxWindowBits == null ? webSocketExtensions0.serverMaxWindowBits == null || new kotlin.ranges.l(8, 15).l(((int)webSocketExtensions0.serverMaxWindowBits)) : false;
    }

    public final void loopReader() throws IOException {
        while(this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader0 = this.reader;
            L.m(webSocketReader0);
            webSocketReader0.processNextFrame();
        }
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadClose(int v, @l String s) {
        WebSocketWriter webSocketWriter0;
        WebSocketReader webSocketReader0;
        L.p(s, "reason");
        if(v == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized(this) {
            if(this.receivedCloseCode == -1) {
                this.receivedCloseCode = v;
                this.receivedCloseReason = s;
                Streams realWebSocket$Streams0 = null;
                if(!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                    webSocketReader0 = null;
                    webSocketWriter0 = null;
                }
                else {
                    Streams realWebSocket$Streams1 = this.streams;
                    this.streams = null;
                    webSocketReader0 = this.reader;
                    this.reader = null;
                    webSocketWriter0 = this.writer;
                    this.writer = null;
                    this.taskQueue.shutdown();
                    realWebSocket$Streams0 = realWebSocket$Streams1;
                }
                try {
                    this.listener.onClosing(this, v, s);
                    if(realWebSocket$Streams0 != null) {
                        this.listener.onClosed(this, v, s);
                    }
                }
                finally {
                    if(realWebSocket$Streams0 != null) {
                        Util.closeQuietly(realWebSocket$Streams0);
                    }
                    if(webSocketReader0 != null) {
                        Util.closeQuietly(webSocketReader0);
                    }
                    if(webSocketWriter0 != null) {
                        Util.closeQuietly(webSocketWriter0);
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("already closed");
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadMessage(@l String s) throws IOException {
        L.p(s, "text");
        this.listener.onMessage(this, s);
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadMessage(@l o o0) throws IOException {
        L.p(o0, "bytes");
        this.listener.onMessage(this, o0);
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadPing(@l o o0) {
        synchronized(this) {
            L.p(o0, "payload");
            if(!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(o0);
                this.runWriter();
                ++this.receivedPingCount;
            }
        }
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadPong(@l o o0) {
        synchronized(this) {
            L.p(o0, "payload");
            ++this.receivedPongCount;
            this.awaitingPong = false;
        }
    }

    public final boolean pong(@l o o0) {
        synchronized(this) {
            L.p(o0, "payload");
            if(!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(o0);
                this.runWriter();
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader0 = this.reader;
            L.m(webSocketReader0);
            webSocketReader0.processNextFrame();
            if(this.receivedCloseCode == -1) {
                return true;
            }
        }
        catch(Exception exception0) {
            this.failWebSocket(exception0, null);
        }
        return false;
    }

    @Override  // okhttp3.WebSocket
    public long queueSize() {
        synchronized(this) {
        }
        return this.queueSize;
    }

    public final int receivedPingCount() {
        synchronized(this) {
        }
        return this.receivedPingCount;
    }

    public final int receivedPongCount() {
        synchronized(this) {
        }
        return this.receivedPongCount;
    }

    @Override  // okhttp3.WebSocket
    @l
    public Request request() {
        return this.originalRequest;
    }

    private final void runWriter() {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12493 MUST hold lock on " + this);
        }
        Task task0 = this.writerTask;
        if(task0 != null) {
            TaskQueue.schedule$default(this.taskQueue, task0, 0L, 2, null);
        }
    }

    private final boolean send(o o0, int v) {
        synchronized(this) {
            if(!this.failed && !this.enqueuedClose) {
                if(this.queueSize + ((long)o0.h0()) > 0x1000000L) {
                    this.close(1001, null);
                    return false;
                }
                this.queueSize += (long)o0.h0();
                Message realWebSocket$Message0 = new Message(v, o0);
                this.messageAndCloseQueue.add(realWebSocket$Message0);
                this.runWriter();
                return true;
            }
            return false;
        }
    }

    @Override  // okhttp3.WebSocket
    public boolean send(@l String s) {
        L.p(s, "text");
        return this.send(o.d.l(s), 1);
    }

    @Override  // okhttp3.WebSocket
    public boolean send(@l o o0) {
        L.p(o0, "bytes");
        return this.send(o0, 2);
    }

    public final int sentPingCount() {
        synchronized(this) {
        }
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        WebSocketWriter webSocketWriter1;
        WebSocketReader webSocketReader0;
        Streams realWebSocket$Streams0;
        String s;
        int v;
        Object object2;
        Object object1;
        Object object0;
        WebSocketWriter webSocketWriter0;
        synchronized(this) {
            if(!this.failed) {
                webSocketWriter0 = this.writer;
                object0 = this.pongQueue.poll();
                object1 = null;
                if(object0 == null) {
                    object2 = this.messageAndCloseQueue.poll();
                    if(object2 instanceof Close) {
                        v = this.receivedCloseCode;
                        s = this.receivedCloseReason;
                        if(v == -1) {
                            long v1 = ((Close)object2).getCancelAfterCloseMillis();
                            TaskQueue taskQueue0 = this.taskQueue;
                            long v2 = TimeUnit.MILLISECONDS.toNanos(v1);
                            taskQueue0.schedule(new Task(true, this) {
                                @Override  // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    RealWebSocket.this.cancel();
                                    return -1L;
                                }
                            }, v2);
                            realWebSocket$Streams0 = null;
                            webSocketReader0 = null;
                            webSocketWriter1 = null;
                        }
                        else {
                            realWebSocket$Streams0 = this.streams;
                            this.streams = null;
                            webSocketReader0 = this.reader;
                            this.reader = null;
                            webSocketWriter1 = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                        }
                        object1 = object2;
                        goto label_47;
                    }
                    goto label_28;
                }
                else {
                    goto label_38;
                }
                goto label_47;
            }
            return false;
        }
    label_28:
        if(object2 == null) {
            return false;
        }
        realWebSocket$Streams0 = null;
        s = null;
        webSocketReader0 = null;
        webSocketWriter1 = null;
        object1 = object2;
        v = -1;
        goto label_47;
    label_38:
        realWebSocket$Streams0 = null;
        s = null;
        webSocketReader0 = null;
        webSocketWriter1 = null;
        v = -1;
    label_47:
        try {
            if(object0 != null) {
                L.m(webSocketWriter0);
                webSocketWriter0.writePong(((o)object0));
                return true;
            }
            if(object1 instanceof Message) {
                Message realWebSocket$Message0 = (Message)object1;
                L.m(webSocketWriter0);
                webSocketWriter0.writeMessageFrame(realWebSocket$Message0.getFormatOpcode(), realWebSocket$Message0.getData());
                synchronized(this) {
                    this.queueSize -= (long)realWebSocket$Message0.getData().h0();
                }
                return true;
            }
            if(object1 instanceof Close) {
                L.m(webSocketWriter0);
                webSocketWriter0.writeClose(((Close)object1).getCode(), ((Close)object1).getReason());
                if(realWebSocket$Streams0 != null) {
                    L.m(s);
                    this.listener.onClosed(this, v, s);
                }
                return true;
            }
        }
        finally {
            if(realWebSocket$Streams0 != null) {
                Util.closeQuietly(realWebSocket$Streams0);
            }
            if(webSocketReader0 != null) {
                Util.closeQuietly(webSocketReader0);
            }
            if(webSocketWriter1 != null) {
                Util.closeQuietly(webSocketWriter1);
            }
        }
        throw new AssertionError();
    }

    public final void writePingFrame$okhttp() {
        int v;
        WebSocketWriter webSocketWriter0;
        synchronized(this) {
            if(this.failed) {
                return;
            }
            webSocketWriter0 = this.writer;
            if(webSocketWriter0 == null) {
                return;
            }
            v = this.awaitingPong ? this.sentPingCount : -1;
            ++this.sentPingCount;
            this.awaitingPong = true;
        }
        if(v != -1) {
            this.failWebSocket(new SocketTimeoutException("sent ping but didn\'t receive pong within " + this.pingIntervalMillis + "ms (after " + (v - 1) + " successful ping/pongs)"), null);
            return;
        }
        try {
            webSocketWriter0.writePing(o.f);
        }
        catch(IOException iOException0) {
            this.failWebSocket(iOException0, null);
        }
    }
}

