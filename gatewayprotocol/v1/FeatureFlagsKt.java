package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class FeatureFlagsKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$FeatureFlags$Builder0) {
                L.p(nativeConfigurationOuterClass$FeatureFlags$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$FeatureFlags$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$FeatureFlags$Builder0) {
            this._builder = nativeConfigurationOuterClass$FeatureFlags$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$FeatureFlags$Builder0, w w0) {
            this(nativeConfigurationOuterClass$FeatureFlags$Builder0);
        }

        @b0
        public final FeatureFlags _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (FeatureFlags)generatedMessageLite0;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        @i(name = "getAppSheetBugCheckEnabled")
        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        @i(name = "getBoldSdkNextSessionEnabled")
        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        @i(name = "getOpenglGpuEnabled")
        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        @i(name = "getOpportunityIdPlacementValidation")
        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        @i(name = "getRecoverTerminatedWebviews")
        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        @i(name = "setAppSheetBugCheckEnabled")
        public final void setAppSheetBugCheckEnabled(boolean z) {
            this._builder.setAppSheetBugCheckEnabled(z);
        }

        @i(name = "setBoldSdkNextSessionEnabled")
        public final void setBoldSdkNextSessionEnabled(boolean z) {
            this._builder.setBoldSdkNextSessionEnabled(z);
        }

        @i(name = "setOpenglGpuEnabled")
        public final void setOpenglGpuEnabled(boolean z) {
            this._builder.setOpenglGpuEnabled(z);
        }

        @i(name = "setOpportunityIdPlacementValidation")
        public final void setOpportunityIdPlacementValidation(boolean z) {
            this._builder.setOpportunityIdPlacementValidation(z);
        }

        @i(name = "setRecoverTerminatedWebviews")
        public final void setRecoverTerminatedWebviews(boolean z) {
            this._builder.setRecoverTerminatedWebviews(z);
        }
    }

    @l
    public static final FeatureFlagsKt INSTANCE;

    static {
        FeatureFlagsKt.INSTANCE = new FeatureFlagsKt();
    }
}

