package androidx.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel0) {
        AudioAttributesCompat audioAttributesCompat0 = new AudioAttributesCompat();
        audioAttributesCompat0.a = (AudioAttributesImpl)versionedParcel0.h0(audioAttributesCompat0.a, 1);
        return audioAttributesCompat0;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat0, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(false, false);
        versionedParcel0.m1(audioAttributesCompat0.a, 1);
    }
}

