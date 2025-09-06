package android.support.v4.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    @Override  // androidx.media.AudioAttributesImplBaseParcelizer
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel0) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(versionedParcel0);
    }

    @Override  // androidx.media.AudioAttributesImplBaseParcelizer
    public static void write(AudioAttributesImplBase audioAttributesImplBase0, VersionedParcel versionedParcel0) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase0, versionedParcel0);
    }
}

