package es.janyma.rx;

import rx.Observable;

public class RxTest {
	static String result = "";
	static String resultFinal = "";

	public static void main(String arg[]) {
		Observable<String> observable = Observable.just("Hello");
		observable.subscribe(s -> result = s);
		
		if(result.equals("Hello")) {
			System.out.println("yesssss");
		}
		
		// ----------------------------------------------------------------------------------------
		
		String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
		Observable<String> observable2 = Observable.from(letters);
		observable2.subscribe(
		  i -> result += i,  //OnNext
		  Throwable::printStackTrace, //OnError
		  () -> result += "_Completed" //OnCompleted
		);
		
		
		String[] letters2 = {"a", "b", "c", "d", "e", "f", "g"};
		Observable<String> observable3 = Observable.from(letters2);
		observable3.subscribe(
		 System.out::println
		);
	}
}
