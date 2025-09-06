package androidx.media.app;

import android.annotation.SuppressLint;
import android.app.Notification.Builder;
import android.app.Notification.DecoratedMediaCustomViewStyle;
import android.app.Notification.MediaStyle;
import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession.Token;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationCompat.Style;
import androidx.media.R.color;
import androidx.media.R.id;
import androidx.media.R.integer;
import androidx.media.R.layout;

public class NotificationCompat {
    @RequiresApi(15)
    static class Api15Impl {
        @DoNotInline
        static void a(RemoteViews remoteViews0, int v, CharSequence charSequence0) {
            remoteViews0.setContentDescription(v, charSequence0);
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        @DoNotInline
        static Notification.MediaStyle b(Notification.MediaStyle notification$MediaStyle0, int[] arr_v, Token mediaSessionCompat$Token0) {
            if(arr_v != null) {
                Api21Impl.e(notification$MediaStyle0, arr_v);
            }
            if(mediaSessionCompat$Token0 != null) {
                Api21Impl.c(notification$MediaStyle0, ((MediaSession.Token)mediaSessionCompat$Token0.g()));
            }
            return notification$MediaStyle0;
        }

        @DoNotInline
        static void c(Notification.MediaStyle notification$MediaStyle0, MediaSession.Token mediaSession$Token0) {
            notification$MediaStyle0.setMediaSession(mediaSession$Token0);
        }

        @DoNotInline
        static void d(Notification.Builder notification$Builder0, Notification.MediaStyle notification$MediaStyle0) {
            notification$Builder0.setStyle(notification$MediaStyle0);
        }

        @DoNotInline
        static void e(Notification.MediaStyle notification$MediaStyle0, int[] arr_v) {
            notification$MediaStyle0.setShowActionsInCompactView(arr_v);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static Notification.MediaStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        @SuppressLint({"MissingPermission"})
        @DoNotInline
        static Notification.MediaStyle a(Notification.MediaStyle notification$MediaStyle0, @NonNull CharSequence charSequence0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0, Boolean boolean0) {
            if(boolean0.booleanValue()) {
                notification$MediaStyle0.setRemotePlaybackInfo(charSequence0, v, pendingIntent0);
            }
            return notification$MediaStyle0;
        }
    }

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override  // androidx.media.app.NotificationCompat$MediaStyle
        int D(int v) {
            return v > 3 ? layout.notification_template_big_media_custom : layout.notification_template_big_media_narrow_custom;
        }

        @Override  // androidx.media.app.NotificationCompat$MediaStyle
        int E() {
            return this.a.s() == null ? super.E() : layout.notification_template_media_custom;
        }

        private void L(RemoteViews remoteViews0) {
            int v = this.a.r() == 0 ? this.a.a.getResources().getColor(color.notification_material_background_media_default_color) : this.a.r();
            remoteViews0.setInt(id.status_bar_latest_event_content, "setBackgroundColor", v);
        }

        @Override  // androidx.media.app.NotificationCompat$MediaStyle
        @RestrictTo({Scope.a})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 34) {
                Api21Impl.d(notificationBuilderWithBuilderAccessor0.a(), Api21Impl.b(Api34Impl.a(Api24Impl.a(), this.i, this.j, this.k, Boolean.valueOf(this.l)), this.e, this.f));
                return;
            }
            if(v >= 24) {
                Api21Impl.d(notificationBuilderWithBuilderAccessor0.a(), Api21Impl.b(Api24Impl.a(), this.e, this.f));
                return;
            }
            super.b(notificationBuilderWithBuilderAccessor0);
        }

        @Override  // androidx.media.app.NotificationCompat$MediaStyle
        @RestrictTo({Scope.a})
        public RemoteViews v(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews0 = this.a.p() == null ? this.a.s() : this.a.p();
            if(remoteViews0 == null) {
                return null;
            }
            RemoteViews remoteViews1 = this.A();
            this.e(remoteViews1, remoteViews0);
            this.L(remoteViews1);
            return remoteViews1;
        }

        @Override  // androidx.media.app.NotificationCompat$MediaStyle
        @RestrictTo({Scope.a})
        public RemoteViews w(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = this.a.s() != null;
            if(!z && this.a.p() == null) {
                return null;
            }
            RemoteViews remoteViews0 = this.B();
            if(z) {
                this.e(remoteViews0, this.a.s());
            }
            this.L(remoteViews0);
            return remoteViews0;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.a})
        public RemoteViews x(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews0 = this.a.w() == null ? this.a.s() : this.a.w();
            if(remoteViews0 == null) {
                return null;
            }
            RemoteViews remoteViews1 = this.A();
            this.e(remoteViews1, remoteViews0);
            this.L(remoteViews1);
            return remoteViews1;
        }
    }

    public static class MediaStyle extends Style {
        int[] e;
        Token f;
        boolean g;
        PendingIntent h;
        CharSequence i;
        int j;
        PendingIntent k;
        boolean l;
        private static final int m = 3;
        private static final int n = 5;

        public MediaStyle() {
            this.e = null;
            this.l = false;
        }

        public MediaStyle(Builder notificationCompat$Builder0) {
            this.e = null;
            this.l = false;
            this.z(notificationCompat$Builder0);
        }

        RemoteViews A() {
            int v = Math.min(this.a.b.size(), 5);
            RemoteViews remoteViews0 = this.c(false, this.D(v), false);
            remoteViews0.removeAllViews(id.media_actions);
            if(v > 0) {
                for(int v1 = 0; v1 < v; ++v1) {
                    RemoteViews remoteViews1 = this.C(((Action)this.a.b.get(v1)));
                    remoteViews0.addView(id.media_actions, remoteViews1);
                }
            }
            if(this.g) {
                remoteViews0.setViewVisibility(id.cancel_action, 0);
                int v2 = this.a.a.getResources().getInteger(integer.cancel_button_image_alpha);
                remoteViews0.setInt(id.cancel_action, "setAlpha", v2);
                remoteViews0.setOnClickPendingIntent(id.cancel_action, this.h);
                return remoteViews0;
            }
            remoteViews0.setViewVisibility(id.cancel_action, 8);
            return remoteViews0;
        }

        RemoteViews B() {
            RemoteViews remoteViews0 = this.c(false, this.E(), true);
            int v = this.a.b.size();
            int v1 = this.e == null ? 0 : Math.min(this.e.length, 3);
            remoteViews0.removeAllViews(id.media_actions);
            if(v1 > 0) {
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(v2 >= v) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", v2, ((int)(v - 1))));
                    }
                    RemoteViews remoteViews1 = this.C(((Action)this.a.b.get(this.e[v2])));
                    remoteViews0.addView(id.media_actions, remoteViews1);
                }
            }
            if(this.g) {
                remoteViews0.setViewVisibility(id.end_padder, 8);
                remoteViews0.setViewVisibility(id.cancel_action, 0);
                remoteViews0.setOnClickPendingIntent(id.cancel_action, this.h);
                int v3 = this.a.a.getResources().getInteger(integer.cancel_button_image_alpha);
                remoteViews0.setInt(id.cancel_action, "setAlpha", v3);
                return remoteViews0;
            }
            remoteViews0.setViewVisibility(id.end_padder, 0);
            remoteViews0.setViewVisibility(id.cancel_action, 8);
            return remoteViews0;
        }

        private RemoteViews C(Action notificationCompat$Action0) {
            RemoteViews remoteViews0 = new RemoteViews("com.dcinside.app.android", layout.notification_media_action);
            remoteViews0.setImageViewResource(id.action0, notificationCompat$Action0.e());
            if(notificationCompat$Action0.a() != null) {
                remoteViews0.setOnClickPendingIntent(0x7F0B0046, notificationCompat$Action0.a());  // id:action0
            }
            Api15Impl.a(remoteViews0, 0x7F0B0046, notificationCompat$Action0.j());  // id:action0
            return remoteViews0;
        }

        int D(int v) {
            return v > 3 ? layout.notification_template_big_media : layout.notification_template_big_media_narrow;
        }

        int E() {
            return layout.notification_template_media;
        }

        public static Token F(Notification notification0) {
            Bundle bundle0 = androidx.core.app.NotificationCompat.n(notification0);
            if(bundle0 != null) {
                Parcelable parcelable0 = bundle0.getParcelable("android.mediaSession");
                return parcelable0 == null ? null : Token.c(parcelable0);
            }
            return null;
        }

        public MediaStyle G(PendingIntent pendingIntent0) {
            this.h = pendingIntent0;
            return this;
        }

        public MediaStyle H(Token mediaSessionCompat$Token0) {
            this.f = mediaSessionCompat$Token0;
            return this;
        }

        @NonNull
        @RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
        public MediaStyle I(@NonNull CharSequence charSequence0, @DrawableRes int v, @Nullable PendingIntent pendingIntent0) {
            this.i = charSequence0;
            this.j = v;
            this.k = pendingIntent0;
            this.l = true;
            return this;
        }

        public MediaStyle J(int[] arr_v) {
            this.e = arr_v;
            return this;
        }

        public MediaStyle K(boolean z) [...] // Inlined contents

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.a})
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            if(Build.VERSION.SDK_INT >= 34) {
                Api21Impl.d(notificationBuilderWithBuilderAccessor0.a(), Api21Impl.b(Api34Impl.a(Api21Impl.a(), this.i, this.j, this.k, Boolean.valueOf(this.l)), this.e, this.f));
                return;
            }
            Api21Impl.d(notificationBuilderWithBuilderAccessor0.a(), Api21Impl.b(Api21Impl.a(), this.e, this.f));
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.a})
        public RemoteViews v(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.a})
        public RemoteViews w(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }
    }

}

