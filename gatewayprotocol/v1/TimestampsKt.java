package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TimestampsKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder timestampsOuterClass$Timestamps$Builder0) {
                L.p(timestampsOuterClass$Timestamps$Builder0, "builder");
                return new Dsl(timestampsOuterClass$Timestamps$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder timestampsOuterClass$Timestamps$Builder0) {
            this._builder = timestampsOuterClass$Timestamps$Builder0;
        }

        public Dsl(Builder timestampsOuterClass$Timestamps$Builder0, w w0) {
            this(timestampsOuterClass$Timestamps$Builder0);
        }

        @b0
        public final Timestamps _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Timestamps)generatedMessageLite0;
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        @i(name = "getSessionTimestamp")
        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        @l
        @i(name = "getTimestamp")
        public final Timestamp getTimestamp() {
            Timestamp timestamp0 = this._builder.getTimestamp();
            L.o(timestamp0, "_builder.getTimestamp()");
            return timestamp0;
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        @i(name = "setSessionTimestamp")
        public final void setSessionTimestamp(long v) {
            this._builder.setSessionTimestamp(v);
        }

        @i(name = "setTimestamp")
        public final void setTimestamp(@l Timestamp timestamp0) {
            L.p(timestamp0, "value");
            this._builder.setTimestamp(timestamp0);
        }
    }

    @l
    public static final TimestampsKt INSTANCE;

    static {
        TimestampsKt.INSTANCE = new TimestampsKt();
    }
}

