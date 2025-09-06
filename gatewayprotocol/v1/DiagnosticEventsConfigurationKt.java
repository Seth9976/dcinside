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

public final class DiagnosticEventsConfigurationKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class AllowedEventsProxy extends DslProxy {
        }

        public static final class BlockedEventsProxy extends DslProxy {
        }

        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0) {
                L.p(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0) {
            this._builder = nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0, w w0) {
            this(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0);
        }

        @b0
        public final DiagnosticEventsConfiguration _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DiagnosticEventsConfiguration)generatedMessageLite0;
        }

        @i(name = "addAllAllowedEvents")
        public final void addAllAllowedEvents(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllAllowedEvents(iterable0);
        }

        @i(name = "addAllBlockedEvents")
        public final void addAllBlockedEvents(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllBlockedEvents(iterable0);
        }

        @i(name = "addAllowedEvents")
        public final void addAllowedEvents(DslList dslList0, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this._builder.addAllowedEvents(diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "addBlockedEvents")
        public final void addBlockedEvents(DslList dslList0, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this._builder.addBlockedEvents(diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "clearAllowedEvents")
        public final void clearAllowedEvents(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearAllowedEvents();
        }

        @i(name = "clearBlockedEvents")
        public final void clearBlockedEvents(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final DslList getAllowedEvents() {
            List list0 = this._builder.getAllowedEventsList();
            L.o(list0, "_builder.getAllowedEventsList()");
            return new DslList(list0);
        }

        public final DslList getBlockedEvents() {
            List list0 = this._builder.getBlockedEventsList();
            L.o(list0, "_builder.getBlockedEventsList()");
            return new DslList(list0);
        }

        @i(name = "getEnabled")
        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        @i(name = "getMaxBatchIntervalMs")
        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        @i(name = "getMaxBatchSize")
        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        @l
        @i(name = "getSeverity")
        public final DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventsSeverity diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0 = this._builder.getSeverity();
            L.o(diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0, "_builder.getSeverity()");
            return diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0;
        }

        @i(name = "getSeverityValue")
        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        @i(name = "getTtmEnabled")
        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        @i(name = "plusAssignAllAllowedEvents")
        public final void plusAssignAllAllowedEvents(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllAllowedEvents(dslList0, iterable0);
        }

        @i(name = "plusAssignAllBlockedEvents")
        public final void plusAssignAllBlockedEvents(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllBlockedEvents(dslList0, iterable0);
        }

        @i(name = "plusAssignAllowedEvents")
        public final void plusAssignAllowedEvents(DslList dslList0, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this.addAllowedEvents(dslList0, diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "plusAssignBlockedEvents")
        public final void plusAssignBlockedEvents(DslList dslList0, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this.addBlockedEvents(dslList0, diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "setAllowedEvents")
        public final void setAllowedEvents(DslList dslList0, int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this._builder.setAllowedEvents(v, diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "setBlockedEvents")
        public final void setBlockedEvents(DslList dslList0, int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this._builder.setBlockedEvents(v, diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "setEnabled")
        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        @i(name = "setMaxBatchIntervalMs")
        public final void setMaxBatchIntervalMs(int v) {
            this._builder.setMaxBatchIntervalMs(v);
        }

        @i(name = "setMaxBatchSize")
        public final void setMaxBatchSize(int v) {
            this._builder.setMaxBatchSize(v);
        }

        @i(name = "setSeverity")
        public final void setSeverity(@l DiagnosticEventsSeverity diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0) {
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0, "value");
            this._builder.setSeverity(diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0);
        }

        @i(name = "setSeverityValue")
        public final void setSeverityValue(int v) {
            this._builder.setSeverityValue(v);
        }

        @i(name = "setTtmEnabled")
        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }
    }

    @l
    public static final DiagnosticEventsConfigurationKt INSTANCE;

    static {
        DiagnosticEventsConfigurationKt.INSTANCE = new DiagnosticEventsConfigurationKt();
    }
}

