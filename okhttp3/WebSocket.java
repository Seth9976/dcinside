package okhttp3;

import okio.o;
import y4.l;
import y4.m;

public interface WebSocket {
    public interface Factory {
        @l
        WebSocket newWebSocket(@l Request arg1, @l WebSocketListener arg2);
    }

    void cancel();

    boolean close(int arg1, @m String arg2);

    long queueSize();

    @l
    Request request();

    boolean send(@l String arg1);

    boolean send(@l o arg1);
}

