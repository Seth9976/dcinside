package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class SourceContextKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder sourceContext$Builder0) {
                L.p(sourceContext$Builder0, "builder");
                return new Dsl(sourceContext$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder sourceContext$Builder0) {
            this._builder = sourceContext$Builder0;
        }

        public Dsl(Builder sourceContext$Builder0, w w0) {
            this(sourceContext$Builder0);
        }

        @b0
        public final SourceContext _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (SourceContext)generatedMessageLite0;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        @l
        @i(name = "getFileName")
        public final String getFileName() {
            String s = this._builder.getFileName();
            L.o(s, "_builder.getFileName()");
            return s;
        }

        @i(name = "setFileName")
        public final void setFileName(@l String s) {
            L.p(s, "value");
            this._builder.setFileName(s);
        }
    }

    @l
    public static final SourceContextKt INSTANCE;

    static {
        SourceContextKt.INSTANCE = new SourceContextKt();
    }
}

