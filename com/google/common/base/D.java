package com.google.common.base;

import J1.b;
import j..util.Objects;
import java.io.Serializable;

@b
@k
public abstract enum d {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends d {
        a(String s, int v, e e0, String s1) {
            super(e0, s1, null);
        }

        @Override  // com.google.common.base.d
        String c(d d0, String s) {
            if(d0 == d.d) {
                return s.replace('-', '_');
            }
            return d0 == d.g ? c.j(s.replace('-', '_')) : super.c(d0, s);
        }

        @Override  // com.google.common.base.d
        String g(String s) {
            return c.g(s);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.common.base.d.b extends d {
        com.google.common.base.d.b(String s, int v, e e0, String s1) {
            super(e0, s1, null);
        }

        @Override  // com.google.common.base.d
        String c(d d0, String s) {
            if(d0 == d.c) {
                return s.replace('_', '-');
            }
            return d0 == d.g ? c.j(s) : super.c(d0, s);
        }

        @Override  // com.google.common.base.d
        String g(String s) {
            return c.g(s);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.common.base.d.c extends d {
        com.google.common.base.d.c(String s, int v, e e0, String s1) {
            super(e0, s1, null);
        }

        @Override  // com.google.common.base.d
        String f(String s) {
            return c.g(s);
        }

        @Override  // com.google.common.base.d
        String g(String s) {
            return d.e(s);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.common.base.d.d extends d {
        com.google.common.base.d.d(String s, int v, e e0, String s1) {
            super(e0, s1, null);
        }

        @Override  // com.google.common.base.d
        String g(String s) {
            return d.e(s);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.common.base.d.e extends d {
        com.google.common.base.d.e(String s, int v, e e0, String s1) {
            super(e0, s1, null);
        }

        @Override  // com.google.common.base.d
        String c(d d0, String s) {
            if(d0 == d.c) {
                return c.g(s.replace('_', '-'));
            }
            return d0 == d.d ? c.g(s) : super.c(d0, s);
        }

        @Override  // com.google.common.base.d
        String g(String s) {
            return c.j(s);
        }
    }

    static final class f extends i implements Serializable {
        private final d c;
        private final d d;
        private static final long e;

        f(d d0, d d1) {
            this.c = (d)H.E(d0);
            this.d = (d)H.E(d1);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.base.i
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof f && this.c.equals(((f)object0).c) && this.d.equals(((f)object0).d);
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((String)object0));
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() ^ this.d.hashCode();
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(String s) {
            return this.d.h(this.c, s);
        }

        protected String p(String s) {
            return this.c.h(this.d, s);
        }

        @Override
        public String toString() {
            return this.c + ".converterTo(" + this.d + ")";
        }
    }

    LOWER_HYPHEN(new m('-'), "-") /* 警告！未生成枚举子类：com.google.common.base.d$a */,
    LOWER_UNDERSCORE(new m('_'), "_") /* 警告！未生成枚举子类：com.google.common.base.d$b */,
    LOWER_CAMEL(new com.google.common.base.e.k('A', 'Z'), "") /* 警告！未生成枚举子类：com.google.common.base.d$c */,
    UPPER_CAMEL(new com.google.common.base.e.k('A', 'Z'), "") /* 警告！未生成枚举子类：com.google.common.base.d$d */,
    UPPER_UNDERSCORE(new m('_'), "_") /* 警告！未生成枚举子类：com.google.common.base.d$e */;

    private final e a;
    private final String b;

    private d(e e0, String s1) {
        this.a = e0;
        this.b = s1;
    }

    private static d[] a() [...] // Inlined contents

    String c(d d0, String s) {
        StringBuilder stringBuilder0 = null;
        int v = 0;
        int v1 = -1;
        while(true) {
            v1 = this.a.o(s, v1 + 1);
            if(v1 == -1) {
                break;
            }
            if(v == 0) {
                stringBuilder0 = new StringBuilder(s.length() + d0.b.length() * 4);
                stringBuilder0.append(d0.f(s.substring(0, v1)));
            }
            else {
                Objects.requireNonNull(stringBuilder0);
                stringBuilder0.append(d0.g(s.substring(v, v1)));
            }
            stringBuilder0.append(d0.b);
            v = this.b.length() + v1;
        }
        if(v == 0) {
            return d0.f(s);
        }
        Objects.requireNonNull(stringBuilder0);
        stringBuilder0.append(d0.g(s.substring(v)));
        return stringBuilder0.toString();
    }

    public i d(d d0) {
        return new f(this, d0);
    }

    private static String e(String s) {
        return s.isEmpty() ? s : c.h(s.charAt(0)) + c.g(s.substring(1));
    }

    String f(String s) {
        return this.g(s);
    }

    abstract String g(String arg1);

    public final String h(d d0, String s) {
        H.E(d0);
        H.E(s);
        return d0 == this ? s : this.c(d0, s);
    }
}

