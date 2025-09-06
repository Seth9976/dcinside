package com.google.firebase.sessions.api;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface b {
    public static enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;

        private static final a[] a() [...] // Inlined contents
    }

    public static final class com.google.firebase.sessions.api.b.b {
        @l
        private final String a;

        public com.google.firebase.sessions.api.b.b(@l String s) {
            L.p(s, "sessionId");
            super();
            this.a = s;
        }

        @l
        public final String a() {
            return this.a;
        }

        @l
        public final com.google.firebase.sessions.api.b.b b(@l String s) {
            L.p(s, "sessionId");
            return new com.google.firebase.sessions.api.b.b(s);
        }

        public static com.google.firebase.sessions.api.b.b c(com.google.firebase.sessions.api.b.b b$b0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = b$b0.a;
            }
            return b$b0.b(s);
        }

        @l
        public final String d() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof com.google.firebase.sessions.api.b.b ? L.g(this.a, ((com.google.firebase.sessions.api.b.b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "SessionDetails(sessionId=" + this.a + ')';
        }
    }

    boolean a();

    @l
    a b();

    void c(@l com.google.firebase.sessions.api.b.b arg1);
}

