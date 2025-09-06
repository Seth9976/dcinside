package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class AudioManagerCompat {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static boolean a(AudioManager audioManager0) {
            return audioManager0.isVolumeFixed();
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        @DoNotInline
        static int a(AudioManager audioManager0, AudioFocusRequest audioFocusRequest0) {
            return audioManager0.abandonAudioFocusRequest(audioFocusRequest0);
        }

        @DoNotInline
        static int b(AudioManager audioManager0, AudioFocusRequest audioFocusRequest0) {
            return audioManager0.requestAudioFocus(audioFocusRequest0);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        @DoNotInline
        static int a(AudioManager audioManager0, int v) {
            return audioManager0.getStreamMinVolume(v);
        }
    }

    private static final String a = "AudioManCompat";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    public static int a(@NonNull AudioManager audioManager0, @NonNull AudioFocusRequestCompat audioFocusRequestCompat0) {
        if(audioManager0 == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if(audioFocusRequestCompat0 == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        return Build.VERSION.SDK_INT < 26 ? audioManager0.abandonAudioFocus(audioFocusRequestCompat0.f()) : Api26Impl.a(audioManager0, audioFocusRequestCompat0.c());
    }

    @IntRange(from = 0L)
    public static int b(@NonNull AudioManager audioManager0, int v) {
        return audioManager0.getStreamMaxVolume(v);
    }

    @IntRange(from = 0L)
    public static int c(@NonNull AudioManager audioManager0, int v) {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.a(audioManager0, v);
    }

    public static boolean d(@NonNull AudioManager audioManager0) {
        return Api21Impl.a(audioManager0);
    }

    public static int e(@NonNull AudioManager audioManager0, @NonNull AudioFocusRequestCompat audioFocusRequestCompat0) {
        if(audioManager0 == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if(audioFocusRequestCompat0 == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        return Build.VERSION.SDK_INT < 26 ? audioManager0.requestAudioFocus(audioFocusRequestCompat0.f(), audioFocusRequestCompat0.b().D0(), audioFocusRequestCompat0.e()) : Api26Impl.b(audioManager0, audioFocusRequestCompat0.c());
    }
}

