/*Opgave 4.1:
int add(int a, int b){
    return a+b;
}

void main() {
    int result = add(5, 3);
    System.out.println(result);
}
 */

/*Opgave 4.2:
int subtract(int a, int b){
    return a-b;
}

void main (){
    int result = subtract(7,5);
    System.out.println(result);
}
 */

/*Opgave 4.3:
int multiply (int a, int b){
    return a*b;
}

void main(){
    int result = multiply(7,6);
    System.out.println(result);
} */

/*Opgave 4.4:
int square (int n){
    return n*n;
}

void main (){
    int result = square(9);
    System.out.println(result);
} */

/*Opgave 4.5:
int doubleIt (int n){
    return n *2;
}

void main(){
    int result = doubleIt(10);
    System.out.println(result);
} */

/*Opgave 4.6:
int triple(int n) {
    return n * 3;
}

void main() {
    int a = triple(4);
    int b = triple(a);
    System.out.println(b);
} */

/*Opgave 4.7:
int calculateArea(int width, int height){
    return width * height;
}

void main (){
    int area = calculateArea(5,10);
    System.out.println(area);
} */

/*Opgave 4.8:
int square (int n){
    return n*n;
}

void main (){
    int resultOfSquares = square(3) + square(4);
    System.out.println(resultOfSquares);
}
 */

/*Opgave 4.9:
double half (double n){
    return n / 2;
}

void main (){
    double result = half(4);
    System.out.println(result);
}*/

/*Opgave 4.10:
double toFahrenheit(double celsius){
    return celsius * 9.0 / 5.0 + 32;
}

void main (){
    double result = toFahrenheit(32);
    System.out.println(result);
} */

/*Opgave 4.11:
double toCelsius(double fahrenheit){
    return (fahrenheit -32) * 5.0 / 9.0;
}

void main (){
    double result = toCelsius(32);
    System.out.println(result);
} */

/*Opgave 4.12:
double percentage(double value, double total){
    return (value / total) * 100;
}

void main (){
    System.out.println(percentage(25,100) + " %");
}  */

/*Opgave 4.13:
 int max(int a, int b){
        if (a > b){
            return a;
        }  else {
            return b;
        }
 }

 void main (){
     System.out.println("max (10, 5) = " + max(10,5));
 }     */

 /*Opgave 4.14:
 int min(int a, int b) {
     if (a < b){
         return a;
     } else {
         return b;
     }
 }

 void main (){
     System.out.println("min (10,5) = " + min(10,5));
 } */

 /*Opgave 4.15:
int abs(int n) {
     if (n < 0){
         return -n;
     } else {
         return n;
     }
}

void main(){
    System.out.println("abs(10) = " + abs(10));
}  */

/*Opgave 4.16:
int power(int base, int exponent) {
    int result = 1;
    for(int i = 0; i < exponent; i++){
        result = result * base;
    }
    return result;
}

void main (){
    System.out.println("2^3 = " + power(2,3));
} */

/*Opgave 4.17:
boolean isPositive(int n){
    return n > 0;
}

void main (){
    System.out.println(isPositive(10));
}  */

/*Opgave 4.18:
boolean isEven(int n){
    return n % 2 == 0;
}

void main (){
    System.out.println("Is even (4)" + isEven(4));
} */

/*Opgave 4.19:
boolean isAdult(int age) {
   return age >= 18;
}

void main (){
    System.out.println("Adult: " + isAdult(20));
}    */

/*Opgave 4.20:
 boolean isAdult(int age) {
    return age >= 18;
}

void main() {
    int customerAge = 16;

    if (isAdult(customerAge)) {
        System.out.println("Sale approved");
    } else {
        System.out.println("Sale denied - too young");
    }
}   */

/*Opgave 4.21:
 boolean isInRange(int value, int min, int max){
     return value >= min && value <= max;
 }

 void main (){
     System.out.println(isInRange(5,1,10));
 }     */
 
 /*Opgave 4.22:
boolean isValidScore (int score){
     return score >= 0 && score <= 100;
}

void main (){
    System.out.println(90);
} */

/*Opgave 4.23:
boolean isDivisibleBy(int number, int divisor){
    return number % divisor == 0;
}

void main (){
    System.out.println(isDivisibleBy(10,5));
}  */

/*Opgave 4.24:
boolean canAfford(double price, double money){
    return money >= price;
}

void main (){
    System.out.println(canAfford(50.0, 100.0));
}    */

/*Opgave 4.25:
String greet(String name) {
    return "Hello, " + name +"!";
}

void main (){
    System.out.println(greet("Besima"));
} */

/*Opgave 4.26:
String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
}

void main (){
    System.out.println(fullName("Besima", "Plavotic"));
}   */

/*Opgave 4.27:
String exclaim(String text){
    return text + "!";
}

void main(){
    System.out.println(exclaim("Hello"));
    System.out.println(exclaim("Wow"));
}  */

/*Opgave 4.28:
String shout(String text) {
    return text.toUpperCase();
}

void main(){
    System.out.println(shout("hej med dig"));
}   */

/*Opgave 4.29:
String repeat(String text, int times){
    String result = "";
    for (int i = 0; i < times; i++){
        result = result + text;
    }
    return result;
}

void main(){
    System.out.println(repeat("Ha", 3));
    System.out.println(repeat("nej", 4));
} */

/*Opgave 4.30:
int getLength(String text){
    return text.length();
}

void main(){
    System.out.println(getLength("Hello you"));
    System.out.println(getLength(""));
} */

/*Opgave 4.31:
char getFirstChar(String text){
    return text.charAt(0);
}

void main(){
    System.out.println(getFirstChar("Hello world"));
}    */

/*Opgave 4.32:
String getGrade(int score){
    if (score >= 90){
        return "A"; 
    } else if (score >= 80){
        return "B";
    } else if (score >= 70){
        return "C";
    } else if (score >= 60){
        return "D";
    } else {
        return "F";
    }
}

void main (){
    System.out.println("94 -> "  + getGrade(94));
    System.out.println("80 -> " + getGrade(80));
    System.out.println("75 -> " + getGrade(75));
    System.out.println("57 -> " + getGrade(57));
}    */

/*Opgave 4.33:
int sum(int[] numbers){
    int total = 0;
    for(int i = 0; i < numbers.length; i++){
        total = total + numbers[i];
    }
    return total;
}

void main (){
    int [] data = {10, 20, 30, 40};
    int result = sum(data);
    System.out.println("Sum: " + result); 
}  */

/*Opgave 4.34:
double average (int[] numbers){
    double total = 0;
    for (int i = 0; i < numbers.length; i++){
          total = total + numbers [i];
    }
    return (double) total / numbers.length;
}

void main(){
   int[] data = {10, 20, 30, 40};
       double avg = average(data);
       System.out.println("Average: " + avg);
}    */

/*Opgave 4.35:
int findMax(int[] numbers) {
     int max = numbers [0];
     for (int i = 1; i < numbers.length; i++){
         if (numbers[i] > max) {
             max = numbers [i];
         }
     }
     return max;
}

void main (){
    int [] data = {23, 45, 12, 67, 34};
    System.out.println("Max: " +  findMax(data));
}  */

/*Opgave 4.36:
 int findMin(int[] numbers){
      int min = numbers[0];
      for (int i = 1; i < numbers.length; i++){
          if (numbers[i] < min) {
              min = numbers [i];
          }
      }
      return min;
 }

 void main (){
    int [] data = {23, 45, 12, 67, 34};
    System.out.println("Min: " + findMin(data));
 }  */

 /*Opgave 4.37:
 int count(int[] numbers, int target) {
     int counter = 0;
     for (int i = 0; i < numbers.length; i++){
         if (numbers[i] == target){
             counter++;
         }
     }
     return counter;
 }

 void main (){
     int[] data = {1, 2, 3, 2, 4, 2, 5};
     System.out.println("Count of 2: " + count(data,2));
 }       */

 //Opgave 4.38:
    boolean contains(int[] numbers, int target) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    void main (){
        int[] data = {10, 20, 30, 40, 50};
        System.out.println(contains(data, 30));
        System.out.println(contains(data, 99));
    }

   /*Opgave 4.39:
   int indexOf(int[] numbers, int target){
      for (int i = 0; i < numbers.length; i++){
          if (numbers [i] == target) {
              return i;
          }
      }
      return -1;
   }    */


   /*Opgave 4.40:
   int countPositive(int[] numbers) {
       int counter = 0;
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > 0) {
               counter++;
           }
       }
       return counter;
   }

   void main() {
       int[] data = {-3, 5, 0, -1, 8, 2, -4};
       System.out.println("Positive: " + countPositive(data));
   } */

   /*Opgave 4.41:
   double applyDiscount(double price, int discountPercent){
       double discount = price * discountPercent / 100;
       return price - discount;
   }

   void main (){
       System.out.println(applyDiscount(100.00, 20));

   } */

    /*Opgave 4.42:
    double calculateTax(double price){
        return price * 0.25;
    }

    double calculateTotal(double price) {
        return price + calculateTax(price);
    }

    void main (){
        double price = 100;
        System.out.println("Price " + price);
        System.out.println("Tax: " + calculateTax(price));
        System.out.println("Total: " + calculateTotal(price));
    }     */

    /*Opgave 4.43:
    double calculateBMI(double weightKg, double heightM){
        return weightKg / (heightM * heightM);
    }

    void main (){
        double BMI = calculateBMI(70.0, 1.75);
        System.out.println(BMI);
    }   */

    /*Opgave 4.44:
    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
         }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    int getRange(int[] numbers) {
        return findMax(numbers) - findMin(numbers);
    }

    void main() {
        int[] data = {5, 23, 12, 45, 8};
        System.out.println("Range: " + getRange(data));
    }  */

    /*Opgave 45;
    boolean isLongEnough(String password, int minLength){
         return password.length() >= minLength;
    }

    boolean hasDigit(String text) {
        for (int i = 0; i <text.length(); i++){
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    boolean isValidPassword (String password) {
        return isLongEnough(password, 8) && hasDigit(password);
    }

    void main (){
        System.out.println(isValidPassword("abc"));
        System.out.println(isValidPassword("abcdefgh"));
        System.out.println(isValidPassword("abcdef1"));
        System.out.println(isValidPassword("abcdefg1"));  
    }
     */

    /*Opgave 4.46:
    String getInitials(String firstName, String lastName){
         char first = firstName.charAt (0);
         char last = lastName.charAt(0);
         String initials = ("" + first + last).toUpperCase();
         return initials;
    }

    void main(){
        System.out.println(getInitials("besima", "plavotic"));
    } */

    /*Opgave 4.47:
    int clamp(int value, int min, int max){
        if (value < min){
            return min;
        } else if (value > max){
            return max;
        } else {
            return value;
        }
    }

    void main (){
        System.out.println(clamp(30,60,70));
        System.out.println(clamp(70, 100, 150));
        System.out.println(clamp(100, 70, -1));
    }  */

    /*Opgave 4.48:
   int [] data = {12, 45, 23, 67, 34, 89, 21};

    int sum(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }

    double average (int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    int findMax (int[] numbers) {
        int max = numbers [0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers [i] > max) {
                max = numbers [i];
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    int getRange(int[] numbers) {
        return findMax(numbers) - findMin(numbers);
    }

    void main() {
        System.out.println("=== Statistics ===");
        System.out.println("Sum: " + sum(data));
        System.out.println("Average: " + average(data));
        System.out.println("Max: " + findMax(data));
        System.out.println("Min: " + findMin(data));
        System.out.println("Range: " + getRange(data));
    }  */