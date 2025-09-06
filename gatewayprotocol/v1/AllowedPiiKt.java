package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class AllowedPiiKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder allowedPiiOuterClass$AllowedPii$Builder0) {
                L.p(allowedPiiOuterClass$AllowedPii$Builder0, "builder");
                return new Dsl(allowedPiiOuterClass$AllowedPii$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder allowedPiiOuterClass$AllowedPii$Builder0) {
            this._builder = allowedPiiOuterClass$AllowedPii$Builder0;
        }

        public Dsl(Builder allowedPiiOuterClass$AllowedPii$Builder0, w w0) {
            this(allowedPiiOuterClass$AllowedPii$Builder0);
        }

        @b0
        public final AllowedPii _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AllowedPii)generatedMessageLite0;
        }

        public final void clearIdfa() {
            this._builder.clearIdfa();
        }

        public final void clearIdfv() {
            this._builder.clearIdfv();
        }

        @i(name = "getIdfa")
        public final boolean getIdfa() {
            return this._builder.getIdfa();
        }

        @i(name = "getIdfv")
        public final boolean getIdfv() {
            return this._builder.getIdfv();
        }

        @i(name = "setIdfa")
        public final void setIdfa(boolean z) {
            this._builder.setIdfa(z);
        }

        @i(name = "setIdfv")
        public final void setIdfv(boolean z) {
            this._builder.setIdfv(z);
        }
    }

    @l
    public static final AllowedPiiKt INSTANCE;

    static {
        AllowedPiiKt.INSTANCE = new AllowedPiiKt();
    }
}

