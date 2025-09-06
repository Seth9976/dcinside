package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nUniversalRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n1#2:940\n*E\n"})
public final class UniversalRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder universalRequestOuterClass$UniversalRequest$Builder0) {
                L.p(universalRequestOuterClass$UniversalRequest$Builder0, "builder");
                return new Dsl(universalRequestOuterClass$UniversalRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder universalRequestOuterClass$UniversalRequest$Builder0) {
            this._builder = universalRequestOuterClass$UniversalRequest$Builder0;
        }

        public Dsl(Builder universalRequestOuterClass$UniversalRequest$Builder0, w w0) {
            this(universalRequestOuterClass$UniversalRequest$Builder0);
        }

        @b0
        public final UniversalRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (UniversalRequest)generatedMessageLite0;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @l
        @i(name = "getPayload")
        public final Payload getPayload() {
            Payload universalRequestOuterClass$UniversalRequest$Payload0 = this._builder.getPayload();
            L.o(universalRequestOuterClass$UniversalRequest$Payload0, "_builder.getPayload()");
            return universalRequestOuterClass$UniversalRequest$Payload0;
        }

        @l
        @i(name = "getSharedData")
        public final SharedData getSharedData() {
            SharedData universalRequestOuterClass$UniversalRequest$SharedData0 = this._builder.getSharedData();
            L.o(universalRequestOuterClass$UniversalRequest$SharedData0, "_builder.getSharedData()");
            return universalRequestOuterClass$UniversalRequest$SharedData0;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        @i(name = "setPayload")
        public final void setPayload(@l Payload universalRequestOuterClass$UniversalRequest$Payload0) {
            L.p(universalRequestOuterClass$UniversalRequest$Payload0, "value");
            this._builder.setPayload(universalRequestOuterClass$UniversalRequest$Payload0);
        }

        @i(name = "setSharedData")
        public final void setSharedData(@l SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            L.p(universalRequestOuterClass$UniversalRequest$SharedData0, "value");
            this._builder.setSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
        }
    }

    public static final class PayloadKt {
        @ProtoDslMarker
        public static final class gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl {
            public static final class gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion {
                private gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion() {
                }

                public gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion(w w0) {
                }

                @b0
                public final gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0) {
                    L.p(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "builder");
                    return new gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl(universalRequestOuterClass$UniversalRequest$Payload$Builder0, null);
                }
            }

            @l
            public static final gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion Companion;
            @l
            private final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            static {
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion = new gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion(null);
            }

            private gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0) {
                this._builder = universalRequestOuterClass$UniversalRequest$Payload$Builder0;
            }

            public gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0, w w0) {
                this(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
            }

            @b0
            public final Payload _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Payload)generatedMessageLite0;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @l
            @i(name = "getAdDataRefreshRequest")
            public final AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0 = this._builder.getAdDataRefreshRequest();
                L.o(adDataRefreshRequestOuterClass$AdDataRefreshRequest0, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequestOuterClass$AdDataRefreshRequest0;
            }

            @l
            @i(name = "getAdPlayerConfigRequest")
            public final AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0 = this._builder.getAdPlayerConfigRequest();
                L.o(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0;
            }

            @l
            @i(name = "getAdRequest")
            public final AdRequest getAdRequest() {
                AdRequest adRequestOuterClass$AdRequest0 = this._builder.getAdRequest();
                L.o(adRequestOuterClass$AdRequest0, "_builder.getAdRequest()");
                return adRequestOuterClass$AdRequest0;
            }

            @l
            @i(name = "getDiagnosticEventRequest")
            public final DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0 = this._builder.getDiagnosticEventRequest();
                L.o(diagnosticEventRequestOuterClass$DiagnosticEventRequest0, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequestOuterClass$DiagnosticEventRequest0;
            }

            @l
            @i(name = "getGetTokenEventRequest")
            public final GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0 = this._builder.getGetTokenEventRequest();
                L.o(getTokenEventRequestOuterClass$GetTokenEventRequest0, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequestOuterClass$GetTokenEventRequest0;
            }

            @l
            @i(name = "getInitializationCompletedEventRequest")
            public final InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0 = this._builder.getInitializationCompletedEventRequest();
                L.o(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0;
            }

            @l
            @i(name = "getInitializationRequest")
            public final InitializationRequest getInitializationRequest() {
                InitializationRequest initializationRequestOuterClass$InitializationRequest0 = this._builder.getInitializationRequest();
                L.o(initializationRequestOuterClass$InitializationRequest0, "_builder.getInitializationRequest()");
                return initializationRequestOuterClass$InitializationRequest0;
            }

            @l
            @i(name = "getOperativeEvent")
            public final OperativeEventRequest getOperativeEvent() {
                OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0 = this._builder.getOperativeEvent();
                L.o(operativeEventRequestOuterClass$OperativeEventRequest0, "_builder.getOperativeEvent()");
                return operativeEventRequestOuterClass$OperativeEventRequest0;
            }

            @l
            @i(name = "getPrivacyUpdateRequest")
            public final PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0 = this._builder.getPrivacyUpdateRequest();
                L.o(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequestOuterClass$PrivacyUpdateRequest0;
            }

            @l
            @i(name = "getTransactionEventRequest")
            public final TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0 = this._builder.getTransactionEventRequest();
                L.o(transactionEventRequestOuterClass$TransactionEventRequest0, "_builder.getTransactionEventRequest()");
                return transactionEventRequestOuterClass$TransactionEventRequest0;
            }

            @l
            @i(name = "getValueCase")
            public final ValueCase getValueCase() {
                ValueCase universalRequestOuterClass$UniversalRequest$Payload$ValueCase0 = this._builder.getValueCase();
                L.o(universalRequestOuterClass$UniversalRequest$Payload$ValueCase0, "_builder.getValueCase()");
                return universalRequestOuterClass$UniversalRequest$Payload$ValueCase0;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            @i(name = "setAdDataRefreshRequest")
            public final void setAdDataRefreshRequest(@l AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
                L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequest0, "value");
                this._builder.setAdDataRefreshRequest(adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
            }

            @i(name = "setAdPlayerConfigRequest")
            public final void setAdPlayerConfigRequest(@l AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
                L.p(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0, "value");
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
            }

            @i(name = "setAdRequest")
            public final void setAdRequest(@l AdRequest adRequestOuterClass$AdRequest0) {
                L.p(adRequestOuterClass$AdRequest0, "value");
                this._builder.setAdRequest(adRequestOuterClass$AdRequest0);
            }

            @i(name = "setDiagnosticEventRequest")
            public final void setDiagnosticEventRequest(@l DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticEventRequest0, "value");
                this._builder.setDiagnosticEventRequest(diagnosticEventRequestOuterClass$DiagnosticEventRequest0);
            }

            @i(name = "setGetTokenEventRequest")
            public final void setGetTokenEventRequest(@l GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
                L.p(getTokenEventRequestOuterClass$GetTokenEventRequest0, "value");
                this._builder.setGetTokenEventRequest(getTokenEventRequestOuterClass$GetTokenEventRequest0);
            }

            @i(name = "setInitializationCompletedEventRequest")
            public final void setInitializationCompletedEventRequest(@l InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
                L.p(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0, "value");
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
            }

            @i(name = "setInitializationRequest")
            public final void setInitializationRequest(@l InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                L.p(initializationRequestOuterClass$InitializationRequest0, "value");
                this._builder.setInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
            }

            @i(name = "setOperativeEvent")
            public final void setOperativeEvent(@l OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
                L.p(operativeEventRequestOuterClass$OperativeEventRequest0, "value");
                this._builder.setOperativeEvent(operativeEventRequestOuterClass$OperativeEventRequest0);
            }

            @i(name = "setPrivacyUpdateRequest")
            public final void setPrivacyUpdateRequest(@l PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0) {
                L.p(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0, "value");
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0);
            }

            @i(name = "setTransactionEventRequest")
            public final void setTransactionEventRequest(@l TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
                L.p(transactionEventRequestOuterClass$TransactionEventRequest0, "value");
                this._builder.setTransactionEventRequest(transactionEventRequestOuterClass$TransactionEventRequest0);
            }
        }

        @l
        public static final PayloadKt INSTANCE;

        static {
            PayloadKt.INSTANCE = new PayloadKt();
        }
    }

    public static final class SharedDataKt {
        @ProtoDslMarker
        public static final class gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl {
            public static final class gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion {
                private gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion() {
                }

                public gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion(w w0) {
                }

                @b0
                public final gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl _create(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0) {
                    L.p(universalRequestOuterClass$UniversalRequest$SharedData$Builder0, "builder");
                    return new gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl(universalRequestOuterClass$UniversalRequest$SharedData$Builder0, null);
                }
            }

            @l
            public static final gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion Companion;
            @l
            private final gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            static {
                gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion = new gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion(null);
            }

            private gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0) {
                this._builder = universalRequestOuterClass$UniversalRequest$SharedData$Builder0;
            }

            public gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0, w w0) {
                this(universalRequestOuterClass$UniversalRequest$SharedData$Builder0);
            }

            @b0
            public final SharedData _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (SharedData)generatedMessageLite0;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            @l
            @i(name = "getAppStartTime")
            public final Timestamp getAppStartTime() {
                Timestamp timestamp0 = this._builder.getAppStartTime();
                L.o(timestamp0, "_builder.getAppStartTime()");
                return timestamp0;
            }

            @l
            @i(name = "getCurrentState")
            public final ByteString getCurrentState() {
                ByteString byteString0 = this._builder.getCurrentState();
                L.o(byteString0, "_builder.getCurrentState()");
                return byteString0;
            }

            @l
            @i(name = "getDeveloperConsent")
            public final DeveloperConsent getDeveloperConsent() {
                DeveloperConsent developerConsentOuterClass$DeveloperConsent0 = this._builder.getDeveloperConsent();
                L.o(developerConsentOuterClass$DeveloperConsent0, "_builder.getDeveloperConsent()");
                return developerConsentOuterClass$DeveloperConsent0;
            }

            @m
            public final DeveloperConsent getDeveloperConsentOrNull(@l gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0) {
                L.p(universalRequestKt$SharedDataKt$Dsl0, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(universalRequestKt$SharedDataKt$Dsl0._builder);
            }

            @l
            @i(name = "getLimitedSessionToken")
            public final LimitedSessionToken getLimitedSessionToken() {
                LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0 = this._builder.getLimitedSessionToken();
                L.o(universalRequestOuterClass$LimitedSessionToken0, "_builder.getLimitedSessionToken()");
                return universalRequestOuterClass$LimitedSessionToken0;
            }

            @m
            public final LimitedSessionToken getLimitedSessionTokenOrNull(@l gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0) {
                L.p(universalRequestKt$SharedDataKt$Dsl0, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(universalRequestKt$SharedDataKt$Dsl0._builder);
            }

            @l
            @i(name = "getPii")
            public final Pii getPii() {
                Pii piiOuterClass$Pii0 = this._builder.getPii();
                L.o(piiOuterClass$Pii0, "_builder.getPii()");
                return piiOuterClass$Pii0;
            }

            @m
            public final Pii getPiiOrNull(@l gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0) {
                L.p(universalRequestKt$SharedDataKt$Dsl0, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(universalRequestKt$SharedDataKt$Dsl0._builder);
            }

            @l
            @i(name = "getSdkStartTime")
            public final Timestamp getSdkStartTime() {
                Timestamp timestamp0 = this._builder.getSdkStartTime();
                L.o(timestamp0, "_builder.getSdkStartTime()");
                return timestamp0;
            }

            @l
            @i(name = "getSessionToken")
            public final ByteString getSessionToken() {
                ByteString byteString0 = this._builder.getSessionToken();
                L.o(byteString0, "_builder.getSessionToken()");
                return byteString0;
            }

            @l
            @i(name = "getTestData")
            public final TestData getTestData() {
                TestData testDataOuterClass$TestData0 = this._builder.getTestData();
                L.o(testDataOuterClass$TestData0, "_builder.getTestData()");
                return testDataOuterClass$TestData0;
            }

            @m
            public final TestData getTestDataOrNull(@l gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0) {
                L.p(universalRequestKt$SharedDataKt$Dsl0, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(universalRequestKt$SharedDataKt$Dsl0._builder);
            }

            @l
            @i(name = "getTimestamps")
            public final Timestamps getTimestamps() {
                Timestamps timestampsOuterClass$Timestamps0 = this._builder.getTimestamps();
                L.o(timestampsOuterClass$Timestamps0, "_builder.getTimestamps()");
                return timestampsOuterClass$Timestamps0;
            }

            @i(name = "getWebviewVersion")
            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            @i(name = "setAppStartTime")
            public final void setAppStartTime(@l Timestamp timestamp0) {
                L.p(timestamp0, "value");
                this._builder.setAppStartTime(timestamp0);
            }

            @i(name = "setCurrentState")
            public final void setCurrentState(@l ByteString byteString0) {
                L.p(byteString0, "value");
                this._builder.setCurrentState(byteString0);
            }

            @i(name = "setDeveloperConsent")
            public final void setDeveloperConsent(@l DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
                L.p(developerConsentOuterClass$DeveloperConsent0, "value");
                this._builder.setDeveloperConsent(developerConsentOuterClass$DeveloperConsent0);
            }

            @i(name = "setLimitedSessionToken")
            public final void setLimitedSessionToken(@l LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                L.p(universalRequestOuterClass$LimitedSessionToken0, "value");
                this._builder.setLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
            }

            @i(name = "setPii")
            public final void setPii(@l Pii piiOuterClass$Pii0) {
                L.p(piiOuterClass$Pii0, "value");
                this._builder.setPii(piiOuterClass$Pii0);
            }

            @i(name = "setSdkStartTime")
            public final void setSdkStartTime(@l Timestamp timestamp0) {
                L.p(timestamp0, "value");
                this._builder.setSdkStartTime(timestamp0);
            }

            @i(name = "setSessionToken")
            public final void setSessionToken(@l ByteString byteString0) {
                L.p(byteString0, "value");
                this._builder.setSessionToken(byteString0);
            }

            @i(name = "setTestData")
            public final void setTestData(@l TestData testDataOuterClass$TestData0) {
                L.p(testDataOuterClass$TestData0, "value");
                this._builder.setTestData(testDataOuterClass$TestData0);
            }

            @i(name = "setTimestamps")
            public final void setTimestamps(@l Timestamps timestampsOuterClass$Timestamps0) {
                L.p(timestampsOuterClass$Timestamps0, "value");
                this._builder.setTimestamps(timestampsOuterClass$Timestamps0);
            }

            @i(name = "setWebviewVersion")
            public final void setWebviewVersion(int v) {
                this._builder.setWebviewVersion(v);
            }
        }

        @l
        public static final SharedDataKt INSTANCE;

        static {
            SharedDataKt.INSTANCE = new SharedDataKt();
        }
    }

    @l
    public static final UniversalRequestKt INSTANCE;

    @l
    @i(name = "-initializepayload")
    public final Payload -initializepayload(@l Function1 function10) {
        L.p(function10, "block");
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        function10.invoke(universalRequestKt$PayloadKt$Dsl0);
        return universalRequestKt$PayloadKt$Dsl0._build();
    }

    @l
    @i(name = "-initializesharedData")
    public final SharedData -initializesharedData(@l Function1 function10) {
        L.p(function10, "block");
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0 = SharedData.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$SharedData$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$SharedData$Builder0);
        function10.invoke(universalRequestKt$SharedDataKt$Dsl0);
        return universalRequestKt$SharedDataKt$Dsl0._build();
    }

    static {
        UniversalRequestKt.INSTANCE = new UniversalRequestKt();
    }
}

