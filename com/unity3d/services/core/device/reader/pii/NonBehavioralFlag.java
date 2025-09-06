package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

public enum NonBehavioralFlag {
    @s0({"SMAP\nNonBehavioralFlag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonBehavioralFlag.kt\ncom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final NonBehavioralFlag fromString(@l String s) {
            NonBehavioralFlag nonBehavioralFlag0;
            L.p(s, "value");
            try {
                String s1 = s.toUpperCase(Locale.ROOT);
                L.o(s1, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                nonBehavioralFlag0 = e0.b(NonBehavioralFlag.valueOf(s1));
                return e0.i(nonBehavioralFlag0) ? NonBehavioralFlag.UNKNOWN : nonBehavioralFlag0;
            }
            catch(Throwable throwable0) {
                nonBehavioralFlag0 = e0.b(f0.a(throwable0));
                return e0.i(nonBehavioralFlag0) ? NonBehavioralFlag.UNKNOWN : nonBehavioralFlag0;
            }
        }
    }

    UNKNOWN,
    TRUE,
    FALSE;

    @l
    public static final Companion Companion;

    private static final NonBehavioralFlag[] $values() [...] // Inlined contents

    static {
        NonBehavioralFlag.Companion = new Companion(null);
    }
}

