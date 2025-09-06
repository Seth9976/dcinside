package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class AdResponseKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adResponseOuterClass$AdResponse$Builder0) {
                L.p(adResponseOuterClass$AdResponse$Builder0, "builder");
                return new Dsl(adResponseOuterClass$AdResponse$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adResponseOuterClass$AdResponse$Builder0) {
            this._builder = adResponseOuterClass$AdResponse$Builder0;
        }

        public Dsl(Builder adResponseOuterClass$AdResponse$Builder0, w w0) {
            this(adResponseOuterClass$AdResponse$Builder0);
        }

        @b0
        public final AdResponse _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdResponse)generatedMessageLite0;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        @l
        @i(name = "getAdData")
        public final ByteString getAdData() {
            ByteString byteString0 = this._builder.getAdData();
            L.o(byteString0, "_builder.getAdData()");
            return byteString0;
        }

        @l
        @i(name = "getAdDataRefreshToken")
        public final ByteString getAdDataRefreshToken() {
            ByteString byteString0 = this._builder.getAdDataRefreshToken();
            L.o(byteString0, "_builder.getAdDataRefreshToken()");
            return byteString0;
        }

        @i(name = "getAdDataVersion")
        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        @l
        @i(name = "getError")
        public final Error getError() {
            Error errorOuterClass$Error0 = this._builder.getError();
            L.o(errorOuterClass$Error0, "_builder.getError()");
            return errorOuterClass$Error0;
        }

        @m
        public final Error getErrorOrNull(@l Dsl adResponseKt$Dsl0) {
            L.p(adResponseKt$Dsl0, "<this>");
            return AdResponseKtKt.getErrorOrNull(adResponseKt$Dsl0._builder);
        }

        @l
        @i(name = "getImpressionConfiguration")
        public final ByteString getImpressionConfiguration() {
            ByteString byteString0 = this._builder.getImpressionConfiguration();
            L.o(byteString0, "_builder.getImpressionConfiguration()");
            return byteString0;
        }

        @i(name = "getImpressionConfigurationVersion")
        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        @l
        @i(name = "getTrackingToken")
        public final ByteString getTrackingToken() {
            ByteString byteString0 = this._builder.getTrackingToken();
            L.o(byteString0, "_builder.getTrackingToken()");
            return byteString0;
        }

        @l
        @i(name = "getWebviewConfiguration")
        public final WebViewConfiguration getWebviewConfiguration() {
            WebViewConfiguration webviewConfiguration$WebViewConfiguration0 = this._builder.getWebviewConfiguration();
            L.o(webviewConfiguration$WebViewConfiguration0, "_builder.getWebviewConfiguration()");
            return webviewConfiguration$WebViewConfiguration0;
        }

        @m
        public final WebViewConfiguration getWebviewConfigurationOrNull(@l Dsl adResponseKt$Dsl0) {
            L.p(adResponseKt$Dsl0, "<this>");
            return AdResponseKtKt.getWebviewConfigurationOrNull(adResponseKt$Dsl0._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        @i(name = "setAdData")
        public final void setAdData(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdData(byteString0);
        }

        @i(name = "setAdDataRefreshToken")
        public final void setAdDataRefreshToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdDataRefreshToken(byteString0);
        }

        @i(name = "setAdDataVersion")
        public final void setAdDataVersion(int v) {
            this._builder.setAdDataVersion(v);
        }

        @i(name = "setError")
        public final void setError(@l Error errorOuterClass$Error0) {
            L.p(errorOuterClass$Error0, "value");
            this._builder.setError(errorOuterClass$Error0);
        }

        @i(name = "setImpressionConfiguration")
        public final void setImpressionConfiguration(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setImpressionConfiguration(byteString0);
        }

        @i(name = "setImpressionConfigurationVersion")
        public final void setImpressionConfigurationVersion(int v) {
            this._builder.setImpressionConfigurationVersion(v);
        }

        @i(name = "setTrackingToken")
        public final void setTrackingToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTrackingToken(byteString0);
        }

        @i(name = "setWebviewConfiguration")
        public final void setWebviewConfiguration(@l WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
            L.p(webviewConfiguration$WebViewConfiguration0, "value");
            this._builder.setWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
        }
    }

    @l
    public static final AdResponseKt INSTANCE;

    static {
        AdResponseKt.INSTANCE = new AdResponseKt();
    }
}

