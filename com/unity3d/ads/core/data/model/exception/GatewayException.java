package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class GatewayException extends Exception {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    @l
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    @l
    private final String message;
    @l
    private final String reason;
    @m
    private final String reasonDebug;
    @m
    private final Throwable throwable;

    static {
        GatewayException.Companion = new Companion(null);
    }

    public GatewayException(@l String s, @m Throwable throwable0, @l String s1, @m String s2) {
        L.p(s, "message");
        L.p(s1, "reason");
        super(s);
        this.message = s;
        this.throwable = throwable0;
        this.reason = s1;
        this.reasonDebug = s2;
    }

    public GatewayException(String s, Throwable throwable0, String s1, String s2, int v, w w0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        if((v & 4) != 0) {
            s1 = "gateway";
        }
        if((v & 8) != 0) {
            s2 = null;
        }
        this(s, throwable0, s1, s2);
    }

    @l
    public final String component1() {
        return this.getMessage();
    }

    @m
    public final Throwable component2() {
        return this.throwable;
    }

    @l
    public final String component3() {
        return this.reason;
    }

    @m
    public final String component4() {
        return this.reasonDebug;
    }

    @l
    public final GatewayException copy(@l String s, @m Throwable throwable0, @l String s1, @m String s2) {
        L.p(s, "message");
        L.p(s1, "reason");
        return new GatewayException(s, throwable0, s1, s2);
    }

    public static GatewayException copy$default(GatewayException gatewayException0, String s, Throwable throwable0, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = gatewayException0.getMessage();
        }
        if((v & 2) != 0) {
            throwable0 = gatewayException0.throwable;
        }
        if((v & 4) != 0) {
            s1 = gatewayException0.reason;
        }
        if((v & 8) != 0) {
            s2 = gatewayException0.reasonDebug;
        }
        return gatewayException0.copy(s, throwable0, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GatewayException)) {
            return false;
        }
        if(!L.g(this.getMessage(), ((GatewayException)object0).getMessage())) {
            return false;
        }
        if(!L.g(this.throwable, ((GatewayException)object0).throwable)) {
            return false;
        }
        return L.g(this.reason, ((GatewayException)object0).reason) ? L.g(this.reasonDebug, ((GatewayException)object0).reasonDebug) : false;
    }

    @Override
    @l
    public String getMessage() {
        return this.message;
    }

    @l
    public final String getReason() {
        return this.reason;
    }

    @m
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @m
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Override
    public int hashCode() {
        int v = this.getMessage().hashCode();
        int v1 = 0;
        int v2 = this.throwable == null ? 0 : this.throwable.hashCode();
        int v3 = this.reason.hashCode();
        String s = this.reasonDebug;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    @l
    public String toString() {
        return "GatewayException(message=" + this.getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }
}

