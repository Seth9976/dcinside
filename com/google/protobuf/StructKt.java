package com.google.protobuf;

import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class StructKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder struct$Builder0) {
                L.p(struct$Builder0, "builder");
                return new Dsl(struct$Builder0, null);
            }
        }

        public static final class FieldsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder struct$Builder0) {
            this._builder = struct$Builder0;
        }

        public Dsl(Builder struct$Builder0, w w0) {
            this(struct$Builder0);
        }

        @b0
        public final Struct _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Struct)generatedMessageLite0;
        }

        @i(name = "clearFields")
        public final void clearFields(DslMap dslMap0) {
            L.p(dslMap0, "<this>");
            this._builder.clearFields();
        }

        @i(name = "getFieldsMap")
        public final DslMap getFieldsMap() {
            Map map0 = this._builder.getFieldsMap();
            L.o(map0, "_builder.getFieldsMap()");
            return new DslMap(map0);
        }

        @i(name = "putAllFields")
        public final void putAllFields(DslMap dslMap0, Map map0) {
            L.p(dslMap0, "<this>");
            L.p(map0, "map");
            this._builder.putAllFields(map0);
        }

        @i(name = "putFields")
        public final void putFields(@l DslMap dslMap0, @l String s, @l Value value0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(value0, "value");
            this._builder.putFields(s, value0);
        }

        @i(name = "removeFields")
        public final void removeFields(DslMap dslMap0, String s) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.removeFields(s);
        }

        @i(name = "setFields")
        public final void setFields(DslMap dslMap0, String s, Value value0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(value0, "value");
            this.putFields(dslMap0, s, value0);
        }
    }

    @l
    public static final StructKt INSTANCE;

    static {
        StructKt.INSTANCE = new StructKt();
    }
}

