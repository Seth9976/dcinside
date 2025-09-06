package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class GetTokenEventRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0) {
                L.p(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0, "builder");
                return new Dsl(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0) {
            this._builder = getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0;
        }

        public Dsl(Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0, w w0) {
            this(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0);
        }

        @b0
        public final GetTokenEventRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (GetTokenEventRequest)generatedMessageLite0;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        @l
        @i(name = "getBanner")
        public final ByteString getBanner() {
            ByteString byteString0 = this._builder.getBanner();
            L.o(byteString0, "_builder.getBanner()");
            return byteString0;
        }

        @l
        @i(name = "getInterstitial")
        public final ByteString getInterstitial() {
            ByteString byteString0 = this._builder.getInterstitial();
            L.o(byteString0, "_builder.getInterstitial()");
            return byteString0;
        }

        @l
        @i(name = "getRewarded")
        public final ByteString getRewarded() {
            ByteString byteString0 = this._builder.getRewarded();
            L.o(byteString0, "_builder.getRewarded()");
            return byteString0;
        }

        @l
        @i(name = "getTokenId")
        public final ByteString getTokenId() {
            ByteString byteString0 = this._builder.getTokenId();
            L.o(byteString0, "_builder.getTokenId()");
            return byteString0;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        @i(name = "setBanner")
        public final void setBanner(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setBanner(byteString0);
        }

        @i(name = "setInterstitial")
        public final void setInterstitial(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setInterstitial(byteString0);
        }

        @i(name = "setRewarded")
        public final void setRewarded(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setRewarded(byteString0);
        }

        @i(name = "setTokenId")
        public final void setTokenId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTokenId(byteString0);
        }
    }

    @l
    public static final GetTokenEventRequestKt INSTANCE;

    static {
        GetTokenEventRequestKt.INSTANCE = new GetTokenEventRequestKt();
    }
}

