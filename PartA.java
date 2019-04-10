import java.util.Scanner;
/**
 * @author (Qurrat-al-Ain Siddiqui)
 */
public class PartA
{
      public PartA()
      {
        int gramsFat;
        int totalCalories;
        double fatCalories;
        double pctgFatCalories;
                
        Scanner keyboard = new Scanner (System.in);
                
        System.out.println("Enter grams of fat: ");
        gramsFat = keyboard.nextInt();
        System.out.println("Enter calories: ");
        totalCalories = keyboard.nextInt();
                
        fatCalories = 9.0 * gramsFat;
        pctgFatCalories = (fatCalories / totalCalories) * 100;
                
        System.out.println("Percent of fat is = " + pctgFatCalories);
            
        if (pctgFatCalories < 25){
            System.out.println("This food item is definitely Heart Healthy.");
        }else if (pctgFatCalories <= 35){
             System.out.println("This food item is marginally Heart Healthy.");
        }else{
             System.out.println("This food item is definitely not Heart Healthy.");
        }
      }
} 

