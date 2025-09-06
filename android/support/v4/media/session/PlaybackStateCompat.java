package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final class CustomAction implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public CustomAction a(Parcel parcel0) {
                return new CustomAction(parcel0);
            }

            public CustomAction[] b(int v) {
                return new CustomAction[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final class b {
            private final String a;
            private final CharSequence b;
            private final int c;
            private Bundle d;

            public b(String s, CharSequence charSequence0, int v) {
                if(TextUtils.isEmpty(s)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if(TextUtils.isEmpty(charSequence0)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if(v == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.a = s;
                this.b = charSequence0;
                this.c = v;
            }

            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public b b(Bundle bundle0) {
                this.d = bundle0;
                return this;
            }
        }

        public static final Parcelable.Creator CREATOR;
        private final String a;
        private final CharSequence b;
        private final int c;
        private final Bundle d;
        private PlaybackState.CustomAction e;

        static {
            CustomAction.CREATOR = new a();
        }

        CustomAction(Parcel parcel0) {
            this.a = parcel0.readString();
            this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
            this.c = parcel0.readInt();
            this.d = parcel0.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String s, CharSequence charSequence0, int v, Bundle bundle0) {
            this.a = s;
            this.b = charSequence0;
            this.c = v;
            this.d = bundle0;
        }

        public static CustomAction a(Object object0) {
            if(object0 != null) {
                Bundle bundle0 = c.l(((PlaybackState.CustomAction)object0));
                MediaSessionCompat.b(bundle0);
                CustomAction playbackStateCompat$CustomAction0 = new CustomAction(c.f(((PlaybackState.CustomAction)object0)), c.o(((PlaybackState.CustomAction)object0)), c.m(((PlaybackState.CustomAction)object0)), bundle0);
                playbackStateCompat$CustomAction0.e = (PlaybackState.CustomAction)object0;
                return playbackStateCompat$CustomAction0;
            }
            return null;
        }

        public String c() {
            return this.a;
        }

        public Object d() {
            PlaybackState.CustomAction playbackState$CustomAction0 = this.e;
            if(playbackState$CustomAction0 == null) {
                PlaybackState.CustomAction.Builder playbackState$CustomAction$Builder0 = c.e(this.a, this.b, this.c);
                c.w(playbackState$CustomAction$Builder0, this.d);
                return c.b(playbackState$CustomAction$Builder0);
            }
            return playbackState$CustomAction0;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Bundle e() {
            return this.d;
        }

        public int f() {
            return this.c;
        }

        public CharSequence g() {
            return this.b;
        }

        @Override
        public String toString() {
            return "Action:mName=\'" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeBundle(this.d);
        }
    }

    class android.support.v4.media.session.PlaybackStateCompat.a implements Parcelable.Creator {
        android.support.v4.media.session.PlaybackStateCompat.a() {
            super();
        }

        public PlaybackStateCompat a(Parcel parcel0) {
            return new PlaybackStateCompat(parcel0);
        }

        public PlaybackStateCompat[] b(int v) {
            return new PlaybackStateCompat[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface android.support.v4.media.session.PlaybackStateCompat.b {
    }

    @RequiresApi(21)
    static class c {
        @DoNotInline
        static void a(PlaybackState.Builder playbackState$Builder0, PlaybackState.CustomAction playbackState$CustomAction0) {
            playbackState$Builder0.addCustomAction(playbackState$CustomAction0);
        }

        @DoNotInline
        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder playbackState$CustomAction$Builder0) {
            return playbackState$CustomAction$Builder0.build();
        }

        @DoNotInline
        static PlaybackState c(PlaybackState.Builder playbackState$Builder0) {
            return playbackState$Builder0.build();
        }

        @DoNotInline
        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        static PlaybackState.CustomAction.Builder e(String s, CharSequence charSequence0, int v) {
            return new PlaybackState.CustomAction.Builder(s, charSequence0, v);
        }

        @DoNotInline
        static String f(PlaybackState.CustomAction playbackState$CustomAction0) {
            return playbackState$CustomAction0.getAction();
        }

        @DoNotInline
        static long g(PlaybackState playbackState0) {
            return playbackState0.getActions();
        }

        @DoNotInline
        static long h(PlaybackState playbackState0) {
            return playbackState0.getActiveQueueItemId();
        }

        @DoNotInline
        static long i(PlaybackState playbackState0) {
            return playbackState0.getBufferedPosition();
        }

        @DoNotInline
        static List j(PlaybackState playbackState0) {
            return playbackState0.getCustomActions();
        }

        @DoNotInline
        static CharSequence k(PlaybackState playbackState0) {
            return playbackState0.getErrorMessage();
        }

        @DoNotInline
        static Bundle l(PlaybackState.CustomAction playbackState$CustomAction0) {
            return playbackState$CustomAction0.getExtras();
        }

        @DoNotInline
        static int m(PlaybackState.CustomAction playbackState$CustomAction0) {
            return playbackState$CustomAction0.getIcon();
        }

        @DoNotInline
        static long n(PlaybackState playbackState0) {
            return playbackState0.getLastPositionUpdateTime();
        }

        @DoNotInline
        static CharSequence o(PlaybackState.CustomAction playbackState$CustomAction0) {
            return playbackState$CustomAction0.getName();
        }

        @DoNotInline
        static float p(PlaybackState playbackState0) {
            return playbackState0.getPlaybackSpeed();
        }

        @DoNotInline
        static long q(PlaybackState playbackState0) {
            return playbackState0.getPosition();
        }

        @DoNotInline
        static int r(PlaybackState playbackState0) {
            return playbackState0.getState();
        }

        @DoNotInline
        static void s(PlaybackState.Builder playbackState$Builder0, long v) {
            playbackState$Builder0.setActions(v);
        }

        @DoNotInline
        static void t(PlaybackState.Builder playbackState$Builder0, long v) {
            playbackState$Builder0.setActiveQueueItemId(v);
        }

        @DoNotInline
        static void u(PlaybackState.Builder playbackState$Builder0, long v) {
            playbackState$Builder0.setBufferedPosition(v);
        }

        @DoNotInline
        static void v(PlaybackState.Builder playbackState$Builder0, CharSequence charSequence0) {
            playbackState$Builder0.setErrorMessage(charSequence0);
        }

        @DoNotInline
        static void w(PlaybackState.CustomAction.Builder playbackState$CustomAction$Builder0, Bundle bundle0) {
            playbackState$CustomAction$Builder0.setExtras(bundle0);
        }

        @DoNotInline
        static void x(PlaybackState.Builder playbackState$Builder0, int v, long v1, float f, long v2) {
            playbackState$Builder0.setState(v, v1, f, v2);
        }
    }

    @RequiresApi(22)
    static class d {
        @DoNotInline
        static Bundle a(PlaybackState playbackState0) {
            return playbackState0.getExtras();
        }

        @DoNotInline
        static void b(PlaybackState.Builder playbackState$Builder0, Bundle bundle0) {
            playbackState$Builder0.setExtras(bundle0);
        }
    }

    public static final class e {
        private final List a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public e() {
            this.a = new ArrayList();
            this.j = -1L;
        }

        public e(PlaybackStateCompat playbackStateCompat0) {
            ArrayList arrayList0 = new ArrayList();
            this.a = arrayList0;
            this.j = -1L;
            this.b = playbackStateCompat0.a;
            this.c = playbackStateCompat0.b;
            this.e = playbackStateCompat0.d;
            this.i = playbackStateCompat0.h;
            this.d = playbackStateCompat0.c;
            this.f = playbackStateCompat0.e;
            this.g = playbackStateCompat0.f;
            this.h = playbackStateCompat0.g;
            List list0 = playbackStateCompat0.i;
            if(list0 != null) {
                arrayList0.addAll(list0);
            }
            this.j = playbackStateCompat0.j;
            this.k = playbackStateCompat0.k;
        }

        public e a(CustomAction playbackStateCompat$CustomAction0) {
            if(playbackStateCompat$CustomAction0 == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.a.add(playbackStateCompat$CustomAction0);
            return this;
        }

        public e b(String s, String s1, int v) {
            return this.a(new CustomAction(s, s1, v, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public e d(long v) {
            this.f = v;
            return this;
        }

        public e e(long v) {
            this.j = v;
            return this;
        }

        public e f(long v) {
            this.d = v;
            return this;
        }

        public e g(int v, CharSequence charSequence0) {
            this.g = v;
            this.h = charSequence0;
            return this;
        }

        @Deprecated
        public e h(CharSequence charSequence0) {
            this.h = charSequence0;
            return this;
        }

        public e i(Bundle bundle0) {
            this.k = bundle0;
            return this;
        }

        public e j(int v, long v1, float f) {
            return this.k(v, v1, f, SystemClock.elapsedRealtime());
        }

        public e k(int v, long v1, float f, long v2) {
            this.b = v;
            this.c = v1;
            this.i = v2;
            this.e = f;
            return this;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public static final long A = 0x4000L;
    public static final long B = 0x8000L;
    public static final long C = 0x10000L;
    public static final Parcelable.Creator CREATOR = null;
    public static final long D = 0x20000L;
    public static final long E = 0x40000L;
    @Deprecated
    public static final long F = 0x80000L;
    public static final long G = 0x100000L;
    public static final long H = 0x200000L;
    public static final long I = 0x400000L;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int M8 = 11;
    public static final int N = 4;
    public static final long N8 = -1L;
    public static final int O = 5;
    public static final int O8 = -1;
    public static final int P = 6;
    public static final int P8 = 0;
    public static final int Q = 7;
    public static final int Q8 = 1;
    public static final int R8 = 2;
    public static final int S8 = 3;
    public static final int T8 = -1;
    public static final int U8 = 0;
    public static final int V8 = 1;
    public static final int W8 = 2;
    public static final int X = 8;
    public static final int X8 = 0;
    public static final int Y = 9;
    public static final int Y8 = 1;
    public static final int Z = 10;
    public static final int Z8 = 2;
    final int a;
    public static final int a9 = 3;
    final long b;
    public static final int b9 = 4;
    final long c;
    public static final int c9 = 5;
    final float d;
    public static final int d9 = 6;
    final long e;
    public static final int e9 = 7;
    final int f;
    public static final int f9 = 8;
    final CharSequence g;
    public static final int g9 = 9;
    final long h;
    public static final int h9 = 10;
    List i;
    public static final int i9 = 11;
    final long j;
    private static final int j9 = 0x7F;
    final Bundle k;
    private static final int k9 = 0x7E;
    private PlaybackState l;
    public static final long m = 1L;
    public static final long n = 2L;
    public static final long o = 4L;
    public static final long p = 8L;
    public static final long q = 16L;
    public static final long r = 0x20L;
    public static final long s = 0x40L;
    public static final long t = 0x80L;
    public static final long u = 0x100L;
    public static final long v = 0x200L;
    public static final long w = 0x400L;
    public static final long x = 0x800L;
    public static final long y = 0x1000L;
    public static final long z = 0x2000L;

    static {
        PlaybackStateCompat.CREATOR = new android.support.v4.media.session.PlaybackStateCompat.a();
    }

    PlaybackStateCompat(int v, long v1, long v2, float f, long v3, int v4, CharSequence charSequence0, long v5, List list0, long v6, Bundle bundle0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = f;
        this.e = v3;
        this.f = v4;
        this.g = charSequence0;
        this.h = v5;
        this.i = new ArrayList(list0);
        this.j = v6;
        this.k = bundle0;
    }

    PlaybackStateCompat(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readLong();
        this.d = parcel0.readFloat();
        this.h = parcel0.readLong();
        this.c = parcel0.readLong();
        this.e = parcel0.readLong();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.i = parcel0.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel0.readLong();
        this.k = parcel0.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel0.readInt();
    }

    public static PlaybackStateCompat a(Object object0) {
        ArrayList arrayList1;
        PlaybackStateCompat playbackStateCompat0 = null;
        if(object0 != null) {
            List list0 = c.j(((PlaybackState)object0));
            if(list0 == null) {
                arrayList1 = null;
            }
            else {
                ArrayList arrayList0 = new ArrayList(list0.size());
                for(Object object1: list0) {
                    arrayList0.add(CustomAction.a(object1));
                }
                arrayList1 = arrayList0;
            }
            if(Build.VERSION.SDK_INT >= 22) {
                playbackStateCompat0 = d.a(((PlaybackState)object0));
                MediaSessionCompat.b(((Bundle)playbackStateCompat0));
            }
            playbackStateCompat0 = new PlaybackStateCompat(c.r(((PlaybackState)object0)), c.q(((PlaybackState)object0)), c.i(((PlaybackState)object0)), c.p(((PlaybackState)object0)), c.g(((PlaybackState)object0)), 0, c.k(((PlaybackState)object0)), c.n(((PlaybackState)object0)), arrayList1, c.h(((PlaybackState)object0)), ((Bundle)playbackStateCompat0));
            playbackStateCompat0.l = (PlaybackState)object0;
        }
        return playbackStateCompat0;
    }

    public long c() {
        return this.e;
    }

    public long d() {
        return this.j;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.c;
    }

    @RestrictTo({Scope.c})
    public long f(Long long0) {
        return long0 == null ? Math.max(0L, this.b + ((long)(this.d * ((float)(SystemClock.elapsedRealtime() - this.h))))) : Math.max(0L, this.b + ((long)(this.d * ((float)(((long)long0))))));
    }

    public List g() {
        return this.i;
    }

    public int h() {
        return this.f;
    }

    public CharSequence i() {
        return this.g;
    }

    @Nullable
    public Bundle l() {
        return this.k;
    }

    public long m() {
        return this.h;
    }

    public float o() {
        return this.d;
    }

    public Object q() {
        if(this.l == null) {
            PlaybackState.Builder playbackState$Builder0 = c.d();
            c.x(playbackState$Builder0, this.a, this.b, this.d, this.h);
            c.u(playbackState$Builder0, this.c);
            c.s(playbackState$Builder0, this.e);
            c.v(playbackState$Builder0, this.g);
            for(Object object0: this.i) {
                c.a(playbackState$Builder0, ((PlaybackState.CustomAction)((CustomAction)object0).d()));
            }
            c.t(playbackState$Builder0, this.j);
            if(Build.VERSION.SDK_INT >= 22) {
                d.b(playbackState$Builder0, this.k);
            }
            this.l = c.c(playbackState$Builder0);
        }
        return this.l;
    }

    public long r() {
        return this.b;
    }

    public int s() {
        return this.a;
    }

    public static int t(long v) {
        if(v == 4L) {
            return 0x7E;
        }
        if(v == 2L) {
            return 0x7F;
        }
        if(v == 0x20L) {
            return 87;
        }
        if(v == 16L) {
            return 88;
        }
        if(v == 1L) {
            return 86;
        }
        if(v == 0x40L) {
            return 90;
        }
        if(v == 8L) {
            return 89;
        }
        return v == 0x200L ? 85 : 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "PlaybackState {state=" + this.a + ", position=" + this.b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeFloat(this.d);
        parcel0.writeLong(this.h);
        parcel0.writeLong(this.c);
        parcel0.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel0, v);
        parcel0.writeTypedList(this.i);
        parcel0.writeLong(this.j);
        parcel0.writeBundle(this.k);
        parcel0.writeInt(this.f);
    }
}

