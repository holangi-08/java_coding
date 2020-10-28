/*
 *   Copyright Chisa Kato
 */

package com.example.primenumber;

/**
 *　Mainクラス.
 *
 * 10までの素数の一覧を出力する.
 *
 * @author Chisa Kato
 */
public class Main {
    /**
     * Mainメソッド.
     *
     * 10までの素数の一覧を出力する.
     *
     * @param args 今回の場合は使用していない
     */
    public static void main(String[] args) {

        PrimeNumber application = new PrimeNumber();
        application.execute(10);

    }

}