import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //System.out.printf("Pelicula matrix");


// Declaracion de variables
            int fechaDeLanzamiento = 1999;
            double evaluacion = 4.5;
            boolean incluidoEnElPlanBasico = true;
            String nombre = "Matrix";
            String sinopsis = """
                    La mejor película del fin del milenio
                    """;

        double mediaEvaluacionUsuario = 0;
        System.out.println("pelicula: "+ nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println(mediaEvaluacion);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la mota o evaluacion que le darias a matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "matrix calculada es :" + mediaEvaluacionUsuario / 3);
    }
}