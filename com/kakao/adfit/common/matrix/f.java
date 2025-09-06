package com.kakao.adfit.common.matrix;

import java.util.UUID;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;

public final class f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final f a() {
            return f.c;
        }

        public final f a(String s) {
            String s1;
            L.p(s, "uuid");
            if(s.length() == 0x20) {
                s1 = new StringBuilder(s).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
                L.o(s1, "StringBuilder(id)\n      …              .toString()");
            }
            else {
                s1 = s;
            }
            try {
                if(s1.length() == 36) {
                    UUID uUID0 = UUID.fromString(s1);
                    L.o(uUID0, "fromString(id)");
                    return new f(uUID0, null);
                }
            }
            catch(Exception unused_ex) {
            }
            com.kakao.adfit.m.f.e(("String representation of MatrixId has either 32 (UUID no dashes) or 36 characters long (completed UUID). [UUID = " + s + ']'));
            return null;
        }

        public final f b() {
            UUID uUID0 = UUID.randomUUID();
            L.o(uUID0, "randomUUID()");
            return new f(uUID0, null);
        }
    }

    private final UUID a;
    public static final a b;
    private static final f c;

    static {
        f.b = new a(null);
        f.c = new f(new UUID(0L, 0L));
    }

    private f(UUID uUID0) {
        this.a = uUID0;
    }

    public f(UUID uUID0, w w0) {
        this(uUID0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof f && this.a.compareTo(((f)object0).a) == 0;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        String s = this.a.toString();
        L.o(s, "uuid.toString()");
        return v.l2(s, "-", "", false, 4, null);
    }
}

