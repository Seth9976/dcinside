package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public class y0 extends IOException {
    public static class a extends y0 {
        private static final long d = 3283890091615336259L;

        public a(String s) {
            super(s);
        }
    }

    private R0 a;
    private boolean b;
    private static final long c = 0xE9924688C2F20054L;

    public y0(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
        this.a = null;
    }

    public y0(Exception exception0) {
        super(exception0.getMessage(), exception0);
        this.a = null;
    }

    public y0(String s) {
        super(s);
        this.a = null;
    }

    public y0(String s, IOException iOException0) {
        super(s, iOException0);
        this.a = null;
    }

    public y0(String s, Exception exception0) {
        super(s, exception0);
        this.a = null;
    }

    boolean a() {
        return this.b;
    }

    public R0 b() {
        return this.a;
    }

    static y0 c() {
        return new y0("Protocol message end-group tag did not match expected tag.");
    }

    static y0 d() {
        return new y0("Protocol message contained an invalid tag (zero).");
    }

    static y0 e() {
        return new y0("Protocol message had invalid UTF-8.");
    }

    static a f() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static y0 g() {
        return new y0("CodedInputStream encountered a malformed varint.");
    }

    static y0 h() {
        return new y0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static y0 i() {
        return new y0("Failed to parse the message.");
    }

    static y0 j() {
        return new y0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    void k() {
        this.b = true;
    }

    public y0 l(R0 r00) {
        this.a = r00;
        return this;
    }

    static y0 m() {
        return new y0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static y0 n() {
        return new y0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public IOException o() {
        return this.getCause() instanceof IOException ? ((IOException)this.getCause()) : this;
    }
}

