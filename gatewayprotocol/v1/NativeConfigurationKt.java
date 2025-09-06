package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class NativeConfigurationKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class AdditionalStorePackagesProxy extends DslProxy {
        }

        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0) {
                L.p(nativeConfigurationOuterClass$NativeConfiguration$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$NativeConfiguration$Builder0, null);
            }
        }

        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0) {
            this._builder = nativeConfigurationOuterClass$NativeConfiguration$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0, w w0) {
            this(nativeConfigurationOuterClass$NativeConfiguration$Builder0);
        }

        @b0
        public final NativeConfiguration _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (NativeConfiguration)generatedMessageLite0;
        }

        @i(name = "addAdditionalStorePackages")
        public final void addAdditionalStorePackages(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.addAdditionalStorePackages(s);
        }

        @i(name = "addAllAdditionalStorePackages")
        public final void addAllAdditionalStorePackages(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllAdditionalStorePackages(iterable0);
        }

        @i(name = "addAllObservableAndroidActivities")
        public final void addAllObservableAndroidActivities(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllObservableAndroidActivities(iterable0);
        }

        @i(name = "addObservableAndroidActivities")
        public final void addObservableAndroidActivities(DslList dslList0, ByteString byteString0) {
            L.p(dslList0, "<this>");
            L.p(byteString0, "value");
            this._builder.addObservableAndroidActivities(byteString0);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        @i(name = "clearAdditionalStorePackages")
        public final void clearAdditionalStorePackages(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        @i(name = "clearObservableAndroidActivities")
        public final void clearObservableAndroidActivities(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        @l
        @i(name = "getAdOperations")
        public final AdOperationsConfiguration getAdOperations() {
            AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0 = this._builder.getAdOperations();
            L.o(nativeConfigurationOuterClass$AdOperationsConfiguration0, "_builder.getAdOperations()");
            return nativeConfigurationOuterClass$AdOperationsConfiguration0;
        }

        @l
        @i(name = "getAdPolicy")
        public final RequestPolicy getAdPolicy() {
            RequestPolicy nativeConfigurationOuterClass$RequestPolicy0 = this._builder.getAdPolicy();
            L.o(nativeConfigurationOuterClass$RequestPolicy0, "_builder.getAdPolicy()");
            return nativeConfigurationOuterClass$RequestPolicy0;
        }

        @l
        public final DslList getAdditionalStorePackages() {
            List list0 = this._builder.getAdditionalStorePackagesList();
            L.o(list0, "_builder.getAdditionalStorePackagesList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getCachedAssetsConfiguration")
        public final CachedAssetsConfiguration getCachedAssetsConfiguration() {
            CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0 = this._builder.getCachedAssetsConfiguration();
            L.o(nativeConfigurationOuterClass$CachedAssetsConfiguration0, "_builder.getCachedAssetsConfiguration()");
            return nativeConfigurationOuterClass$CachedAssetsConfiguration0;
        }

        @l
        @i(name = "getDiagnosticEvents")
        public final DiagnosticEventsConfiguration getDiagnosticEvents() {
            DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0 = this._builder.getDiagnosticEvents();
            L.o(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, "_builder.getDiagnosticEvents()");
            return nativeConfigurationOuterClass$DiagnosticEventsConfiguration0;
        }

        @i(name = "getEnableIapEvent")
        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        @i(name = "getEnableOm")
        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        @l
        @i(name = "getFeatureFlags")
        public final FeatureFlags getFeatureFlags() {
            FeatureFlags nativeConfigurationOuterClass$FeatureFlags0 = this._builder.getFeatureFlags();
            L.o(nativeConfigurationOuterClass$FeatureFlags0, "_builder.getFeatureFlags()");
            return nativeConfigurationOuterClass$FeatureFlags0;
        }

        @l
        @i(name = "getInitPolicy")
        public final RequestPolicy getInitPolicy() {
            RequestPolicy nativeConfigurationOuterClass$RequestPolicy0 = this._builder.getInitPolicy();
            L.o(nativeConfigurationOuterClass$RequestPolicy0, "_builder.getInitPolicy()");
            return nativeConfigurationOuterClass$RequestPolicy0;
        }

        public final DslList getObservableAndroidActivities() {
            List list0 = this._builder.getObservableAndroidActivitiesList();
            L.o(list0, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getOperativeEventPolicy")
        public final RequestPolicy getOperativeEventPolicy() {
            RequestPolicy nativeConfigurationOuterClass$RequestPolicy0 = this._builder.getOperativeEventPolicy();
            L.o(nativeConfigurationOuterClass$RequestPolicy0, "_builder.getOperativeEventPolicy()");
            return nativeConfigurationOuterClass$RequestPolicy0;
        }

        @l
        @i(name = "getOtherPolicy")
        public final RequestPolicy getOtherPolicy() {
            RequestPolicy nativeConfigurationOuterClass$RequestPolicy0 = this._builder.getOtherPolicy();
            L.o(nativeConfigurationOuterClass$RequestPolicy0, "_builder.getOtherPolicy()");
            return nativeConfigurationOuterClass$RequestPolicy0;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        @i(name = "plusAssignAdditionalStorePackages")
        public final void plusAssignAdditionalStorePackages(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this.addAdditionalStorePackages(dslList0, s);
        }

        @i(name = "plusAssignAllAdditionalStorePackages")
        public final void plusAssignAllAdditionalStorePackages(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllAdditionalStorePackages(dslList0, iterable0);
        }

        @i(name = "plusAssignAllObservableAndroidActivities")
        public final void plusAssignAllObservableAndroidActivities(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllObservableAndroidActivities(dslList0, iterable0);
        }

        @i(name = "plusAssignObservableAndroidActivities")
        public final void plusAssignObservableAndroidActivities(DslList dslList0, ByteString byteString0) {
            L.p(dslList0, "<this>");
            L.p(byteString0, "value");
            this.addObservableAndroidActivities(dslList0, byteString0);
        }

        @i(name = "setAdOperations")
        public final void setAdOperations(@l AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
            L.p(nativeConfigurationOuterClass$AdOperationsConfiguration0, "value");
            this._builder.setAdOperations(nativeConfigurationOuterClass$AdOperationsConfiguration0);
        }

        @i(name = "setAdPolicy")
        public final void setAdPolicy(@l RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestPolicy0, "value");
            this._builder.setAdPolicy(nativeConfigurationOuterClass$RequestPolicy0);
        }

        @i(name = "setAdditionalStorePackages")
        public final void setAdditionalStorePackages(DslList dslList0, int v, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.setAdditionalStorePackages(v, s);
        }

        @i(name = "setCachedAssetsConfiguration")
        public final void setCachedAssetsConfiguration(@l CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
            L.p(nativeConfigurationOuterClass$CachedAssetsConfiguration0, "value");
            this._builder.setCachedAssetsConfiguration(nativeConfigurationOuterClass$CachedAssetsConfiguration0);
        }

        @i(name = "setDiagnosticEvents")
        public final void setDiagnosticEvents(@l DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
            L.p(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, "value");
            this._builder.setDiagnosticEvents(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
        }

        @i(name = "setEnableIapEvent")
        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        @i(name = "setEnableOm")
        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        @i(name = "setFeatureFlags")
        public final void setFeatureFlags(@l FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
            L.p(nativeConfigurationOuterClass$FeatureFlags0, "value");
            this._builder.setFeatureFlags(nativeConfigurationOuterClass$FeatureFlags0);
        }

        @i(name = "setInitPolicy")
        public final void setInitPolicy(@l RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestPolicy0, "value");
            this._builder.setInitPolicy(nativeConfigurationOuterClass$RequestPolicy0);
        }

        @i(name = "setObservableAndroidActivities")
        public final void setObservableAndroidActivities(DslList dslList0, int v, ByteString byteString0) {
            L.p(dslList0, "<this>");
            L.p(byteString0, "value");
            this._builder.setObservableAndroidActivities(v, byteString0);
        }

        @i(name = "setOperativeEventPolicy")
        public final void setOperativeEventPolicy(@l RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestPolicy0, "value");
            this._builder.setOperativeEventPolicy(nativeConfigurationOuterClass$RequestPolicy0);
        }

        @i(name = "setOtherPolicy")
        public final void setOtherPolicy(@l RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            L.p(nativeConfigurationOuterClass$RequestPolicy0, "value");
            this._builder.setOtherPolicy(nativeConfigurationOuterClass$RequestPolicy0);
        }
    }

    @l
    public static final NativeConfigurationKt INSTANCE;

    static {
        NativeConfigurationKt.INSTANCE = new NativeConfigurationKt();
    }
}

