package okhttp3;

import java.net.Socket;
import y4.l;
import y4.m;

public interface Connection {
    @m
    Handshake handshake();

    @l
    Protocol protocol();

    @l
    Route route();

    @l
    Socket socket();
}

