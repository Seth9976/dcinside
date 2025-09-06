package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class AdPlayerConfigRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0) {
                L.p(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0, "builder");
                return new Dsl(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0) {
            this._builder = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0;
        }

        public Dsl(Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0, w w0) {
            this(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0);
        }

        @b0
        public final AdPlayerConfigRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdPlayerConfigRequest)generatedMessageLite0;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        @l
        @i(name = "getAdFormat")
        public final AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = this._builder.getAdFormat();
            L.o(initializationResponseOuterClass$AdFormat0, "_builder.getAdFormat()");
            return initializationResponseOuterClass$AdFormat0;
        }

        @i(name = "getAdFormatValue")
        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @l
        @i(name = "getConfigurationToken")
        public final ByteString getConfigurationToken() {
            ByteString byteString0 = this._builder.getConfigurationToken();
            L.o(byteString0, "_builder.getConfigurationToken()");
            return byteString0;
        }

        @l
        @i(name = "getImpressionOpportunityId")
        public final ByteString getImpressionOpportunityId() {
            ByteString byteString0 = this._builder.getImpressionOpportunityId();
            L.o(byteString0, "_builder.getImpressionOpportunityId()");
            return byteString0;
        }

        @l
        @i(name = "getPlacementId")
        public final String getPlacementId() {
            String s = this._builder.getPlacementId();
            L.o(s, "_builder.getPlacementId()");
            return s;
        }

        @i(name = "getWebviewVersion")
        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        @i(name = "setAdFormat")
        public final void setAdFormat(@l AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this._builder.setAdFormat(initializationResponseOuterClass$AdFormat0);
        }

        @i(name = "setAdFormatValue")
        public final void setAdFormatValue(int v) {
            this._builder.setAdFormatValue(v);
        }

        @i(name = "setConfigurationToken")
        public final void setConfigurationToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setConfigurationToken(byteString0);
        }

        @i(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setImpressionOpportunityId(byteString0);
        }

        @i(name = "setPlacementId")
        public final void setPlacementId(@l String s) {
            L.p(s, "value");
            this._builder.setPlacementId(s);
        }

        @i(name = "setWebviewVersion")
        public final void setWebviewVersion(int v) {
            this._builder.setWebviewVersion(v);
        }
    }

    @l
    public static final AdPlayerConfigRequestKt INSTANCE;

    static {
        AdPlayerConfigRequestKt.INSTANCE = new AdPlayerConfigRequestKt();
    }
}

