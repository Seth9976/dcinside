package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TokenCountersKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder headerBiddingTokenOuterClass$TokenCounters$Builder0) {
                L.p(headerBiddingTokenOuterClass$TokenCounters$Builder0, "builder");
                return new Dsl(headerBiddingTokenOuterClass$TokenCounters$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder headerBiddingTokenOuterClass$TokenCounters$Builder0) {
            this._builder = headerBiddingTokenOuterClass$TokenCounters$Builder0;
        }

        public Dsl(Builder headerBiddingTokenOuterClass$TokenCounters$Builder0, w w0) {
            this(headerBiddingTokenOuterClass$TokenCounters$Builder0);
        }

        @b0
        public final TokenCounters _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (TokenCounters)generatedMessageLite0;
        }

        public final void clearSeq() {
            this._builder.clearSeq();
        }

        public final void clearStarts() {
            this._builder.clearStarts();
        }

        public final void clearWins() {
            this._builder.clearWins();
        }

        @i(name = "getSeq")
        public final int getSeq() {
            return this._builder.getSeq();
        }

        @i(name = "getStarts")
        public final int getStarts() {
            return this._builder.getStarts();
        }

        @i(name = "getWins")
        public final int getWins() {
            return this._builder.getWins();
        }

        @i(name = "setSeq")
        public final void setSeq(int v) {
            this._builder.setSeq(v);
        }

        @i(name = "setStarts")
        public final void setStarts(int v) {
            this._builder.setStarts(v);
        }

        @i(name = "setWins")
        public final void setWins(int v) {
            this._builder.setWins(v);
        }
    }

    @l
    public static final TokenCountersKt INSTANCE;

    static {
        TokenCountersKt.INSTANCE = new TokenCountersKt();
    }
}

