package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class GameServerIdReader extends MetadataReader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    static {
        GameServerIdReader.Companion = new Companion(null);
    }

    public GameServerIdReader(@l JsonStorage jsonStorage0) {
        L.p(jsonStorage0, "jsonStorage");
        super(jsonStorage0, "player.server_id.value");
    }
}

