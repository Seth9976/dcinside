package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class n0 extends j {
    @l
    private final Socket a;

    public n0(@l Socket socket0) {
        L.p(socket0, "socket");
        super();
        this.a = socket0;
    }

    @Override  // okio.j
    @l
    protected IOException newTimeoutException(@m IOException iOException0) {
        IOException iOException1 = new SocketTimeoutException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }

    @Override  // okio.j
    protected void timedOut() {
        try {
            this.a.close();
        }
        catch(Exception exception0) {
            a0.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, exception0);
        }
        catch(AssertionError assertionError0) {
            if(!Z.l(assertionError0)) {
                throw assertionError0;
            }
            a0.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, assertionError0);
        }
    }
}

