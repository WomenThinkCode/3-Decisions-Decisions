# Making decisions

## Using the if and if...else statements
```bash
if(score = 10)
{
  System.out.println("Game Over! you lose, loser!");
}
else
  {
    System.out.println("let the game continue");
  }
```
### Operators 
1 And >> (&&)  
2 Or >> (||)
3 Not >> (!)

## Using switch
Instead of have multiple nested if statements a switch statement is can
be user as it make checking evaluating something across multiple
possible outcomes much easier 
```bash
if(year == 1)
{
  System.out.println("this is not my year");
}
else
  {
    if(year == 2)
    {
      System.out.println("maybe it might  be my year");
    }
    else 
      {
        System.out.println("i will take what i can get");
      }
```

```bash
switch(year)
{
  case 1:
      System.out.println("this is not my year");
      break;
  case 2:
      System.out.println("maybe it might be my year ");
      break;
  case 3:
      System.out.println("i will take what i can get");
      break;
  default:
      System.out.println("What is thia?");
}
```

### Using case expression
```bash
Switch(departmentCode)
{
  case 'a','A' -> departmentName = "Accounting";
  case 'm', "M" -> departmentName = "Marketing";
}
```

## Exercises

## EvenOdd
1 In a file called EvenOdd.java create an application that asks the 
user to enter an integer. Pass the integer to method that determines
weather the number is even or and returns a boolean value. Display weather
the number is even or odd.

## AscendingAndDescending
1 In a file called AscendingAndDescending.java create an application
that prompts the user for 5 integers and displays the in ascending
and descending order.

## ShadyRestRoom
1 In a file called ShadyRestRoom.java create an application that 
determines the price for of a room. Ask the user to choose 1 for a queen bed,
2 for a king bed or 3 for a king and pullout couch. The output 
must reflect the input and the price of the room: R500 for queen,
R700 for king and R900 for king and pullout couch. If the user inputs 
and invalid choice display a corresponding message and set the price to 
R0.

## ShadyRestRoom2
1 In a file called ShadyRestRoom2.java now ask the user to specify
a 1 for a lake view or 2 a park view, but only ask them if the bed
size entry is valid. Add R100 to the price of any room with a lake view.
If the input value fo view is invalid display a corresponding message and set the price of the
room as lake view.


## CellPhoneService
1 In a file called CellPhoneService.java create an application
that prompt the user for max monthly amount they need for talking minutes, 
text messages needed and gigabytes fo data needed. display a 
recommendation of the best plan for the users needs.
A user who needs less than 500 minutes, and no text or data should buy
Plan A at R150 per month.
A user who needs less than 500 minutes and any text messages should buy Plan B
 at R210 per month.
A user who  needs 500 or more minutes and no data should buy either Plan C for 
up to 100 text messages at R90 per month or plan D for 100 text messages or more at
R115 per month.
A use who need any data should buy Plan E for up to 3 gigabytes at R 150 per month or 
Plan F for 3 gigabytes or more at R230 per month 
