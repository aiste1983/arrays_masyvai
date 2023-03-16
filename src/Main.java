public class Main {
        public static void main(String[] args) {


  /*          System.out.println(".......1..........");

            int[] number = {1, 2, 3, 4, 5, 6};

            System.out.println(number[0]);
            System.out.println(number[1]);
            System.out.println(number[2]);
            System.out.println(number[3]);
            System.out.println(number[4]);
            System.out.println(number[5]);


            System.out.println("...............2.............");


            int[][] number2 = {
                    {1, 2, 3},
                    {3, 4, 6},

            };

            System.out.println(number2[0][0]);
            System.out.println(number2[0][1]);
            System.out.println(number2[0][2]);
/*

   */
            System.out.println("............CIKLAI...............");


       /* Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

       Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.


        */
            System.out.println(".................1......................");


            for (int i = 0; i < 10; i++) {
                System.out.println("Labas");
            }


            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }

            System.out.println(".................2....................");


            //System.out.print(".............MASYVAI.....................");




        /*
        3.Sukurkite masyvą su dešimties augalų pavadinimų.

         */
            System.out.println("............3..............");

            String[] plants = {"1 roze", "2 orchideja", "3 tulpe", "4 zibute", "5 pakalnute", "6 neuzmirstuole", "7 kardelis", "8 amarilis", "9 alyva", "10 vyksva"};

        /*
        Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.
         */
            System.out.println(".............4.................");

            for (int i = 0; i < plants.length; i++) {
                System.out.println(plants[i]);

            }

/*
Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo
 paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).
 */
            System.out.println("...............5................");


           for (int a = plants.length-1; a >= 0; a--) {
             System.out.println(plants[a]);
            }
/*
Atspausdinkite kas antrą skaičių nuo 10 iki 50 (pornius);
 */
            System.out.println("..................6..............");


            for (int i = 10; i <50; i++) {
                if (i % 2==0){
                System.out.println(i);

                }
            }
/*
Atspausdinkite kas antrą skaičių nuo 10 iki 50. (pornius)
Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.
( naudokite continue.) (atspausdinti visus porinus skaičius,
išskyrus tuos kurie dalinasi iš 10 be liekanos)

 */

System.out.println("...........................7........................");

            for (int c = 10; c < 50; c++) {
                if(c % 2 ==0){
                    if (c % 10==0) {
                        continue;
                    }
                        System.out.println(c);
                    }


  /*
Sukurkite ciklą kuris suktųsi nuo 0 iki 20.
Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;

   */

                System.out.println("....................8....................");










                }

            }


















            
        }



























