package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({Scope.b})
public class CommandHandler implements ExecutionListener {
    private final Context a;
    private final Map b;
    private final Object c;
    private final Clock d;
    private final StartStopTokens e;
    private static final String f = null;
    static final String g = "ACTION_SCHEDULE_WORK";
    static final String h = "ACTION_DELAY_MET";
    static final String i = "ACTION_STOP_WORK";
    static final String j = "ACTION_CONSTRAINTS_CHANGED";
    static final String k = "ACTION_RESCHEDULE";
    static final String l = "ACTION_EXECUTION_COMPLETED";
    private static final String m = "KEY_WORKSPEC_ID";
    private static final String n = "KEY_WORKSPEC_GENERATION";
    private static final String o = "KEY_NEEDS_RESCHEDULE";
    static final long p = 600000L;

    static {
        CommandHandler.f = "WM-CommandHandler";
    }

    CommandHandler(@NonNull Context context0, Clock clock0, @NonNull StartStopTokens startStopTokens0) {
        this.a = context0;
        this.d = clock0;
        this.e = startStopTokens0;
        this.b = new HashMap();
        this.c = new Object();
    }

    static Intent a(@NonNull Context context0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent0;
    }

    static Intent b(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_DELAY_MET");
        return CommandHandler.s(intent0, workGenerationalId0);
    }

    static Intent c(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_EXECUTION_COMPLETED");
        intent0.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return CommandHandler.s(intent0, workGenerationalId0);
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void d(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        synchronized(this.c) {
            DelayMetCommandHandler delayMetCommandHandler0 = (DelayMetCommandHandler)this.b.remove(workGenerationalId0);
            this.e.c(workGenerationalId0);
            if(delayMetCommandHandler0 != null) {
                delayMetCommandHandler0.g(z);
            }
        }
    }

    static Intent e(@NonNull Context context0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_RESCHEDULE");
        return intent0;
    }

    static Intent f(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_SCHEDULE_WORK");
        return CommandHandler.s(intent0, workGenerationalId0);
    }

    static Intent g(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_STOP_WORK");
        return CommandHandler.s(intent0, workGenerationalId0);
    }

    static Intent h(@NonNull Context context0, @NonNull String s) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_STOP_WORK");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    private void i(@NonNull Intent intent0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        Logger.e().a("WM-CommandHandler", "Handling constraints changed " + intent0);
        new ConstraintsCommandHandler(this.a, this.d, v, systemAlarmDispatcher0).a();
    }

    private void j(@NonNull Intent intent0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        synchronized(this.c) {
            WorkGenerationalId workGenerationalId0 = CommandHandler.r(intent0);
            Logger.e().a("WM-CommandHandler", "Handing delay met for " + workGenerationalId0);
            if(this.b.containsKey(workGenerationalId0)) {
                Logger.e().a("WM-CommandHandler", "WorkSpec " + workGenerationalId0 + " is is already being handled for ACTION_DELAY_MET");
            }
            else {
                StartStopToken startStopToken0 = this.e.e(workGenerationalId0);
                DelayMetCommandHandler delayMetCommandHandler0 = new DelayMetCommandHandler(this.a, v, systemAlarmDispatcher0, startStopToken0);
                this.b.put(workGenerationalId0, delayMetCommandHandler0);
                delayMetCommandHandler0.f();
            }
        }
    }

    private void k(@NonNull Intent intent0, int v) {
        WorkGenerationalId workGenerationalId0 = CommandHandler.r(intent0);
        boolean z = intent0.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        Logger.e().a("WM-CommandHandler", "Handling onExecutionCompleted " + intent0 + ", " + v);
        this.d(workGenerationalId0, z);
    }

    private void l(@NonNull Intent intent0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        Logger.e().a("WM-CommandHandler", "Handling reschedule " + intent0 + ", " + v);
        systemAlarmDispatcher0.g().a0();
    }

    private void m(@NonNull Intent intent0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        WorkGenerationalId workGenerationalId0 = CommandHandler.r(intent0);
        Logger.e().a("WM-CommandHandler", "Handling schedule work for " + workGenerationalId0);
        WorkDatabase workDatabase0 = systemAlarmDispatcher0.g().U();
        workDatabase0.e();
        try {
            WorkSpec workSpec0 = workDatabase0.Z().G(workGenerationalId0.f());
            if(workSpec0 == null) {
                Logger.e().l("WM-CommandHandler", "Skipping scheduling " + workGenerationalId0 + " because it\'s no longer in the DB");
                return;
            }
            long v2 = workSpec0.c();
            if(workSpec0.J()) {
                Logger.e().a("WM-CommandHandler", "Opportunistically setting an alarm for " + workGenerationalId0 + "at " + v2);
                Alarms.c(this.a, workDatabase0, workGenerationalId0, v2);
                Intent intent1 = CommandHandler.a(this.a);
                systemAlarmDispatcher0.f().c().execute(new AddRunnable(systemAlarmDispatcher0, intent1, v));
            }
            else {
                Logger.e().a("WM-CommandHandler", "Setting up Alarms for " + workGenerationalId0 + "at " + v2);
                Alarms.c(this.a, workDatabase0, workGenerationalId0, v2);
            }
            workDatabase0.Q();
        }
        finally {
            workDatabase0.k();
        }
    }

    private void n(@NonNull Intent intent0, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        List list0;
        Bundle bundle0 = intent0.getExtras();
        String s = bundle0.getString("KEY_WORKSPEC_ID");
        if(bundle0.containsKey("KEY_WORKSPEC_GENERATION")) {
            int v = bundle0.getInt("KEY_WORKSPEC_GENERATION");
            list0 = new ArrayList(1);
            WorkGenerationalId workGenerationalId0 = new WorkGenerationalId(s, v);
            StartStopToken startStopToken0 = this.e.c(workGenerationalId0);
            if(startStopToken0 != null) {
                list0.add(startStopToken0);
            }
        }
        else {
            list0 = this.e.remove(s);
        }
        for(Object object0: list0) {
            Logger.e().a("WM-CommandHandler", "Handing stopWork work for " + s);
            systemAlarmDispatcher0.i().e(((StartStopToken)object0));
            Alarms.a(this.a, systemAlarmDispatcher0.g().U(), ((StartStopToken)object0).a());
            systemAlarmDispatcher0.d(((StartStopToken)object0).a(), false);
        }
    }

    private static boolean o(@Nullable Bundle bundle0, @NonNull String[] arr_s) {
        if(bundle0 != null && !bundle0.isEmpty()) {
            for(int v = 0; v < arr_s.length; ++v) {
                if(bundle0.get(arr_s[v]) == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean p() {
        synchronized(this.c) {
        }
        return !this.b.isEmpty();
    }

    @WorkerThread
    void q(@NonNull Intent intent0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
        String s = intent0.getAction();
        if("ACTION_CONSTRAINTS_CHANGED".equals(s)) {
            this.i(intent0, v, systemAlarmDispatcher0);
            return;
        }
        if("ACTION_RESCHEDULE".equals(s)) {
            this.l(intent0, v, systemAlarmDispatcher0);
            return;
        }
        if(!CommandHandler.o(intent0.getExtras(), new String[]{"KEY_WORKSPEC_ID"})) {
            Logger.e().c("WM-CommandHandler", "Invalid request for " + s + " , requires " + "KEY_WORKSPEC_ID" + " .");
            return;
        }
        if("ACTION_SCHEDULE_WORK".equals(s)) {
            this.m(intent0, v, systemAlarmDispatcher0);
            return;
        }
        if("ACTION_DELAY_MET".equals(s)) {
            this.j(intent0, v, systemAlarmDispatcher0);
            return;
        }
        if("ACTION_STOP_WORK".equals(s)) {
            this.n(intent0, systemAlarmDispatcher0);
            return;
        }
        if("ACTION_EXECUTION_COMPLETED".equals(s)) {
            this.k(intent0, v);
            return;
        }
        Logger.e().l("WM-CommandHandler", "Ignoring intent " + intent0);
    }

    static WorkGenerationalId r(@NonNull Intent intent0) {
        return new WorkGenerationalId(intent0.getStringExtra("KEY_WORKSPEC_ID"), intent0.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent s(@NonNull Intent intent0, @NonNull WorkGenerationalId workGenerationalId0) {
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.f());
        intent0.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId0.e());
        return intent0;
    }
}

