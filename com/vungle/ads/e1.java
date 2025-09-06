package com.vungle.ads;

import V2.b;
import V2.c;
import y4.l;
import y4.m;
import z3.n;

public final class e1 {
    @l
    public static final e1 INSTANCE;

    static {
        e1.INSTANCE = new e1();
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getCCPAStatus() {
        return "opted_in";
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getCOPPAStatus() {
        return "COPPA_NOTSET";
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getGDPRMessageVersion() {
        return "";
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getGDPRSource() {
        return "no_interaction";
    }

    // 去混淆评级： 低(20)
    @l
    @n
    public static final String getGDPRStatus() {
        return "unknown";
    }

    // 去混淆评级： 低(20)
    @n
    public static final long getGDPRTimestamp() {
        return 0L;
    }

    @n
    public static final void setCCPAStatus(boolean z) {
        c.INSTANCE.updateCcpaConsent((z ? b.OPT_IN : b.OPT_OUT));
    }

    @n
    public static final void setCOPPAStatus(boolean z) {
        c.INSTANCE.updateCoppaConsent(z);
    }

    // 去混淆评级： 低(30)
    @n
    public static final void setGDPRStatus(boolean z, @m String s) {
        c.INSTANCE.updateGdprConsent((z ? "opted_in" : "opted_out"), "publisher", s);
    }
}

