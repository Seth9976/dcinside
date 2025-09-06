package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class AnyKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder any$Builder0) {
                L.p(any$Builder0, "builder");
                return new Dsl(any$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder any$Builder0) {
            this._builder = any$Builder0;
        }

        public Dsl(Builder any$Builder0, w w0) {
            this(any$Builder0);
        }

        @b0
        public final Any _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Any)generatedMessageLite0;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getTypeUrl")
        public final String getTypeUrl() {
            String s = this._builder.getTypeUrl();
            L.o(s, "_builder.getTypeUrl()");
            return s;
        }

        @l
        @i(name = "getValue")
        public final ByteString getValue() {
            ByteString byteString0 = this._builder.getValue();
            L.o(byteString0, "_builder.getValue()");
            return byteString0;
        }

        @i(name = "setTypeUrl")
        public final void setTypeUrl(@l String s) {
            L.p(s, "value");
            this._builder.setTypeUrl(s);
        }

        @i(name = "setValue")
        public final void setValue(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setValue(byteString0);
        }
    }

    @l
    public static final AnyKt INSTANCE;

    static {
        AnyKt.INSTANCE = new AnyKt();
    }
}

