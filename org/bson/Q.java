package org.bson;

public enum q {
    BINARY(0),
    FUNCTION(1),
    OLD_BINARY(2),
    UUID_LEGACY(3),
    UUID_STANDARD(4),
    MD5(5),
    USER_DEFINED((byte)0x80);

    private final byte a;

    private q(byte b) {
        this.a = b;
    }

    public byte a() {
        return this.a;
    }

    public static boolean b(byte b) {
        return b == q.e.a() || b == q.f.a();
    }
}

