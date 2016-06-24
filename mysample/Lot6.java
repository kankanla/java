import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

class a{
	public static void main(String[] x){
		Loto6 l;
		for(int i = 1; i < 1000000; i++){
			l = new Loto6();
			l.Cre6();
		}
	}
}


class Loto6 {
	ArrayList<Integer> L6 = new ArrayList<Integer>();

	void Cre6(){
		do{
			int temp = new Random().nextInt(44);
			if(temp > 0 && L6.indexOf(temp) == -1){
				L6.add(temp);
			}

		}while(L6.size()<6);
		System.out.println(L6.toString());
	}
}