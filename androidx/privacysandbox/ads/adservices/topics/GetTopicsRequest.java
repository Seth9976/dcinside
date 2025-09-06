package androidx.privacysandbox.ads.adservices.topics;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class GetTopicsRequest {
    @s0({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class Builder {
        @l
        private String a;
        private boolean b;

        public Builder() {
            this.a = "";
            this.b = true;
        }

        @l
        public final GetTopicsRequest a() {
            if(this.a.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            return new GetTopicsRequest(this.a, this.b);
        }

        @l
        public final Builder b(@l String s) {
            L.p(s, "adsSdkName");
            this.a = s;
            return this;
        }

        @l
        public final Builder c(boolean z) {
            this.b = z;
            return this;
        }
    }

    @l
    private final String a;
    private final boolean b;

    public GetTopicsRequest() {
        this(null, false, 3, null);
    }

    public GetTopicsRequest(@l String s, boolean z) {
        L.p(s, "adsSdkName");
        super();
        this.a = s;
        this.b = z;
    }

    public GetTopicsRequest(String s, boolean z, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            z = false;
        }
        this(s, z);
    }

    @l
    public final String a() [...] // 潜在的解密器

    @i(name = "shouldRecordObservation")
    public final boolean b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GetTopicsRequest ? L.g(this.a, ((GetTopicsRequest)object0).a) && this.b == ((GetTopicsRequest)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + c.a(this.b);
    }

    @Override
    @l
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }
}

