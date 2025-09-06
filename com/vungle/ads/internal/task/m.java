package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.q;
import kotlin.jvm.internal.L;
import y4.l;

public final class m implements d {
    @l
    private final Context context;
    @l
    private final q pathProvider;

    public m(@l Context context0, @l q q0) {
        L.p(context0, "context");
        L.p(q0, "pathProvider");
        super();
        this.context = context0;
        this.pathProvider = q0;
    }

    @Override  // com.vungle.ads.internal.task.d
    @l
    public c create(@l String s) throws com.vungle.ads.internal.task.l {
        L.p(s, "tag");
        if(s.length() == 0) {
            throw new com.vungle.ads.internal.task.l("Job tag is null");
        }
        if(L.g(s, "CleanupJob")) {
            return new a(this.context, this.pathProvider);
        }
        if(!L.g(s, "ResendTpatJob")) {
            throw new com.vungle.ads.internal.task.l("Unknown Job Type " + s);
        }
        return new j(this.context, this.pathProvider);
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final q getPathProvider() {
        return this.pathProvider;
    }
}

