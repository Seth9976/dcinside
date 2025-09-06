package com.google.crypto.tink.shaded.protobuf;

@y
final class q1 implements P0 {
    private final R0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    q1(R0 r00, String s, Object[] arr_object) {
        this.a = r00;
        this.b = s;
        this.c = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.d = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v2 = 13;
        int v4;
        for(int v3 = 1; (v4 = s.charAt(v3)) >= 0xD800; ++v3) {
            v1 |= (v4 & 0x1FFF) << v2;
            v2 += 13;
        }
        this.d = v1 | v4 << v2;
    }

    Object[] a() {
        return this.c;
    }

    String b() {
        return this.b;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.P0
    public R0 getDefaultInstance() {
        return this.a;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.P0
    public l1 getSyntax() {
        return (this.d & 1) == 1 ? l1.a : l1.b;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.P0
    public boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}

