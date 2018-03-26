package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние

    @Override
    public synchronized int compareTo(Beach o) {
        int this_result = (int)this.distance * this.quality;
        int o_result = (int)o.distance * o.quality;

        return this_result - o_result;
    }

    public synchronized int length() {
        return getName().length();
    }

    public synchronized boolean contains(CharSequence s) {
        return getName().contains(s);
    }

    public synchronized String replace(CharSequence target, CharSequence replacement) {
        return getName().replace(target, replacement);
    }

    public synchronized String intern() {
        return getName().intern();
    }

    public synchronized boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return getName().regionMatches(toffset, other, ooffset, len);
    }

    public synchronized boolean matches(String regex) {
        return getName().matches(regex);
    }

    public synchronized IntStream codePoints() {
        return getName().codePoints();
    }

    public synchronized String[] split(String regex) {
        return getName().split(regex);
    }

    public synchronized char[] toCharArray() {
        return getName().toCharArray();
    }

    public synchronized String toUpperCase() {
        return getName().toUpperCase();
    }

    public synchronized static String format(String format, Object... args) {
        return String.format(format, args);
    }

    public synchronized static String valueOf(float f) {
        return String.valueOf(f);
    }

    public synchronized static String valueOf(int i) {
        return String.valueOf(i);
    }

    public synchronized static String valueOf(double d) {
        return String.valueOf(d);
    }

    public synchronized String toUpperCase(Locale locale) {
        return getName().toUpperCase(locale);
    }

    public synchronized IntStream chars() {
        return getName().chars();
    }

    public synchronized int lastIndexOf(String str, int fromIndex) {
        return getName().lastIndexOf(str, fromIndex);
    }

    public synchronized static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    @Deprecated
    public synchronized void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        getName().getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public synchronized boolean startsWith(String prefix, int toffset) {
        return getName().startsWith(prefix, toffset);
    }

    public synchronized String substring(int beginIndex, int endIndex) {
        return getName().substring(beginIndex, endIndex);
    }

    public synchronized int lastIndexOf(int ch) {
        return getName().lastIndexOf(ch);
    }

    public synchronized int indexOf(int ch) {
        return getName().indexOf(ch);
    }

    public synchronized boolean equalsIgnoreCase(String anotherString) {
        return getName().equalsIgnoreCase(anotherString);
    }

    public synchronized void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        getName().getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public synchronized static String valueOf(char c) {
        return String.valueOf(c);
    }

    public synchronized boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return getName().regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public synchronized int compareToIgnoreCase(String str) {
        return getName().compareToIgnoreCase(str);
    }

    public synchronized int codePointAt(int index) {
        return getName().codePointAt(index);
    }

    public synchronized static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    public synchronized static String valueOf(long l) {
        return String.valueOf(l);
    }

    public synchronized int compareTo(String anotherString) {
        return getName().compareTo(anotherString);
    }

    public synchronized char charAt(int index) {
        return getName().charAt(index);
    }

    public synchronized static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    public synchronized int indexOf(String str, int fromIndex) {
        return getName().indexOf(str, fromIndex);
    }

    public synchronized String[] split(String regex, int limit) {
        return getName().split(regex, limit);
    }

    public synchronized int lastIndexOf(int ch, int fromIndex) {
        return getName().lastIndexOf(ch, fromIndex);
    }

    public synchronized String toLowerCase() {
        return getName().toLowerCase();
    }

    public synchronized String concat(String str) {
        return getName().concat(str);
    }

    public synchronized int codePointCount(int beginIndex, int endIndex) {
        return getName().codePointCount(beginIndex, endIndex);
    }

    public synchronized int indexOf(String str) {
        return getName().indexOf(str);
    }

    public synchronized String trim() {
        return getName().trim();
    }

    public synchronized boolean isEmpty() {
        return getName().isEmpty();
    }

    public synchronized String replaceFirst(String regex, String replacement) {
        return getName().replaceFirst(regex, replacement);
    }

    public synchronized static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    public synchronized static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    public synchronized byte[] getBytes() {
        return getName().getBytes();
    }

    public synchronized boolean endsWith(String suffix) {
        return getName().endsWith(suffix);
    }

    public synchronized byte[] getBytes(Charset charset) {
        return getName().getBytes(charset);
    }

    public synchronized int offsetByCodePoints(int index, int codePointOffset) {
        return getName().offsetByCodePoints(index, codePointOffset);
    }

    public synchronized static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    public synchronized String replaceAll(String regex, String replacement) {
        return getName().replaceAll(regex, replacement);
    }

    public synchronized String substring(int beginIndex) {
        return getName().substring(beginIndex);
    }

    public synchronized int indexOf(int ch, int fromIndex) {
        return getName().indexOf(ch, fromIndex);
    }

    public synchronized CharSequence subSequence(int beginIndex, int endIndex) {
        return getName().subSequence(beginIndex, endIndex);
    }

    public synchronized int codePointBefore(int index) {
        return getName().codePointBefore(index);
    }

    public synchronized byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return getName().getBytes(charsetName);
    }

    public synchronized boolean contentEquals(CharSequence cs) {
        return getName().contentEquals(cs);
    }

    public synchronized String replace(char oldChar, char newChar) {
        return getName().replace(oldChar, newChar);
    }

    public synchronized boolean startsWith(String prefix) {
        return getName().startsWith(prefix);
    }

    public synchronized String toLowerCase(Locale locale) {
        return getName().toLowerCase(locale);
    }

    public synchronized boolean contentEquals(StringBuffer sb) {
        return getName().contentEquals(sb);
    }

    public synchronized static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public synchronized int lastIndexOf(String str) {
        return getName().lastIndexOf(str);
    }

    public synchronized static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    public synchronized static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    @Override
    public synchronized boolean equals(Object anObject) {
        return getName().equals(anObject);
    }

    @Override
    public synchronized int hashCode() {
        return getName().hashCode();
    }

    @Override
    public synchronized String toString() {
        return getName().toString();
    }

    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}
