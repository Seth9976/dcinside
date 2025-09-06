package androidx.media;

import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements VersionedParcelable {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    static abstract class AudioManagerHidden {
        public static final int a = 6;
        public static final int b = 7;
        public static final int c = 9;
        public static final int d = 10;

    }

    public static class Builder {
        final androidx.media.AudioAttributesImpl.Builder a;

        public Builder() {
            if(AudioAttributesCompat.B) {
                this.a = new androidx.media.AudioAttributesImplBase.Builder();
                return;
            }
            if(Build.VERSION.SDK_INT >= 26) {
                this.a = new androidx.media.AudioAttributesImplApi26.Builder();
                return;
            }
            this.a = new androidx.media.AudioAttributesImplApi21.Builder();
        }

        public Builder(AudioAttributesCompat audioAttributesCompat0) {
            if(AudioAttributesCompat.B) {
                this.a = new androidx.media.AudioAttributesImplBase.Builder(audioAttributesCompat0);
                return;
            }
            if(Build.VERSION.SDK_INT >= 26) {
                this.a = new androidx.media.AudioAttributesImplApi26.Builder(audioAttributesCompat0.c());
                return;
            }
            this.a = new androidx.media.AudioAttributesImplApi21.Builder(audioAttributesCompat0.c());
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.a.build());
        }

        public Builder b(int v) {
            this.a.c(v);
            return this;
        }

        public Builder c(int v) {
            this.a.setFlags(v);
            return this;
        }

        public Builder d(int v) {
            this.a.b(v);
            return this;
        }

        public Builder e(int v) {
            this.a.a(v);
            return this;
        }
    }

    private static final SparseIntArray A = null;
    static boolean B = false;
    private static final int[] C = null;
    public static final int D = 1;
    static final int E = 2;
    static final int F = 4;
    static final int G = 8;
    public static final int H = 16;
    static final int I = 0x20;
    static final int J = 0x40;
    static final int K = 0x80;
    static final int L = 0x100;
    static final int M = 0x200;
    static final int N = 0x3FF;
    static final int O = 273;
    static final int P = -1;
    @RestrictTo({Scope.a})
    public AudioAttributesImpl a;
    static final String b = "AudioAttributesCompat";
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 10;
    public static final int s = 11;
    public static final int t = 12;
    public static final int u = 13;
    public static final int v = 14;
    static final int w = 15;
    public static final int x = 16;
    private static final int y = 1;
    private static final int z = 2;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        AudioAttributesCompat.A = sparseIntArray0;
        sparseIntArray0.put(5, 1);
        sparseIntArray0.put(6, 2);
        sparseIntArray0.put(7, 2);
        sparseIntArray0.put(8, 1);
        sparseIntArray0.put(9, 1);
        sparseIntArray0.put(10, 1);
        AudioAttributesCompat.C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    @RestrictTo({Scope.a})
    public AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl0) {
        this.a = audioAttributesImpl0;
    }

    public int C0() {
        return this.a.C0();
    }

    public int D0() {
        return this.a.D0();
    }

    int E0() {
        return this.a.E0();
    }

    public int F0() {
        return this.a.F0();
    }

    @RestrictTo({Scope.a})
    public static void a(boolean z) {
        AudioAttributesCompat.B = z;
    }

    static int b(boolean z, int v, int v1) {
        if((v & 1) == 1) {
            return z ? 1 : 7;
        }
        if((v & 4) == 4) {
            return z ? 0 : 6;
        }
        switch(v1) {
            case 2: {
                return 0;
            }
            case 3: {
                return z ? 0 : 8;
            }
            case 4: {
                return 4;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 11: {
                return 10;
            }
            case 13: {
                return 1;
            }
            case 0: 
            case 1: 
            case 12: 
            case 14: 
            case 16: {
                return 3;
            }
            default: {
                if(z) {
                    throw new IllegalArgumentException("Unknown usage value " + v1 + " in audio attributes");
                }
                return 3;
            }
        }
    }

    @Nullable
    public Object c() {
        return this.a.d();
    }

    static String e(int v) {
        switch(v) {
            case 0: {
                return "USAGE_UNKNOWN";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
            default: {
                return "unknown usage " + v;
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof AudioAttributesCompat)) {
            return false;
        }
        return this.a == null ? ((AudioAttributesCompat)object0).a == null : this.a.equals(((AudioAttributesCompat)object0).a);
    }

    @Nullable
    public static AudioAttributesCompat f(@NonNull Object object0) {
        if(AudioAttributesCompat.B) {
            return null;
        }
        return Build.VERSION.SDK_INT < 26 ? new AudioAttributesCompat(new AudioAttributesImplApi21(((AudioAttributes)object0))) : new AudioAttributesCompat(new AudioAttributesImplApi26(((AudioAttributes)object0)));
    }

    public int getFlags() {
        return this.a.getFlags();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    public int x() {
        return this.a.x();
    }
}

