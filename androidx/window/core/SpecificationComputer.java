package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class SpecificationComputer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final SpecificationComputer a(@l Object object0, @l String s, @l VerificationMode specificationComputer$VerificationMode0, @l Logger logger0) {
            L.p(object0, "<this>");
            L.p(s, "tag");
            L.p(specificationComputer$VerificationMode0, "verificationMode");
            L.p(logger0, "logger");
            return new ValidSpecification(object0, s, specificationComputer$VerificationMode0, logger0);
        }

        public static SpecificationComputer b(Companion specificationComputer$Companion0, Object object0, String s, VerificationMode specificationComputer$VerificationMode0, Logger logger0, int v, Object object1) {
            if((v & 2) != 0) {
                specificationComputer$VerificationMode0 = BuildConfig.a.a();
            }
            if((v & 4) != 0) {
                logger0 = AndroidLogger.a;
            }
            return specificationComputer$Companion0.a(object0, s, specificationComputer$VerificationMode0, logger0);
        }
    }

    public static enum VerificationMode {
        STRICT,
        LOG,
        QUIET;

        private static final VerificationMode[] a() [...] // Inlined contents
    }

    @l
    public static final Companion a;

    static {
        SpecificationComputer.a = new Companion(null);
    }

    @m
    public abstract Object a();

    @l
    protected final String b(@l Object object0, @l String s) {
        L.p(object0, "value");
        L.p(s, "message");
        return s + " value: " + object0;
    }

    @l
    public abstract SpecificationComputer c(@l String arg1, @l Function1 arg2);
}

