package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class RequestRetryPolicyKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0) {
                L.p(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0) {
            this._builder = nativeConfigurationOuterClass$RequestRetryPolicy$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0, w w0) {
            this(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0);
        }

        @b0
        public final RequestRetryPolicy _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (RequestRetryPolicy)generatedMessageLite0;
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }

        @i(name = "getMaxDuration")
        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        @i(name = "getRetryJitterPct")
        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        @i(name = "getRetryMaxInterval")
        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        @i(name = "getRetryScalingFactor")
        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        @i(name = "getRetryWaitBase")
        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        @i(name = "getShouldStoreLocally")
        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        @i(name = "setMaxDuration")
        public final void setMaxDuration(int v) {
            this._builder.setMaxDuration(v);
        }

        @i(name = "setRetryJitterPct")
        public final void setRetryJitterPct(float f) {
            this._builder.setRetryJitterPct(f);
        }

        @i(name = "setRetryMaxInterval")
        public final void setRetryMaxInterval(int v) {
            this._builder.setRetryMaxInterval(v);
        }

        @i(name = "setRetryScalingFactor")
        public final void setRetryScalingFactor(float f) {
            this._builder.setRetryScalingFactor(f);
        }

        @i(name = "setRetryWaitBase")
        public final void setRetryWaitBase(int v) {
            this._builder.setRetryWaitBase(v);
        }

        @i(name = "setShouldStoreLocally")
        public final void setShouldStoreLocally(boolean z) {
            this._builder.setShouldStoreLocally(z);
        }
    }

    @l
    public static final RequestRetryPolicyKt INSTANCE;

    static {
        RequestRetryPolicyKt.INSTANCE = new RequestRetryPolicyKt();
    }
}

