package com.vungle.ads.internal.model;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class k {
    @l
    private final String description;
    private final boolean errorIsTerminal;
    @l
    private final b reason;

    public k(@l b sdk$SDKError$b0, @l String s, boolean z) {
        L.p(sdk$SDKError$b0, "reason");
        L.p(s, "description");
        super();
        this.reason = sdk$SDKError$b0;
        this.description = s;
        this.errorIsTerminal = z;
    }

    public k(b sdk$SDKError$b0, String s, boolean z, int v, w w0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(sdk$SDKError$b0, s, z);
    }

    @l
    public final b component1() {
        return this.reason;
    }

    @l
    public final String component2() {
        return this.description;
    }

    public final boolean component3() {
        return this.errorIsTerminal;
    }

    @l
    public final k copy(@l b sdk$SDKError$b0, @l String s, boolean z) {
        L.p(sdk$SDKError$b0, "reason");
        L.p(s, "description");
        return new k(sdk$SDKError$b0, s, z);
    }

    public static k copy$default(k k0, b sdk$SDKError$b0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            sdk$SDKError$b0 = k0.reason;
        }
        if((v & 2) != 0) {
            s = k0.description;
        }
        if((v & 4) != 0) {
            z = k0.errorIsTerminal;
        }
        return k0.copy(sdk$SDKError$b0, s, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(this.reason != ((k)object0).reason) {
            return false;
        }
        return L.g(this.description, ((k)object0).description) ? this.errorIsTerminal == ((k)object0).errorIsTerminal : false;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    @l
    public final b getReason() {
        return this.reason;
    }

    @Override
    public int hashCode() {
        int v = this.reason.hashCode();
        int v1 = this.description.hashCode();
        int v2 = this.errorIsTerminal;
        if(v2) {
            v2 = 1;
        }
        return (v * 0x1F + v1) * 0x1F + v2;
    }

    @Override
    @l
    public String toString() {
        return "ErrorInfo(reason=" + this.reason + ", description=" + this.description + ", errorIsTerminal=" + this.errorIsTerminal + ')';
    }
}

