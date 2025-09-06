package com.dcinside.app.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public class h {
    public static final class a implements b {
        private Activity a;
        private Fragment b;
        private int c;
        private String d;

        private a(Activity activity0) {
            this.b = null;
            this.c = 27;
            this.d = null;
            this.a = activity0;
        }

        a(Activity activity0, i i0) {
            this(activity0);
        }

        private a(Fragment fragment0) {
            this.a = null;
            this.c = 27;
            this.d = null;
            this.b = fragment0;
        }

        a(Fragment fragment0, i i0) {
            this(fragment0);
        }

        @Override  // com.dcinside.app.album.h$b
        public void a() {
            Activity activity0 = this.a;
            if(activity0 == null) {
                Fragment fragment0 = this.b;
                if(fragment0 == null) {
                    throw new RuntimeException("Activity or Fragment Null");
                }
                activity0 = fragment0.getActivity();
            }
            h.b(activity0);
            Intent intent0 = new Intent(activity0, AlbumActivity.class);
            if(this.d != null && !this.d.isEmpty()) {
                intent0.putExtra("extra_user_nickname", this.d);
            }
            Activity activity1 = this.a;
            if(activity1 != null) {
                activity1.startActivityForResult(intent0, this.c);
                return;
            }
            Fragment fragment1 = this.b;
            if(fragment1 != null) {
                fragment1.startActivityForResult(intent0, this.c);
            }
        }

        @Override  // com.dcinside.app.album.h$b
        public a b(long v) {
            if(v < 0x1400000L) {
                v = 0x1400000L;
            }
            U.a.c = v;
            return this;
        }

        @Override  // com.dcinside.app.album.h$b
        public a c(int v) {
            this.c = v;
            return this;
        }

        @Override  // com.dcinside.app.album.h$b
        public a d(String s) {
            this.d = s;
            return this;
        }

        @Override  // com.dcinside.app.album.h$b
        public a e(String s) {
            U.a.k = s;
            return this;
        }

        @Override  // com.dcinside.app.album.h$b
        public a f(int v) {
            if(v <= 0) {
                v = 1;
            }
            U.a.b = v;
            return this;
        }
    }

    interface b {
        void a();

        a b(long arg1);

        a c(int arg1);

        a d(String arg1);

        a e(String arg1);

        a f(int arg1);
    }

    // 去混淆评级： 低(20)
    private static void b(Context context0) {
        U.a.k = "선택된 이미지가 없습니다.";
    }

    public static a c(Activity activity0) {
        return new a(activity0, null);
    }

    public static a d(Fragment fragment0) {
        return new a(fragment0, null);
    }
}

