package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class UniversalRequestStoreKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0) {
                L.p(universalRequestStoreOuterClass$UniversalRequestStore$Builder0, "builder");
                return new Dsl(universalRequestStoreOuterClass$UniversalRequestStore$Builder0, null);
            }
        }

        public static final class UniversalRequestMapProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0) {
            this._builder = universalRequestStoreOuterClass$UniversalRequestStore$Builder0;
        }

        public Dsl(Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0, w w0) {
            this(universalRequestStoreOuterClass$UniversalRequestStore$Builder0);
        }

        @b0
        public final UniversalRequestStore _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (UniversalRequestStore)generatedMessageLite0;
        }

        @i(name = "clearUniversalRequestMap")
        public final void clearUniversalRequestMap(DslMap dslMap0) {
            L.p(dslMap0, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        @i(name = "getUniversalRequestMapMap")
        public final DslMap getUniversalRequestMapMap() {
            Map map0 = this._builder.getUniversalRequestMapMap();
            L.o(map0, "_builder.getUniversalRequestMapMap()");
            return new DslMap(map0);
        }

        @i(name = "putAllUniversalRequestMap")
        public final void putAllUniversalRequestMap(DslMap dslMap0, Map map0) {
            L.p(dslMap0, "<this>");
            L.p(map0, "map");
            this._builder.putAllUniversalRequestMap(map0);
        }

        @i(name = "putUniversalRequestMap")
        public final void putUniversalRequestMap(@l DslMap dslMap0, @l String s, @l ByteString byteString0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(byteString0, "value");
            this._builder.putUniversalRequestMap(s, byteString0);
        }

        @i(name = "removeUniversalRequestMap")
        public final void removeUniversalRequestMap(DslMap dslMap0, String s) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.removeUniversalRequestMap(s);
        }

        @i(name = "setUniversalRequestMap")
        public final void setUniversalRequestMap(DslMap dslMap0, String s, ByteString byteString0) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(byteString0, "value");
            this.putUniversalRequestMap(dslMap0, s, byteString0);
        }
    }

    @l
    public static final UniversalRequestStoreKt INSTANCE;

    static {
        UniversalRequestStoreKt.INSTANCE = new UniversalRequestStoreKt();
    }
}

