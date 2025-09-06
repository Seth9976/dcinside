package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class PiiKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder piiOuterClass$Pii$Builder0) {
                L.p(piiOuterClass$Pii$Builder0, "builder");
                return new Dsl(piiOuterClass$Pii$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder piiOuterClass$Pii$Builder0) {
            this._builder = piiOuterClass$Pii$Builder0;
        }

        public Dsl(Builder piiOuterClass$Pii$Builder0, w w0) {
            this(piiOuterClass$Pii$Builder0);
        }

        @b0
        public final Pii _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Pii)generatedMessageLite0;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        @l
        @i(name = "getAdvertisingId")
        public final ByteString getAdvertisingId() {
            ByteString byteString0 = this._builder.getAdvertisingId();
            L.o(byteString0, "_builder.getAdvertisingId()");
            return byteString0;
        }

        @l
        @i(name = "getOpenAdvertisingTrackingId")
        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString byteString0 = this._builder.getOpenAdvertisingTrackingId();
            L.o(byteString0, "_builder.getOpenAdvertisingTrackingId()");
            return byteString0;
        }

        @l
        @i(name = "getVendorId")
        public final ByteString getVendorId() {
            ByteString byteString0 = this._builder.getVendorId();
            L.o(byteString0, "_builder.getVendorId()");
            return byteString0;
        }

        @i(name = "setAdvertisingId")
        public final void setAdvertisingId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdvertisingId(byteString0);
        }

        @i(name = "setOpenAdvertisingTrackingId")
        public final void setOpenAdvertisingTrackingId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setOpenAdvertisingTrackingId(byteString0);
        }

        @i(name = "setVendorId")
        public final void setVendorId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setVendorId(byteString0);
        }
    }

    @l
    public static final PiiKt INSTANCE;

    static {
        PiiKt.INSTANCE = new PiiKt();
    }
}

