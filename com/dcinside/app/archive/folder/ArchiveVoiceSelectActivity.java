package com.dcinside.app.archive.folder;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.dcinside.app.archive.page.k;
import com.dcinside.app.base.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kr.bhbfhfb.designcompat.a;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveVoiceSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveVoiceSelectActivity.kt\ncom/dcinside/app/archive/folder/ArchiveVoiceSelectActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class ArchiveVoiceSelectActivity extends g {
    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0021);  // layout:activity_archive_voice_select
        this.S0(((Toolbar)this.findViewById(0x7F0B0152)));  // id:archive_voice_select_toolbar
        a.d(this);
        k k0 = new k();
        Bundle bundle1 = new Bundle();
        bundle1.putBoolean("pick_mode", true);
        k0.setArguments(bundle1);
        this.getSupportFragmentManager().u().D(0x7F0B0151, k0, "com.dcinside.app.archive.page.k").q();  // id:archive_voice_select_container
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

