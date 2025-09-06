package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.L;
import okhttp3.internal.authenticator.JavaNetAuthenticator;
import y4.l;
import y4.m;
import z3.f;

public interface Authenticator {
    public static final class Companion {
        static final class AuthenticatorNone implements Authenticator {
            @Override  // okhttp3.Authenticator
            @m
            public Request authenticate(@m Route route0, @l Response response0) {
                L.p(response0, "response");
                return null;
            }
        }

        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final Authenticator JAVA_NET_AUTHENTICATOR;
    @l
    @f
    public static final Authenticator NONE;

    static {
        Authenticator.Companion = Companion.$$INSTANCE;
        Authenticator.NONE = new AuthenticatorNone();
        Authenticator.JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);
    }

    @m
    Request authenticate(@m Route arg1, @l Response arg2) throws IOException;
}

