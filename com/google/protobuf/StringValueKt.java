package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class StringValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder stringValue$Builder0) {
                L.p(stringValue$Builder0, "builder");
                return new Dsl(stringValue$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder stringValue$Builder0) {
            this._builder = stringValue$Builder0;
        }

        public Dsl(Builder stringValue$Builder0, w w0) {
            this(stringValue$Builder0);
        }

        @b0
        public final StringValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (StringValue)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getValue")
        public final String getValue() {
            String s = this._builder.getValue();
            L.o(s, "_builder.getValue()");
            return s;
        }

        @i(name = "setValue")
        public final void setValue(@l String s) {
            L.p(s, "value");
            this._builder.setValue(s);
        }
    }

    @l
    public static final StringValueKt INSTANCE;

    static {
        StringValueKt.INSTANCE = new StringValueKt();
    }
}

