package com.google.gson;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class u extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends u {
        a(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.u
        public j a(Long long0) {
            return long0 == null ? l.a : new p(long0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends u {
        b(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.u
        public j a(Long long0) {
            return long0 == null ? l.a : new p(long0.toString());
        }
    }

    public static final enum u a;
    public static final enum u b;
    private static final u[] c;

    static {
        a u$a0 = new a("DEFAULT", 0);
        u.a = u$a0;
        b u$b0 = new b("STRING", 1);
        u.b = u$b0;
        u.c = new u[]{u$a0, u$b0};
    }

    private u(String s, int v) {
        super(s, v);
    }

    u(String s, int v, a u$a0) {
        this(s, v);
    }

    public abstract j a(Long arg1);

    public static u valueOf(String s) {
        return (u)Enum.valueOf(u.class, s);
    }

    public static u[] values() {
        return (u[])u.c.clone();
    }
}

