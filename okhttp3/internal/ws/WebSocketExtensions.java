package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Headers;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.f;

public final class WebSocketExtensions {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final WebSocketExtensions parse(@l Headers headers0) throws IOException {
            L.p(headers0, "responseHeaders");
            int v = headers0.size();
            int v1 = 0;
            boolean z = false;
            Integer integer0 = null;
            boolean z1 = false;
            Integer integer1 = null;
            boolean z2 = false;
            boolean z3 = false;
            while(v1 < v) {
                if(v.O1(headers0.name(v1), "Sec-WebSocket-Extensions", true)) {
                    String s = headers0.value(v1);
                    int v2 = 0;
                    while(v2 < s.length()) {
                        int v3 = Util.delimiterOffset$default(s, ',', v2, 0, 4, null);
                        int v4 = Util.delimiterOffset(s, ';', v2, v3);
                        int v5 = v4 + 1;
                        if(v.O1(Util.trimSubstring(s, v2, v4), "permessage-deflate", true)) {
                            if(z) {
                                z3 = true;
                            }
                            v2 = v5;
                            while(v2 < v3) {
                                int v6 = Util.delimiterOffset(s, ';', v2, v3);
                                int v7 = Util.delimiterOffset(s, '=', v2, v6);
                                String s1 = Util.trimSubstring(s, v2, v7);
                                String s2 = v7 >= v6 ? null : v.n4(Util.trimSubstring(s, v7 + 1, v6), "\"");
                                v2 = v6 + 1;
                                if(v.O1(s1, "client_max_window_bits", true)) {
                                    if(integer0 != null) {
                                        z3 = true;
                                    }
                                    integer0 = s2 == null ? null : v.b1(s2);
                                    if(integer0 != null) {
                                        continue;
                                    }
                                }
                                else if(v.O1(s1, "client_no_context_takeover", true)) {
                                    if(z1) {
                                        z3 = true;
                                    }
                                    if(s2 != null) {
                                        z3 = true;
                                    }
                                    z1 = true;
                                    continue;
                                }
                                else if(v.O1(s1, "server_max_window_bits", true)) {
                                    if(integer1 != null) {
                                        z3 = true;
                                    }
                                    integer1 = s2 == null ? null : v.b1(s2);
                                    if(integer1 != null) {
                                        continue;
                                    }
                                }
                                else if(v.O1(s1, "server_no_context_takeover", true)) {
                                    if(z2) {
                                        z3 = true;
                                    }
                                    if(s2 != null) {
                                        z3 = true;
                                    }
                                    z2 = true;
                                    continue;
                                }
                                z3 = true;
                            }
                            z = true;
                        }
                        else {
                            v2 = v5;
                            z3 = true;
                        }
                    }
                }
                ++v1;
            }
            return new WebSocketExtensions(z, integer0, z1, integer1, z2, z3);
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    @m
    @f
    public final Integer clientMaxWindowBits;
    @f
    public final boolean clientNoContextTakeover;
    @f
    public final boolean perMessageDeflate;
    @m
    @f
    public final Integer serverMaxWindowBits;
    @f
    public final boolean serverNoContextTakeover;
    @f
    public final boolean unknownValues;

    static {
        WebSocketExtensions.Companion = new Companion(null);
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 0x3F, null);
    }

    public WebSocketExtensions(boolean z, @m Integer integer0, boolean z1, @m Integer integer1, boolean z2, boolean z3) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = integer0;
        this.clientNoContextTakeover = z1;
        this.serverMaxWindowBits = integer1;
        this.serverNoContextTakeover = z2;
        this.unknownValues = z3;
    }

    public WebSocketExtensions(boolean z, Integer integer0, boolean z1, Integer integer1, boolean z2, boolean z3, int v, w w0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? integer0 : null), ((v & 4) == 0 ? z1 : false), ((v & 8) == 0 ? integer1 : null), ((v & 16) == 0 ? z2 : false), ((v & 0x20) == 0 ? z3 : false));
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @m
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @m
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @l
    public final WebSocketExtensions copy(boolean z, @m Integer integer0, boolean z1, @m Integer integer1, boolean z2, boolean z3) {
        return new WebSocketExtensions(z, integer0, z1, integer1, z2, z3);
    }

    public static WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions0, boolean z, Integer integer0, boolean z1, Integer integer1, boolean z2, boolean z3, int v, Object object0) {
        if((v & 1) != 0) {
            z = webSocketExtensions0.perMessageDeflate;
        }
        if((v & 2) != 0) {
            integer0 = webSocketExtensions0.clientMaxWindowBits;
        }
        if((v & 4) != 0) {
            z1 = webSocketExtensions0.clientNoContextTakeover;
        }
        if((v & 8) != 0) {
            integer1 = webSocketExtensions0.serverMaxWindowBits;
        }
        if((v & 16) != 0) {
            z2 = webSocketExtensions0.serverNoContextTakeover;
        }
        if((v & 0x20) != 0) {
            z3 = webSocketExtensions0.unknownValues;
        }
        return webSocketExtensions0.copy(z, integer0, z1, integer1, z2, z3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebSocketExtensions)) {
            return false;
        }
        if(this.perMessageDeflate != ((WebSocketExtensions)object0).perMessageDeflate) {
            return false;
        }
        if(!L.g(this.clientMaxWindowBits, ((WebSocketExtensions)object0).clientMaxWindowBits)) {
            return false;
        }
        if(this.clientNoContextTakeover != ((WebSocketExtensions)object0).clientNoContextTakeover) {
            return false;
        }
        if(!L.g(this.serverMaxWindowBits, ((WebSocketExtensions)object0).serverMaxWindowBits)) {
            return false;
        }
        return this.serverNoContextTakeover == ((WebSocketExtensions)object0).serverNoContextTakeover ? this.unknownValues == ((WebSocketExtensions)object0).unknownValues : false;
    }

    @Override
    public int hashCode() {
        int v = this.perMessageDeflate;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = 0;
        int v3 = this.clientMaxWindowBits == null ? 0 : this.clientMaxWindowBits.hashCode();
        int v4 = this.clientNoContextTakeover;
        if(v4) {
            v4 = 1;
        }
        Integer integer0 = this.serverMaxWindowBits;
        if(integer0 != null) {
            v2 = integer0.hashCode();
        }
        int v5 = this.serverNoContextTakeover;
        if(v5) {
            v5 = 1;
        }
        if(!this.unknownValues) {
            v1 = false;
        }
        return ((((v * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + v5) * 0x1F + v1;
    }

    // 去混淆评级： 低(20)
    public final boolean noContextTakeover(boolean z) {
        return z ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @Override
    @l
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }
}

