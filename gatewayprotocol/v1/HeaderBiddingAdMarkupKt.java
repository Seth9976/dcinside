package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class HeaderBiddingAdMarkupKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0) {
                L.p(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0, "builder");
                return new Dsl(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0) {
            this._builder = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0;
        }

        public Dsl(Builder headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0, w w0) {
            this(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0);
        }

        @b0
        public final HeaderBiddingAdMarkup _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (HeaderBiddingAdMarkup)generatedMessageLite0;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        @l
        @i(name = "getAdData")
        public final ByteString getAdData() {
            ByteString byteString0 = this._builder.getAdData();
            L.o(byteString0, "_builder.getAdData()");
            return byteString0;
        }

        @i(name = "getAdDataVersion")
        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        @l
        @i(name = "getConfigurationToken")
        public final ByteString getConfigurationToken() {
            ByteString byteString0 = this._builder.getConfigurationToken();
            L.o(byteString0, "_builder.getConfigurationToken()");
            return byteString0;
        }

        @i(name = "setAdData")
        public final void setAdData(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdData(byteString0);
        }

        @i(name = "setAdDataVersion")
        public final void setAdDataVersion(int v) {
            this._builder.setAdDataVersion(v);
        }

        @i(name = "setConfigurationToken")
        public final void setConfigurationToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setConfigurationToken(byteString0);
        }
    }

    @l
    public static final HeaderBiddingAdMarkupKt INSTANCE;

    static {
        HeaderBiddingAdMarkupKt.INSTANCE = new HeaderBiddingAdMarkupKt();
    }
}

