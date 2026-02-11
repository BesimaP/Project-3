    /*Opgave 4.38:
    int indexOf(int[] numbers, int target) {
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == target){
                return i;
            }

        }
        return -1;
    }

    void main(){
         int[] numbers = {339, 393, 29, 20};
         int numberExists = indexOf(numbers, 20);
         System.out.println("Index of 20: " + numberExists);
    }   */


   /*Opgave:
    void main(){
        String [] names = {"Louise", "Olga", "Besima"};

        int index = indexOf(names, "Besima");
        if (index >= 0){
            System.out.println("Navnet blev fundet på index: " + index);
        } else {
            System.out.println("Navnet blev ikke fundet");
        }
    }

    int indexOf(String [] names, String target){
        for(int i = 0; i < names.length; i++){
            if (target.equals(names[i])){
                return i;
            }
        }
        return -1;
    }

    */


    //FOR EACH LOOP i stedet for for loop
    // for (int n: numbers) {
    // if (n == target){
    // }
    // }


    /*void main (){
        int tal = 7;
        printTal(tal);
    }

    void printTal (int n){
        System.out.println(n);
        n = 8;
    }   */


    //Opgave:
    void main(){
        double diameter = 10;
        double area = calculateArea(diameter/2);
        System.out.println("Arealet af en cirkel med diameter på " + diameter + "= " + area);
    }

    double calculateArea(double radius){
        if (isValid (radius)){
            double result = Math.PI * (radius * radius);
            return result;
        }
        return 0;
    }

    boolean isValid(double radius){
        if (radius > 0 && radius < 1000){
            return true;
        }
        return false;
    }