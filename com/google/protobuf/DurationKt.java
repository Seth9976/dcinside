package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class DurationKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder duration$Builder0) {
                L.p(duration$Builder0, "builder");
                return new Dsl(duration$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder duration$Builder0) {
            this._builder = duration$Builder0;
        }

        public Dsl(Builder duration$Builder0, w w0) {
            this(duration$Builder0);
        }

        @b0
        public final Duration _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Duration)generatedMessageLite0;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        @i(name = "getNanos")
        public final int getNanos() {
            return this._builder.getNanos();
        }

        @i(name = "getSeconds")
        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        @i(name = "setNanos")
        public final void setNanos(int v) {
            this._builder.setNanos(v);
        }

        @i(name = "setSeconds")
        public final void setSeconds(long v) {
            this._builder.setSeconds(v);
        }
    }

    @l
    public static final DurationKt INSTANCE;

    static {
        DurationKt.INSTANCE = new DurationKt();
    }
}

