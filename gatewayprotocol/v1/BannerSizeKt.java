package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class BannerSizeKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adRequestOuterClass$BannerSize$Builder0) {
                L.p(adRequestOuterClass$BannerSize$Builder0, "builder");
                return new Dsl(adRequestOuterClass$BannerSize$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adRequestOuterClass$BannerSize$Builder0) {
            this._builder = adRequestOuterClass$BannerSize$Builder0;
        }

        public Dsl(Builder adRequestOuterClass$BannerSize$Builder0, w w0) {
            this(adRequestOuterClass$BannerSize$Builder0);
        }

        @b0
        public final BannerSize _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (BannerSize)generatedMessageLite0;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        @i(name = "getHeight")
        public final int getHeight() {
            return this._builder.getHeight();
        }

        @i(name = "getWidth")
        public final int getWidth() {
            return this._builder.getWidth();
        }

        @i(name = "setHeight")
        public final void setHeight(int v) {
            this._builder.setHeight(v);
        }

        @i(name = "setWidth")
        public final void setWidth(int v) {
            this._builder.setWidth(v);
        }
    }

    @l
    public static final BannerSizeKt INSTANCE;

    static {
        BannerSizeKt.INSTANCE = new BannerSizeKt();
    }
}

