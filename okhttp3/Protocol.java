package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import z3.n;

public enum Protocol {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final Protocol get(@l String s) throws IOException {
            L.p(s, "protocol");
            Protocol protocol0 = Protocol.HTTP_1_0;
            if(!L.g(s, "http/1.0")) {
                protocol0 = Protocol.HTTP_1_1;
                if(!L.g(s, "http/1.1")) {
                    protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if(!L.g(s, "h2_prior_knowledge")) {
                        protocol0 = Protocol.HTTP_2;
                        if(!L.g(s, "h2")) {
                            protocol0 = Protocol.SPDY_3;
                            if(!L.g(s, "spdy/3.1")) {
                                protocol0 = Protocol.QUIC;
                                if(!L.g(s, "quic")) {
                                    throw new IOException("Unexpected protocol: " + s);
                                }
                            }
                        }
                    }
                }
            }
            return protocol0;
        }
    }

    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    @k(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    @l
    public static final Companion Companion;
    @l
    private final String protocol;

    private static final Protocol[] $values() [...] // Inlined contents

    static {
        Protocol.Companion = new Companion(null);
    }

    private Protocol(String s1) {
        this.protocol = s1;
    }

    public static final String access$getProtocol$p(Protocol protocol0) {
        return protocol0.protocol;
    }

    @l
    @n
    public static final Protocol get(@l String s) throws IOException {
        return Protocol.Companion.get(s);
    }

    @Override
    @l
    public String toString() {
        return this.protocol;
    }
}

