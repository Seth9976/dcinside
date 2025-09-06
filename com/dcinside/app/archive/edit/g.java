package com.dcinside.app.archive.edit;

import android.view.View.OnClickListener;
import android.view.View;

public final class g implements View.OnClickListener {
    public final ArchiveEditActivity a;

    public g(ArchiveEditActivity archiveEditActivity0) {
        this.a = archiveEditActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArchiveEditActivity.c2(this.a, view0);
    }
}

