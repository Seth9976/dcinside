package kr.bhbfhfb.designcompat;

import com.google.android.material.appbar.AppBarLayout.f;
import com.google.android.material.appbar.AppBarLayout;

public class b {
    static final class a implements f {
        private int a;

        private a() {
        }

        a(c c0) {
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$f
        public void a(AppBarLayout appBarLayout0, int v) {
            this.a = v;
        }
    }

    public static int a(AppBarLayout appBarLayout0) {
        a b$a0 = (a)appBarLayout0.getTag(0x7F0B03C7);  // id:design_compat__offset_listener
        if(b$a0 == null) {
            b$a0 = new a(null);
            appBarLayout0.e(b$a0);
            appBarLayout0.setTag(0x7F0B03C7, b$a0);  // id:design_compat__offset_listener
        }
        return b$a0.a;
    }
}

