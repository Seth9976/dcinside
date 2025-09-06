package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo({Scope.a})
public interface AudioAttributesImpl extends VersionedParcelable {
    public interface Builder {
        @NonNull
        Builder a(int arg1);

        @NonNull
        Builder b(int arg1);

        @NonNull
        AudioAttributesImpl build();

        @NonNull
        Builder c(int arg1);

        @NonNull
        Builder setFlags(int arg1);
    }

    int C0();

    int D0();

    int E0();

    int F0();

    @Nullable
    Object d();

    int getFlags();

    int x();
}

