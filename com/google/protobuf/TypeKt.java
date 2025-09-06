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

public final class TypeKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder type$Builder0) {
                L.p(type$Builder0, "builder");
                return new Dsl(type$Builder0, null);
            }
        }

        public static final class FieldsProxy extends DslProxy {
        }

        public static final class OneofsProxy extends DslProxy {
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

        private Dsl(Builder type$Builder0) {
            this._builder = type$Builder0;
        }

        public Dsl(Builder type$Builder0, w w0) {
            this(type$Builder0);
        }

        @b0
        public final Type _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Type)generatedMessageLite0;
        }

        @i(name = "addAllFields")
        public final void addAllFields(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllFields(iterable0);
        }

        @i(name = "addAllOneofs")
        public final void addAllOneofs(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOneofs(iterable0);
        }

        @i(name = "addAllOptions")
        public final void addAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOptions(iterable0);
        }

        @i(name = "addFields")
        public final void addFields(DslList dslList0, Field field0) {
            L.p(dslList0, "<this>");
            L.p(field0, "value");
            this._builder.addFields(field0);
        }

        @i(name = "addOneofs")
        public final void addOneofs(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.addOneofs(s);
        }

        @i(name = "addOptions")
        public final void addOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.addOptions(option0);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        @i(name = "clearFields")
        public final void clearFields(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        @i(name = "clearOneofs")
        public final void clearOneofs(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOneofs();
        }

        @i(name = "clearOptions")
        public final void clearOptions(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        @l
        @i(name = "getEdition")
        public final String getEdition() {
            String s = this._builder.getEdition();
            L.o(s, "_builder.getEdition()");
            return s;
        }

        public final DslList getFields() {
            List list0 = this._builder.getFieldsList();
            L.o(list0, "_builder.getFieldsList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getName")
        public final String getName() {
            String s = this._builder.getName();
            L.o(s, "_builder.getName()");
            return s;
        }

        @l
        public final DslList getOneofs() {
            List list0 = this._builder.getOneofsList();
            L.o(list0, "_builder.getOneofsList()");
            return new DslList(list0);
        }

        public final DslList getOptions() {
            List list0 = this._builder.getOptionsList();
            L.o(list0, "_builder.getOptionsList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getSourceContext")
        public final SourceContext getSourceContext() {
            SourceContext sourceContext0 = this._builder.getSourceContext();
            L.o(sourceContext0, "_builder.getSourceContext()");
            return sourceContext0;
        }

        @l
        @i(name = "getSyntax")
        public final Syntax getSyntax() {
            Syntax syntax0 = this._builder.getSyntax();
            L.o(syntax0, "_builder.getSyntax()");
            return syntax0;
        }

        @i(name = "getSyntaxValue")
        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        @i(name = "plusAssignAllFields")
        public final void plusAssignAllFields(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllFields(dslList0, iterable0);
        }

        @i(name = "plusAssignAllOneofs")
        public final void plusAssignAllOneofs(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOneofs(dslList0, iterable0);
        }

        @i(name = "plusAssignAllOptions")
        public final void plusAssignAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOptions(dslList0, iterable0);
        }

        @i(name = "plusAssignFields")
        public final void plusAssignFields(DslList dslList0, Field field0) {
            L.p(dslList0, "<this>");
            L.p(field0, "value");
            this.addFields(dslList0, field0);
        }

        @i(name = "plusAssignOneofs")
        public final void plusAssignOneofs(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this.addOneofs(dslList0, s);
        }

        @i(name = "plusAssignOptions")
        public final void plusAssignOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this.addOptions(dslList0, option0);
        }

        @i(name = "setEdition")
        public final void setEdition(@l String s) {
            L.p(s, "value");
            this._builder.setEdition(s);
        }

        @i(name = "setFields")
        public final void setFields(DslList dslList0, int v, Field field0) {
            L.p(dslList0, "<this>");
            L.p(field0, "value");
            this._builder.setFields(v, field0);
        }

        @i(name = "setName")
        public final void setName(@l String s) {
            L.p(s, "value");
            this._builder.setName(s);
        }

        @i(name = "setOneofs")
        public final void setOneofs(DslList dslList0, int v, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.setOneofs(v, s);
        }

        @i(name = "setOptions")
        public final void setOptions(DslList dslList0, int v, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.setOptions(v, option0);
        }

        @i(name = "setSourceContext")
        public final void setSourceContext(@l SourceContext sourceContext0) {
            L.p(sourceContext0, "value");
            this._builder.setSourceContext(sourceContext0);
        }

        @i(name = "setSyntax")
        public final void setSyntax(@l Syntax syntax0) {
            L.p(syntax0, "value");
            this._builder.setSyntax(syntax0);
        }

        @i(name = "setSyntaxValue")
        public final void setSyntaxValue(int v) {
            this._builder.setSyntaxValue(v);
        }
    }

    @l
    public static final TypeKt INSTANCE;

    static {
        TypeKt.INSTANCE = new TypeKt();
    }
}

