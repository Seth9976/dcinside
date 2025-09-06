package androidx.media;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel0) {
        AudioAttributesImplBase audioAttributesImplBase0 = new AudioAttributesImplBase();
        audioAttributesImplBase0.a = versionedParcel0.M(audioAttributesImplBase0.a, 1);
        audioAttributesImplBase0.b = versionedParcel0.M(audioAttributesImplBase0.b, 2);
        audioAttributesImplBase0.c = versionedParcel0.M(audioAttributesImplBase0.c, 3);
        audioAttributesImplBase0.d = versionedParcel0.M(audioAttributesImplBase0.d, 4);
        return audioAttributesImplBase0;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase0, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(false, false);
        versionedParcel0.M0(audioAttributesImplBase0.a, 1);
        versionedParcel0.M0(audioAttributesImplBase0.b, 2);
        versionedParcel0.M0(audioAttributesImplBase0.c, 3);
        versionedParcel0.M0(audioAttributesImplBase0.d, 4);
    }
}

