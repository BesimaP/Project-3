    void main (){
        printNumber(7);
        calculateArea(10,5);
        calculateArea(30);
        int [] salaries = {5500, 5000, 5800, 6000, 4800};
        printSalaries(salaries);
        salaryBoost(salaries);
    }

     void salaryBoost (int [] salaries){
         for(int i = 0; i < salaries.length; i ++) {
             salaries[i] = salaries[i]*10;
             System.out.println("Salary boost: " + salaries[i]);
         }
     }

    void calculateArea(int height, int width){
        int areal = height * width;
        System.out.println("Rektangel areal: " + areal);
    }

    void calculateArea(int radius){
        double area = (radius*radius) * Math.PI;
        System.out.println("Cirkel areal: " + area);
    }

    void printNumber(int startNumber){
        for(int i = startNumber; i <= 100; i++){
            if (i % startNumber == 0)
                System.out.println(i);
        }
    }

    void printSalaries (int [] values){
        for (int v : values){
            System.out.println("Salaries: " + v);
        }
    }



