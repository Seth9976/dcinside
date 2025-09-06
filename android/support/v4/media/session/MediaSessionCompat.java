package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.media.VolumeProviderCompat.Callback;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat {
    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public QueueItem a(Parcel parcel0) {
                return new QueueItem(parcel0);
            }

            public QueueItem[] b(int v) {
                return new QueueItem[v];
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

        @RequiresApi(21)
        static class b {
            @DoNotInline
            static MediaSession.QueueItem a(MediaDescription mediaDescription0, long v) {
                return new MediaSession.QueueItem(mediaDescription0, v);
            }

            @DoNotInline
            static MediaDescription b(MediaSession.QueueItem mediaSession$QueueItem0) {
                return mediaSession$QueueItem0.getDescription();
            }

            @DoNotInline
            static long c(MediaSession.QueueItem mediaSession$QueueItem0) {
                return mediaSession$QueueItem0.getQueueId();
            }
        }

        public static final Parcelable.Creator CREATOR = null;
        private final MediaDescriptionCompat a;
        private final long b;
        private MediaSession.QueueItem c;
        public static final int d = -1;

        static {
            QueueItem.CREATOR = new a();
        }

        private QueueItem(MediaSession.QueueItem mediaSession$QueueItem0, MediaDescriptionCompat mediaDescriptionCompat0, long v) {
            if(mediaDescriptionCompat0 == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if(v == -1L) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.a = mediaDescriptionCompat0;
            this.b = v;
            this.c = mediaSession$QueueItem0;
        }

        QueueItem(Parcel parcel0) {
            this.a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel0);
            this.b = parcel0.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat0, long v) {
            this(null, mediaDescriptionCompat0, v);
        }

        public static QueueItem a(Object object0) {
            return object0 == null ? null : new QueueItem(((MediaSession.QueueItem)object0), MediaDescriptionCompat.a(b.b(((MediaSession.QueueItem)object0))), b.c(((MediaSession.QueueItem)object0)));
        }

        public static List c(List list0) {
            if(list0 != null) {
                List list1 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    list1.add(QueueItem.a(object0));
                }
                return list1;
            }
            return null;
        }

        public MediaDescriptionCompat d() {
            return this.a;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public long e() {
            return this.b;
        }

        public Object f() {
            MediaSession.QueueItem mediaSession$QueueItem0 = this.c;
            if(mediaSession$QueueItem0 == null) {
                mediaSession$QueueItem0 = b.a(((MediaDescription)this.a.g()), this.b);
                this.c = mediaSession$QueueItem0;
            }
            return mediaSession$QueueItem0;
        }

        @Override
        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            this.a.writeToParcel(parcel0, v);
            parcel0.writeLong(this.b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        class android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.a implements Parcelable.Creator {
            android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.a() {
                super();
            }

            public ResultReceiverWrapper a(Parcel parcel0) {
                return new ResultReceiverWrapper(parcel0);
            }

            public ResultReceiverWrapper[] b(int v) {
                return new ResultReceiverWrapper[v];
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

        public static final Parcelable.Creator CREATOR;
        ResultReceiver a;

        static {
            ResultReceiverWrapper.CREATOR = new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.a();
        }

        ResultReceiverWrapper(Parcel parcel0) {
            this.a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel0);
        }

        public ResultReceiverWrapper(@NonNull ResultReceiver resultReceiver0) {
            this.a = resultReceiver0;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            this.a.writeToParcel(parcel0, v);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        class android.support.v4.media.session.MediaSessionCompat.Token.a implements Parcelable.Creator {
            android.support.v4.media.session.MediaSessionCompat.Token.a() {
                super();
            }

            public Token a(Parcel parcel0) {
                return new Token(parcel0.readParcelable(null));
            }

            public Token[] b(int v) {
                return new Token[v];
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

        public static final Parcelable.Creator CREATOR;
        private final Object a;
        private final Object b;
        @GuardedBy("mLock")
        private android.support.v4.media.session.b c;
        @GuardedBy("mLock")
        private VersionedParcelable d;

        static {
            Token.CREATOR = new android.support.v4.media.session.MediaSessionCompat.Token.a();
        }

        Token(Object object0) {
            this(object0, null, null);
        }

        Token(Object object0, android.support.v4.media.session.b b0) {
            this(object0, b0, null);
        }

        Token(Object object0, android.support.v4.media.session.b b0, VersionedParcelable versionedParcelable0) {
            this.a = new Object();
            this.b = object0;
            this.c = b0;
            this.d = versionedParcelable0;
        }

        @RestrictTo({Scope.c})
        public static Token a(Bundle bundle0) {
            if(bundle0 == null) {
                return null;
            }
            bundle0.setClassLoader(Token.class.getClassLoader());
            android.support.v4.media.session.b b0 = android.support.v4.media.session.b.b.i1(BundleCompat.a(bundle0, "android.support.v4.media.session.EXTRA_BINDER"));
            VersionedParcelable versionedParcelable0 = ParcelUtils.c(bundle0, "android.support.v4.media.session.SESSION_TOKEN2");
            Token mediaSessionCompat$Token0 = (Token)bundle0.getParcelable("android.support.v4.media.session.TOKEN");
            return mediaSessionCompat$Token0 == null ? null : new Token(mediaSessionCompat$Token0.b, b0, versionedParcelable0);
        }

        public static Token c(Object object0) {
            return Token.d(object0, null);
        }

        @RestrictTo({Scope.a})
        public static Token d(Object object0, android.support.v4.media.session.b b0) {
            if(object0 != null) {
                if(!(object0 instanceof MediaSession.Token)) {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
                return new Token(object0, b0);
            }
            return null;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @RestrictTo({Scope.a})
        public android.support.v4.media.session.b e() {
            synchronized(this.a) {
            }
            return this.c;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Token)) {
                return false;
            }
            Object object1 = this.b;
            if(object1 == null) {
                return ((Token)object0).b == null;
            }
            Object object2 = ((Token)object0).b;
            return object2 == null ? false : object1.equals(object2);
        }

        @RestrictTo({Scope.c})
        public VersionedParcelable f() {
            synchronized(this.a) {
            }
            return this.d;
        }

        public Object g() {
            return this.b;
        }

        @RestrictTo({Scope.a})
        public void h(android.support.v4.media.session.b b0) {
            synchronized(this.a) {
                this.c = b0;
            }
        }

        @Override
        public int hashCode() {
            return this.b == null ? 0 : this.b.hashCode();
        }

        @RestrictTo({Scope.c})
        public void i(VersionedParcelable versionedParcelable0) {
            synchronized(this.a) {
                this.d = versionedParcelable0;
            }
        }

        @RestrictTo({Scope.c})
        public Bundle l() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized(this.a) {
                android.support.v4.media.session.b b0 = this.c;
                if(b0 != null) {
                    BundleCompat.b(bundle0, "android.support.v4.media.session.EXTRA_BINDER", b0.asBinder());
                }
                VersionedParcelable versionedParcelable0 = this.d;
                if(versionedParcelable0 != null) {
                    ParcelUtils.e(bundle0, "android.support.v4.media.session.SESSION_TOKEN2", versionedParcelable0);
                }
                return bundle0;
            }
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeParcelable(((Parcelable)this.b), v);
        }
    }

    public static abstract class android.support.v4.media.session.MediaSessionCompat.b {
        class android.support.v4.media.session.MediaSessionCompat.b.a extends Handler {
            final android.support.v4.media.session.MediaSessionCompat.b a;
            private static final int b = 1;

            android.support.v4.media.session.MediaSessionCompat.b.a(Looper looper0) {
                super(looper0);
            }

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                android.support.v4.media.session.MediaSessionCompat.b.a mediaSessionCompat$b$a0;
                c mediaSessionCompat$c0;
                if(message0.what == 1) {
                    synchronized(android.support.v4.media.session.MediaSessionCompat.b.this.a) {
                        mediaSessionCompat$c0 = (c)android.support.v4.media.session.MediaSessionCompat.b.this.d.get();
                        mediaSessionCompat$b$a0 = android.support.v4.media.session.MediaSessionCompat.b.this.e;
                    }
                    if(mediaSessionCompat$c0 != null && android.support.v4.media.session.MediaSessionCompat.b.this == mediaSessionCompat$c0.s() && mediaSessionCompat$b$a0 != null) {
                        mediaSessionCompat$c0.l(((RemoteUserInfo)message0.obj));
                        android.support.v4.media.session.MediaSessionCompat.b.this.a(mediaSessionCompat$c0, mediaSessionCompat$b$a0);
                        mediaSessionCompat$c0.l(null);
                    }
                }
            }
        }

        @RequiresApi(21)
        class android.support.v4.media.session.MediaSessionCompat.b.b extends MediaSession.Callback {
            final android.support.v4.media.session.MediaSessionCompat.b a;

            private void a(c mediaSessionCompat$c0) {
                mediaSessionCompat$c0.l(null);
            }

            private f b() {
                f mediaSessionCompat$f0;
                synchronized(android.support.v4.media.session.MediaSessionCompat.b.this.a) {
                    mediaSessionCompat$f0 = (f)android.support.v4.media.session.MediaSessionCompat.b.this.d.get();
                }
                if(mediaSessionCompat$f0 != null) {
                    android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0 = mediaSessionCompat$f0.s();
                    return android.support.v4.media.session.MediaSessionCompat.b.this == mediaSessionCompat$b0 ? mediaSessionCompat$f0 : null;
                }
                return null;
            }

            private void c(c mediaSessionCompat$c0) {
                if(Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String s = mediaSessionCompat$c0.g();
                if(TextUtils.isEmpty(s)) {
                    s = "android.media.session.MediaController";
                }
                mediaSessionCompat$c0.l(new RemoteUserInfo(s, -1, -1));
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onCommand(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                IBinder iBinder0 = null;
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                try {
                    if(s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle1 = new Bundle();
                        Token mediaSessionCompat$Token0 = mediaSessionCompat$f0.getSessionToken();
                        android.support.v4.media.session.b b0 = mediaSessionCompat$Token0.e();
                        if(b0 != null) {
                            iBinder0 = b0.asBinder();
                        }
                        BundleCompat.b(bundle1, "android.support.v4.media.session.EXTRA_BINDER", iBinder0);
                        ParcelUtils.e(bundle1, "android.support.v4.media.session.SESSION_TOKEN2", mediaSessionCompat$Token0.f());
                        resultReceiver0.send(0, bundle1);
                    }
                    else if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    }
                    else if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        MediaDescriptionCompat mediaDescriptionCompat0 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle0.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    }
                    else if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        MediaDescriptionCompat mediaDescriptionCompat1 = (MediaDescriptionCompat)bundle0.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    }
                    else if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && mediaSessionCompat$f0.i != null) {
                        int v = bundle0.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if(v >= 0 && v < mediaSessionCompat$f0.i.size()) {
                            iBinder0 = (QueueItem)mediaSessionCompat$f0.i.get(v);
                        }
                        if(iBinder0 != null) {
                            android.support.v4.media.session.MediaSessionCompat.b.this.q(((QueueItem)iBinder0).d());
                        }
                    }
                }
                catch(BadParcelableException unused_ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onCustomAction(String s, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                try {
                    if(s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri0 = (Uri)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.b(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    }
                    else if(!s.equals("android.support.v4.media.session.action.PREPARE")) {
                        if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            bundle0.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            MediaSessionCompat.b(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        }
                        else if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            bundle0.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            MediaSessionCompat.b(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        }
                        else if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Uri uri1 = (Uri)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            MediaSessionCompat.b(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        }
                        else if(s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            bundle0.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        }
                        else if(s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            bundle0.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        }
                        else if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            bundle0.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        }
                        else if(s.equals("android.support.v4.media.session.action.SET_RATING")) {
                            RatingCompat ratingCompat0 = (RatingCompat)bundle0.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                            MediaSessionCompat.b(bundle0.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        }
                        else if(s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            bundle0.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        }
                    }
                }
                catch(BadParcelableException unused_ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onFastForward() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public boolean onMediaButtonEvent(Intent intent0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return false;
                }
                this.c(mediaSessionCompat$f0);
                boolean z = android.support.v4.media.session.MediaSessionCompat.b.this.g(intent0);
                this.a(mediaSessionCompat$f0);
                return z || super.onMediaButtonEvent(intent0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onPause() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onPlay() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onPlayFromMediaId(String s, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onPlayFromSearch(String s, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(23)
            public void onPlayFromUri(Uri uri0, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(24)
            public void onPrepare() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(24)
            public void onPrepareFromMediaId(String s, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(24)
            public void onPrepareFromSearch(String s, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(24)
            public void onPrepareFromUri(Uri uri0, Bundle bundle0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                MediaSessionCompat.b(bundle0);
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onRewind() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onSeekTo(long v) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            @RequiresApi(29)
            public void onSetPlaybackSpeed(float f) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onSetRating(Rating rating0) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                RatingCompat.a(rating0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onSkipToNext() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onSkipToPrevious() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onSkipToQueueItem(long v) {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }

            @Override  // android.media.session.MediaSession$Callback
            public void onStop() {
                f mediaSessionCompat$f0 = this.b();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                this.c(mediaSessionCompat$f0);
                this.a(mediaSessionCompat$f0);
            }
        }

        final Object a;
        final MediaSession.Callback b;
        private boolean c;
        @GuardedBy("mLock")
        WeakReference d;
        @GuardedBy("mLock")
        android.support.v4.media.session.MediaSessionCompat.b.a e;

        public android.support.v4.media.session.MediaSessionCompat.b() {
            this.a = new Object();
            this.b = new android.support.v4.media.session.MediaSessionCompat.b.b(this);
            this.d = new WeakReference(null);
        }

        public void A() {
        }

        public void B() {
        }

        public void C(long v) {
        }

        public void D() {
        }

        void E(c mediaSessionCompat$c0, Handler handler0) {
            synchronized(this.a) {
                this.d = new WeakReference(mediaSessionCompat$c0);
                android.support.v4.media.session.MediaSessionCompat.b.a mediaSessionCompat$b$a0 = this.e;
                android.support.v4.media.session.MediaSessionCompat.b.a mediaSessionCompat$b$a1 = null;
                if(mediaSessionCompat$b$a0 != null) {
                    mediaSessionCompat$b$a0.removeCallbacksAndMessages(null);
                }
                if(mediaSessionCompat$c0 != null && handler0 != null) {
                    mediaSessionCompat$b$a1 = new android.support.v4.media.session.MediaSessionCompat.b.a(this, handler0.getLooper());
                }
                this.e = mediaSessionCompat$b$a1;
            }
        }

        void a(c mediaSessionCompat$c0, Handler handler0) {
            if(!this.c) {
                return;
            }
            this.c = false;
            handler0.removeMessages(1);
            PlaybackStateCompat playbackStateCompat0 = mediaSessionCompat$c0.b();
            if(playbackStateCompat0 != null) {
                boolean z = playbackStateCompat0.s() != 3;
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat0) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
        }

        public void d(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
        }

        public void e(String s, Bundle bundle0) {
        }

        public void f() {
        }

        public boolean g(Intent intent0) {
            android.support.v4.media.session.MediaSessionCompat.b.a mediaSessionCompat$b$a0;
            c mediaSessionCompat$c0;
            if(Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized(this.a) {
                mediaSessionCompat$c0 = (c)this.d.get();
                mediaSessionCompat$b$a0 = this.e;
            }
            if(mediaSessionCompat$c0 != null && mediaSessionCompat$b$a0 != null) {
                KeyEvent keyEvent0 = (KeyEvent)intent0.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if(keyEvent0 != null && keyEvent0.getAction() == 0) {
                    RemoteUserInfo mediaSessionManager$RemoteUserInfo0 = mediaSessionCompat$c0.v();
                    switch(keyEvent0.getKeyCode()) {
                        case 0x4F: 
                        case 85: {
                            if(keyEvent0.getRepeatCount() == 0) {
                                if(this.c) {
                                    mediaSessionCompat$b$a0.removeMessages(1);
                                    this.c = false;
                                    return mediaSessionCompat$c0.b() == null ? true : true;
                                }
                                this.c = true;
                                mediaSessionCompat$b$a0.sendMessageDelayed(mediaSessionCompat$b$a0.obtainMessage(1, mediaSessionManager$RemoteUserInfo0), 300L);
                                return true;
                            }
                            this.a(mediaSessionCompat$c0, mediaSessionCompat$b$a0);
                            return true;
                        }
                        default: {
                            this.a(mediaSessionCompat$c0, mediaSessionCompat$b$a0);
                            return false;
                        }
                    }
                }
            }
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String s, Bundle bundle0) {
        }

        public void k(String s, Bundle bundle0) {
        }

        public void l(Uri uri0, Bundle bundle0) {
        }

        public void m() {
        }

        public void n(String s, Bundle bundle0) {
        }

        public void o(String s, Bundle bundle0) {
        }

        public void p(Uri uri0, Bundle bundle0) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat0) {
        }

        @Deprecated
        public void r(int v) {
        }

        public void s() {
        }

        public void t(long v) {
        }

        public void u(boolean z) {
        }

        public void v(float f) {
        }

        public void w(RatingCompat ratingCompat0) {
        }

        public void x(RatingCompat ratingCompat0, Bundle bundle0) {
        }

        public void y(int v) {
        }

        public void z(int v) {
        }
    }

    interface c {
        void a(String arg1, Bundle arg2);

        PlaybackStateCompat b();

        void c(android.support.v4.media.session.MediaSessionCompat.b arg1, Handler arg2);

        void d(int arg1);

        void e(PlaybackStateCompat arg1);

        void f(@Nullable l arg1, @NonNull Handler arg2);

        String g();

        Token getSessionToken();

        void h(int arg1);

        void i(PendingIntent arg1);

        boolean isActive();

        Object j();

        void k(boolean arg1);

        void l(RemoteUserInfo arg1);

        void m(VolumeProviderCompat arg1);

        void n(CharSequence arg1);

        void o(MediaMetadataCompat arg1);

        void p(List arg1);

        void q(int arg1);

        void r(PendingIntent arg1);

        void release();

        android.support.v4.media.session.MediaSessionCompat.b s();

        void setExtras(Bundle arg1);

        void setFlags(int arg1);

        void t(boolean arg1);

        Object u();

        RemoteUserInfo v();

        void x(int arg1);
    }

    @RequiresApi(18)
    static class d extends j {
        private static boolean G = true;

        static {
        }

        d(Context context0, String s, ComponentName componentName0, PendingIntent pendingIntent0, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            super(context0, s, componentName0, pendingIntent0, versionedParcelable0, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        int B(long v) {
            int v1 = super.B(v);
            return (v & 0x100L) == 0L ? v1 : v1 | 0x100;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        void D(PendingIntent pendingIntent0, ComponentName componentName0) {
            if(d.G) {
                try {
                    this.g.registerMediaButtonEventReceiver(pendingIntent0);
                }
                catch(NullPointerException unused_ex) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    d.G = false;
                }
            }
            if(!d.G) {
                super.D(pendingIntent0, componentName0);
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        void P(PlaybackStateCompat playbackStateCompat0) {
            long v = 0L;
            long v1 = playbackStateCompat0.r();
            float f = playbackStateCompat0.o();
            long v2 = playbackStateCompat0.m();
            long v3 = SystemClock.elapsedRealtime();
            if(playbackStateCompat0.s() == 3 && v1 > 0L) {
                if(v2 > 0L) {
                    v = v3 - v2;
                    if(f > 0.0f && f != 1.0f) {
                        v = (long)(((float)v) * f);
                    }
                }
                v1 += v;
            }
            this.h.setPlaybackState(this.A(playbackStateCompat0.s()), v1, f);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        void R(PendingIntent pendingIntent0, ComponentName componentName0) {
            if(d.G) {
                this.g.unregisterMediaButtonEventReceiver(pendingIntent0);
                return;
            }
            super.R(pendingIntent0, componentName0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        public void c(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0, Handler handler0) {
            class android.support.v4.media.session.MediaSessionCompat.d.a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
                final d a;

                @Override  // android.media.RemoteControlClient$OnPlaybackPositionUpdateListener
                public void onPlaybackPositionUpdate(long v) {
                    d.this.C(18, -1, -1, v, null);
                }
            }

            super.c(mediaSessionCompat$b0, handler0);
            if(mediaSessionCompat$b0 == null) {
                this.h.setPlaybackPositionUpdateListener(null);
                return;
            }
            android.support.v4.media.session.MediaSessionCompat.d.a mediaSessionCompat$d$a0 = new android.support.v4.media.session.MediaSessionCompat.d.a(this);
            this.h.setPlaybackPositionUpdateListener(mediaSessionCompat$d$a0);
        }
    }

    @RequiresApi(19)
    static class e extends d {
        e(Context context0, String s, ComponentName componentName0, PendingIntent pendingIntent0, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            super(context0, s, componentName0, pendingIntent0, versionedParcelable0, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$d
        int B(long v) {
            int v1 = super.B(v);
            return (v & 0x80L) == 0L ? v1 : v1 | 0x200;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$d
        public void c(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0, Handler handler0) {
            class android.support.v4.media.session.MediaSessionCompat.e.a implements RemoteControlClient.OnMetadataUpdateListener {
                final e a;

                @Override  // android.media.RemoteControlClient$OnMetadataUpdateListener
                public void onMetadataUpdate(int v, Object object0) {
                    if(v == 0x10000001 && object0 instanceof Rating) {
                        RatingCompat ratingCompat0 = RatingCompat.a(object0);
                        e.this.C(19, -1, -1, ratingCompat0, null);
                    }
                }
            }

            super.c(mediaSessionCompat$b0, handler0);
            if(mediaSessionCompat$b0 == null) {
                this.h.setMetadataUpdateListener(null);
                return;
            }
            android.support.v4.media.session.MediaSessionCompat.e.a mediaSessionCompat$e$a0 = new android.support.v4.media.session.MediaSessionCompat.e.a(this);
            this.h.setMetadataUpdateListener(mediaSessionCompat$e$a0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$j
        RemoteControlClient.MetadataEditor y(Bundle bundle0) {
            RemoteControlClient.MetadataEditor remoteControlClient$MetadataEditor0 = super.y(bundle0);
            if(((this.s == null ? 0L : this.s.c()) & 0x80L) != 0L) {
                remoteControlClient$MetadataEditor0.addEditableKey(0x10000001);
            }
            if(bundle0 == null) {
                return remoteControlClient$MetadataEditor0;
            }
            if(bundle0.containsKey("android.media.metadata.YEAR")) {
                remoteControlClient$MetadataEditor0.putLong(8, bundle0.getLong("android.media.metadata.YEAR"));
            }
            if(bundle0.containsKey("android.media.metadata.RATING")) {
                remoteControlClient$MetadataEditor0.putObject(101, bundle0.getParcelable("android.media.metadata.RATING"));
            }
            if(bundle0.containsKey("android.media.metadata.USER_RATING")) {
                remoteControlClient$MetadataEditor0.putObject(0x10000001, bundle0.getParcelable("android.media.metadata.USER_RATING"));
            }
            return remoteControlClient$MetadataEditor0;
        }
    }

    @RequiresApi(21)
    static class f implements c {
        static class android.support.v4.media.session.MediaSessionCompat.f.a extends android.support.v4.media.session.b.b {
            private final AtomicReference R8;

            android.support.v4.media.session.MediaSessionCompat.f.a(@NonNull f mediaSessionCompat$f0) {
                this.R8 = new AtomicReference(mediaSessionCompat$f0);
            }

            @Override  // android.support.v4.media.session.b
            public void D0(long v) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void G0(RatingCompat ratingCompat0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void H0(int v, int v1, String s) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void J0(String s, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void O0() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void P(long v) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public List Q() {
                return null;
            }

            @Override  // android.support.v4.media.session.b
            public void R(String s, Bundle bundle0) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public boolean S() {
                return false;
            }

            @Override  // android.support.v4.media.session.b
            public void T(Uri uri0, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public PendingIntent U() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void V(String s, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void W(String s, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void W0(int v, int v1, String s) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void X(RatingCompat ratingCompat0, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void Y(int v) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void Z(String s, Bundle bundle0, ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void a0() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public PlaybackStateCompat b() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0 == null ? null : MediaSessionCompat.j(mediaSessionCompat$f0.h, mediaSessionCompat$f0.j);
            }

            @Override  // android.support.v4.media.session.b
            public void b0(boolean z) {
            }

            @Override  // android.support.v4.media.session.b
            public void c() throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void c0(android.support.v4.media.session.a a0) {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                int v = Binder.getCallingPid();
                int v1 = Binder.getCallingUid();
                RemoteUserInfo mediaSessionManager$RemoteUserInfo0 = new RemoteUserInfo("android.media.session.MediaController", v, v1);
                mediaSessionCompat$f0.g.register(a0, mediaSessionManager$RemoteUserInfo0);
                synchronized(mediaSessionCompat$f0.d) {
                    m mediaSessionCompat$m0 = mediaSessionCompat$f0.p;
                    if(mediaSessionCompat$m0 != null) {
                        mediaSessionCompat$m0.a(v, v1);
                    }
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean d0() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void e0(android.support.v4.media.session.a a0) {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                if(mediaSessionCompat$f0 == null) {
                    return;
                }
                mediaSessionCompat$f0.g.unregister(a0);
                int v = Binder.getCallingPid();
                int v1 = Binder.getCallingUid();
                synchronized(mediaSessionCompat$f0.d) {
                    m mediaSessionCompat$m0 = mediaSessionCompat$f0.p;
                    if(mediaSessionCompat$m0 != null) {
                        mediaSessionCompat$m0.b(v, v1);
                    }
                }
            }

            @Override  // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public long getFlags() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public String getTag() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public int i() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0 == null ? -1 : mediaSessionCompat$f0.m;
            }

            @Override  // android.support.v4.media.session.b
            public ParcelableVolumeInfo j0() {
                throw new AssertionError();
            }

            public void j1() {
                this.R8.set(null);
            }

            @Override  // android.support.v4.media.session.b
            public void n() throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void p(float f) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void p0(String s, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void q(int v) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public boolean r() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0 != null && mediaSessionCompat$f0.l;
            }

            @Override  // android.support.v4.media.session.b
            public void r0(Uri uri0, Bundle bundle0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public CharSequence s() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public boolean s0(KeyEvent keyEvent0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void t(boolean z) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public int u() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0 == null ? 0 : mediaSessionCompat$f0.k;
            }

            @Override  // android.support.v4.media.session.b
            public void u0(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public Bundle v() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0.e == null ? null : new Bundle(mediaSessionCompat$f0.e);
            }

            @Override  // android.support.v4.media.session.b
            public int w() {
                f mediaSessionCompat$f0 = (f)this.R8.get();
                return mediaSessionCompat$f0 == null ? -1 : mediaSessionCompat$f0.n;
            }

            @Override  // android.support.v4.media.session.b
            public void x(int v) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void y(MediaDescriptionCompat mediaDescriptionCompat0) {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.b
            public void z(MediaDescriptionCompat mediaDescriptionCompat0) {
                throw new AssertionError();
            }
        }

        final MediaSession a;
        final android.support.v4.media.session.MediaSessionCompat.f.a b;
        final Token c;
        final Object d;
        Bundle e;
        boolean f;
        final RemoteCallbackList g;
        PlaybackStateCompat h;
        List i;
        MediaMetadataCompat j;
        int k;
        boolean l;
        int m;
        int n;
        @GuardedBy("mLock")
        android.support.v4.media.session.MediaSessionCompat.b o;
        @GuardedBy("mLock")
        m p;
        @GuardedBy("mLock")
        RemoteUserInfo q;

        f(Context context0, String s, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            this.d = new Object();
            this.f = false;
            this.g = new RemoteCallbackList();
            MediaSession mediaSession0 = this.w(context0, s, bundle0);
            this.a = mediaSession0;
            android.support.v4.media.session.MediaSessionCompat.f.a mediaSessionCompat$f$a0 = new android.support.v4.media.session.MediaSessionCompat.f.a(this);
            this.b = mediaSessionCompat$f$a0;
            this.c = new Token(mediaSession0.getSessionToken(), mediaSessionCompat$f$a0, versionedParcelable0);
            this.e = bundle0;
            this.setFlags(3);
        }

        f(Object object0) {
            this.d = new Object();
            this.f = false;
            this.g = new RemoteCallbackList();
            if(!(object0 instanceof MediaSession)) {
                throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
            }
            this.a = (MediaSession)object0;
            android.support.v4.media.session.MediaSessionCompat.f.a mediaSessionCompat$f$a0 = new android.support.v4.media.session.MediaSessionCompat.f.a(this);
            this.b = mediaSessionCompat$f$a0;
            this.c = new Token(((MediaSession)object0).getSessionToken(), mediaSessionCompat$f$a0);
            this.e = null;
            this.setFlags(3);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void a(String s, Bundle bundle0) {
            if(Build.VERSION.SDK_INT < 23) {
                Object object0 = this.d;
                synchronized(object0) {
                    for(int v1 = this.g.beginBroadcast() - 1; v1 >= 0; --v1) {
                        android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.g.getBroadcastItem(v1);
                        try {
                            a0.B(s, bundle0);
                        }
                        catch(RemoteException unused_ex) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
            this.a.sendSessionEvent(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public PlaybackStateCompat b() {
            return this.h;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void c(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0, Handler handler0) {
            synchronized(this.d) {
                this.o = mediaSessionCompat$b0;
                this.a.setCallback((mediaSessionCompat$b0 == null ? null : mediaSessionCompat$b0.b), handler0);
                if(mediaSessionCompat$b0 != null) {
                    mediaSessionCompat$b0.E(this, handler0);
                }
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void d(int v) {
            this.k = v;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void e(PlaybackStateCompat playbackStateCompat0) {
            this.h = playbackStateCompat0;
            synchronized(this.d) {
                for(int v1 = this.g.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.g.getBroadcastItem(v1);
                    try {
                        a0.h1(playbackStateCompat0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.g.finishBroadcast();
            }
            PlaybackState playbackState0 = playbackStateCompat0 == null ? null : ((PlaybackState)playbackStateCompat0.q());
            this.a.setPlaybackState(playbackState0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void f(@Nullable l mediaSessionCompat$l0, @NonNull Handler handler0) {
            synchronized(this.d) {
                m mediaSessionCompat$m0 = this.p;
                if(mediaSessionCompat$m0 != null) {
                    mediaSessionCompat$m0.removeCallbacksAndMessages(null);
                }
                this.p = mediaSessionCompat$l0 == null ? null : new m(handler0.getLooper(), mediaSessionCompat$l0);
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public String g() {
            if(Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String)this.a.getClass().getMethod("getCallingPackage", null).invoke(this.a, null);
            }
            catch(Exception exception0) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", exception0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Token getSessionToken() {
            return this.c;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void h(int v) {
            AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder();
            audioAttributes$Builder0.setLegacyStreamType(v);
            AudioAttributes audioAttributes0 = audioAttributes$Builder0.build();
            this.a.setPlaybackToLocal(audioAttributes0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void i(PendingIntent pendingIntent0) {
            this.a.setMediaButtonReceiver(pendingIntent0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public boolean isActive() {
            return this.a.isActive();
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Object j() {
            return null;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void k(boolean z) {
            this.a.setActive(z);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void l(RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
            synchronized(this.d) {
                this.q = mediaSessionManager$RemoteUserInfo0;
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void m(VolumeProviderCompat volumeProviderCompat0) {
            VolumeProvider volumeProvider0 = (VolumeProvider)volumeProviderCompat0.e();
            this.a.setPlaybackToRemote(volumeProvider0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void n(CharSequence charSequence0) {
            this.a.setQueueTitle(charSequence0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void o(MediaMetadataCompat mediaMetadataCompat0) {
            this.j = mediaMetadataCompat0;
            MediaMetadata mediaMetadata0 = mediaMetadataCompat0 == null ? null : ((MediaMetadata)mediaMetadataCompat0.h());
            this.a.setMetadata(mediaMetadata0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void p(List list0) {
            this.i = list0;
            if(list0 == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((MediaSession.QueueItem)((QueueItem)object0).f()));
            }
            this.a.setQueue(arrayList0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void q(int v) {
            if(this.m != v) {
                this.m = v;
                Object object0 = this.d;
                synchronized(object0) {
                    for(int v2 = this.g.beginBroadcast() - 1; v2 >= 0; --v2) {
                        android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.g.getBroadcastItem(v2);
                        try {
                            a0.A(v);
                        }
                        catch(RemoteException unused_ex) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void r(PendingIntent pendingIntent0) {
            this.a.setSessionActivity(pendingIntent0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void release() {
            this.f = true;
            this.g.kill();
            if(Build.VERSION.SDK_INT == 27) {
                try {
                    Field field0 = this.a.getClass().getDeclaredField("mCallback");
                    field0.setAccessible(true);
                    Handler handler0 = (Handler)field0.get(this.a);
                    if(handler0 != null) {
                        handler0.removeCallbacksAndMessages(null);
                    }
                }
                catch(Exception exception0) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", exception0);
                }
            }
            this.a.setCallback(null);
            this.b.j1();
            this.a.release();
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public android.support.v4.media.session.MediaSessionCompat.b s() {
            synchronized(this.d) {
            }
            return this.o;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void setExtras(Bundle bundle0) {
            this.a.setExtras(bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        @SuppressLint({"WrongConstant"})
        public void setFlags(int v) {
            this.a.setFlags(v | 3);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void t(boolean z) {
            if(this.l != z) {
                this.l = z;
                Object object0 = this.d;
                synchronized(object0) {
                    for(int v1 = this.g.beginBroadcast() - 1; v1 >= 0; --v1) {
                        android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.g.getBroadcastItem(v1);
                        try {
                            a0.P0(z);
                        }
                        catch(RemoteException unused_ex) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Object u() {
            return this.a;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public RemoteUserInfo v() {
            synchronized(this.d) {
            }
            return this.q;
        }

        public MediaSession w(Context context0, String s, Bundle bundle0) {
            return new MediaSession(context0, s);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void x(int v) {
            if(this.n != v) {
                this.n = v;
                Object object0 = this.d;
                synchronized(object0) {
                    for(int v2 = this.g.beginBroadcast() - 1; v2 >= 0; --v2) {
                        android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.g.getBroadcastItem(v2);
                        try {
                            a0.B0(v);
                        }
                        catch(RemoteException unused_ex) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
        }
    }

    @RequiresApi(22)
    static class g extends f {
        g(Context context0, String s, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            super(context0, s, versionedParcelable0, bundle0);
        }

        g(Object object0) {
            super(object0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$f
        public void d(int v) {
            this.a.setRatingType(v);
        }
    }

    @RequiresApi(28)
    static class h extends g {
        h(Context context0, String s, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            super(context0, s, versionedParcelable0, bundle0);
        }

        h(Object object0) {
            super(object0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$f
        public void l(RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$f
        @NonNull
        public final RemoteUserInfo v() {
            return new RemoteUserInfo(this.a.getCurrentControllerInfo());
        }
    }

    @RequiresApi(29)
    static class i extends h {
        i(Context context0, String s, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            super(context0, s, versionedParcelable0, bundle0);
        }

        i(Object object0) {
            super(object0);
            this.e = ((MediaSession)object0).getController().getSessionInfo();
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$f
        public MediaSession w(Context context0, String s, Bundle bundle0) {
            return android.support.v4.media.session.l.a(context0, s, bundle0);
        }
    }

    static class j implements c {
        class android.support.v4.media.session.MediaSessionCompat.j.a extends Callback {
            final j a;

            @Override  // androidx.media.VolumeProviderCompat$Callback
            public void a(VolumeProviderCompat volumeProviderCompat0) {
                if(j.this.D != volumeProviderCompat0) {
                    return;
                }
                ParcelableVolumeInfo parcelableVolumeInfo0 = new ParcelableVolumeInfo(j.this.B, j.this.C, volumeProviderCompat0.c(), volumeProviderCompat0.b(), volumeProviderCompat0.a());
                j.this.O(parcelableVolumeInfo0);
            }
        }

        static final class android.support.v4.media.session.MediaSessionCompat.j.b {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public android.support.v4.media.session.MediaSessionCompat.j.b(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
                this.a = s;
                this.b = bundle0;
                this.c = resultReceiver0;
            }
        }

        static class android.support.v4.media.session.MediaSessionCompat.j.c extends android.support.v4.media.session.b.b {
            private final AtomicReference R8;
            private final String S8;
            private final String T8;

            android.support.v4.media.session.MediaSessionCompat.j.c(j mediaSessionCompat$j0, String s, String s1) {
                this.R8 = new AtomicReference(mediaSessionCompat$j0);
                this.S8 = s;
                this.T8 = s1;
            }

            @Override  // android.support.v4.media.session.b
            public void D0(long v) {
                this.l1(11, v);
            }

            @Override  // android.support.v4.media.session.b
            public void G0(RatingCompat ratingCompat0) {
                this.l1(19, ratingCompat0);
            }

            @Override  // android.support.v4.media.session.b
            public void H0(int v, int v1, String s) {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                if(mediaSessionCompat$j0 != null) {
                    mediaSessionCompat$j0.Q(v, v1);
                }
            }

            @Override  // android.support.v4.media.session.b
            public void J0(String s, Bundle bundle0) {
                this.n1(5, s, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void O0() {
                this.j1(16);
            }

            @Override  // android.support.v4.media.session.b
            public void P(long v) {
                this.l1(18, v);
            }

            @Override  // android.support.v4.media.session.b
            public List Q() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : mediaSessionCompat$j0.u;
            }

            @Override  // android.support.v4.media.session.b
            public void R(String s, Bundle bundle0) throws RemoteException {
                this.n1(20, s, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public boolean S() {
                return false;
            }

            @Override  // android.support.v4.media.session.b
            public void T(Uri uri0, Bundle bundle0) {
                this.n1(6, uri0, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public PendingIntent U() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : mediaSessionCompat$j0.t;
            }

            @Override  // android.support.v4.media.session.b
            public void V(String s, Bundle bundle0) {
                this.n1(4, s, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void W(String s, Bundle bundle0) {
                this.n1(8, s, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void W0(int v, int v1, String s) {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                if(mediaSessionCompat$j0 != null) {
                    mediaSessionCompat$j0.w(v, v1);
                }
            }

            @Override  // android.support.v4.media.session.b
            public void X(RatingCompat ratingCompat0, Bundle bundle0) {
                this.n1(0x1F, ratingCompat0, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void Y(int v) {
                this.k1(28, v);
            }

            @Override  // android.support.v4.media.session.b
            public void Z(String s, Bundle bundle0, ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper0) {
                this.l1(1, new android.support.v4.media.session.MediaSessionCompat.j.b(s, bundle0, (mediaSessionCompat$ResultReceiverWrapper0 == null ? null : mediaSessionCompat$ResultReceiverWrapper0.a)));
            }

            @Override  // android.support.v4.media.session.b
            public void a0() {
                this.j1(17);
            }

            @Override  // android.support.v4.media.session.b
            public PlaybackStateCompat b() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : MediaSessionCompat.j(mediaSessionCompat$j0.s, mediaSessionCompat$j0.r);
            }

            @Override  // android.support.v4.media.session.b
            public void b0(boolean z) {
            }

            @Override  // android.support.v4.media.session.b
            public void c() throws RemoteException {
                this.j1(7);
            }

            @Override  // android.support.v4.media.session.b
            public void c0(android.support.v4.media.session.a a0) {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                if(mediaSessionCompat$j0 == null) {
                    try {
                        a0.E();
                    }
                    catch(Exception unused_ex) {
                    }
                    return;
                }
                int v = Binder.getCallingPid();
                int v1 = Binder.getCallingUid();
                RemoteUserInfo mediaSessionManager$RemoteUserInfo0 = new RemoteUserInfo(mediaSessionCompat$j0.z(v1), v, v1);
                mediaSessionCompat$j0.j.register(a0, mediaSessionManager$RemoteUserInfo0);
                synchronized(mediaSessionCompat$j0.i) {
                    m mediaSessionCompat$m0 = mediaSessionCompat$j0.p;
                    if(mediaSessionCompat$m0 != null) {
                        mediaSessionCompat$m0.a(v, v1);
                    }
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean d0() {
                return true;
            }

            @Override  // android.support.v4.media.session.b
            public void e0(android.support.v4.media.session.a a0) {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                if(mediaSessionCompat$j0 == null) {
                    return;
                }
                mediaSessionCompat$j0.j.unregister(a0);
                int v = Binder.getCallingPid();
                int v1 = Binder.getCallingUid();
                synchronized(mediaSessionCompat$j0.i) {
                    m mediaSessionCompat$m0 = mediaSessionCompat$j0.p;
                    if(mediaSessionCompat$m0 != null) {
                        mediaSessionCompat$m0.b(v, v1);
                    }
                }
            }

            @Override  // android.support.v4.media.session.b
            public Bundle getExtras() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : mediaSessionCompat$j0.A;
            }

            @Override  // android.support.v4.media.session.b
            public long getFlags() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? 0L : ((long)mediaSessionCompat$j0.q);
            }

            @Override  // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : mediaSessionCompat$j0.r;
            }

            @Override  // android.support.v4.media.session.b
            public String getPackageName() {
                return this.S8;
            }

            @Override  // android.support.v4.media.session.b
            public String getTag() {
                return this.T8;
            }

            @Override  // android.support.v4.media.session.b
            public int i() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? -1 : mediaSessionCompat$j0.y;
            }

            @Override  // android.support.v4.media.session.b
            public ParcelableVolumeInfo j0() {
                int v3;
                int v2;
                int v1;
                int v5;
                int v4;
                j mediaSessionCompat$j0 = (j)this.R8.get();
                if(mediaSessionCompat$j0 == null) {
                    return null;
                }
                synchronized(mediaSessionCompat$j0.i) {
                    v1 = mediaSessionCompat$j0.B;
                    v2 = mediaSessionCompat$j0.C;
                    VolumeProviderCompat volumeProviderCompat0 = mediaSessionCompat$j0.D;
                    v3 = 2;
                    if(v1 == 2) {
                        v4 = volumeProviderCompat0.a();
                        v5 = volumeProviderCompat0.b();
                        v3 = volumeProviderCompat0.c();
                    }
                    else {
                        int v6 = mediaSessionCompat$j0.g.getStreamMaxVolume(v2);
                        v4 = mediaSessionCompat$j0.g.getStreamVolume(v2);
                        v5 = v6;
                    }
                }
                return new ParcelableVolumeInfo(v1, v2, v3, v5, v4);
            }

            void j1(int v) {
                this.m1(v, null, 0, null);
            }

            void k1(int v, int v1) {
                this.m1(v, null, v1, null);
            }

            void l1(int v, Object object0) {
                this.m1(v, object0, 0, null);
            }

            void m1(int v, Object object0, int v1, Bundle bundle0) {
                Object object1 = this.R8.get();
                if(((j)object1) != null) {
                    ((j)object1).C(v, v1, 0, object0, bundle0);
                }
            }

            @Override  // android.support.v4.media.session.b
            public void n() throws RemoteException {
                this.j1(3);
            }

            void n1(int v, Object object0, Bundle bundle0) {
                this.m1(v, object0, 0, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void next() {
                this.j1(14);
            }

            @Override  // android.support.v4.media.session.b
            public void p(float f) {
                this.l1(0x20, f);
            }

            @Override  // android.support.v4.media.session.b
            public void p0(String s, Bundle bundle0) {
                this.n1(9, s, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public void pause() {
                this.j1(12);
            }

            @Override  // android.support.v4.media.session.b
            public void previous() {
                this.j1(15);
            }

            @Override  // android.support.v4.media.session.b
            public void q(int v) {
                this.k1(23, v);
            }

            @Override  // android.support.v4.media.session.b
            public boolean r() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 != null && mediaSessionCompat$j0.x;
            }

            @Override  // android.support.v4.media.session.b
            public void r0(Uri uri0, Bundle bundle0) {
                this.n1(10, uri0, bundle0);
            }

            @Override  // android.support.v4.media.session.b
            public CharSequence s() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? null : mediaSessionCompat$j0.v;
            }

            @Override  // android.support.v4.media.session.b
            public boolean s0(KeyEvent keyEvent0) {
                this.l1(21, keyEvent0);
                return true;
            }

            @Override  // android.support.v4.media.session.b
            public void stop() {
                this.j1(13);
            }

            @Override  // android.support.v4.media.session.b
            public void t(boolean z) {
                this.l1(29, Boolean.valueOf(z));
            }

            @Override  // android.support.v4.media.session.b
            public int u() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? 0 : mediaSessionCompat$j0.w;
            }

            @Override  // android.support.v4.media.session.b
            public void u0(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
                this.m1(26, mediaDescriptionCompat0, v, null);
            }

            @Override  // android.support.v4.media.session.b
            public Bundle v() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null || mediaSessionCompat$j0.f == null ? null : new Bundle(mediaSessionCompat$j0.f);
            }

            @Override  // android.support.v4.media.session.b
            public int w() {
                j mediaSessionCompat$j0 = (j)this.R8.get();
                return mediaSessionCompat$j0 == null ? -1 : mediaSessionCompat$j0.z;
            }

            @Override  // android.support.v4.media.session.b
            public void x(int v) {
                this.k1(30, v);
            }

            @Override  // android.support.v4.media.session.b
            public void y(MediaDescriptionCompat mediaDescriptionCompat0) {
                this.l1(27, mediaDescriptionCompat0);
            }

            @Override  // android.support.v4.media.session.b
            public void z(MediaDescriptionCompat mediaDescriptionCompat0) {
                this.l1(25, mediaDescriptionCompat0);
            }
        }

        class android.support.v4.media.session.MediaSessionCompat.j.d extends Handler {
            private static final int A = 25;
            private static final int B = 26;
            private static final int C = 27;
            private static final int D = 28;
            private static final int E = 29;
            private static final int F = 30;
            private static final int G = 0x7F;
            private static final int H = 0x7E;
            final j a;
            private static final int b = 1;
            private static final int c = 2;
            private static final int d = 3;
            private static final int e = 4;
            private static final int f = 5;
            private static final int g = 6;
            private static final int h = 7;
            private static final int i = 8;
            private static final int j = 9;
            private static final int k = 10;
            private static final int l = 11;
            private static final int m = 12;
            private static final int n = 13;
            private static final int o = 14;
            private static final int p = 15;
            private static final int q = 16;
            private static final int r = 17;
            private static final int s = 18;
            private static final int t = 19;
            private static final int u = 0x1F;
            private static final int v = 0x20;
            private static final int w = 20;
            private static final int x = 21;
            private static final int y = 22;
            private static final int z = 23;

            public android.support.v4.media.session.MediaSessionCompat.j.d(Looper looper0) {
                super(looper0);
            }

            private void a(KeyEvent keyEvent0, android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0) {
                if(keyEvent0 != null && keyEvent0.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat0 = j.this.s;
                    long v = playbackStateCompat0 == null ? 0L : playbackStateCompat0.c();
                    switch(keyEvent0.getKeyCode()) {
                        case 0x4F: 
                        case 85: {
                            Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                            return;
                        }
                        case 86: {
                            if((v & 1L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 87: {
                            if((v & 0x20L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 88: {
                            if((v & 16L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 89: {
                            if((v & 8L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 90: {
                            if((v & 0x40L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 0x7E: {
                            if((v & 4L) != 0L) {
                                return;
                            }
                            break;
                        }
                        case 0x7F: {
                            if((v & 2L) != 0L) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0 = j.this.n;
                if(mediaSessionCompat$b0 == null) {
                    return;
                }
                Bundle bundle0 = message0.getData();
                MediaSessionCompat.b(bundle0);
                RemoteUserInfo mediaSessionManager$RemoteUserInfo0 = new RemoteUserInfo(bundle0.getString("data_calling_pkg"), bundle0.getInt("data_calling_pid"), bundle0.getInt("data_calling_uid"));
                j.this.l(mediaSessionManager$RemoteUserInfo0);
                MediaSessionCompat.b(bundle0.getBundle("data_extras"));
                try {
                    switch(message0.what) {
                        case 2: {
                            j.this.w(message0.arg1, 0);
                            break;
                        }
                        case 21: {
                            KeyEvent keyEvent0 = (KeyEvent)message0.obj;
                            Intent intent0 = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent0.putExtra("android.intent.extra.KEY_EVENT", keyEvent0);
                            if(!mediaSessionCompat$b0.g(intent0)) {
                                this.a(keyEvent0, mediaSessionCompat$b0);
                            }
                            break;
                        }
                        case 22: {
                            j.this.Q(message0.arg1, 0);
                            break;
                        }
                        case 27: {
                            mediaSessionCompat$b0.q(((MediaDescriptionCompat)message0.obj));
                            break;
                        }
                        case 28: {
                            List list0 = j.this.u;
                            if(list0 != null) {
                                QueueItem mediaSessionCompat$QueueItem0 = message0.arg1 < 0 || message0.arg1 >= list0.size() ? null : ((QueueItem)j.this.u.get(message0.arg1));
                                if(mediaSessionCompat$QueueItem0 != null) {
                                    mediaSessionCompat$b0.q(mediaSessionCompat$QueueItem0.d());
                                }
                            }
                        }
                    }
                }
                finally {
                    j.this.l(null);
                }
            }
        }

        Bundle A;
        int B;
        int C;
        VolumeProviderCompat D;
        private Callback E;
        static final int F;
        private final Context a;
        private final ComponentName b;
        private final PendingIntent c;
        private final android.support.v4.media.session.MediaSessionCompat.j.c d;
        private final Token e;
        final Bundle f;
        final AudioManager g;
        final RemoteControlClient h;
        final Object i;
        final RemoteCallbackList j;
        private android.support.v4.media.session.MediaSessionCompat.j.d k;
        boolean l;
        boolean m;
        volatile android.support.v4.media.session.MediaSessionCompat.b n;
        private RemoteUserInfo o;
        m p;
        int q;
        MediaMetadataCompat r;
        PlaybackStateCompat s;
        PendingIntent t;
        List u;
        CharSequence v;
        int w;
        boolean x;
        int y;
        int z;

        public j(Context context0, String s, ComponentName componentName0, PendingIntent pendingIntent0, VersionedParcelable versionedParcelable0, Bundle bundle0) {
            this.i = new Object();
            this.j = new RemoteCallbackList();
            this.l = false;
            this.m = false;
            this.q = 3;
            this.E = new android.support.v4.media.session.MediaSessionCompat.j.a(this);
            if(componentName0 == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.a = context0;
            this.f = bundle0;
            this.g = (AudioManager)context0.getSystemService("audio");
            this.b = componentName0;
            this.c = pendingIntent0;
            android.support.v4.media.session.MediaSessionCompat.j.c mediaSessionCompat$j$c0 = new android.support.v4.media.session.MediaSessionCompat.j.c(this, "com.dcinside.app.android", s);
            this.d = mediaSessionCompat$j$c0;
            this.e = new Token(mediaSessionCompat$j$c0, null, versionedParcelable0);
            this.w = 0;
            this.B = 1;
            this.C = 3;
            this.h = new RemoteControlClient(pendingIntent0);
        }

        int A(int v) {
            switch(v) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    return 3;
                }
                case 4: {
                    return 4;
                }
                case 5: {
                    return 5;
                }
                case 7: {
                    return 9;
                }
                case 6: 
                case 8: {
                    return 8;
                }
                case 9: {
                    return 7;
                }
                case 10: 
                case 11: {
                    return 6;
                }
                default: {
                    return -1;
                }
            }
        }

        int B(long v) {
            int v1 = (1L & v) == 0L ? 0 : 0x20;
            if((2L & v) != 0L) {
                v1 |= 16;
            }
            if((4L & v) != 0L) {
                v1 |= 4;
            }
            if((8L & v) != 0L) {
                v1 |= 2;
            }
            if((16L & v) != 0L) {
                v1 |= 1;
            }
            if((0x20L & v) != 0L) {
                v1 |= 0x80;
            }
            if((0x40L & v) != 0L) {
                v1 |= 0x40;
            }
            return (v & 0x200L) == 0L ? v1 : v1 | 8;
        }

        void C(int v, int v1, int v2, Object object0, Bundle bundle0) {
            synchronized(this.i) {
                android.support.v4.media.session.MediaSessionCompat.j.d mediaSessionCompat$j$d0 = this.k;
                if(mediaSessionCompat$j$d0 != null) {
                    Message message0 = mediaSessionCompat$j$d0.obtainMessage(v, v1, v2, object0);
                    Bundle bundle1 = new Bundle();
                    int v4 = Binder.getCallingUid();
                    bundle1.putInt("data_calling_uid", v4);
                    bundle1.putString("data_calling_pkg", this.z(v4));
                    int v5 = Binder.getCallingPid();
                    if(v5 > 0) {
                        bundle1.putInt("data_calling_pid", v5);
                    }
                    else {
                        bundle1.putInt("data_calling_pid", -1);
                    }
                    if(bundle0 != null) {
                        bundle1.putBundle("data_extras", bundle0);
                    }
                    message0.setData(bundle1);
                    message0.sendToTarget();
                }
            }
        }

        void D(PendingIntent pendingIntent0, ComponentName componentName0) {
            this.g.registerMediaButtonEventReceiver(componentName0);
        }

        private void E(boolean z) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.P0(z);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void F(String s, Bundle bundle0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.B(s, bundle0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void G(Bundle bundle0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.K0(bundle0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void H(MediaMetadataCompat mediaMetadataCompat0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.v0(mediaMetadataCompat0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void I(List list0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.D(list0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void J(CharSequence charSequence0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.V0(charSequence0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void K(int v) {
            synchronized(this.i) {
                for(int v2 = this.j.beginBroadcast() - 1; v2 >= 0; --v2) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v2);
                    try {
                        a0.A(v);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void L() {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.E();
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
                this.j.kill();
            }
        }

        private void M(int v) {
            synchronized(this.i) {
                for(int v2 = this.j.beginBroadcast() - 1; v2 >= 0; --v2) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v2);
                    try {
                        a0.B0(v);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        private void N(PlaybackStateCompat playbackStateCompat0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.h1(playbackStateCompat0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        void O(ParcelableVolumeInfo parcelableVolumeInfo0) {
            synchronized(this.i) {
                for(int v1 = this.j.beginBroadcast() - 1; v1 >= 0; --v1) {
                    android.support.v4.media.session.a a0 = (android.support.v4.media.session.a)this.j.getBroadcastItem(v1);
                    try {
                        a0.F0(parcelableVolumeInfo0);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                this.j.finishBroadcast();
            }
        }

        void P(PlaybackStateCompat playbackStateCompat0) {
            this.h.setPlaybackState(this.A(playbackStateCompat0.s()));
        }

        void Q(int v, int v1) {
            if(this.B != 2) {
                this.g.setStreamVolume(this.C, v, v1);
            }
            else if(this.D != null) {
            }
        }

        void R(PendingIntent pendingIntent0, ComponentName componentName0) {
            this.g.unregisterMediaButtonEventReceiver(componentName0);
        }

        void S() {
            if(this.m) {
                this.D(this.c, this.b);
                this.g.registerRemoteControlClient(this.h);
                this.o(this.r);
                this.e(this.s);
                return;
            }
            this.R(this.c, this.b);
            this.h.setPlaybackState(0);
            this.g.unregisterRemoteControlClient(this.h);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void a(String s, Bundle bundle0) {
            this.F(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public PlaybackStateCompat b() {
            synchronized(this.i) {
            }
            return this.s;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void c(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0, Handler handler0) {
            synchronized(this.i) {
                android.support.v4.media.session.MediaSessionCompat.j.d mediaSessionCompat$j$d0 = this.k;
                if(mediaSessionCompat$j$d0 != null) {
                    mediaSessionCompat$j$d0.removeCallbacksAndMessages(null);
                }
                this.k = mediaSessionCompat$b0 == null || handler0 == null ? null : new android.support.v4.media.session.MediaSessionCompat.j.d(this, handler0.getLooper());
                if(this.n != mediaSessionCompat$b0 && this.n != null) {
                    this.n.E(null, null);
                }
                this.n = mediaSessionCompat$b0;
                if(this.n != null) {
                    this.n.E(this, handler0);
                }
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void d(int v) {
            this.w = v;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void e(PlaybackStateCompat playbackStateCompat0) {
            synchronized(this.i) {
                this.s = playbackStateCompat0;
            }
            this.N(playbackStateCompat0);
            if(!this.m) {
                return;
            }
            if(playbackStateCompat0 == null) {
                this.h.setPlaybackState(0);
                this.h.setTransportControlFlags(0);
                return;
            }
            this.P(playbackStateCompat0);
            this.h.setTransportControlFlags(this.B(playbackStateCompat0.c()));
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void f(@Nullable l mediaSessionCompat$l0, @NonNull Handler handler0) {
            synchronized(this.i) {
                m mediaSessionCompat$m0 = this.p;
                if(mediaSessionCompat$m0 != null) {
                    mediaSessionCompat$m0.removeCallbacksAndMessages(null);
                }
                this.p = mediaSessionCompat$l0 == null ? null : new m(handler0.getLooper(), mediaSessionCompat$l0);
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public String g() {
            return null;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Token getSessionToken() {
            return this.e;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void h(int v) {
            VolumeProviderCompat volumeProviderCompat0 = this.D;
            if(volumeProviderCompat0 != null) {
                volumeProviderCompat0.h(null);
            }
            this.C = v;
            this.B = 1;
            this.O(new ParcelableVolumeInfo(1, this.C, 2, this.g.getStreamMaxVolume(this.C), this.g.getStreamVolume(this.C)));
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void i(PendingIntent pendingIntent0) {
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public boolean isActive() {
            return this.m;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Object j() {
            return null;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void k(boolean z) {
            if(z == this.m) {
                return;
            }
            this.m = z;
            this.S();
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void l(RemoteUserInfo mediaSessionManager$RemoteUserInfo0) {
            synchronized(this.i) {
                this.o = mediaSessionManager$RemoteUserInfo0;
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void m(VolumeProviderCompat volumeProviderCompat0) {
            if(volumeProviderCompat0 == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            VolumeProviderCompat volumeProviderCompat1 = this.D;
            if(volumeProviderCompat1 != null) {
                volumeProviderCompat1.h(null);
            }
            this.B = 2;
            this.D = volumeProviderCompat0;
            this.O(new ParcelableVolumeInfo(2, this.C, this.D.c(), this.D.b(), this.D.a()));
            volumeProviderCompat0.h(this.E);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void n(CharSequence charSequence0) {
            this.v = charSequence0;
            this.J(charSequence0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void o(MediaMetadataCompat mediaMetadataCompat0) {
            if(mediaMetadataCompat0 != null) {
                mediaMetadataCompat0 = new android.support.v4.media.MediaMetadataCompat.b(mediaMetadataCompat0, MediaSessionCompat.R).a();
            }
            synchronized(this.i) {
                this.r = mediaMetadataCompat0;
            }
            this.H(mediaMetadataCompat0);
            if(!this.m) {
                return;
            }
            this.y((mediaMetadataCompat0 == null ? null : mediaMetadataCompat0.e())).apply();
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void p(List list0) {
            this.u = list0;
            this.I(list0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void q(int v) {
            if(this.y != v) {
                this.y = v;
                this.K(v);
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void r(PendingIntent pendingIntent0) {
            synchronized(this.i) {
                this.t = pendingIntent0;
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void release() {
            this.m = false;
            this.l = true;
            this.S();
            this.L();
            this.c(null, null);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public android.support.v4.media.session.MediaSessionCompat.b s() {
            synchronized(this.i) {
            }
            return this.n;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void setExtras(Bundle bundle0) {
            this.A = bundle0;
            this.G(bundle0);
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void setFlags(int v) {
            synchronized(this.i) {
                this.q = v | 3;
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void t(boolean z) {
            if(this.x != z) {
                this.x = z;
                this.E(z);
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public Object u() {
            return null;
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public RemoteUserInfo v() {
            synchronized(this.i) {
            }
            return this.o;
        }

        void w(int v, int v1) {
            if(this.B != 2) {
                this.g.adjustStreamVolume(this.C, v, v1);
            }
            else if(this.D != null) {
            }
        }

        @Override  // android.support.v4.media.session.MediaSessionCompat$c
        public void x(int v) {
            if(this.z != v) {
                this.z = v;
                this.M(v);
            }
        }

        RemoteControlClient.MetadataEditor y(Bundle bundle0) {
            RemoteControlClient.MetadataEditor remoteControlClient$MetadataEditor0 = this.h.editMetadata(true);
            if(bundle0 == null) {
                return remoteControlClient$MetadataEditor0;
            }
            if(bundle0.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap0 = (Bitmap)bundle0.getParcelable("android.media.metadata.ART");
                if(bitmap0 != null) {
                    bitmap0 = bitmap0.copy(bitmap0.getConfig(), false);
                }
                remoteControlClient$MetadataEditor0.putBitmap(100, bitmap0);
            }
            else if(bundle0.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap1 = (Bitmap)bundle0.getParcelable("android.media.metadata.ALBUM_ART");
                if(bitmap1 != null) {
                    bitmap1 = bitmap1.copy(bitmap1.getConfig(), false);
                }
                remoteControlClient$MetadataEditor0.putBitmap(100, bitmap1);
            }
            if(bundle0.containsKey("android.media.metadata.ALBUM")) {
                remoteControlClient$MetadataEditor0.putString(1, bundle0.getString("android.media.metadata.ALBUM"));
            }
            if(bundle0.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                remoteControlClient$MetadataEditor0.putString(13, bundle0.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if(bundle0.containsKey("android.media.metadata.ARTIST")) {
                remoteControlClient$MetadataEditor0.putString(2, bundle0.getString("android.media.metadata.ARTIST"));
            }
            if(bundle0.containsKey("android.media.metadata.AUTHOR")) {
                remoteControlClient$MetadataEditor0.putString(3, bundle0.getString("android.media.metadata.AUTHOR"));
            }
            if(bundle0.containsKey("android.media.metadata.COMPILATION")) {
                remoteControlClient$MetadataEditor0.putString(15, bundle0.getString("android.media.metadata.COMPILATION"));
            }
            if(bundle0.containsKey("android.media.metadata.COMPOSER")) {
                remoteControlClient$MetadataEditor0.putString(4, bundle0.getString("android.media.metadata.COMPOSER"));
            }
            if(bundle0.containsKey("android.media.metadata.DATE")) {
                remoteControlClient$MetadataEditor0.putString(5, bundle0.getString("android.media.metadata.DATE"));
            }
            if(bundle0.containsKey("android.media.metadata.DISC_NUMBER")) {
                remoteControlClient$MetadataEditor0.putLong(14, bundle0.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if(bundle0.containsKey("android.media.metadata.DURATION")) {
                remoteControlClient$MetadataEditor0.putLong(9, bundle0.getLong("android.media.metadata.DURATION"));
            }
            if(bundle0.containsKey("android.media.metadata.GENRE")) {
                remoteControlClient$MetadataEditor0.putString(6, bundle0.getString("android.media.metadata.GENRE"));
            }
            if(bundle0.containsKey("android.media.metadata.TITLE")) {
                remoteControlClient$MetadataEditor0.putString(7, bundle0.getString("android.media.metadata.TITLE"));
            }
            if(bundle0.containsKey("android.media.metadata.TRACK_NUMBER")) {
                remoteControlClient$MetadataEditor0.putLong(0, bundle0.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if(bundle0.containsKey("android.media.metadata.WRITER")) {
                remoteControlClient$MetadataEditor0.putString(11, bundle0.getString("android.media.metadata.WRITER"));
            }
            return remoteControlClient$MetadataEditor0;
        }

        String z(int v) {
            String s = this.a.getPackageManager().getNameForUid(v);
            return TextUtils.isEmpty(s) ? "android.media.session.MediaController" : s;
        }
    }

    public interface k {
        void a();
    }

    @RestrictTo({Scope.c})
    public interface l {
        void a(int arg1, int arg2);

        void b(int arg1, int arg2);
    }

    static final class m extends Handler {
        private final l a;
        private static final int b = 1001;
        private static final int c = 1002;

        m(@NonNull Looper looper0, @NonNull l mediaSessionCompat$l0) {
            super(looper0);
            this.a = mediaSessionCompat$l0;
        }

        public void a(int v, int v1) {
            this.obtainMessage(1001, v, v1).sendToTarget();
        }

        public void b(int v, int v1) {
            this.obtainMessage(1002, v, v1).sendToTarget();
        }

        @Override  // android.os.Handler
        public void handleMessage(@NonNull Message message0) {
            super.handleMessage(message0);
            switch(message0.what) {
                case 1001: {
                    this.a.a(message0.arg1, message0.arg2);
                    return;
                }
                case 1002: {
                    this.a.b(message0.arg1, message0.arg2);
                }
            }
        }
    }

    @RestrictTo({Scope.a})
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @RestrictTo({Scope.a})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @RestrictTo({Scope.a})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_URI";
    @RestrictTo({Scope.a})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @RestrictTo({Scope.a})
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    @RestrictTo({Scope.a})
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @RestrictTo({Scope.a})
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @RestrictTo({Scope.a})
    public static final String H = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @RestrictTo({Scope.a})
    public static final String I = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @RestrictTo({Scope.a})
    public static final String J = "android.support.v4.media.session.TOKEN";
    @RestrictTo({Scope.a})
    public static final String K = "android.support.v4.media.session.EXTRA_BINDER";
    @RestrictTo({Scope.a})
    public static final String L = "android.support.v4.media.session.SESSION_TOKEN2";
    private static final int M = 320;
    private static final String N = "data_calling_pkg";
    private static final String O = "data_calling_pid";
    private static final String P = "data_calling_uid";
    private static final String Q = "data_extras";
    static int R = 0;
    private final c a;
    private final MediaControllerCompat b;
    private final ArrayList c;
    static final String d = "MediaSessionCompat";
    @Deprecated
    public static final int e = 1;
    @Deprecated
    public static final int f = 2;
    public static final int g = 4;
    public static final String h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String i = "android.support.v4.media.session.action.SKIP_AD";
    public static final String j = "android.support.v4.media.session.action.FOLLOW";
    public static final String k = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    @RestrictTo({Scope.a})
    public static final String q = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @RestrictTo({Scope.a})
    public static final String r = "android.support.v4.media.session.action.PREPARE";
    @RestrictTo({Scope.a})
    public static final String s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @RestrictTo({Scope.a})
    public static final String t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @RestrictTo({Scope.a})
    public static final String u = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @RestrictTo({Scope.a})
    public static final String v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @RestrictTo({Scope.a})
    public static final String w = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @RestrictTo({Scope.a})
    public static final String x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @RestrictTo({Scope.a})
    public static final String y = "android.support.v4.media.session.action.SET_RATING";
    @RestrictTo({Scope.a})
    public static final String z = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";

    private MediaSessionCompat(Context context0, c mediaSessionCompat$c0) {
        this.c = new ArrayList();
        this.a = mediaSessionCompat$c0;
        this.b = new MediaControllerCompat(context0, this);
    }

    public MediaSessionCompat(@NonNull Context context0, @NonNull String s) {
        this(context0, s, null, null);
    }

    public MediaSessionCompat(@NonNull Context context0, @NonNull String s, @Nullable ComponentName componentName0, @Nullable PendingIntent pendingIntent0) {
        this(context0, s, componentName0, pendingIntent0, null);
    }

    public MediaSessionCompat(@NonNull Context context0, @NonNull String s, @Nullable ComponentName componentName0, @Nullable PendingIntent pendingIntent0, @Nullable Bundle bundle0) {
        this(context0, s, componentName0, pendingIntent0, bundle0, null);
    }

    @RestrictTo({Scope.c})
    public MediaSessionCompat(@NonNull Context context0, @NonNull String s, @Nullable ComponentName componentName0, @Nullable PendingIntent pendingIntent0, @Nullable Bundle bundle0, @Nullable VersionedParcelable versionedParcelable0) {
        class android.support.v4.media.session.MediaSessionCompat.a extends android.support.v4.media.session.MediaSessionCompat.b {
            final MediaSessionCompat f;

        }

        this.c = new ArrayList();
        if(context0 == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if(componentName0 == null) {
            componentName0 = MediaButtonReceiver.c(context0);
            if(componentName0 == null) {
                Log.w("MediaSessionCompat", "Couldn\'t find a unique registered media button receiver in the given context.");
            }
        }
        if(componentName0 != null && pendingIntent0 == null) {
            Intent intent0 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent0.setComponent(componentName0);
            pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, (Build.VERSION.SDK_INT < 0x1F ? 0 : 0x2000000));
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            this.a = new i(context0, s, versionedParcelable0, bundle0);
        }
        else if(v >= 28) {
            this.a = new h(context0, s, versionedParcelable0, bundle0);
        }
        else if(v >= 22) {
            this.a = new g(context0, s, versionedParcelable0, bundle0);
        }
        else {
            this.a = new f(context0, s, versionedParcelable0, bundle0);
        }
        Handler handler0 = new Handler((Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()));
        this.q(new android.support.v4.media.session.MediaSessionCompat.a(this), handler0);
        this.a.i(pendingIntent0);
        this.b = new MediaControllerCompat(context0, this);
        if(MediaSessionCompat.R == 0) {
            MediaSessionCompat.R = (int)(TypedValue.applyDimension(1, 320.0f, context0.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public void A(CharSequence charSequence0) {
        this.a.n(charSequence0);
    }

    public void B(int v) {
        this.a.d(v);
    }

    @RestrictTo({Scope.c})
    public void C(@Nullable l mediaSessionCompat$l0, @NonNull Handler handler0) {
        this.a.f(mediaSessionCompat$l0, handler0);
    }

    public void D(int v) {
        this.a.q(v);
    }

    public void E(PendingIntent pendingIntent0) {
        this.a.r(pendingIntent0);
    }

    public void F(int v) {
        this.a.x(v);
    }

    @Nullable
    @RestrictTo({Scope.a})
    public static Bundle G(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            return null;
        }
        MediaSessionCompat.b(bundle0);
        try {
            bundle0.isEmpty();
            return bundle0;
        }
        catch(BadParcelableException unused_ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public void a(k mediaSessionCompat$k0) {
        if(mediaSessionCompat$k0 == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.c.add(mediaSessionCompat$k0);
    }

    @RestrictTo({Scope.a})
    public static void b(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            bundle0.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context0, Object object0) {
        int v = Build.VERSION.SDK_INT;
        if(context0 != null && object0 != null) {
            if(v >= 29) {
                return new MediaSessionCompat(context0, new i(object0));
            }
            return v < 28 ? new MediaSessionCompat(context0, new f(object0)) : new MediaSessionCompat(context0, new h(object0));
        }
        return null;
    }

    @RestrictTo({Scope.a})
    public String d() {
        return this.a.g();
    }

    public MediaControllerCompat e() {
        return this.b;
    }

    @NonNull
    public final RemoteUserInfo f() {
        return this.a.v();
    }

    public Object g() {
        return this.a.u();
    }

    public Object h() {
        return this.a.j();
    }

    public Token i() {
        return this.a.getSessionToken();
    }

    static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat0, MediaMetadataCompat mediaMetadataCompat0) {
        long v = -1L;
        if(playbackStateCompat0 != null && playbackStateCompat0.r() != -1L && (playbackStateCompat0.s() == 3 || playbackStateCompat0.s() == 4 || playbackStateCompat0.s() == 5)) {
            long v1 = playbackStateCompat0.m();
            if(v1 > 0L) {
                long v2 = SystemClock.elapsedRealtime();
                long v3 = ((long)(playbackStateCompat0.o() * ((float)(v2 - v1)))) + playbackStateCompat0.r();
                if(mediaMetadataCompat0 != null && mediaMetadataCompat0.a("android.media.metadata.DURATION")) {
                    v = mediaMetadataCompat0.g("android.media.metadata.DURATION");
                }
                if(v >= 0L && v3 > v) {
                    return new android.support.v4.media.session.PlaybackStateCompat.e(playbackStateCompat0).k(playbackStateCompat0.s(), v, playbackStateCompat0.o(), v2).c();
                }
                return v3 >= 0L ? new android.support.v4.media.session.PlaybackStateCompat.e(playbackStateCompat0).k(playbackStateCompat0.s(), v3, playbackStateCompat0.o(), v2).c() : new android.support.v4.media.session.PlaybackStateCompat.e(playbackStateCompat0).k(playbackStateCompat0.s(), 0L, playbackStateCompat0.o(), v2).c();
            }
        }
        return playbackStateCompat0;
    }

    public boolean k() {
        return this.a.isActive();
    }

    public void l() {
        this.a.release();
    }

    public void m(k mediaSessionCompat$k0) {
        if(mediaSessionCompat$k0 == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.c.remove(mediaSessionCompat$k0);
    }

    public void n(String s, Bundle bundle0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.a.a(s, bundle0);
    }

    public void o(boolean z) {
        this.a.k(z);
        for(Object object0: this.c) {
            ((k)object0).a();
        }
    }

    public void p(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0) {
        this.q(mediaSessionCompat$b0, null);
    }

    public void q(android.support.v4.media.session.MediaSessionCompat.b mediaSessionCompat$b0, Handler handler0) {
        if(mediaSessionCompat$b0 == null) {
            this.a.c(null, null);
            return;
        }
        c mediaSessionCompat$c0 = this.a;
        if(handler0 == null) {
            handler0 = new Handler();
        }
        mediaSessionCompat$c0.c(mediaSessionCompat$b0, handler0);
    }

    public void r(boolean z) {
        this.a.t(z);
    }

    public void s(Bundle bundle0) {
        this.a.setExtras(bundle0);
    }

    public void t(int v) {
        this.a.setFlags(v);
    }

    public void u(PendingIntent pendingIntent0) {
        this.a.i(pendingIntent0);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat0) {
        this.a.o(mediaMetadataCompat0);
    }

    public void w(PlaybackStateCompat playbackStateCompat0) {
        this.a.e(playbackStateCompat0);
    }

    public void x(int v) {
        this.a.h(v);
    }

    public void y(VolumeProviderCompat volumeProviderCompat0) {
        if(volumeProviderCompat0 == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.a.m(volumeProviderCompat0);
    }

    public void z(List list0) {
        if(list0 != null) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                QueueItem mediaSessionCompat$QueueItem0 = (QueueItem)object0;
                if(mediaSessionCompat$QueueItem0 == null) {
                    throw new IllegalArgumentException("queue shouldn\'t have null items");
                }
                if(hashSet0.contains(mediaSessionCompat$QueueItem0.e())) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + mediaSessionCompat$QueueItem0.e(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet0.add(mediaSessionCompat$QueueItem0.e());
            }
        }
        this.a.p(list0);
    }
}

