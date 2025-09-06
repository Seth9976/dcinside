package com.facebook.imagepipeline.systrace;

import android.os.Trace;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

public final class a implements c {
    @s0({"SMAP\nDefaultFrescoSystrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/DefaultFrescoSystrace$DefaultArgsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    static final class com.facebook.imagepipeline.systrace.a.a implements com.facebook.imagepipeline.systrace.b.a {
        @l
        private final StringBuilder a;

        public com.facebook.imagepipeline.systrace.a.a(@l String s) {
            L.p(s, "name");
            super();
            this.a = new StringBuilder(s);
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public com.facebook.imagepipeline.systrace.b.a a(String s, long v) {
            return this.h(s, v);
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public com.facebook.imagepipeline.systrace.b.a b(String s, int v) {
            return this.g(s, v);
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public com.facebook.imagepipeline.systrace.b.a c(String s, double f) {
            return this.f(s, f);
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public com.facebook.imagepipeline.systrace.b.a d(String s, Object object0) {
            return this.i(s, object0);
        }

        private final StringBuilder e(String s, Object object0) {
            this.a.append(';');
            this.a.append(s + "=" + object0);
            return this.a;
        }

        @l
        public com.facebook.imagepipeline.systrace.a.a f(@l String s, double f) {
            L.p(s, "key");
            this.e(s, f);
            return this;
        }

        @Override  // com.facebook.imagepipeline.systrace.b$a
        public void flush() {
            if(this.a.length() > 0x7F) {
                this.a.setLength(0x7F);
            }
            Trace.beginSection(this.a.toString());
        }

        @l
        public com.facebook.imagepipeline.systrace.a.a g(@l String s, int v) {
            L.p(s, "key");
            this.e(s, v);
            return this;
        }

        @l
        public com.facebook.imagepipeline.systrace.a.a h(@l String s, long v) {
            L.p(s, "key");
            this.e(s, v);
            return this;
        }

        @l
        public com.facebook.imagepipeline.systrace.a.a i(@l String s, @l Object object0) {
            L.p(s, "key");
            L.p(object0, "value");
            this.e(s, object0);
            return this;
        }
    }

    @Override  // com.facebook.imagepipeline.systrace.b$c
    public void a(@l String s) {
        L.p(s, "name");
    }

    @Override  // com.facebook.imagepipeline.systrace.b$c
    public void b() {
    }

    @Override  // com.facebook.imagepipeline.systrace.b$c
    @l
    public com.facebook.imagepipeline.systrace.b.a c(@l String s) {
        L.p(s, "name");
        return b.b;
    }

    @Override  // com.facebook.imagepipeline.systrace.b$c
    public boolean isTracing() [...] // Inlined contents
}

