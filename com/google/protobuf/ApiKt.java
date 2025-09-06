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

public final class ApiKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder api$Builder0) {
                L.p(api$Builder0, "builder");
                return new Dsl(api$Builder0, null);
            }
        }

        public static final class MethodsProxy extends DslProxy {
        }

        public static final class MixinsProxy extends DslProxy {
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

        private Dsl(Builder api$Builder0) {
            this._builder = api$Builder0;
        }

        public Dsl(Builder api$Builder0, w w0) {
            this(api$Builder0);
        }

        @b0
        public final Api _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Api)generatedMessageLite0;
        }

        @i(name = "addAllMethods")
        public final void addAllMethods(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllMethods(iterable0);
        }

        @i(name = "addAllMixins")
        public final void addAllMixins(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllMixins(iterable0);
        }

        @i(name = "addAllOptions")
        public final void addAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllOptions(iterable0);
        }

        @i(name = "addMethods")
        public final void addMethods(DslList dslList0, Method method0) {
            L.p(dslList0, "<this>");
            L.p(method0, "value");
            this._builder.addMethods(method0);
        }

        @i(name = "addMixins")
        public final void addMixins(DslList dslList0, Mixin mixin0) {
            L.p(dslList0, "<this>");
            L.p(mixin0, "value");
            this._builder.addMixins(mixin0);
        }

        @i(name = "addOptions")
        public final void addOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.addOptions(option0);
        }

        @i(name = "clearMethods")
        public final void clearMethods(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearMethods();
        }

        @i(name = "clearMixins")
        public final void clearMixins(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearMixins();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final DslList getMethods() {
            List list0 = this._builder.getMethodsList();
            L.o(list0, "_builder.getMethodsList()");
            return new DslList(list0);
        }

        public final DslList getMixins() {
            List list0 = this._builder.getMixinsList();
            L.o(list0, "_builder.getMixinsList()");
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

        @l
        @i(name = "getVersion")
        public final String getVersion() {
            String s = this._builder.getVersion();
            L.o(s, "_builder.getVersion()");
            return s;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        @i(name = "plusAssignAllMethods")
        public final void plusAssignAllMethods(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllMethods(dslList0, iterable0);
        }

        @i(name = "plusAssignAllMixins")
        public final void plusAssignAllMixins(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllMixins(dslList0, iterable0);
        }

        @i(name = "plusAssignAllOptions")
        public final void plusAssignAllOptions(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllOptions(dslList0, iterable0);
        }

        @i(name = "plusAssignMethods")
        public final void plusAssignMethods(DslList dslList0, Method method0) {
            L.p(dslList0, "<this>");
            L.p(method0, "value");
            this.addMethods(dslList0, method0);
        }

        @i(name = "plusAssignMixins")
        public final void plusAssignMixins(DslList dslList0, Mixin mixin0) {
            L.p(dslList0, "<this>");
            L.p(mixin0, "value");
            this.addMixins(dslList0, mixin0);
        }

        @i(name = "plusAssignOptions")
        public final void plusAssignOptions(DslList dslList0, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this.addOptions(dslList0, option0);
        }

        @i(name = "setMethods")
        public final void setMethods(DslList dslList0, int v, Method method0) {
            L.p(dslList0, "<this>");
            L.p(method0, "value");
            this._builder.setMethods(v, method0);
        }

        @i(name = "setMixins")
        public final void setMixins(DslList dslList0, int v, Mixin mixin0) {
            L.p(dslList0, "<this>");
            L.p(mixin0, "value");
            this._builder.setMixins(v, mixin0);
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

        @i(name = "setVersion")
        public final void setVersion(@l String s) {
            L.p(s, "value");
            this._builder.setVersion(s);
        }
    }

    @l
    public static final ApiKt INSTANCE;

    static {
        ApiKt.INSTANCE = new ApiKt();
    }
}

