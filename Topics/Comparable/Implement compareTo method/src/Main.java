class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int a =  Integer.valueOf(getName().compareTo(otherPerson.getName()));

        boolean b = this.getAge() == otherPerson.getAge();
        int c = 0;
        int d = getAge().compareTo(otherPerson.getAge());
        if (!b){
          boolean d = this.getAge() > otherPerson.getAge();
          if (d) {
              c = 1;
          }
          else{
              c = -1;
        }
        }

        return a != 0 ? a : c;

    }

}