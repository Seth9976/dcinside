package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import com.vungle.ads.internal.util.o;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class d1 extends Exception {
    private final int code;
    @l
    private final String errorMessage;
    @m
    private o logEntry;
    @l
    private final b loggableReason;

    private d1(b sdk$SDKError$b0, String s) {
        super(s);
        this.loggableReason = sdk$SDKError$b0;
        this.errorMessage = s;
        this.code = sdk$SDKError$b0.getNumber();
    }

    public d1(b sdk$SDKError$b0, String s, w w0) {
        this(sdk$SDKError$b0, s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!L.g(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        if(this.loggableReason != ((d1)object0).loggableReason) {
            return false;
        }
        return L.g(this.errorMessage, ((d1)object0).errorMessage) ? L.g(this.logEntry, ((d1)object0).logEntry) : false;
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    @m
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    @Override
    public int hashCode() {
        int v = this.loggableReason.hashCode();
        int v1 = this.errorMessage.hashCode();
        return this.logEntry == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.logEntry.hashCode();
    }

    @l
    public final d1 logError$vungle_ads_release() {
        this.logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        r.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    @l
    public final d1 setLogEntry$vungle_ads_release(@m o o0) {
        this.logEntry = o0;
        return this;
    }
}

