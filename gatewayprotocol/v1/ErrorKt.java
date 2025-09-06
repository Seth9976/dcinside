package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class ErrorKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder errorOuterClass$Error$Builder0) {
                L.p(errorOuterClass$Error$Builder0, "builder");
                return new Dsl(errorOuterClass$Error$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder errorOuterClass$Error$Builder0) {
            this._builder = errorOuterClass$Error$Builder0;
        }

        public Dsl(Builder errorOuterClass$Error$Builder0, w w0) {
            this(errorOuterClass$Error$Builder0);
        }

        @b0
        public final Error _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Error)generatedMessageLite0;
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        @l
        @i(name = "getErrorText")
        public final String getErrorText() {
            String s = this._builder.getErrorText();
            L.o(s, "_builder.getErrorText()");
            return s;
        }

        @i(name = "setErrorText")
        public final void setErrorText(@l String s) {
            L.p(s, "value");
            this._builder.setErrorText(s);
        }
    }

    @l
    public static final ErrorKt INSTANCE;

    static {
        ErrorKt.INSTANCE = new ErrorKt();
    }
}

