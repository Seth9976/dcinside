package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class PreferencesMapCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PreferenceMap a(@l InputStream inputStream0) {
            L.p(inputStream0, "input");
            try {
                PreferenceMap preferencesProto$PreferenceMap0 = PreferenceMap.f1(inputStream0);
                L.o(preferencesProto$PreferenceMap0, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return preferencesProto$PreferenceMap0;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new CorruptionException("Unable to parse preferences proto.", invalidProtocolBufferException0);
            }
        }
    }

    @l
    public static final Companion a;

    static {
        PreferencesMapCompat.a = new Companion(null);
    }
}

