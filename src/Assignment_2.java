/*Opgave 2.1:
void printName (String name) {
    System.out.println("Name: " + name);
}

void main (){
    printName ("Besima");
}
 */

/*Opgave 2.2:
void printName(String name) {
    System.out.println("Name: " + name);
}

void main() {
    printName("Besima");
    printName("Louise");
    printName("August");
    printName("Lukas");
} */

/*Opgave 2.3:
void greet(String name){
    System.out.println("Hello, " + name + "!");
}

void main (){
    greet("Besima");
    greet("Louise");
    greet("August");
    greet("Lukas");
} */

/*Opgave 2.4:
void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

void main() {
    String myName = "Besima";
    greet(myName);
}
*/

/*Opgave 2.5:
void printMessage(String message) {
    System.out.println("*** message ***");
}

void main (){
    printMessage("Welcome");
}
 */

/*Opgave 2.6:
void announce(String text) {
    System.out.println(">>> " + text + " <<<");
}

void main() {
    announce("Start");
    announce("Middle");
    announce("End");
}
 */

/*Opgave 2.7:
void shout(String text) {
    System.out.println(text.toUpperCase());
}

void main (){
    shout("Welcome");
    shout("This is fun");
}
 */

/*Opgave 2.8:
void whisper(String text){
    System.out.println(text.toLowerCase());
}

void main() {
    whisper("HELLO MY FRIEND");
    whisper("STILL FUNNY");
}
 */

/*Opgave 2.9:
void printNumber (int number){
    System.out.println("Number: " + number);
}

void main (){
    printNumber(10);
    printNumber(42);
    printNumber(100);
}
 */

/*Opgave 2.10:
void printPrice (double price){
    System.out.println("Price: " + price + " kr.");
}
void main (){
    printPrice(29.95);
    printPrice(149.00);
}  */

/*Opgave 2.11:
void printStatus (boolean active){
    System.out.println("Active: " + active);
}

void main (){
    printStatus(true);
    printStatus(false);
}
 */

/*Opgave 2.12:
void printGrade (char grade) {
    System.out.println("Grade: " + grade);
}

void main (){
    printGrade('A');
    printGrade('B');
    printGrade('C');
} */

/*Opgave 2.13:
void printScore (int points){
    System.out.println("Score: " + points);
}

void main (){
    int score = 85;
    printScore(score);
}
 */

/*Opgave 2.14:
void printNumber (int number){
    System.out.println("Number: " + number);
}

void main() {
    printNumber(5 + 3);
    printNumber(10 * 2);
    printNumber(100 / 4);
} */

/*Opgave 2.15:
void printTemperature(double temp){
    System.out.println(temp + " C");
}

void main(){
    printTemperature(35.5);
}
 */

/*Opgave 2.16:
void printPercentage(int percent) {
    System.out.println(percent + " %");
}

void main(){
    printPercentage(25);
}  */

/*Opgave 2.17:
 void printFullName(String firstName, String lastName){
     System.out.println(firstName + " " + lastName);
 }

 void main(){
     printFullName("Besima", "Plavotic");
 } */

/*Opgave 2.18:
void printPerson(String name, int age) {
    System.out.println("Name: " + name + "." + "Age: " + age + "." );
}

void main (){
    printPerson("Besima", 29);
}   */

/*Opgave 2.19:
void printProduct (String name, double price, int quantity){
    System.out.println("Name: " + name);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
}

void main(){
    printProduct("Besima", 35, 4);
} */

/*Opgave 2.20:
void showInfo(String name, int value) {
    System.out.println(name + " = " + value);
}

void main() {
    showInfo("Score", 100);
    showInfo("Lives", 3);
} */

/*Opgave 2.21:
void printLabeled(String label, String value) {
    System.out.println(label + ": " + value);
}

void main() {
    printLabeled("Name", "Anna");
    printLabeled("City", "Copenhagen");
    printLabeled("Country", "Denmark");
}  */

/*Opgave 2.22:
void printRectangle(int width, int height) {
    System.out.println("Rectangle: " + width + " x " + height);
}

void main() {
    printRectangle(10, 5);
    printRectangle(20, 8);
} */

/* Opgave 2.23:
void printCoordinates(int x, int y) {
    System.out.println("(" + x + ", " + y + ")");
}

void main() {
    printCoordinates(0, 0);
    printCoordinates(10, 20);
    printCoordinates(-5, 15);
} */

/*Opgave 2.24:
void printRange(int min, int max) {
    System.out.println("Range: " + min + " to " + max);

void main (){
    printRange (1, 10);
    printRange(0, 100);
}    */

/*Opgave 2.25:
void printIfPositive(int number){
  if (number > 0);
  System.out.println(number);
}

void main (){
    printIfPositive(25);
    printIfPositive(16);
}  */

/*Opgave 2.26:
void printEvenOdd(int number) {
   if (number % 2 == 0) {
       System.out.println(number + " is even");
   } else {
       System.out.println(number + " is odd");
   }
}

void main (){
   printEvenOdd(24);
   printEvenOdd(15);
}    */

/*Opgave 2.27:
 void printAgeCategory(int age) {
    if (age < 13) {
        System.out.println("Child");
    } else if (age < 20) {
        System.out.println("Teenager");
    } else {
        System.out.println("Adult");
    }
}

void main() {
    printAgeCategory(7);
    printAgeCategory(16);
    printAgeCategory(29);
}    */

/*Opgave 2.28:
void printGradeText (int score){
    if (score >= 90){
        System.out.println("Excellent");
    } else if (score >= 70){
        System.out.println("Good");
    } else if (score >= 50) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
}

void main() {
    printGradeText(99);
    printGradeText(78);
    printGradeText(66);
    printGradeText(40);
} */

/*Opgave 2.29:
void printActiveStatus(boolean active) {
    if (active) {
        System.out.println("Status: ACTIVE");
    } else {
        System.out.println("Status: INACTIVE");
    }
}

void main() {
    printActiveStatus(true);
    printActiveStatus(false);
} */

/*Opgave 2.30:
void printSign(int number) {
    if (number > 0) {
        System.out.println(number + " is positive");
    } else if (number < 0) {
        System.out.println(number + " is negative");
    } else {
        System.out.println(number + " is zero");
    }
}

void main() {
    printSign(20);
    printSign(-10);
    printSign(0);
} */

/*Opgave 2.31:
void printLarger(int a, int b) {
    if (a > b) {
        System.out.println(a);
    } else if (b>a) {
        System.out.println(b);
    } else {
        System.out.println("They are equal: " + a);
    }
}

void main() {
    printLarger(10, 5);
    printLarger(3, 8);
    printLarger(7, 7);
}  */

/*Opgave 2.32:
void printAbsolute(int number) {
    if (number < 0){
        System.out.println(-number);
    } else {
        System.out.println(number);
    }
    }

void main (){
    printAbsolute(10);
    printAbsolute(-10);
    printAbsolute(0);
} */

/*Opgave 2.33:
void printStars(int count){
    for (int i = 0; i < count; i++) {
        System.out.println("*");
    }
    System.out.println();
}

void main (){
    printStars(3);
    printStars(5);
    printStars(10);
} */

/*Opgave 2. 34:
void printChar (char c, int count){
    for (int i = 0; i < count; i++) {
        System.out.println(c);
    }
    System.out.println();
}

void main (){
    printChar('*', 5);
    printChar('-', 10);
    printChar('#', 3);
} */

/*Opgave 2.35:
void printCountdown (int start){
    for (int i = start; i >= 1; i--)
        System.out.println(i);
}

void main (){
    printCountdown(10);
} */

/*Opgave 2.36:
void printNumberRange(String message, int times) {
    for (int i = 0; i < times; i++)
        System.out.println(message);
}

void main (){
    printNumberRange("Hey!", 3);
} */

/*Opgave 2.37: (andet output)
void printSquare(int size) {
    for (int row = 0; row < size; row++){
        for (int col = 0; col < size; col++){
            System.out.println("*");
        }
    }
    System.out.println();
}

void main(){
    printSquare(3);
    System.out.println();
    printSquare(5);
} */

/*Opgave 2.39: (andet output)
void printTriangle(int height) {
   for (int row = 1; row <= height; row++) {
       for(int star = 0; star < row; star++) {
           System.out.println("*");
       }
       System.out.println();
   }
}

void main (){
    printTriangle(4);
} */

/*Opgave 2.40:
void printTableRow(int number) {
  for (int i = 1; i <= 10; i++){
      System.out.println(number + " x " + i + " = " + (number * i));
    }
}

void main (){
    printTableRow(5);
} */

/*Opgave 2.41: (ANDET OUTPUT)
void printDivider(int length){
    for (int i = 0; i < length; i++){
        System.out.println("-");
    }
    System.out.println();
}

void printSection (String title, int width){
    printDivider(width);
    System.out.println(title);
    printDivider(width);
}

void main (){
    printSection("Introduktion", 20);
    System.out.println("Content here...");
    printSection("Conclusion", 20);
} */

/*Opgave 2.42:
void printValidAge(int age) {
    if (age >= 0 && age <= 150 ){
        System.out.println("Age: " + age);
    } else {
        System.out.println("Invalid age");
    }
}

void main (){
    printValidAge(29);
    printValidAge(-10);
    printValidAge(100);
}
*/

/*Opgave 2.43:
void printRectangleArea(int width, int height) {
    int area = width * height;
    System.out.println("Rectangle " + width + " x " + height);
    System.out.println("Area: " + area);
}

void main (){
    printRectangleArea(5, 3);
    printRectangleArea(10, 4);
} */

/*Opgave 2.44 (andet output)
void printProgressBar(int percent){
    int filled = percent /10;
    int empty = 10 - filled;

    System.out.println("[");
    for ( int i = 0; i < filled; i++){
        System.out.println("=");
    }
    for (int i = 0; i < empty; i++){
        System.out.println(" ");
    }
    System.out.println("] " + percent + "%");
}

void main(){
    printProgressBar(0);
    printProgressBar(20);
    printProgressBar(40);
    printProgressBar(60);
    printProgressBar(80);
} */

/*Opgave 2.45:
void printAllNumbers(int[] numbers){
    for (int i = 0; i < numbers.length; i++)
        System.out.println(numbers[i]);
}

void main (){
    int [] myNumbers = {10,20,30,40,50};
    printAllNumbers(myNumbers);
}
*/

/*Opgave 2.46:
void printArrayWithLabel(String label, int[] numbers) {
    System.out.println(label + ":");
    for (int i = 0; i < numbers.length; i++){
        System.out.println(" " + numbers [i]);
    }
}

void main (){
    int [] scores = {85, 90, 78};
    printArrayWithLabel("Scores", scores);
} */

/*Opgave 2.47:
void printArraySum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++){
        sum += numbers[i];
        System.out.println("Sum: " + sum);
    }
}

void main(){
    int [] myNumbers = {1, 2, 3, 4, 5};
    printArraySum(myNumbers);
}
 */

//Opgave 2.48:
void printHeader(String title){
    System.out.println("=== TITEL ===");
}

void printField(String label, String value) {
    System.out.println(label + ":" + value);
}

void printProfile(String name, int age, String city) {
    printHeader("User Profile" );
    printField("Name" , name);
    printField("Age" , "" + age);
    printField("City" , city);
    System.out.println("==============");
}

void main(){
    printProfile("Besima", 29, "Herlev");
    System.out.println();
    printProfile("Louise", 25, "Valby");
}