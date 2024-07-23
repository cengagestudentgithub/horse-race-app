import java.util.*;
public class DemoHorses
{
   public static void main(String args[])
   {
      Scanner kb = new Scanner(System.in);
      String name;
      String color;
      int year;
      int races;
      Horse horse1 = new Horse();
      RaceHorse horse2 = new RaceHorse();
      System.out.print("Enter name for horse >> ");
      name = kb.nextLine();
      System.out.print("Enter color for " + name + " >> ");
      color = kb.nextLine();
      System.out.print("Enter year of birth >> ");
      year = kb.nextInt();
      kb.nextLine();
      horse1.setName(name);
      horse1.setColor(color);
      horse1.setBirthYear(year);
      System.out.print("Enter name for race horse >> ");
      name = kb.nextLine();
      System.out.print("Enter color for " + name + " >> ");
      color = kb.nextLine();
      System.out.print("Enter year of birth >> ");
      year = kb.nextInt();
      System.out.print("Enter number of races for " + name + " >> ");
      races = kb.nextInt();
      kb.nextLine();
      horse2.setName(name);
      horse2.setColor(color);
      horse2.setBirthYear(year);
      horse2.setRaces(races);
      System.out.println(horse1.getName() + " is " +
         horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
      System.out.println(horse2.getName() + " is " +
         horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
      System.out.println(horse2.getName() + " has been in " +
         horse2.getRaces() + " races.");
   }
}