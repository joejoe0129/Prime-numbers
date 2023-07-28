// Jordan Joseph
// 1/26/23
//Write a program that displays the first 50 prime numbers on five different lines (so each line will have 10 numbers).
class Main {
  public static void main(String[] args) {

int pCount = 0;
int num = 2;           // main ints
boolean isPrime = true;
System.out.println("The first 50 prime numbers are:");

while (pCount < 50) {
 
    for(int diver = 2; diver < num; diver++){ /* prime checker */
      
        if(num == diver){
          isPrime = true;
          }else if (num%diver != 0){
          isPrime = true; 
          }else if (num%diver == 0){
          isPrime = false; 
          break;
        }
      }

      if(isPrime == true){ /*if prime*/
        System.out.print(num + " ");
        num++;
        pCount++;
        } else if(isPrime != true){ /*if not prime*/
        num++;
      }

      if(pCount % 10 == 0){
        System.out.println(); // line indenter
      }
   }
    
} 
}