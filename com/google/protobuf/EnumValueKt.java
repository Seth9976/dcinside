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

public final class EnumValueKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder enumValue$Builder0) {
                L.p(enumValue$Builder0, "builder");
                return new Dsl(enumValue$Builder0, null);
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

        private Dsl(Builder enumValue$Builder0) {
            this._builder = enumValue$Builder0;
        }

        public Dsl(Builder enumValue$Builder0, w w0) {
            this(enumValue$Builder0);
        }

        @b0
        public final EnumValue _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (EnumValue)generatedMessageLite0;
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

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        @i(name = "clearOptions")
        public final void clearOptions(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearOptions();
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

        public final DslList getOptions() {
            List list0 = this._builder.getOptionsList();
            L.o(list0, "_builder.getOptionsList()");
            return new DslList(list0);
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

        @i(name = "setNumber")
        public final void setNumber(int v) {
            this._builder.setNumber(v);
        }

        @i(name = "setOptions")
        public final void setOptions(DslList dslList0, int v, Option option0) {
            L.p(dslList0, "<this>");
            L.p(option0, "value");
            this._builder.setOptions(v, option0);
        }
    }

    @l
    public static final EnumValueKt INSTANCE;

    static {
        EnumValueKt.INSTANCE = new EnumValueKt();
    }
}

