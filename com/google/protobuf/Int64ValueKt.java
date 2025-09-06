package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class Int64ValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder int64Value$Builder0) {
                L.p(int64Value$Builder0, "builder");
                return new Dsl(int64Value$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder int64Value$Builder0) {
            this._builder = int64Value$Builder0;
        }

        public Dsl(Builder int64Value$Builder0, w w0) {
            this(int64Value$Builder0);
        }

        @b0
        public final Int64Value _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Int64Value)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @i(name = "getValue")
        public final long getValue() {
            return this._builder.getValue();
        }

        @i(name = "setValue")
        public final void setValue(long v) {
            this._builder.setValue(v);
        }
    }

    @l
    public static final Int64ValueKt INSTANCE;

    static {
        Int64ValueKt.INSTANCE = new Int64ValueKt();
    }
}

