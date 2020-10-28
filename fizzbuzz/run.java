/*
 *   Copyright Chisa Kato
 */

/**
 *　run
 * 説明:
 *  3と5の最小公倍数15で割り切れるn番目の数はFizzBuzzを出力
 *  5で割り切れるn番目の数はBuzzを出力
 *  3で割り切れるn番目の数はFizzを出力
 *  3,5,15で割り切れないn番目の数はそのままn番目の数が出力
 *
 * @author Chisa Kato
 */

/**
  * runクラスを宣言します
  */
public class run {

    /**
     * これはexecuteメソッドです
     */
    public void execute() {

        //ループを使用
        for(int n = 1; 0 < n ; n++) {

            //15で割り切れる場合
            if(n % 15 == 0){

                //FizzBuzzを出力します
                System.out.println("FizzBuzz");

            //5で割り切れる場合
            }else if(n % 5 == 0){

                //Buzzを出力します
                System.out.println("Buzz");

            //3で割り切れる場合
            }else if(n % 3 == 0){

                //Fizzを出力します
                System.out.println("Fizz");

            //そうでない場合
            }else{

                //n番目の数を出力します
                System.out.println(n);
            }
        }
    }
}