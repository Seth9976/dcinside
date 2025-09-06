package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class AdOperationsConfigurationKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0) {
                L.p(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0) {
            this._builder = nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0, w w0) {
            this(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0);
        }

        @b0
        public final AdOperationsConfiguration _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdOperationsConfiguration)generatedMessageLite0;
        }

        public final void clearGetTokenTimeoutMs() {
            this._builder.clearGetTokenTimeoutMs();
        }

        public final void clearLoadTimeoutMs() {
            this._builder.clearLoadTimeoutMs();
        }

        public final void clearShowTimeoutMs() {
            this._builder.clearShowTimeoutMs();
        }

        @i(name = "getGetTokenTimeoutMs")
        public final int getGetTokenTimeoutMs() {
            return this._builder.getGetTokenTimeoutMs();
        }

        @i(name = "getLoadTimeoutMs")
        public final int getLoadTimeoutMs() {
            return this._builder.getLoadTimeoutMs();
        }

        @i(name = "getShowTimeoutMs")
        public final int getShowTimeoutMs() {
            return this._builder.getShowTimeoutMs();
        }

        @i(name = "setGetTokenTimeoutMs")
        public final void setGetTokenTimeoutMs(int v) {
            this._builder.setGetTokenTimeoutMs(v);
        }

        @i(name = "setLoadTimeoutMs")
        public final void setLoadTimeoutMs(int v) {
            this._builder.setLoadTimeoutMs(v);
        }

        @i(name = "setShowTimeoutMs")
        public final void setShowTimeoutMs(int v) {
            this._builder.setShowTimeoutMs(v);
        }
    }

    @l
    public static final AdOperationsConfigurationKt INSTANCE;

    static {
        AdOperationsConfigurationKt.INSTANCE = new AdOperationsConfigurationKt();
    }
}

