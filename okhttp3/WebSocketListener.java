package okhttp3;

import kotlin.jvm.internal.L;
import okio.o;
import y4.l;
import y4.m;

public abstract class WebSocketListener {
    public void onClosed(@l WebSocket webSocket0, int v, @l String s) {
        L.p(webSocket0, "webSocket");
        L.p(s, "reason");
    }

    public void onClosing(@l WebSocket webSocket0, int v, @l String s) {
        L.p(webSocket0, "webSocket");
        L.p(s, "reason");
    }

    public void onFailure(@l WebSocket webSocket0, @l Throwable throwable0, @m Response response0) {
        L.p(webSocket0, "webSocket");
        L.p(throwable0, "t");
    }

    public void onMessage(@l WebSocket webSocket0, @l String s) {
        L.p(webSocket0, "webSocket");
        L.p(s, "text");
    }

    public void onMessage(@l WebSocket webSocket0, @l o o0) {
        L.p(webSocket0, "webSocket");
        L.p(o0, "bytes");
    }

    public void onOpen(@l WebSocket webSocket0, @l Response response0) {
        L.p(webSocket0, "webSocket");
        L.p(response0, "response");
    }
}

