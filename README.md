# Практична робота "Створення і використання статичних методів"
## Знайти всі дільники заданого шестизначного числа (метод Calculate має повернути рядок - список таких чисел через кому
### Вихідний код класу Calculate
 ```Java 
    package domain;

    /**
    * A class that represent the exercise
    * @author VitaliyZ3
    */
    public class Exercise {
    
    /**
        * Searching dividion of six-digit number
        * @param n six-digit number
        * @return string reurn divides of six-digit number
        * @throws java.lang.Exception 
        */
    public static String Calculate(int n) throws Exception{
        
        String result = "";
        
        // check length of number
        int length = (int) (Math.log10(Math.abs(n)) + 1);
        if (length!=6)  throw new Exception("Number `" + String.valueOf(n) + "` is not six-digit");
        for (int i = 1; i <= n; i++)
        {
        if(0 == (n % i))
        result += i+ ",";
        }
        return result;
        
    }

}
 ```
 ### Вихідний код класу TestResult
 ```Java 
   package test;

    import domain.Exercise;

    public class TestResult {

        public static void main(String[] args) {
        try {
            int input = 401211;
            System.out.printf("�ividers of %d : %s.",input, Exercise.Calculate(input));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    }

 ```
 #### Перевірка на різні вхідні дані
<img src="https://imgur.com/C8iwPPF"/>
<img src="https://imgur.com/HKBg2CP"/>
