import java.util.Scanner;
public class ConvertDate
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in); 
  int firstSpace, commaPos;
  String date;
  //This reads the users date
  System.out.print("\n\n Enter date that needs to be converted: ");
  date = input.nextLine();
  //Removes both leading and trailing space in string
  date = date.trim();
  //This finds the first space position
  firstSpace = date.indexOf(' ');
  //This finds the first comma position
  commaPos = date.indexOf(',');
  String day, month, year;
  //This extracts the month
  month = date.substring(0, firstSpace);
  //This converts entire month to lowercase
  month = month.toLowerCase();
  //Captilizes string beginning
  month = month.substring(0, 1).toUpperCase() + month.substring(1);
  //removes spaces at front and back
  month = month.trim();
  //Extracts day
  day = date.substring(firstSpace+1, commaPos);
  //Removes leading and trailing spaces��
  day = day.trim();
  //Extracts year
  year = date.substring(commaPos+2);
  //Removing leading and trailing spaces
  year = year.trim();
  //Formats date in new format
  String output = day + " " + month + " " + year;
  //Prints
  System.out.println("\n\n Converted date: " + output + " \n"); }
}
