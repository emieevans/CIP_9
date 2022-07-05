public class Program {
    public static void main(String[] args) {
        //Objetos
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //Variables
        String nombre, telefono;
        int edad;
        double credito, salario;

        cliente.setNombre("Marta");
        cliente.setEdad(21);
        cliente.setTelefono("6545-9878");
        cliente.setCredito(1200.00);
        trabajador.setSalario(3245.00);

        //Obtener valores
        nombre = cliente.getNombre();
        edad = cliente.getEdad();
        telefono = cliente.getTelefono();
        credito = cliente.getCredito();
        salario = trabajador.getSalario();

        //Mostrar en pantalla
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Credito: "+credito);
        System.out.println("Salario: "+salario);
    }
    static public class Persona{
        int edad;
        String nombre;
        String telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }
    }

    static public class Cliente extends Persona {
        double credito;

        public void setCredito(double credito) {
            this.credito = credito;
        }

        public double getCredito() {
            return credito;
        }
    }

    static public class Trabajador extends Persona{
        double salario;

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }
    }
}
