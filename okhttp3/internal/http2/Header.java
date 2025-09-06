package okhttp3.internal.http2;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okio.o;
import y4.l;
import y4.m;
import z3.f;

public final class Header {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    @f
    public static final o PSEUDO_PREFIX = null;
    @l
    @f
    public static final o RESPONSE_STATUS = null;
    @l
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    @l
    @f
    public static final o TARGET_AUTHORITY = null;
    @l
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    @l
    @f
    public static final o TARGET_METHOD = null;
    @l
    public static final String TARGET_METHOD_UTF8 = ":method";
    @l
    @f
    public static final o TARGET_PATH = null;
    @l
    public static final String TARGET_PATH_UTF8 = ":path";
    @l
    @f
    public static final o TARGET_SCHEME = null;
    @l
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    @f
    public final int hpackSize;
    @l
    @f
    public final o name;
    @l
    @f
    public final o value;

    static {
        Header.Companion = new Companion(null);
        Header.PSEUDO_PREFIX = o.d.l(":");
        Header.RESPONSE_STATUS = o.d.l(":status");
        Header.TARGET_METHOD = o.d.l(":method");
        Header.TARGET_PATH = o.d.l(":path");
        Header.TARGET_SCHEME = o.d.l(":scheme");
        Header.TARGET_AUTHORITY = o.d.l(":authority");
    }

    public Header(@l String s, @l String s1) {
        L.p(s, "name");
        L.p(s1, "value");
        this(o.d.l(s), o.d.l(s1));
    }

    public Header(@l o o0, @l String s) {
        L.p(o0, "name");
        L.p(s, "value");
        this(o0, o.d.l(s));
    }

    public Header(@l o o0, @l o o1) {
        L.p(o0, "name");
        L.p(o1, "value");
        super();
        this.name = o0;
        this.value = o1;
        this.hpackSize = o0.h0() + 0x20 + o1.h0();
    }

    @l
    public final o component1() {
        return this.name;
    }

    @l
    public final o component2() {
        return this.value;
    }

    @l
    public final Header copy(@l o o0, @l o o1) {
        L.p(o0, "name");
        L.p(o1, "value");
        return new Header(o0, o1);
    }

    public static Header copy$default(Header header0, o o0, o o1, int v, Object object0) {
        if((v & 1) != 0) {
            o0 = header0.name;
        }
        if((v & 2) != 0) {
            o1 = header0.value;
        }
        return header0.copy(o0, o1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Header)) {
            return false;
        }
        return L.g(this.name, ((Header)object0).name) ? L.g(this.value, ((Header)object0).value) : false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * 0x1F + this.value.hashCode();
    }

    @Override
    @l
    public String toString() {
        return this.name.t0() + ": " + this.value.t0();
    }
}

