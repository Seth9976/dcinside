package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class MixinKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder mixin$Builder0) {
                L.p(mixin$Builder0, "builder");
                return new Dsl(mixin$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder mixin$Builder0) {
            this._builder = mixin$Builder0;
        }

        public Dsl(Builder mixin$Builder0, w w0) {
            this(mixin$Builder0);
        }

        @b0
        public final Mixin _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Mixin)generatedMessageLite0;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        @l
        @i(name = "getName")
        public final String getName() {
            String s = this._builder.getName();
            L.o(s, "_builder.getName()");
            return s;
        }

        @l
        @i(name = "getRoot")
        public final String getRoot() {
            String s = this._builder.getRoot();
            L.o(s, "_builder.getRoot()");
            return s;
        }

        @i(name = "setName")
        public final void setName(@l String s) {
            L.p(s, "value");
            this._builder.setName(s);
        }

        @i(name = "setRoot")
        public final void setRoot(@l String s) {
            L.p(s, "value");
            this._builder.setRoot(s);
        }
    }

    @l
    public static final MixinKt INSTANCE;

    static {
        MixinKt.INSTANCE = new MixinKt();
    }
}

