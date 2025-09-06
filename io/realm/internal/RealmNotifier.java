package io.realm.internal;

import io.realm.P0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import o3.h;

@Keep
public abstract class RealmNotifier implements Closeable {
    class a implements io.realm.internal.n.a {
        final RealmNotifier a;

        @Override  // io.realm.internal.n$a
        public void a(b n$b0, Object object0) {
            this.b(((io.realm.internal.RealmNotifier.b)n$b0), object0);
        }

        public void b(io.realm.internal.RealmNotifier.b realmNotifier$b0, Object object0) {
            if(RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                realmNotifier$b0.b(object0);
            }
        }
    }

    static class io.realm.internal.RealmNotifier.b extends b {
        io.realm.internal.RealmNotifier.b(Object object0, P0 p00) {
            super(object0, p00);
        }

        private void b(Object object0) {
            if(object0 != null) {
                ((P0)this.b).M(object0);
            }
        }
    }

    private List finishedSendingNotificationsCallbacks;
    private final io.realm.internal.n.a onChangeCallBack;
    private n realmObserverPairs;
    private OsSharedRealm sharedRealm;
    private List startSendingNotificationsCallbacks;
    private List transactionCallbacks;

    protected RealmNotifier(@h OsSharedRealm osSharedRealm0) {
        this.realmObserverPairs = new n();
        this.onChangeCallBack = new a(this);
        this.transactionCallbacks = new ArrayList();
        this.startSendingNotificationsCallbacks = new ArrayList();
        this.finishedSendingNotificationsCallbacks = new ArrayList();
        this.sharedRealm = osSharedRealm0;
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable0) {
        this.startSendingNotificationsCallbacks.add(runnable0);
    }

    public void addChangeListener(Object object0, P0 p00) {
        io.realm.internal.RealmNotifier.b realmNotifier$b0 = new io.realm.internal.RealmNotifier.b(object0, p00);
        this.realmObserverPairs.a(realmNotifier$b0);
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable0) {
        this.finishedSendingNotificationsCallbacks.add(runnable0);
    }

    public void addTransactionCallback(Runnable runnable0) {
        this.transactionCallbacks.add(runnable0);
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override
    public void close() {
        this.removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if(!this.transactionCallbacks.isEmpty()) {
            List list0 = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            for(Object object0: list0) {
                ((Runnable)object0).run();
            }
        }
    }

    void didSendNotifications() {
        for(int v = 0; v < this.startSendingNotificationsCallbacks.size(); ++v) {
            ((Runnable)this.finishedSendingNotificationsCallbacks.get(v)).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable arg1);

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public void removeChangeListener(Object object0, P0 p00) {
        this.realmObserverPairs.e(object0, p00);
    }

    public void removeChangeListeners(Object object0) {
        this.realmObserverPairs.f(object0);
    }

    void willSendNotifications() {
        for(int v = 0; v < this.startSendingNotificationsCallbacks.size(); ++v) {
            ((Runnable)this.startSendingNotificationsCallbacks.get(v)).run();
        }
    }
}

