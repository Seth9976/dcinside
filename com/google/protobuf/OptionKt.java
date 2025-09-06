package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class OptionKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder option$Builder0) {
                L.p(option$Builder0, "builder");
                return new Dsl(option$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder option$Builder0) {
            this._builder = option$Builder0;
        }

        public Dsl(Builder option$Builder0, w w0) {
            this(option$Builder0);
        }

        @b0
        public final Option _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Option)generatedMessageLite0;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getName")
        public final String getName() {
            String s = this._builder.getName();
            L.o(s, "_builder.getName()");
            return s;
        }

        @l
        @i(name = "getValue")
        public final Any getValue() {
            Any any0 = this._builder.getValue();
            L.o(any0, "_builder.getValue()");
            return any0;
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        @i(name = "setName")
        public final void setName(@l String s) {
            L.p(s, "value");
            this._builder.setName(s);
        }

        @i(name = "setValue")
        public final void setValue(@l Any any0) {
            L.p(any0, "value");
            this._builder.setValue(any0);
        }
    }

    @l
    public static final OptionKt INSTANCE;

    static {
        OptionKt.INSTANCE = new OptionKt();
    }
}

