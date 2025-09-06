package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class DiagnosticEventRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class BatchProxy extends DslProxy {
        }

        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0, "builder");
                return new Dsl(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0) {
            this._builder = diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0;
        }

        public Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0, w w0) {
            this(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0);
        }

        @b0
        public final DiagnosticEventRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DiagnosticEventRequest)generatedMessageLite0;
        }

        @i(name = "addAllBatch")
        public final void addAllBatch(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllBatch(iterable0);
        }

        @i(name = "addBatch")
        public final void addBatch(DslList dslList0, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "value");
            this._builder.addBatch(diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        @i(name = "clearBatch")
        public final void clearBatch(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearBatch();
        }

        public final DslList getBatch() {
            List list0 = this._builder.getBatchList();
            L.o(list0, "_builder.getBatchList()");
            return new DslList(list0);
        }

        @i(name = "plusAssignAllBatch")
        public final void plusAssignAllBatch(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllBatch(dslList0, iterable0);
        }

        @i(name = "plusAssignBatch")
        public final void plusAssignBatch(DslList dslList0, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "value");
            this.addBatch(dslList0, diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        @i(name = "setBatch")
        public final void setBatch(DslList dslList0, int v, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "value");
            this._builder.setBatch(v, diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }
    }

    @l
    public static final DiagnosticEventRequestKt INSTANCE;

    static {
        DiagnosticEventRequestKt.INSTANCE = new DiagnosticEventRequestKt();
    }
}

