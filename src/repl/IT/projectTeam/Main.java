package repl.IT.projectTeam;


    class Main {
        public static void main(String[] args) {

            CityApp c = new CityApp();
            int p = c.population("chicago");
            System.out.println("Population of Chicago: " + p);
            int d = (int) c.distance("Chicago", "New York");
            System.out.println("Distance between Chicago and New York:" + d + " miles");

            String city = c.cityByRank(4);
            System.out.println("The 4th largest city in USA is " + city);

            int count = c.CitiesInState("california");
            System.out.println("Number of large cities in California:" + count);
        }
    }

