public class Task9c {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int count = 0;
    int number = 0;

    while (count < 10){
      boolean isPrime = true;
      for(int i = 2; i <= number / 2; i++){
        if(number % i == 0){
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(number + ", ");
        count++;
      }
      number++;
    }
  }
}
