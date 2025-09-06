package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class InitializationDataKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationDataOuterClass$InitializationData$Builder0) {
                L.p(initializationDataOuterClass$InitializationData$Builder0, "builder");
                return new Dsl(initializationDataOuterClass$InitializationData$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationDataOuterClass$InitializationData$Builder0) {
            this._builder = initializationDataOuterClass$InitializationData$Builder0;
        }

        public Dsl(Builder initializationDataOuterClass$InitializationData$Builder0, w w0) {
            this(initializationDataOuterClass$InitializationData$Builder0);
        }

        @b0
        public final InitializationData _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (InitializationData)generatedMessageLite0;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @l
        @i(name = "getInitializationRequest")
        public final InitializationRequest getInitializationRequest() {
            InitializationRequest initializationRequestOuterClass$InitializationRequest0 = this._builder.getInitializationRequest();
            L.o(initializationRequestOuterClass$InitializationRequest0, "_builder.getInitializationRequest()");
            return initializationRequestOuterClass$InitializationRequest0;
        }

        @m
        public final InitializationRequest getInitializationRequestOrNull(@l Dsl initializationDataKt$Dsl0) {
            L.p(initializationDataKt$Dsl0, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(initializationDataKt$Dsl0._builder);
        }

        @l
        @i(name = "getSharedData")
        public final SharedData getSharedData() {
            SharedData universalRequestOuterClass$UniversalRequest$SharedData0 = this._builder.getSharedData();
            L.o(universalRequestOuterClass$UniversalRequest$SharedData0, "_builder.getSharedData()");
            return universalRequestOuterClass$UniversalRequest$SharedData0;
        }

        @m
        public final SharedData getSharedDataOrNull(@l Dsl initializationDataKt$Dsl0) {
            L.p(initializationDataKt$Dsl0, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(initializationDataKt$Dsl0._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        @i(name = "setInitializationRequest")
        public final void setInitializationRequest(@l InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
            L.p(initializationRequestOuterClass$InitializationRequest0, "value");
            this._builder.setInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
        }

        @i(name = "setSharedData")
        public final void setSharedData(@l SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            L.p(universalRequestOuterClass$UniversalRequest$SharedData0, "value");
            this._builder.setSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
        }
    }

    @l
    public static final InitializationDataKt INSTANCE;

    static {
        InitializationDataKt.INSTANCE = new InitializationDataKt();
    }
}

