package com.rekha.Day50;
public class SentenceBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Learning ");
        sb.append("Java");
        sb.insert(sb.length(), " with fun");
        System.out.println(sb);
    }
}