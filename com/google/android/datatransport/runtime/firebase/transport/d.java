package com.google.android.datatransport.runtime.firebase.transport;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public static final class a {
        private String a;
        private List b;

        a() {
            this.a = "";
            this.b = new ArrayList();
        }

        public a a(c c0) {
            this.b.add(c0);
            return this;
        }

        public d b() {
            return new d(this.a, DesugarCollections.unmodifiableList(this.b));
        }

        public a c(List list0) {
            this.b = list0;
            return this;
        }

        public a d(String s) {
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final List b;
    private static final d c;

    static {
        d.c = new a().b();
    }

    d(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    public static d a() {
        return d.c;
    }

    @c2.a.a(name = "logEventDropped")
    @com.google.firebase.encoders.proto.d(tag = 2)
    public List b() {
        return this.b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public String c() {
        return this.a;
    }

    public static a d() {
        return new a();
    }
}

