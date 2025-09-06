package android.support.v4.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public final class AudioAttributesImplApi21Parcelizer extends androidx.media.AudioAttributesImplApi21Parcelizer {
    @Override  // androidx.media.AudioAttributesImplApi21Parcelizer
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel0) {
        return androidx.media.AudioAttributesImplApi21Parcelizer.read(versionedParcel0);
    }

    @Override  // androidx.media.AudioAttributesImplApi21Parcelizer
    public static void write(AudioAttributesImplApi21 audioAttributesImplApi210, VersionedParcel versionedParcel0) {
        androidx.media.AudioAttributesImplApi21Parcelizer.write(audioAttributesImplApi210, versionedParcel0);
    }
}

