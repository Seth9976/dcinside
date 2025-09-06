package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings.Global;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import com.google.common.collect.Q2.b;
import com.google.common.collect.Q2;
import com.google.common.collect.a3.a;
import com.google.common.collect.a3;
import com.google.common.collect.u5;
import com.google.common.primitives.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@UnstableApi
public final class AudioCapabilities {
    @RequiresApi(23)
    static final class Api23 {
        @DoNotInline
        private static a3 a() {
            a a3$a0 = new a().k(new Integer[]{8, 7});
            int v = Util.a;
            if(v >= 0x1F) {
                a3$a0.k(new Integer[]{26, 27});
            }
            if(v >= 33) {
                a3$a0.j(30);
            }
            return a3$a0.o();
        }

        @DoNotInline
        public static boolean b(AudioManager audioManager0, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi230) {
            AudioDeviceInfo[] arr_audioDeviceInfo = audioDeviceInfoApi230 == null ? ((AudioManager)Assertions.g(audioManager0)).getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfoApi230.a};
            a3 a30 = Api23.a();
            for(int v = 0; v < arr_audioDeviceInfo.length; ++v) {
                if(a30.contains(arr_audioDeviceInfo[v].getType())) {
                    return true;
                }
            }
            return false;
        }
    }

    @RequiresApi(29)
    static final class Api29 {
        @DoNotInline
        public static O2 a(AudioAttributes audioAttributes0) {
            com.google.common.collect.O2.a o2$a0 = O2.n();
            u5 u50 = AudioCapabilities.g.s().i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                Integer integer0 = (Integer)object0;
                int v = (int)integer0;
                if(Util.a >= Util.X(v) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(v).setSampleRate(48000).build(), audioAttributes0.b().a)) {
                    o2$a0.j(integer0);
                }
            }
            o2$a0.j(2);
            return o2$a0.n();
        }

        @DoNotInline
        public static int b(int v, int v1, AudioAttributes audioAttributes0) {
            for(int v2 = 10; v2 > 0; --v2) {
                int v3 = Util.a0(v2);
                if(v3 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(v).setSampleRate(v1).setChannelMask(v3).build(), audioAttributes0.b().a)) {
                    return v2;
                }
            }
            return 0;
        }
    }

    @RequiresApi(33)
    static final class Api33 {
        @DoNotInline
        public static AudioCapabilities a(AudioManager audioManager0, AudioAttributes audioAttributes0) {
            return new AudioCapabilities(AudioCapabilities.c(audioManager0.getDirectProfilesForAttributes(audioAttributes0.b().a)), null);
        }

        @DoNotInline
        @Nullable
        public static AudioDeviceInfoApi23 b(AudioManager audioManager0, AudioAttributes audioAttributes0) {
            try {
                List list0 = ((AudioManager)Assertions.g(audioManager0)).getAudioDevicesForAttributes(audioAttributes0.b().a);
                return list0.isEmpty() ? null : new AudioDeviceInfoApi23(g.a(list0.get(0)));
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
        }
    }

    static final class AudioProfile {
        public final int a;
        public final int b;
        @Nullable
        private final a3 c;
        public static final AudioProfile d;

        static {
            AudioProfile.d = Util.a < 33 ? new AudioProfile(2, 10) : new AudioProfile(2, AudioProfile.a(10));
        }

        public AudioProfile(int v, int v1) {
            this.a = v;
            this.b = v1;
            this.c = null;
        }

        @RequiresApi(33)
        public AudioProfile(int v, Set set0) {
            this.a = v;
            a3 a30 = a3.u(set0);
            this.c = a30;
            int v1 = 0;
            u5 u50 = a30.i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                v1 = Math.max(v1, Integer.bitCount(((int)(((Integer)object0)))));
            }
            this.b = v1;
        }

        private static a3 a(int v) {
            a a3$a0 = new a();
            for(int v1 = 1; v1 <= v; ++v1) {
                a3$a0.j(Util.a0(v1));
            }
            return a3$a0.o();
        }

        public int b(int v, AudioAttributes audioAttributes0) {
            if(this.c != null) {
                return this.b;
            }
            return Util.a < 29 ? ((int)(((Integer)Assertions.g(((Integer)AudioCapabilities.g.getOrDefault(this.a, 0)))))) : Api29.b(this.a, v, audioAttributes0);
        }

        public boolean c(int v) {
            if(this.c == null) {
                return v <= this.b;
            }
            int v1 = Util.a0(v);
            return v1 == 0 ? false : this.c.contains(v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof AudioProfile ? this.a == ((AudioProfile)object0).a && this.b == ((AudioProfile)object0).b && Util.g(this.c, ((AudioProfile)object0).c) : false;
        }

        @Override
        public int hashCode() {
            int v = (this.a * 0x1F + this.b) * 0x1F;
            return this.c == null ? v : v + this.c.hashCode();
        }

        @Override
        public String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }
    }

    private final SparseArray a;
    private final int b;
    @VisibleForTesting
    static final int c = 10;
    @VisibleForTesting
    static final int d = 48000;
    public static final AudioCapabilities e = null;
    @SuppressLint({"InlinedApi"})
    private static final O2 f = null;
    @VisibleForTesting
    static final Q2 g = null;
    private static final String h = "external_surround_sound_enabled";
    private static final String i = "use_external_surround_sound_flag";

    static {
        AudioCapabilities.e = new AudioCapabilities(O2.B(AudioProfile.d));
        AudioCapabilities.f = O2.D(2, 5, 6);
        AudioCapabilities.g = new b().i(5, 6).i(17, 6).i(7, 6).i(30, 10).i(18, 6).i(6, 8).i(8, 8).i(14, 8).d();
    }

    private AudioCapabilities(List list0) {
        this.a = new SparseArray();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            AudioProfile audioCapabilities$AudioProfile0 = (AudioProfile)list0.get(v1);
            this.a.put(audioCapabilities$AudioProfile0.a, audioCapabilities$AudioProfile0);
        }
        int v2 = 0;
        for(int v = 0; v < this.a.size(); ++v) {
            v2 = Math.max(v2, ((AudioProfile)this.a.valueAt(v)).b);
        }
        this.b = v2;
    }

    AudioCapabilities(List list0, androidx.media3.exoplayer.audio.AudioCapabilities.1 audioCapabilities$10) {
        this(list0);
    }

    @Deprecated
    public AudioCapabilities(@Nullable int[] arr_v, int v) {
        this(AudioCapabilities.d(arr_v, v));
    }

    // 去混淆评级： 低(20)
    private static boolean b() [...] // 潜在的解密器

    @SuppressLint({"WrongConstant"})
    @RequiresApi(33)
    private static O2 c(List list0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(2, new HashSet(l.c(new int[]{12})));
        for(int v = 0; v < list0.size(); ++v) {
            android.media.AudioProfile audioProfile0 = androidx.media3.exoplayer.audio.a.a(list0.get(v));
            if(audioProfile0.getEncapsulationType() != 1) {
                int v1 = audioProfile0.getFormat();
                if(Util.f1(v1) || AudioCapabilities.g.containsKey(v1)) {
                    if(hashMap0.containsKey(v1)) {
                        ((Set)Assertions.g(((Set)hashMap0.get(v1)))).addAll(l.c(audioProfile0.getChannelMasks()));
                    }
                    else {
                        hashMap0.put(v1, new HashSet(l.c(audioProfile0.getChannelMasks())));
                    }
                }
            }
        }
        com.google.common.collect.O2.a o2$a0 = O2.n();
        for(Object object0: hashMap0.entrySet()) {
            o2$a0.j(new AudioProfile(((int)(((Integer)((Map.Entry)object0).getKey()))), ((Set)((Map.Entry)object0).getValue())));
        }
        return o2$a0.n();
    }

    private static O2 d(@Nullable int[] arr_v, int v) {
        com.google.common.collect.O2.a o2$a0 = O2.n();
        if(arr_v == null) {
            arr_v = new int[0];
        }
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            o2$a0.j(new AudioProfile(arr_v[v1], v));
        }
        return o2$a0.n();
    }

    @Deprecated
    public static AudioCapabilities e(Context context0) {
        return AudioCapabilities.f(context0, AudioAttributes.g, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AudioCapabilities ? Util.A(this.a, ((AudioCapabilities)object0).a) && this.b == ((AudioCapabilities)object0).b : false;
    }

    public static AudioCapabilities f(Context context0, AudioAttributes audioAttributes0, @Nullable AudioDeviceInfo audioDeviceInfo0) {
        return Util.a < 23 || audioDeviceInfo0 == null ? AudioCapabilities.h(context0, audioAttributes0, null) : AudioCapabilities.h(context0, audioAttributes0, new AudioDeviceInfoApi23(audioDeviceInfo0));
    }

    @SuppressLint({"InlinedApi"})
    static AudioCapabilities g(Context context0, @Nullable Intent intent0, AudioAttributes audioAttributes0, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi230) {
        AudioManager audioManager0 = (AudioManager)Assertions.g(context0.getSystemService("audio"));
        if(audioDeviceInfoApi230 == null) {
            audioDeviceInfoApi230 = Util.a < 33 ? null : Api33.b(audioManager0, audioAttributes0);
        }
        int v = Util.a;
        if(v >= 33 && (Util.n1(context0) || Util.c1(context0))) {
            return Api33.a(audioManager0, audioAttributes0);
        }
        if(v >= 23 && Api23.b(audioManager0, audioDeviceInfoApi230)) {
            return AudioCapabilities.e;
        }
        a a3$a0 = new a();
        a3$a0.j(2);
        if(v >= 29 && (Util.n1(context0) || Util.c1(context0))) {
            a3$a0.l(Api29.a(audioAttributes0));
            return new AudioCapabilities(AudioCapabilities.d(l.D(a3$a0.o()), 10));
        }
        ContentResolver contentResolver0 = context0.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver0, "use_external_surround_sound_flag", 0) == 1;
        if(z && Settings.Global.getInt(contentResolver0, "external_surround_sound_enabled", 0) == 1) {
            a3$a0.l(AudioCapabilities.f);
        }
        if(intent0 != null && !z && intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] arr_v = intent0.getIntArrayExtra("android.media.extra.ENCODINGS");
            if(arr_v != null) {
                a3$a0.l(l.c(arr_v));
            }
            return new AudioCapabilities(AudioCapabilities.d(l.D(a3$a0.o()), intent0.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new AudioCapabilities(AudioCapabilities.d(l.D(a3$a0.o()), 10));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static AudioCapabilities h(Context context0, AudioAttributes audioAttributes0, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi230) {
        return AudioCapabilities.g(context0, context0.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes0, audioDeviceInfoApi230);
    }

    @Override
    public int hashCode() {
        int v = Util.B(this.a);
        return this.b + v * 0x1F;
    }

    private static int i(int v) {
        int v1 = Util.a;
        if(v1 <= 28) {
            switch(v) {
                case 3: 
                case 4: 
                case 5: {
                    v = 6;
                    break;
                }
                case 7: {
                    v = 8;
                }
            }
        }
        if(v1 <= 26 && "fugu".equals(Util.b) && v == 1) {
            v = 2;
        }
        return Util.a0(v);
    }

    @Nullable
    @Deprecated
    public Pair j(Format format0) {
        return this.k(format0, AudioAttributes.g);
    }

    @Nullable
    public Pair k(Format format0, AudioAttributes audioAttributes0) {
        int v = MimeTypes.f(((String)Assertions.g(format0.n)), format0.j);
        if(!AudioCapabilities.g.containsKey(v)) {
            return null;
        }
        if(v == 18 && !this.p(18)) {
            v = 6;
        }
        else if(v == 8 && !this.p(8) || v == 30 && !this.p(30)) {
            v = 7;
        }
        if(!this.p(v)) {
            return null;
        }
        AudioProfile audioCapabilities$AudioProfile0 = (AudioProfile)Assertions.g(((AudioProfile)this.a.get(v)));
        int v1 = format0.B;
        if(v1 == -1 || v == 18) {
            v1 = audioCapabilities$AudioProfile0.b((format0.C == -1 ? 48000 : format0.C), audioAttributes0);
        }
        else if(format0.n.equals("audio/vnd.dts.uhd;profile=p2") && Util.a < 33) {
            if(v1 > 10) {
                return null;
            }
        }
        else if(!audioCapabilities$AudioProfile0.c(v1)) {
            return null;
        }
        int v2 = AudioCapabilities.i(v1);
        return v2 == 0 ? null : Pair.create(v, v2);
    }

    // 去混淆评级： 低(40)
    @Nullable
    static Uri l() {
        return null;
    }

    public int m() {
        return this.b;
    }

    @Deprecated
    public boolean n(Format format0) {
        return this.o(format0, AudioAttributes.g);
    }

    public boolean o(Format format0, AudioAttributes audioAttributes0) {
        return this.k(format0, audioAttributes0) != null;
    }

    public boolean p(int v) {
        return Util.y(this.a, v);
    }

    @Override
    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }

    class androidx.media3.exoplayer.audio.AudioCapabilities.1 {
    }

}

