// Name = Muhammad S Munir
// Course = 003492 
// Section = CS 3345.005.21s
// Description = Project 1 

class Main
{
  public static boolean[] seiveOfEratos(int n)
  {
      boolean primes[] = new boolean [n + 1];
      for (int i = 1; i < primes.length; i++)
      {
        primes[i] = true;
      }

      for (int i = 2; i * i <= primes.length; i++)
      {
          if (primes[i])
          {
              // turn the multiples of prime to false
              for (int j = i * i; j <= n; j += i)
              {
                  primes[j] = false;
              }
          }
      }

      return primes;
  }

  public static void main(String[] args)
  {
      // prompt the user to give a number
      System.out.println("Prime numbers till: ");
      String primeTill = System.console().readLine(); 
      int n = Integer.parseInt(primeTill);
      if (n < 1)
      {
        System.out.println("Argument must be positive");
        return;
      }
      boolean primes[] = seiveOfEratos(n);

      for (int i = 0; i < primes.length; i++)
      {
        if (primes[i])
        {
          System.out.println(i);
        }
      }
  }
}
