public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Julio",21,"3764676018");
        System.out.println(persona.getName());
        System.out.println(persona.getAge());
        persona.setAge(24);
        System.out.println(persona.getAge());
    }
}