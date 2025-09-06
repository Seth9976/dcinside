package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class x {
    public static class d extends x implements Serializable {
        protected final x b;
        protected final x c;
        private static final long d = 1L;

        public d(x x0, x x1) {
            this.b = x0;
            this.c = x1;
        }

        @Override  // com.fasterxml.jackson.databind.util.x
        public String b(String s) {
            String s1 = this.b.b(s);
            return s1 == null ? null : this.c.b(s1);
        }

        @Override  // com.fasterxml.jackson.databind.util.x
        public String d(String s) {
            String s1 = this.c.d(s);
            return this.b.d(s1);
        }

        @Override
        public String toString() {
            return "[ChainedTransformer(" + this.b + ", " + this.c + ")]";
        }
    }

    public static final class e extends x implements Serializable {
        private static final long b = 1L;

        @Override  // com.fasterxml.jackson.databind.util.x
        public String b(String s) {
            return s;
        }

        @Override  // com.fasterxml.jackson.databind.util.x
        public String d(String s) {
            return s;
        }
    }

    public static final x a;

    static {
        x.a = new e();
    }

    public static x a(x x0, x x1) {
        return new d(x0, x1);
    }

    public abstract String b(String arg1);

    public static x c(String s, String s1) {
        static final class a extends x {
            final String b;
            final String c;

            a(String s, String s1) {
                this.b = s;
                this.c = s1;
                super();
            }

            @Override  // com.fasterxml.jackson.databind.util.x
            public String b(String s) {
                if(s.startsWith(this.b)) {
                    String s1 = s.substring(this.b.length());
                    return s1.endsWith(this.c) ? s1.substring(0, s1.length() - this.c.length()) : null;
                }
                return null;
            }

            @Override  // com.fasterxml.jackson.databind.util.x
            public String d(String s) {
                return this.b + s + this.c;
            }

            @Override
            public String toString() {
                return "[PreAndSuffixTransformer(\'" + this.b + "\',\'" + this.c + "\')]";
            }
        }


        static final class b extends x {
            final String b;

            b(String s) {
                this.b = s;
                super();
            }

            // 去混淆评级： 低(20)
            @Override  // com.fasterxml.jackson.databind.util.x
            public String b(String s) {
                return s.startsWith(this.b) ? s.substring(this.b.length()) : null;
            }

            @Override  // com.fasterxml.jackson.databind.util.x
            public String d(String s) {
                return this.b + s;
            }

            @Override
            public String toString() {
                return "[PrefixTransformer(\'" + this.b + "\')]";
            }
        }


        static final class c extends x {
            final String b;

            c(String s) {
                this.b = s;
                super();
            }

            // 去混淆评级： 低(20)
            @Override  // com.fasterxml.jackson.databind.util.x
            public String b(String s) {
                return s.endsWith(this.b) ? s.substring(0, s.length() - this.b.length()) : null;
            }

            @Override  // com.fasterxml.jackson.databind.util.x
            public String d(String s) {
                return s + this.b;
            }

            @Override
            public String toString() {
                return "[SuffixTransformer(\'" + this.b + "\')]";
            }
        }

        boolean z = false;
        boolean z1 = s != null && !s.isEmpty();
        if(s1 != null && !s1.isEmpty()) {
            z = true;
        }
        if(z1) {
            return z ? new a(s, s1) : new b(s);
        }
        return z ? new c(s1) : x.a;
    }

    public abstract String d(String arg1);
}

