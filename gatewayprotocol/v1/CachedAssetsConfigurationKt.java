package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class CachedAssetsConfigurationKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0) {
                L.p(nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0, "builder");
                return new Dsl(nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0) {
            this._builder = nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0;
        }

        public Dsl(Builder nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0, w w0) {
            this(nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0);
        }

        @b0
        public final CachedAssetsConfiguration _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (CachedAssetsConfiguration)generatedMessageLite0;
        }

        public final void clearMaxCachedAssetAgeMs() {
            this._builder.clearMaxCachedAssetAgeMs();
        }

        public final void clearMaxCachedAssetSizeMb() {
            this._builder.clearMaxCachedAssetSizeMb();
        }

        @i(name = "getMaxCachedAssetAgeMs")
        public final long getMaxCachedAssetAgeMs() {
            return this._builder.getMaxCachedAssetAgeMs();
        }

        @i(name = "getMaxCachedAssetSizeMb")
        public final int getMaxCachedAssetSizeMb() {
            return this._builder.getMaxCachedAssetSizeMb();
        }

        @i(name = "setMaxCachedAssetAgeMs")
        public final void setMaxCachedAssetAgeMs(long v) {
            this._builder.setMaxCachedAssetAgeMs(v);
        }

        @i(name = "setMaxCachedAssetSizeMb")
        public final void setMaxCachedAssetSizeMb(int v) {
            this._builder.setMaxCachedAssetSizeMb(v);
        }
    }

    @l
    public static final CachedAssetsConfigurationKt INSTANCE;

    static {
        CachedAssetsConfigurationKt.INSTANCE = new CachedAssetsConfigurationKt();
    }
}

