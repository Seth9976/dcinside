package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class RequestPolicyKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
                L.p(nativeConfigurationOuterClass$RequestPolicy$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$RequestPolicy$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
            this._builder = nativeConfigurationOuterClass$RequestPolicy$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$RequestPolicy$Builder0, w w0) {
            this(nativeConfigurationOuterClass$RequestPolicy$Builder0);
        }

        @b0
        public final RequestPolicy _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (RequestPolicy)generatedMessageLite0;
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        @l
        @i(name = "getRetryPolicy")
        public final RequestRetryPolicy getRetryPolicy() {
            RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0 = this._builder.getRetryPolicy();
            L.o(nativeConfigurationOuterClass$RequestRetryPolicy0, "_builder.getRetryPolicy()");
            return nativeConfigurationOuterClass$RequestRetryPolicy0;
        }

        @l
        @i(name = "getTimeoutPolicy")
        public final RequestTimeoutPolicy getTimeoutPolicy() {
            RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0 = this._builder.getTimeoutPolicy();
            L.o(nativeConfigurationOuterClass$RequestTimeoutPolicy0, "_builder.getTimeoutPolicy()");
            return nativeConfigurationOuterClass$RequestTimeoutPolicy0;
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        @i(name = "setRetryPolicy")
        public final void setRetryPolicy(@l RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestRetryPolicy0, "value");
            this._builder.setRetryPolicy(nativeConfigurationOuterClass$RequestRetryPolicy0);
        }

        @i(name = "setTimeoutPolicy")
        public final void setTimeoutPolicy(@l RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestTimeoutPolicy0, "value");
            this._builder.setTimeoutPolicy(nativeConfigurationOuterClass$RequestTimeoutPolicy0);
        }
    }

    @l
    public static final RequestPolicyKt INSTANCE;

    static {
        RequestPolicyKt.INSTANCE = new RequestPolicyKt();
    }
}

