package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class FloatValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder floatValue$Builder0) {
                L.p(floatValue$Builder0, "builder");
                return new Dsl(floatValue$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder floatValue$Builder0) {
            this._builder = floatValue$Builder0;
        }

        public Dsl(Builder floatValue$Builder0, w w0) {
            this(floatValue$Builder0);
        }

        @b0
        public final FloatValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (FloatValue)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @i(name = "getValue")
        public final float getValue() {
            return this._builder.getValue();
        }

        @i(name = "setValue")
        public final void setValue(float f) {
            this._builder.setValue(f);
        }
    }

    @l
    public static final FloatValueKt INSTANCE;

    static {
        FloatValueKt.INSTANCE = new FloatValueKt();
    }
}

