import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Eratosthenes{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("素数リストを出力するプログラムです。");
		System.out.println("リストの最大値を整数で入力してください。");
		try{
			String line = reader.readLine();
			int imax = Integer.parseInt(line);
			if (imax >= 2){
				primeGen(imax);
			}else System.out.println("Type a number above 1 please");
		}catch(IOException e){System.out.println(e);
		}catch(NumberFormatException e){System.out.println("Not a valid number");
		}
	}
	public static void primeGen(int imax){
                int[] primes = new int[imax];
                primes[0] = 2;
                System.out.print(2+" ");
                int jmax = 0;
                for(int i = 3; i <= imax; i++){
                        //System.out.println("i is "+i);
                        for(int j = 0; j <= jmax ; j++){
                                //System.out.println("divide "+primes[j]+", remainder is "+i%primes[j]);

                                if (i%primes[j] == 0){
                                        break;
                                }else if(j == jmax){
                                        jmax++;
                                        //System.out.println("jmax increased by 1 to "+jmax);                                                             //System.out.println(i+" is put into index "+jmax);
                                        System.out.print(i+" ");
                                        primes[jmax] = i;
                                        break;
                                } //else try next prime number
                        }
                }
	}
}
