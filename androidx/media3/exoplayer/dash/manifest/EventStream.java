package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.emsg.EventMessage;

@UnstableApi
public final class EventStream {
    public final EventMessage[] a;
    public final long[] b;
    public final String c;
    public final String d;
    public final long e;

    public EventStream(String s, String s1, long v, long[] arr_v, EventMessage[] arr_eventMessage) {
        this.c = s;
        this.d = s1;
        this.e = v;
        this.b = arr_v;
        this.a = arr_eventMessage;
    }

    public String a() {
        return this.c + "/" + this.d;
    }
}

