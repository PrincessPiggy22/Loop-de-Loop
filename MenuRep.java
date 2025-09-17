import java.util.Scanner;

public class MenuRep {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {

        System.out.println("   Welcome user!!\n--------------------");
        System.out.println("1: Knock Knock joke\n2: Funny Joke\n3: exit");

        int theChoice = 0;
        do{
            int userChoice = getInput("What would you like to do? ");
            theChoice = userChoice;
            if (userChoice == 1){
                System.out.println("\n-------\n\"Knock Knock\" \n\n\"Come in\"\n--------\n");
            } else if (userChoice == 2) { // Got this off of Reddit: https://www.reddit.com/r/AskReddit/comments/91qmh7/whats_the_best_antijoke_you_know/
                System.out.println("\n-------\nShaun is a tourist visiting a small town in the Arabian desert.\n" +
                        "He stops into a shop one day and when he's finished, he finds that his camel is missing its legs.\n" +
                        "Shocked, he approaches a bystander and asks if he saw who took his camel's legs.\nT" +
                        "he bystander squints at him, looks at the camel, and says to Shaun \n" +
                        "\"ah, that would have been the Camel Leg Thief, you can find him that way\".\n" +
                        "\n" +
                        "Shaun sets off in the direction the bystander pointed him in,\n" +
                        "he walks along desert roads, after an hour he comes across a \n" +
                        "traveller going in the opposite direction.\n" +
                        "He tells the traveller his story and asks how much further\n" +
                        "until he reaches the Camel Leg Thief.\n" +
                        "The traveller replies \"a long way along the desert, you will need a car\".\n" +
                        "Shaun walked back to the town, found a car rental branch, \n" +
                        "hired a car and set off again along the road.\n" +
                        "\n" +
                        "He travels down the road until he reaches a huge lake.\n" +
                        "A sailor stands by his small rowing boat nearby.\n" +
                        "Shaun says \"I am looking for the Camel Leg Thief\".\n" +
                        "The sailor replies \"the Camel Leg Thief lives across the water,\n" +
                        "but you can rent a boat back in the town\".\n" +
                        "Running out of patience, Shaun drives back to the town, rents a boat,\n" +
                        "attaches it to the back of his car and goes back to the water.\n" +
                        "He gets in the boat and begins rowing across.\n" +
                        "\n" +
                        "He rows for over an hour until he reaches the other side.\n" +
                        "On the other side is a mountain range. \"I am looking for the Camel Leg Thief\",\n" +
                        "Shaun tells a local. The local replies \"the Camel Leg Thief lives over the mountains,\n" +
                        "you can rent hiking gear back in the town\". Shaun is exasperated.\n" +
                        "\"For &%$@ sake!\", he exclaims. He gets back in the boat, rows across the water, \n" +
                        "gets in his car, and drives back to town. He finds a shop and rents hiking gear. \n" +
                        "He sets back off in the car, to the water, rows back to the mountain range and prepares his climb.\n" +
                        "\n" +
                        "He begins hiking over the mountains, losing track of time as he crosses, \n" +
                        "and gets to the other side. There he is faced by desert plains, \n" +
                        "he asks a nomad, \"are you the Camel Leg Thief?\". \n" +
                        "The nomad tells him \"no, the Camel Leg Thief lives across these plains, \n" +
                        "but it will be dark soon and you can't cross the plains without warm clothing. \n" +
                        "There's a clothes shop in the town\". Shaun can't believe it. \n" +
                        "He hikes back across the mountains, rows across the water, drives back to the town, \n" +
                        "and finds the clothes shop. There, he buys warm clothing for night time.\n" +
                        "\n" +
                        "He drives back to the water, rows across, hikes over the mountains, and gets to the plains. \n" +
                        "It is getting dark, so he pulls on the clothing and begins to walk the plains. \n" +
                        "He walks all night. As the sun rises, he sees a huge palace ahead of him. \n" +
                        "He enters through the large doors. Inside is a huge room, the grandest room you'll ever see. \n" +
                        "On a throne, sits a man. \"I am the Camel Leg Thief\", proclaims the man, \n" +
                        "\"what have you come for?\".\n" +
                        "\n" +
                        "Shaun asks the Camel Leg Thief, \"did you steal my camel's legs?\"\n" +
                        "\n" +
                        "The Camel Leg Thief replied, \"No.\"");
            }

        } while(theChoice != 3);
        System.out.println("Bye Bye!!");

        scanner.close();
    }


}
