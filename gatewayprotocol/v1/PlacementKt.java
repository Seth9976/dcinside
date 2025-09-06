package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class PlacementKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationResponseOuterClass$Placement$Builder0) {
                L.p(initializationResponseOuterClass$Placement$Builder0, "builder");
                return new Dsl(initializationResponseOuterClass$Placement$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationResponseOuterClass$Placement$Builder0) {
            this._builder = initializationResponseOuterClass$Placement$Builder0;
        }

        public Dsl(Builder initializationResponseOuterClass$Placement$Builder0, w w0) {
            this(initializationResponseOuterClass$Placement$Builder0);
        }

        @b0
        public final Placement _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Placement)generatedMessageLite0;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
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

        @i(name = "setAdFormat")
        public final void setAdFormat(@l AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this._builder.setAdFormat(initializationResponseOuterClass$AdFormat0);
        }

        @i(name = "setAdFormatValue")
        public final void setAdFormatValue(int v) {
            this._builder.setAdFormatValue(v);
        }
    }

    @l
    public static final PlacementKt INSTANCE;

    static {
        PlacementKt.INSTANCE = new PlacementKt();
    }
}

