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

public final class EnumKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder enum$Builder0) {
                L.p(enum$Builder0, "builder");
                return new Dsl(enum$Builder0, null);
            }
        }

        public static final class EnumvalueProxy extends DslProxy {
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

        private Dsl(Builder enum$Builder0) {
            this._builder = enum$Builder0;
        }

        public Dsl(Builder enum$Builder0, w w0) {
            this(enum$Builder0);
        }

        @b0
        public final Enum _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Enum)generatedMessageLite0;
        }

        @i(name = "addAllEnumvalue")
        public final void addAllEnumvalue(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllEnumvalue(iterable0);
        }

        @i(name = "addAllOptions")
        public final void addAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOptions(iterable0);
        }

        @i(name = "addEnumvalue")
        public final void addEnumvalue(DslList dslList0, EnumValue enumValue0) {
            L.p(dslList0, "<this>");
            L.p(enumValue0, "value");
            this._builder.addEnumvalue(enumValue0);
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

        @i(name = "clearEnumvalue")
        public final void clearEnumvalue(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final DslList getEnumvalue() {
            List list0 = this._builder.getEnumvalueList();
            L.o(list0, "_builder.getEnumvalueList()");
            return new DslList(list0);
        }

        @l
        @i(name = "getName")
        public final String getName() {
            String s = this._builder.getName();
            L.o(s, "_builder.getName()");
            return s;
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

        @i(name = "plusAssignAllEnumvalue")
        public final void plusAssignAllEnumvalue(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllEnumvalue(dslList0, iterable0);
        }

        @i(name = "plusAssignAllOptions")
        public final void plusAssignAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOptions(dslList0, iterable0);
        }

        @i(name = "plusAssignEnumvalue")
        public final void plusAssignEnumvalue(DslList dslList0, EnumValue enumValue0) {
            L.p(dslList0, "<this>");
            L.p(enumValue0, "value");
            this.addEnumvalue(dslList0, enumValue0);
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

        @i(name = "setEnumvalue")
        public final void setEnumvalue(DslList dslList0, int v, EnumValue enumValue0) {
            L.p(dslList0, "<this>");
            L.p(enumValue0, "value");
            this._builder.setEnumvalue(v, enumValue0);
        }

        @i(name = "setName")
        public final void setName(@l String s) {
            L.p(s, "value");
            this._builder.setName(s);
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
    public static final EnumKt INSTANCE;

    static {
        EnumKt.INSTANCE = new EnumKt();
    }
}

