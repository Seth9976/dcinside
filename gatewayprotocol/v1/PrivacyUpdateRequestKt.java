package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class PrivacyUpdateRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0) {
                L.p(privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0, "builder");
                return new Dsl(privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0) {
            this._builder = privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0;
        }

        public Dsl(Builder privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0, w w0) {
            this(privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0);
        }

        @b0
        public final PrivacyUpdateRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (PrivacyUpdateRequest)generatedMessageLite0;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @l
        @i(name = "getContent")
        public final ByteString getContent() {
            ByteString byteString0 = this._builder.getContent();
            L.o(byteString0, "_builder.getContent()");
            return byteString0;
        }

        @i(name = "getVersion")
        public final int getVersion() {
            return this._builder.getVersion();
        }

        @i(name = "setContent")
        public final void setContent(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setContent(byteString0);
        }

        @i(name = "setVersion")
        public final void setVersion(int v) {
            this._builder.setVersion(v);
        }
    }

    @l
    public static final PrivacyUpdateRequestKt INSTANCE;

    static {
        PrivacyUpdateRequestKt.INSTANCE = new PrivacyUpdateRequestKt();
    }
}

