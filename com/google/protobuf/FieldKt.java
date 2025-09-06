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

public final class FieldKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder field$Builder0) {
                L.p(field$Builder0, "builder");
                return new Dsl(field$Builder0, null);
            }
        }

        public static final class OptionsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder field$Builder0) {
            this._builder = field$Builder0;
        }

        public Dsl(Builder field$Builder0, w w0) {
            this(field$Builder0);
        }

        @b0
        public final Field _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Field)generatedMessageLite0;
        }

        @i(name = "addAllOptions")
        public final void addAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOptions(iterable0);
        }

        @i(name = "addOptions")
        public final void addOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.addOptions(option0);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        @i(name = "clearOptions")
        public final void clearOptions(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        @l
        @i(name = "getCardinality")
        public final Cardinality getCardinality() {
            Cardinality field$Cardinality0 = this._builder.getCardinality();
            L.o(field$Cardinality0, "_builder.getCardinality()");
            return field$Cardinality0;
        }

        @i(name = "getCardinalityValue")
        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        @l
        @i(name = "getDefaultValue")
        public final String getDefaultValue() {
            String s = this._builder.getDefaultValue();
            L.o(s, "_builder.getDefaultValue()");
            return s;
        }

        @l
        @i(name = "getJsonName")
        public final String getJsonName() {
            String s = this._builder.getJsonName();
            L.o(s, "_builder.getJsonName()");
            return s;
        }

        @l
        @i(name = "getKind")
        public final Kind getKind() {
            Kind field$Kind0 = this._builder.getKind();
            L.o(field$Kind0, "_builder.getKind()");
            return field$Kind0;
        }

        @i(name = "getKindValue")
        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        @l
        @i(name = "getName")
        public final String getName() {
            String s = this._builder.getName();
            L.o(s, "_builder.getName()");
            return s;
        }

        @i(name = "getNumber")
        public final int getNumber() {
            return this._builder.getNumber();
        }

        @i(name = "getOneofIndex")
        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final DslList getOptions() {
            List list0 = this._builder.getOptionsList();
            L.o(list0, "_builder.getOptionsList()");
            return new DslList(list0);
        }

        @i(name = "getPacked")
        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        @l
        @i(name = "getTypeUrl")
        public final String getTypeUrl() {
            String s = this._builder.getTypeUrl();
            L.o(s, "_builder.getTypeUrl()");
            return s;
        }

        @i(name = "plusAssignAllOptions")
        public final void plusAssignAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOptions(dslList0, iterable0);
        }

        @i(name = "plusAssignOptions")
        public final void plusAssignOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this.addOptions(dslList0, option0);
        }

        @i(name = "setCardinality")
        public final void setCardinality(@l Cardinality field$Cardinality0) {
            L.p(field$Cardinality0, "value");
            this._builder.setCardinality(field$Cardinality0);
        }

        @i(name = "setCardinalityValue")
        public final void setCardinalityValue(int v) {
            this._builder.setCardinalityValue(v);
        }

        @i(name = "setDefaultValue")
        public final void setDefaultValue(@l String s) {
            L.p(s, "value");
            this._builder.setDefaultValue(s);
        }

        @i(name = "setJsonName")
        public final void setJsonName(@l String s) {
            L.p(s, "value");
            this._builder.setJsonName(s);
        }

        @i(name = "setKind")
        public final void setKind(@l Kind field$Kind0) {
            L.p(field$Kind0, "value");
            this._builder.setKind(field$Kind0);
        }

        @i(name = "setKindValue")
        public final void setKindValue(int v) {
            this._builder.setKindValue(v);
        }

        @i(name = "setName")
        public final void setName(@l String s) {
            L.p(s, "value");
            this._builder.setName(s);
        }

        @i(name = "setNumber")
        public final void setNumber(int v) {
            this._builder.setNumber(v);
        }

        @i(name = "setOneofIndex")
        public final void setOneofIndex(int v) {
            this._builder.setOneofIndex(v);
        }

        @i(name = "setOptions")
        public final void setOptions(DslList dslList0, int v, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.setOptions(v, option0);
        }

        @i(name = "setPacked")
        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        @i(name = "setTypeUrl")
        public final void setTypeUrl(@l String s) {
            L.p(s, "value");
            this._builder.setTypeUrl(s);
        }
    }

    @l
    public static final FieldKt INSTANCE;

    static {
        FieldKt.INSTANCE = new FieldKt();
    }
}

