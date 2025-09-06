package android.support.v4.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public final class AudioAttributesImplApi26Parcelizer extends androidx.media.AudioAttributesImplApi26Parcelizer {
    @Override  // androidx.media.AudioAttributesImplApi26Parcelizer
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel0) {
        return androidx.media.AudioAttributesImplApi26Parcelizer.read(versionedParcel0);
    }

    @Override  // androidx.media.AudioAttributesImplApi26Parcelizer
    public static void write(AudioAttributesImplApi26 audioAttributesImplApi260, VersionedParcel versionedParcel0) {
        androidx.media.AudioAttributesImplApi26Parcelizer.write(audioAttributesImplApi260, versionedParcel0);
    }
}

