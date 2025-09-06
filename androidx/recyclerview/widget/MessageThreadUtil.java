package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class MessageThreadUtil implements ThreadUtil {
    static class MessageQueue {
        private SyncQueueItem a;
        private final Object b;

        MessageQueue() {
            this.b = new Object();
        }

        SyncQueueItem a() {
            SyncQueueItem messageThreadUtil$SyncQueueItem0;
            synchronized(this.b) {
                messageThreadUtil$SyncQueueItem0 = this.a;
                if(messageThreadUtil$SyncQueueItem0 == null) {
                    return null;
                }
                this.a = messageThreadUtil$SyncQueueItem0.a;
            }
            return messageThreadUtil$SyncQueueItem0;
        }

        void b(int v) {
            SyncQueueItem messageThreadUtil$SyncQueueItem0;
            synchronized(this.b) {
                while(true) {
                    messageThreadUtil$SyncQueueItem0 = this.a;
                    if(messageThreadUtil$SyncQueueItem0 == null || messageThreadUtil$SyncQueueItem0.b != v) {
                        break;
                    }
                    this.a = messageThreadUtil$SyncQueueItem0.a;
                    messageThreadUtil$SyncQueueItem0.d();
                }
                if(messageThreadUtil$SyncQueueItem0 != null) {
                    for(SyncQueueItem messageThreadUtil$SyncQueueItem1 = messageThreadUtil$SyncQueueItem0.a; messageThreadUtil$SyncQueueItem1 != null; messageThreadUtil$SyncQueueItem1 = messageThreadUtil$SyncQueueItem2) {
                        SyncQueueItem messageThreadUtil$SyncQueueItem2 = messageThreadUtil$SyncQueueItem1.a;
                        if(messageThreadUtil$SyncQueueItem1.b == v) {
                            messageThreadUtil$SyncQueueItem0.a = messageThreadUtil$SyncQueueItem2;
                            messageThreadUtil$SyncQueueItem1.d();
                        }
                        else {
                            messageThreadUtil$SyncQueueItem0 = messageThreadUtil$SyncQueueItem1;
                        }
                    }
                }
            }
        }

        void c(SyncQueueItem messageThreadUtil$SyncQueueItem0) {
            synchronized(this.b) {
                SyncQueueItem messageThreadUtil$SyncQueueItem1 = this.a;
                if(messageThreadUtil$SyncQueueItem1 == null) {
                    this.a = messageThreadUtil$SyncQueueItem0;
                    return;
                }
                SyncQueueItem messageThreadUtil$SyncQueueItem2;
                while((messageThreadUtil$SyncQueueItem2 = messageThreadUtil$SyncQueueItem1.a) != null) {
                    messageThreadUtil$SyncQueueItem1 = messageThreadUtil$SyncQueueItem2;
                }
                messageThreadUtil$SyncQueueItem1.a = messageThreadUtil$SyncQueueItem0;
            }
        }

        void d(SyncQueueItem messageThreadUtil$SyncQueueItem0) {
            synchronized(this.b) {
                messageThreadUtil$SyncQueueItem0.a = this.a;
                this.a = messageThreadUtil$SyncQueueItem0;
            }
        }
    }

    static class SyncQueueItem {
        SyncQueueItem a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Object h;
        private static SyncQueueItem i;
        private static final Object j;

        static {
            SyncQueueItem.j = new Object();
        }

        static SyncQueueItem a(int v, int v1, int v2) {
            return SyncQueueItem.b(v, v1, v2, 0, 0, 0, null);
        }

        static SyncQueueItem b(int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
            synchronized(SyncQueueItem.j) {
                SyncQueueItem messageThreadUtil$SyncQueueItem0 = SyncQueueItem.i;
                if(messageThreadUtil$SyncQueueItem0 == null) {
                    messageThreadUtil$SyncQueueItem0 = new SyncQueueItem();
                }
                else {
                    SyncQueueItem.i = messageThreadUtil$SyncQueueItem0.a;
                    messageThreadUtil$SyncQueueItem0.a = null;
                }
                messageThreadUtil$SyncQueueItem0.b = v;
                messageThreadUtil$SyncQueueItem0.c = v1;
                messageThreadUtil$SyncQueueItem0.d = v2;
                messageThreadUtil$SyncQueueItem0.e = v3;
                messageThreadUtil$SyncQueueItem0.f = v4;
                messageThreadUtil$SyncQueueItem0.g = v5;
                messageThreadUtil$SyncQueueItem0.h = object0;
                return messageThreadUtil$SyncQueueItem0;
            }
        }

        static SyncQueueItem c(int v, int v1, Object object0) {
            return SyncQueueItem.b(v, v1, 0, 0, 0, 0, object0);
        }

        void d() {
            this.a = null;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.b = 0;
            this.h = null;
            synchronized(SyncQueueItem.j) {
                SyncQueueItem messageThreadUtil$SyncQueueItem0 = SyncQueueItem.i;
                if(messageThreadUtil$SyncQueueItem0 != null) {
                    this.a = messageThreadUtil$SyncQueueItem0;
                }
                SyncQueueItem.i = this;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil
    public MainThreadCallback a(MainThreadCallback threadUtil$MainThreadCallback0) {
        return new MainThreadCallback() {
            final MessageQueue a;
            private final Handler b;
            private Runnable c;
            final MessageThreadUtil e;
            static final int f = 1;
            static final int g = 2;
            static final int h = 3;

            {
                MainThreadCallback threadUtil$MainThreadCallback0 = threadUtil$MainThreadCallback0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = new MessageQueue();
                this.b = new Handler(Looper.getMainLooper());
                this.c = new Runnable() {
                    final androidx.recyclerview.widget.MessageThreadUtil.1 a;

                    @Override
                    public void run() {
                        for(SyncQueueItem messageThreadUtil$SyncQueueItem0 = androidx.recyclerview.widget.MessageThreadUtil.1.this.a.a(); messageThreadUtil$SyncQueueItem0 != null; messageThreadUtil$SyncQueueItem0 = androidx.recyclerview.widget.MessageThreadUtil.1.this.a.a()) {
                            switch(messageThreadUtil$SyncQueueItem0.b) {
                                case 1: {
                                    androidx.recyclerview.widget.MessageThreadUtil.1.this.d.a(messageThreadUtil$SyncQueueItem0.c, messageThreadUtil$SyncQueueItem0.d);
                                    break;
                                }
                                case 2: {
                                    androidx.recyclerview.widget.MessageThreadUtil.1.this.d.c(messageThreadUtil$SyncQueueItem0.c, ((Tile)messageThreadUtil$SyncQueueItem0.h));
                                    break;
                                }
                                case 3: {
                                    androidx.recyclerview.widget.MessageThreadUtil.1.this.d.b(messageThreadUtil$SyncQueueItem0.c, messageThreadUtil$SyncQueueItem0.d);
                                    break;
                                }
                                default: {
                                    Log.e("ThreadUtil", "Unsupported message, what=" + messageThreadUtil$SyncQueueItem0.b);
                                }
                            }
                        }
                    }
                };
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void a(int v, int v1) {
                this.d(SyncQueueItem.a(1, v, v1));
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void b(int v, int v1) {
                this.d(SyncQueueItem.a(3, v, v1));
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
            public void c(int v, Tile tileList$Tile0) {
                this.d(SyncQueueItem.c(2, v, tileList$Tile0));
            }

            private void d(SyncQueueItem messageThreadUtil$SyncQueueItem0) {
                this.a.c(messageThreadUtil$SyncQueueItem0);
                this.b.post(this.c);
            }
        };
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil
    public BackgroundCallback b(BackgroundCallback threadUtil$BackgroundCallback0) {
        return new BackgroundCallback() {
            final MessageQueue a;
            private final Executor b;
            AtomicBoolean c;
            private Runnable d;
            final MessageThreadUtil f;
            static final int g = 1;
            static final int h = 2;
            static final int i = 3;
            static final int j = 4;

            {
                BackgroundCallback threadUtil$BackgroundCallback0 = threadUtil$BackgroundCallback0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = new MessageQueue();
                this.b = AsyncTask.THREAD_POOL_EXECUTOR;
                this.c = new AtomicBoolean(false);
                this.d = new Runnable() {
                    final androidx.recyclerview.widget.MessageThreadUtil.2 a;

                    @Override
                    public void run() {
                        SyncQueueItem messageThreadUtil$SyncQueueItem0;
                        while((messageThreadUtil$SyncQueueItem0 = androidx.recyclerview.widget.MessageThreadUtil.2.this.a.a()) != null) {
                            int v = messageThreadUtil$SyncQueueItem0.b;
                            if(v == 1) {
                                androidx.recyclerview.widget.MessageThreadUtil.2.this.a.b(1);
                                androidx.recyclerview.widget.MessageThreadUtil.2.this.e.c(messageThreadUtil$SyncQueueItem0.c);
                            }
                            else {
                                switch(v) {
                                    case 2: {
                                        androidx.recyclerview.widget.MessageThreadUtil.2.this.a.b(2);
                                        androidx.recyclerview.widget.MessageThreadUtil.2.this.a.b(3);
                                        androidx.recyclerview.widget.MessageThreadUtil.2.this.e.a(messageThreadUtil$SyncQueueItem0.c, messageThreadUtil$SyncQueueItem0.d, messageThreadUtil$SyncQueueItem0.e, messageThreadUtil$SyncQueueItem0.f, messageThreadUtil$SyncQueueItem0.g);
                                        break;
                                    }
                                    case 3: {
                                        androidx.recyclerview.widget.MessageThreadUtil.2.this.e.b(messageThreadUtil$SyncQueueItem0.c, messageThreadUtil$SyncQueueItem0.d);
                                        break;
                                    }
                                    default: {
                                        if(v == 4) {
                                            androidx.recyclerview.widget.MessageThreadUtil.2.this.e.d(((Tile)messageThreadUtil$SyncQueueItem0.h));
                                        }
                                        else {
                                            Log.e("ThreadUtil", "Unsupported message, what=" + messageThreadUtil$SyncQueueItem0.b);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        androidx.recyclerview.widget.MessageThreadUtil.2.this.c.set(false);
                    }
                };
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void a(int v, int v1, int v2, int v3, int v4) {
                this.g(SyncQueueItem.b(2, v, v1, v2, v3, v4, null));
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void b(int v, int v1) {
                this.f(SyncQueueItem.a(3, v, v1));
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void c(int v) {
                this.g(SyncQueueItem.c(1, v, null));
            }

            @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
            public void d(Tile tileList$Tile0) {
                this.f(SyncQueueItem.c(4, 0, tileList$Tile0));
            }

            private void e() {
                if(this.c.compareAndSet(false, true)) {
                    this.b.execute(this.d);
                }
            }

            private void f(SyncQueueItem messageThreadUtil$SyncQueueItem0) {
                this.a.c(messageThreadUtil$SyncQueueItem0);
                this.e();
            }

            private void g(SyncQueueItem messageThreadUtil$SyncQueueItem0) {
                this.a.d(messageThreadUtil$SyncQueueItem0);
                this.e();
            }
        };
    }
}

