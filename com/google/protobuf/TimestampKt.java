package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TimestampKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder timestamp$Builder0) {
                L.p(timestamp$Builder0, "builder");
                return new Dsl(timestamp$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder timestamp$Builder0) {
            this._builder = timestamp$Builder0;
        }

        public Dsl(Builder timestamp$Builder0, w w0) {
            this(timestamp$Builder0);
        }

        @b0
        public final Timestamp _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Timestamp)generatedMessageLite0;
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
    public static final TimestampKt INSTANCE;

    static {
        TimestampKt.INSTANCE = new TimestampKt();
    }
}

