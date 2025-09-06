package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class ValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder value$Builder0) {
                L.p(value$Builder0, "builder");
                return new Dsl(value$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder value$Builder0) {
            this._builder = value$Builder0;
        }

        public Dsl(Builder value$Builder0, w w0) {
            this(value$Builder0);
        }

        @b0
        public final Value _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Value)generatedMessageLite0;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        @i(name = "getBoolValue")
        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        @l
        @i(name = "getKindCase")
        public final KindCase getKindCase() {
            KindCase value$KindCase0 = this._builder.getKindCase();
            L.o(value$KindCase0, "_builder.getKindCase()");
            return value$KindCase0;
        }

        @l
        @i(name = "getListValue")
        public final ListValue getListValue() {
            ListValue listValue0 = this._builder.getListValue();
            L.o(listValue0, "_builder.getListValue()");
            return listValue0;
        }

        @l
        @i(name = "getNullValue")
        public final NullValue getNullValue() {
            NullValue nullValue0 = this._builder.getNullValue();
            L.o(nullValue0, "_builder.getNullValue()");
            return nullValue0;
        }

        @i(name = "getNullValueValue")
        public final int getNullValueValue() {
            return this._builder.getNullValueValue();
        }

        @i(name = "getNumberValue")
        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        @l
        @i(name = "getStringValue")
        public final String getStringValue() {
            String s = this._builder.getStringValue();
            L.o(s, "_builder.getStringValue()");
            return s;
        }

        @l
        @i(name = "getStructValue")
        public final Struct getStructValue() {
            Struct struct0 = this._builder.getStructValue();
            L.o(struct0, "_builder.getStructValue()");
            return struct0;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        @i(name = "setBoolValue")
        public final void setBoolValue(boolean z) {
            this._builder.setBoolValue(z);
        }

        @i(name = "setListValue")
        public final void setListValue(@l ListValue listValue0) {
            L.p(listValue0, "value");
            this._builder.setListValue(listValue0);
        }

        @i(name = "setNullValue")
        public final void setNullValue(@l NullValue nullValue0) {
            L.p(nullValue0, "value");
            this._builder.setNullValue(nullValue0);
        }

        @i(name = "setNullValueValue")
        public final void setNullValueValue(int v) {
            this._builder.setNullValueValue(v);
        }

        @i(name = "setNumberValue")
        public final void setNumberValue(double f) {
            this._builder.setNumberValue(f);
        }

        @i(name = "setStringValue")
        public final void setStringValue(@l String s) {
            L.p(s, "value");
            this._builder.setStringValue(s);
        }

        @i(name = "setStructValue")
        public final void setStructValue(@l Struct struct0) {
            L.p(struct0, "value");
            this._builder.setStructValue(struct0);
        }
    }

    @l
    public static final ValueKt INSTANCE;

    static {
        ValueKt.INSTANCE = new ValueKt();
    }
}

