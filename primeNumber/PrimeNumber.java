/*
 *   Copyright Chisa Kato
 */

package com.example.primenumber;

/**
 *　PrimeNumberクラス.
 *
 * 素数の一覧を出力する.
 *
 * @author Chisa Kato
 */
public class PrimeNumber {
    /**
     *　executeメソッド.
     *
     * 素数の一覧を出力する.
     * 引数nまでの素数の一覧を出力する.
     *
     * @param n 求める素数の最大値
     */
    public void execute(int n) {

        for (int i = 2; i <= n ; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
    /**
     * primeNumberメソッド.
     *
     * 引数iが素数か否かの判定をし素数であればその数を出力する.
     *
     * @param i 判定対象
     */
    public boolean isPrimeNumber(int i) {

        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
} 