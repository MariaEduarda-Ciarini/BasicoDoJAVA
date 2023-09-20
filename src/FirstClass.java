public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Scarface Movie");

        int release_year = 1983;
        System.out.println("Release year: " + release_year);
        boolean included_in_the_plan = true;
        int film_note = 10;

        double average = (10 + 9.6 + 6.0) / 3;
        System.out.println(average);
        String synopsis;
        synopsis = """ 
                    Al Pacino 
                    in the war 
                    against communist
                    Launch of the work
                     """ + release_year;
        System.out.println(synopsis);

        int classification;
        classification = (int) (average / 2);
        System.out.println(classification);
    }
}
