package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Protocol;
import okhttp3.Response;
import y4.l;
import z3.f;

public final class StatusLine {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final StatusLine get(@l Response response0) {
            L.p(response0, "response");
            return new StatusLine(response0.protocol(), response0.code(), response0.message());
        }

        @l
        public final StatusLine parse(@l String s) throws IOException {
            int v1;
            Protocol protocol0;
            int v = 9;
            L.p(s, "statusLine");
            if(v.v2(s, "HTTP/1.", false, 2, null)) {
                if(s.length() < 9 || s.charAt(8) != 0x20) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                switch(s.charAt(7) - 0x30) {
                    case 0: {
                        protocol0 = Protocol.HTTP_1_0;
                        break;
                    }
                    case 1: {
                        protocol0 = Protocol.HTTP_1_1;
                        break;
                    }
                    default: {
                        throw new ProtocolException("Unexpected status line: " + s);
                    }
                }
            }
            else {
                if(!v.v2(s, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                protocol0 = Protocol.HTTP_1_0;
                v = 4;
            }
            if(s.length() < v + 3) {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            try {
                String s1 = s.substring(v, v + 3);
                L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                v1 = Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            if(s.length() > v + 3) {
                if(s.charAt(v + 3) != 0x20) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                String s2 = s.substring(v + 4);
                L.o(s2, "this as java.lang.String).substring(startIndex)");
                return new StatusLine(protocol0, v1, s2);
            }
            return new StatusLine(protocol0, v1, "");
        }
    }

    @l
    public static final Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    @f
    public final int code;
    @l
    @f
    public final String message;
    @l
    @f
    public final Protocol protocol;

    static {
        StatusLine.Companion = new Companion(null);
    }

    public StatusLine(@l Protocol protocol0, int v, @l String s) {
        L.p(protocol0, "protocol");
        L.p(s, "message");
        super();
        this.protocol = protocol0;
        this.code = v;
        this.message = s;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.protocol == Protocol.HTTP_1_0) {
            stringBuilder0.append("HTTP/1.0");
        }
        else {
            stringBuilder0.append("HTTP/1.1");
        }
        stringBuilder0.append(' ');
        stringBuilder0.append(this.code);
        stringBuilder0.append(' ');
        stringBuilder0.append(this.message);
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

