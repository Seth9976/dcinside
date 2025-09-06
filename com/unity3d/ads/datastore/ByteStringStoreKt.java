package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class ByteStringStoreKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder byteStringStoreOuterClass$ByteStringStore$Builder0) {
                L.p(byteStringStoreOuterClass$ByteStringStore$Builder0, "builder");
                return new Dsl(byteStringStoreOuterClass$ByteStringStore$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder byteStringStoreOuterClass$ByteStringStore$Builder0) {
            this._builder = byteStringStoreOuterClass$ByteStringStore$Builder0;
        }

        public Dsl(Builder byteStringStoreOuterClass$ByteStringStore$Builder0, w w0) {
            this(byteStringStoreOuterClass$ByteStringStore$Builder0);
        }

        @b0
        public final ByteStringStore _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (ByteStringStore)generatedMessageLite0;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        @l
        @i(name = "getData")
        public final ByteString getData() {
            ByteString byteString0 = this._builder.getData();
            L.o(byteString0, "_builder.getData()");
            return byteString0;
        }

        @i(name = "setData")
        public final void setData(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setData(byteString0);
        }
    }

    @l
    public static final ByteStringStoreKt INSTANCE;

    static {
        ByteStringStoreKt.INSTANCE = new ByteStringStoreKt();
    }
}

