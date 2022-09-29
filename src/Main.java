public class Main {
    public static void main(String[] args) {
// Задание 1
 byte one = 1;
 short ten = 10;
 int hundred = 100;
 long thousand = 1000;
 float oneCommaTwo = 1.1f;
 double elevenCommaOne = 11.1;
 boolean True = true;
 char two = 2;
 // Задание 2
float firstBoxerWeight = 78.2f;
float secondBoxerWeight = 82.7f;
var commonWeight = firstBoxerWeight + secondBoxerWeight;
var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(commonWeight);
        System.out.println(differenceWeight);
// задача 3
 var banana = 5;
 var milk = 200;
 var iceCream = 2;
 var eggs = 4;
 var bananaWeight = banana * 80;
 var milkWeight = milk/2 * 105;
 var iceCreamWeight = iceCream * 100;
 var eggsWeight = eggs  * 70;
 var breakfast = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
 var breakfastKg = breakfast/1000f;
        System.out.println(breakfast);
        System.out.println(breakfastKg);
 // Задача 4
  var weight = 7;
  var slowCutWeight = weight*1000/250;
  var fastCutWeight = weight*1000/500;
        System.out.println(slowCutWeight);
        System.out.println(fastCutWeight);
  // Задача 5
        var MashaSalary = 67760;
        var DenisSalary = 83690 ;
        var CristinaSalary = 76230;
        var increaseMashaSalary = MashaSalary + (MashaSalary/100f * 10);
        var increaseDenisSalary = DenisSalary + (DenisSalary/100f * 10);
        var increaseCristinaSalary = CristinaSalary + (CristinaSalary/100f * 10);
        var yearMashaSalary = 12 * MashaSalary;
        var yearDenisSalary = 12 * DenisSalary;
        var yearCristinaSalary = 12 * CristinaSalary;
        var yearIncreaseMashaSalary = 12 * increaseMashaSalary;
        var yearIncreaseDenisSalary = 12 * increaseDenisSalary;
        var yearIncreaseCristinaSalary = 12 * increaseCristinaSalary;
        var differenceYearIncreaseMashaSalary = yearIncreaseMashaSalary - yearMashaSalary;
        var differenceYearIncreaseDenisSalary = yearIncreaseDenisSalary - yearDenisSalary;
        var differenceYearIncreaseCristinaSalary = yearIncreaseCristinaSalary - yearCristinaSalary;
        System.out.println("Маша теперь получает" + " " + increaseMashaSalary + " " + "рублей." + "Годовой доход вырос на" + " " + differenceYearIncreaseMashaSalary + " " + "рублей");
        System.out.println("Денис теперь получает" + " " + increaseDenisSalary + " " + "рублей." + "Годовой доход вырос на" + " " + differenceYearIncreaseDenisSalary + " " + "рублей");
        System.out.println("Маша теперь получает" + " " + increaseCristinaSalary + " " + "рублей." + "Годовой доход вырос на" + " " + differenceYearIncreaseCristinaSalary + " " + "рублей");
    }
}