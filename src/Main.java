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

        System.out.println("............CIKLAI...............");


/*
Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.
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


        for (int a = plants.length - 1; a >= 0; a--) {
            System.out.println(plants[a]);
        }
/*
Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);
 */
        System.out.println("..................6..............");


        for (int i = 10; i < 50; i++) {
            if (i % 2 == 0) {
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
            if (c % 10 == 0) {
                continue;
            }

            if (c % 2 == 0) {
                System.out.println(c);
            }
        }

  /*
Sukurkite ciklą kuris suktųsi nuo 0 iki 20.
Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę (10);

   */
        System.out.println("..........8...........");

        int count = 0;
        for (int d = 0; d < 20; d++) {
            if (d % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
/*
Suskaičiuokite kiek 3čio uždavinio masyve yra
žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai.
(du skaičiavimai)
 */

        System.out.println(".................9............");


        String[] plants1 = {"roze", "orchideja", "tulpe", "zibute", "pakalnute", "neuzmirstuole", "kardelis", "amarilis", "alyva", "vyksva"};

        int count1 = 0;
        int count2 = 0;

        for (int b = 0; b < plants1.length; b++) {
            if (plants1[b].length() < 5) {
                count1++;
            }
            if (plants1[b].length() < 7) {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
 /*
 Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių
 nei 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)
  */

        System.out.println("........10..........");

        int count10 = 0;

        for (int e = 0; e < plants1.length; e++) {
            if (plants1[e].length() > 5 && plants1[e].length() < 10);
            count10++;
        }
        System.out.println(count10);

        System.out.println(".................SUNKESNI UŽDAVINIAI...............");
/*
Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.
Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

 */

        System.out.println(".......................1..........................");


        int num11;

        int count11 = 0;

        for (int k = 0; k < 300; k++) {
            num11 = (int) Math.round(Math.random() * 300);
            if (num11 > 150) {
                count11++;
            }

            if (num11 > 275) {
                System.out.print("[" + num11 + "] ");
            } else {
                System.out.print(num11 + " ");

            }

        }

        System.out.println(".....................2..................");
/*
Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000,
 kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais.
 Po paskutinio skaičiaus kablelio neturi būti.

 */
        System.out.println("..................2.......................");


        String numbersalldivite77 = "";

        for (int i = 1; i < 3000; i++) {
            if (i % 77 == 0) {
                numbersalldivite77 += i + ",";
            }
        }


        System.out.println(numbersalldivite77.length());
        System.out.println("Atsakymas"+ numbersalldivite77.substring(0,numbersalldivite77.length() -1) + ".");



        System.out.println(".........................3.................");


 /*
 Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25 “*”.
 */


        for (int i = 1; i <25; i++) {
            String stars = "*";
            for (int a = 1; a <25; a++) {
                stars+= "*";
            }
            System.out.println(stars);
            }



/*
Metam monetą. Monetos kritimo rezultatą imituojam
Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.

Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje:
“S” jeigu iškrito skaičius ir “H” jeigu herbas.

Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
Iškritus herbui;
Tris kartus iškritus herbui;
Tris kartus iš eilės iškritus herbui;
 */



                boolean shouldgo=true;
                int counter =0;


                while(true){
                    if(Math.random()<0.5){
                        System.out.println("S");
                        counter=0;

                    }else{
                        System.out.print("H");
                    }
                }
























































            }
        }

































