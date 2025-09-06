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

public final class FieldMaskKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder fieldMask$Builder0) {
                L.p(fieldMask$Builder0, "builder");
                return new Dsl(fieldMask$Builder0, null);
            }
        }

        public static final class PathsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder fieldMask$Builder0) {
            this._builder = fieldMask$Builder0;
        }

        public Dsl(Builder fieldMask$Builder0, w w0) {
            this(fieldMask$Builder0);
        }

        @b0
        public final FieldMask _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (FieldMask)generatedMessageLite0;
        }

        @i(name = "addAllPaths")
        public final void addAllPaths(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllPaths(iterable0);
        }

        @i(name = "addPaths")
        public final void addPaths(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.addPaths(s);
        }

        @i(name = "clearPaths")
        public final void clearPaths(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearPaths();
        }

        @l
        public final DslList getPaths() {
            List list0 = this._builder.getPathsList();
            L.o(list0, "_builder.getPathsList()");
            return new DslList(list0);
        }

        @i(name = "plusAssignAllPaths")
        public final void plusAssignAllPaths(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllPaths(dslList0, iterable0);
        }

        @i(name = "plusAssignPaths")
        public final void plusAssignPaths(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this.addPaths(dslList0, s);
        }

        @i(name = "setPaths")
        public final void setPaths(DslList dslList0, int v, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.setPaths(v, s);
        }
    }

    @l
    public static final FieldMaskKt INSTANCE;

    static {
        FieldMaskKt.INSTANCE = new FieldMaskKt();
    }
}

