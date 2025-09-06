package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.o;
import y4.l;

public final class RouteException extends RuntimeException {
    @l
    private final IOException firstConnectException;
    @l
    private IOException lastConnectException;

    public RouteException(@l IOException iOException0) {
        L.p(iOException0, "firstConnectException");
        super(iOException0);
        this.firstConnectException = iOException0;
        this.lastConnectException = iOException0;
    }

    public final void addConnectException(@l IOException iOException0) {
        L.p(iOException0, "e");
        o.a(this.firstConnectException, iOException0);
        this.lastConnectException = iOException0;
    }

    @l
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @l
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}

