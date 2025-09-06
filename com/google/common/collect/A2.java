package com.google.common.collect;

import J1.c;
import J1.d;
import O1.a;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@c
@d
@C1
public abstract class a2 extends q2 implements Deque {
    @Override  // com.google.common.collect.q2
    protected Object K() {
        return this.y0();
    }

    @Override  // com.google.common.collect.q2
    protected Collection M() {
        return this.y0();
    }

    @Override
    public void addFirst(@d4 Object object0) {
        this.y0().addFirst(object0);
    }

    @Override
    public void addLast(@d4 Object object0) {
        this.y0().addLast(object0);
    }

    @Override
    public Iterator descendingIterator() {
        return this.y0().descendingIterator();
    }

    @Override
    @d4
    public Object getFirst() {
        return this.y0().getFirst();
    }

    @Override
    @d4
    public Object getLast() {
        return this.y0().getLast();
    }

    @Override
    @a
    public boolean offerFirst(@d4 Object object0) {
        return this.y0().offerFirst(object0);
    }

    @Override
    @a
    public boolean offerLast(@d4 Object object0) {
        return this.y0().offerLast(object0);
    }

    @Override
    @o3.a
    public Object peekFirst() {
        return this.y0().peekFirst();
    }

    @Override
    @o3.a
    public Object peekLast() {
        return this.y0().peekLast();
    }

    @Override
    @a
    @o3.a
    public Object pollFirst() {
        return this.y0().pollFirst();
    }

    @Override
    @a
    @o3.a
    public Object pollLast() {
        return this.y0().pollLast();
    }

    @Override
    @a
    @d4
    public Object pop() {
        return this.y0().pop();
    }

    @Override
    public void push(@d4 Object object0) {
        this.y0().push(object0);
    }

    @Override
    @a
    @d4
    public Object removeFirst() {
        return this.y0().removeFirst();
    }

    @Override
    @a
    public boolean removeFirstOccurrence(@o3.a Object object0) {
        return this.y0().removeFirstOccurrence(object0);
    }

    @Override
    @a
    @d4
    public Object removeLast() {
        return this.y0().removeLast();
    }

    @Override
    @a
    public boolean removeLastOccurrence(@o3.a Object object0) {
        return this.y0().removeLastOccurrence(object0);
    }

    @Override  // com.google.common.collect.q2
    protected Queue s0() {
        return this.y0();
    }

    protected abstract Deque y0();
}

