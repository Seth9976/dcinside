package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class BoolValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder boolValue$Builder0) {
                L.p(boolValue$Builder0, "builder");
                return new Dsl(boolValue$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder boolValue$Builder0) {
            this._builder = boolValue$Builder0;
        }

        public Dsl(Builder boolValue$Builder0, w w0) {
            this(boolValue$Builder0);
        }

        @b0
        public final BoolValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (BoolValue)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @i(name = "getValue")
        public final boolean getValue() {
            return this._builder.getValue();
        }

        @i(name = "setValue")
        public final void setValue(boolean z) {
            this._builder.setValue(z);
        }
    }

    @l
    public static final BoolValueKt INSTANCE;

    static {
        BoolValueKt.INSTANCE = new BoolValueKt();
    }
}

