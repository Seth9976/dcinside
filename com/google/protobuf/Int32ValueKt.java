package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class Int32ValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder int32Value$Builder0) {
                L.p(int32Value$Builder0, "builder");
                return new Dsl(int32Value$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder int32Value$Builder0) {
            this._builder = int32Value$Builder0;
        }

        public Dsl(Builder int32Value$Builder0, w w0) {
            this(int32Value$Builder0);
        }

        @b0
        public final Int32Value _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Int32Value)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @i(name = "getValue")
        public final int getValue() {
            return this._builder.getValue();
        }

        @i(name = "setValue")
        public final void setValue(int v) {
            this._builder.setValue(v);
        }
    }

    @l
    public static final Int32ValueKt INSTANCE;

    static {
        Int32ValueKt.INSTANCE = new Int32ValueKt();
    }
}

