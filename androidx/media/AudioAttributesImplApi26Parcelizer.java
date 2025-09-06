package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel0) {
        AudioAttributesImplApi26 audioAttributesImplApi260 = new AudioAttributesImplApi26();
        audioAttributesImplApi260.a = (AudioAttributes)versionedParcel0.W(audioAttributesImplApi260.a, 1);
        audioAttributesImplApi260.b = versionedParcel0.M(audioAttributesImplApi260.b, 2);
        return audioAttributesImplApi260;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi260, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(false, false);
        versionedParcel0.X0(audioAttributesImplApi260.a, 1);
        versionedParcel0.M0(audioAttributesImplApi260.b, 2);
    }
}

