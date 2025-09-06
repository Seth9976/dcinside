package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nUniversalResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalResponseKt.kt\ngatewayprotocol/v1/UniversalResponseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class UniversalResponseKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder universalResponseOuterClass$UniversalResponse$Builder0) {
                L.p(universalResponseOuterClass$UniversalResponse$Builder0, "builder");
                return new Dsl(universalResponseOuterClass$UniversalResponse$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder universalResponseOuterClass$UniversalResponse$Builder0) {
            this._builder = universalResponseOuterClass$UniversalResponse$Builder0;
        }

        public Dsl(Builder universalResponseOuterClass$UniversalResponse$Builder0, w w0) {
            this(universalResponseOuterClass$UniversalResponse$Builder0);
        }

        @b0
        public final UniversalResponse _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (UniversalResponse)generatedMessageLite0;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        @l
        @i(name = "getError")
        public final Error getError() {
            Error errorOuterClass$Error0 = this._builder.getError();
            L.o(errorOuterClass$Error0, "_builder.getError()");
            return errorOuterClass$Error0;
        }

        @m
        public final Error getErrorOrNull(@l Dsl universalResponseKt$Dsl0) {
            L.p(universalResponseKt$Dsl0, "<this>");
            return UniversalResponseKtKt.getErrorOrNull(universalResponseKt$Dsl0._builder);
        }

        @l
        @i(name = "getMutableData")
        public final MutableData getMutableData() {
            MutableData mutableDataOuterClass$MutableData0 = this._builder.getMutableData();
            L.o(mutableDataOuterClass$MutableData0, "_builder.getMutableData()");
            return mutableDataOuterClass$MutableData0;
        }

        @m
        public final MutableData getMutableDataOrNull(@l Dsl universalResponseKt$Dsl0) {
            L.p(universalResponseKt$Dsl0, "<this>");
            return UniversalResponseKtKt.getMutableDataOrNull(universalResponseKt$Dsl0._builder);
        }

        @l
        @i(name = "getPayload")
        public final Payload getPayload() {
            Payload universalResponseOuterClass$UniversalResponse$Payload0 = this._builder.getPayload();
            L.o(universalResponseOuterClass$UniversalResponse$Payload0, "_builder.getPayload()");
            return universalResponseOuterClass$UniversalResponse$Payload0;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        @i(name = "setError")
        public final void setError(@l Error errorOuterClass$Error0) {
            L.p(errorOuterClass$Error0, "value");
            this._builder.setError(errorOuterClass$Error0);
        }

        @i(name = "setMutableData")
        public final void setMutableData(@l MutableData mutableDataOuterClass$MutableData0) {
            L.p(mutableDataOuterClass$MutableData0, "value");
            this._builder.setMutableData(mutableDataOuterClass$MutableData0);
        }

        @i(name = "setPayload")
        public final void setPayload(@l Payload universalResponseOuterClass$UniversalResponse$Payload0) {
            L.p(universalResponseOuterClass$UniversalResponse$Payload0, "value");
            this._builder.setPayload(universalResponseOuterClass$UniversalResponse$Payload0);
        }
    }

    public static final class PayloadKt {
        @ProtoDslMarker
        public static final class gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl {
            public static final class gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion {
                private gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion() {
                }

                public gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion(w w0) {
                }

                @b0
                public final gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl _create(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder universalResponseOuterClass$UniversalResponse$Payload$Builder0) {
                    L.p(universalResponseOuterClass$UniversalResponse$Payload$Builder0, "builder");
                    return new gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl(universalResponseOuterClass$UniversalResponse$Payload$Builder0, null);
                }
            }

            @l
            public static final gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion Companion;
            @l
            private final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            static {
                gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion = new gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion(null);
            }

            private gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder universalResponseOuterClass$UniversalResponse$Payload$Builder0) {
                this._builder = universalResponseOuterClass$UniversalResponse$Payload$Builder0;
            }

            public gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder universalResponseOuterClass$UniversalResponse$Payload$Builder0, w w0) {
                this(universalResponseOuterClass$UniversalResponse$Payload$Builder0);
            }

            @b0
            public final Payload _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Payload)generatedMessageLite0;
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @l
            @i(name = "getAdDataRefreshResponse")
            public final AdDataRefreshResponse getAdDataRefreshResponse() {
                AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0 = this._builder.getAdDataRefreshResponse();
                L.o(adDataRefreshResponseOuterClass$AdDataRefreshResponse0, "_builder.getAdDataRefreshResponse()");
                return adDataRefreshResponseOuterClass$AdDataRefreshResponse0;
            }

            @l
            @i(name = "getAdPlayerConfigResponse")
            public final AdPlayerConfigResponse getAdPlayerConfigResponse() {
                AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0 = this._builder.getAdPlayerConfigResponse();
                L.o(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0, "_builder.getAdPlayerConfigResponse()");
                return adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0;
            }

            @l
            @i(name = "getAdResponse")
            public final AdResponse getAdResponse() {
                AdResponse adResponseOuterClass$AdResponse0 = this._builder.getAdResponse();
                L.o(adResponseOuterClass$AdResponse0, "_builder.getAdResponse()");
                return adResponseOuterClass$AdResponse0;
            }

            @l
            @i(name = "getInitializationResponse")
            public final InitializationResponse getInitializationResponse() {
                InitializationResponse initializationResponseOuterClass$InitializationResponse0 = this._builder.getInitializationResponse();
                L.o(initializationResponseOuterClass$InitializationResponse0, "_builder.getInitializationResponse()");
                return initializationResponseOuterClass$InitializationResponse0;
            }

            @l
            @i(name = "getPrivacyUpdateResponse")
            public final PrivacyUpdateResponse getPrivacyUpdateResponse() {
                PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0 = this._builder.getPrivacyUpdateResponse();
                L.o(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0, "_builder.getPrivacyUpdateResponse()");
                return privacyUpdateResponseOuterClass$PrivacyUpdateResponse0;
            }

            @l
            @i(name = "getValueCase")
            public final ValueCase getValueCase() {
                ValueCase universalResponseOuterClass$UniversalResponse$Payload$ValueCase0 = this._builder.getValueCase();
                L.o(universalResponseOuterClass$UniversalResponse$Payload$ValueCase0, "_builder.getValueCase()");
                return universalResponseOuterClass$UniversalResponse$Payload$ValueCase0;
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            @i(name = "setAdDataRefreshResponse")
            public final void setAdDataRefreshResponse(@l AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
                L.p(adDataRefreshResponseOuterClass$AdDataRefreshResponse0, "value");
                this._builder.setAdDataRefreshResponse(adDataRefreshResponseOuterClass$AdDataRefreshResponse0);
            }

            @i(name = "setAdPlayerConfigResponse")
            public final void setAdPlayerConfigResponse(@l AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
                L.p(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0, "value");
                this._builder.setAdPlayerConfigResponse(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0);
            }

            @i(name = "setAdResponse")
            public final void setAdResponse(@l AdResponse adResponseOuterClass$AdResponse0) {
                L.p(adResponseOuterClass$AdResponse0, "value");
                this._builder.setAdResponse(adResponseOuterClass$AdResponse0);
            }

            @i(name = "setInitializationResponse")
            public final void setInitializationResponse(@l InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
                L.p(initializationResponseOuterClass$InitializationResponse0, "value");
                this._builder.setInitializationResponse(initializationResponseOuterClass$InitializationResponse0);
            }

            @i(name = "setPrivacyUpdateResponse")
            public final void setPrivacyUpdateResponse(@l PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
                L.p(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0, "value");
                this._builder.setPrivacyUpdateResponse(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0);
            }
        }

        @l
        public static final PayloadKt INSTANCE;

        static {
            PayloadKt.INSTANCE = new PayloadKt();
        }
    }

    @l
    public static final UniversalResponseKt INSTANCE;

    @l
    @i(name = "-initializepayload")
    public final Payload -initializepayload(@l Function1 function10) {
        L.p(function10, "block");
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder universalResponseOuterClass$UniversalResponse$Payload$Builder0 = Payload.newBuilder();
        L.o(universalResponseOuterClass$UniversalResponse$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl universalResponseKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion._create(universalResponseOuterClass$UniversalResponse$Payload$Builder0);
        function10.invoke(universalResponseKt$PayloadKt$Dsl0);
        return universalResponseKt$PayloadKt$Dsl0._build();
    }

    static {
        UniversalResponseKt.INSTANCE = new UniversalResponseKt();
    }
}

