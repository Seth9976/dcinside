package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class InitializationResponseKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationResponseOuterClass$InitializationResponse$Builder0) {
                L.p(initializationResponseOuterClass$InitializationResponse$Builder0, "builder");
                return new Dsl(initializationResponseOuterClass$InitializationResponse$Builder0, null);
            }
        }

        public static final class ScarEligibleFormatsProxy extends DslProxy {
        }

        public static final class ScarPlacementsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationResponseOuterClass$InitializationResponse$Builder0) {
            this._builder = initializationResponseOuterClass$InitializationResponse$Builder0;
        }

        public Dsl(Builder initializationResponseOuterClass$InitializationResponse$Builder0, w w0) {
            this(initializationResponseOuterClass$InitializationResponse$Builder0);
        }

        @b0
        public final InitializationResponse _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (InitializationResponse)generatedMessageLite0;
        }

        @i(name = "addAllScarEligibleFormats")
        public final void addAllScarEligibleFormats(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllScarEligibleFormats(iterable0);
        }

        @i(name = "addScarEligibleFormats")
        public final void addScarEligibleFormats(DslList dslList0, AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(dslList0, "<this>");
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this._builder.addScarEligibleFormats(initializationResponseOuterClass$AdFormat0);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        @i(name = "clearScarEligibleFormats")
        public final void clearScarEligibleFormats(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        @i(name = "clearScarPlacements")
        public final void clearScarPlacements(DslMap dslMap0) {
            L.p(dslMap0, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        @i(name = "getCountOfLastShownCampaigns")
        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        @l
        @i(name = "getError")
        public final Error getError() {
            Error errorOuterClass$Error0 = this._builder.getError();
            L.o(errorOuterClass$Error0, "_builder.getError()");
            return errorOuterClass$Error0;
        }

        @m
        public final Error getErrorOrNull(@l Dsl initializationResponseKt$Dsl0) {
            L.p(initializationResponseKt$Dsl0, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(initializationResponseKt$Dsl0._builder);
        }

        @l
        @i(name = "getNativeConfiguration")
        public final NativeConfiguration getNativeConfiguration() {
            NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0 = this._builder.getNativeConfiguration();
            L.o(nativeConfigurationOuterClass$NativeConfiguration0, "_builder.getNativeConfiguration()");
            return nativeConfigurationOuterClass$NativeConfiguration0;
        }

        public final DslList getScarEligibleFormats() {
            List list0 = this._builder.getScarEligibleFormatsList();
            L.o(list0, "_builder.getScarEligibleFormatsList()");
            return new DslList(list0);
        }

        @i(name = "getScarPlacementsMap")
        public final DslMap getScarPlacementsMap() {
            Map map0 = this._builder.getScarPlacementsMap();
            L.o(map0, "_builder.getScarPlacementsMap()");
            return new DslMap(map0);
        }

        @i(name = "getTriggerInitializationCompletedRequest")
        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        @l
        @i(name = "getUniversalRequestUrl")
        public final String getUniversalRequestUrl() {
            String s = this._builder.getUniversalRequestUrl();
            L.o(s, "_builder.getUniversalRequestUrl()");
            return s;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        @i(name = "plusAssignAllScarEligibleFormats")
        public final void plusAssignAllScarEligibleFormats(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllScarEligibleFormats(dslList0, iterable0);
        }

        @i(name = "plusAssignScarEligibleFormats")
        public final void plusAssignScarEligibleFormats(DslList dslList0, AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(dslList0, "<this>");
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this.addScarEligibleFormats(dslList0, initializationResponseOuterClass$AdFormat0);
        }

        @i(name = "putAllScarPlacements")
        public final void putAllScarPlacements(DslMap dslMap0, Map map0) {
            L.p(dslMap0, "<this>");
            L.p(map0, "map");
            this._builder.putAllScarPlacements(map0);
        }

        @i(name = "putScarPlacements")
        public final void putScarPlacements(@l DslMap dslMap0, @l String s, @l Placement initializationResponseOuterClass$Placement0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(initializationResponseOuterClass$Placement0, "value");
            this._builder.putScarPlacements(s, initializationResponseOuterClass$Placement0);
        }

        @i(name = "removeScarPlacements")
        public final void removeScarPlacements(DslMap dslMap0, String s) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.removeScarPlacements(s);
        }

        @i(name = "setCountOfLastShownCampaigns")
        public final void setCountOfLastShownCampaigns(int v) {
            this._builder.setCountOfLastShownCampaigns(v);
        }

        @i(name = "setError")
        public final void setError(@l Error errorOuterClass$Error0) {
            L.p(errorOuterClass$Error0, "value");
            this._builder.setError(errorOuterClass$Error0);
        }

        @i(name = "setNativeConfiguration")
        public final void setNativeConfiguration(@l NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
            L.p(nativeConfigurationOuterClass$NativeConfiguration0, "value");
            this._builder.setNativeConfiguration(nativeConfigurationOuterClass$NativeConfiguration0);
        }

        @i(name = "setScarEligibleFormats")
        public final void setScarEligibleFormats(DslList dslList0, int v, AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(dslList0, "<this>");
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this._builder.setScarEligibleFormats(v, initializationResponseOuterClass$AdFormat0);
        }

        @i(name = "setScarPlacements")
        public final void setScarPlacements(DslMap dslMap0, String s, Placement initializationResponseOuterClass$Placement0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(initializationResponseOuterClass$Placement0, "value");
            this.putScarPlacements(dslMap0, s, initializationResponseOuterClass$Placement0);
        }

        @i(name = "setTriggerInitializationCompletedRequest")
        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        @i(name = "setUniversalRequestUrl")
        public final void setUniversalRequestUrl(@l String s) {
            L.p(s, "value");
            this._builder.setUniversalRequestUrl(s);
        }
    }

    @l
    public static final InitializationResponseKt INSTANCE;

    static {
        InitializationResponseKt.INSTANCE = new InitializationResponseKt();
    }
}

