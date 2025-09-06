package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.s1;
import y4.l;
import y4.m;

public final class InitializationException extends Exception {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final InitializationException parseFrom(@l Exception exception0) {
            L.p(exception0, "e");
            if((exception0 instanceof s1 ? true : exception0 instanceof NetworkTimeoutException)) {
                return new InitializationException("Timeout", exception0, "timeout", exception0.getMessage());
            }
            if(exception0 instanceof UnityAdsNetworkException) {
                return ((UnityAdsNetworkException)exception0).getCode() == null ? new InitializationException("Network", exception0, "network", ((UnityAdsNetworkException)exception0).getMessage()) : new InitializationException("Network", exception0, "network." + ((UnityAdsNetworkException)exception0).getCode(), ((UnityAdsNetworkException)exception0).getMessage());
            }
            if(exception0 instanceof GatewayException) {
                return new InitializationException("Initialization failure", ((GatewayException)exception0).getThrowable(), ((GatewayException)exception0).getReason(), ((GatewayException)exception0).getReasonDebug());
            }
            return exception0 instanceof InitializationException ? ((InitializationException)exception0) : new InitializationException("Initialization failure", exception0, "unknown", exception0.getMessage());
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final String message;
    @l
    private final String reason;
    @m
    private final String reasonDebug;
    @m
    private final Throwable throwable;

    static {
        InitializationException.Companion = new Companion(null);
    }

    public InitializationException(@l String s, @m Throwable throwable0, @l String s1, @m String s2) {
        L.p(s, "message");
        L.p(s1, "reason");
        super(s);
        this.message = s;
        this.throwable = throwable0;
        this.reason = s1;
        this.reasonDebug = s2;
    }

    public InitializationException(String s, Throwable throwable0, String s1, String s2, int v, w w0) {
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
    public final InitializationException copy(@l String s, @m Throwable throwable0, @l String s1, @m String s2) {
        L.p(s, "message");
        L.p(s1, "reason");
        return new InitializationException(s, throwable0, s1, s2);
    }

    public static InitializationException copy$default(InitializationException initializationException0, String s, Throwable throwable0, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = initializationException0.getMessage();
        }
        if((v & 2) != 0) {
            throwable0 = initializationException0.throwable;
        }
        if((v & 4) != 0) {
            s1 = initializationException0.reason;
        }
        if((v & 8) != 0) {
            s2 = initializationException0.reasonDebug;
        }
        return initializationException0.copy(s, throwable0, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof InitializationException)) {
            return false;
        }
        if(!L.g(this.getMessage(), ((InitializationException)object0).getMessage())) {
            return false;
        }
        if(!L.g(this.throwable, ((InitializationException)object0).throwable)) {
            return false;
        }
        return L.g(this.reason, ((InitializationException)object0).reason) ? L.g(this.reasonDebug, ((InitializationException)object0).reasonDebug) : false;
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
        return "InitializationException(message=" + this.getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }
}

