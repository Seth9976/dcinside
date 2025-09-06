package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat.Builder;
import androidx.media.AudioAttributesCompat;
import androidx.media.R.id;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MediaControllerCompat {
    @RequiresApi(21)
    static class MediaControllerImplApi21 implements b {
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi210) {
                super(null);
                this.a = new WeakReference(mediaControllerCompat$MediaControllerImplApi210);
            }

            @Override  // android.os.ResultReceiver
            protected void onReceiveResult(int v, Bundle bundle0) {
                MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi210 = (MediaControllerImplApi21)this.a.get();
                if(mediaControllerCompat$MediaControllerImplApi210 != null && bundle0 != null) {
                    synchronized(mediaControllerCompat$MediaControllerImplApi210.b) {
                        android.support.v4.media.session.b b0 = android.support.v4.media.session.b.b.i1(BundleCompat.a(bundle0, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerCompat$MediaControllerImplApi210.f.h(b0);
                        VersionedParcelable versionedParcelable0 = ParcelUtils.c(bundle0, "android.support.v4.media.session.SESSION_TOKEN2");
                        mediaControllerCompat$MediaControllerImplApi210.f.i(versionedParcelable0);
                        mediaControllerCompat$MediaControllerImplApi210.p();
                    }
                }
            }
        }

        static class a extends c {
            a(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
                super(mediaControllerCompat$a0);
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void D(List list0) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void E() throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void F0(ParcelableVolumeInfo parcelableVolumeInfo0) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void K0(Bundle bundle0) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void V0(CharSequence charSequence0) throws RemoteException {
                throw new AssertionError();
            }

            @Override  // android.support.v4.media.session.MediaControllerCompat$a$c
            public void v0(MediaMetadataCompat mediaMetadataCompat0) throws RemoteException {
                throw new AssertionError();
            }
        }

        protected final MediaController a;
        final Object b;
        @GuardedBy("mLock")
        private final List c;
        private HashMap d;
        protected Bundle e;
        final Token f;

        MediaControllerImplApi21(Context context0, Token mediaSessionCompat$Token0) {
            this.b = new Object();
            this.c = new ArrayList();
            this.d = new HashMap();
            this.f = mediaSessionCompat$Token0;
            this.a = new MediaController(context0, ((MediaSession.Token)mediaSessionCompat$Token0.g()));
            if(mediaSessionCompat$Token0.e() == null) {
                this.q();
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public List Q() {
            List list0 = this.a.getQueue();
            return list0 == null ? null : QueueItem.c(list0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public final void a(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
            this.a.unregisterCallback(mediaControllerCompat$a0.a);
            synchronized(this.b) {
                if(this.f.e() == null) {
                    this.c.remove(mediaControllerCompat$a0);
                }
                else {
                    try {
                        a mediaControllerCompat$MediaControllerImplApi21$a0 = (a)this.d.remove(mediaControllerCompat$a0);
                        if(mediaControllerCompat$MediaControllerImplApi21$a0 != null) {
                            mediaControllerCompat$a0.c = null;
                            this.f.e().e0(mediaControllerCompat$MediaControllerImplApi21$a0);
                        }
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", remoteException0);
                    }
                }
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public PlaybackStateCompat b() {
            if(this.f.e() != null) {
                try {
                    return this.f.e().b();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", remoteException0);
                }
            }
            PlaybackState playbackState0 = this.a.getPlaybackState();
            return playbackState0 == null ? null : PlaybackStateCompat.a(playbackState0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void c(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
            if((this.getFlags() & 4L) == 0L) {
                throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat0);
            bundle0.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", v);
            this.d("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle0, null);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void d(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
            this.a.sendCommand(s, bundle0, resultReceiver0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public PendingIntent e() {
            return this.a.getSessionActivity();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void f(int v, int v1) {
            this.a.setVolumeTo(v, v1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean g() {
            return this.f.e() != null;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public long getFlags() {
            return this.a.getFlags();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public MediaMetadataCompat getMetadata() {
            MediaMetadata mediaMetadata0 = this.a.getMetadata();
            return mediaMetadata0 == null ? null : MediaMetadataCompat.c(mediaMetadata0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public String getPackageName() {
            return this.a.getPackageName();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public e h() {
            MediaController.PlaybackInfo mediaController$PlaybackInfo0 = this.a.getPlaybackInfo();
            return mediaController$PlaybackInfo0 == null ? null : new e(mediaController$PlaybackInfo0.getPlaybackType(), AudioAttributesCompat.f(mediaController$PlaybackInfo0.getAudioAttributes()), mediaController$PlaybackInfo0.getVolumeControl(), mediaController$PlaybackInfo0.getMaxVolume(), mediaController$PlaybackInfo0.getCurrentVolume());
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int i() {
            if(this.f.e() != null) {
                try {
                    return this.f.e().i();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", remoteException0);
                }
            }
            return -1;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public f j() {
            MediaController.TransportControls mediaController$TransportControls0 = this.a.getTransportControls();
            int v = Build.VERSION.SDK_INT;
            if(v >= 29) {
                return new j(mediaController$TransportControls0);
            }
            if(v >= 24) {
                return new i(mediaController$TransportControls0);
            }
            return v >= 23 ? new h(mediaController$TransportControls0) : new g(mediaController$TransportControls0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void k(int v, int v1) {
            this.a.adjustVolume(v, v1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean l(KeyEvent keyEvent0) {
            return this.a.dispatchMediaButtonEvent(keyEvent0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Object m() {
            return this.a;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public final void n(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0, Handler handler0) {
            this.a.registerCallback(mediaControllerCompat$a0.a, handler0);
            synchronized(this.b) {
                if(this.f.e() == null) {
                    mediaControllerCompat$a0.c = null;
                    this.c.add(mediaControllerCompat$a0);
                }
                else {
                    a mediaControllerCompat$MediaControllerImplApi21$a0 = new a(mediaControllerCompat$a0);
                    this.d.put(mediaControllerCompat$a0, mediaControllerCompat$MediaControllerImplApi21$a0);
                    mediaControllerCompat$a0.c = mediaControllerCompat$MediaControllerImplApi21$a0;
                    try {
                        this.f.e().c0(mediaControllerCompat$MediaControllerImplApi21$a0);
                        mediaControllerCompat$a0.n(13, null, null);
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", remoteException0);
                    }
                }
            }
        }

        @Nullable
        static MediaControllerCompat o(@NonNull Activity activity0) {
            MediaController mediaController0 = activity0.getMediaController();
            return mediaController0 == null ? null : new MediaControllerCompat(activity0, Token.c(mediaController0.getSessionToken()));
        }

        @GuardedBy("mLock")
        void p() {
            if(this.f.e() == null) {
                return;
            }
            for(Object object0: this.c) {
                a mediaControllerCompat$MediaControllerImplApi21$a0 = new a(((android.support.v4.media.session.MediaControllerCompat.a)object0));
                this.d.put(((android.support.v4.media.session.MediaControllerCompat.a)object0), mediaControllerCompat$MediaControllerImplApi21$a0);
                ((android.support.v4.media.session.MediaControllerCompat.a)object0).c = mediaControllerCompat$MediaControllerImplApi21$a0;
                try {
                    this.f.e().c0(mediaControllerCompat$MediaControllerImplApi21$a0);
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", remoteException0);
                    break;
                }
                ((android.support.v4.media.session.MediaControllerCompat.a)object0).n(13, null, null);
            }
            this.c.clear();
        }

        private void q() {
            this.d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean r() {
            if(this.f.e() != null) {
                try {
                    return this.f.e().r();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", remoteException0);
                }
            }
            return false;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public CharSequence s() {
            return this.a.getQueueTitle();
        }

        static void t(@NonNull Activity activity0, @Nullable MediaControllerCompat mediaControllerCompat0) {
            activity0.setMediaController((mediaControllerCompat0 == null ? null : new MediaController(activity0, ((MediaSession.Token)mediaControllerCompat0.t().g()))));
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int u() {
            if(Build.VERSION.SDK_INT < 22 && this.f.e() != null) {
                try {
                    return this.f.e().u();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in getRatingType.", remoteException0);
                }
            }
            return this.a.getRatingType();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Bundle v() {
            if(this.e != null) {
                return new Bundle(this.e);
            }
            if(this.f.e() != null) {
                try {
                    this.e = this.f.e().v();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in getSessionInfo.", remoteException0);
                    this.e = Bundle.EMPTY;
                }
            }
            Bundle bundle0 = MediaSessionCompat.G(this.e);
            this.e = bundle0;
            return bundle0 == null ? Bundle.EMPTY : new Bundle(this.e);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int w() {
            if(this.f.e() != null) {
                try {
                    return this.f.e().w();
                }
                catch(RemoteException remoteException0) {
                    Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", remoteException0);
                }
            }
            return -1;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void y(MediaDescriptionCompat mediaDescriptionCompat0) {
            if((this.getFlags() & 4L) == 0L) {
                throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat0);
            this.d("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle0, null);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void z(MediaDescriptionCompat mediaDescriptionCompat0) {
            if((this.getFlags() & 4L) == 0L) {
                throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat0);
            this.d("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle0, null);
        }
    }

    public static abstract class android.support.v4.media.session.MediaControllerCompat.a implements IBinder.DeathRecipient {
        @RequiresApi(21)
        static class android.support.v4.media.session.MediaControllerCompat.a.a extends MediaController.Callback {
            private final WeakReference a;

            android.support.v4.media.session.MediaControllerCompat.a.a(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
                this.a = new WeakReference(mediaControllerCompat$a0);
            }

            @Override  // android.media.session.MediaController$Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo mediaController$PlaybackInfo0) {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.a.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.b(new e(mediaController$PlaybackInfo0.getPlaybackType(), AudioAttributesCompat.f(mediaController$PlaybackInfo0.getAudioAttributes()), mediaController$PlaybackInfo0.getVolumeControl(), mediaController$PlaybackInfo0.getMaxVolume(), mediaController$PlaybackInfo0.getCurrentVolume()));
                }
            }

            @Override  // android.media.session.MediaController$Callback
            public void onExtrasChanged(Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
                boolean z = ((android.support.v4.media.session.MediaControllerCompat.a)this.a.get()) == null;
            }

            @Override  // android.media.session.MediaController$Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata0) {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.a.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.e(MediaMetadataCompat.c(mediaMetadata0));
                }
            }

            @Override  // android.media.session.MediaController$Callback
            public void onPlaybackStateChanged(PlaybackState playbackState0) {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.a.get();
                if(mediaControllerCompat$a0 != null && mediaControllerCompat$a0.c == null) {
                    mediaControllerCompat$a0.f(PlaybackStateCompat.a(playbackState0));
                }
            }

            @Override  // android.media.session.MediaController$Callback
            public void onQueueChanged(List list0) {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.a.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.g(QueueItem.c(list0));
                }
            }

            @Override  // android.media.session.MediaController$Callback
            public void onQueueTitleChanged(CharSequence charSequence0) {
                boolean z = ((android.support.v4.media.session.MediaControllerCompat.a)this.a.get()) == null;
            }

            @Override  // android.media.session.MediaController$Callback
            public void onSessionDestroyed() {
                boolean z = ((android.support.v4.media.session.MediaControllerCompat.a)this.a.get()) == null;
            }

            @Override  // android.media.session.MediaController$Callback
            public void onSessionEvent(String s, Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.a.get();
            }
        }

        class android.support.v4.media.session.MediaControllerCompat.a.b extends Handler {
            boolean a;
            final android.support.v4.media.session.MediaControllerCompat.a b;
            private static final int c = 1;
            private static final int d = 2;
            private static final int e = 3;
            private static final int f = 4;
            private static final int g = 5;
            private static final int h = 6;
            private static final int i = 7;
            private static final int j = 8;
            private static final int k = 9;
            private static final int l = 11;
            private static final int m = 12;
            private static final int n = 13;

            android.support.v4.media.session.MediaControllerCompat.a.b(Looper looper0) {
                super(looper0);
                this.a = false;
            }

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                if(!this.a) {
                    return;
                }
                switch(message0.what) {
                    case 1: {
                        MediaSessionCompat.b(message0.getData());
                        return;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        return;
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        MediaSessionCompat.b(((Bundle)message0.obj));
                        return;
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        return;
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                    }
                }
            }
        }

        static class c extends android.support.v4.media.session.a.b {
            private final WeakReference n;

            c(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
                this.n = new WeakReference(mediaControllerCompat$a0);
            }

            @Override  // android.support.v4.media.session.a
            public void A(int v) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(9, v, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void B(String s, Bundle bundle0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(1, s, bundle0);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void B0(int v) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(12, v, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void C() throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(13, null, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void D(List list0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(5, list0, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void E() throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(8, null, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void F0(ParcelableVolumeInfo parcelableVolumeInfo0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(4, (parcelableVolumeInfo0 == null ? null : new e(parcelableVolumeInfo0.a, parcelableVolumeInfo0.b, parcelableVolumeInfo0.c, parcelableVolumeInfo0.d, parcelableVolumeInfo0.e)), null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void K0(Bundle bundle0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(7, bundle0, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void P0(boolean z) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(11, Boolean.valueOf(z), null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void U0(boolean z) throws RemoteException {
            }

            @Override  // android.support.v4.media.session.a
            public void V0(CharSequence charSequence0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(6, charSequence0, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void h1(PlaybackStateCompat playbackStateCompat0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(2, playbackStateCompat0, null);
                }
            }

            @Override  // android.support.v4.media.session.a
            public void v0(MediaMetadataCompat mediaMetadataCompat0) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0 = (android.support.v4.media.session.MediaControllerCompat.a)this.n.get();
                if(mediaControllerCompat$a0 != null) {
                    mediaControllerCompat$a0.n(3, mediaMetadataCompat0, null);
                }
            }
        }

        final MediaController.Callback a;
        android.support.v4.media.session.MediaControllerCompat.a.b b;
        android.support.v4.media.session.a c;

        public android.support.v4.media.session.MediaControllerCompat.a() {
            this.a = new android.support.v4.media.session.MediaControllerCompat.a.a(this);
        }

        @RestrictTo({Scope.c})
        public android.support.v4.media.session.a a() {
            return this.c;
        }

        public void b(e mediaControllerCompat$e0) {
        }

        @Override  // android.os.IBinder$DeathRecipient
        public void binderDied() {
            this.n(8, null, null);
        }

        public void c(boolean z) {
        }

        public void d(Bundle bundle0) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat0) {
        }

        public void f(PlaybackStateCompat playbackStateCompat0) {
        }

        public void g(List list0) {
        }

        public void h(CharSequence charSequence0) {
        }

        public void i(int v) {
        }

        public void j() {
        }

        public void k(String s, Bundle bundle0) {
        }

        public void l() {
        }

        public void m(int v) {
        }

        void n(int v, Object object0, Bundle bundle0) {
            android.support.v4.media.session.MediaControllerCompat.a.b mediaControllerCompat$a$b0 = this.b;
            if(mediaControllerCompat$a$b0 != null) {
                Message message0 = mediaControllerCompat$a$b0.obtainMessage(v, object0);
                message0.setData(bundle0);
                message0.sendToTarget();
            }
        }

        void o(Handler handler0) {
            if(handler0 == null) {
                android.support.v4.media.session.MediaControllerCompat.a.b mediaControllerCompat$a$b0 = this.b;
                if(mediaControllerCompat$a$b0 != null) {
                    mediaControllerCompat$a$b0.a = false;
                    mediaControllerCompat$a$b0.removeCallbacksAndMessages(null);
                    this.b = null;
                }
            }
            else {
                android.support.v4.media.session.MediaControllerCompat.a.b mediaControllerCompat$a$b1 = new android.support.v4.media.session.MediaControllerCompat.a.b(this, handler0.getLooper());
                this.b = mediaControllerCompat$a$b1;
                mediaControllerCompat$a$b1.a = true;
            }
        }
    }

    interface b {
        List Q();

        void a(android.support.v4.media.session.MediaControllerCompat.a arg1);

        PlaybackStateCompat b();

        void c(MediaDescriptionCompat arg1, int arg2);

        void d(String arg1, Bundle arg2, ResultReceiver arg3);

        PendingIntent e();

        void f(int arg1, int arg2);

        boolean g();

        Bundle getExtras();

        long getFlags();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        e h();

        int i();

        f j();

        void k(int arg1, int arg2);

        boolean l(KeyEvent arg1);

        Object m();

        void n(android.support.v4.media.session.MediaControllerCompat.a arg1, Handler arg2);

        boolean r();

        CharSequence s();

        int u();

        Bundle v();

        int w();

        void y(MediaDescriptionCompat arg1);

        void z(MediaDescriptionCompat arg1);
    }

    @RequiresApi(29)
    static class android.support.v4.media.session.MediaControllerCompat.c extends MediaControllerImplApi21 {
        android.support.v4.media.session.MediaControllerCompat.c(Context context0, Token mediaSessionCompat$Token0) {
            super(context0, mediaSessionCompat$Token0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
        public Bundle v() {
            if(this.e != null) {
                return new Bundle(this.e);
            }
            Bundle bundle0 = this.a.getSessionInfo();
            this.e = bundle0;
            Bundle bundle1 = MediaSessionCompat.G(bundle0);
            this.e = bundle1;
            return bundle1 == null ? Bundle.EMPTY : new Bundle(this.e);
        }
    }

    static class d implements b {
        private android.support.v4.media.session.b a;
        private f b;
        private Bundle c;

        d(Token mediaSessionCompat$Token0) {
            this.a = android.support.v4.media.session.b.b.i1(((IBinder)mediaSessionCompat$Token0.g()));
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public List Q() {
            try {
                return this.a.Q();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getQueue.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void a(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
            if(mediaControllerCompat$a0 == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.a.e0(mediaControllerCompat$a0.c);
                this.a.asBinder().unlinkToDeath(mediaControllerCompat$a0, 0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public PlaybackStateCompat b() {
            try {
                return this.a.b();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void c(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
            try {
                if((this.a.getFlags() & 4L) == 0L) {
                    throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
                }
                this.a.u0(mediaDescriptionCompat0, v);
                return;
            }
            catch(RemoteException remoteException0) {
            }
            Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", remoteException0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void d(String s, Bundle bundle0, ResultReceiver resultReceiver0) {
            try {
                this.a.Z(s, bundle0, (resultReceiver0 == null ? null : new ResultReceiverWrapper(resultReceiver0)));
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in sendCommand.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public PendingIntent e() {
            try {
                return this.a.U();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void f(int v, int v1) {
            try {
                this.a.H0(v, v1, null);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean g() {
            return true;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Bundle getExtras() {
            try {
                return this.a.getExtras();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getExtras.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public long getFlags() {
            try {
                return this.a.getFlags();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getFlags.", remoteException0);
                return 0L;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public MediaMetadataCompat getMetadata() {
            try {
                return this.a.getMetadata();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public String getPackageName() {
            try {
                return this.a.getPackageName();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getPackageName.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public e h() {
            try {
                ParcelableVolumeInfo parcelableVolumeInfo0 = this.a.j0();
                return new e(parcelableVolumeInfo0.a, parcelableVolumeInfo0.b, parcelableVolumeInfo0.c, parcelableVolumeInfo0.d, parcelableVolumeInfo0.e);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int i() {
            try {
                return this.a.i();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", remoteException0);
                return -1;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public f j() {
            if(this.b == null) {
                this.b = new k(this.a);
            }
            return this.b;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void k(int v, int v1) {
            try {
                this.a.W0(v, v1, null);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in adjustVolume.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean l(KeyEvent keyEvent0) {
            if(keyEvent0 == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.a.s0(keyEvent0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", remoteException0);
            }
            return false;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Object m() {
            return null;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void n(android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0, Handler handler0) {
            if(mediaControllerCompat$a0 == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.a.asBinder().linkToDeath(mediaControllerCompat$a0, 0);
                this.a.c0(mediaControllerCompat$a0.c);
                mediaControllerCompat$a0.n(13, null, null);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", remoteException0);
                mediaControllerCompat$a0.n(8, null, null);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public boolean r() {
            try {
                return this.a.r();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", remoteException0);
                return false;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public CharSequence s() {
            try {
                return this.a.s();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", remoteException0);
                return null;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int u() {
            try {
                return this.a.u();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getRatingType.", remoteException0);
                return 0;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public Bundle v() {
            try {
                this.c = this.a.v();
            }
            catch(RemoteException remoteException0) {
                Log.d("MediaControllerCompat", "Dead object in getSessionInfo.", remoteException0);
            }
            Bundle bundle0 = MediaSessionCompat.G(this.c);
            this.c = bundle0;
            return bundle0 == null ? Bundle.EMPTY : new Bundle(this.c);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public int w() {
            try {
                return this.a.w();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", remoteException0);
                return -1;
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void y(MediaDescriptionCompat mediaDescriptionCompat0) {
            try {
                if((this.a.getFlags() & 4L) == 0L) {
                    throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
                }
                this.a.y(mediaDescriptionCompat0);
                return;
            }
            catch(RemoteException remoteException0) {
            }
            Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", remoteException0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$b
        public void z(MediaDescriptionCompat mediaDescriptionCompat0) {
            try {
                if((this.a.getFlags() & 4L) == 0L) {
                    throw new UnsupportedOperationException("This session doesn\'t support queue management operations");
                }
                this.a.z(mediaDescriptionCompat0);
                return;
            }
            catch(RemoteException remoteException0) {
            }
            Log.e("MediaControllerCompat", "Dead object in addQueueItem.", remoteException0);
        }
    }

    public static final class e {
        private final int a;
        private final AudioAttributesCompat b;
        private final int c;
        private final int d;
        private final int e;
        public static final int f = 1;
        public static final int g = 2;

        e(int v, int v1, int v2, int v3, int v4) {
            this(v, new Builder().d(v1).a(), v2, v3, v4);
        }

        e(int v, @NonNull AudioAttributesCompat audioAttributesCompat0, int v1, int v2, int v3) {
            this.a = v;
            this.b = audioAttributesCompat0;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }

        @NonNull
        public AudioAttributesCompat a() {
            return this.b;
        }

        @Deprecated
        public int b() {
            return this.b.D0();
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.a;
        }

        public int f() {
            return this.c;
        }
    }

    public static abstract class f {
        @Deprecated
        public static final String a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String arg1, Bundle arg2);

        public abstract void e(String arg1, Bundle arg2);

        public abstract void f(Uri arg1, Bundle arg2);

        public abstract void g();

        public abstract void h(String arg1, Bundle arg2);

        public abstract void i(String arg1, Bundle arg2);

        public abstract void j(Uri arg1, Bundle arg2);

        public abstract void k();

        public abstract void l(long arg1);

        public abstract void m(CustomAction arg1, Bundle arg2);

        public abstract void n(String arg1, Bundle arg2);

        public abstract void o(boolean arg1);

        public void p(float f) {
        }

        public abstract void q(RatingCompat arg1);

        public abstract void r(RatingCompat arg1, Bundle arg2);

        public abstract void s(int arg1);

        public abstract void t(int arg1);

        public abstract void u();

        public abstract void v();

        public abstract void w(long arg1);

        public abstract void x();
    }

    @RequiresApi(21)
    static class g extends f {
        protected final MediaController.TransportControls b;

        g(MediaController.TransportControls mediaController$TransportControls0) {
            this.b = mediaController$TransportControls0;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void a() {
            this.b.fastForward();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void b() {
            this.b.pause();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void c() {
            this.b.play();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void d(String s, Bundle bundle0) {
            this.b.playFromMediaId(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void e(String s, Bundle bundle0) {
            this.b.playFromSearch(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void f(Uri uri0, Bundle bundle0) {
            if(uri0 == null || Uri.EMPTY.equals(uri0)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri0);
            bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle0);
            this.n("android.support.v4.media.session.action.PLAY_FROM_URI", bundle1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void g() {
            this.n("android.support.v4.media.session.action.PREPARE", null);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void h(String s, Bundle bundle0) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", s);
            bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle0);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void i(String s, Bundle bundle0) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", s);
            bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle0);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void j(Uri uri0, Bundle bundle0) {
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri0);
            bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle0);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void k() {
            this.b.rewind();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void l(long v) {
            this.b.seekTo(v);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void m(CustomAction playbackStateCompat$CustomAction0, Bundle bundle0) {
            MediaControllerCompat.G(playbackStateCompat$CustomAction0.c(), bundle0);
            this.b.sendCustomAction(playbackStateCompat$CustomAction0.c(), bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void n(String s, Bundle bundle0) {
            MediaControllerCompat.G(s, bundle0);
            this.b.sendCustomAction(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void o(boolean z) {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z);
            this.n("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void p(float f) {
            if(f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
            this.n("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void q(RatingCompat ratingCompat0) {
            Rating rating0 = ratingCompat0 == null ? null : ((Rating)ratingCompat0.d());
            this.b.setRating(rating0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void r(RatingCompat ratingCompat0, Bundle bundle0) {
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ratingCompat0);
            bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle0);
            this.n("android.support.v4.media.session.action.SET_RATING", bundle1);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void s(int v) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", v);
            this.n("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void t(int v) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", v);
            this.n("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void u() {
            this.b.skipToNext();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void v() {
            this.b.skipToPrevious();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void w(long v) {
            this.b.skipToQueueItem(v);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void x() {
            this.b.stop();
        }
    }

    @RequiresApi(23)
    static class h extends g {
        h(MediaController.TransportControls mediaController$TransportControls0) {
            super(mediaController$TransportControls0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void f(Uri uri0, Bundle bundle0) {
            this.b.playFromUri(uri0, bundle0);
        }
    }

    @RequiresApi(24)
    static class i extends h {
        i(MediaController.TransportControls mediaController$TransportControls0) {
            super(mediaController$TransportControls0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void g() {
            this.b.prepare();
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void h(String s, Bundle bundle0) {
            this.b.prepareFromMediaId(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void i(String s, Bundle bundle0) {
            this.b.prepareFromSearch(s, bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void j(Uri uri0, Bundle bundle0) {
            this.b.prepareFromUri(uri0, bundle0);
        }
    }

    @RequiresApi(29)
    static class j extends i {
        j(MediaController.TransportControls mediaController$TransportControls0) {
            super(mediaController$TransportControls0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$g
        public void p(float f) {
            if(f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            this.b.setPlaybackSpeed(f);
        }
    }

    static class k extends f {
        private android.support.v4.media.session.b b;

        public k(android.support.v4.media.session.b b0) {
            this.b = b0;
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void a() {
            try {
                this.b.O0();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in fastForward.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void b() {
            try {
                this.b.pause();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in pause.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void c() {
            try {
                this.b.c();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in play.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void d(String s, Bundle bundle0) {
            try {
                this.b.W(s, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void e(String s, Bundle bundle0) {
            try {
                this.b.p0(s, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in playFromSearch.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void f(Uri uri0, Bundle bundle0) {
            try {
                this.b.r0(uri0, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in playFromUri.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void g() {
            try {
                this.b.n();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in prepare.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void h(String s, Bundle bundle0) {
            try {
                this.b.V(s, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void i(String s, Bundle bundle0) {
            try {
                this.b.J0(s, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void j(Uri uri0, Bundle bundle0) {
            try {
                this.b.T(uri0, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void k() {
            try {
                this.b.a0();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in rewind.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void l(long v) {
            try {
                this.b.P(v);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in seekTo.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void m(CustomAction playbackStateCompat$CustomAction0, Bundle bundle0) {
            this.n(playbackStateCompat$CustomAction0.c(), bundle0);
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void n(String s, Bundle bundle0) {
            MediaControllerCompat.G(s, bundle0);
            try {
                this.b.R(s, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void o(boolean z) {
            try {
                this.b.t(z);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void p(float f) {
            if(f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            try {
                this.b.p(f);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setPlaybackSpeed.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void q(RatingCompat ratingCompat0) {
            try {
                this.b.G0(ratingCompat0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setRating.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void r(RatingCompat ratingCompat0, Bundle bundle0) {
            try {
                this.b.X(ratingCompat0, bundle0);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setRating.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void s(int v) {
            try {
                this.b.q(v);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void t(int v) {
            try {
                this.b.x(v);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void u() {
            try {
                this.b.next();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in skipToNext.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void v() {
            try {
                this.b.previous();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void w(long v) {
            try {
                this.b.D0(v);
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", remoteException0);
            }
        }

        @Override  // android.support.v4.media.session.MediaControllerCompat$f
        public void x() {
            try {
                this.b.stop();
            }
            catch(RemoteException remoteException0) {
                Log.e("MediaControllerCompat", "Dead object in stop.", remoteException0);
            }
        }
    }

    private final b a;
    private final Token b;
    private final Set c;
    static final String d = "MediaControllerCompat";
    @RestrictTo({Scope.a})
    public static final String e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @RestrictTo({Scope.a})
    public static final String f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @RestrictTo({Scope.a})
    public static final String g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @RestrictTo({Scope.a})
    public static final String h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @RestrictTo({Scope.a})
    public static final String i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @RestrictTo({Scope.a})
    public static final String j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @RestrictTo({Scope.a})
    public static final String k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    public MediaControllerCompat(Context context0, @NonNull Token mediaSessionCompat$Token0) {
        if(mediaSessionCompat$Token0 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.b = mediaSessionCompat$Token0;
        if(Build.VERSION.SDK_INT >= 29) {
            this.a = new android.support.v4.media.session.MediaControllerCompat.c(context0, mediaSessionCompat$Token0);
            return;
        }
        this.a = new MediaControllerImplApi21(context0, mediaSessionCompat$Token0);
    }

    public MediaControllerCompat(Context context0, @NonNull MediaSessionCompat mediaSessionCompat0) {
        this(context0, mediaSessionCompat0.i());
    }

    public void A(MediaDescriptionCompat mediaDescriptionCompat0) {
        this.a.y(mediaDescriptionCompat0);
    }

    @Deprecated
    public void B(int v) {
        List list0 = this.m();
        if(list0 != null && v >= 0 && v < list0.size()) {
            QueueItem mediaSessionCompat$QueueItem0 = (QueueItem)list0.get(v);
            if(mediaSessionCompat$QueueItem0 != null) {
                this.A(mediaSessionCompat$QueueItem0.d());
            }
        }
    }

    public void C(@NonNull String s, @Nullable Bundle bundle0, @Nullable ResultReceiver resultReceiver0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.a.d(s, bundle0, resultReceiver0);
    }

    public static void D(@NonNull Activity activity0, MediaControllerCompat mediaControllerCompat0) {
        activity0.getWindow().getDecorView().setTag(id.media_controller_compat_view_tag, mediaControllerCompat0);
        MediaControllerImplApi21.t(activity0, mediaControllerCompat0);
    }

    public void E(int v, int v1) {
        this.a.f(v, v1);
    }

    public void F(@NonNull android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
        if(mediaControllerCompat$a0 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if(!this.c.remove(mediaControllerCompat$a0)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.a(mediaControllerCompat$a0);
        }
        finally {
            mediaControllerCompat$a0.o(null);
        }
    }

    static void G(String s, Bundle bundle0) {
        if(s == null) {
            return;
        }
        if((s.equals("android.support.v4.media.session.action.FOLLOW") || s.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle0 == null || !bundle0.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"))) {
            throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + s + ".");
        }
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat0) {
        this.a.z(mediaDescriptionCompat0);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat0, int v) {
        this.a.c(mediaDescriptionCompat0, v);
    }

    public void c(int v, int v1) {
        this.a.k(v, v1);
    }

    public boolean d(KeyEvent keyEvent0) {
        if(keyEvent0 == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.a.l(keyEvent0);
    }

    public Bundle e() {
        return this.a.getExtras();
    }

    public long f() {
        return this.a.getFlags();
    }

    public static MediaControllerCompat g(@NonNull Activity activity0) {
        Object object0 = activity0.getWindow().getDecorView().getTag(id.media_controller_compat_view_tag);
        return object0 instanceof MediaControllerCompat ? ((MediaControllerCompat)object0) : MediaControllerImplApi21.o(activity0);
    }

    public Object h() {
        return this.a.m();
    }

    public MediaMetadataCompat i() {
        return this.a.getMetadata();
    }

    public String j() {
        return this.a.getPackageName();
    }

    public e k() {
        return this.a.h();
    }

    public PlaybackStateCompat l() {
        return this.a.b();
    }

    public List m() {
        return this.a.Q();
    }

    public CharSequence n() {
        return this.a.s();
    }

    public int o() {
        return this.a.u();
    }

    public int p() {
        return this.a.i();
    }

    @Nullable
    @RestrictTo({Scope.a})
    public VersionedParcelable q() {
        return this.b.f();
    }

    public PendingIntent r() {
        return this.a.e();
    }

    @NonNull
    public Bundle s() {
        return this.a.v();
    }

    public Token t() {
        return this.b;
    }

    public int u() {
        return this.a.w();
    }

    public f v() {
        return this.a.j();
    }

    public boolean w() {
        return this.a.r();
    }

    public boolean x() {
        return this.a.g();
    }

    public void y(@NonNull android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0) {
        this.z(mediaControllerCompat$a0, null);
    }

    public void z(@NonNull android.support.v4.media.session.MediaControllerCompat.a mediaControllerCompat$a0, Handler handler0) {
        if(mediaControllerCompat$a0 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if(!this.c.add(mediaControllerCompat$a0)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if(handler0 == null) {
            handler0 = new Handler();
        }
        mediaControllerCompat$a0.o(handler0);
        this.a.n(mediaControllerCompat$a0, handler0);
    }
}

