import java.util.Scanner;


public class a_command {
	public static void main(String[] args){
		int num;
		int l_flag;
		int ah_flag;
		int f_flag;
		String message;


		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();

		for(int i = 0 ; i < num ; i++){

		message = scan.next();

		l_flag = issize(message);
		ah_flag = isahpa(message);
		f_flag = isform(message);

		if(l_flag == 1 && ah_flag == 1 && f_flag == 1)
			System.out.println(1);
		else
			System.out.println(0);

		//System.out.println(l_flag);
		//System.out.println(ah_flag);	
		//System.out.println(f_flag);
		}

	}


	public static int issize(String str){
		int ch;
		ch = str.length();

		if(ch == 7)
			return 1;
		else
			return 0;
	}

	public static int isahpa(String str){
		int ascii;
		int cnt = 0;
		int same = 1; 
		char sec_ch =0;
		char ch = str.charAt(0);

		for(int i = 0; i < 6 ; i++){
			if(str.charAt(i) != str.charAt(i+1)){
				same++; 	
				sec_ch = str.charAt(i+1);
				cnt = i+1;
				break;
			}
		}

		for(int j = cnt ; j < 6 ; j++){
			if(str.charAt(j) != str.charAt(j+1) && str.charAt(j+1) != ch && str.charAt(j+1) != sec_ch)
				same++;
		}

		if(same > 2)
			return 0;
		else
			return 1;
	}

	public static int isform(String str){
		int f_cnt = 0;
		int f_ch = 0;

		if(str.charAt(0) == str.charAt(1))
			f_cnt++;
		if(str.charAt(1) != str.charAt(2))
			f_cnt++;
		if(str.charAt(2) == str.charAt(3))
			f_cnt++;
		if(str.charAt(3) != str.charAt(4))
			f_cnt++;
		if(str.charAt(4) != str.charAt(5))
			f_cnt++;
		if(str.charAt(5) == str.charAt(6))
			f_cnt++;

		if(f_cnt > 5)
			f_ch = 1;

		return f_ch;
		
	}
}
