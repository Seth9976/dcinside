package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel0) {
        AudioAttributesImplApi21 audioAttributesImplApi210 = new AudioAttributesImplApi21();
        audioAttributesImplApi210.a = (AudioAttributes)versionedParcel0.W(audioAttributesImplApi210.a, 1);
        audioAttributesImplApi210.b = versionedParcel0.M(audioAttributesImplApi210.b, 2);
        return audioAttributesImplApi210;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi210, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(false, false);
        versionedParcel0.X0(audioAttributesImplApi210.a, 1);
        versionedParcel0.M0(audioAttributesImplApi210.b, 2);
    }
}

