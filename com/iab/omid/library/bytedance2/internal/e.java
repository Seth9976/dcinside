package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.weakreference.a;

public class e {
    private final a a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public e(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0, @Nullable String s) {
        this.a = new a(view0);
        this.b = view0.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose0;
        this.d = s;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public a c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }
}

