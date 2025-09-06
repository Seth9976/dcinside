package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
public @interface u {
    public static enum com.fasterxml.jackson.annotation.u.a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS;

    }

    public static class b implements com.fasterxml.jackson.annotation.b, Serializable {
        protected final com.fasterxml.jackson.annotation.u.a a;
        protected final com.fasterxml.jackson.annotation.u.a b;
        protected final Class c;
        protected final Class d;
        private static final long e = 1L;
        protected static final b f;

        static {
            b.f = new b(com.fasterxml.jackson.annotation.u.a.g, com.fasterxml.jackson.annotation.u.a.g, null, null);
        }

        protected b(com.fasterxml.jackson.annotation.u.a u$a0, com.fasterxml.jackson.annotation.u.a u$a1, Class class0, Class class1) {
            if(u$a0 == null) {
                u$a0 = com.fasterxml.jackson.annotation.u.a.g;
            }
            this.a = u$a0;
            if(u$a1 == null) {
                u$a1 = com.fasterxml.jackson.annotation.u.a.g;
            }
            this.b = u$a1;
            Class class2 = Void.class;
            if(class0 == class2) {
                class0 = null;
            }
            this.c = class0;
            if(class1 == class2) {
                class1 = null;
            }
            this.d = class1;
        }

        public b(u u0) {
            this(u0.value(), u0.content(), u0.valueFilter(), u0.contentFilter());
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return u.class;
        }

        // 去混淆评级： 低(20)
        public static b b(com.fasterxml.jackson.annotation.u.a u$a0, com.fasterxml.jackson.annotation.u.a u$a1) {
            return (u$a0 == com.fasterxml.jackson.annotation.u.a.g || u$a0 == null) && (u$a1 == com.fasterxml.jackson.annotation.u.a.g || u$a1 == null) ? b.f : new b(u$a0, u$a1, null, null);
        }

        public static b c(com.fasterxml.jackson.annotation.u.a u$a0, com.fasterxml.jackson.annotation.u.a u$a1, Class class0, Class class1) {
            Class class2 = Void.class;
            if(class0 == class2) {
                class0 = null;
            }
            if(class1 == class2) {
                class1 = null;
            }
            return u$a0 != com.fasterxml.jackson.annotation.u.a.g && u$a0 != null || u$a1 != com.fasterxml.jackson.annotation.u.a.g && u$a1 != null || class0 != null || class1 != null ? new b(u$a0, u$a1, class0, class1) : b.f;
        }

        public static b d() {
            return b.f;
        }

        public static b e(u u0) {
            if(u0 == null) {
                return b.f;
            }
            com.fasterxml.jackson.annotation.u.a u$a0 = u0.value();
            com.fasterxml.jackson.annotation.u.a u$a1 = u0.content();
            if(u$a0 == com.fasterxml.jackson.annotation.u.a.g && u$a1 == com.fasterxml.jackson.annotation.u.a.g) {
                return b.f;
            }
            Class class0 = u0.valueFilter();
            Class class1 = null;
            Class class2 = Void.class;
            if(class0 == class2) {
                class0 = null;
            }
            Class class3 = u0.contentFilter();
            if(class3 != class2) {
                class1 = class3;
            }
            return new b(u$a0, u$a1, class0, class1);
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            return object0.getClass() == this.getClass() ? ((b)object0).a == this.a && ((b)object0).b == this.b && ((b)object0).c == this.c && ((b)object0).d == this.d : false;
        }

        public Class f() {
            return this.d;
        }

        public com.fasterxml.jackson.annotation.u.a g() {
            return this.b;
        }

        public Class h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() << 2) + this.b.hashCode();
        }

        public com.fasterxml.jackson.annotation.u.a i() {
            return this.a;
        }

        public static b j(b u$b0, b u$b1) {
            return u$b0 == null ? u$b1 : u$b0.o(u$b1);
        }

        public static b k(b[] arr_u$b) {
            b u$b0 = null;
            for(int v = 0; v < arr_u$b.length; ++v) {
                b u$b1 = arr_u$b[v];
                if(u$b1 != null) {
                    if(u$b0 != null) {
                        u$b1 = u$b0.o(u$b1);
                    }
                    u$b0 = u$b1;
                }
            }
            return u$b0;
        }

        protected Object l() {
            return this.a != com.fasterxml.jackson.annotation.u.a.g || this.b != com.fasterxml.jackson.annotation.u.a.g || this.c != null || this.d != null ? this : b.f;
        }

        public b m(Class class0) {
            return class0 == null || class0 == Void.class ? b.c(this.a, com.fasterxml.jackson.annotation.u.a.g, this.c, null) : b.c(this.a, com.fasterxml.jackson.annotation.u.a.f, this.c, class0);
        }

        public b n(com.fasterxml.jackson.annotation.u.a u$a0) {
            return u$a0 == this.b ? this : new b(this.a, u$a0, this.c, this.d);
        }

        public b o(b u$b0) {
            if(u$b0 != null && u$b0 != b.f) {
                com.fasterxml.jackson.annotation.u.a u$a0 = u$b0.a;
                com.fasterxml.jackson.annotation.u.a u$a1 = u$b0.b;
                Class class0 = u$b0.c;
                Class class1 = u$b0.d;
                com.fasterxml.jackson.annotation.u.a u$a2 = this.a;
                boolean z = false;
                boolean z1 = u$a0 != u$a2 && u$a0 != com.fasterxml.jackson.annotation.u.a.g;
                com.fasterxml.jackson.annotation.u.a u$a3 = this.b;
                boolean z2 = u$a1 != u$a3 && u$a1 != com.fasterxml.jackson.annotation.u.a.g;
                if(class0 != this.c || class1 != this.c) {
                    z = true;
                }
                if(z1) {
                    return z2 ? new b(u$a0, u$a1, class0, class1) : new b(u$a0, u$a3, class0, class1);
                }
                if(z2) {
                    return new b(u$a2, u$a1, class0, class1);
                }
                return z ? new b(u$a2, u$a3, class0, class1) : this;
            }
            return this;
        }

        public b p(Class class0) {
            return class0 == null || class0 == Void.class ? b.c(com.fasterxml.jackson.annotation.u.a.g, this.b, null, this.d) : b.c(com.fasterxml.jackson.annotation.u.a.f, this.b, class0, this.d);
        }

        public b q(com.fasterxml.jackson.annotation.u.a u$a0) {
            return u$a0 == this.a ? this : new b(u$a0, this.b, this.c, this.d);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(80);
            stringBuilder0.append("JsonInclude.Value(value=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(",content=");
            stringBuilder0.append(this.b);
            if(this.c != null) {
                stringBuilder0.append(",valueFilter=");
                stringBuilder0.append(this.c.getName());
                stringBuilder0.append(".class");
            }
            if(this.d != null) {
                stringBuilder0.append(",contentFilter=");
                stringBuilder0.append(this.d.getName());
                stringBuilder0.append(".class");
            }
            stringBuilder0.append(')');
            return stringBuilder0.toString();
        }
    }

    com.fasterxml.jackson.annotation.u.a content() default com.fasterxml.jackson.annotation.u.a.a;

    Class contentFilter() default Void.class;

    com.fasterxml.jackson.annotation.u.a value() default com.fasterxml.jackson.annotation.u.a.a;

    Class valueFilter() default Void.class;
}

