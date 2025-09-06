package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import jeb.synthetic.FIN;

public final class LocalBroadcastManager {
    static final class BroadcastRecord {
        final Intent a;
        final ArrayList b;

        BroadcastRecord(Intent intent0, ArrayList arrayList0) {
            this.a = intent0;
            this.b = arrayList0;
        }
    }

    static final class ReceiverRecord {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        ReceiverRecord(IntentFilter intentFilter0, BroadcastReceiver broadcastReceiver0) {
            this.a = intentFilter0;
            this.b = broadcastReceiver0;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(0x80);
            stringBuilder0.append("Receiver{");
            stringBuilder0.append(this.b);
            stringBuilder0.append(" filter=");
            stringBuilder0.append(this.a);
            if(this.d) {
                stringBuilder0.append(" DEAD");
            }
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
    }

    private final Context a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;
    private final Handler e;
    private static final String f = "LocalBroadcastManager";
    private static final boolean g = false;
    static final int h = 1;
    private static final Object i;
    private static LocalBroadcastManager j;

    static {
        LocalBroadcastManager.i = new Object();
    }

    private LocalBroadcastManager(Context context0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.a = context0;
        this.e = new Handler(context0.getMainLooper()) {
            final LocalBroadcastManager a;

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                if(message0.what != 1) {
                    super.handleMessage(message0);
                    return;
                }
                LocalBroadcastManager.this.a();
            }
        };
    }

    void a() {
        int v;
        HashMap hashMap0;
        while(true) {
            hashMap0 = this.b;
            __monitor_enter(hashMap0);
            v = FIN.finallyOpen$NT();
            int v1 = this.d.size();
            if(v1 <= 0) {
                break;
            }
            BroadcastRecord[] arr_localBroadcastManager$BroadcastRecord = new BroadcastRecord[v1];
            this.d.toArray(arr_localBroadcastManager$BroadcastRecord);
            this.d.clear();
            FIN.finallyExec$NT(v);
            for(int v2 = 0; v2 < v1; ++v2) {
                BroadcastRecord localBroadcastManager$BroadcastRecord0 = arr_localBroadcastManager$BroadcastRecord[v2];
                int v3 = localBroadcastManager$BroadcastRecord0.b.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    ReceiverRecord localBroadcastManager$ReceiverRecord0 = (ReceiverRecord)localBroadcastManager$BroadcastRecord0.b.get(v4);
                    if(!localBroadcastManager$ReceiverRecord0.d) {
                        localBroadcastManager$ReceiverRecord0.b.onReceive(this.a, localBroadcastManager$BroadcastRecord0.a);
                    }
                }
            }
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(hashMap0);
        FIN.finallyCodeEnd$NT(v);
    }

    @NonNull
    public static LocalBroadcastManager b(@NonNull Context context0) {
        synchronized(LocalBroadcastManager.i) {
            if(LocalBroadcastManager.j == null) {
                LocalBroadcastManager.j = new LocalBroadcastManager(context0.getApplicationContext());
            }
            return LocalBroadcastManager.j;
        }
    }

    public void c(@NonNull BroadcastReceiver broadcastReceiver0, @NonNull IntentFilter intentFilter0) {
        synchronized(this.b) {
            ReceiverRecord localBroadcastManager$ReceiverRecord0 = new ReceiverRecord(intentFilter0, broadcastReceiver0);
            ArrayList arrayList0 = (ArrayList)this.b.get(broadcastReceiver0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList(1);
                this.b.put(broadcastReceiver0, arrayList0);
            }
            arrayList0.add(localBroadcastManager$ReceiverRecord0);
            for(int v1 = 0; v1 < intentFilter0.countActions(); ++v1) {
                String s = intentFilter0.getAction(v1);
                ArrayList arrayList1 = (ArrayList)this.c.get(s);
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList(1);
                    this.c.put(s, arrayList1);
                }
                arrayList1.add(localBroadcastManager$ReceiverRecord0);
            }
        }
    }

    public boolean d(@NonNull Intent intent0) {
        String s4;
        ArrayList arrayList3;
        ArrayList arrayList2;
        int v2;
        synchronized(this.b) {
            String s = intent0.getAction();
            String s1 = intent0.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri uri0 = intent0.getData();
            String s2 = intent0.getScheme();
            Set set0 = intent0.getCategories();
            boolean z = (intent0.getFlags() & 8) != 0;
            if(z) {
                Log.v("LocalBroadcastManager", "Resolving type " + s1 + " scheme " + s2 + " of intent " + intent0);
            }
            String s3 = intent0.getAction();
            ArrayList arrayList0 = (ArrayList)this.c.get(s3);
            if(arrayList0 != null) {
                if(z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList0);
                }
                ArrayList arrayList1 = null;
                int v1 = 0;
                while(v1 < arrayList0.size()) {
                    ReceiverRecord localBroadcastManager$ReceiverRecord0 = (ReceiverRecord)arrayList0.get(v1);
                    if(z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + localBroadcastManager$ReceiverRecord0.a);
                    }
                    if(localBroadcastManager$ReceiverRecord0.c) {
                        if(z) {
                            Log.v("LocalBroadcastManager", "  Filter\'s target already added");
                        }
                        v2 = v1;
                        arrayList2 = arrayList0;
                        arrayList3 = arrayList1;
                    }
                    else {
                        v2 = v1;
                        arrayList3 = arrayList1;
                        arrayList2 = arrayList0;
                        int v3 = localBroadcastManager$ReceiverRecord0.a.match(s, s1, s2, uri0, set0, "LocalBroadcastManager");
                        if(v3 >= 0) {
                            if(z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(v3));
                            }
                            arrayList1 = arrayList3 == null ? new ArrayList() : arrayList3;
                            arrayList1.add(localBroadcastManager$ReceiverRecord0);
                            localBroadcastManager$ReceiverRecord0.c = true;
                            goto label_53;
                        }
                        else if(z) {
                            switch(v3) {
                                case -4: {
                                    s4 = "category";
                                    break;
                                }
                                case -3: {
                                    s4 = "action";
                                    break;
                                }
                                case -2: {
                                    s4 = "data";
                                    break;
                                }
                                case -1: {
                                    s4 = "type";
                                    break;
                                }
                                default: {
                                    s4 = "unknown reason";
                                }
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + s4);
                        }
                    }
                    arrayList1 = arrayList3;
                label_53:
                    v1 = v2 + 1;
                    arrayList0 = arrayList2;
                }
                if(arrayList1 != null) {
                    for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
                        ((ReceiverRecord)arrayList1.get(v4)).c = false;
                    }
                    BroadcastRecord localBroadcastManager$BroadcastRecord0 = new BroadcastRecord(intent0, arrayList1);
                    this.d.add(localBroadcastManager$BroadcastRecord0);
                    if(!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(@NonNull Intent intent0) {
        if(this.d(intent0)) {
            this.a();
        }
    }

    public void f(@NonNull BroadcastReceiver broadcastReceiver0) {
        synchronized(this.b) {
            ArrayList arrayList0 = (ArrayList)this.b.remove(broadcastReceiver0);
            if(arrayList0 == null) {
                return;
            }
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                ReceiverRecord localBroadcastManager$ReceiverRecord0 = (ReceiverRecord)arrayList0.get(v1);
                localBroadcastManager$ReceiverRecord0.d = true;
                for(int v2 = 0; v2 < localBroadcastManager$ReceiverRecord0.a.countActions(); ++v2) {
                    String s = localBroadcastManager$ReceiverRecord0.a.getAction(v2);
                    ArrayList arrayList1 = (ArrayList)this.c.get(s);
                    if(arrayList1 != null) {
                        for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                            ReceiverRecord localBroadcastManager$ReceiverRecord1 = (ReceiverRecord)arrayList1.get(v3);
                            if(localBroadcastManager$ReceiverRecord1.b == broadcastReceiver0) {
                                localBroadcastManager$ReceiverRecord1.d = true;
                                arrayList1.remove(v3);
                            }
                        }
                        if(arrayList1.size() <= 0) {
                            this.c.remove(s);
                        }
                    }
                }
            }
        }
    }
}

