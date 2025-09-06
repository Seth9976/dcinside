package com.mackhartley.roundedprogressbar;

import kotlin.jvm.internal.w;
import y4.l;

public final class c implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final boolean a;
    private final boolean b;
    @l
    public static final String c = "10%";
    public static final a d;

    static {
        c.d = new a(null);
    }

    public c() {
        this(false, false, 3, null);
    }

    public c(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public c(boolean z, boolean z1, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1);
    }

    @Override  // com.mackhartley.roundedprogressbar.d
    @l
    public String a() {
        return "10%";
    }

    @Override  // com.mackhartley.roundedprogressbar.d
    @l
    public String b(float f) {
        return H2.a.b(f, this.a, this.b);
    }
}

