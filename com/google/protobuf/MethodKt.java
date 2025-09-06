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

public final class MethodKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder method$Builder0) {
                L.p(method$Builder0, "builder");
                return new Dsl(method$Builder0, null);
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

        private Dsl(Builder method$Builder0) {
            this._builder = method$Builder0;
        }

        public Dsl(Builder method$Builder0, w w0) {
            this(method$Builder0);
        }

        @b0
        public final Method _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Method)generatedMessageLite0;
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

        public final void clearName() {
            this._builder.clearName();
        }

        @i(name = "clearOptions")
        public final void clearOptions(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
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

        @i(name = "getRequestStreaming")
        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        @l
        @i(name = "getRequestTypeUrl")
        public final String getRequestTypeUrl() {
            String s = this._builder.getRequestTypeUrl();
            L.o(s, "_builder.getRequestTypeUrl()");
            return s;
        }

        @i(name = "getResponseStreaming")
        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        @l
        @i(name = "getResponseTypeUrl")
        public final String getResponseTypeUrl() {
            String s = this._builder.getResponseTypeUrl();
            L.o(s, "_builder.getResponseTypeUrl()");
            return s;
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

        @i(name = "setRequestStreaming")
        public final void setRequestStreaming(boolean z) {
            this._builder.setRequestStreaming(z);
        }

        @i(name = "setRequestTypeUrl")
        public final void setRequestTypeUrl(@l String s) {
            L.p(s, "value");
            this._builder.setRequestTypeUrl(s);
        }

        @i(name = "setResponseStreaming")
        public final void setResponseStreaming(boolean z) {
            this._builder.setResponseStreaming(z);
        }

        @i(name = "setResponseTypeUrl")
        public final void setResponseTypeUrl(@l String s) {
            L.p(s, "value");
            this._builder.setResponseTypeUrl(s);
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
    public static final MethodKt INSTANCE;

    static {
        MethodKt.INSTANCE = new MethodKt();
    }
}

