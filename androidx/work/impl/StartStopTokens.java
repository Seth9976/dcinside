package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public interface StartStopTokens {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        @j
        @n
        public final StartStopTokens a() {
            return Companion.c(this, false, 1, null);
        }

        @l
        @j
        @n
        public final StartStopTokens b(boolean z) {
            StartStopTokens startStopTokens0 = new StartStopTokensImpl();
            return z ? new SynchronizedStartStopTokensImpl(startStopTokens0) : startStopTokens0;
        }

        public static StartStopTokens c(Companion startStopTokens$Companion0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = true;
            }
            return startStopTokens$Companion0.b(z);
        }
    }

    @l
    public static final Companion a;

    static {
        StartStopTokens.a = Companion.a;
    }

    @m
    StartStopToken a(@l WorkSpec arg1);

    boolean b(@l WorkGenerationalId arg1);

    @m
    StartStopToken c(@l WorkGenerationalId arg1);

    @l
    StartStopToken d(@l WorkSpec arg1);

    @l
    StartStopToken e(@l WorkGenerationalId arg1);

    @l
    List remove(@l String arg1);
}

