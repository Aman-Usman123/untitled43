import java.util.Scanner;

    public class MultiplyWithoutOperator {



            public static void main(String[] args)
            {
                int count=0;
                String vowels="aeiou";
                String input="aei";
                for(int i=0;i<input.length();i++)
                {
                    int current = input.charAt(i);
                    if (vowels.indexOf(current) != -1)
                    {
                        count++;
                    }
                }
                System.out.println("This a count of vowels==   "+count);

                }
    }



