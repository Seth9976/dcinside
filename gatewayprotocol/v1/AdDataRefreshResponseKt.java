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

public final class AdDataRefreshResponseKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0) {
                L.p(adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0, "builder");
                return new Dsl(adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0) {
            this._builder = adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0;
        }

        public Dsl(Builder adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0, w w0) {
            this(adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0);
        }

        @b0
        public final AdDataRefreshResponse _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdDataRefreshResponse)generatedMessageLite0;
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

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
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
        public final Error getErrorOrNull(@l Dsl adDataRefreshResponseKt$Dsl0) {
            L.p(adDataRefreshResponseKt$Dsl0, "<this>");
            return AdDataRefreshResponseKtKt.getErrorOrNull(adDataRefreshResponseKt$Dsl0._builder);
        }

        @l
        @i(name = "getTrackingToken")
        public final ByteString getTrackingToken() {
            ByteString byteString0 = this._builder.getTrackingToken();
            L.o(byteString0, "_builder.getTrackingToken()");
            return byteString0;
        }

        public final boolean hasError() {
            return this._builder.hasError();
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

        @i(name = "setTrackingToken")
        public final void setTrackingToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTrackingToken(byteString0);
        }
    }

    @l
    public static final AdDataRefreshResponseKt INSTANCE;

    static {
        AdDataRefreshResponseKt.INSTANCE = new AdDataRefreshResponseKt();
    }
}

