package com.dcinside.app.archive.edit;

import android.view.View.OnClickListener;
import android.view.View;

public final class i implements View.OnClickListener {
    public final ArchiveEditActivity a;

    public i(ArchiveEditActivity archiveEditActivity0) {
        this.a = archiveEditActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArchiveEditActivity.e2(this.a, view0);
    }
}

