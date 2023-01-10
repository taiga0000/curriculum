package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       例List<Object> array = new ArrayList<>();
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
		List<String> array = new ArrayList<String>();
		array.add("hoge");
		array.add("pos");
		array.add("foo");
			
//      問② arrayの二つ目の要素を"bar"にしましょう。
//	　<以下記述>
		array.set(1, "bar");
		
//      問③ fooが格納されているインデックスを出力してくださstい。
//	　<以下記述>
		int fooIndex = array.indexOf("foo");

		System.out.println("fooのインデックス: " + fooIndex);
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("btc", "ビットコイン");
        map.put("eth", "イーサリアム");
        map.put("ltc", "ライトコイン");


//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        for (String key : map.keySet()) {
			System.out.println("key:"+ key);}
        
//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
        for (Object value : map.values()) {
			System.out.println("volue:" + value);}
		}
		
		{
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           
           int[] arrayDate = new int[3];
           arrayDate[0] = cal.get(Calendar.YEAR);
           arrayDate[1] = cal.get(Calendar.MONTH);
           arrayDate[2] = cal.get(Calendar.DATE);

          
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
         int[] array = {arrayDate[0], arrayDate[1], arrayDate[2]};
         List<int[]> list = Arrays.asList(array);

        

        // Listの内容を出力
       
//	    <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
         
         for (int[] date : list) {
        	  System.out.println(arrayDate[0]);
        	  System.out.println(arrayDate[1]);
        	  System.out.println(arrayDate[2]);
        	}
		}
	}

}