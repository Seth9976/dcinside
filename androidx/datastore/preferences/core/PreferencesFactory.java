package androidx.datastore.preferences.core;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "PreferencesFactory")
public final class PreferencesFactory {
    @l
    @i(name = "create")
    public static final Preferences a(@l Pair[] arr_preferences$Pair) {
        L.p(arr_preferences$Pair, "pairs");
        return PreferencesFactory.c(((Pair[])Arrays.copyOf(arr_preferences$Pair, arr_preferences$Pair.length)));
    }

    @l
    @i(name = "createEmpty")
    public static final Preferences b() {
        return new MutablePreferences(null, true, 1, null);
    }

    @l
    @i(name = "createMutable")
    public static final MutablePreferences c(@l Pair[] arr_preferences$Pair) {
        L.p(arr_preferences$Pair, "pairs");
        MutablePreferences mutablePreferences0 = new MutablePreferences(null, false, 1, null);
        mutablePreferences0.m(((Pair[])Arrays.copyOf(arr_preferences$Pair, arr_preferences$Pair.length)));
        return mutablePreferences0;
    }
}

