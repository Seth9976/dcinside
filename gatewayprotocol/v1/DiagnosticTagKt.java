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

public final class DiagnosticTagKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder diagnosticEventRequestOuterClass$DiagnosticTag$Builder0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticTag$Builder0, "builder");
                return new Dsl(diagnosticEventRequestOuterClass$DiagnosticTag$Builder0, null);
            }
        }

        public static final class TagTypeProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticTag$Builder0) {
            this._builder = diagnosticEventRequestOuterClass$DiagnosticTag$Builder0;
        }

        public Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticTag$Builder0, w w0) {
            this(diagnosticEventRequestOuterClass$DiagnosticTag$Builder0);
        }

        @b0
        public final DiagnosticTag _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DiagnosticTag)generatedMessageLite0;
        }

        @i(name = "addAllTagType")
        public final void addAllTagType(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllTagType(iterable0);
        }

        @i(name = "addTagType")
        public final void addTagType(DslList dslList0, DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticTagType0, "value");
            this._builder.addTagType(diagnosticEventRequestOuterClass$DiagnosticTagType0);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        @i(name = "clearTagType")
        public final void clearTagType(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearTagType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getCustomTagType")
        public final String getCustomTagType() {
            String s = this._builder.getCustomTagType();
            L.o(s, "_builder.getCustomTagType()");
            return s;
        }

        @i(name = "getIntValue")
        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        @l
        @i(name = "getStringValue")
        public final String getStringValue() {
            String s = this._builder.getStringValue();
            L.o(s, "_builder.getStringValue()");
            return s;
        }

        public final DslList getTagType() {
            List list0 = this._builder.getTagTypeList();
            L.o(list0, "_builder.getTagTypeList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getValueCase")
        public final ValueCase getValueCase() {
            ValueCase diagnosticEventRequestOuterClass$DiagnosticTag$ValueCase0 = this._builder.getValueCase();
            L.o(diagnosticEventRequestOuterClass$DiagnosticTag$ValueCase0, "_builder.getValueCase()");
            return diagnosticEventRequestOuterClass$DiagnosticTag$ValueCase0;
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        @i(name = "plusAssignAllTagType")
        public final void plusAssignAllTagType(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllTagType(dslList0, iterable0);
        }

        @i(name = "plusAssignTagType")
        public final void plusAssignTagType(DslList dslList0, DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticTagType0, "value");
            this.addTagType(dslList0, diagnosticEventRequestOuterClass$DiagnosticTagType0);
        }

        @i(name = "setCustomTagType")
        public final void setCustomTagType(@l String s) {
            L.p(s, "value");
            this._builder.setCustomTagType(s);
        }

        @i(name = "setIntValue")
        public final void setIntValue(int v) {
            this._builder.setIntValue(v);
        }

        @i(name = "setStringValue")
        public final void setStringValue(@l String s) {
            L.p(s, "value");
            this._builder.setStringValue(s);
        }

        @i(name = "setTagType")
        public final void setTagType(DslList dslList0, int v, DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
            L.p(dslList0, "<this>");
            L.p(diagnosticEventRequestOuterClass$DiagnosticTagType0, "value");
            this._builder.setTagType(v, diagnosticEventRequestOuterClass$DiagnosticTagType0);
        }
    }

    @l
    public static final DiagnosticTagKt INSTANCE;

    static {
        DiagnosticTagKt.INSTANCE = new DiagnosticTagKt();
    }
}

