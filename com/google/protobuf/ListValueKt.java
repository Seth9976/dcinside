package com.google.protobuf;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class ListValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder listValue$Builder0) {
                L.p(listValue$Builder0, "builder");
                return new Dsl(listValue$Builder0, null);
            }
        }

        public static final class ValuesProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder listValue$Builder0) {
            this._builder = listValue$Builder0;
        }

        public Dsl(Builder listValue$Builder0, w w0) {
            this(listValue$Builder0);
        }

        @b0
        public final ListValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (ListValue)generatedMessageLite0;
        }

        @i(name = "addAllValues")
        public final void addAllValues(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllValues(iterable0);
        }

        @i(name = "addValues")
        public final void addValues(DslList dslList0, Value value0) {
            L.p(dslList0, "<this>");
            L.p(value0, "value");
            this._builder.addValues(value0);
        }

        @i(name = "clearValues")
        public final void clearValues(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearValues();
        }

        public final DslList getValues() {
            List list0 = this._builder.getValuesList();
            L.o(list0, "_builder.getValuesList()");
            return new DslList(list0);
        }

        @i(name = "plusAssignAllValues")
        public final void plusAssignAllValues(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllValues(dslList0, iterable0);
        }

        @i(name = "plusAssignValues")
        public final void plusAssignValues(DslList dslList0, Value value0) {
            L.p(dslList0, "<this>");
            L.p(value0, "value");
            this.addValues(dslList0, value0);
        }

        @i(name = "setValues")
        public final void setValues(DslList dslList0, int v, Value value0) {
            L.p(dslList0, "<this>");
            L.p(value0, "value");
            this._builder.setValues(v, value0);
        }
    }

    @l
    public static final ListValueKt INSTANCE;

    static {
        ListValueKt.INSTANCE = new ListValueKt();
    }
}

