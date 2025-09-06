package com.google.firebase.perf.util;

public abstract enum j {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends j {
        a(String s, int v, long v1) {
            super(v1, null);
        }

        @Override  // com.google.firebase.perf.util.j
        public long b(long v, j j0) {
            return j0.g(v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends j {
        b(String s, int v, long v1) {
            super(v1, null);
        }

        @Override  // com.google.firebase.perf.util.j
        public long b(long v, j j0) {
            return j0.d(v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class c extends j {
        c(String s, int v, long v1) {
            super(v1, null);
        }

        @Override  // com.google.firebase.perf.util.j
        public long b(long v, j j0) {
            return j0.f(v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class d extends j {
        d(String s, int v, long v1) {
            super(v1, null);
        }

        @Override  // com.google.firebase.perf.util.j
        public long b(long v, j j0) {
            return j0.e(v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e extends j {
        e(String s, int v, long v1) {
            super(v1, null);
        }

        @Override  // com.google.firebase.perf.util.j
        public long b(long v, j j0) {
            return j0.c(v);
        }
    }

    TERABYTES(0x10000000000L) /* 警告！未生成枚举子类：com.google.firebase.perf.util.j$a */,
    GIGABYTES(0x40000000L) /* 警告！未生成枚举子类：com.google.firebase.perf.util.j$b */,
    MEGABYTES(0x100000L) /* 警告！未生成枚举子类：com.google.firebase.perf.util.j$c */,
    KILOBYTES(0x400L) /* 警告！未生成枚举子类：com.google.firebase.perf.util.j$d */,
    BYTES(1L) /* 警告！未生成枚举子类：com.google.firebase.perf.util.j$e */;

    long a;

    private j(long v1) {
        this.a = v1;
    }

    private static j[] a() [...] // Inlined contents

    public abstract long b(long arg1, j arg2);

    public long c(long v) {
        return v * this.a;
    }

    public long d(long v) {
        return v * this.a / j.c.a;
    }

    public long e(long v) {
        return v * this.a / j.e.a;
    }

    public long f(long v) {
        return v * this.a / j.d.a;
    }

    public long g(long v) {
        return v * this.a / j.b.a;
    }
}

