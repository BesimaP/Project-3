/*Opgave 1.1:
void sayHello() {
    System.out.println("Hello!");
}

void main() {
  sayHello();
//}*/

/*Opgave 1.2:
void sayHello() {
    System.out.println("Hello!");
}

void main() {
    sayHello();
    sayHello();
    sayHello();
} */

/*Opgave 1.3:
void printWelcome(){
    System.out.println("Welcom to the program!");
    System.out.println("Let's get started");
}

void main (){
    printWelcome();
}*/

/*Opgave 1.4:
void greet() {
    System.out.println("Hi there!");
}

void main() {
    System.out.println("Before");
    greet();
    System.out.println("After");
}*/

/*Opgave 1.5:
void printMessage() {
    System.out.println("This is a message");
}

void main() {
    System.out.println("Start");
    System.out.println("End");
}
// printMessage() bliver ALDRIG kaldt, så den kører ikke. Metoder kører kun når de kaldes!
*/

/*Opgave 1.6:
void first() {
    System.out.println("First");
}

void second() {
    System.out.println("Second");
}

void main() {
    second();
    first();
}

// Rækkefølgen af KALD bestemmer execution, ikke definition
 */

/*Opgave 1.7:
String appName = "MyApp";

void printAppName(){
    System.out.println(appName);
}

void main(){
    printAppName();
}
*/

/*Opgave 1.8:
String title = "Game";
int version = 2;

void printInfo() {
    System.out.println("Titel: " + title+ " v." + version);
}

void incrementVersion () {
    version++;
}

void main () {
    printInfo();
    incrementVersion();
    printInfo();
}
*/

/*Opgave 1.9:
void printLine(){
    System.out.println("----------");
}

void main (){
    printLine();
    printLine();
    printLine();
} */

/*Opgave 1.10:
void printEmptyLine (){
    System.out.println();
}

void main (){
    printEmptyLine();
} */

/*Opgave 1.11:
void printBox() {
    System.out.println("+-----+");
    System.out.println("|     |");
    System.out.println("+-----+");
}

void main() {
    printBox();
} */

/*Opgave 1.12:
void printPattern() {
    System.out.println("* * *");
    System.out.println("* * *");
    System.out.println("* * *");
}

void main() {
    printPattern();
} */

/*Opgave 1.13:
void printMenu(){
    System.out.println("Start");
    System.out.println("Settings");
    System.out.println("Exit");
}

void main(){
    printMenu();
} */

/*Opgave 1.14:
void printGreeting(){
    System.out.println("Velkommen til programmet!");
    System.out.println("Kig rundt, tag en drink");
}

void main(){
    printGreeting();
} */

/*Opgave 1.15:
void printSmile(){
    System.out.println(":)");
}

void main(){
    printSmile();
    printSmile();
    printSmile();
    printSmile();
    printSmile();
} */

/*Opgave 1.16:
void printSeperator(){
    System.out.println("====================");
}

void main(){
    System.out.println("Hej med dig");
    printSeperator();
    System.out.println("Husk at lav øvelserne");
}*/

/*Opgave 1.17:
void printHello() {
    System.out.println("Hello");
}

void printGoodbye(){
    System.out.println("Goodbye");
}

void main (){
    printHello();
    printGoodbye();
} */

/*Opgave 1.18:
void first() {
    System.out.println("First");
}

void second() {
    System.out.println("Second");
}

void third() {
    System.out.println("Third");
}

void main() {
    third();
    first();
    second();
} */

/*Opgave 1.19:
void wakeUp() {
    System.out.println("Wake up!");
}

void eatBreakfast() {
    System.out.println("Eating breakfast");
}

void brushTeeth() {
    System.out.println("Brushing teeth");
}

void main() {
    wakeUp();
    eatBreakfast();
    brushTeeth();
} */

/*Opgave 1.20:
void monday() {
    System.out.println("Monday");
}

void tuesday() {
    System.out.println("Tuesday");
}

void wednesday() {
    System.out.println("Wednesday");
}

void thursday() {
    System.out.println("Thursday");
}

void friday() {
    System.out.println("Friday");
}

void saturday() {
    System.out.println("Saturday");
}

void sunday() {
    System.out.println("Sunday");
}

void main() {
    saturday();
    sunday();
} */

/*Opgave 1.21:
void red() {
    System.out.println("STOP");
}

void yellow() {
    System.out.println("SLOW DOWN");
}

void green() {
    System.out.println("GO");
}

void main() {
    red();
    green();
    yellow();
    red();
}
 */

/*Opgave 1.22:
void printStars() {
    System.out.println("***");
}

void printDashes() {
    System.out.println("---");
}

void main() {
    printStars();
    printDashes();
    printStars();
    printDashes();
    printStars();
} */

/*Opgave 1.23:
void printBeep() {
    System.out.println("BEEP!");
}

void main() {
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
    printBeep();
}
 */

/*Opgave 1.24:
void printHello() {
    System.out.println("Hello");
}

void printGoodbye() {
    System.out.println("Goodbye");
}

void main() {
    printHello();
    printGoodbye();
    printHello();
    printGoodbye();
    printHello();
}
 */

/*Opgave 2.25:
void printHeader(){
    System.out.println("=== REPORT ===");
}

void printBody(){
    System.out.println("Data goes here");
}

void printFooter (){
    System.out.println("=== END ===");
}

void main (){
    printHeader();
    printBody();
    printFooter();
} */

/*Opgave 1.26:
void printTitle (){
    System.out.println("*=*=*=*=* My document =*=*=*=*=*=");
}

void printContent(){
    System.out.println("Here is the content of the document");
    System.out.println("It is a long document");
}

void printPageNumber(){
    System.out.println("Page 1");
}

void main (){
    printTitle();
    printContent();
    printPageNumber();
}
 */

/*Opgave 1.27:
void printDivider() {
    System.out.println("--------------------");
}

void main() {
    System.out.println("Section 1");
    printDivider();
    System.out.println("Section 2");
    printDivider();
    System.out.println("Section 3");
} */

/*Opgave 1.28:
void printListHeader() {
    System.out.println("Shopping List:");
}

void printListFooter() {
    System.out.println("--- End of List ---");
}

void main() {
    printListHeader();
    System.out.println("- Eggs");
    System.out.println("- Fruit");
    System.out.println("- Bread");
    printListFooter();
}
 */

/*Opgave 1.29:
void printGameTitle() {
    System.out.println("=== HERO BUILDER ===");
}

void printInstructions() {
    System.out.println("Build your dream!");
}

void printControls() {
    System.out.println("Use arrow keys to move");
    System.out.println("Press SPACE to select tool");
}

void main() {
    printGameTitle();
    System.out.println();
    printInstructions();
    System.out.println();
    printControls();
}
 */

/*Opgave 1.30:
String name = "Anna";
int age = 25;
String city = "Copenhagen";

void printName() {
    System.out.println("Name: " + name);
}

void printAge() {
    System.out.println("Age: " + age);
}

void printCity() {
    System.out.println("City: " + city);
}

void main() {
    printName();
    printAge();
    printCity();
}
 */

/*Opgave 1.31:
void printTableHeader() {
    System.out.println("Name     | Age | City");
}

void printTableDivider() {
    System.out.println("---------+-----+-----------");
}

void printTableFooter() {
    System.out.println("=========================");
}

void main() {
    printTableHeader();
    printTableDivider();
    System.out.println("Anna     | 25  | Copenhagen");
    System.out.println("Bob      | 30  | Aarhus");
    printTableFooter();
} */

/*Opgave 1.32:
void printReceiptHeader() {
    System.out.println("========== RECEIPT ==========");
}

void printThankYou() {
    System.out.println("Thank you for your purchase!");
}

void main() {
    printReceiptHeader();
    System.out.println("Item: Coffee - 25 kr");
    System.out.println("Item: Sandwich - 45 kr");
    System.out.println("Total: 70 kr");
    System.out.println();
    printThankYou();
}
 */

/*Opgave 1.33:
void printLine() {
    System.out.println("-----");
}

void printBox() {
    printLine();
    System.out.println("Text");
    printLine();
}

void main() {
    printBox();
}
 */

/*Opgave 1.34:
void printStar (){
    System.out.println("*");
}

void printThreeStars (){
    printStar();
    printStar();
    printStar();
}

void main(){
    printThreeStars();
}
 */

/*Opgave 1.35:
void printDash() {
    System.out.println("-");
}

void printHeader() {
    printDash();
    printDash();
    printDash();
    printDash();
    printDash();
    System.out.println("HEADER");
    printDash();
    printDash();
    printDash();
    printDash();
    printDash();
}

void main() {
    printHeader();
}
 */

/*Opgave 1.36:
void printEquals() {
    System.out.println("==========");
}

void printSpacing() {
    System.out.println();
}

void printSection() {
    printEquals();
    printSpacing();
    System.out.println("Content");
    printSpacing();
    printEquals();
}

void main() {
    printSection();
}
 */

/*Opgave 1.37
void printBorder() {
    System.out.println("+------+");
}

void printEmpty() {
    System.out.println("|      |");
}

void printFullBox() {
    printBorder();
    printEmpty();
    printBorder();
}

void main() {
    printFullBox();
}
 */

/*Opgave 1.38:
void printWelcome() {
    System.out.println("Welcome!");
}

void printInstructions() {
    System.out.println("Follow the instructions");
}

void printStart() {
    System.out.println("Let's begin!");
}

void printFullIntro() {
    printWelcome();
    System.out.println();
    printInstructions();
    System.out.println();
    printStart();
}

void main() {
    printFullIntro();
}
 */

/*Opgave 1.39:
void printA() {
    System.out.println("A");
}

void printB() {
    printA();
    printA();
    System.out.println("B");
}

void printC() {
    printB();
    System.out.println("C");
}

void main() {
    printC();
}
 */

/*Opgave 1.40:
void method3() {
    System.out.println("3");
}

void method2() {
    System.out.println("2");
    method3();
}

void method1() {
    System.out.println("1");
    method2();
}

void main() {
    method1();
}
 */

/*Opgave 1.41:
String appName = "MyApp";
String version = "1.0";

void printAppInfo(){
    System.out.println("App name: " + appName + ". " + "Version: " + version);
}

void printDivider() {
    System.out.println("===============");
}

void printWelcome() {
    System.out.println("Welcome to the application!");
}

void showStartup() {
    printDivider();
    printAppInfo();
    printDivider();
    printWelcome();
}

void main() {
    showStartup();
}
 */

/*Opgave 42:
void printMenuHeader() {
    System.out.println("=== MAIN MENU ===");
}

void printMenuOptions() {
    System.out.println("1. New Game");
    System.out.println("2. Load Game");
    System.out.println("3. Settings");
    System.out.println("4. Exit");
}

void printMenuFooter() {
    System.out.println("=================");
}

void displayMenu() {
    printMenuHeader();
    printMenuOptions();
    printMenuFooter();
}

void main() {
    displayMenu();
}
 */

/*Opgave 1.43:
String reportTitle = "Sales Report";
String date = "2024-01-15";

void printReportHeader() {
    System.out.println("=== " + reportTitle + " ===");
    System.out.println("Date: " + date);
}

void printReportBody() {
    System.out.println("Total Sales: 15000 kr");
    System.out.println("Items Sold: 150");
}

void printReportFooter() {
    System.out.println("--- End of Report ---");
}

void generateReport() {
    printReportHeader();
    System.out.println();
    printReportBody();
    System.out.println();
    printReportFooter();
}

void main() {
    generateReport();
}
 */

/*Opgave 1.44:
String gameVersion = "v2.0";

void showLogo() {
    System.out.println("  ***  ");
    System.out.println(" |___| ");
}

void showTitle() {
    System.out.println("SUPER GAME");
}

void showVersion() {
    System.out.println("Version: " + gameVersion);
}

void showLoading() {
    System.out.println("Loading...");
    System.out.println("Loading...");
    System.out.println("Loading...");
}

void startupSequence() {
    showLogo();
    System.out.println();
    showTitle();
    showVersion();
    System.out.println();
    showLoading();
}

void main() {
    startupSequence();
}
 */

/*Opgave 1.45:
String name = "Anna";
int age = 25;
String occupation = "Developer";

void printPersonName() {
    System.out.println("Name: " + name);
}

void printPersonAge() {
    System.out.println("Age: " + age);
}

void printPersonOccupation() {
    System.out.println("Occupation: " + occupation);
}

void printPersonDivider() {
    System.out.println("---");
}

void displayPersonInfo() {
    printPersonName();
    printPersonDivider();
    printPersonAge();
    printPersonDivider();
    printPersonOccupation();
}

void main() {
    displayPersonInfo();
}
 */

/*Opgave 1.46:
void printStar() {
    System.out.println("*");
}

void printDash() {
    System.out.println("-");
}

void printDecoration() {
    printStar();
    printStar();
    printStar();
}

void printDecoratedMessage() {
    printDecoration();
    System.out.println("Important Message");
    printDecoration();
}

void main() {
    printDecoratedMessage();
}
 */

/*Opgave 1.47:
String username = "Admin";
boolean debugMode = true;
int maxUsers = 100;

void printUsername() {
    System.out.println("Username: " + username);
}

void printDebugMode() {
    System.out.println("Debug Mode: " + debugMode);
}

void printMaxUsers() {
    System.out.println("Max Users: " + maxUsers);
}

void printConfigHeader() {
    System.out.println("=== CONFIGURATION ===");
}

void printConfigFooter() {
    System.out.println("=====================");
}

void displayConfig() {
    printConfigHeader();
    printUsername();
    printDebugMode();
    printMaxUsers();
    printConfigFooter();
}

void main() {
    displayConfig();
}
 */

/* 1.48:
void printSection1Header() {
    System.out.println("--- SECTION 1 ---");
}

void printSection1Content() {
    System.out.println("Content for section 1");
}

void printSection2Header() {
    System.out.println("--- SECTION 2 ---");
}

void printSection2Content() {
    System.out.println("Content for section 2");
}

void printSection3Header() {
    System.out.println("--- SECTION 3 ---");
}

void printSection3Content() {
    System.out.println("Content for section 3");
}

void printDocument() {
    printSection1Header();
    printSection1Content();
    System.out.println();
    printSection2Header();
    printSection2Content();
    System.out.println();
    printSection3Header();
    printSection3Content();
}

void main() {
    printDocument();
}
 */

