package com.vungle.ads.internal.load;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class n {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    @l
    private final com.vungle.ads.internal.network.l apiClient;

    static {
        n.Companion = new a(null);
    }

    public n(@l com.vungle.ads.internal.network.l l0) {
        L.p(l0, "apiClient");
        super();
        this.apiClient = l0;
    }

    public final void reportAdMarkup(@l String s) {
        L.p(s, "adm");
        this.apiClient.sendAdMarkup(s, "https://events.ads.vungle.com/rtadebugging");
    }
}

