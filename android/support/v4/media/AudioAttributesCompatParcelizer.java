package android.support.v4.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    @Override  // androidx.media.AudioAttributesCompatParcelizer
    public static AudioAttributesCompat read(VersionedParcel versionedParcel0) {
        return androidx.media.AudioAttributesCompatParcelizer.read(versionedParcel0);
    }

    @Override  // androidx.media.AudioAttributesCompatParcelizer
    public static void write(AudioAttributesCompat audioAttributesCompat0, VersionedParcel versionedParcel0) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat0, versionedParcel0);
    }
}

