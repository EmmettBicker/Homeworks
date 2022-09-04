import java.util.ArrayList;

public class artProject {
    public static void main(String[] args)
    {
        /* The Hunter Robotics Team has created the world's first sentient AI! 
        This AI has the personality of a young child, and they want to give this AI
        a nice, digital childhood. They've decided first they're going to write some
        code to give the AI the ability to draw shapes with text art. 
        The AI child likes to be able to adjust the size of their shapes. 
        Write a program that draws the following shapes given their desired sizes! */


        

        triangle(6);

    }

    public static ArrayList<String> cube(int size)
    {
        /* Number one: Cube 
           Write code to print out a cube made of hashtags where each side is the 
           length of the input variable "size"
                            
        Example: size = 1 --->  #

        Example: size = 2 --->  ##
                                ##
            
        Example: size = 3 --->  ###
                                ###
                                ###
                                
        */   

        // Used to manage the grader
        resetGraderVariables();

        // YOUR CODE STARTS HERE

        for (int i = 0; i < size; i ++)
        {

            for (int j = 0; j < size; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        // YOUR CODE ENDS HERE

        finalizeGrader();

        return checker;
    }

    public static ArrayList<String> staircase(int size)
    {
        /* Number two: Staircase 
           Write code to print out a staircase made of hashtags where the staircase is as tall as the  
           input variable "size"

           Note: You will have to print out spaces in order to fill in white space
                            
        Example: size = 1 --->  #

        Example: size = 2 --->   #
                                ##
            
        Example: size = 3 --->    #
                                 ##
                                ###
                                
        */   

        // Used to manage the grader
        resetGraderVariables();

        // YOUR CODE STARTS HERE

        for (int i = 0; i < size; i ++)
        {

            for (int j = 0; j < size - i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        // YOUR CODE ENDS HERE

        finalizeGrader();

        return checker;
    }

    public static ArrayList<String> triangle(int size)
    {
        /* Number two: Staircase 
           Write code to print out a triangle made of hashtags where the triangle is as tall as the  
           input variable "size"

           Note: Don't print out white spaces after the hashtags

                            
        Example: size = 1 --->  #

        Example: size = 2 --->   #
                                ###
            
        Example: size = 3 --->    #
                                 ###
                                #####
                                
        */   

        // Used to manage the grader
        resetGraderVariables();

        // YOUR CODE STARTS HERE

        for (int i = 0; i < size; i ++)
        {

            for (int j = 0; j < size - i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("#");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        // YOUR CODE ENDS HERE

        finalizeGrader();

        return checker;
    }









    //Code to pass information to the grader


    static String currentLine;
    static ArrayList<String> checker;
    public static void resetGraderVariables()
    {
        currentLine = "";
        checker = new ArrayList<String>();

    }

    public static void finalizeGrader()
    {

        checker.add(currentLine);

    }

    // EXTREME SHENANAGINS TO OVERRIDE THE PRINT STATEMENT AND RECORD PRINTED 
    static class System
    {
        static class out{
            public static void println(String s)
            {
                java.lang.System.out.println(s);

                // Add current string to existing line
                currentLine += s;

                // Add concatenated string to the grader 
                checker.add(currentLine);

                currentLine = "";
                
            }
            public static void println()
            {
                java.lang.System.out.println();

                // Add concatenated string to the grader 
                checker.add(currentLine);

                currentLine = "";
                
            }
            public static void print(String s)
            {
                currentLine += s;
                java.lang.System.out.print(s);

            }
        }
    }
    
}
