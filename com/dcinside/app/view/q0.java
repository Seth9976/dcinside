package com.dcinside.app.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.archive.folder.ArchiveFolderActivity;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import io.realm.F0;

@SuppressLint({"ViewConstructor"})
public class q0 extends LinearLayout {
    private TextView a;
    private TextView b;
    private int c;
    private long d;

    public q0(Context context0, int v) {
        super(context0);
        View.inflate(context0, 0x7F0E0261, this);  // layout:view_remove_folder
        this.a = (TextView)this.findViewById(0x7F0B0899);  // id:moved_folder_title
        TextView textView0 = (TextView)this.findViewById(0x7F0B0898);  // id:moved_folder_name
        this.b = textView0;
        textView0.setOnClickListener((View view0) -> this.b());
        this.c = v;
        vk.h(0x7F04032A, new View[]{this.b});  // attr:icTintNormal
    }

    private void b() {
        ArchiveFolderActivity.Z1(((AppCompatActivity)this.getContext()), "folderSelect", this.c);
    }

    // 检测为 Lambda 实现
    private void c(View view0) [...]

    public long getFolderKey() {
        return this.d;
    }

    public void setFolderKey(long v) {
        this.d = v;
        F0 f00 = F0.g4();
        c c0 = d.U5(f00, v);
        String s = c0 == null ? null : c0.R5();
        f00.close();
        this.b.setText(s);
    }

    public void setTitle(String s) {
        String s1 = this.getContext().getString(0x7F15036F, new Object[]{s});  // string:format_remove_text "<font color=#68B2FF>%s</font> 폴더를 삭제하시겠습니까?<br/>해당 폴더에 
                                                                               // 보관한 글을 이동할 폴더를 선택하세요.<br/>\'선택 안 함\' 시 보관한 글은 삭제됩니다."
        this.a.setText(Dl.c(s1));
    }
}

