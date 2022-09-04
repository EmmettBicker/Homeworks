import java.util.ArrayList;
import java.util.Random;


public class artProjectGrader {
    public static void main(String[] args) 
    {

        int score = 0;
        // Checking cube 
        Random r = new Random();
        int cubeRandomSize = r.nextInt(6) + 4;

        System.out.println("Cube of size 1: ");
        ArrayList<String> cube1 = artProject.cube(1);
        System.out.println("Cube of size 3: ");
        ArrayList<String> cube3 = artProject.cube(3);
        System.out.println("Cube of random size from 4-10: size " + cubeRandomSize);
        ArrayList<String> cubeRandom = artProject.cube(cubeRandomSize);

        int stairRandomSize = r.nextInt(6) + 4;
        //Stairs
        System.out.println("Staircase of size 1: ");
        ArrayList<String> staircase1 = artProject.staircase(1);
        System.out.println("Staircase of size 3: ");
        ArrayList<String> staircase3 = artProject.staircase(3);
        System.out.println("Staircase of random size from 4-10: size " + stairRandomSize);
        ArrayList<String> staircaseRandom = artProject.staircase(stairRandomSize);

        int triangleRandomSize = r.nextInt(6) + 4;
        System.out.println("Triangle of size 1: ");
        ArrayList<String> triangle1 = artProject.triangle(1);
        System.out.println("Triangle of size 3: ");
        ArrayList<String> triangle3 = artProject.triangle(3);
        System.out.println("Staircase of random size from 4-10: size " + triangleRandomSize);
        ArrayList<String> triangleRandom = artProject.triangle(triangleRandomSize);
        // Normalize input so there's no difference between ending on println and print
        // Get final element of lines printed

        String finalElement = cube1.get(cube1.size()-1);

        // Remove final line printed if it's ""
        if (finalElement == "")
        {
            cube1.remove(cube1.size()-1);
        } // This code was placed in the function nomralizeArrayList

        //Normalization 
        normalizeArrayList(cube3);
        normalizeArrayList(cubeRandom);
        normalizeArrayList(staircase1);
        normalizeArrayList(staircase3);
        normalizeArrayList(staircaseRandom);
        normalizeArrayList(triangle1);
        normalizeArrayList(triangle3);
        normalizeArrayList(triangleRandom);

        System.out.println("All test code complies: :)");
        score++;
        // Cube of size 1 test
        if (cube1.size() > 1)
        {
            System.out.println("!!Cube of size 1: :( \n!!Your cube is too many lines tall");
        }
        else if (cube1.size() < 1)
        {
            System.out.println("!!Cube of size 1: :( \n!!Your cube doesn't have enough lines and is too short");
        }
        else if (cube1.get(0).equals("#"))
        {
            System.out.println("Cube of size 1: :)");
            score++;
        }
        else
        {
            System.out.println("!!Cube of size 1: :(");
        }

        //Checking cube of size 3
        if (cube3.size() > 3)
        {
            System.out.println("!!Cube of size 3: :( \n!!Your cube is too many lines tall");
        }
        else if (cube3.size() < 3)
        {
            System.out.println("!!Cube of size 3: :( \n!!Your cube doesn't have enough lines and is too short");
        }
        else if (cube3.get(0).equals("###") && cube3.get(1).equals("###") && cube3.get(2).equals("###"))
        {
            System.out.println("Cube of size 3: :)");
            score++;
        }
        else
        {
            System.out.println("!!Cube of size 3: :(");
        }
        


        if (cubeRandom.size() > cubeRandomSize)
        {
            System.out.println("!!Cube of random size " + cubeRandomSize + ": :( \n!!Your cube is too many lines tall");
        }
        else if (cubeRandom.size() < cubeRandomSize)
        {
            System.out.println("!!Cube of random size " + cubeRandomSize + ": :( \n!!Your cube doesn't have enough lines and is too short");
        }
        else 
        {
            String checkingVar = "####################";
            checkingVar = checkingVar.substring(0,cubeRandomSize);
         
            boolean correct = true;
            for (String s : cubeRandom)
            {
                if (!s.equals(checkingVar))
                {
                    correct = false;
                }
            }

            if (correct)
            {
                System.out.println("Cube of random size " + cubeRandomSize + ": :)");
                score++;
            }
            else
            {
                System.out.println("!!Cube of random size " + cubeRandomSize + ": :(");
            }
        }

        // Stairs 
        if (staircase1.size() > 1)
        {
            System.out.println("!!Staircase of size 1: :( \n!!Your staircase is too many lines tall");
        }
        else if (staircase1.size() < 1)
        {
            System.out.println("!!Staircase of size 1: :( \n!!Your staircase doesn't have enough lines and is too short");
        }
        else if (staircase1.get(0).equals("#"))
        {
            System.out.println("Staircase of size 1: :)");
            score++;
        }
        else if (staircase1.get(0).length() > 1)
        {
            System.out.println("!!Staircase of size 1: :( \n!!Your staircase is too wide! Check your spaces to see if you're printing too many spaces before the staircase");
        }
        else
        {
            System.out.println("Staircase of size 1: :(");
        }


        if (staircase3.size() > 3)
        {
            System.out.println("!!Staircase of size 3: :( \n!!Your staircase is too many lines tall");
        }
        else if (staircase3.size() < 3)
        {
            System.out.println("!!Staircase of size 3: :( \n!!Your staircase doesn't have enough lines and is too short");
        }
        else if (staircase3.get(0).equals("  #") && staircase3.get(1).equals(" ##") && staircase3.get(2).equals("###") )
        {
            System.out.println("Staircase of size 3: :)");
            score++;
        }
        else if (staircase3.get(0).length() > 3)
        {
            System.out.println("!!Staircase of size 3: :( \n!!Your staircase is too wide! Check your spaces to see if you're printing too many spaces before the staircase");
        }
        else
        {
            System.out.println("Staircase of size 3: :(");
        }


        if (staircaseRandom.size() > stairRandomSize)
        {
            System.out.println("!!Staircase of random size " + stairRandomSize + ": :( \n!!Your staircase is too many lines tall");
        }
        else if (staircaseRandom.size() < stairRandomSize)
        {
            System.out.println("!!Staircase of random size " + stairRandomSize + ": :( \n!!Your staircase doesn't have enough lines and is too short");
        }
        else if (staircaseRandom.get(0).length() > stairRandomSize)
        {
            System.out.println("!!Staircase of random size " + stairRandomSize + ": :( \n!!Your stair is too wide! Check your spaces to see if you're printing too many spaces before the staircase");
        }
        else {
            int x = stairRandomSize;
            String checkingVar = "          ";
            checkingVar += "##########";
            boolean correct = true;
            for (int i = 1; i < stairRandomSize; i++)
            {
                
                if (!staircaseRandom.get(i-1).equals(checkingVar.substring(10-x+i,10+i)))
                {
                    correct = false;
                }


            }
            if (correct)
            {
                System.out.println("Staircase of random size " + stairRandomSize + ": :)");
                score++;
            }
            else
            {
                System.out.println("!!Staircase of random size " + stairRandomSize + ": :(");
            }
        }

        // Triangles
        if (triangle1.size() > 1)
        {
            System.out.println("!!Triangle of size 1: :( \n!!Your triangle is too many lines tall");
        }
        else if (triangle1.size() < 1)
        {
            System.out.println("!!Triangle of size 1: :( \n!!Your triangle doesn't have enough lines and is too short");
        }
        else if (triangle1.get(0).equals("#"))
        {
            System.out.println("Triangle of size 1: :)");
            score++;
        }
        else if (triangle1.get(0).length() > 1)
        {
            System.out.println("!!Triangle of size 1: :( \n!!Your staircase is too wide! Check your spaces to see if you're printing too many spaces before or after the triangle");
        }
        else
        {
            System.out.println("Triangle of size 1: :(");
        }



        if (triangle3.size() > 3)
        {
            System.out.println("!!Triangle of size 3: :( \n!!Your triangle is too many lines tall");
        }
        else if (triangle3.size() < 3)
        {
            System.out.println("!!Triangle of size 3: :( \n!!Your triangle doesn't have enough lines and is too short");
        }
        else if (triangle3.get(0).equals("  #") && triangle3.get(1).equals(" ###") && triangle3.get(2).equals("#####"))
        {
            System.out.println("Triangle of size 3: :)");
            score++;
        }
        else if (triangle3.get(0).equals("  #  ") && triangle3.get(1).equals(" ### ") && triangle3.get(2).equals("#####"))
        {
            System.out.println("Triangle of size 3: :)");
            score++;
        }
        else if (triangle3.get(0).length() > 5 || (triangle3.get(1).length() > 5 || triangle3.get(2).length() > 5))
        {
            System.out.println("!!Triangle of size 3: :( \n!!Your staircase is too wide! Check your spaces to see if you're printing too many spaces before or after the triangle");
        }
        else
        {
            System.out.println("Triangle of size 3: :(");
        }
        

        if (triangleRandom.size() > triangleRandomSize)
        {
            System.out.println("!!Triangle of random size " + triangleRandomSize + ": :( \n!!Your triangle is too many lines tall");
        }
        else if (triangleRandom.size() < triangleRandomSize)
        {
            System.out.println("!!Triangle of random size " + triangleRandomSize + ": :( \n!!Your triangle doesn't have enough lines and is too short");
        }
        else if (triangleRandom.get(triangleRandomSize-1).length() > triangleRandomSize * 2 - 1)
        {
            System.out.println("!!Triangle of random size " + triangleRandomSize + ": :( \n!!Your staircase is too wide! Check your spaces to see if you're printing too many spaces before or after the triangle");
        }
        else
        {
            int x = triangleRandomSize;
            String checkingVar = "          ";
            checkingVar += "##########";
            boolean correct = true;
            for (int i = 1; i < triangleRandomSize+1; i++)
            {
                String step = checkingVar.substring(10-x+i,10+i);
                step += "##########".substring(0,i-1);
       
                if (!triangleRandom.get(i-1).equals(step))
                {
                    correct = false;
                }


            }
            if (correct)
            {
                System.out.println("Triangle of random size " + triangleRandomSize + ": :)");
                score++;
            }
            else
            {
                System.out.println("Triangle of random size " + triangleRandomSize + ": :(");
            }

        }
        System.out.println();
        System.out.println("score " + score + "/10");

        


        
    }

    public static void normalizeArrayList(ArrayList<String> list)
    {
        //Regularize input so there's no difference between ending on println and print
        // Get final element of lines printed
        String finalElement = list.get(list.size()-1);
        if (finalElement == "")
        {
            list.remove(list.size()-1);
        }

    }
}
