package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class BytesValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder bytesValue$Builder0) {
                L.p(bytesValue$Builder0, "builder");
                return new Dsl(bytesValue$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder bytesValue$Builder0) {
            this._builder = bytesValue$Builder0;
        }

        public Dsl(Builder bytesValue$Builder0, w w0) {
            this(bytesValue$Builder0);
        }

        @b0
        public final BytesValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (BytesValue)generatedMessageLite0;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getValue")
        public final ByteString getValue() {
            ByteString byteString0 = this._builder.getValue();
            L.o(byteString0, "_builder.getValue()");
            return byteString0;
        }

        @i(name = "setValue")
        public final void setValue(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setValue(byteString0);
        }
    }

    @l
    public static final BytesValueKt INSTANCE;

    static {
        BytesValueKt.INSTANCE = new BytesValueKt();
    }
}

