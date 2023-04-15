import java.util.Scanner;

public class DetermineDumb
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Scanner reader1 = new Scanner(System.in);
        boolean dumb = false;
        boolean[] used = {false, false, false, false};
        String question = "";
        int ans = 0;
        int score = 0;
        System.out.println("Answer these series of questions to determine whether or not you are dumb");
        System.out.println("What is your first name?");
        question = reader.nextLine();
        question = question.toLowerCase();
        switch (question)
        {
            case "ritesh" :
                dumb = true;
                break;
            case "anmol" :
                dumb = true;
                break;
            case "sabrina" :
                dumb = true;
                break;
            case "ovie" :
                dumb = true;
                break;
            case "shay" :
                dumb = true;
                break;
            case "nikhil" :
                System.out.println("You are fat");
                break;
            case "priscilla" :
                System.out.println("Take a shower");
                break;
            case "avy" :
                System.out.println("You are lucky this isn't physics");
                break;
            case "aditya" : 
                System.out.println("Wow! Thanks a lot... There is like 10 of you");
                break;
            case "marco" :
                System.out.println("Answers: 25,d,c,b and c,d");
                break;
            case "satvik" :
                System.out.println("Bruno is cute");
                break;
            case "rudo" :
                System.out.println("doggo");
                break;
            case "fredrick" :
                System.out.println("Slow Typer! 60 wpm");
                break;
        }
        if (dumb == false)
        {
            System.out.println("Which number should come next in the pattern? \n37, 34, 31, 28");
            ans = reader1.nextInt();
            if (ans == 25)
                score++;
            else
                dumb = true;
            //Answer: 25
            System.out.println("Book is to Reading as Fork is to (enter letter ans): \na. drawing \tb. writing\nc. stirring\td. eating");
            question = reader.nextLine();
            question = question.toLowerCase();
            while (question.length() > 1)
            {
                System.out.println("Enter a letter answer");
                question = reader.nextLine();
                question = question.toLowerCase();
            }
            if (question.equals("d"))
                score++;
            else
                dumb = true;
            //d
            System.out.println("Find two words, one from each group, that are the closest in meaning: \nGroup A talkative, job, ecstatic\tGroup B angry, wind, loquacious\na. talkative and wind\tb. job and angry\nc. talkative and loquacious\td. ecstatic and angry");
            //c
            question = reader.nextLine();
            question = question.toLowerCase();
            while (question.length() > 1)
            {
                System.out.println("Enter a letter answer");
                question = reader.nextLine();
                question = question.toLowerCase();
            }
            if (question.equals("c"))
                score++;
            else
                dumb = true;
            System.out.println("Which of the following can be arranged into a 5-letter English word (DOUBLE SELECT 1 point per correct)?\na. H R G S T\tb. R I L S A\nc. T O O M T\td. W Q R G S");
            //b and c
            System.out.println("Enter First Answer");
            question = reader.nextLine();
            question = question.toLowerCase();
            while (question.length() > 1)
            {
                System.out.println("Enter a letter answer");
                question = reader.nextLine();
                question = question.toLowerCase();
            }
            if (question.equals("b"))
            {
                score++;
                used[1] = true;
            }
            if (question.equals("c"))
            {
                score++;
                used[2] = true;
            }
            System.out.println("Enter Second Answer");
            question = reader.nextLine();
            question = question.toLowerCase();
            while (question.length() > 1 || question.equals("b") && used[1] == true || question.equals("c") && used[2] == true)
            {
                System.out.println("Enter a letter answer");
                question = reader.nextLine();
                question = question.toLowerCase();
            }
            if (question.equals("b"))
            {
                score++;
                used[1] = true;
            }
            if (question.equals("c"))
            {
                score++;
                used[2] = true;
            }
            System.out.println("What number best completes the analogy: 8:4 as 10: \na. 3\tb. 7\nc.24\td.5");
            question = reader.nextLine();
            question = question.toLowerCase();
            while (question.length() > 1)
            {
                System.out.println("Enter a letter answer");
                question = reader.nextLine();
                question = question.toLowerCase();
            }
            if (question.equals("d"))
                score++;
            else
                dumb = true;
            //d
        }

        if (dumb == false && score == 6)
        {
            System.out.println("   :::   :::  ::::::::  :::    :::              :::     :::::::::  ::::::::::          ::::::::    :::   :::       :::     ::::::::: ::::::::::: ");
            System.out.println("  :+:   :+: :+:    :+: :+:    :+:            :+: :+:   :+:    :+: :+:                :+:    :+:  :+:+: :+:+:    :+: :+:   :+:    :+:    :+:      ");
            System.out.println("  +:+ +:+  +:+    +:+ +:+    +:+           +:+   +:+  +:+    +:+ +:+                +:+        +:+ +:+:+ +:+  +:+   +:+  +:+    +:+    +:+       ");
            System.out.println("  +#++:   +#+    +:+ +#+    +:+          +#++:++#++: +#++:++#:  +#++:++#           +#++:++#++ +#+  +:+  +#+ +#++:++#++: +#++:++#:     +#+        ");
            System.out.println("  +#+    +#+    +#+ +#+    +#+          +#+     +#+ +#+    +#+ +#+                       +#+ +#+       +#+ +#+     +#+ +#+    +#+    +#+         ");
            System.out.println(" #+#    #+#    #+# #+#    #+#          #+#     #+# #+#    #+# #+#                #+#    #+# #+#       #+# #+#     #+# #+#    #+#    #+#          ");
            System.out.println("###     ########   ########           ###     ### ###    ### ##########          ########  ###       ### ###     ### ###    ###    ###           ");
            System.out.println("\nYou got all " + score + " points!");
        }
        else 
            System.out.println("You are stupid with only " + score + " points");
        reader.close();
        reader1.close();
    }
}