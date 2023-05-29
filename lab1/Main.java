package lab1;

import java.util.HashMap;
import java.util.Map;
public class Main {

	 public static void main(String[] args) {
		  String[] data1 = {"a", "8", "b", "1"};
		  String[] data2 = {"x", "94", "y", "456"};
		  String[] data3 = {"c", "78", "q", "32"};
		  evaluate("a + b", data1);
		  evaluate("x + y", data2);
		  evaluate("c + q", data3);
	  }

	  public static void evaluate(String expression, String[] data) {
		  Map<String, Integer> map = new HashMap<>();
		  for (int i = 0; i < data.length; i += 2) {//a+b 8+1 ig ajluulah gj bui uchir 2 oor nemne 
			  map.put(data[i], Integer.parseInt(data[i + 1]));//data[0,1,2] dr int ru horwuled data[1,2,3] ig put hine
			  
			}
			String[] exp = expression.split("\\+"); //tsuglulj tasdaj awsn ymnuda exp array ruu hine
			int result = map.get(exp[0].trim()) + map.get(exp[1].trim());//trim n 2talin hooson zaig ustgana
			System.out.println(expression + " result is:" + result);
			}
	  }

