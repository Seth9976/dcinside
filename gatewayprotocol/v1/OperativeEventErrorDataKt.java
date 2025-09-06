package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class OperativeEventErrorDataKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0) {
                L.p(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, "builder");
                return new Dsl(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0) {
            this._builder = operativeEventRequestOuterClass$OperativeEventErrorData$Builder0;
        }

        public Dsl(Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, w w0) {
            this(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0);
        }

        @b0
        public final OperativeEventErrorData _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (OperativeEventErrorData)generatedMessageLite0;
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        @l
        @i(name = "getErrorType")
        public final OperativeEventErrorType getErrorType() {
            OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0 = this._builder.getErrorType();
            L.o(operativeEventRequestOuterClass$OperativeEventErrorType0, "_builder.getErrorType()");
            return operativeEventRequestOuterClass$OperativeEventErrorType0;
        }

        @i(name = "getErrorTypeValue")
        public final int getErrorTypeValue() {
            return this._builder.getErrorTypeValue();
        }

        @l
        @i(name = "getMessage")
        public final String getMessage() {
            String s = this._builder.getMessage();
            L.o(s, "_builder.getMessage()");
            return s;
        }

        @i(name = "setErrorType")
        public final void setErrorType(@l OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0) {
            L.p(operativeEventRequestOuterClass$OperativeEventErrorType0, "value");
            this._builder.setErrorType(operativeEventRequestOuterClass$OperativeEventErrorType0);
        }

        @i(name = "setErrorTypeValue")
        public final void setErrorTypeValue(int v) {
            this._builder.setErrorTypeValue(v);
        }

        @i(name = "setMessage")
        public final void setMessage(@l String s) {
            L.p(s, "value");
            this._builder.setMessage(s);
        }
    }

    @l
    public static final OperativeEventErrorDataKt INSTANCE;

    static {
        OperativeEventErrorDataKt.INSTANCE = new OperativeEventErrorDataKt();
    }
}

