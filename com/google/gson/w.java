package com.google.gson;

import com.google.gson.internal.g;
import com.google.gson.stream.e;
import java.io.IOException;
import java.math.BigDecimal;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class w extends Enum implements x {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends w {
        a(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.x
        public Number a(com.google.gson.stream.a a0) throws IOException {
            return this.b(a0);
        }

        public Double b(com.google.gson.stream.a a0) throws IOException {
            return a0.w();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends w {
        b(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.x
        public Number a(com.google.gson.stream.a a0) throws IOException {
            return new g(a0.d0());
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class c extends w {
        c(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.x
        public Number a(com.google.gson.stream.a a0) throws IOException, n {
            String s = a0.d0();
            try {
                return Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                try {
                    Number number0 = Double.valueOf(s);
                    if((((Double)number0).isInfinite() || ((Double)number0).isNaN()) && !a0.q()) {
                        throw new e("JSON forbids NaN and infinities: " + number0 + "; at path " + a0.o());
                    }
                    return number0;
                }
                catch(NumberFormatException numberFormatException0) {
                }
                throw new n("Cannot parse " + s + "; at path " + a0.o(), numberFormatException0);
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class d extends w {
        d(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.x
        public Number a(com.google.gson.stream.a a0) throws IOException {
            return this.b(a0);
        }

        public BigDecimal b(com.google.gson.stream.a a0) throws IOException {
            String s = a0.d0();
            try {
                return new BigDecimal(s);
            }
            catch(NumberFormatException numberFormatException0) {
                throw new n("Cannot parse " + s + "; at path " + a0.o(), numberFormatException0);
            }
        }
    }

    public static final enum w a;
    public static final enum w b;
    public static final enum w c;
    public static final enum w d;
    private static final w[] e;

    static {
        a w$a0 = new a("DOUBLE", 0);
        w.a = w$a0;
        b w$b0 = new b("LAZILY_PARSED_NUMBER", 1);
        w.b = w$b0;
        c w$c0 = new c("LONG_OR_DOUBLE", 2);
        w.c = w$c0;
        d w$d0 = new d("BIG_DECIMAL", 3);
        w.d = w$d0;
        w.e = new w[]{w$a0, w$b0, w$c0, w$d0};
    }

    private w(String s, int v) {
        super(s, v);
    }

    w(String s, int v, a w$a0) {
        this(s, v);
    }

    public static w valueOf(String s) {
        return (w)Enum.valueOf(w.class, s);
    }

    public static w[] values() {
        return (w[])w.e.clone();
    }
}

