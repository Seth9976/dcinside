package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "PreferenceDataStoreFile")
public final class PreferenceDataStoreFile {
    @l
    public static final File a(@l Context context0, @l String s) {
        L.p(context0, "<this>");
        L.p(s, "name");
        return DataStoreFile.a(context0, s + ".preferences_pb");
    }
}

