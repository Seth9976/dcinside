package com.dcinside.app.memo;

import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.d.b;

public final class o implements b {
    public final UserMemoActivity a;

    public o(UserMemoActivity userMemoActivity0) {
        this.a = userMemoActivity0;
    }

    @Override  // com.google.android.material.tabs.d$b
    public final void a(i tabLayout$i0, int v) {
        UserMemoActivity.M1(this.a, tabLayout$i0, v);
    }
}

