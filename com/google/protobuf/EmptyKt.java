package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class EmptyKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder empty$Builder0) {
                L.p(empty$Builder0, "builder");
                return new Dsl(empty$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder empty$Builder0) {
            this._builder = empty$Builder0;
        }

        public Dsl(Builder empty$Builder0, w w0) {
            this(empty$Builder0);
        }

        @b0
        public final Empty _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Empty)generatedMessageLite0;
        }
    }

    @l
    public static final EmptyKt INSTANCE;

    static {
        EmptyKt.INSTANCE = new EmptyKt();
    }
}

