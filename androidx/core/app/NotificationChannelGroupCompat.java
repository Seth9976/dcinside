package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationChannelGroupCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static NotificationChannelGroup a(String s, CharSequence charSequence0) {
            return new NotificationChannelGroup(s, charSequence0);
        }

        static List b(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.getChannels();
        }

        static String c(NotificationChannel notificationChannel0) {
            return notificationChannel0.getGroup();
        }

        static String d(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.getId();
        }

        static CharSequence e(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.getName();
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static String a(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.getDescription();
        }

        static boolean b(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.isBlocked();
        }

        static void c(NotificationChannelGroup notificationChannelGroup0, String s) {
            notificationChannelGroup0.setDescription(s);
        }
    }

    public static class Builder {
        final NotificationChannelGroupCompat a;

        public Builder(String s) {
            this.a = new NotificationChannelGroupCompat(s);
        }

        public NotificationChannelGroupCompat a() {
            return this.a;
        }

        public Builder b(String s) {
            this.a.c = s;
            return this;
        }

        public Builder c(CharSequence charSequence0) {
            this.a.b = charSequence0;
            return this;
        }
    }

    final String a;
    CharSequence b;
    String c;
    private boolean d;
    private List e;

    @RequiresApi(28)
    NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup0) {
        this(notificationChannelGroup0, Collections.emptyList());
    }

    @RequiresApi(26)
    NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup0, List list0) {
        this(Api26Impl.d(notificationChannelGroup0));
        this.b = Api26Impl.e(notificationChannelGroup0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            this.c = Api28Impl.a(notificationChannelGroup0);
        }
        if(v >= 28) {
            this.d = Api28Impl.b(notificationChannelGroup0);
            this.e = this.b(Api26Impl.b(notificationChannelGroup0));
            return;
        }
        this.e = this.b(list0);
    }

    NotificationChannelGroupCompat(String s) {
        this.e = Collections.emptyList();
        this.a = (String)Preconditions.l(s);
    }

    public List a() {
        return this.e;
    }

    @RequiresApi(26)
    private List b(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            NotificationChannel notificationChannel0 = (NotificationChannel)object0;
            String s = Api26Impl.c(notificationChannel0);
            if(this.a.equals(s)) {
                list1.add(new NotificationChannelCompat(notificationChannel0));
            }
        }
        return list1;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public CharSequence e() {
        return this.b;
    }

    NotificationChannelGroup f() {
        int v = Build.VERSION.SDK_INT;
        if(v < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup0 = Api26Impl.a(this.a, this.b);
        if(v >= 28) {
            Api28Impl.c(notificationChannelGroup0, this.c);
        }
        return notificationChannelGroup0;
    }

    public boolean g() {
        return this.d;
    }

    public Builder h() {
        return new Builder(this.a).c(this.b).b(this.c);
    }
}

