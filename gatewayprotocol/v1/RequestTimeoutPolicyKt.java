package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class RequestTimeoutPolicyKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0) {
                L.p(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0) {
            this._builder = nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0, w w0) {
            this(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0);
        }

        @b0
        public final RequestTimeoutPolicy _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (RequestTimeoutPolicy)generatedMessageLite0;
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        @i(name = "getConnectTimeoutMs")
        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        @i(name = "getOverallTimeoutMs")
        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        @i(name = "getReadTimeoutMs")
        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        @i(name = "getWriteTimeoutMs")
        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        @i(name = "setConnectTimeoutMs")
        public final void setConnectTimeoutMs(int v) {
            this._builder.setConnectTimeoutMs(v);
        }

        @i(name = "setOverallTimeoutMs")
        public final void setOverallTimeoutMs(int v) {
            this._builder.setOverallTimeoutMs(v);
        }

        @i(name = "setReadTimeoutMs")
        public final void setReadTimeoutMs(int v) {
            this._builder.setReadTimeoutMs(v);
        }

        @i(name = "setWriteTimeoutMs")
        public final void setWriteTimeoutMs(int v) {
            this._builder.setWriteTimeoutMs(v);
        }
    }

    @l
    public static final RequestTimeoutPolicyKt INSTANCE;

    static {
        RequestTimeoutPolicyKt.INSTANCE = new RequestTimeoutPolicyKt();
    }
}

