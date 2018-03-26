package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* 
Общий список
*/

public abstract class Solution implements java.util.List <Long> {
    @Override
    public synchronized int size() {
        return 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        return false;
    }

    @Override
    public synchronized boolean contains(Object o) {
        return false;
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return null;
    }

    @Override
    public synchronized Object[] toArray() {
        return new Object[0];
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return false;
    }

    @Override
    public synchronized boolean remove(Object o) {
        return false;
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public String toString() {
        return original.toString();
    }

    @Override
    public Stream<Long> stream() {
        return original.stream();
    }

    @Override
    public Stream<Long> parallelStream() {
        return original.parallelStream();
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized void clear() {

    }

    @Override
    public synchronized Long get(int index) {
        return null;
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return null;
    }

    @Override
    public synchronized void add(int index, Long element) {

    }

    @Override
    public synchronized Long remove(int index) {
        return null;
    }

    @Override
    public synchronized int indexOf(Object o) {
        return 0;
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Object clone() {
        return original.clone();
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return null;
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return null;
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Long> action) {
        original.forEach(action);
    }

    @Override
    public Spliterator<Long> spliterator() {
        return original.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super Long> filter) {
        return original.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator<Long> operator) {
        original.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Long> c) {
        original.sort(c);
    }

    @Override
    public boolean equals(Object o) {
        return original.equals(o);
    }

    @Override
    public int hashCode() {
        return original.hashCode();
    }

    private ArrayList<Long> original = new ArrayList<Long>();

    public void trimToSize() {
        original.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        original.ensureCapacity(minCapacity);
    }

    public static void main(String[] args) {

    }
}
