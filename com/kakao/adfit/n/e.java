package com.kakao.adfit.n;

import java.util.List;
import kotlin.jvm.internal.L;

public final class e {
    public static final class a {
        private String a;
        private List b;
        private List c;
        private String d;

        public final a a(String s) {
            this.a = s;
            return this;
        }

        public final a a(List list0) {
            this.b = list0;
            return this;
        }

        public final e a() {
            return new e(this.a, this.b, this.c, this.d);
        }

        public final a b(String s) {
            this.d = s;
            return this;
        }

        public final a b(List list0) {
            this.c = list0;
            return this;
        }
    }

    private final String a;
    private final List b;
    private final List c;
    private final String d;

    public e(String s, List list0, List list1, String s1) {
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = s1;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((e)object0).b)) {
            return false;
        }
        return L.g(this.c, ((e)object0).c) ? L.g(this.d, ((e)object0).d) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "VastModel(duration=" + this.a + ", mediaFiles=" + this.b + ", trackings=" + this.c + ", errorUrl=" + this.d + ')';
    }
}

